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
 * DispositionCount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T09:34:35.981-05:00")
public class DispositionCount {
  @SerializedName("count")
  private Long count = null;

  @SerializedName("name")
  private String name = null;

  public DispositionCount count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * The number of users that have expressed this disposition
   * @return count
  **/
  @ApiModelProperty(value = "The number of users that have expressed this disposition")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public DispositionCount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the disposition this count is for
   * @return name
  **/
  @ApiModelProperty(value = "The name of the disposition this count is for")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispositionCount dispositionCount = (DispositionCount) o;
    return Objects.equals(this.count, dispositionCount.count) &&
        Objects.equals(this.name, dispositionCount.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispositionCount {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

