// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/wrappers.proto

package com.google.protobuf;

/**
 * <pre>
 * Wrapper message for `bytes`.
 * The JSON representation for `BytesValue` is JSON string.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.BytesValue}
 */
public  final class BytesValue extends
    com.google.protobuf.GeneratedMessageLite<
        BytesValue, BytesValue.Builder> implements
    // @@protoc_insertion_point(message_implements:google.protobuf.BytesValue)
    BytesValueOrBuilder {
  private BytesValue() {
    value_ = com.google.protobuf.ByteString.EMPTY;
  }
  public static final int VALUE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString value_;
  /**
   * <pre>
   * The bytes value.
   * </pre>
   *
   * <code>optional bytes value = 1;</code>
   */
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }
  /**
   * <pre>
   * The bytes value.
   * </pre>
   *
   * <code>optional bytes value = 1;</code>
   */
  private void setValue(com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    value_ = value;
  }
  /**
   * <pre>
   * The bytes value.
   * </pre>
   *
   * <code>optional bytes value = 1;</code>
   */
  private void clearValue() {
    
    value_ = getDefaultInstance().getValue();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!value_.isEmpty()) {
      output.writeBytes(1, value_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, value_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.protobuf.BytesValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.BytesValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.BytesValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.BytesValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.BytesValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.BytesValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.BytesValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.BytesValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.BytesValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.BytesValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.BytesValue prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Wrapper message for `bytes`.
   * The JSON representation for `BytesValue` is JSON string.
   * </pre>
   *
   * Protobuf type {@code google.protobuf.BytesValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.protobuf.BytesValue, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.BytesValue)
      com.google.protobuf.BytesValueOrBuilder {
    // Construct using com.google.protobuf.BytesValue.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>optional bytes value = 1;</code>
     */
    public com.google.protobuf.ByteString getValue() {
      return instance.getValue();
    }
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>optional bytes value = 1;</code>
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
    }
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>optional bytes value = 1;</code>
     */
    public Builder clearValue() {
      copyOnWrite();
      instance.clearValue();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.BytesValue)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.protobuf.BytesValue();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.protobuf.BytesValue other = (com.google.protobuf.BytesValue) arg1;
        value_ = visitor.visitByteString(value_ != com.google.protobuf.ByteString.EMPTY, value_,
            other.value_ != com.google.protobuf.ByteString.EMPTY, other.value_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
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

                value_ = input.readBytes();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.protobuf.BytesValue.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.protobuf.BytesValue)
  private static final com.google.protobuf.BytesValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BytesValue();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.protobuf.BytesValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<BytesValue> PARSER;

  public static com.google.protobuf.Parser<BytesValue> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

