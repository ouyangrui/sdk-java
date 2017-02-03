// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/tools/geoip/geoip.proto

package com.v2ray.core.tools.geoip;

/**
 * Protobuf type {@code v2ray.core.tools.geoip.CountryIPRange}
 */
public  final class CountryIPRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.tools.geoip.CountryIPRange)
    CountryIPRangeOrBuilder {
  // Use CountryIPRange.newBuilder() to construct.
  private CountryIPRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CountryIPRange() {
    ips_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CountryIPRange(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              ips_ = new java.util.ArrayList<com.v2ray.core.app.router.CIDR>();
              mutable_bitField0_ |= 0x00000001;
            }
            ips_.add(
                input.readMessage(com.v2ray.core.app.router.CIDR.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        ips_ = java.util.Collections.unmodifiableList(ips_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.tools.geoip.Geoip.internal_static_v2ray_core_tools_geoip_CountryIPRange_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.tools.geoip.Geoip.internal_static_v2ray_core_tools_geoip_CountryIPRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.tools.geoip.CountryIPRange.class, com.v2ray.core.tools.geoip.CountryIPRange.Builder.class);
  }

  public static final int IPS_FIELD_NUMBER = 1;
  private java.util.List<com.v2ray.core.app.router.CIDR> ips_;
  /**
   * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
   */
  public java.util.List<com.v2ray.core.app.router.CIDR> getIpsList() {
    return ips_;
  }
  /**
   * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
   */
  public java.util.List<? extends com.v2ray.core.app.router.CIDROrBuilder> 
      getIpsOrBuilderList() {
    return ips_;
  }
  /**
   * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
   */
  public int getIpsCount() {
    return ips_.size();
  }
  /**
   * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
   */
  public com.v2ray.core.app.router.CIDR getIps(int index) {
    return ips_.get(index);
  }
  /**
   * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
   */
  public com.v2ray.core.app.router.CIDROrBuilder getIpsOrBuilder(
      int index) {
    return ips_.get(index);
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
    for (int i = 0; i < ips_.size(); i++) {
      output.writeMessage(1, ips_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ips_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ips_.get(i));
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
    if (!(obj instanceof com.v2ray.core.tools.geoip.CountryIPRange)) {
      return super.equals(obj);
    }
    com.v2ray.core.tools.geoip.CountryIPRange other = (com.v2ray.core.tools.geoip.CountryIPRange) obj;

    boolean result = true;
    result = result && getIpsList()
        .equals(other.getIpsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getIpsCount() > 0) {
      hash = (37 * hash) + IPS_FIELD_NUMBER;
      hash = (53 * hash) + getIpsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.tools.geoip.CountryIPRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.tools.geoip.CountryIPRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.tools.geoip.CountryIPRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.tools.geoip.CountryIPRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.tools.geoip.CountryIPRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.tools.geoip.CountryIPRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.tools.geoip.CountryIPRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.tools.geoip.CountryIPRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.tools.geoip.CountryIPRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.tools.geoip.CountryIPRange parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.tools.geoip.CountryIPRange prototype) {
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
   * Protobuf type {@code v2ray.core.tools.geoip.CountryIPRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.tools.geoip.CountryIPRange)
      com.v2ray.core.tools.geoip.CountryIPRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.tools.geoip.Geoip.internal_static_v2ray_core_tools_geoip_CountryIPRange_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.tools.geoip.Geoip.internal_static_v2ray_core_tools_geoip_CountryIPRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.tools.geoip.CountryIPRange.class, com.v2ray.core.tools.geoip.CountryIPRange.Builder.class);
    }

    // Construct using com.v2ray.core.tools.geoip.CountryIPRange.newBuilder()
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
        getIpsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (ipsBuilder_ == null) {
        ips_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ipsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.tools.geoip.Geoip.internal_static_v2ray_core_tools_geoip_CountryIPRange_descriptor;
    }

    public com.v2ray.core.tools.geoip.CountryIPRange getDefaultInstanceForType() {
      return com.v2ray.core.tools.geoip.CountryIPRange.getDefaultInstance();
    }

    public com.v2ray.core.tools.geoip.CountryIPRange build() {
      com.v2ray.core.tools.geoip.CountryIPRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.tools.geoip.CountryIPRange buildPartial() {
      com.v2ray.core.tools.geoip.CountryIPRange result = new com.v2ray.core.tools.geoip.CountryIPRange(this);
      int from_bitField0_ = bitField0_;
      if (ipsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          ips_ = java.util.Collections.unmodifiableList(ips_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ips_ = ips_;
      } else {
        result.ips_ = ipsBuilder_.build();
      }
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
      if (other instanceof com.v2ray.core.tools.geoip.CountryIPRange) {
        return mergeFrom((com.v2ray.core.tools.geoip.CountryIPRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.tools.geoip.CountryIPRange other) {
      if (other == com.v2ray.core.tools.geoip.CountryIPRange.getDefaultInstance()) return this;
      if (ipsBuilder_ == null) {
        if (!other.ips_.isEmpty()) {
          if (ips_.isEmpty()) {
            ips_ = other.ips_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIpsIsMutable();
            ips_.addAll(other.ips_);
          }
          onChanged();
        }
      } else {
        if (!other.ips_.isEmpty()) {
          if (ipsBuilder_.isEmpty()) {
            ipsBuilder_.dispose();
            ipsBuilder_ = null;
            ips_ = other.ips_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ipsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIpsFieldBuilder() : null;
          } else {
            ipsBuilder_.addAllMessages(other.ips_);
          }
        }
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
      com.v2ray.core.tools.geoip.CountryIPRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.tools.geoip.CountryIPRange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.v2ray.core.app.router.CIDR> ips_ =
      java.util.Collections.emptyList();
    private void ensureIpsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ips_ = new java.util.ArrayList<com.v2ray.core.app.router.CIDR>(ips_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.app.router.CIDR, com.v2ray.core.app.router.CIDR.Builder, com.v2ray.core.app.router.CIDROrBuilder> ipsBuilder_;

    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public java.util.List<com.v2ray.core.app.router.CIDR> getIpsList() {
      if (ipsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ips_);
      } else {
        return ipsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public int getIpsCount() {
      if (ipsBuilder_ == null) {
        return ips_.size();
      } else {
        return ipsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public com.v2ray.core.app.router.CIDR getIps(int index) {
      if (ipsBuilder_ == null) {
        return ips_.get(index);
      } else {
        return ipsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public Builder setIps(
        int index, com.v2ray.core.app.router.CIDR value) {
      if (ipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIpsIsMutable();
        ips_.set(index, value);
        onChanged();
      } else {
        ipsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public Builder setIps(
        int index, com.v2ray.core.app.router.CIDR.Builder builderForValue) {
      if (ipsBuilder_ == null) {
        ensureIpsIsMutable();
        ips_.set(index, builderForValue.build());
        onChanged();
      } else {
        ipsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public Builder addIps(com.v2ray.core.app.router.CIDR value) {
      if (ipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIpsIsMutable();
        ips_.add(value);
        onChanged();
      } else {
        ipsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public Builder addIps(
        int index, com.v2ray.core.app.router.CIDR value) {
      if (ipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIpsIsMutable();
        ips_.add(index, value);
        onChanged();
      } else {
        ipsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public Builder addIps(
        com.v2ray.core.app.router.CIDR.Builder builderForValue) {
      if (ipsBuilder_ == null) {
        ensureIpsIsMutable();
        ips_.add(builderForValue.build());
        onChanged();
      } else {
        ipsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public Builder addIps(
        int index, com.v2ray.core.app.router.CIDR.Builder builderForValue) {
      if (ipsBuilder_ == null) {
        ensureIpsIsMutable();
        ips_.add(index, builderForValue.build());
        onChanged();
      } else {
        ipsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public Builder addAllIps(
        java.lang.Iterable<? extends com.v2ray.core.app.router.CIDR> values) {
      if (ipsBuilder_ == null) {
        ensureIpsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ips_);
        onChanged();
      } else {
        ipsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public Builder clearIps() {
      if (ipsBuilder_ == null) {
        ips_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ipsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public Builder removeIps(int index) {
      if (ipsBuilder_ == null) {
        ensureIpsIsMutable();
        ips_.remove(index);
        onChanged();
      } else {
        ipsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public com.v2ray.core.app.router.CIDR.Builder getIpsBuilder(
        int index) {
      return getIpsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public com.v2ray.core.app.router.CIDROrBuilder getIpsOrBuilder(
        int index) {
      if (ipsBuilder_ == null) {
        return ips_.get(index);  } else {
        return ipsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public java.util.List<? extends com.v2ray.core.app.router.CIDROrBuilder> 
         getIpsOrBuilderList() {
      if (ipsBuilder_ != null) {
        return ipsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ips_);
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public com.v2ray.core.app.router.CIDR.Builder addIpsBuilder() {
      return getIpsFieldBuilder().addBuilder(
          com.v2ray.core.app.router.CIDR.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public com.v2ray.core.app.router.CIDR.Builder addIpsBuilder(
        int index) {
      return getIpsFieldBuilder().addBuilder(
          index, com.v2ray.core.app.router.CIDR.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.app.router.CIDR ips = 1;</code>
     */
    public java.util.List<com.v2ray.core.app.router.CIDR.Builder> 
         getIpsBuilderList() {
      return getIpsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.app.router.CIDR, com.v2ray.core.app.router.CIDR.Builder, com.v2ray.core.app.router.CIDROrBuilder> 
        getIpsFieldBuilder() {
      if (ipsBuilder_ == null) {
        ipsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.v2ray.core.app.router.CIDR, com.v2ray.core.app.router.CIDR.Builder, com.v2ray.core.app.router.CIDROrBuilder>(
                ips_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        ips_ = null;
      }
      return ipsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.tools.geoip.CountryIPRange)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.tools.geoip.CountryIPRange)
  private static final com.v2ray.core.tools.geoip.CountryIPRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.tools.geoip.CountryIPRange();
  }

  public static com.v2ray.core.tools.geoip.CountryIPRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CountryIPRange>
      PARSER = new com.google.protobuf.AbstractParser<CountryIPRange>() {
    public CountryIPRange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CountryIPRange(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CountryIPRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CountryIPRange> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.tools.geoip.CountryIPRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
