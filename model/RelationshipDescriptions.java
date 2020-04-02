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
 * RelationshipDescriptions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T09:57:33.700Z")

public class RelationshipDescriptions   {
  /**
   * Gets or Sets description
   */
  public enum DescriptionEnum {
    COWORKER_SOME_ONE_YOU_WORK_WITH_PERIODICALLY_YOU_BOTH_PERFORM_TASKS_FOR_SAME_EMPLOYER_OR_ORGANIZATION_COULD_BE_A_MANAGER_OR_SUBORDINATE_("coworker - Some one you work with periodically. You both perform tasks for same employer or organization. Could be a manager or subordinate."),
    
    CLASSMATE("classmate"),
    
    CUSTOMER_CLIENT_A_PERSON_WHOM_YOU_PROVIDE_SERVICES_FOR_WHICH_YOU_OR_SOMEONE_ELSE_GETS_A_MONETARY_BENEFIT("customer/client - A person whom you provide services for which you or someone else gets a monetary benefit"),
    
    COINHABITANT_SOMEONE_YOU_LIVE_WITH("coinhabitant - Someone you live with"),
    
    STRANGER_SOMEONE_YOU_DON_T_KNOW_AND_YOU_DON_T_KNOW_A_MEANINGFUL_RELATIONSHIP_WITH("stranger - Someone you don't know and you don't know a meaningful relationship with"),
    
    FAMILY("family"),
    
    FRIEND_PEER_NEIGHBOR_A_FRIEND_OF_ANY_TYPE_SUCH_AS_ACQUAINTENCE_OR_CLOSE_A_PERSON_WHO_BELONGS_TO_THE_SAME_CLUB_GROUP_OR_ORGANIZATION_SOMEONE_WHO_LIVES_NEAR_YOU_("friend/peer/neighbor - A friend of any type, such as acquaintence or close. A person who belongs to the same club, group or organization. Someone who lives near you.");

    private String value;

    DescriptionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DescriptionEnum fromValue(String text) {
      for (DescriptionEnum b : DescriptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("description")
  private DescriptionEnum description = null;

  public RelationshipDescriptions description(DescriptionEnum description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public DescriptionEnum getDescription() {
    return description;
  }

  public void setDescription(DescriptionEnum description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipDescriptions relationshipDescriptions = (RelationshipDescriptions) o;
    return Objects.equals(this.description, relationshipDescriptions.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipDescriptions {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

