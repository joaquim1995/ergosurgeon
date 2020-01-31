package com.mei.ergosurgeon.process.transformers.channels;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessorFrames {
    String INPUT = "raw_frames";
    String OUTPUT = "threated_frames";

    @Input(INPUT)
    SubscribableChannel processorInputFrames();

    @Output(OUTPUT)
    MessageChannel processorOutputFrames();
}
