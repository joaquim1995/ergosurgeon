package com.mei.ergosurgeon.process.transformers.channels;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessorJoint {
    String INPUT = "raw_joint";
    String OUTPUT = "threated_joint";

    @Input(INPUT)
    SubscribableChannel processorInput();

    @Output(OUTPUT)
    MessageChannel processorOutput();
}
