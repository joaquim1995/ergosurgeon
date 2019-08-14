package com.mei.ergosurgeon.load.data.entities.custom;

import org.springframework.kafka.core.KafkaTemplate;

import java.io.File;

public interface KafkaTopic<T> {

    T process();

    default String getInternalTopic() {
        return "raw_" + getTopic();
    }

    String getTopic();

    KafkaTemplate<Object, T> getKafkaTemplate();

    File getAvroFile();
}
