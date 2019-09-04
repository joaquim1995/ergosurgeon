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
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "sensors")
public class Sensors {

    protected List<Sensor> sensor;

    public List<Sensor> getSensor() {
        if (sensor == null) {
            sensor = new ArrayList<>();
        }
        return this.sensor;
    }

    public Sensors process(KafkaLoadService proxy) throws Exception {

        for (Sensor item : getSensor()) {
            item.send(proxy);
        }

        //send(this);
        return this;
    }
}
