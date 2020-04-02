package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contributor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T09:57:33.700Z")

public class Contributor   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("zipcode")
  private Integer zipcode = null;

  @JsonProperty("age")
  private Integer age = null;

  public Contributor email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Contributor zipcode(Integer zipcode) {
    this.zipcode = zipcode;
    return this;
  }

  /**
   * Get zipcode
   * @return zipcode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getZipcode() {
    return zipcode;
  }

  public void setZipcode(Integer zipcode) {
    this.zipcode = zipcode;
  }

  public Contributor age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contributor contributor = (Contributor) o;
    return Objects.equals(this.email, contributor.email) &&
        Objects.equals(this.zipcode, contributor.zipcode) &&
        Objects.equals(this.age, contributor.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, zipcode, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contributor {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

