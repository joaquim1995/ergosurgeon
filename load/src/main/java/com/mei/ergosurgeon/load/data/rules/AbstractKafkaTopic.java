package com.mei.ergosurgeon.load.data.rules;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.data.entities.id.Client;
import lombok.Getter;
import lombok.ToString;
import org.apache.avro.specific.SpecificRecord;
import org.springframework.kafka.core.KafkaTemplate;

@Getter
@ToString(callSuper = true)
public abstract class AbstractKafkaTopic extends AbstractTopic implements KafkaTopic {
    private String uuid;
    private String email;

    /**
     * To Set up identification for BigQuery and sendding emails
     *
     * @param uuid
     * @return
     */
    public <T extends AbstractKafkaTopic> T setUuid(String uuid) {
        this.uuid = uuid;
        return (T) this;
    }

    /**
     * To Set up identification for BigQuery and sendding emails
     *
     * @param uuid
     * @return
     */
    public <T extends AbstractKafkaTopic> T setEmail(String email) {
        this.email = email;
        return (T) this;
    }

    public void send(KafkaLoadService proxy, Client client, Object... args) throws Exception {
        validateRules(args);
        cleanUp(args);
        proxy.send(this, client);
    }

    public abstract <T extends SpecificRecord> Class<T> mappingClass();

    public abstract <T extends AbstractKafkaTopic> KafkaTemplate<Object, T> getKafkaTemplate();
}
