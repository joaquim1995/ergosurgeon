package com.mei.ergosurgeon.process;


import com.mei.ergosurgeon.process.transformers.channels.*;
import com.mei.ergosurgeon.schema.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.sql.Timestamp;
import java.time.Clock;
import java.time.LocalDateTime;


@EnableBinding({StreamProcessorClient.class,StreamProcessorPoint.class, StreamProcessorFrame.class, StreamProcessorJoint.class, StreamProcessorMvn.class, StreamProcessorMvnx.class, StreamProcessorQuaternion.class, StreamProcessorSegment.class, StreamProcessorSensor.class, StreamProcessorSubject.class, StreamProcessorVector.class})
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