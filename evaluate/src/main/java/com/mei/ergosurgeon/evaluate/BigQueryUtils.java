package com.mei.ergosurgeon.evaluate;

import com.google.cloud.bigquery.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class BigQueryUtils {
    @Autowired
    BigQuery bigquery;

    public void runQuery() throws InterruptedException {
        BigQuery bq = BigQueryOptions.getDefaultInstance().getService();
        QueryJobConfiguration queryConfig =
                QueryJobConfiguration.newBuilder(
                        "SELECT\n" +
                                "*\n" +
                                "FROM `project-258120.ErgoSurgeonDataSet.threated_point`\n" +
                                "WHERE DATE(_PARTITIONTIME) < \"2019-12-11\" LIMIT 1000")
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
        // Run the query using the BigQuery object
        for (FieldValueList row : result.iterateAll()) {
            System.out.println();
            for (FieldValue val : row) {
                System.out.print(val + "  ");
            }
        }
    }
}