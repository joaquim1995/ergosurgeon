package com.mei.ergosurgeon.process.transformers.channels;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessorPoint {
    String INPUT = "raw_point";
    String OUTPUT = "threated_point";

    @Input(INPUT)
    SubscribableChannel processorInput();

    @Output(OUTPUT)
    MessageChannel processorOutput();
}
