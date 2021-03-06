package com.mei.ergosurgeon.evaluate;

import com.google.cloud.bigquery.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Email;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.time.Instant;
import java.util.UUID;

@Slf4j
@RestController
public class BigQueryUtils {
    @Autowired
    BigQuery bigquery;

    @GetMapping("/{email}/{uuid}/{dateStart}/{dateEnd}")
    public TableResult runQuery(@PathVariable @Email String email,
                                @PathVariable @Pattern(regexp = "^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$", message = "UUID format error") String uuid,
                                @PathVariable @Past Instant dateStart,
                                @PathVariable @Past Instant dateEnd) throws InterruptedException {
        try {
            BigQuery bq = BigQueryOptions.newBuilder().setProjectId("investigation-265721").build().getService();
            QueryJobConfiguration queryConfig =
                    QueryJobConfiguration.newBuilder(
                            "SELECT\n" +
                                    "*\n" +
                                    "FROM 'Investigation.threated_point'\n" +
                                    //"WHERE DATE(_PARTITIONTIME) BETWEEN :dateStart AND :dateEnd AND\n" +
                                    "WHERE _PARTITIONTIME BETWEEN (:dateStart AND :dateEnd) AND\n" +
                                    "UUID = :uuid AND Email = :email"
                    )
                            .addNamedParameter("dateStart", QueryParameterValue.timestamp(dateStart.getEpochSecond()))
                            .addNamedParameter("dateEnd", QueryParameterValue.timestamp(dateEnd.getEpochSecond()))
                            .addNamedParameter("uuid", QueryParameterValue.string(uuid))
                            .addNamedParameter("email", QueryParameterValue.string(email))
                            // Use standard SQL syntax for queries.
                            // See: https://cloud.google.com/bigquery/sql-reference/
                            .setUseLegacySql(false)
                            .build();

// Create a job ID so that we can safely retry.
            JobId jobId = JobId.of(UUID.randomUUID().toString());
            Job queryJob = bigquery.create(JobInfo.newBuilder(queryConfig).setJobId(jobId).build());

// Wait for the query to complete.
            queryJob = queryJob.waitFor();

// Check for errors
            if (queryJob == null) {
                throw new RuntimeException("Job no longer exists");
            } else if (queryJob.getStatus().getError() != null) {
                // You can also look at queryJob.getStatus().getExecutionErrors() for all
                // errors, not just the latest one.
                throw new RuntimeException(queryJob.getStatus().getError().toString());
            }

            TableResult result = bigquery.query(queryConfig);

            return result;
            // Run the query using the BigQuery object
            /*for (FieldValueList row : result.iterateAll()) {
                System.out.println();
                for (FieldValue val : row) {
                    System.out.print(val + "  ");
                }
            }*/
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}