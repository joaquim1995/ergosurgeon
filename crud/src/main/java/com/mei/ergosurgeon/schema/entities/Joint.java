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
public class Joint extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Joint\",\"namespace\":\"com.mei.ergosurgeon.schema.entities\",\"fields\":[{\"name\":\"connector1\",\"type\":\"string\"},{\"name\":\"connector2\",\"type\":\"string\"},{\"name\":\"label\",\"type\":\"string\"}]}");
    private static final long serialVersionUID = 7982737389804204776L;
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<Joint> ENCODER =
            new BinaryMessageEncoder<Joint>(MODEL$, SCHEMA$);
    private static final BinaryMessageDecoder<Joint> DECODER =
            new BinaryMessageDecoder<Joint>(MODEL$, SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<Joint>
            WRITER$ = (org.apache.avro.io.DatumWriter<Joint>) MODEL$.createDatumWriter(SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<Joint>
            READER$ = (org.apache.avro.io.DatumReader<Joint>) MODEL$.createDatumReader(SCHEMA$);
    @Deprecated
    public java.lang.CharSequence connector1;
    @Deprecated
    public java.lang.CharSequence connector2;
    @Deprecated
    public java.lang.CharSequence label;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public Joint() {
    }

    /**
     * All-args constructor.
     * @param connector1 The new value for connector1
     * @param connector2 The new value for connector2
     * @param label The new value for label
     */
    public Joint(java.lang.CharSequence connector1, java.lang.CharSequence connector2, java.lang.CharSequence label) {
        this.connector1 = connector1;
        this.connector2 = connector2;
        this.label = label;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     */
    public static BinaryMessageDecoder<Joint> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     */
    public static BinaryMessageDecoder<Joint> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<Joint>(MODEL$, SCHEMA$, resolver);
    }

    /** Deserializes a Joint from a ByteBuffer. */
    public static Joint fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /**
     * Creates a new Joint RecordBuilder.
     * @return A new Joint RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.Joint.Builder newBuilder() {
        return new com.mei.ergosurgeon.schema.entities.Joint.Builder();
    }

    /**
     * Creates a new Joint RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new Joint RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.Joint.Builder newBuilder(com.mei.ergosurgeon.schema.entities.Joint.Builder other) {
        return new com.mei.ergosurgeon.schema.entities.Joint.Builder(other);
    }

    /**
     * Creates a new Joint RecordBuilder by copying an existing Joint instance.
     * @param other The existing instance to copy.
     * @return A new Joint RecordBuilder
     */
    public static com.mei.ergosurgeon.schema.entities.Joint.Builder newBuilder(com.mei.ergosurgeon.schema.entities.Joint other) {
        return new com.mei.ergosurgeon.schema.entities.Joint.Builder(other);
    }

    /** Serializes this Joint to a ByteBuffer. */
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
                return connector1;
            case 1:
                return connector2;
            case 2:
                return label;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                connector1 = (java.lang.CharSequence) value$;
                break;
            case 1:
                connector2 = (java.lang.CharSequence) value$;
                break;
            case 2:
                label = (java.lang.CharSequence) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'connector1' field.
     * @return The value of the 'connector1' field.
     */
    public java.lang.CharSequence getConnector1() {
        return connector1;
    }

    /**
     * Sets the value of the 'connector1' field.
     * @param value the value to set.
     */
    public void setConnector1(java.lang.CharSequence value) {
        this.connector1 = value;
    }

    /**
     * Gets the value of the 'connector2' field.
     * @return The value of the 'connector2' field.
     */
    public java.lang.CharSequence getConnector2() {
        return connector2;
    }

    /**
     * Sets the value of the 'connector2' field.
     * @param value the value to set.
     */
    public void setConnector2(java.lang.CharSequence value) {
        this.connector2 = value;
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
     * RecordBuilder for Joint instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Joint>
            implements org.apache.avro.data.RecordBuilder<Joint> {

        private java.lang.CharSequence connector1;
        private java.lang.CharSequence connector2;
        private java.lang.CharSequence label;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(com.mei.ergosurgeon.schema.entities.Joint.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.connector1)) {
                this.connector1 = data().deepCopy(fields()[0].schema(), other.connector1);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.connector2)) {
                this.connector2 = data().deepCopy(fields()[1].schema(), other.connector2);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.label)) {
                this.label = data().deepCopy(fields()[2].schema(), other.label);
                fieldSetFlags()[2] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing Joint instance
         * @param other The existing instance to copy.
         */
        private Builder(com.mei.ergosurgeon.schema.entities.Joint other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.connector1)) {
                this.connector1 = data().deepCopy(fields()[0].schema(), other.connector1);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.connector2)) {
                this.connector2 = data().deepCopy(fields()[1].schema(), other.connector2);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.label)) {
                this.label = data().deepCopy(fields()[2].schema(), other.label);
                fieldSetFlags()[2] = true;
            }
        }

        /**
         * Gets the value of the 'connector1' field.
         * @return The value.
         */
        public java.lang.CharSequence getConnector1() {
            return connector1;
        }

        /**
         * Sets the value of the 'connector1' field.
         * @param value The value of 'connector1'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Joint.Builder setConnector1(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.connector1 = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'connector1' field has been set.
         * @return True if the 'connector1' field has been set, false otherwise.
         */
        public boolean hasConnector1() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'connector1' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Joint.Builder clearConnector1() {
            connector1 = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'connector2' field.
         * @return The value.
         */
        public java.lang.CharSequence getConnector2() {
            return connector2;
        }

        /**
         * Sets the value of the 'connector2' field.
         * @param value The value of 'connector2'.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Joint.Builder setConnector2(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.connector2 = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'connector2' field has been set.
         * @return True if the 'connector2' field has been set, false otherwise.
         */
        public boolean hasConnector2() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'connector2' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Joint.Builder clearConnector2() {
            connector2 = null;
            fieldSetFlags()[1] = false;
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
        public com.mei.ergosurgeon.schema.entities.Joint.Builder setLabel(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.label = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'label' field has been set.
         * @return True if the 'label' field has been set, false otherwise.
         */
        public boolean hasLabel() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'label' field.
         * @return This builder.
         */
        public com.mei.ergosurgeon.schema.entities.Joint.Builder clearLabel() {
            label = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Joint build() {
            try {
                Joint record = new Joint();
                record.connector1 = fieldSetFlags()[0] ? this.connector1 : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.connector2 = fieldSetFlags()[1] ? this.connector2 : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.label = fieldSetFlags()[2] ? this.label : (java.lang.CharSequence) defaultValue(fields()[2]);
                return record;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

}
