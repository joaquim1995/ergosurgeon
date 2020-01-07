package com.mei.ergosurgeon.process.transformers;

import com.mei.ergosurgeon.process.config.JavaMailSenderConfig;
import com.mei.ergosurgeon.process.transformers.channels.*;
import com.mei.ergosurgeon.schema.entities.*;
import com.mei.ergosurgeon.schema.entities.custom.Quaternion;
import com.mei.ergosurgeon.schema.entities.custom.Vector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
public class StreamProcessor {

    @StreamListener(StreamProcessorClient.INPUT)
    @SendTo(StreamProcessorClient.OUTPUT)
    public Client processorClient(Client event) {
        return StreamProcessorUtils.processClient(JavaMailSenderConfig.getJavaMailSender(),event);
    }

    @StreamListener(StreamProcessorPoint.INPUT)
    @SendTo(StreamProcessorPoint.OUTPUT)
    public Point processorPoint(Point event) {
        return StreamProcessorUtils.processPoint(event);
    }

    @StreamListener(StreamProcessorFrame.INPUT)
    @SendTo(StreamProcessorFrame.OUTPUT)
    public Frame processorFrame(Frame event) {
        return StreamProcessorUtils.processFrame(event);
    }


    @StreamListener(StreamProcessorJoint.INPUT)
    @SendTo(StreamProcessorJoint.OUTPUT)
    public Joint processorJoint(Joint event) {
        return StreamProcessorUtils.processJoint(event);
    }


    @StreamListener(StreamProcessorMvn.INPUT)
    @SendTo(StreamProcessorMvn.OUTPUT)
    public Mvn processorMvn(Mvn event) {
        return StreamProcessorUtils.processMvn(event);
    }


    @StreamListener(StreamProcessorMvnx.INPUT)
    @SendTo(StreamProcessorMvnx.OUTPUT)
    public Mvnx processorMvnx(Mvnx event) {
        return StreamProcessorUtils.processMvnx(event);
    }

    @StreamListener(StreamProcessorQuaternion.INPUT)
    @SendTo(StreamProcessorQuaternion.OUTPUT)
    public Quaternion processorQuaternion(Quaternion event) {
        return StreamProcessorUtils.processQuaternion(event);
    }

    @StreamListener(StreamProcessorSegment.INPUT)
    @SendTo(StreamProcessorSegment.OUTPUT)
    public Segment processorSegment(Segment event) {
        return StreamProcessorUtils.processSegment(event);
    }

    @StreamListener(StreamProcessorSensor.INPUT)
    @SendTo(StreamProcessorSensor.OUTPUT)
    public Sensor processorSensor(Sensor event) {
        return StreamProcessorUtils.processSensor(event);
    }

    @StreamListener(StreamProcessorSubject.INPUT)
    @SendTo(StreamProcessorSubject.OUTPUT)
    public Subject processorSubject(Subject event) {
        return StreamProcessorUtils.processSubject(event);
    }

    @StreamListener(StreamProcessorVector.INPUT)
    @SendTo(StreamProcessorVector.OUTPUT)
    public Vector processorVector(Vector event) {
        return StreamProcessorUtils.processVector(event);
    }
}
