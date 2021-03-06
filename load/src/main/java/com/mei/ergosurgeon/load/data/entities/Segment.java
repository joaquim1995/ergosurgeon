//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.22 at 11:20:22 PM BST 
//


package com.mei.ergosurgeon.load.data.entities;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.business.utils.KafkaTemplatesUtil;
import com.mei.ergosurgeon.load.data.entities.id.Client;
import com.mei.ergosurgeon.load.data.rules.AbstractKafkaTopic;
import lombok.ToString;
import org.apache.avro.specific.SpecificRecord;
import org.springframework.kafka.core.KafkaTemplate;

import javax.xml.bind.annotation.*;

@ToString(callSuper = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "segment")
public class Segment extends AbstractKafkaTopic {
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

    @Override
    public void send(KafkaLoadService proxy, Client client, Object... args) throws Exception {
        super.send(proxy, client, args);
        getPoints().process(proxy, client);
    }

    @Override
    public String getTopic() {
        return "segment";
    }

    @Override
    public KafkaTemplate<Object, Segment> getKafkaTemplate() {
        return KafkaTemplatesUtil.getKafkaSegmentTemplate();
    }

    @Override
    public <T extends SpecificRecord> Class<T> mappingClass() {
        return (Class<T>) com.mei.ergosurgeon.schema.entities.Segment.class;
    }
}
