package com.mei.ergosurgeon.crud.data.entities.custom;


import javax.persistence.Column;
import java.util.Objects;

public class AbstractPosition {
    @Column(precision = 6, scale = 6)
    private Float x;

    @Column(precision = 6, scale = 6)
    private Float y;

    @Column(precision = 6, scale = 6)
    private Float z;

    public AbstractPosition() {
    }

    public AbstractPosition(Float x, Float y, Float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Float getZ() {
        return z;
    }

    public void setZ(Float z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractPosition)) return false;
        AbstractPosition that = (AbstractPosition) o;
        return Objects.equals(getX(), that.getX()) &&
                Objects.equals(getY(), that.getY()) &&
                Objects.equals(getZ(), that.getZ());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ());
    }
}
