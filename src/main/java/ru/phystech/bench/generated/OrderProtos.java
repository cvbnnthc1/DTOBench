// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/ru/phystech/bench/Order.proto

package ru.phystech.bench.generated;

public final class OrderProtos {
  private OrderProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OrderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Order)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 orderID = 1;</code>
     * @return The orderID.
     */
    long getOrderID();

    /**
     * <code>int64 consumerID = 2;</code>
     * @return The consumerID.
     */
    long getConsumerID();

    /**
     * <code>repeated int64 positionsIDs = 3;</code>
     * @return A list containing the positionsIDs.
     */
    java.util.List<java.lang.Long> getPositionsIDsList();
    /**
     * <code>repeated int64 positionsIDs = 3;</code>
     * @return The count of positionsIDs.
     */
    int getPositionsIDsCount();
    /**
     * <code>repeated int64 positionsIDs = 3;</code>
     * @param index The index of the element to return.
     * @return The positionsIDs at the given index.
     */
    long getPositionsIDs(int index);

    /**
     * <code>int64 date = 4;</code>
     * @return The date.
     */
    long getDate();

    /**
     * <code>string description = 5;</code>
     * @return The description.
     */
    java.lang.String getDescription();
    /**
     * <code>string description = 5;</code>
     * @return The bytes for description.
     */
    com.google.protobuf.ByteString
        getDescriptionBytes();
  }
  /**
   * Protobuf type {@code Order}
   */
  public static final class Order extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Order)
      OrderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Order.newBuilder() to construct.
    private Order(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Order() {
      positionsIDs_ = emptyLongList();
      description_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Order();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Order(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              orderID_ = input.readInt64();
              break;
            }
            case 16: {

              consumerID_ = input.readInt64();
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                positionsIDs_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              positionsIDs_.addLong(input.readInt64());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                positionsIDs_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                positionsIDs_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            }
            case 32: {

              date_ = input.readInt64();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              description_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          positionsIDs_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.phystech.bench.generated.OrderProtos.internal_static_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.phystech.bench.generated.OrderProtos.internal_static_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.phystech.bench.generated.OrderProtos.Order.class, ru.phystech.bench.generated.OrderProtos.Order.Builder.class);
    }

    public static final int ORDERID_FIELD_NUMBER = 1;
    private long orderID_;
    /**
     * <code>int64 orderID = 1;</code>
     * @return The orderID.
     */
    @java.lang.Override
    public long getOrderID() {
      return orderID_;
    }

    public static final int CONSUMERID_FIELD_NUMBER = 2;
    private long consumerID_;
    /**
     * <code>int64 consumerID = 2;</code>
     * @return The consumerID.
     */
    @java.lang.Override
    public long getConsumerID() {
      return consumerID_;
    }

    public static final int POSITIONSIDS_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.LongList positionsIDs_;
    /**
     * <code>repeated int64 positionsIDs = 3;</code>
     * @return A list containing the positionsIDs.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getPositionsIDsList() {
      return positionsIDs_;
    }
    /**
     * <code>repeated int64 positionsIDs = 3;</code>
     * @return The count of positionsIDs.
     */
    public int getPositionsIDsCount() {
      return positionsIDs_.size();
    }
    /**
     * <code>repeated int64 positionsIDs = 3;</code>
     * @param index The index of the element to return.
     * @return The positionsIDs at the given index.
     */
    public long getPositionsIDs(int index) {
      return positionsIDs_.getLong(index);
    }
    private int positionsIDsMemoizedSerializedSize = -1;

    public static final int DATE_FIELD_NUMBER = 4;
    private long date_;
    /**
     * <code>int64 date = 4;</code>
     * @return The date.
     */
    @java.lang.Override
    public long getDate() {
      return date_;
    }

    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    private volatile java.lang.Object description_;
    /**
     * <code>string description = 5;</code>
     * @return The description.
     */
    @java.lang.Override
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      }
    }
    /**
     * <code>string description = 5;</code>
     * @return The bytes for description.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (orderID_ != 0L) {
        output.writeInt64(1, orderID_);
      }
      if (consumerID_ != 0L) {
        output.writeInt64(2, consumerID_);
      }
      if (getPositionsIDsList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(positionsIDsMemoizedSerializedSize);
      }
      for (int i = 0; i < positionsIDs_.size(); i++) {
        output.writeInt64NoTag(positionsIDs_.getLong(i));
      }
      if (date_ != 0L) {
        output.writeInt64(4, date_);
      }
      if (!getDescriptionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, description_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (orderID_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, orderID_);
      }
      if (consumerID_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, consumerID_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < positionsIDs_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(positionsIDs_.getLong(i));
        }
        size += dataSize;
        if (!getPositionsIDsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        positionsIDsMemoizedSerializedSize = dataSize;
      }
      if (date_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, date_);
      }
      if (!getDescriptionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, description_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ru.phystech.bench.generated.OrderProtos.Order)) {
        return super.equals(obj);
      }
      ru.phystech.bench.generated.OrderProtos.Order other = (ru.phystech.bench.generated.OrderProtos.Order) obj;

      if (getOrderID()
          != other.getOrderID()) return false;
      if (getConsumerID()
          != other.getConsumerID()) return false;
      if (!getPositionsIDsList()
          .equals(other.getPositionsIDsList())) return false;
      if (getDate()
          != other.getDate()) return false;
      if (!getDescription()
          .equals(other.getDescription())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ORDERID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOrderID());
      hash = (37 * hash) + CONSUMERID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getConsumerID());
      if (getPositionsIDsCount() > 0) {
        hash = (37 * hash) + POSITIONSIDS_FIELD_NUMBER;
        hash = (53 * hash) + getPositionsIDsList().hashCode();
      }
      hash = (37 * hash) + DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDate());
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ru.phystech.bench.generated.OrderProtos.Order parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ru.phystech.bench.generated.OrderProtos.Order parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ru.phystech.bench.generated.OrderProtos.Order parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ru.phystech.bench.generated.OrderProtos.Order parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ru.phystech.bench.generated.OrderProtos.Order parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ru.phystech.bench.generated.OrderProtos.Order parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ru.phystech.bench.generated.OrderProtos.Order parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ru.phystech.bench.generated.OrderProtos.Order parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ru.phystech.bench.generated.OrderProtos.Order parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ru.phystech.bench.generated.OrderProtos.Order parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ru.phystech.bench.generated.OrderProtos.Order parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ru.phystech.bench.generated.OrderProtos.Order parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ru.phystech.bench.generated.OrderProtos.Order prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code Order}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Order)
        ru.phystech.bench.generated.OrderProtos.OrderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ru.phystech.bench.generated.OrderProtos.internal_static_Order_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ru.phystech.bench.generated.OrderProtos.internal_static_Order_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ru.phystech.bench.generated.OrderProtos.Order.class, ru.phystech.bench.generated.OrderProtos.Order.Builder.class);
      }

      // Construct using ru.phystech.bench.generated.OrderProtos.Order.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        orderID_ = 0L;

        consumerID_ = 0L;

        positionsIDs_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        date_ = 0L;

        description_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ru.phystech.bench.generated.OrderProtos.internal_static_Order_descriptor;
      }

      @java.lang.Override
      public ru.phystech.bench.generated.OrderProtos.Order getDefaultInstanceForType() {
        return ru.phystech.bench.generated.OrderProtos.Order.getDefaultInstance();
      }

      @java.lang.Override
      public ru.phystech.bench.generated.OrderProtos.Order build() {
        ru.phystech.bench.generated.OrderProtos.Order result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ru.phystech.bench.generated.OrderProtos.Order buildPartial() {
        ru.phystech.bench.generated.OrderProtos.Order result = new ru.phystech.bench.generated.OrderProtos.Order(this);
        int from_bitField0_ = bitField0_;
        result.orderID_ = orderID_;
        result.consumerID_ = consumerID_;
        if (((bitField0_ & 0x00000001) != 0)) {
          positionsIDs_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.positionsIDs_ = positionsIDs_;
        result.date_ = date_;
        result.description_ = description_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ru.phystech.bench.generated.OrderProtos.Order) {
          return mergeFrom((ru.phystech.bench.generated.OrderProtos.Order)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ru.phystech.bench.generated.OrderProtos.Order other) {
        if (other == ru.phystech.bench.generated.OrderProtos.Order.getDefaultInstance()) return this;
        if (other.getOrderID() != 0L) {
          setOrderID(other.getOrderID());
        }
        if (other.getConsumerID() != 0L) {
          setConsumerID(other.getConsumerID());
        }
        if (!other.positionsIDs_.isEmpty()) {
          if (positionsIDs_.isEmpty()) {
            positionsIDs_ = other.positionsIDs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePositionsIDsIsMutable();
            positionsIDs_.addAll(other.positionsIDs_);
          }
          onChanged();
        }
        if (other.getDate() != 0L) {
          setDate(other.getDate());
        }
        if (!other.getDescription().isEmpty()) {
          description_ = other.description_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ru.phystech.bench.generated.OrderProtos.Order parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ru.phystech.bench.generated.OrderProtos.Order) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long orderID_ ;
      /**
       * <code>int64 orderID = 1;</code>
       * @return The orderID.
       */
      @java.lang.Override
      public long getOrderID() {
        return orderID_;
      }
      /**
       * <code>int64 orderID = 1;</code>
       * @param value The orderID to set.
       * @return This builder for chaining.
       */
      public Builder setOrderID(long value) {
        
        orderID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 orderID = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOrderID() {
        
        orderID_ = 0L;
        onChanged();
        return this;
      }

      private long consumerID_ ;
      /**
       * <code>int64 consumerID = 2;</code>
       * @return The consumerID.
       */
      @java.lang.Override
      public long getConsumerID() {
        return consumerID_;
      }
      /**
       * <code>int64 consumerID = 2;</code>
       * @param value The consumerID to set.
       * @return This builder for chaining.
       */
      public Builder setConsumerID(long value) {
        
        consumerID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 consumerID = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearConsumerID() {
        
        consumerID_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList positionsIDs_ = emptyLongList();
      private void ensurePositionsIDsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          positionsIDs_ = mutableCopy(positionsIDs_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int64 positionsIDs = 3;</code>
       * @return A list containing the positionsIDs.
       */
      public java.util.List<java.lang.Long>
          getPositionsIDsList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(positionsIDs_) : positionsIDs_;
      }
      /**
       * <code>repeated int64 positionsIDs = 3;</code>
       * @return The count of positionsIDs.
       */
      public int getPositionsIDsCount() {
        return positionsIDs_.size();
      }
      /**
       * <code>repeated int64 positionsIDs = 3;</code>
       * @param index The index of the element to return.
       * @return The positionsIDs at the given index.
       */
      public long getPositionsIDs(int index) {
        return positionsIDs_.getLong(index);
      }
      /**
       * <code>repeated int64 positionsIDs = 3;</code>
       * @param index The index to set the value at.
       * @param value The positionsIDs to set.
       * @return This builder for chaining.
       */
      public Builder setPositionsIDs(
          int index, long value) {
        ensurePositionsIDsIsMutable();
        positionsIDs_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 positionsIDs = 3;</code>
       * @param value The positionsIDs to add.
       * @return This builder for chaining.
       */
      public Builder addPositionsIDs(long value) {
        ensurePositionsIDsIsMutable();
        positionsIDs_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 positionsIDs = 3;</code>
       * @param values The positionsIDs to add.
       * @return This builder for chaining.
       */
      public Builder addAllPositionsIDs(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensurePositionsIDsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, positionsIDs_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 positionsIDs = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPositionsIDs() {
        positionsIDs_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private long date_ ;
      /**
       * <code>int64 date = 4;</code>
       * @return The date.
       */
      @java.lang.Override
      public long getDate() {
        return date_;
      }
      /**
       * <code>int64 date = 4;</code>
       * @param value The date to set.
       * @return This builder for chaining.
       */
      public Builder setDate(long value) {
        
        date_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 date = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDate() {
        
        date_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object description_ = "";
      /**
       * <code>string description = 5;</code>
       * @return The description.
       */
      public java.lang.String getDescription() {
        java.lang.Object ref = description_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          description_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string description = 5;</code>
       * @return The bytes for description.
       */
      public com.google.protobuf.ByteString
          getDescriptionBytes() {
        java.lang.Object ref = description_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          description_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string description = 5;</code>
       * @param value The description to set.
       * @return This builder for chaining.
       */
      public Builder setDescription(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        description_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string description = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDescription() {
        
        description_ = getDefaultInstance().getDescription();
        onChanged();
        return this;
      }
      /**
       * <code>string description = 5;</code>
       * @param value The bytes for description to set.
       * @return This builder for chaining.
       */
      public Builder setDescriptionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        description_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Order)
    }

    // @@protoc_insertion_point(class_scope:Order)
    private static final ru.phystech.bench.generated.OrderProtos.Order DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ru.phystech.bench.generated.OrderProtos.Order();
    }

    public static ru.phystech.bench.generated.OrderProtos.Order getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Order>
        PARSER = new com.google.protobuf.AbstractParser<Order>() {
      @java.lang.Override
      public Order parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Order(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Order> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Order> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ru.phystech.bench.generated.OrderProtos.Order getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Order_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Order_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+src/main/java/ru/phystech/bench/Order." +
      "proto\"e\n\005Order\022\017\n\007orderID\030\001 \001(\003\022\022\n\nconsu" +
      "merID\030\002 \001(\003\022\024\n\014positionsIDs\030\003 \003(\003\022\014\n\004dat" +
      "e\030\004 \001(\003\022\023\n\013description\030\005 \001(\tB*\n\033ru.physt" +
      "ech.bench.generatedB\013OrderProtosb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Order_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Order_descriptor,
        new java.lang.String[] { "OrderID", "ConsumerID", "PositionsIDs", "Date", "Description", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
