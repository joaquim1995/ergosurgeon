package com.mei.ergosurgeon.process;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;


@EnableSchemaRegistryClient
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