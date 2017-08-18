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
 * ImportJobOutputResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-18T11:17:24.388-04:00")
public class ImportJobOutputResource {
  @SerializedName("description")
  private String description = null;

  @SerializedName("line_number")
  private Long lineNumber = null;

  public ImportJobOutputResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the import job
   * @return description
  **/
  @ApiModelProperty(value = "The description of the import job")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ImportJobOutputResource lineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * The line number of the import job
   * @return lineNumber
  **/
  @ApiModelProperty(value = "The line number of the import job")
  public Long getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportJobOutputResource importJobOutputResource = (ImportJobOutputResource) o;
    return Objects.equals(this.description, importJobOutputResource.description) &&
        Objects.equals(this.lineNumber, importJobOutputResource.lineNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, lineNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportJobOutputResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
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

