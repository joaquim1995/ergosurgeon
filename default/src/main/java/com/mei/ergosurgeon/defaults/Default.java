package com.mei.ergosurgeon.defaults;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Default {
    public static void main(String[] args) {

        try {
            SpringApplication.run(Default.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}