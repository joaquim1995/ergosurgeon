package com.mei.ergosurgeon.process.transformers.channels;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessorMvn {
    String INPUT = "raw_mvn";
    String OUTPUT = "threated_mvn";

    @Input(INPUT)
    SubscribableChannel processorInputMvn();

    @Output(OUTPUT)
    MessageChannel processorOutputMvn();
}
