package com.mei.ergosurgeon.crud.data.entities.custom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Vector")
public class Vector extends Key {

    private Long time;

    @Column(precision = 6, scale = 6)
    private Float q0;

    @Column(precision = 6, scale = 6)
    private Float q1;

    @Column(precision = 6, scale = 6)
    private Float q2;

    private String segmentLabel;


    public Vector() {
    }

    public Vector(Long time, Float q0, Float q1, Float q2, String segmentLabel) {
        this.time = time;
        this.q0 = q0;
        this.q1 = q1;
        this.q2 = q2;
        this.segmentLabel = segmentLabel;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Float getQ0() {
        return q0;
    }

    public void setQ0(Float q0) {
        this.q0 = q0;
    }

    public Float getQ1() {
        return q1;
    }

    public void setQ1(Float q1) {
        this.q1 = q1;
    }

    public Float getQ2() {
        return q2;
    }

    public void setQ2(Float q2) {
        this.q2 = q2;
    }

    public String getSegmentLabel() {
        return segmentLabel;
    }

    public void setSegmentLabel(String segmentLabel) {
        this.segmentLabel = segmentLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector)) return false;
        if (!super.equals(o)) return false;
        Vector vector = (Vector) o;
        return Objects.equals(getTime(), vector.getTime()) &&
                Objects.equals(getQ0(), vector.getQ0()) &&
                Objects.equals(getQ1(), vector.getQ1()) &&
                Objects.equals(getQ2(), vector.getQ2()) &&
                Objects.equals(getSegmentLabel(), vector.getSegmentLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTime(), getQ0(), getQ1(), getQ2(), getSegmentLabel());
    }
}
