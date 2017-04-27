/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.knetikcloud.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Discount {
  
  @SerializedName("description")
  private String description = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("sku")
  private String sku = null;
  @SerializedName("unique_key")
  private String uniqueKey = null;
  @SerializedName("value")
  private Double value = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUniqueKey() {
    return uniqueKey;
  }
  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Discount discount = (Discount) o;
    return (this.description == null ? discount.description == null : this.description.equals(discount.description)) &&
        (this.name == null ? discount.name == null : this.name.equals(discount.name)) &&
        (this.sku == null ? discount.sku == null : this.sku.equals(discount.sku)) &&
        (this.uniqueKey == null ? discount.uniqueKey == null : this.uniqueKey.equals(discount.uniqueKey)) &&
        (this.value == null ? discount.value == null : this.value.equals(discount.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    result = 31 * result + (this.uniqueKey == null ? 0: this.uniqueKey.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discount {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  uniqueKey: ").append(uniqueKey).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
