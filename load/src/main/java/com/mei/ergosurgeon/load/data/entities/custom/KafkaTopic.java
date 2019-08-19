package com.mei.ergosurgeon.load.data.entities.custom;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.springframework.kafka.core.KafkaTemplate;

import java.io.File;
import java.io.IOException;

public interface KafkaTopic<T> extends IndexedRecord {

    T process(KafkaLoadService proxy) throws Exception;

    default String getInternalTopic() {
        return "raw_" + getTopic();
    }

    String getTopic();

    KafkaTemplate<Object, T> getKafkaTemplate();

    File getAvroSchemaFile();

    @Override
    default Schema getSchema() {

        Schema.Parser a = new Schema.Parser();
        try {
            return a.parse(getAvroSchemaFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
