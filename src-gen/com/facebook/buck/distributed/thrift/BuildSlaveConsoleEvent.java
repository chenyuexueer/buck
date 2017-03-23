/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-03-21")
public class BuildSlaveConsoleEvent implements org.apache.thrift.TBase<BuildSlaveConsoleEvent, BuildSlaveConsoleEvent._Fields>, java.io.Serializable, Cloneable, Comparable<BuildSlaveConsoleEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildSlaveConsoleEvent");

  private static final org.apache.thrift.protocol.TField RUN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("runId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SEVERITY_FIELD_DESC = new org.apache.thrift.protocol.TField("severity", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildSlaveConsoleEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildSlaveConsoleEventTupleSchemeFactory());
  }

  public com.facebook.buck.distributed.thrift.RunId runId; // optional
  public String message; // optional
  /**
   * 
   * @see ConsoleEventSeverity
   */
  public ConsoleEventSeverity severity; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RUN_ID((short)1, "runId"),
    MESSAGE((short)2, "message"),
    /**
     * 
     * @see ConsoleEventSeverity
     */
    SEVERITY((short)3, "severity");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RUN_ID
          return RUN_ID;
        case 2: // MESSAGE
          return MESSAGE;
        case 3: // SEVERITY
          return SEVERITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.RUN_ID,_Fields.MESSAGE,_Fields.SEVERITY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RUN_ID, new org.apache.thrift.meta_data.FieldMetaData("runId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.facebook.buck.distributed.thrift.RunId.class)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEVERITY, new org.apache.thrift.meta_data.FieldMetaData("severity", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ConsoleEventSeverity.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildSlaveConsoleEvent.class, metaDataMap);
  }

  public BuildSlaveConsoleEvent() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildSlaveConsoleEvent(BuildSlaveConsoleEvent other) {
    if (other.isSetRunId()) {
      this.runId = new com.facebook.buck.distributed.thrift.RunId(other.runId);
    }
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetSeverity()) {
      this.severity = other.severity;
    }
  }

  public BuildSlaveConsoleEvent deepCopy() {
    return new BuildSlaveConsoleEvent(this);
  }

  @Override
  public void clear() {
    this.runId = null;
    this.message = null;
    this.severity = null;
  }

  public com.facebook.buck.distributed.thrift.RunId getRunId() {
    return this.runId;
  }

  public BuildSlaveConsoleEvent setRunId(com.facebook.buck.distributed.thrift.RunId runId) {
    this.runId = runId;
    return this;
  }

  public void unsetRunId() {
    this.runId = null;
  }

  /** Returns true if field runId is set (has been assigned a value) and false otherwise */
  public boolean isSetRunId() {
    return this.runId != null;
  }

  public void setRunIdIsSet(boolean value) {
    if (!value) {
      this.runId = null;
    }
  }

  public String getMessage() {
    return this.message;
  }

  public BuildSlaveConsoleEvent setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  /**
   * 
   * @see ConsoleEventSeverity
   */
  public ConsoleEventSeverity getSeverity() {
    return this.severity;
  }

  /**
   * 
   * @see ConsoleEventSeverity
   */
  public BuildSlaveConsoleEvent setSeverity(ConsoleEventSeverity severity) {
    this.severity = severity;
    return this;
  }

  public void unsetSeverity() {
    this.severity = null;
  }

  /** Returns true if field severity is set (has been assigned a value) and false otherwise */
  public boolean isSetSeverity() {
    return this.severity != null;
  }

  public void setSeverityIsSet(boolean value) {
    if (!value) {
      this.severity = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RUN_ID:
      if (value == null) {
        unsetRunId();
      } else {
        setRunId((com.facebook.buck.distributed.thrift.RunId)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    case SEVERITY:
      if (value == null) {
        unsetSeverity();
      } else {
        setSeverity((ConsoleEventSeverity)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RUN_ID:
      return getRunId();

    case MESSAGE:
      return getMessage();

    case SEVERITY:
      return getSeverity();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RUN_ID:
      return isSetRunId();
    case MESSAGE:
      return isSetMessage();
    case SEVERITY:
      return isSetSeverity();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildSlaveConsoleEvent)
      return this.equals((BuildSlaveConsoleEvent)that);
    return false;
  }

  public boolean equals(BuildSlaveConsoleEvent that) {
    if (that == null)
      return false;

    boolean this_present_runId = true && this.isSetRunId();
    boolean that_present_runId = true && that.isSetRunId();
    if (this_present_runId || that_present_runId) {
      if (!(this_present_runId && that_present_runId))
        return false;
      if (!this.runId.equals(that.runId))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_severity = true && this.isSetSeverity();
    boolean that_present_severity = true && that.isSetSeverity();
    if (this_present_severity || that_present_severity) {
      if (!(this_present_severity && that_present_severity))
        return false;
      if (!this.severity.equals(that.severity))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_runId = true && (isSetRunId());
    list.add(present_runId);
    if (present_runId)
      list.add(runId);

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    boolean present_severity = true && (isSetSeverity());
    list.add(present_severity);
    if (present_severity)
      list.add(severity.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildSlaveConsoleEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRunId()).compareTo(other.isSetRunId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runId, other.runId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSeverity()).compareTo(other.isSetSeverity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeverity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.severity, other.severity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BuildSlaveConsoleEvent(");
    boolean first = true;

    if (isSetRunId()) {
      sb.append("runId:");
      if (this.runId == null) {
        sb.append("null");
      } else {
        sb.append(this.runId);
      }
      first = false;
    }
    if (isSetMessage()) {
      if (!first) sb.append(", ");
      sb.append("message:");
      if (this.message == null) {
        sb.append("null");
      } else {
        sb.append(this.message);
      }
      first = false;
    }
    if (isSetSeverity()) {
      if (!first) sb.append(", ");
      sb.append("severity:");
      if (this.severity == null) {
        sb.append("null");
      } else {
        sb.append(this.severity);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (runId != null) {
      runId.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildSlaveConsoleEventStandardSchemeFactory implements SchemeFactory {
    public BuildSlaveConsoleEventStandardScheme getScheme() {
      return new BuildSlaveConsoleEventStandardScheme();
    }
  }

  private static class BuildSlaveConsoleEventStandardScheme extends StandardScheme<BuildSlaveConsoleEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildSlaveConsoleEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RUN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.runId = new com.facebook.buck.distributed.thrift.RunId();
              struct.runId.read(iprot);
              struct.setRunIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEVERITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.severity = com.facebook.buck.distributed.thrift.ConsoleEventSeverity.findByValue(iprot.readI32());
              struct.setSeverityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildSlaveConsoleEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.runId != null) {
        if (struct.isSetRunId()) {
          oprot.writeFieldBegin(RUN_ID_FIELD_DESC);
          struct.runId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.message != null) {
        if (struct.isSetMessage()) {
          oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
          oprot.writeString(struct.message);
          oprot.writeFieldEnd();
        }
      }
      if (struct.severity != null) {
        if (struct.isSetSeverity()) {
          oprot.writeFieldBegin(SEVERITY_FIELD_DESC);
          oprot.writeI32(struct.severity.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildSlaveConsoleEventTupleSchemeFactory implements SchemeFactory {
    public BuildSlaveConsoleEventTupleScheme getScheme() {
      return new BuildSlaveConsoleEventTupleScheme();
    }
  }

  private static class BuildSlaveConsoleEventTupleScheme extends TupleScheme<BuildSlaveConsoleEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildSlaveConsoleEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRunId()) {
        optionals.set(0);
      }
      if (struct.isSetMessage()) {
        optionals.set(1);
      }
      if (struct.isSetSeverity()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRunId()) {
        struct.runId.write(oprot);
      }
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
      if (struct.isSetSeverity()) {
        oprot.writeI32(struct.severity.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildSlaveConsoleEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.runId = new com.facebook.buck.distributed.thrift.RunId();
        struct.runId.read(iprot);
        struct.setRunIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.severity = com.facebook.buck.distributed.thrift.ConsoleEventSeverity.findByValue(iprot.readI32());
        struct.setSeverityIsSet(true);
      }
    }
  }

}
