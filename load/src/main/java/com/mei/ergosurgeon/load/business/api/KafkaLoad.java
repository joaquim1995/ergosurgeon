package com.mei.ergosurgeon.load.business.api;

import com.mei.ergosurgeon.load.data.entities.custom.KafkaTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;

public interface KafkaLoad<T extends KafkaTopic<T>> {

    //autch
    default Logger getLogger() {
        return LoggerFactory.getLogger(getClazz());
    }

    default Class<T> getClazz() {
        return (Class<T>) this.getClass();
    }


    @Async
    void send(T item);
}
