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
import com.knetikcloud.model.Property;
import com.knetikcloud.model.TierResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LevelingResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T09:34:35.981-05:00")
public class LevelingResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tiers")
  private List<TierResource> tiers = null;

  @SerializedName("trigger_event_name")
  private String triggerEventName = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public LevelingResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public LevelingResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

   /**
   * The date the leveling schema was created
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the leveling schema was created")
  public Long getCreatedDate() {
    return createdDate;
  }

  public LevelingResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the leveling schema
   * @return description
  **/
  @ApiModelProperty(value = "The description of the leveling schema")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LevelingResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the leveling schema.  IMMUTABLE
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the leveling schema.  IMMUTABLE")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LevelingResource tiers(List<TierResource> tiers) {
    this.tiers = tiers;
    return this;
  }

  public LevelingResource addTiersItem(TierResource tiersItem) {
    if (this.tiers == null) {
      this.tiers = new ArrayList<TierResource>();
    }
    this.tiers.add(tiersItem);
    return this;
  }

   /**
   * A set of tiers that contain experience boundaries
   * @return tiers
  **/
  @ApiModelProperty(value = "A set of tiers that contain experience boundaries")
  public List<TierResource> getTiers() {
    return tiers;
  }

  public void setTiers(List<TierResource> tiers) {
    this.tiers = tiers;
  }

  public LevelingResource triggerEventName(String triggerEventName) {
    this.triggerEventName = triggerEventName;
    return this;
  }

   /**
   * The name of an event that will add one progress to this level when fired
   * @return triggerEventName
  **/
  @ApiModelProperty(value = "The name of an event that will add one progress to this level when fired")
  public String getTriggerEventName() {
    return triggerEventName;
  }

  public void setTriggerEventName(String triggerEventName) {
    this.triggerEventName = triggerEventName;
  }

   /**
   * The date the leveling schema was updated
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the leveling schema was updated")
  public Long getUpdatedDate() {
    return updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LevelingResource levelingResource = (LevelingResource) o;
    return Objects.equals(this.additionalProperties, levelingResource.additionalProperties) &&
        Objects.equals(this.createdDate, levelingResource.createdDate) &&
        Objects.equals(this.description, levelingResource.description) &&
        Objects.equals(this.name, levelingResource.name) &&
        Objects.equals(this.tiers, levelingResource.tiers) &&
        Objects.equals(this.triggerEventName, levelingResource.triggerEventName) &&
        Objects.equals(this.updatedDate, levelingResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, createdDate, description, name, tiers, triggerEventName, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LevelingResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
    sb.append("    triggerEventName: ").append(toIndentedString(triggerEventName)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

