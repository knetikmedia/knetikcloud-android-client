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
import com.knetikcloud.model.Behavior;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Consumable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T16:24:46.936-04:00")
public class Consumable extends Behavior {
  @SerializedName("max_use")
  private Integer maxUse = null;

  public Consumable maxUse(Integer maxUse) {
    this.maxUse = maxUse;
    return this;
  }

   /**
   * The maximum number of times an item can be used
   * @return maxUse
  **/
  @ApiModelProperty(value = "The maximum number of times an item can be used")
  public Integer getMaxUse() {
    return maxUse;
  }

  public void setMaxUse(Integer maxUse) {
    this.maxUse = maxUse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consumable consumable = (Consumable) o;
    return Objects.equals(this.maxUse, consumable.maxUse) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxUse, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consumable {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxUse: ").append(toIndentedString(maxUse)).append("\n");
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

