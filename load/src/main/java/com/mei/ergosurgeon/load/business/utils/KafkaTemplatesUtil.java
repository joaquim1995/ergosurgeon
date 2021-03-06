package com.mei.ergosurgeon.load.business.utils;

import com.mei.ergosurgeon.load.data.entities.*;
import com.mei.ergosurgeon.load.data.entities.agregated.Quaternion;
import com.mei.ergosurgeon.load.data.entities.agregated.Vector;
import com.mei.ergosurgeon.load.data.entities.id.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaTemplatesUtil {

    private static KafkaTemplate<Object, Subject> kafkaSubjectTemplate;
    private static KafkaTemplate<Object, Sensor> kafkaSensorTemplate;
    private static KafkaTemplate<Object, Segment> kafkaSegmentTemplate;
    private static KafkaTemplate<Object, Point> kafkaPointTemplate;
    private static KafkaTemplate<Object, Mvnx> kafkaMvnxTemplate;
    private static KafkaTemplate<Object, Mvn> kafkaMvnTemplate;
    private static KafkaTemplate<Object, Joint> kafkaJointTemplate;
    private static KafkaTemplate<Object, Frame> kafkaFrameTemplate;
    private static KafkaTemplate<Object, Frames> kafkaFramesTemplate;
    private static KafkaTemplate<Object, Vector> kafkaVectorTemplate;
    private static KafkaTemplate<Object, Quaternion> kafkaQuaternionTemplate;
    private static KafkaTemplate<Object, Client> kafkaClientTemplate;

    @Autowired
    public KafkaTemplatesUtil(
            KafkaTemplate<Object, Subject> kafkaSubjectTemplate, KafkaTemplate<Object, Sensor> kafkaSensorTemplate,
            KafkaTemplate<Object, Segment> kafkaSegmentTemplate, KafkaTemplate<Object, Point> kafkaPointTemplate,
            KafkaTemplate<Object, Mvnx> kafkaMvnxTemplate, KafkaTemplate<Object, Mvn> kafkaMvnTemplate,
            KafkaTemplate<Object, Joint> kafkaJointTemplate, KafkaTemplate<Object, Frame> kafkaFrameTemplate,
            KafkaTemplate<Object, Frames> kafkaFramesTemplate, KafkaTemplate<Object, Vector> kafkaVectorTemplate,
            KafkaTemplate<Object, Quaternion> kafkaQuaternionTemplate, KafkaTemplate<Object, Client> kafkaClientTemplate) {
        this.kafkaSubjectTemplate = kafkaSubjectTemplate;
        this.kafkaSensorTemplate = kafkaSensorTemplate;
        this.kafkaSegmentTemplate = kafkaSegmentTemplate;
        this.kafkaPointTemplate = kafkaPointTemplate;
        this.kafkaMvnxTemplate = kafkaMvnxTemplate;
        this.kafkaMvnTemplate = kafkaMvnTemplate;
        this.kafkaJointTemplate = kafkaJointTemplate;
        this.kafkaFrameTemplate = kafkaFrameTemplate;
        this.kafkaFramesTemplate = kafkaFramesTemplate;
        this.kafkaVectorTemplate = kafkaVectorTemplate;
        this.kafkaQuaternionTemplate = kafkaQuaternionTemplate;
        this.kafkaClientTemplate = kafkaClientTemplate;
    }

    public static KafkaTemplate<Object, Subject> getKafkaSubjectTemplate() {
        return kafkaSubjectTemplate;
    }

    public static KafkaTemplate<Object, Sensor> getKafkaSensorTemplate() {
        return kafkaSensorTemplate;
    }

    public static KafkaTemplate<Object, Segment> getKafkaSegmentTemplate() {
        return kafkaSegmentTemplate;
    }

    public static KafkaTemplate<Object, Point> getKafkaPointTemplate() {
        return kafkaPointTemplate;
    }

    public static KafkaTemplate<Object, Mvnx> getKafkaMvnxTemplate() {
        return kafkaMvnxTemplate;
    }

    public static KafkaTemplate<Object, Mvn> getKafkaMvnTemplate() {
        return kafkaMvnTemplate;
    }

    public static KafkaTemplate<Object, Joint> getKafkaJointTemplate() {
        return kafkaJointTemplate;
    }

    public static KafkaTemplate<Object, Frame> getKafkaFrameTemplate() {
        return kafkaFrameTemplate;
    }

    public static KafkaTemplate<Object, Frames> getKafkaFramesTemplate() {
        return kafkaFramesTemplate;
    }

    public static KafkaTemplate<Object, Vector> getKafkaVectorTemplate() {
        return kafkaVectorTemplate;
    }

    public static KafkaTemplate<Object, Quaternion> getKafkaQuaternionTemplate() {
        return kafkaQuaternionTemplate;
    }

    public static KafkaTemplate<Object, Client> getKafkaClientTemplate() {
        return kafkaClientTemplate;
    }
}
