//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.22 at 11:20:22 PM BST 
//


package com.mei.ergosurgeon.load.data.entities;

import com.mei.ergosurgeon.load.business.utils.KafkaTemplatesUtil;
import com.mei.ergosurgeon.load.data.rules.AbstractKafkaTopic;
import lombok.ToString;
import org.apache.avro.specific.SpecificRecord;
import org.springframework.kafka.core.KafkaTemplate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@ToString(callSuper = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "mvn")
public class Mvn extends AbstractKafkaTopic {
    @XmlAttribute(name = "version", required = true)
    protected String version;

    @XmlAttribute(name = "build", required = true)
    protected String build;

    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        this.version = value;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String value) {
        this.build = value;
    }

    @Override
    public void cleanUp(Object... args) {
        setId(1);
    }

    @Override
    public String getTopic() {
        return "mvn";
    }


    @Override
    public KafkaTemplate<Object, Mvn> getKafkaTemplate() {
        return KafkaTemplatesUtil.getKafkaMvnTemplate();
    }

    @Override
    public <T extends SpecificRecord> Class<T> mappingClass() {
        return (Class<T>) com.mei.ergosurgeon.schema.entities.Mvn.class;
    }
}
