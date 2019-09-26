package com.mei.ergosurgeon.process.transformers.channels;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessorMvnx {
    String INPUT = "raw_mvnx";
    String OUTPUT = "threated_mvnx";

    @Input(INPUT)
    SubscribableChannel processorInputMvnx();

    @Output(OUTPUT)
    MessageChannel processorOutputMvnx();
}
