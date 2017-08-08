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
 * LimitedGettableGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T17:12:21.889-04:00")
public class LimitedGettableGroup {
  @SerializedName("active_only")
  private Boolean activeOnly = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owned_limit")
  private Integer ownedLimit = null;

  public LimitedGettableGroup activeOnly(Boolean activeOnly) {
    this.activeOnly = activeOnly;
    return this;
  }

   /**
   * Whether to get active items only
   * @return activeOnly
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether to get active items only")
  public Boolean isActiveOnly() {
    return activeOnly;
  }

  public void setActiveOnly(Boolean activeOnly) {
    this.activeOnly = activeOnly;
  }

  public LimitedGettableGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the group. Multiple items with the same group name will be limited together, leave null to be assigned a random unique name. It is typical that owned_limit and active_only will be the same for all, but this is not enforced and the item being recieved will use its settings.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the group. Multiple items with the same group name will be limited together, leave null to be assigned a random unique name. It is typical that owned_limit and active_only will be the same for all, but this is not enforced and the item being recieved will use its settings.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LimitedGettableGroup ownedLimit(Integer ownedLimit) {
    this.ownedLimit = ownedLimit;
    return this;
  }

   /**
   * The max number of items that can be purchased
   * @return ownedLimit
  **/
  @ApiModelProperty(required = true, value = "The max number of items that can be purchased")
  public Integer getOwnedLimit() {
    return ownedLimit;
  }

  public void setOwnedLimit(Integer ownedLimit) {
    this.ownedLimit = ownedLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitedGettableGroup limitedGettableGroup = (LimitedGettableGroup) o;
    return Objects.equals(this.activeOnly, limitedGettableGroup.activeOnly) &&
        Objects.equals(this.name, limitedGettableGroup.name) &&
        Objects.equals(this.ownedLimit, limitedGettableGroup.ownedLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeOnly, name, ownedLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitedGettableGroup {\n");
    
    sb.append("    activeOnly: ").append(toIndentedString(activeOnly)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownedLimit: ").append(toIndentedString(ownedLimit)).append("\n");
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
