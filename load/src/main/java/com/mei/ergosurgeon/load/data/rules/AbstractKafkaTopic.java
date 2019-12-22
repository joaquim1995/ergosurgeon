package com.mei.ergosurgeon.load.data.rules;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.data.entities.custom.Client;
import org.springframework.kafka.core.KafkaTemplate;

public abstract class AbstractKafkaTopic<T> implements KafkaTopic<T> {

    private String uuid;
    private String email;
    private Integer id;

    /**
     * To Set up identification for BigQuery and sendding emails
     * @param uuid
     * @return
     */
    public <T extends AbstractKafkaTopic> T setUuid(String uuid) {
        this.uuid = uuid;
        return (T) this;
    }

    /**
     * To Set up identification for BigQuery and sendding emails
     * @param uuid
     * @return
     */
    public <T extends AbstractKafkaTopic> T setEmail(String email) {
        this.email = email;
        return (T) this;
    }

    /***
     * Set a incremental id. Upper hierarchy objects need to send,
     * while what we send needs a key so we can create a ML model based on SQL query.
     * Use it with send, or on process of other objects.
     * @param id
     */
    public <T extends AbstractKafkaTopic> T setId(Integer id){
        this.id = id;
        return (T) this;
    }

    public abstract T send(KafkaLoadService proxy, Client client) throws Exception;

    public abstract String getTopic();

    public abstract KafkaTemplate<Object, T> getKafkaTemplate();
}
