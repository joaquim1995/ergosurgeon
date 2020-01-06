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
    @Autowired
    JavaMailSender javaMailSender;
    public static void main(String[] args) {

        try {
            new Process().sa();

            SpringApplication.run(Process.class, args);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void sa()
    {
        Client item = new Client(
                "joaquimcardoso12@hotmail.com",
                "01234567-ABCD-abcd-3210-0123456789AB",
                Clock.systemUTC().millis(),
                Clock.systemUTC().millis()
        );
        SimpleMailMessage msg = new SimpleMailMessage();

        msg.setTo(item.getEmail().toString());

        msg.setSubject("Ergosurgeon");
        msg.setText("Request data on:\n"+
                "\nlocalhost:8080/"+
                item.getEmail().toString()+"/"+
                item.getUuid().toString()+"/"+
                item.getDateStart()+"/"+
                item.getDateEnd()+"\n\n"+
                "Give it some time to process data.\n"
        );

        javaMailSender.send(msg);
    }
}