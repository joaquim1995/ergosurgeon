package com.mei.ergosurgeon.crud.data.entities.custom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Quaternion")
public class Quaternion extends Key {

    private Long time;

    @Column(precision = 6, scale = 6)
    private Float q0;

    @Column(precision = 6, scale = 6)
    private Float q1;

    @Column(precision = 6, scale = 6)
    private Float q2;

    @Column(precision = 6, scale = 6)
    private Float q3;

    private String segmentLabel;

    public Quaternion() {
    }

    public Quaternion(Long time, Float q0, Float q1, Float q2, Float q3, String segmentLabel) {
        this.time = time;
        this.q0 = q0;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
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

    public Float getQ3() {
        return q3;
    }

    public void setQ3(Float q3) {
        this.q3 = q3;
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
        if (o == null || getClass() != o.getClass()) return false;
        Quaternion that = (Quaternion) o;
        return Objects.equals(time, that.time) &&
                Objects.equals(q0, that.q0) &&
                Objects.equals(q1, that.q1) &&
                Objects.equals(q2, that.q2) &&
                Objects.equals(q3, that.q3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, q0, q1, q2, q3);
    }
}
