package com.mei.ergosurgeon.evaluate.transformers.channels;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessorClient {
    String INPUT = "raw_client";
    String OUTPUT = "threated_client";

    @Input(INPUT)
    SubscribableChannel processorInputClient();

    @Output(OUTPUT)
    MessageChannel processorOutputClient();
}
