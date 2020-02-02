package com.mei.ergosurgeon.load.data.rules;

import org.apache.avro.specific.SpecificRecord;
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

    /***
     * Mapping to avro class
     * @param <T>
     * @return
     * @throws Exception
     */
    <T extends SpecificRecord> Class<T> mappingClass();


    /***
     * Get templato to a proxy for sending message.
     * @param <T>
     * @return
     */

    <T extends AbstractKafkaTopic> KafkaTemplate<Object, T> getKafkaTemplate();


    void validateRules(Object... args);

    /***
     * Prepare and clean up data.
     */
    void cleanUp(Object... args);
}
