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
import com.knetikcloud.model.SettingOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The definition of an activity parameters: ex: difficulty level
 */
@ApiModel(description = "The definition of an activity parameters: ex: difficulty level")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:02:11.431-04:00")
public class AvailableSettingResource {
  @SerializedName("advanced_option")
  private Boolean advancedOption = null;

  @SerializedName("default_value")
  private String defaultValue = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("options")
  private List<SettingOption> options = null;

  @SerializedName("type")
  private String type = null;

  public AvailableSettingResource advancedOption(Boolean advancedOption) {
    this.advancedOption = advancedOption;
    return this;
  }

   /**
   * Whether the setting is advanced. Default: false
   * @return advancedOption
  **/
  @ApiModelProperty(example = "false", value = "Whether the setting is advanced. Default: false")
  public Boolean isAdvancedOption() {
    return advancedOption;
  }

  public void setAdvancedOption(Boolean advancedOption) {
    this.advancedOption = advancedOption;
  }

  public AvailableSettingResource defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * The default value of the setting (must be in options array). Ex: easy
   * @return defaultValue
  **/
  @ApiModelProperty(value = "The default value of the setting (must be in options array). Ex: easy")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public AvailableSettingResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the setting: Ex: Choose the difficulty level to show more or less complicated questions (for a trivia activity)
   * @return description
  **/
  @ApiModelProperty(value = "The description of the setting: Ex: Choose the difficulty level to show more or less complicated questions (for a trivia activity)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AvailableSettingResource key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The unique ID for the setting: Ex: difficulty
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The unique ID for the setting: Ex: difficulty")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AvailableSettingResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The textual name of the setting: Ex: Difficulty Level
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The textual name of the setting: Ex: Difficulty Level")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AvailableSettingResource options(List<SettingOption> options) {
    this.options = options;
    return this;
  }

  public AvailableSettingResource addOptionsItem(SettingOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<SettingOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * The set of options available for this setting, Ex: easy, medium, hard
   * @return options
  **/
  @ApiModelProperty(value = "The set of options available for this setting, Ex: easy, medium, hard")
  public List<SettingOption> getOptions() {
    return options;
  }

  public void setOptions(List<SettingOption> options) {
    this.options = options;
  }

  public AvailableSettingResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the setting value: Ex: TEXT
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the setting value: Ex: TEXT")
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
    AvailableSettingResource availableSettingResource = (AvailableSettingResource) o;
    return Objects.equals(this.advancedOption, availableSettingResource.advancedOption) &&
        Objects.equals(this.defaultValue, availableSettingResource.defaultValue) &&
        Objects.equals(this.description, availableSettingResource.description) &&
        Objects.equals(this.key, availableSettingResource.key) &&
        Objects.equals(this.name, availableSettingResource.name) &&
        Objects.equals(this.options, availableSettingResource.options) &&
        Objects.equals(this.type, availableSettingResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedOption, defaultValue, description, key, name, options, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableSettingResource {\n");
    
    sb.append("    advancedOption: ").append(toIndentedString(advancedOption)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

