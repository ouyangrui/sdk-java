// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/headers/http/config.proto

package com.v2ray.core.transport.internet.headers.http;

/**
 * Protobuf type {@code v2ray.core.transport.internet.headers.http.Header}
 */
public  final class Header extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.headers.http.Header)
    HeaderOrBuilder {
  // Use Header.newBuilder() to construct.
  private Header(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Header() {
    name_ = "";
    value_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Header(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              value_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            value_.add(s);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        value_ = value_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.transport.internet.headers.http.ConfigOuterClass.internal_static_v2ray_core_transport_internet_headers_http_Header_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.headers.http.ConfigOuterClass.internal_static_v2ray_core_transport_internet_headers_http_Header_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.transport.internet.headers.http.Header.class, com.v2ray.core.transport.internet.headers.http.Header.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * "Accept", "Cookie", etc
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * "Accept", "Cookie", etc
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList value_;
  /**
   * <pre>
   * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
   * </pre>
   *
   * <code>repeated string value = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getValueList() {
    return value_;
  }
  /**
   * <pre>
   * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
   * </pre>
   *
   * <code>repeated string value = 2;</code>
   */
  public int getValueCount() {
    return value_.size();
  }
  /**
   * <pre>
   * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
   * </pre>
   *
   * <code>repeated string value = 2;</code>
   */
  public java.lang.String getValue(int index) {
    return value_.get(index);
  }
  /**
   * <pre>
   * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
   * </pre>
   *
   * <code>repeated string value = 2;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes(int index) {
    return value_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < value_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < value_.size(); i++) {
        dataSize += computeStringSizeNoTag(value_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getValueList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.v2ray.core.transport.internet.headers.http.Header)) {
      return super.equals(obj);
    }
    com.v2ray.core.transport.internet.headers.http.Header other = (com.v2ray.core.transport.internet.headers.http.Header) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getValueList()
        .equals(other.getValueList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getValueCount() > 0) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValueList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.transport.internet.headers.http.Header parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.headers.http.Header parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.http.Header parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.headers.http.Header parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.http.Header parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.headers.http.Header parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.http.Header parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.headers.http.Header parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.http.Header parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.headers.http.Header parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.v2ray.core.transport.internet.headers.http.Header prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code v2ray.core.transport.internet.headers.http.Header}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.headers.http.Header)
      com.v2ray.core.transport.internet.headers.http.HeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.headers.http.ConfigOuterClass.internal_static_v2ray_core_transport_internet_headers_http_Header_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.headers.http.ConfigOuterClass.internal_static_v2ray_core_transport_internet_headers_http_Header_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.transport.internet.headers.http.Header.class, com.v2ray.core.transport.internet.headers.http.Header.Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.headers.http.Header.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      value_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.headers.http.ConfigOuterClass.internal_static_v2ray_core_transport_internet_headers_http_Header_descriptor;
    }

    public com.v2ray.core.transport.internet.headers.http.Header getDefaultInstanceForType() {
      return com.v2ray.core.transport.internet.headers.http.Header.getDefaultInstance();
    }

    public com.v2ray.core.transport.internet.headers.http.Header build() {
      com.v2ray.core.transport.internet.headers.http.Header result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.transport.internet.headers.http.Header buildPartial() {
      com.v2ray.core.transport.internet.headers.http.Header result = new com.v2ray.core.transport.internet.headers.http.Header(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        value_ = value_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.value_ = value_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.v2ray.core.transport.internet.headers.http.Header) {
        return mergeFrom((com.v2ray.core.transport.internet.headers.http.Header)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.transport.internet.headers.http.Header other) {
      if (other == com.v2ray.core.transport.internet.headers.http.Header.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.value_.isEmpty()) {
        if (value_.isEmpty()) {
          value_ = other.value_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureValueIsMutable();
          value_.addAll(other.value_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.v2ray.core.transport.internet.headers.http.Header parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.transport.internet.headers.http.Header) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * "Accept", "Cookie", etc
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * "Accept", "Cookie", etc
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * "Accept", "Cookie", etc
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * "Accept", "Cookie", etc
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * "Accept", "Cookie", etc
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList value_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureValueIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        value_ = new com.google.protobuf.LazyStringArrayList(value_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getValueList() {
      return value_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     */
    public int getValueCount() {
      return value_.size();
    }
    /**
     * <pre>
     * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     */
    public java.lang.String getValue(int index) {
      return value_.get(index);
    }
    /**
     * <pre>
     * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes(int index) {
      return value_.getByteString(index);
    }
    /**
     * <pre>
     * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     */
    public Builder setValue(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValueIsMutable();
      value_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     */
    public Builder addValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValueIsMutable();
      value_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     */
    public Builder addAllValue(
        java.lang.Iterable<java.lang.String> values) {
      ensureValueIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, value_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     */
    public Builder clearValue() {
      value_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Each entry must be valid in one piece. Random entry will be chosen if multiple entries present.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     */
    public Builder addValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureValueIsMutable();
      value_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.headers.http.Header)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.headers.http.Header)
  private static final com.v2ray.core.transport.internet.headers.http.Header DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.transport.internet.headers.http.Header();
  }

  public static com.v2ray.core.transport.internet.headers.http.Header getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Header>
      PARSER = new com.google.protobuf.AbstractParser<Header>() {
    public Header parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Header(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Header> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Header> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.transport.internet.headers.http.Header getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

