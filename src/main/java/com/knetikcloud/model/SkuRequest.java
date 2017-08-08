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
 * SkuRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T17:12:21.889-04:00")
public class SkuRequest {
  @SerializedName("sku")
  private String sku = null;

  public SkuRequest sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * SKU code of the item
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "SKU code of the item")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkuRequest skuRequest = (SkuRequest) o;
    return Objects.equals(this.sku, skuRequest.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuRequest {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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
