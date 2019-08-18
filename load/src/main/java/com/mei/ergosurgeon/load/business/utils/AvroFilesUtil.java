package com.mei.ergosurgeon.load.business.utils;

import com.google.common.io.Resources;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class AvroFilesUtil {

    private static File avroSubjectSchema = new File(Resources.getResource("avro/subject.avsc").getPath());

    private static File avroSensorSchema = new File(Resources.getResource("avro/sensor.avsc").getPath());

    private static File avroSegmentSchema = new File(Resources.getResource("avro/segment.avsc").getPath());

    private static File avroPointSchema = new File(Resources.getResource("avro/point.avsc").getPath());

    private static File avroMvnxSchema = new File(Resources.getResource("avro/mvnx.avsc").getPath());

    private static File avroMvnSchema = new File(Resources.getResource("avro/mvn.avsc").getPath());

    private static File avroJointSchema = new File(Resources.getResource("avro/joint.avsc").getPath());

    private static File avroFrameSchema = new File(Resources.getResource("avro/frame.avsc").getPath());

    public static File getAvroSubjectSchema() {
        return avroSubjectSchema;

    }

    public static File getAvroSensorSchema() {
        return avroSensorSchema;
    }

    public static File getAvroSegmentSchema() {
        return avroSegmentSchema;
    }

    public static File getAvroPointSchema() {
        return avroPointSchema;
    }

    public static File getAvroMvnxSchema() {
        return avroMvnxSchema;
    }

    public static File getAvroMvnSchema() {
        return avroMvnSchema;
    }

    public static File getAvroJointSchema() {
        return avroJointSchema;
    }

    public static File getAvroFrameSchema() {
        return avroFrameSchema;
    }
}
