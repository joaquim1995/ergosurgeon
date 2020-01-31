package com.mei.ergosurgeon.process.transformers;

import com.mei.ergosurgeon.schema.entities.*;
import com.mei.ergosurgeon.schema.entities.custom.Quaternion;
import com.mei.ergosurgeon.schema.entities.custom.Vector;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class StreamProcessorUtils {

    public static Client processClient(JavaMailSender javaMailSender, Client item) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom("a10201@alunos.ipca.pt");
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

        //To 0 is given the meaning of start. The first position.
        //item.setPosition(new Vector(0L, aux[0], aux[1], aux[2], item.getLabel()));
        return item;
    }

    public static Point processPoint(Point item) {
        //Initial positions
        return item;
    }

    public static Frame processFrame(Frame item) {
        //TODO Normalize the frames.
        return item;
    }

    public static Frames processFrames(Frames item) {
        //TODO Normalize the frames.
        return item;
    }

    public static Joint processJoint(Joint item) {
        item.setConnector1(item.getConnector1().toString().split("\\/")[0]);
        item.setConnector2(item.getConnector2().toString().split("\\/")[0]);

        return item;
    }

    public static Mvn processMvn(Mvn item) {

        return item;
    }

    public static Mvnx processMvnx(Mvnx item) {

        return item;
    }

    public static Quaternion processQuaternion(Quaternion item) {

        return item;
    }

    public static Segment processSegment(Segment item) {

        return item;
    }

    public static Sensor processSensor(Sensor item) {

        return item;
    }

    public static Subject processSubject(Subject item) {

        return item;
    }

    public static Vector processVector(Vector item) {

        return item;
    }
}
