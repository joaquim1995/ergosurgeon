package com.mei.ergosurgeon.load.data.rules;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.data.entities.custom.Client;
import org.springframework.kafka.core.KafkaTemplate;

public interface KafkaTopic<T> {

    T send(KafkaLoadService proxy, Client client) throws Exception;

    default String getInternalTopic() {
        return "raw_" + getTopic();
    }

    String getTopic();

    KafkaTemplate<Object, T> getKafkaTemplate();
}
