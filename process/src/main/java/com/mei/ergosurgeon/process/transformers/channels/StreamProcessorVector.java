package com.mei.ergosurgeon.process.transformers.channels;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessorVector {
    String INPUT = "raw_vector";
    String OUTPUT = "threated_vector";

    @Input(INPUT)
    SubscribableChannel processorInput();

    @Output(OUTPUT)
    MessageChannel processorOutput();
}
