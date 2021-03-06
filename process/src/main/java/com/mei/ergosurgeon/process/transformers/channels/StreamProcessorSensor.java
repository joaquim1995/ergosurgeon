package com.mei.ergosurgeon.process.transformers.channels;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessorSensor {
    String INPUT = "raw_sensor";
    String OUTPUT = "threated_sensor";

    @Input(INPUT)
    SubscribableChannel processorInputSensor();

    @Output(OUTPUT)
    MessageChannel processorOutputSensor();
}
