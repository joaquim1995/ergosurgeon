package com.mei.ergosurgeon.process.transformers.channels;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessorQuaternion {
    String INPUT = "raw_quaternion";
    String OUTPUT = "threated_quaternion";

    @Input(INPUT)
    SubscribableChannel processorInput();

    @Output(OUTPUT)
    MessageChannel processorOutput();
}
