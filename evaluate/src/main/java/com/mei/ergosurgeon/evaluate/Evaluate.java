package com.mei.ergosurgeon.evaluate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Evaluate {
    public static void main(String[] args) {

        try {
            SpringApplication.run(Evaluate.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}