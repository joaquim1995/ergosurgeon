package com.mei.ergosurgeon;


import com.mei.ergosurgeon.process.transformers.channels.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;


@EnableBinding({StreamProcessorClient.class, StreamProcessorPoint.class, StreamProcessorFrame.class, StreamProcessorFrames.class, StreamProcessorJoint.class, StreamProcessorMvn.class, StreamProcessorMvnx.class, StreamProcessorQuaternion.class, StreamProcessorSegment.class, StreamProcessorSensor.class, StreamProcessorSubject.class, StreamProcessorVector.class})
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