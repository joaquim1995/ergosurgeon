package com.mei.ergosurgeon.load.data.rules;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.data.entities.id.Client;


public abstract class AbstractTopicFather implements TopicFather {
    public abstract void process(KafkaLoadService proxy, Client client) throws Exception;
}
