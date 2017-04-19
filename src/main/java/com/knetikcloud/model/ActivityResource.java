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

import com.knetikcloud.model.ActivityEntitlementResource;
import com.knetikcloud.model.AvailableSettingResource;
import com.knetikcloud.model.Property;
import com.knetikcloud.model.RewardSetResource;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ActivityResource {
  
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("entitlements")
  private List<ActivityEntitlementResource> entitlements = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("launch")
  private String launch = null;
  @SerializedName("long_description")
  private String longDescription = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("reward_set")
  private RewardSetResource rewardSet = null;
  @SerializedName("settings")
  private List<AvailableSettingResource> settings = null;
  @SerializedName("short_description")
  private String shortDescription = null;
  @SerializedName("template")
  private Boolean template = null;
  @SerializedName("template_id")
  private String templateId = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("unique_key")
  private String uniqueKey = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;

  /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   * The date/time this resource was created in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * The list of items that can be used for entitlement (wager amounts/etc)
   **/
  @ApiModelProperty(value = "The list of items that can be used for entitlement (wager amounts/etc)")
  public List<ActivityEntitlementResource> getEntitlements() {
    return entitlements;
  }
  public void setEntitlements(List<ActivityEntitlementResource> entitlements) {
    this.entitlements = entitlements;
  }

  /**
   * The unique ID for that resource
   **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Details about how to launch the activity
   **/
  @ApiModelProperty(value = "Details about how to launch the activity")
  public String getLaunch() {
    return launch;
  }
  public void setLaunch(String launch) {
    this.launch = launch;
  }

  /**
   * The user friendly name of that resource. Defaults to blank string
   **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  /**
   * The user friendly name of that resource
   **/
  @ApiModelProperty(required = true, value = "The user friendly name of that resource")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing
   **/
  @ApiModelProperty(value = "The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing")
  public RewardSetResource getRewardSet() {
    return rewardSet;
  }
  public void setRewardSet(RewardSetResource rewardSet) {
    this.rewardSet = rewardSet;
  }

  /**
   * The list of settings and their options available for this activity. Not populated when getting listing
   **/
  @ApiModelProperty(value = "The list of settings and their options available for this activity. Not populated when getting listing")
  public List<AvailableSettingResource> getSettings() {
    return settings;
  }
  public void setSettings(List<AvailableSettingResource> settings) {
    this.settings = settings;
  }

  /**
   * The user friendly name of that resource. Defaults to blank string
   **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  /**
   * Whether this activity is a template for other activities. Default: false
   **/
  @ApiModelProperty(value = "Whether this activity is a template for other activities. Default: false")
  public Boolean getTemplate() {
    return template;
  }
  public void setTemplate(Boolean template) {
    this.template = template;
  }

  /**
   * An activity template this activity is validated against (private). May be null and no validation of additional_properties will be done
   **/
  @ApiModelProperty(value = "An activity template this activity is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  /**
   * The type of the activity
   **/
  @ApiModelProperty(required = true, value = "The type of the activity")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The unique key (for static reference in code) of the activity
   **/
  @ApiModelProperty(value = "The unique key (for static reference in code) of the activity")
  public String getUniqueKey() {
    return uniqueKey;
  }
  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  /**
   * The date/time this resource was last updated in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityResource activityResource = (ActivityResource) o;
    return (this.additionalProperties == null ? activityResource.additionalProperties == null : this.additionalProperties.equals(activityResource.additionalProperties)) &&
        (this.createdDate == null ? activityResource.createdDate == null : this.createdDate.equals(activityResource.createdDate)) &&
        (this.entitlements == null ? activityResource.entitlements == null : this.entitlements.equals(activityResource.entitlements)) &&
        (this.id == null ? activityResource.id == null : this.id.equals(activityResource.id)) &&
        (this.launch == null ? activityResource.launch == null : this.launch.equals(activityResource.launch)) &&
        (this.longDescription == null ? activityResource.longDescription == null : this.longDescription.equals(activityResource.longDescription)) &&
        (this.name == null ? activityResource.name == null : this.name.equals(activityResource.name)) &&
        (this.rewardSet == null ? activityResource.rewardSet == null : this.rewardSet.equals(activityResource.rewardSet)) &&
        (this.settings == null ? activityResource.settings == null : this.settings.equals(activityResource.settings)) &&
        (this.shortDescription == null ? activityResource.shortDescription == null : this.shortDescription.equals(activityResource.shortDescription)) &&
        (this.template == null ? activityResource.template == null : this.template.equals(activityResource.template)) &&
        (this.templateId == null ? activityResource.templateId == null : this.templateId.equals(activityResource.templateId)) &&
        (this.type == null ? activityResource.type == null : this.type.equals(activityResource.type)) &&
        (this.uniqueKey == null ? activityResource.uniqueKey == null : this.uniqueKey.equals(activityResource.uniqueKey)) &&
        (this.updatedDate == null ? activityResource.updatedDate == null : this.updatedDate.equals(activityResource.updatedDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.entitlements == null ? 0: this.entitlements.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.launch == null ? 0: this.launch.hashCode());
    result = 31 * result + (this.longDescription == null ? 0: this.longDescription.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.rewardSet == null ? 0: this.rewardSet.hashCode());
    result = 31 * result + (this.settings == null ? 0: this.settings.hashCode());
    result = 31 * result + (this.shortDescription == null ? 0: this.shortDescription.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    result = 31 * result + (this.templateId == null ? 0: this.templateId.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.uniqueKey == null ? 0: this.uniqueKey.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityResource {\n");
    
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  entitlements: ").append(entitlements).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  launch: ").append(launch).append("\n");
    sb.append("  longDescription: ").append(longDescription).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  rewardSet: ").append(rewardSet).append("\n");
    sb.append("  settings: ").append(settings).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  templateId: ").append(templateId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  uniqueKey: ").append(uniqueKey).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
