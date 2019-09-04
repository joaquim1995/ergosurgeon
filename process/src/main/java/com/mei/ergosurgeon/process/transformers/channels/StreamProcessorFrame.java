package com.mei.ergosurgeon.process.transformers.channels;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessorFrame {
    String INPUT = "raw_frame";
    String OUTPUT = "threated_frame";

    @Input(INPUT)
    SubscribableChannel processorInput();

    @Output(OUTPUT)
    MessageChannel processorOutput();
}
