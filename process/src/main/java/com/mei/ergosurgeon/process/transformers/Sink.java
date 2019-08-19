package com.mei.ergosurgeon.process.transformers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.SubscribableChannel;

@EnableBinding(Sink.ISink.class)
public class Sink {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    // Sink application definition
    @StreamListener(ISink.SAMPLE)
    public void receive(Object foo) {
        logger.info("******************\nAt the Sink\n******************");
        logger.info("Received transformed message " + foo.toString() + " of type " + foo.getClass());
    }

    public interface ISink {
        String SAMPLE = "sample-sink";

        @Input(SAMPLE)
        SubscribableChannel sampleSink();
    }
}