package com.mei.ergosurgeon;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@EnableAsync
@SpringBootApplication
public class Load {
    public static void main(String[] args) {

        try {
            SpringApplication.run(Load.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Bean
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(8);
        executor.setMaxPoolSize(64);
        executor.setQueueCapacity(5000);
        executor.setThreadNamePrefix("Executor-");
        executor.initialize();
        return executor;
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}