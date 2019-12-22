package com.mei.ergosurgeon.load.business;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.data.entities.custom.Client;
import com.mei.ergosurgeon.load.data.rules.KafkaTopic;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


@Service
public class KafkaLoadServiceImpl implements KafkaLoadService {

    @Autowired
    private ModelMapper modelMapper;

    //TODO if the writer's record contains a field with a name not present
    // in the reader's record, the writer's value for that field is ignored.
    // ou seja apagar tudo o que seja objectos dentro de objectos
    // Não preciso de implementar KafkaTopic dentro de objectos com apenas listas.
    // faço um flatMap(item-> item.getList().steam())

    @Override
    public <S extends KafkaTopic<S>> void send(S item, Class toClass, Client client) throws Exception {
        try {
            item.getKafkaTemplate().executeInTransaction(
                    (kafkaOperations) -> kafkaOperations.send(
                            MessageBuilder
                                    .withPayload(modelMapper.map(item, toClass))
                                    .setHeader(KafkaHeaders.TOPIC, item.getInternalTopic())
                                    .setHeader("contentType", "application/*+avro")
                                    //.setHeader(KafkaHeaders.MESSAGE_KEY, client.getUuid())
                                    .build()
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
