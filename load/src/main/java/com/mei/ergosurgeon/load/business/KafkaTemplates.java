package com.mei.ergosurgeon.load.business;

import com.mei.ergosurgeon.load.data.entities.*;
import com.mei.ergosurgeon.load.data.entities.custom.Quaternion;
import com.mei.ergosurgeon.load.data.entities.custom.Vector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaTemplates {

    private static KafkaTemplate<Object, Subject> kafkaSubjectTemplate;
    private static KafkaTemplate<Object, Sensors> kafkaSensorsTemplate;
    private static KafkaTemplate<Object, Sensor> kafkaSensorTemplate;
    private static KafkaTemplate<Object, Segments> kafkaSegmentsTemplate;
    private static KafkaTemplate<Object, Segment> kafkaSegmentTemplate;
    private static KafkaTemplate<Object, Points> kafkaPointsTemplate;
    private static KafkaTemplate<Object, Point> kafkaPointTemplate;
    private static KafkaTemplate<Object, Mvnx> kafkaMvnxTemplate;
    private static KafkaTemplate<Object, Mvn> kafkaMvnTemplate;
    private static KafkaTemplate<Object, Joints> kafkaJointsTemplate;
    private static KafkaTemplate<Object, Joint> kafkaJointTemplate;
    private static KafkaTemplate<Object, Frames> kafkaFramesTemplate;
    private static KafkaTemplate<Object, Frame> kafkaFrameTemplate;
    private static KafkaTemplate<Object, Vector> kafkaVectorTemplate;
    private static KafkaTemplate<Object, Quaternion> kafkaQuaternionTemplate;

    @Autowired
    public KafkaTemplates(
            KafkaTemplate<Object, Subject> kafkaSubjectTemplate, KafkaTemplate<Object, Sensors> kafkaSensorsTemplate,
            KafkaTemplate<Object, Sensor> kafkaSensorTemplate, KafkaTemplate<Object, Segments> kafkaSegmentsTemplate,
            KafkaTemplate<Object, Segment> kafkaSegmentTemplate, KafkaTemplate<Object, Points> kafkaPointsTemplate,
            KafkaTemplate<Object, Point> kafkaPointTemplate, KafkaTemplate<Object, Mvnx> kafkaMvnxTemplate,
            KafkaTemplate<Object, Mvn> kafkaMvnTemplate, KafkaTemplate<Object, Joints> kafkaJointsTemplate,
            KafkaTemplate<Object, Joint> kafkaJointTemplate, KafkaTemplate<Object, Frames> kafkaFramesTemplate,
            KafkaTemplate<Object, Frame> kafkaFrameTemplate, KafkaTemplate<Object, Vector> kafkaVectorTemplate,
            KafkaTemplate<Object, Quaternion> kafkaQuaternionTemplate
    ) {
        this.kafkaSubjectTemplate = kafkaSubjectTemplate;
        this.kafkaSensorsTemplate = kafkaSensorsTemplate;
        this.kafkaSensorTemplate = kafkaSensorTemplate;
        this.kafkaSegmentsTemplate = kafkaSegmentsTemplate;
        this.kafkaSegmentTemplate = kafkaSegmentTemplate;
        this.kafkaPointsTemplate = kafkaPointsTemplate;
        this.kafkaPointTemplate = kafkaPointTemplate;
        this.kafkaMvnxTemplate = kafkaMvnxTemplate;
        this.kafkaMvnTemplate = kafkaMvnTemplate;
        this.kafkaJointsTemplate = kafkaJointsTemplate;
        this.kafkaJointTemplate = kafkaJointTemplate;
        this.kafkaFramesTemplate = kafkaFramesTemplate;
        this.kafkaFrameTemplate = kafkaFrameTemplate;
        this.kafkaVectorTemplate = kafkaVectorTemplate;
        this.kafkaQuaternionTemplate = kafkaQuaternionTemplate;
    }

    public static KafkaTemplate<Object, Subject> getKafkaSubjectTemplate() {
        return kafkaSubjectTemplate;
    }

    public static KafkaTemplate<Object, Sensors> getKafkaSensorsTemplate() {
        return kafkaSensorsTemplate;
    }

    public static KafkaTemplate<Object, Sensor> getKafkaSensorTemplate() {
        return kafkaSensorTemplate;
    }

    public static KafkaTemplate<Object, Segments> getKafkaSegmentsTemplate() {
        return kafkaSegmentsTemplate;
    }

    public static KafkaTemplate<Object, Segment> getKafkaSegmentTemplate() {
        return kafkaSegmentTemplate;
    }

    public static KafkaTemplate<Object, Points> getKafkaPointsTemplate() {
        return kafkaPointsTemplate;
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

    public static KafkaTemplate<Object, Joints> getKafkaJointsTemplate() {
        return kafkaJointsTemplate;
    }

    public static KafkaTemplate<Object, Joint> getKafkaJointTemplate() {
        return kafkaJointTemplate;
    }

    public static KafkaTemplate<Object, Frames> getKafkaFramesTemplate() {
        return kafkaFramesTemplate;
    }

    public static KafkaTemplate<Object, Frame> getKafkaFrameTemplate() {
        return kafkaFrameTemplate;
    }

    public static KafkaTemplate<Object, Vector> getKafkaVectorTemplate() {
        return kafkaVectorTemplate;
    }

    public static KafkaTemplate<Object, Quaternion> getKafkaQuaternionTemplate() {
        return kafkaQuaternionTemplate;
    }
}
