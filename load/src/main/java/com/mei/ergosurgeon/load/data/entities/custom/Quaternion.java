package com.mei.ergosurgeon.load.data.entities.custom;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.business.utils.KafkaTemplatesUtil;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Objects;

public class Quaternion implements KafkaTopic<Quaternion> {

    private Integer id;

    private Long time;

    private Float q0;

    private Float q1;

    private Float q2;

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

    public Quaternion send(KafkaLoadService proxy, Client client) throws Exception {

        proxy.send(this, com.mei.ergosurgeon.schema.entities.custom.Quaternion.class, client);
        return this;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getTopic() {
        return "quaternion";
    }

    @Override
    public KafkaTemplate<Object, Quaternion> getKafkaTemplate() {
        return KafkaTemplatesUtil.getKafkaQuaternionTemplate();
    }

}
