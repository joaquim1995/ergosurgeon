package com.mei.ergosurgeon.load.business;

import com.mei.ergosurgeon.load.business.api.KafkaLoad;
import com.mei.ergosurgeon.load.data.entities.Mvnx;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.support.SendResult;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFutureCallback;


@Service
public class KafkaLoadImpl implements KafkaLoad<Mvnx> {

    //TODO if the writer's record contains a field with a name not present
    // in the reader's record, the writer's value for that field is ignored.
    // ou seja apagar tudo o que seja objectos dentro de objectos
    // Não preciso de implementar KafkaTopic dentro de objectos com apenas listas.
    // faço um flatMap(item-> item.getList().steam())

    @Override
    public void send(Mvnx item) {
        item.getKafkaTemplate().executeInTransaction(
                kafkaOperations -> kafkaOperations.send(
                        MessageBuilder
                                .withPayload(item)
                                .setHeader(KafkaHeaders.TOPIC, item.getInternalTopic())
                                //.setHeader(KafkaHeaders.MESSAGE_KEY, item)
                                .build()
                )
        )
                .addCallback(new ListenableFutureCallback<SendResult<Object, Mvnx>>() {

                    @Override
                    public void onSuccess(SendResult<Object, Mvnx> result) {
                        getLogger().info(result.toString());
                    }

                    @Override
                    public void onFailure(Throwable ex) {
                        getLogger().error(ex.getMessage());
                    }
                });
        getLogger().info("Thread : " + Thread.currentThread().getId());
    }
}
