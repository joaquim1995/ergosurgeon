package com.mei.ergosurgeon.load.business.api;

import com.mei.ergosurgeon.load.data.entities.custom.Client;
import com.mei.ergosurgeon.load.data.rules.KafkaTopic;
import org.springframework.scheduling.annotation.Async;

public interface KafkaLoadService {

    @Async
    <T extends KafkaTopic<T>> void send(T item, Class toClass, Client client) throws Exception;
}
