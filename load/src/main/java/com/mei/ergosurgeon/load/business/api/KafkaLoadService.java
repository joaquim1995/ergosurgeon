package com.mei.ergosurgeon.load.business.api;

import com.mei.ergosurgeon.load.data.entities.id.Client;
import com.mei.ergosurgeon.load.data.rules.AbstractKafkaTopic;
import org.springframework.scheduling.annotation.Async;

public interface KafkaLoadService {

    @Async
    <T extends AbstractKafkaTopic> void send(T item, Class toClass, Client client) throws Exception;
}
