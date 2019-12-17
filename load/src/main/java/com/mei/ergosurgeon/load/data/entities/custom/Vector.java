package com.mei.ergosurgeon.load.data.entities.custom;


import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.business.utils.KafkaTemplatesUtil;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Objects;

public class Vector implements KafkaTopic<Vector> {


    private Integer id;

    private Long time;

    private Float q0;

    private Float q1;

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

    @Override
    public Vector send(KafkaLoadService proxy) throws Exception {
        proxy.send(this, com.mei.ergosurgeon.schema.entities.custom.Vector.class);
        return this;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getTopic() {
        return "vector";
    }

    @Override
    public KafkaTemplate<Object, Vector> getKafkaTemplate() {
        return KafkaTemplatesUtil.getKafkaVectorTemplate();
    }
}
