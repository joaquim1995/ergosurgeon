package com.mei.ergosurgeon.process;


import com.mei.ergosurgeon.process.transformers.channels.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;


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