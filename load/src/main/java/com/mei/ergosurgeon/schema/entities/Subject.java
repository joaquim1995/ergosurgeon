/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.mei.ergosurgeon.schema.entities;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Subject extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Subject\",\"namespace\":\"com.mei.ergosurgeon.schema.entities\",\"fields\":[{\"name\":\"comment\",\"type\":[\"null\",\"string\"]},{\"name\":\"label\",\"type\":[\"null\",\"string\"]},{\"name\":\"torsoColor\",\"type\":[\"null\",\"string\"]},{\"name\":\"frameRate\",\"type\":\"long\"},{\"name\":\"segmentCount\",\"type\":[\"null\",\"string\"]},{\"name\":\"recDate\",\"type\":[\"null\",\"string\"]},{\"name\":\"originalFilename\",\"type\":\"string\"}]}");
    private static final long serialVersionUID = -6989510800078579755L;
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<Subject> ENCODER =
            new BinaryMessageEncoder<Subject>(MODEL$, SCHEMA$);
    private static final BinaryMessageDecoder<Subject> DECODER =
            new BinaryMessageDecoder<Subject>(MODEL$, SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<Subject>
            WRITER$ = (org.apache.avro.io.DatumWriter<Subject>) MODEL$.createDatumWriter(SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<Subject>
            READER$ = (org.apache.avro.io.DatumReader<Subject>) MODEL$.createDatumReader(SCHEMA$);
    @Deprecated
    public java.lang.CharSequence comment;
    @Deprecated
    public java.lang.CharSequence label;
    @Deprecated
    public java.lang.CharSequence torsoColor;
    @Deprecated
    public long frameRate;
    @Deprecated
    public java.lang.CharSequence segmentCount;
    @Deprecated
    public java.lang.CharSequence recDate;
    @Deprecated
    public java.lang.CharSequence originalFilename;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public Subject() {
    }

    /**
     * All-args constructor.
     * @param comment The new value for comment
     * @param label The new value for label
     * @param torsoColor The new value for torsoColor
     * @param frameRate The new value for frameRate
     * @param segmentCount The new value for segmentCount
     * @param recDate The new value for recDate
     * @param originalFilename The new value for originalFilename
     */
    public Subject(java.lang.CharSequence comment, java.lang.CharSequence label, java.lang.CharSequence torsoColor, java.lang.Long frameRate, java.lang.CharSequence segmentCount, java.lang.CharSequence recDate, java.lang.CharSequence originalFilename) {
        this.comment = comment;
        this.label = label;
        this.torsoColor = torsoColor;
        this.frameRate = frameRate;
        this.segmentCount = segmentCount;
        this.recDate = recDate;
        this.originalFilename = originalFilename;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     */
    public static BinaryMessageDecoder<Subject> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     */
    public static BinaryMessageDecoder<Subject> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<Subject>(MODEL$, SCHEMA$, resolver);
    }

    /** Deserializes a Subject from a ByteBuffer. */
    public static Subject fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /**
     * Creates a new Subject RecordBuilder.
     * @return A new Subject RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.Subject.Builder newBuilder() {
        return new com.mei.ergosurgeon.schema.entities.Subject.Builder();
    }

    /**
     * Creates a new Subject RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new Subject RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.Subject.Builder newBuilder(com.mei.ergosurgeon.schema.entities.Subject.Builder other) {
        return new com.mei.ergosurgeon.schema.entities.Subject.Builder(other);
    }

    /**
     * Creates a new Subject RecordBuilder by copying an existing Subject instance.
     * @param other The existing instance to copy.
     * @return A new Subject RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.Subject.Builder newBuilder(com.mei.ergosurgeon.schema.entities.Subject other) {
        return new com.mei.ergosurgeon.schema.entities.Subject.Builder(other);
    }

    /** Serializes this Subject to a ByteBuffer. */
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
                return comment;
            case 1:
                return label;
            case 2:
                return torsoColor;
            case 3:
                return frameRate;
            case 4:
                return segmentCount;
            case 5:
                return recDate;
            case 6:
                return originalFilename;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                comment = (java.lang.CharSequence) value$;
                break;
            case 1:
                label = (java.lang.CharSequence) value$;
                break;
            case 2:
                torsoColor = (java.lang.CharSequence) value$;
                break;
            case 3:
                frameRate = (java.lang.Long) value$;
                break;
            case 4:
                segmentCount = (java.lang.CharSequence) value$;
                break;
            case 5:
                recDate = (java.lang.CharSequence) value$;
                break;
            case 6:
                originalFilename = (java.lang.CharSequence) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'comment' field.
     * @return The value of the 'comment' field.
     */
    public java.lang.CharSequence getComment() {
        return comment;
    }

    /**
     * Sets the value of the 'comment' field.
     * @param value the value to set.
     */
    public void setComment(java.lang.CharSequence value) {
        this.comment = value;
    }

    /**
     * Gets the value of the 'label' field.
     * @return The value of the 'label' field.
     */
    public java.lang.CharSequence getLabel() {
        return label;
    }

    /**
     * Sets the value of the 'label' field.
     * @param value the value to set.
     */
    public void setLabel(java.lang.CharSequence value) {
        this.label = value;
    }

    /**
     * Gets the value of the 'torsoColor' field.
     * @return The value of the 'torsoColor' field.
     */
    public java.lang.CharSequence getTorsoColor() {
        return torsoColor;
    }

    /**
     * Sets the value of the 'torsoColor' field.
     * @param value the value to set.
     */
    public void setTorsoColor(java.lang.CharSequence value) {
        this.torsoColor = value;
    }

    /**
     * Gets the value of the 'frameRate' field.
     * @return The value of the 'frameRate' field.
     */
    public java.lang.Long getFrameRate() {
        return frameRate;
    }

    /**
     * Sets the value of the 'frameRate' field.
     * @param value the value to set.
     */
    public void setFrameRate(java.lang.Long value) {
        this.frameRate = value;
    }

    /**
     * Gets the value of the 'segmentCount' field.
     * @return The value of the 'segmentCount' field.
     */
    public java.lang.CharSequence getSegmentCount() {
        return segmentCount;
    }

    /**
     * Sets the value of the 'segmentCount' field.
     * @param value the value to set.
     */
    public void setSegmentCount(java.lang.CharSequence value) {
        this.segmentCount = value;
    }

    /**
     * Gets the value of the 'recDate' field.
     * @return The value of the 'recDate' field.
     */
    public java.lang.CharSequence getRecDate() {
        return recDate;
    }

    /**
     * Sets the value of the 'recDate' field.
     * @param value the value to set.
     */
    public void setRecDate(java.lang.CharSequence value) {
        this.recDate = value;
    }

    /**
     * Gets the value of the 'originalFilename' field.
     * @return The value of the 'originalFilename' field.
     */
    public java.lang.CharSequence getOriginalFilename() {
        return originalFilename;
    }

    /**
     * Sets the value of the 'originalFilename' field.
     * @param value the value to set.
     */
    public void setOriginalFilename(java.lang.CharSequence value) {
        this.originalFilename = value;
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
     * RecordBuilder for Subject instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Subject>
            implements org.apache.avro.data.RecordBuilder<Subject> {

        private java.lang.CharSequence comment;
        private java.lang.CharSequence label;
        private java.lang.CharSequence torsoColor;
        private long frameRate;
        private java.lang.CharSequence segmentCount;
        private java.lang.CharSequence recDate;
        private java.lang.CharSequence originalFilename;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(com.mei.ergosurgeon.schema.entities.Subject.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.comment)) {
                this.comment = data().deepCopy(fields()[0].schema(), other.comment);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.label)) {
                this.label = data().deepCopy(fields()[1].schema(), other.label);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.torsoColor)) {
                this.torsoColor = data().deepCopy(fields()[2].schema(), other.torsoColor);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.frameRate)) {
                this.frameRate = data().deepCopy(fields()[3].schema(), other.frameRate);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.segmentCount)) {
                this.segmentCount = data().deepCopy(fields()[4].schema(), other.segmentCount);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.recDate)) {
                this.recDate = data().deepCopy(fields()[5].schema(), other.recDate);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.originalFilename)) {
                this.originalFilename = data().deepCopy(fields()[6].schema(), other.originalFilename);
                fieldSetFlags()[6] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing Subject instance
         * @param other The existing instance to copy.
         */
        private Builder(com.mei.ergosurgeon.schema.entities.Subject other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.comment)) {
                this.comment = data().deepCopy(fields()[0].schema(), other.comment);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.label)) {
                this.label = data().deepCopy(fields()[1].schema(), other.label);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.torsoColor)) {
                this.torsoColor = data().deepCopy(fields()[2].schema(), other.torsoColor);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.frameRate)) {
                this.frameRate = data().deepCopy(fields()[3].schema(), other.frameRate);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.segmentCount)) {
                this.segmentCount = data().deepCopy(fields()[4].schema(), other.segmentCount);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.recDate)) {
                this.recDate = data().deepCopy(fields()[5].schema(), other.recDate);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.originalFilename)) {
                this.originalFilename = data().deepCopy(fields()[6].schema(), other.originalFilename);
                fieldSetFlags()[6] = true;
            }
        }

        /**
         * Gets the value of the 'comment' field.
         * @return The value.
         */
        public java.lang.CharSequence getComment() {
            return comment;
        }

        /**
         * Sets the value of the 'comment' field.
         * @param value The value of 'comment'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder setComment(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.comment = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'comment' field has been set.
         * @return True if the 'comment' field has been set, false otherwise.
         */
        public boolean hasComment() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'comment' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder clearComment() {
            comment = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'label' field.
         * @return The value.
         */
        public java.lang.CharSequence getLabel() {
            return label;
        }

        /**
         * Sets the value of the 'label' field.
         * @param value The value of 'label'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder setLabel(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.label = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'label' field has been set.
         * @return True if the 'label' field has been set, false otherwise.
         */
        public boolean hasLabel() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'label' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder clearLabel() {
            label = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'torsoColor' field.
         * @return The value.
         */
        public java.lang.CharSequence getTorsoColor() {
            return torsoColor;
        }

        /**
         * Sets the value of the 'torsoColor' field.
         * @param value The value of 'torsoColor'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder setTorsoColor(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.torsoColor = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'torsoColor' field has been set.
         * @return True if the 'torsoColor' field has been set, false otherwise.
         */
        public boolean hasTorsoColor() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'torsoColor' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder clearTorsoColor() {
            torsoColor = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'frameRate' field.
         * @return The value.
         */
        public java.lang.Long getFrameRate() {
            return frameRate;
        }

        /**
         * Sets the value of the 'frameRate' field.
         * @param value The value of 'frameRate'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder setFrameRate(long value) {
            validate(fields()[3], value);
            this.frameRate = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'frameRate' field has been set.
         * @return True if the 'frameRate' field has been set, false otherwise.
         */
        public boolean hasFrameRate() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'frameRate' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder clearFrameRate() {
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'segmentCount' field.
         * @return The value.
         */
        public java.lang.CharSequence getSegmentCount() {
            return segmentCount;
        }

        /**
         * Sets the value of the 'segmentCount' field.
         * @param value The value of 'segmentCount'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder setSegmentCount(java.lang.CharSequence value) {
            validate(fields()[4], value);
            this.segmentCount = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'segmentCount' field has been set.
         * @return True if the 'segmentCount' field has been set, false otherwise.
         */
        public boolean hasSegmentCount() {
            return fieldSetFlags()[4];
        }


        /**
         * Clears the value of the 'segmentCount' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder clearSegmentCount() {
            segmentCount = null;
            fieldSetFlags()[4] = false;
            return this;
        }

        /**
         * Gets the value of the 'recDate' field.
         * @return The value.
         */
        public java.lang.CharSequence getRecDate() {
            return recDate;
        }

        /**
         * Sets the value of the 'recDate' field.
         * @param value The value of 'recDate'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder setRecDate(java.lang.CharSequence value) {
            validate(fields()[5], value);
            this.recDate = value;
            fieldSetFlags()[5] = true;
            return this;
        }

        /**
         * Checks whether the 'recDate' field has been set.
         * @return True if the 'recDate' field has been set, false otherwise.
         */
        public boolean hasRecDate() {
            return fieldSetFlags()[5];
        }


        /**
         * Clears the value of the 'recDate' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder clearRecDate() {
            recDate = null;
            fieldSetFlags()[5] = false;
            return this;
        }

        /**
         * Gets the value of the 'originalFilename' field.
         * @return The value.
         */
        public java.lang.CharSequence getOriginalFilename() {
            return originalFilename;
        }

        /**
         * Sets the value of the 'originalFilename' field.
         * @param value The value of 'originalFilename'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder setOriginalFilename(java.lang.CharSequence value) {
            validate(fields()[6], value);
            this.originalFilename = value;
            fieldSetFlags()[6] = true;
            return this;
        }

        /**
         * Checks whether the 'originalFilename' field has been set.
         * @return True if the 'originalFilename' field has been set, false otherwise.
         */
        public boolean hasOriginalFilename() {
            return fieldSetFlags()[6];
        }


        /**
         * Clears the value of the 'originalFilename' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Subject.Builder clearOriginalFilename() {
            originalFilename = null;
            fieldSetFlags()[6] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Subject build() {
            try {
                Subject record = new Subject();
                record.comment = fieldSetFlags()[0] ? this.comment : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.label = fieldSetFlags()[1] ? this.label : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.torsoColor = fieldSetFlags()[2] ? this.torsoColor : (java.lang.CharSequence) defaultValue(fields()[2]);
                record.frameRate = fieldSetFlags()[3] ? this.frameRate : (java.lang.Long) defaultValue(fields()[3]);
                record.segmentCount = fieldSetFlags()[4] ? this.segmentCount : (java.lang.CharSequence) defaultValue(fields()[4]);
                record.recDate = fieldSetFlags()[5] ? this.recDate : (java.lang.CharSequence) defaultValue(fields()[5]);
                record.originalFilename = fieldSetFlags()[6] ? this.originalFilename : (java.lang.CharSequence) defaultValue(fields()[6]);
                return record;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

}
