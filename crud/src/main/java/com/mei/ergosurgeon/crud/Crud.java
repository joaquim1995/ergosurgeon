package com.mei.ergosurgeon.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Crud {
    public static void main(String[] args) {

        try {

            SpringApplication.run(Crud.class, args);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}