package com.mei.ergosurgeon.process.transformers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Processor.class)
public class Processor {
    private static final String TRANSFORMATION_VALUE = "HI";

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @StreamListener(org.springframework.cloud.stream.messaging.Processor.INPUT)
    @SendTo(org.springframework.cloud.stream.messaging.Processor.OUTPUT)
    public Object receive(Object bar) {
        logger.info("******************\nAt the transformer\n******************");
        logger.info("Received value "+ bar.toString() + " of type " + bar.getClass());
        logger.info("Transforming the value to " + TRANSFORMATION_VALUE + " and with the type " + bar.getClass());
        bar = TRANSFORMATION_VALUE;
        return bar;
    }
}
