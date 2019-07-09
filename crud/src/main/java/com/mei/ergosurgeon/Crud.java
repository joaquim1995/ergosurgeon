package com.mei.ergosurgeon;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@Configuration
@EntityScan(basePackages = "com.mei.ergosurgeon.crud.data.entities")
@EnableJpaRepositories(basePackages = "com.mei.ergosurgeon.crud.data.repositories")
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