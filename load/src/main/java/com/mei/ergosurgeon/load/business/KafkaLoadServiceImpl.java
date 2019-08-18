package com.mei.ergosurgeon.load.business;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.data.entities.custom.KafkaTopic;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


@Service
public class KafkaLoadServiceImpl implements KafkaLoadService {

    //TODO if the writer's record contains a field with a name not present
    // in the reader's record, the writer's value for that field is ignored.
    // ou seja apagar tudo o que seja objectos dentro de objectos
    // Não preciso de implementar KafkaTopic dentro de objectos com apenas listas.
    // faço um flatMap(item-> item.getList().steam())

    @Override
    public <T extends KafkaTopic<T>> void send(T item) throws Exception {
        try {
            item.getKafkaTemplate().executeInTransaction(
                    (kafkaOperations) -> kafkaOperations.send(
                            MessageBuilder
                                    .withPayload(item)
                                    .setHeader(KafkaHeaders.TOPIC, item.getInternalTopic())
                                    //.setHeader(KafkaHeaders.MESSAGE_KEY, item)
                                    .build()
                    )
            ).get();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
