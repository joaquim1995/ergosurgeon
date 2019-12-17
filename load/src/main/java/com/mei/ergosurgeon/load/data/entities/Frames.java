//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.22 at 11:20:22 PM BST 
//


package com.mei.ergosurgeon.load.data.entities;


import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "frames")
public class Frames {

    private Integer id = 1;

    @XmlElement(required = true)
    protected List<Frame> frame;

    @XmlAttribute(name = "segmentCount", required = true)
    protected String segmentCount;

    @XmlAttribute(name = "sensorCount")
    protected String sensorCount;

    @XmlAttribute(name = "jointCount")
    protected String jointCount;

    public List<Frame> getFrame() {
        if (frame == null) {
            frame = new ArrayList<Frame>();
        }
        return this.frame;
    }


    public String getSegmentCount() {
        return segmentCount;
    }

    public void setSegmentCount(String value) {
        this.segmentCount = value;
    }

    public String getSensorCount() {
        return sensorCount;
    }

    public void setSensorCount(String value) {
        this.sensorCount = value;
    }

    public String getJointCount() {
        return jointCount;
    }

    public void setJointCount(String value) {
        this.jointCount = value;
    }

    public Frames process(KafkaLoadService proxy) throws Exception {

        int i = 1;
        for (Frame item : getFrame()) {
            if (StringUtils.equalsIgnoreCase(item.getType(), "normal")) {
                item.setId(i++);
                item.send(proxy);
            }
        }

        //send(this);
        return this;
    }
}
