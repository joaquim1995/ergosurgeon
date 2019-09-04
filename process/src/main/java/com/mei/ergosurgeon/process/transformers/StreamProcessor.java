package com.mei.ergosurgeon.process.transformers;

import com.mei.ergosurgeon.process.transformers.channels.*;
import com.mei.ergosurgeon.schema.entities.*;
import com.mei.ergosurgeon.schema.entities.custom.Quaternion;
import com.mei.ergosurgeon.schema.entities.custom.Vector;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding({
        StreamProcessorPoint.class, StreamProcessorFrame.class, StreamProcessorJoint.class,
        StreamProcessorMvn.class, StreamProcessorMvnx.class, StreamProcessorQuaternion.class,
        StreamProcessorSegment.class, StreamProcessorSensor.class, StreamProcessorSubject.class,
        StreamProcessorVector.class
})
public class StreamProcessor {
    @StreamListener(StreamProcessorPoint.INPUT)
    @SendTo(StreamProcessorPoint.OUTPUT)
    public Point processor(Point event) {
        return StreamProcessorUtils.processPoint(event);
    }

    @StreamListener(StreamProcessorFrame.INPUT)
    @SendTo(StreamProcessorFrame.OUTPUT)
    public Frame processor(Frame event) {
        return StreamProcessorUtils.processFrame(event);
    }


    @StreamListener(StreamProcessorJoint.INPUT)
    @SendTo(StreamProcessorJoint.OUTPUT)
    public Joint processor(Joint event) {
        return StreamProcessorUtils.processJoint(event);
    }


    @StreamListener(StreamProcessorMvn.INPUT)
    @SendTo(StreamProcessorMvn.OUTPUT)
    public Mvn processor(Mvn event) {
        return StreamProcessorUtils.processMvn(event);
    }


    @StreamListener(StreamProcessorMvnx.INPUT)
    @SendTo(StreamProcessorMvnx.OUTPUT)
    public Mvnx processor(Mvnx event) {
        return StreamProcessorUtils.processMvnx(event);
    }

    @StreamListener(StreamProcessorQuaternion.INPUT)
    @SendTo(StreamProcessorQuaternion.OUTPUT)
    public Quaternion processor(Quaternion event) {
        return StreamProcessorUtils.processQuaternion(event);
    }

    @StreamListener(StreamProcessorSegment.INPUT)
    @SendTo(StreamProcessorSegment.OUTPUT)
    public Segment processor(Segment event) {
        return StreamProcessorUtils.processSegment(event);
    }

    @StreamListener(StreamProcessorSensor.INPUT)
    @SendTo(StreamProcessorSensor.OUTPUT)
    public Sensor processor(Sensor event) {
        return StreamProcessorUtils.processSensor(event);
    }

    @StreamListener(StreamProcessorSubject.INPUT)
    @SendTo(StreamProcessorSubject.OUTPUT)
    public Subject processor(Subject event) {
        return StreamProcessorUtils.processSubject(event);
    }

    @StreamListener(StreamProcessorVector.INPUT)
    @SendTo(StreamProcessorVector.OUTPUT)
    public Vector processor(Vector event) {
        return StreamProcessorUtils.processVector(event);
    }
}
