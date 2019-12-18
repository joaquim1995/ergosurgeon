package com.mei.ergosurgeon.load.data.entities.custom;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import org.springframework.kafka.core.KafkaTemplate;

public interface KafkaTopic<T> {

    /***
     * Set a incremental id. Upper hierarchy objects need to send,
     * while what we send needs a key so we can create a ML model based on SQL query.
     * Use it with send, or on process of other objects.
     * @param id
     */
    void setId(Integer id);

    T send(KafkaLoadService proxy, Client client) throws Exception;

    default String getInternalTopic() {
        return "raw_" + getTopic();
    }

    String getTopic();

    KafkaTemplate<Object, T> getKafkaTemplate();
}
