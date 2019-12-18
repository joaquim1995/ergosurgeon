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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "sensor")
public class Sensor implements KafkaTopic<Sensor> {

    private Integer id;

    @XmlAttribute(name = "label", required = true)
    protected String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    public Sensor send(KafkaLoadService proxy, Client client) throws Exception {

        proxy.send(this, com.mei.ergosurgeon.schema.entities.Sensor.class, client);
        return this;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getTopic() {
        return "sensor";
    }

    @Override
    public KafkaTemplate<Object, Sensor> getKafkaTemplate() {
        return KafkaTemplatesUtil.getKafkaSensorTemplate();
    }
}
