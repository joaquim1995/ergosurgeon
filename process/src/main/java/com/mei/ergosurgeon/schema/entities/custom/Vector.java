/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.mei.ergosurgeon.schema.entities.custom;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Vector extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Vector\",\"namespace\":\"com.mei.ergosurgeon.schema.entities.custom\",\"fields\":[{\"name\":\"time\",\"type\":\"long\"},{\"name\":\"q0\",\"type\":\"float\"},{\"name\":\"q1\",\"type\":\"float\"},{\"name\":\"q2\",\"type\":\"float\"},{\"name\":\"segmentLabel\",\"type\":\"string\"}]}");
    private static final long serialVersionUID = -5136638844181955061L;
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<Vector> ENCODER =
            new BinaryMessageEncoder<Vector>(MODEL$, SCHEMA$);
    private static final BinaryMessageDecoder<Vector> DECODER =
            new BinaryMessageDecoder<Vector>(MODEL$, SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<Vector>
            WRITER$ = (org.apache.avro.io.DatumWriter<Vector>) MODEL$.createDatumWriter(SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<Vector>
            READER$ = (org.apache.avro.io.DatumReader<Vector>) MODEL$.createDatumReader(SCHEMA$);
    @Deprecated
    public long time;
    @Deprecated
    public float q0;
    @Deprecated
    public float q1;
    @Deprecated
    public float q2;
    @Deprecated
    public java.lang.CharSequence segmentLabel;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public Vector() {
    }

    /**
     * All-args constructor.
     * @param time The new value for time
     * @param q0 The new value for q0
     * @param q1 The new value for q1
     * @param q2 The new value for q2
     * @param segmentLabel The new value for segmentLabel
     */
    public Vector(java.lang.Long time, java.lang.Float q0, java.lang.Float q1, java.lang.Float q2, java.lang.CharSequence segmentLabel) {
        this.time = time;
        this.q0 = q0;
        this.q1 = q1;
        this.q2 = q2;
        this.segmentLabel = segmentLabel;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     */
    public static BinaryMessageDecoder<Vector> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     */
    public static BinaryMessageDecoder<Vector> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<Vector>(MODEL$, SCHEMA$, resolver);
    }

    /** Deserializes a Vector from a ByteBuffer. */
    public static Vector fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /**
     * Creates a new Vector RecordBuilder.
     * @return A new Vector RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.custom.Vector.Builder newBuilder() {
        return new com.mei.ergosurgeon.schema.entities.custom.Vector.Builder();
    }

    /**
     * Creates a new Vector RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new Vector RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.custom.Vector.Builder newBuilder(com.mei.ergosurgeon.schema.entities.custom.Vector.Builder other) {
        return new com.mei.ergosurgeon.schema.entities.custom.Vector.Builder(other);
    }

    /**
     * Creates a new Vector RecordBuilder by copying an existing Vector instance.
     * @param other The existing instance to copy.
     * @return A new Vector RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.custom.Vector.Builder newBuilder(com.mei.ergosurgeon.schema.entities.custom.Vector other) {
        return new com.mei.ergosurgeon.schema.entities.custom.Vector.Builder(other);
    }

    /** Serializes this Vector to a ByteBuffer. */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return time;
            case 1:
                return q0;
            case 2:
                return q1;
            case 3:
                return q2;
            case 4:
                return segmentLabel;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                time = (java.lang.Long) value$;
                break;
            case 1:
                q0 = (java.lang.Float) value$;
                break;
            case 2:
                q1 = (java.lang.Float) value$;
                break;
            case 3:
                q2 = (java.lang.Float) value$;
                break;
            case 4:
                segmentLabel = (java.lang.CharSequence) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'time' field.
     * @return The value of the 'time' field.
     */
    public java.lang.Long getTime() {
        return time;
    }

    /**
     * Sets the value of the 'time' field.
     * @param value the value to set.
     */
    public void setTime(java.lang.Long value) {
        this.time = value;
    }

    /**
     * Gets the value of the 'q0' field.
     * @return The value of the 'q0' field.
     */
    public java.lang.Float getQ0() {
        return q0;
    }

    /**
     * Sets the value of the 'q0' field.
     * @param value the value to set.
     */
    public void setQ0(java.lang.Float value) {
        this.q0 = value;
    }

    /**
     * Gets the value of the 'q1' field.
     * @return The value of the 'q1' field.
     */
    public java.lang.Float getQ1() {
        return q1;
    }

    /**
     * Sets the value of the 'q1' field.
     * @param value the value to set.
     */
    public void setQ1(java.lang.Float value) {
        this.q1 = value;
    }

    /**
     * Gets the value of the 'q2' field.
     * @return The value of the 'q2' field.
     */
    public java.lang.Float getQ2() {
        return q2;
    }

    /**
     * Sets the value of the 'q2' field.
     * @param value the value to set.
     */
    public void setQ2(java.lang.Float value) {
        this.q2 = value;
    }

    /**
     * Gets the value of the 'segmentLabel' field.
     * @return The value of the 'segmentLabel' field.
     */
    public java.lang.CharSequence getSegmentLabel() {
        return segmentLabel;
    }

    /**
     * Sets the value of the 'segmentLabel' field.
     * @param value the value to set.
     */
    public void setSegmentLabel(java.lang.CharSequence value) {
        this.segmentLabel = value;
    }

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    /**
     * RecordBuilder for Vector instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Vector>
            implements org.apache.avro.data.RecordBuilder<Vector> {

        private long time;
        private float q0;
        private float q1;
        private float q2;
        private java.lang.CharSequence segmentLabel;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(com.mei.ergosurgeon.schema.entities.custom.Vector.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.time)) {
                this.time = data().deepCopy(fields()[0].schema(), other.time);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.q0)) {
                this.q0 = data().deepCopy(fields()[1].schema(), other.q0);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.q1)) {
                this.q1 = data().deepCopy(fields()[2].schema(), other.q1);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.q2)) {
                this.q2 = data().deepCopy(fields()[3].schema(), other.q2);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.segmentLabel)) {
                this.segmentLabel = data().deepCopy(fields()[4].schema(), other.segmentLabel);
                fieldSetFlags()[4] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing Vector instance
         * @param other The existing instance to copy.
         */
        private Builder(com.mei.ergosurgeon.schema.entities.custom.Vector other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.time)) {
                this.time = data().deepCopy(fields()[0].schema(), other.time);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.q0)) {
                this.q0 = data().deepCopy(fields()[1].schema(), other.q0);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.q1)) {
                this.q1 = data().deepCopy(fields()[2].schema(), other.q1);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.q2)) {
                this.q2 = data().deepCopy(fields()[3].schema(), other.q2);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.segmentLabel)) {
                this.segmentLabel = data().deepCopy(fields()[4].schema(), other.segmentLabel);
                fieldSetFlags()[4] = true;
            }
        }

        /**
         * Gets the value of the 'time' field.
         * @return The value.
         */
        public java.lang.Long getTime() {
            return time;
        }

        /**
         * Sets the value of the 'time' field.
         * @param value The value of 'time'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.custom.Vector.Builder setTime(long value) {
            validate(fields()[0], value);
            this.time = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'time' field has been set.
         * @return True if the 'time' field has been set, false otherwise.
         */
        public boolean hasTime() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'time' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.custom.Vector.Builder clearTime() {
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'q0' field.
         * @return The value.
         */
        public java.lang.Float getQ0() {
            return q0;
        }

        /**
         * Sets the value of the 'q0' field.
         * @param value The value of 'q0'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.custom.Vector.Builder setQ0(float value) {
            validate(fields()[1], value);
            this.q0 = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'q0' field has been set.
         * @return True if the 'q0' field has been set, false otherwise.
         */
        public boolean hasQ0() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'q0' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.custom.Vector.Builder clearQ0() {
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'q1' field.
         * @return The value.
         */
        public java.lang.Float getQ1() {
            return q1;
        }

        /**
         * Sets the value of the 'q1' field.
         * @param value The value of 'q1'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.custom.Vector.Builder setQ1(float value) {
            validate(fields()[2], value);
            this.q1 = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'q1' field has been set.
         * @return True if the 'q1' field has been set, false otherwise.
         */
        public boolean hasQ1() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'q1' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.custom.Vector.Builder clearQ1() {
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'q2' field.
         * @return The value.
         */
        public java.lang.Float getQ2() {
            return q2;
        }

        /**
         * Sets the value of the 'q2' field.
         * @param value The value of 'q2'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.custom.Vector.Builder setQ2(float value) {
            validate(fields()[3], value);
            this.q2 = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'q2' field has been set.
         * @return True if the 'q2' field has been set, false otherwise.
         */
        public boolean hasQ2() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'q2' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.custom.Vector.Builder clearQ2() {
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'segmentLabel' field.
         * @return The value.
         */
        public java.lang.CharSequence getSegmentLabel() {
            return segmentLabel;
        }

        /**
         * Sets the value of the 'segmentLabel' field.
         * @param value The value of 'segmentLabel'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.custom.Vector.Builder setSegmentLabel(java.lang.CharSequence value) {
            validate(fields()[4], value);
            this.segmentLabel = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'segmentLabel' field has been set.
         * @return True if the 'segmentLabel' field has been set, false otherwise.
         */
        public boolean hasSegmentLabel() {
            return fieldSetFlags()[4];
        }


        /**
         * Clears the value of the 'segmentLabel' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.custom.Vector.Builder clearSegmentLabel() {
            segmentLabel = null;
            fieldSetFlags()[4] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Vector build() {
            try {
                Vector record = new Vector();
                record.time = fieldSetFlags()[0] ? this.time : (java.lang.Long) defaultValue(fields()[0]);
                record.q0 = fieldSetFlags()[1] ? this.q0 : (java.lang.Float) defaultValue(fields()[1]);
                record.q1 = fieldSetFlags()[2] ? this.q1 : (java.lang.Float) defaultValue(fields()[2]);
                record.q2 = fieldSetFlags()[3] ? this.q2 : (java.lang.Float) defaultValue(fields()[3]);
                record.segmentLabel = fieldSetFlags()[4] ? this.segmentLabel : (java.lang.CharSequence) defaultValue(fields()[4]);
                return record;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

}
