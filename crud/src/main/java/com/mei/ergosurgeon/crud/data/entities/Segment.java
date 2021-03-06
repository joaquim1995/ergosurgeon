//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.22 at 11:20:22 PM BST 
//


package com.mei.ergosurgeon.crud.data.entities;

import com.mei.ergosurgeon.crud.data.entities.custom.Key;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;


@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "segment")
@Table(name = "Segment")
public class Segment extends Key {

    @OneToOne(cascade = CascadeType.ALL)
    @XmlElement(required = true)
    protected Points points;

    @XmlAttribute(name = "label", required = true)
    protected String label;

    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger segmentId;

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

    public BigInteger getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(BigInteger segmentId) {
        this.segmentId = segmentId;
    }

    public void process() {
        getPoints().process();
    }
}
