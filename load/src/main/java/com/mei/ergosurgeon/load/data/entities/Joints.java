//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.22 at 11:20:22 PM BST 
//


package com.mei.ergosurgeon.load.data.entities;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "joints")
public class Joints {

    private Integer id = 1;

    @XmlElement(required = true)
    protected List<Joint> joint;

    public List<Joint> getJoint() {
        if (joint == null) {
            joint = new ArrayList<Joint>();
        }
        return this.joint;
    }

    public Joints process(KafkaLoadService proxy) throws Exception {
        int i = 1;
        for (Joint item : getJoint()) {
            item.setId(i++);
            item.send(proxy);
        }
        //send(this);
        return this;
    }
}
