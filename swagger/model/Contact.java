package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contact
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T09:57:33.700Z")

public class Contact   {
  @JsonProperty("amount")
  private Long amount = null;

  /**
   * The length of time of the contact
   */
  public enum DurationEnum {
    _1_MINUTES("< 1 minutes"),
    
    _2_5_MINUTES("2 - 5 minutes"),
    
    _5_10_MINUTES("5 - 10 minutes"),
    
    _11_20_MINUTES("11 - 20 minutes"),
    
    _20_MINUTES("> 20 minutes");

    private String value;

    DurationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DurationEnum fromValue(String text) {
      for (DurationEnum b : DurationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("duration")
  private DurationEnum duration = null;

  /**
   * The relationship the contributor had with the contacts
   */
  public enum KindEnum {
    COWORKER("coworker"),
    
    COINHABITANT("coinhabitant"),
    
    CLASSMATE("classmate"),
    
    CUSTOMER_CLIENT("customer/client"),
    
    STRANGER("stranger"),
    
    FAMILY("family"),
    
    FRIEND_PEER_NEIGHBOR("friend/peer/neighbor");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static KindEnum fromValue(String text) {
      for (KindEnum b : KindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("kind")
  private KindEnum kind = null;

  public Contact amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Number of people contacted
   * minimum: 0
   * maximum: 100000
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Number of people contacted")
  @NotNull

@Min(0L) @Max(100000L) 
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Contact duration(DurationEnum duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The length of time of the contact
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "The length of time of the contact")
  @NotNull


  public DurationEnum getDuration() {
    return duration;
  }

  public void setDuration(DurationEnum duration) {
    this.duration = duration;
  }

  public Contact kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The relationship the contributor had with the contacts
   * @return kind
  **/
  @ApiModelProperty(value = "The relationship the contributor had with the contacts")


  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.amount, contact.amount) &&
        Objects.equals(this.duration, contact.duration) &&
        Objects.equals(this.kind, contact.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, duration, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

