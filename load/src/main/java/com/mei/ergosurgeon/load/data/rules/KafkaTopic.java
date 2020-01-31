package com.mei.ergosurgeon.load.data.rules;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.data.entities.id.Client;
import org.springframework.kafka.core.KafkaTemplate;

/***
 * Kafka topic is the imaginative behaviour of a path on a good environment.
 * Is like be a sea in the world, you have multiple ramifications, you hold it together, by force.
 *
 */
public interface KafkaTopic extends Topic {
    /**
     * To Set up identification for BigQuery and sendding emails
     *
     * @param uuid
     * @return
     */
    <T extends AbstractKafkaTopic> T setUuid(String uuid);

    /**
     * To Set up identification for BigQuery and sendding emails
     *
     * @param uuid
     * @return
     */
    <T extends AbstractKafkaTopic> T setEmail(String email);

    void send(KafkaLoadService proxy, Client client) throws Exception;

    <T extends AbstractKafkaTopic> KafkaTemplate<Object, T> getKafkaTemplate();
}
