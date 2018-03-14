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
import com.knetikcloud.model.CoreActivityOccurrenceSettings;
import com.knetikcloud.model.SelectedSettingRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ActivityOccurrenceSettingsResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:02:11.431-04:00")
public class ActivityOccurrenceSettingsResource {
  @SerializedName("core_settings")
  private CoreActivityOccurrenceSettings coreSettings = null;

  @SerializedName("settings")
  private List<SelectedSettingRequest> settings = null;

  public ActivityOccurrenceSettingsResource coreSettings(CoreActivityOccurrenceSettings coreSettings) {
    this.coreSettings = coreSettings;
    return this;
  }

   /**
   * Defines core settings about the activity occurrence that affect how it behaves in the system. Validated against core settings in activity/challenge-activity.
   * @return coreSettings
  **/
  @ApiModelProperty(value = "Defines core settings about the activity occurrence that affect how it behaves in the system. Validated against core settings in activity/challenge-activity.")
  public CoreActivityOccurrenceSettings getCoreSettings() {
    return coreSettings;
  }

  public void setCoreSettings(CoreActivityOccurrenceSettings coreSettings) {
    this.coreSettings = coreSettings;
  }

  public ActivityOccurrenceSettingsResource settings(List<SelectedSettingRequest> settings) {
    this.settings = settings;
    return this;
  }

  public ActivityOccurrenceSettingsResource addSettingsItem(SelectedSettingRequest settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<SelectedSettingRequest>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * The values selected from the available settings defined for the activity. Ex: difficulty: hard. Can be left out if the activity is played during an event and the settings are already set at the event level. Ex: every monday, difficulty: hard, number of questions: 10, category: sport. Otherwise, the set must exactly match those of the activity.
   * @return settings
  **/
  @ApiModelProperty(value = "The values selected from the available settings defined for the activity. Ex: difficulty: hard. Can be left out if the activity is played during an event and the settings are already set at the event level. Ex: every monday, difficulty: hard, number of questions: 10, category: sport. Otherwise, the set must exactly match those of the activity.")
  public List<SelectedSettingRequest> getSettings() {
    return settings;
  }

  public void setSettings(List<SelectedSettingRequest> settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityOccurrenceSettingsResource activityOccurrenceSettingsResource = (ActivityOccurrenceSettingsResource) o;
    return Objects.equals(this.coreSettings, activityOccurrenceSettingsResource.coreSettings) &&
        Objects.equals(this.settings, activityOccurrenceSettingsResource.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreSettings, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityOccurrenceSettingsResource {\n");
    
    sb.append("    coreSettings: ").append(toIndentedString(coreSettings)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
