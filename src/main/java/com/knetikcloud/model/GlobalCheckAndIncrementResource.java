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
import com.knetikcloud.model.ExpressionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GlobalCheckAndIncrementResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T16:24:46.936-04:00")
public class GlobalCheckAndIncrementResource {
  @SerializedName("check_value_resource")
  private ExpressionResource checkValueResource = null;

  @SerializedName("global_resource")
  private ExpressionResource globalResource = null;

  @SerializedName("type")
  private String type = null;

  public GlobalCheckAndIncrementResource checkValueResource(ExpressionResource checkValueResource) {
    this.checkValueResource = checkValueResource;
    return this;
  }

   /**
   * Get checkValueResource
   * @return checkValueResource
  **/
  @ApiModelProperty(value = "")
  public ExpressionResource getCheckValueResource() {
    return checkValueResource;
  }

  public void setCheckValueResource(ExpressionResource checkValueResource) {
    this.checkValueResource = checkValueResource;
  }

  public GlobalCheckAndIncrementResource globalResource(ExpressionResource globalResource) {
    this.globalResource = globalResource;
    return this;
  }

   /**
   * Get globalResource
   * @return globalResource
  **/
  @ApiModelProperty(value = "")
  public ExpressionResource getGlobalResource() {
    return globalResource;
  }

  public void setGlobalResource(ExpressionResource globalResource) {
    this.globalResource = globalResource;
  }

  public GlobalCheckAndIncrementResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalCheckAndIncrementResource globalCheckAndIncrementResource = (GlobalCheckAndIncrementResource) o;
    return Objects.equals(this.checkValueResource, globalCheckAndIncrementResource.checkValueResource) &&
        Objects.equals(this.globalResource, globalCheckAndIncrementResource.globalResource) &&
        Objects.equals(this.type, globalCheckAndIncrementResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkValueResource, globalResource, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalCheckAndIncrementResource {\n");
    
    sb.append("    checkValueResource: ").append(toIndentedString(checkValueResource)).append("\n");
    sb.append("    globalResource: ").append(toIndentedString(globalResource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

