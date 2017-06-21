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

import com.knetikcloud.model.Behavior;
import com.knetikcloud.model.LimitedGettableGroup;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LimitedGettable extends Behavior {
  
  @SerializedName("description")
  private String description = null;
  @SerializedName("type_hint")
  private String typeHint = null;
  @SerializedName("group")
  private LimitedGettableGroup group = null;

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
   * Used for polymorphic type recognition and thus must match an expected type with additional properties
   **/
  @ApiModelProperty(value = "Used for polymorphic type recognition and thus must match an expected type with additional properties")
  public String getTypeHint() {
    return typeHint;
  }
  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public LimitedGettableGroup getGroup() {
    return group;
  }
  public void setGroup(LimitedGettableGroup group) {
    this.group = group;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitedGettable limitedGettable = (LimitedGettable) o;
    return (this.description == null ? limitedGettable.description == null : this.description.equals(limitedGettable.description)) &&
        (this.typeHint == null ? limitedGettable.typeHint == null : this.typeHint.equals(limitedGettable.typeHint)) &&
        (this.group == null ? limitedGettable.group == null : this.group.equals(limitedGettable.group));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.typeHint == null ? 0: this.typeHint.hashCode());
    result = 31 * result + (this.group == null ? 0: this.group.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitedGettable {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  typeHint: ").append(typeHint).append("\n");
    sb.append("  group: ").append(group).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
