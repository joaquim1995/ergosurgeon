package com.mei.ergosurgeon.process.transformers;

import com.mei.ergosurgeon.schema.entities.*;
import com.mei.ergosurgeon.schema.entities.custom.Quaternion;
import com.mei.ergosurgeon.schema.entities.custom.Vector;

import java.util.stream.Stream;

public class StreamProcessorUtils {
    public static Client processClient(Client item) {

        //To 0 is given the meaning of start. The first position.
        //item.setPosition(new Vector(0L, aux[0], aux[1], aux[2], item.getLabel()));
        return item;
    }

    public static Point processPoint(Point item) {
        Float[] aux = Stream.of(item.getPosS().toString().split(" ")).map(Float::new).toArray(Float[]::new);

        //To 0 is given the meaning of start. The first position.
        //item.setPosition(new Vector(0L, aux[0], aux[1], aux[2], item.getLabel()));
        return item;
    }

    public static Frame processFrame(Frame item) {
//TODO Normalize the frames.

        //TODO Fazer as ligações entre os rotulos, e classificar as posições em cada instante, passar para objectos dto,
        //não quero trabalhar com tanto lixo

        //Float[] orientations = Stream.of(getOrientation().split(" ")).map(Float::new).toArray(Float[]::new);
        //int i = 0;
        //int x = 0;
        //List<Quaternion> auxOrientations = new ArrayList<>(orientations.length / 4);
//
        //for (; i < orientations.length; i += 4)
        //    auxOrientations.add(new Quaternion(Long.parseLong(time), orientations[i], orientations[i + 1], orientations[i + 2], orientations[i + 3], SegmentEnum.obtain(x++)));
//
        //setOrientations(auxOrientations);
//
        //Float[] positions = Stream.of(getPosition().split(" ")).map(Float::new).toArray(Float[]::new);
        //i = 0;
        //x = 0;
        //List<Vector> auxPositions = new ArrayList<>(positions.length / 3);
//
        //for (; i < positions.length; i += 3)
        //    auxPositions.add(new Vector(Long.parseLong(time), positions[i], positions[i + 1], positions[i + 2], SegmentEnum.obtain(x++)));
//
        //setPositions(auxPositions);
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
