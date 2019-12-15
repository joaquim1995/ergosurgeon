/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.mei.ergosurgeon.schema.entities;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Segment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Segment\",\"namespace\":\"com.mei.ergosurgeon.schema.entities\",\"fields\":[{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"segmentId\",\"type\":\"long\"}]}");
    private static final long serialVersionUID = 4681641356507767486L;
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<Segment> ENCODER =
            new BinaryMessageEncoder<Segment>(MODEL$, SCHEMA$);
    private static final BinaryMessageDecoder<Segment> DECODER =
            new BinaryMessageDecoder<Segment>(MODEL$, SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<Segment>
            WRITER$ = (org.apache.avro.io.DatumWriter<Segment>) MODEL$.createDatumWriter(SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<Segment>
            READER$ = (org.apache.avro.io.DatumReader<Segment>) MODEL$.createDatumReader(SCHEMA$);
    @Deprecated
    public java.lang.CharSequence label;
    @Deprecated
    public long segmentId;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public Segment() {
    }

    /**
     * All-args constructor.
     *
     * @param label     The new value for label
     * @param segmentId The new value for segmentId
     */
    public Segment(java.lang.CharSequence label, java.lang.Long segmentId) {
        this.label = label;
        this.segmentId = segmentId;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     *
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<Segment> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     *
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<Segment> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     *
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<Segment> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<Segment>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Deserializes a Segment from a ByteBuffer.
     *
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a Segment instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static Segment fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /**
     * Creates a new Segment RecordBuilder.
     *
     * @return A new Segment RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.Segment.Builder newBuilder() {
        return new com.mei.ergosurgeon.schema.entities.Segment.Builder();
    }

    /**
     * Creates a new Segment RecordBuilder by copying an existing Builder.
     *
     * @param other The existing builder to copy.
     * @return A new Segment RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.Segment.Builder newBuilder(com.mei.ergosurgeon.schema.entities.Segment.Builder other) {
        if (other == null) {
            return new com.mei.ergosurgeon.schema.entities.Segment.Builder();
        } else {
            return new com.mei.ergosurgeon.schema.entities.Segment.Builder(other);
        }
    }

    /**
     * Creates a new Segment RecordBuilder by copying an existing Segment instance.
     *
     * @param other The existing instance to copy.
     * @return A new Segment RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.Segment.Builder newBuilder(com.mei.ergosurgeon.schema.entities.Segment other) {
        if (other == null) {
            return new com.mei.ergosurgeon.schema.entities.Segment.Builder();
        } else {
            return new com.mei.ergosurgeon.schema.entities.Segment.Builder(other);
        }
    }

    /**
     * Serializes this Segment to a ByteBuffer.
     *
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return label;
            case 1:
                return segmentId;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                label = (java.lang.CharSequence) value$;
                break;
            case 1:
                segmentId = (java.lang.Long) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'label' field.
     *
     * @return The value of the 'label' field.
     */
    public java.lang.CharSequence getLabel() {
        return label;
    }

    /**
     * Sets the value of the 'label' field.
     *
     * @param value the value to set.
     */
    public void setLabel(java.lang.CharSequence value) {
        this.label = value;
    }

    /**
     * Gets the value of the 'segmentId' field.
     *
     * @return The value of the 'segmentId' field.
     */
    public long getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the 'segmentId' field.
     *
     * @param value the value to set.
     */
    public void setSegmentId(long value) {
        this.segmentId = value;
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

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out)
            throws java.io.IOException {
        out.writeString(this.label);

        out.writeLong(this.segmentId);

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.label = in.readString(this.label instanceof Utf8 ? (Utf8) this.label : null);

            this.segmentId = in.readLong();

        } else {
            for (int i = 0; i < 2; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.label = in.readString(this.label instanceof Utf8 ? (Utf8) this.label : null);
                        break;

                    case 1:
                        this.segmentId = in.readLong();
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }

    /**
     * RecordBuilder for Segment instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Segment>
            implements org.apache.avro.data.RecordBuilder<Segment> {

        private java.lang.CharSequence label;
        private long segmentId;

        /**
         * Creates a new Builder
         */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         *
         * @param other The existing Builder to copy.
         */
        private Builder(com.mei.ergosurgeon.schema.entities.Segment.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.label)) {
                this.label = data().deepCopy(fields()[0].schema(), other.label);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.segmentId)) {
                this.segmentId = data().deepCopy(fields()[1].schema(), other.segmentId);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
        }

        /**
         * Creates a Builder by copying an existing Segment instance
         *
         * @param other The existing instance to copy.
         */
        private Builder(com.mei.ergosurgeon.schema.entities.Segment other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.label)) {
                this.label = data().deepCopy(fields()[0].schema(), other.label);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.segmentId)) {
                this.segmentId = data().deepCopy(fields()[1].schema(), other.segmentId);
                fieldSetFlags()[1] = true;
            }
        }

        /**
         * Gets the value of the 'label' field.
         *
         * @return The value.
         */
        public java.lang.CharSequence getLabel() {
            return label;
        }


        /**
         * Sets the value of the 'label' field.
         *
         * @param value The value of 'label'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Segment.Builder setLabel(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.label = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'label' field has been set.
         *
         * @return True if the 'label' field has been set, false otherwise.
         */
        public boolean hasLabel() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'label' field.
         *
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Segment.Builder clearLabel() {
            label = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'segmentId' field.
         *
         * @return The value.
         */
        public long getSegmentId() {
            return segmentId;
        }


        /**
         * Sets the value of the 'segmentId' field.
         *
         * @param value The value of 'segmentId'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Segment.Builder setSegmentId(long value) {
            validate(fields()[1], value);
            this.segmentId = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'segmentId' field has been set.
         *
         * @return True if the 'segmentId' field has been set, false otherwise.
         */
        public boolean hasSegmentId() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'segmentId' field.
         *
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Segment.Builder clearSegmentId() {
            fieldSetFlags()[1] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Segment build() {
            try {
                Segment record = new Segment();
                record.label = fieldSetFlags()[0] ? this.label : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.segmentId = fieldSetFlags()[1] ? this.segmentId : (java.lang.Long) defaultValue(fields()[1]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }
}









