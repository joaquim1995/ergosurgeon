//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.22 at 11:20:22 PM BST 
//


package com.mei.ergosurgeon.load.data.entities;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.business.utils.KafkaTemplatesUtil;
import com.mei.ergosurgeon.load.data.entities.custom.Client;
import com.mei.ergosurgeon.load.data.entities.custom.KafkaTopic;
import org.springframework.kafka.core.KafkaTemplate;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "subject")
public class Subject implements KafkaTopic<Subject> {

    private Integer id;

    @XmlElement(required = true)
    protected String comment;

    @XmlElement(required = true)
    protected Segments segments;

    protected Sensors sensors;

    protected Joints joints;

    @XmlElement(required = true)
    protected Frames frames;

    @XmlAttribute(name = "label", required = true)
    protected String label;

    @XmlAttribute(name = "torsoColor", required = true)
    protected String torsoColor;

    @XmlAttribute(name = "frameRate", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long frameRate;

    @XmlAttribute(name = "segmentCount", required = true)
    protected String segmentCount;

    @XmlAttribute(name = "recDate", required = true)
    protected String recDate;

    @XmlAttribute(name = "originalFilename", required = true)
    protected String originalFilename;

    public String getComment() {
        return comment;
    }

    public void setComment(String value) {
        this.comment = value;
    }

    public Segments getSegments() {
        return segments;
    }

    public void setSegments(Segments value) {
        this.segments = value;
    }

    public Sensors getSensors() {
        return sensors;
    }

    public void setSensors(Sensors value) {
        this.sensors = value;
    }

    public Joints getJoints() {
        return joints;
    }

    public void setJoints(Joints value) {
        this.joints = value;
    }

    public Frames getFrames() {
        return frames;
    }

    public void setFrames(Frames value) {
        this.frames = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    public String getTorsoColor() {
        return torsoColor;
    }

    public void setTorsoColor(String value) {
        this.torsoColor = value;
    }

    public Long getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Long value) {
        this.frameRate = value;
    }

    public String getSegmentCount() {
        return segmentCount;
    }

    public void setSegmentCount(String value) {
        this.segmentCount = value;
    }

    public String getRecDate() {
        return recDate;
    }

    public void setRecDate(String value) {
        this.recDate = value;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String value) {
        this.originalFilename = value;
    }

    public Subject send(KafkaLoadService proxy, Client client) throws Exception {

        proxy.send(this, com.mei.ergosurgeon.schema.entities.Subject.class, client);

        getSegments().process(proxy, client);
        getJoints().process(proxy, client);
        getFrames().process(proxy, client);
        getSensors().process(proxy, client);

        return this;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getTopic() {
        return "subject";
    }

    @Override
    public KafkaTemplate<Object, Subject> getKafkaTemplate() {
        return KafkaTemplatesUtil.getKafkaSubjectTemplate();
    }
}
