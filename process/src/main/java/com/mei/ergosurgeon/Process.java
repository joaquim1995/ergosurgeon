package com.mei.ergosurgeon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
public class Process {
    public static void main(String[] args) {

        try {
            SpringApplication.run(Process.class, args);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}