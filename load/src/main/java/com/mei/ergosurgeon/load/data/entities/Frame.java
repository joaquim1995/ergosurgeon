//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.22 at 11:20:22 PM BST 
//


package com.mei.ergosurgeon.load.data.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.business.utils.AvroFilesUtil;
import com.mei.ergosurgeon.load.business.utils.KafkaTemplatesUtil;
import com.mei.ergosurgeon.load.data.entities.custom.KafkaTopic;
import com.mei.ergosurgeon.load.data.entities.custom.Quaternion;
import com.mei.ergosurgeon.load.data.entities.custom.Vector;
import org.apache.avro.reflect.AvroIgnore;
import org.springframework.kafka.core.KafkaTemplate;

import javax.xml.bind.annotation.*;
import java.io.File;
import java.util.List;

import static com.mei.ergosurgeon.load.common.IlegalStateExceptionEnum.AVRO_INDEX_RECORD_GET;
import static com.mei.ergosurgeon.load.common.IlegalStateExceptionEnum.AVRO_INDEX_RECORD_PUT;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "frame")
public class Frame implements KafkaTopic<Frame> {

    @JsonProperty
    @XmlElement(required = true)
    protected String orientation;

    @XmlElement(required = true)
    protected String position;
    protected String velocity;
    protected String acceleration;
    protected String angularVelocity;
    protected String angularAcceleration;
    protected String sensorAcceleration;
    protected String sensorAngularVelocity;
    protected String sensorMagneticField;
    protected String sensorOrientation;
    protected String jointAngle;
    protected String jointAngleXZY;
    protected String centerOfMass;
    protected String marker;
    @XmlAttribute(name = "time", required = true)
    protected String time;
    @XmlAttribute(name = "index", required = true)
    protected String index;
    @XmlAttribute(name = "tc")
    protected String tc;
    @XmlAttribute(name = "ms")
    protected String ms;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    @AvroIgnore
    private List<Quaternion> orientations;

    @AvroIgnore
    private List<Vector> positions;

    public List<Quaternion> getOrientations() {
        return orientations;
    }

    public void setOrientations(List<Quaternion> orientations) {
        this.orientations = orientations;
    }

    public List<Vector> getPositions() {
        return positions;
    }

    public void setPositions(List<Vector> positions) {
        this.positions = positions;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String value) {
        this.orientation = value;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String value) {
        this.position = value;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String value) {
        this.velocity = value;
    }

    public String getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(String value) {
        this.acceleration = value;
    }

    public String getAngularVelocity() {
        return angularVelocity;
    }

    public void setAngularVelocity(String value) {
        this.angularVelocity = value;
    }

    public String getAngularAcceleration() {
        return angularAcceleration;
    }

    public void setAngularAcceleration(String value) {
        this.angularAcceleration = value;
    }

    public String getSensorAcceleration() {
        return sensorAcceleration;
    }

    public void setSensorAcceleration(String value) {
        this.sensorAcceleration = value;
    }

    public String getSensorAngularVelocity() {
        return sensorAngularVelocity;
    }

    public void setSensorAngularVelocity(String value) {
        this.sensorAngularVelocity = value;
    }

    public String getSensorMagneticField() {
        return sensorMagneticField;
    }

    public void setSensorMagneticField(String value) {
        this.sensorMagneticField = value;
    }

    public String getSensorOrientation() {
        return sensorOrientation;
    }

    public void setSensorOrientation(String value) {
        this.sensorOrientation = value;
    }

    public String getJointAngle() {
        return jointAngle;
    }

    public void setJointAngle(String value) {
        this.jointAngle = value;
    }

    public String getJointAngleXZY() {
        return jointAngleXZY;
    }

    public void setJointAngleXZY(String value) {
        this.jointAngleXZY = value;
    }

    public String getCenterOfMass() {
        return centerOfMass;
    }

