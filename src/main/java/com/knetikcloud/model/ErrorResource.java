/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ErrorResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:02:11.431-04:00")
public class ErrorResource {
  @SerializedName("details")
  private Object details = null;

  @SerializedName("field")
  private Object field = null;

  @SerializedName("message")
  private String message = null;

  public ErrorResource details(Object details) {
    this.details = details;
    return this;
  }

   /**
   * Extra details about the error, if needed
   * @return details
  **/
  @ApiModelProperty(value = "Extra details about the error, if needed")
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  public ErrorResource field(Object field) {
    this.field = field;
    return this;
  }

   /**
   * The JSON key the message pertains to
   * @return field
  **/
  @ApiModelProperty(value = "The JSON key the message pertains to")
  public Object getField() {
    return field;
  }

  public void setField(Object field) {
    this.field = field;
  }

   /**
   * The message explaining the error
   * @return message
  **/
  @ApiModelProperty(value = "The message explaining the error")
  public String getMessage() {
    return message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResource errorResource = (ErrorResource) o;
    return Objects.equals(this.details, errorResource.details) &&
        Objects.equals(this.field, errorResource.field) &&
        Objects.equals(this.message, errorResource.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, field, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResource {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

