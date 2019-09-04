//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.22 at 11:20:22 PM BST 
//


package com.mei.ergosurgeon.load.data.entities;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.business.utils.KafkaTemplatesUtil;
import com.mei.ergosurgeon.load.data.entities.custom.KafkaTopic;
import org.springframework.kafka.core.KafkaTemplate;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "segment")
public class Segment implements KafkaTopic<Segment> {

    @XmlElement(required = true)
    protected Points points;

    @XmlAttribute(name = "label", required = true)
    protected String label;

    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long segmentId;

    public Points getPoints() {
        return points;
    }

    public void setPoints(Points value) {
        this.points = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    public Long getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Long segmentId) {
        this.segmentId = segmentId;
    }

    public Segment send(KafkaLoadService proxy) throws Exception {

        proxy.send(this, com.mei.ergosurgeon.schema.entities.Segment.class);
        getPoints().process(proxy);
        return this;
    }

    @Override
    public String getTopic() {
        return "segment";
    }

    @Override
    public KafkaTemplate<Object, Segment> getKafkaTemplate() {
        return KafkaTemplatesUtil.getKafkaSegmentTemplate();
    }
}