    public void setCenterOfMass(String value) {
        this.centerOfMass = value;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String value) {
        this.marker = value;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String value) {
        this.time = value;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String value) {
        this.index = value;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String value) {
        this.tc = value;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String value) {
        this.ms = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public Frame process(KafkaLoadService proxy) throws Exception {

        proxy.send(this);

        /*//TODO Normalize the frames.

        //TODO Fazer as ligações entre os rotulos, e classificar as posições em cada instante, passar para objectos dto,
        //não quero trabalhar com tanto lixo

        Float[] orientations = Stream.of(getOrientation().split(" ")).map(Float::new).toArray(Float[]::new);
        int i = 0;
        int x = 0;
        List<Quaternion> auxOrientations = new ArrayList<>(orientations.length / 4);

        for (; i < orientations.length; i += 4)
            auxOrientations.add(new Quaternion(Long.parseLong(time), orientations[i], orientations[i + 1], orientations[i + 2], orientations[i + 3], SegmentEnum.obtain(x++)));

        setOrientations(auxOrientations);

        Float[] positions = Stream.of(getPosition().split(" ")).map(Float::new).toArray(Float[]::new);
        i = 0;
        x = 0;
        List<Vector> auxPositions = new ArrayList<>(positions.length / 3);

        for (; i < positions.length; i += 3)
            auxPositions.add(new Vector(Long.parseLong(time), positions[i], positions[i + 1], positions[i + 2], SegmentEnum.obtain(x++)));

        setPositions(auxPositions);
*/
        return this;
    }

    @Override
    public String getTopic() {
        return "frame";
    }

    @Override
    public KafkaTemplate<Object, Frame> getKafkaTemplate() {
        return KafkaTemplatesUtil.getKafkaFrameTemplate();
    }

    @Override
    public File getAvroSchemaFile() {
        return AvroFilesUtil.getAvroFrameSchema();
    }

    @Override
    public void put(int i, Object v) {
        switch (i) {
            case 0:
                setOrientation((String) v);
                break;
            case 1:
                setPosition((String) v);
                break;
            case 2:
                setVelocity((String) v);
                break;
            case 3:
                setAcceleration((String) v);
                break;
            case 4:
                setAngularVelocity((String) v);
                break;
            case 5:
                setAngularAcceleration((String) v);
                break;
            case 6:
                setSensorAcceleration((String) v);
                break;
            case 7:
                setSensorAngularVelocity((String) v);
                break;
            case 8:
                setSensorMagneticField((String) v);
                break;
            case 9:
                setSensorOrientation((String) v);
                break;
            case 10:
                setJointAngle((String) v);
                break;
            case 11:
                setJointAngleXZY((String) v);
                break;
            case 12:
                setCenterOfMass((String) v);
                break;
            case 13:
                setMarker((String) v);
                break;
            case 14:
                setTime((String) v);
                break;
            case 15:
                setIndex((String) v);
                break;
            case 16:
                setTc((String) v);
                break;
            case 17:
                setMs((String) v);
                break;
            case 18:
                setType((String) v);
                break;
            default:
                throw new IllegalStateException(AVRO_INDEX_RECORD_PUT.getValue());
        }
    }

    @Override
    public Object get(int i) {
        switch (i) {
            case 0:
                return getOrientation();
            case 1:
                return getPosition();
            case 2:
                return getVelocity();
            case 3:
                return getAcceleration();
            case 4:
                return getAngularVelocity();
            case 5:
                return getAngularAcceleration();
            case 6:
                return getSensorAcceleration();
            case 7:
                return getSensorAngularVelocity();
            case 8:
                return getSensorMagneticField();
            case 9:
                return getSensorOrientation();
            case 10:
                return getJointAngle();
            case 11:
                return getJointAngleXZY();
            case 12:
                return getCenterOfMass();
            case 13:
                return getMarker();
            case 14:
                return getTime();
            case 15:
                return getIndex();
            case 16:
                return getTc();
            case 17:
                return getMs();
            case 18:
                return getType();
            default:
                throw new IllegalStateException(AVRO_INDEX_RECORD_GET.getValue());
        }
    }
}