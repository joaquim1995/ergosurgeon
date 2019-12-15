package com.mei.ergosurgeon.evaluate.transformers;

import com.mei.ergosurgeon.evaluate.transformers.channels.StreamProcessorClient;
import com.mei.ergosurgeon.schema.entities.Client;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
public class StreamProcessor {
    @StreamListener(StreamProcessorClient.INPUT)
    @SendTo(StreamProcessorClient.OUTPUT)
    public Client processorClient(Client event) {
        return StreamProcessorUtils.processPoint(event);
    }
}
