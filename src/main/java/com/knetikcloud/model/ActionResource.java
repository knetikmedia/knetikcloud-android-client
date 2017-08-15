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
import com.knetikcloud.model.ActionVariableResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ActionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T12:23:32.916-04:00")
public class ActionResource {
  /**
   * The category the action is in. All customer specific actions are in the &#39;custom&#39; category
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    ACHIEVEMENT("achievement"),
    
    BEHAVIOR("behavior"),
    
    COMMENT("comment"),
    
    DISPOSITION("disposition"),
    
    DEVICE("device"),
    
    ENTITLEMENT("entitlement"),
    
    FRIENDS("friends"),
    
    FULFILLMENT("fulfillment"),
    
    GAMIFICATION("gamification"),
    
    INVENTORY("inventory"),
    
    INVOICE("invoice"),
    
    MEDIA("media"),
    
    SCHEDULER("scheduler"),
    
    STORE("store"),
    
    SUBSCRIPTION("subscription"),
    
    USER("user"),
    
    WALLET("wallet"),
    
    CUSTOM("custom"),
    
    CHALLENGE("challenge"),
    
    ACTIVITY("activity"),
    
    CAMPAIGN("campaign"),
    
    EVENT("event");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("variables")
  private List<ActionVariableResource> variables = new ArrayList<ActionVariableResource>();

  public ActionResource category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * The category the action is in. All customer specific actions are in the &#39;custom&#39; category
   * @return category
  **/
  @ApiModelProperty(value = "The category the action is in. All customer specific actions are in the 'custom' category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public ActionResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the action
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the action")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ActionResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the action. Used as the unique id for reference
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the action. Used as the unique id for reference")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActionResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ActionResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags for searching
   * @return tags
  **/
  @ApiModelProperty(value = "A list of tags for searching")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ActionResource variables(List<ActionVariableResource> variables) {
    this.variables = variables;
    return this;
  }

  public ActionResource addVariablesItem(ActionVariableResource variablesItem) {
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * The variables required for the action
   * @return variables
  **/
  @ApiModelProperty(required = true, value = "The variables required for the action")
  public List<ActionVariableResource> getVariables() {
    return variables;
  }

  public void setVariables(List<ActionVariableResource> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionResource actionResource = (ActionResource) o;
    return Objects.equals(this.category, actionResource.category) &&
        Objects.equals(this.description, actionResource.description) &&
        Objects.equals(this.name, actionResource.name) &&
        Objects.equals(this.tags, actionResource.tags) &&
        Objects.equals(this.variables, actionResource.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, name, tags, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionResource {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

