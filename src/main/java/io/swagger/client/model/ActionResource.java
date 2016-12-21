/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.ActionVariableResource;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ActionResource {
  
  public enum CategoryEnum {
     achievement,  behavior,  comment,  disposition,  entitlement,  friends,  fulfillment,  gamification,  inventory,  invoice,  media,  scheduler,  store,  subscription,  user,  wallet,  custom,  challenge,  activity,  campaign,  event, 
  };
  @SerializedName("category")
  private CategoryEnum category = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("variables")
  private List<ActionVariableResource> variables = null;

  /**
   * The category the action is in. All customer specific actions are in the 'custom' category
   **/
  @ApiModelProperty(value = "The category the action is in. All customer specific actions are in the 'custom' category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  /**
   * The description of the action
   **/
  @ApiModelProperty(required = true, value = "The description of the action")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The name of the action. Used as the unique id for reference
   **/
  @ApiModelProperty(required = true, value = "The name of the action. Used as the unique id for reference")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The variables required for the action
   **/
  @ApiModelProperty(required = true, value = "The variables required for the action")
  public List<ActionVariableResource> getVariables() {
    return variables;
  }
  public void setVariables(List<ActionVariableResource> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionResource actionResource = (ActionResource) o;
    return (this.category == null ? actionResource.category == null : this.category.equals(actionResource.category)) &&
        (this.description == null ? actionResource.description == null : this.description.equals(actionResource.description)) &&
        (this.name == null ? actionResource.name == null : this.name.equals(actionResource.name)) &&
        (this.variables == null ? actionResource.variables == null : this.variables.equals(actionResource.variables));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.variables == null ? 0: this.variables.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionResource {\n");
    
    sb.append("  category: ").append(category).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  variables: ").append(variables).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
