package com.mei.ergosurgeon.process.transformers.channels;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessorSubject {
    String INPUT = "raw_subject";
    String OUTPUT = "threated_subject";

    @Input(INPUT)
    SubscribableChannel processorInputSubject();

    @Output(OUTPUT)
    MessageChannel processorOutputSubject();
}
