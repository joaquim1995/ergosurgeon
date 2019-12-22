/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.mei.ergosurgeon.schema.entities;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Mvn extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2694158994212232694L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Mvn\",\"namespace\":\"com.mei.ergosurgeon.schema.entities\",\"fields\":[{\"name\":\"email\",\"type\":\"string\"},{\"name\":\"uuid\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"version\",\"type\":\"string\"},{\"name\":\"build\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Mvn> ENCODER =
      new BinaryMessageEncoder<Mvn>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Mvn> DECODER =
      new BinaryMessageDecoder<Mvn>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Mvn> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Mvn> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Mvn> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Mvn>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Mvn to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Mvn from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Mvn instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Mvn fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence email;
  @Deprecated public java.lang.CharSequence uuid;
  @Deprecated public long id;
  @Deprecated public java.lang.CharSequence version;
  @Deprecated public java.lang.CharSequence build;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Mvn() {}

  /**
   * All-args constructor.
   * @param email The new value for email
   * @param uuid The new value for uuid
   * @param id The new value for id
   * @param version The new value for version
   * @param build The new value for build
   */
  public Mvn(java.lang.CharSequence email, java.lang.CharSequence uuid, java.lang.Long id, java.lang.CharSequence version, java.lang.CharSequence build) {
    this.email = email;
    this.uuid = uuid;
    this.id = id;
    this.version = version;
    this.build = build;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return email;
    case 1: return uuid;
    case 2: return id;
    case 3: return version;
    case 4: return build;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: email = (java.lang.CharSequence)value$; break;
    case 1: uuid = (java.lang.CharSequence)value$; break;
    case 2: id = (java.lang.Long)value$; break;
    case 3: version = (java.lang.CharSequence)value$; break;
    case 4: build = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }


  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'uuid' field.
   * @return The value of the 'uuid' field.
   */
  public java.lang.CharSequence getUuid() {
    return uuid;
  }


  /**
   * Sets the value of the 'uuid' field.
   * @param value the value to set.
   */
  public void setUuid(java.lang.CharSequence value) {
    this.uuid = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public java.lang.CharSequence getVersion() {
    return version;
  }


  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.CharSequence value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'build' field.
   * @return The value of the 'build' field.
   */
  public java.lang.CharSequence getBuild() {
    return build;
  }


  /**
   * Sets the value of the 'build' field.
   * @param value the value to set.
   */
  public void setBuild(java.lang.CharSequence value) {
    this.build = value;
  }

  /**
   * Creates a new Mvn RecordBuilder.
   * @return A new Mvn RecordBuilder
   */
  public static com.mei.ergosurgeon.schema.entities.Mvn.Builder newBuilder() {
    return new com.mei.ergosurgeon.schema.entities.Mvn.Builder();
  }

  /**
   * Creates a new Mvn RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Mvn RecordBuilder
   */
  public static com.mei.ergosurgeon.schema.entities.Mvn.Builder newBuilder(com.mei.ergosurgeon.schema.entities.Mvn.Builder other) {
    if (other == null) {
      return new com.mei.ergosurgeon.schema.entities.Mvn.Builder();
    } else {
      return new com.mei.ergosurgeon.schema.entities.Mvn.Builder(other);
    }
  }

  /**
   * Creates a new Mvn RecordBuilder by copying an existing Mvn instance.
   * @param other The existing instance to copy.
   * @return A new Mvn RecordBuilder
   */
  public static com.mei.ergosurgeon.schema.entities.Mvn.Builder newBuilder(com.mei.ergosurgeon.schema.entities.Mvn other) {
    if (other == null) {
      return new com.mei.ergosurgeon.schema.entities.Mvn.Builder();
    } else {
      return new com.mei.ergosurgeon.schema.entities.Mvn.Builder(other);
    }
  }

  /**
   * RecordBuilder for Mvn instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Mvn>
    implements org.apache.avro.data.RecordBuilder<Mvn> {

    private java.lang.CharSequence email;
    private java.lang.CharSequence uuid;
    private long id;
    private java.lang.CharSequence version;
    private java.lang.CharSequence build;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.mei.ergosurgeon.schema.entities.Mvn.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.email)) {
        this.email = data().deepCopy(fields()[0].schema(), other.email);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.uuid)) {
        this.uuid = data().deepCopy(fields()[1].schema(), other.uuid);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.id)) {
        this.id = data().deepCopy(fields()[2].schema(), other.id);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.version)) {
        this.version = data().deepCopy(fields()[3].schema(), other.version);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.build)) {
        this.build = data().deepCopy(fields()[4].schema(), other.build);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Mvn instance
     * @param other The existing instance to copy.
     */
    private Builder(com.mei.ergosurgeon.schema.entities.Mvn other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.email)) {
        this.email = data().deepCopy(fields()[0].schema(), other.email);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.uuid)) {
        this.uuid = data().deepCopy(fields()[1].schema(), other.uuid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.id)) {
        this.id = data().deepCopy(fields()[2].schema(), other.id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.version)) {
        this.version = data().deepCopy(fields()[3].schema(), other.version);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.build)) {
        this.build = data().deepCopy(fields()[4].schema(), other.build);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }


    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public com.mei.ergosurgeon.schema.entities.Mvn.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.email = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public com.mei.ergosurgeon.schema.entities.Mvn.Builder clearEmail() {
      email = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'uuid' field.
      * @return The value.
      */
    public java.lang.CharSequence getUuid() {
      return uuid;
    }


    /**
      * Sets the value of the 'uuid' field.
      * @param value The value of 'uuid'.
      * @return This builder.
      */
    public com.mei.ergosurgeon.schema.entities.Mvn.Builder setUuid(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.uuid = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'uuid' field has been set.
      * @return True if the 'uuid' field has been set, false otherwise.
      */
    public boolean hasUuid() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'uuid' field.
      * @return This builder.
      */
    public com.mei.ergosurgeon.schema.entities.Mvn.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.mei.ergosurgeon.schema.entities.Mvn.Builder setId(long value) {
      validate(fields()[2], value);
      this.id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.mei.ergosurgeon.schema.entities.Mvn.Builder clearId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public java.lang.CharSequence getVersion() {
      return version;
    }


    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public com.mei.ergosurgeon.schema.entities.Mvn.Builder setVersion(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.version = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public com.mei.ergosurgeon.schema.entities.Mvn.Builder clearVersion() {
      version = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'build' field.
      * @return The value.
      */
    public java.lang.CharSequence getBuild() {
      return build;
    }


    /**
      * Sets the value of the 'build' field.
      * @param value The value of 'build'.
      * @return This builder.
      */
    public com.mei.ergosurgeon.schema.entities.Mvn.Builder setBuild(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.build = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'build' field has been set.
      * @return True if the 'build' field has been set, false otherwise.
      */
    public boolean hasBuild() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'build' field.
      * @return This builder.
      */
    public com.mei.ergosurgeon.schema.entities.Mvn.Builder clearBuild() {
      build = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Mvn build() {
      try {
        Mvn record = new Mvn();
        record.email = fieldSetFlags()[0] ? this.email : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.uuid = fieldSetFlags()[1] ? this.uuid : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.id = fieldSetFlags()[2] ? this.id : (java.lang.Long) defaultValue(fields()[2]);
        record.version = fieldSetFlags()[3] ? this.version : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.build = fieldSetFlags()[4] ? this.build : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Mvn>
    WRITER$ = (org.apache.avro.io.DatumWriter<Mvn>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Mvn>
    READER$ = (org.apache.avro.io.DatumReader<Mvn>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.email);

    out.writeString(this.uuid);

    out.writeLong(this.id);

    out.writeString(this.version);

    out.writeString(this.build);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);

      this.uuid = in.readString(this.uuid instanceof Utf8 ? (Utf8)this.uuid : null);

      this.id = in.readLong();

      this.version = in.readString(this.version instanceof Utf8 ? (Utf8)this.version : null);

      this.build = in.readString(this.build instanceof Utf8 ? (Utf8)this.build : null);

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
          break;

        case 1:
          this.uuid = in.readString(this.uuid instanceof Utf8 ? (Utf8)this.uuid : null);
          break;

        case 2:
          this.id = in.readLong();
          break;

        case 3:
          this.version = in.readString(this.version instanceof Utf8 ? (Utf8)this.version : null);
          break;

        case 4:
          this.build = in.readString(this.build instanceof Utf8 ? (Utf8)this.build : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










