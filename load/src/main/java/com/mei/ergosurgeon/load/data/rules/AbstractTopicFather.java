package com.mei.ergosurgeon.load.data.rules;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.data.entities.id.Client;

/***
 * When you need to send something inside you.
 * You dont send yourself but you have a son that needs to be sent.
 */
public abstract class AbstractTopicFather implements TopicFather {
    public abstract void process(KafkaLoadService proxy, Client client) throws Exception;
}
