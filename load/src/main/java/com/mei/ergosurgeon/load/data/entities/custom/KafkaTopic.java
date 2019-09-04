package com.mei.ergosurgeon.load.data.entities.custom;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import org.springframework.kafka.core.KafkaTemplate;

public interface KafkaTopic<T> {

    T send(KafkaLoadService proxy) throws Exception;

    default String getInternalTopic() {
        return "raw_" + getTopic();
    }

    String getTopic();

    KafkaTemplate<Object, T> getKafkaTemplate();
}
