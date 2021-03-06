// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: src/main/resources//wire_message.proto
package org.sterl.wire;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.ENUM;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.ONE_OF;
import static com.squareup.wire.Message.Label.REPEATED;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class RequestMessage extends Message {
  private static final long serialVersionUID = 0L;

  public static final MessageType DEFAULT_TYPE = MessageType.MOVE;
  public static final String DEFAULT_MESSAGE1 = "";
  public static final String DEFAULT_MESSAGE2 = "";
  public static final List<MoveData> DEFAULT_MOVEMENTS = Collections.emptyList();

  @ProtoField(tag = 1, type = ENUM, label = REQUIRED)
  public final MessageType type;

  @ProtoField(tag = 5, type = STRING)
  public final String message1;

  @ProtoField(tag = 6, type = STRING)
  public final String message2;

  @ProtoField(tag = 7, label = REPEATED, messageType = MoveData.class)
  public final List<MoveData> movements;

  @ProtoField(tag = 2, label = ONE_OF)
  public final MoveData moveData;

  @ProtoField(tag = 3, label = ONE_OF)
  public final TurnData turnData;

  @ProtoField(tag = 4, label = ONE_OF)
  public final JumpData jumpData;

  public RequestMessage(MessageType type, String message1, String message2, List<MoveData> movements, MoveData moveData, TurnData turnData, JumpData jumpData) {
    this.type = type;
    this.message1 = message1;
    this.message2 = message2;
    this.movements = immutableCopyOf(movements);
    this.moveData = moveData;
    this.turnData = turnData;
    this.jumpData = jumpData;
  }

  private RequestMessage(Builder builder) {
    this(builder.type, builder.message1, builder.message2, builder.movements, builder.moveData, builder.turnData, builder.jumpData);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RequestMessage)) return false;
    RequestMessage o = (RequestMessage) other;
    return equals(type, o.type)
        && equals(message1, o.message1)
        && equals(message2, o.message2)
        && equals(movements, o.movements)
        && equals(moveData, o.moveData)
        && equals(turnData, o.turnData)
        && equals(jumpData, o.jumpData);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = type != null ? type.hashCode() : 0;
      result = result * 37 + (message1 != null ? message1.hashCode() : 0);
      result = result * 37 + (message2 != null ? message2.hashCode() : 0);
      result = result * 37 + (movements != null ? movements.hashCode() : 1);
      result = result * 37 + (moveData != null ? moveData.hashCode() : 0);
      result = result * 37 + (turnData != null ? turnData.hashCode() : 0);
      result = result * 37 + (jumpData != null ? jumpData.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<RequestMessage> {

    public MessageType type;
    public String message1;
    public String message2;
    public List<MoveData> movements;
    public MoveData moveData;
    public TurnData turnData;
    public JumpData jumpData;

    public Builder() {
    }

    public Builder(RequestMessage message) {
      super(message);
      if (message == null) return;
      this.type = message.type;
      this.message1 = message.message1;
      this.message2 = message.message2;
      this.movements = copyOf(message.movements);
      this.moveData = message.moveData;
      this.turnData = message.turnData;
      this.jumpData = message.jumpData;
    }

    public Builder type(MessageType type) {
      this.type = type;
      return this;
    }

    public Builder message1(String message1) {
      this.message1 = message1;
      return this;
    }

    public Builder message2(String message2) {
      this.message2 = message2;
      return this;
    }

    public Builder movements(List<MoveData> movements) {
      this.movements = checkForNulls(movements);
      return this;
    }

    public Builder moveData(MoveData moveData) {
      this.moveData = moveData;

      this.turnData = null;
      this.jumpData = null;
      return this;
    }

    public Builder turnData(TurnData turnData) {
      this.turnData = turnData;

      this.moveData = null;
      this.jumpData = null;
      return this;
    }

    public Builder jumpData(JumpData jumpData) {
      this.jumpData = jumpData;

      this.moveData = null;
      this.turnData = null;
      return this;
    }

    @Override
    public RequestMessage build() {
      checkRequiredFields();
      return new RequestMessage(this);
    }
  }

  public enum MessageType
      implements ProtoEnum {
    MOVE(0),
    STOP(1),
    TURN(2),
    JUMP(3);

    private final int value;

    MessageType(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  /**
   * movement data
   */
  public static final class MoveData extends Message {
    private static final long serialVersionUID = 0L;

    public static final Integer DEFAULT_SPEED = 500;
    public static final String DEFAULT_DESTINATION = "";

    /**
     * how fast the move
     */
    @ProtoField(tag = 1, type = INT32, label = REQUIRED)
    public final Integer speed;

    @ProtoField(tag = 2, type = STRING)
    public final String destination;

    public MoveData(Integer speed, String destination) {
      this.speed = speed;
      this.destination = destination;
    }

    private MoveData(Builder builder) {
      this(builder.speed, builder.destination);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof MoveData)) return false;
      MoveData o = (MoveData) other;
      return equals(speed, o.speed)
          && equals(destination, o.destination);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      if (result == 0) {
        result = speed != null ? speed.hashCode() : 0;
        result = result * 37 + (destination != null ? destination.hashCode() : 0);
        hashCode = result;
      }
      return result;
    }

    public static final class Builder extends Message.Builder<MoveData> {

      public Integer speed;
      public String destination;

      public Builder() {
      }

      public Builder(MoveData message) {
        super(message);
        if (message == null) return;
        this.speed = message.speed;
        this.destination = message.destination;
      }

      /**
       * how fast the move
       */
      public Builder speed(Integer speed) {
        this.speed = speed;
        return this;
      }

      public Builder destination(String destination) {
        this.destination = destination;
        return this;
      }

      @Override
      public MoveData build() {
        checkRequiredFields();
        return new MoveData(this);
      }
    }
  }

  /**
   * turn data
   */
  public static final class TurnData extends Message {
    private static final long serialVersionUID = 0L;

    public static final Integer DEFAULT_ANGLE = 90;

    /**
     * the angle to do
     */
    @ProtoField(tag = 1, type = INT32, label = REQUIRED)
    public final Integer angle;

    public TurnData(Integer angle) {
      this.angle = angle;
    }

    private TurnData(Builder builder) {
      this(builder.angle);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof TurnData)) return false;
      return equals(angle, ((TurnData) other).angle);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      return result != 0 ? result : (hashCode = angle != null ? angle.hashCode() : 0);
    }

    public static final class Builder extends Message.Builder<TurnData> {

      public Integer angle;

      public Builder() {
      }

      public Builder(TurnData message) {
        super(message);
        if (message == null) return;
        this.angle = message.angle;
      }

      /**
       * the angle to do
       */
      public Builder angle(Integer angle) {
        this.angle = angle;
        return this;
      }

      @Override
      public TurnData build() {
        checkRequiredFields();
        return new TurnData(this);
      }
    }
  }

  public static final class JumpData extends Message {
    private static final long serialVersionUID = 0L;

    public static final Integer DEFAULT_HOWHIGH = 10;
    public static final Integer DEFAULT_HOWFAR = 10;
    public static final String DEFAULT_DESTINATION = "";

    /**
     * how high in cm
     */
    @ProtoField(tag = 1, type = INT32, label = REQUIRED)
    public final Integer howHigh;

    /**
     * how far in cm
     */
    @ProtoField(tag = 2, type = INT32, label = REQUIRED)
    public final Integer howFar;

    @ProtoField(tag = 3, type = STRING)
    public final String destination;

    public JumpData(Integer howHigh, Integer howFar, String destination) {
      this.howHigh = howHigh;
      this.howFar = howFar;
      this.destination = destination;
    }

    private JumpData(Builder builder) {
      this(builder.howHigh, builder.howFar, builder.destination);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof JumpData)) return false;
      JumpData o = (JumpData) other;
      return equals(howHigh, o.howHigh)
          && equals(howFar, o.howFar)
          && equals(destination, o.destination);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      if (result == 0) {
        result = howHigh != null ? howHigh.hashCode() : 0;
        result = result * 37 + (howFar != null ? howFar.hashCode() : 0);
        result = result * 37 + (destination != null ? destination.hashCode() : 0);
        hashCode = result;
      }
      return result;
    }

    public static final class Builder extends Message.Builder<JumpData> {

      public Integer howHigh;
      public Integer howFar;
      public String destination;

      public Builder() {
      }

      public Builder(JumpData message) {
        super(message);
        if (message == null) return;
        this.howHigh = message.howHigh;
        this.howFar = message.howFar;
        this.destination = message.destination;
      }

      /**
       * how high in cm
       */
      public Builder howHigh(Integer howHigh) {
        this.howHigh = howHigh;
        return this;
      }

      /**
       * how far in cm
       */
      public Builder howFar(Integer howFar) {
        this.howFar = howFar;
        return this;
      }

      public Builder destination(String destination) {
        this.destination = destination;
        return this;
      }

      @Override
      public JumpData build() {
        checkRequiredFields();
        return new JumpData(this);
      }
    }
  }
}
