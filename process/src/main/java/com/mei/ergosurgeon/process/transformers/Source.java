package com.mei.ergosurgeon.process.transformers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(Source.ISource.class)
public class Source {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Bean
    @InboundChannelAdapter(value = ISource.SAMPLE, poller = @Poller(fixedDelay = "1000", maxMessagesPerPoll = "1"))
    public MessageSource<String> timerMessageSource() {
        return () -> {
            logger.info("******************\nAt the Source\n******************");
            String value = "{\"value\":\"hi\"}";
            logger.info("Sending value: " + value);
            return MessageBuilder.withPayload(value).build();
        };
    }

    public interface ISource {
        String SAMPLE = "sample-source";

        @Output(SAMPLE)
        MessageChannel sampleSource();
    }
}