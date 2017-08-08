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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * UserLevelingResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T17:55:38.520-04:00")
public class UserLevelingResource {
  @JsonProperty("last_tier_name")
  private String lastTierName = null;

  @JsonProperty("last_tier_progress")
  private Integer lastTierProgress = null;

  @JsonProperty("level_name")
  private String levelName = null;

  @JsonProperty("next_tier_name")
  private String nextTierName = null;

  @JsonProperty("next_tier_progress")
  private Integer nextTierProgress = null;

  @JsonProperty("progress")
  private Integer progress = null;

  @JsonProperty("tier_names")
  private List<String> tierNames = new ArrayList<String>();

  @JsonProperty("user_id")
  private Integer userId = null;

  public UserLevelingResource lastTierName(String lastTierName) {
    this.lastTierName = lastTierName;
    return this;
  }

   /**
   * The name of the last tier the user has qualified for
   * @return lastTierName
  **/
  @ApiModelProperty(required = true, value = "The name of the last tier the user has qualified for")
  public String getLastTierName() {
    return lastTierName;
  }

  public void setLastTierName(String lastTierName) {
    this.lastTierName = lastTierName;
  }

  public UserLevelingResource lastTierProgress(Integer lastTierProgress) {
    this.lastTierProgress = lastTierProgress;
    return this;
  }

   /**
   * The progress level of the last tier the user has qualified for
   * @return lastTierProgress
  **/
  @ApiModelProperty(required = true, value = "The progress level of the last tier the user has qualified for")
  public Integer getLastTierProgress() {
    return lastTierProgress;
  }

  public void setLastTierProgress(Integer lastTierProgress) {
    this.lastTierProgress = lastTierProgress;
  }

  public UserLevelingResource levelName(String levelName) {
    this.levelName = levelName;
    return this;
  }

   /**
   * The name of the level schema
   * @return levelName
  **/
  @ApiModelProperty(required = true, value = "The name of the level schema")
  public String getLevelName() {
    return levelName;
  }

  public void setLevelName(String levelName) {
    this.levelName = levelName;
  }

  public UserLevelingResource nextTierName(String nextTierName) {
    this.nextTierName = nextTierName;
    return this;
  }

   /**
   * The name of the next tier the user can qualify for
   * @return nextTierName
  **/
  @ApiModelProperty(required = true, value = "The name of the next tier the user can qualify for")
  public String getNextTierName() {
    return nextTierName;
  }

  public void setNextTierName(String nextTierName) {
    this.nextTierName = nextTierName;
  }

  public UserLevelingResource nextTierProgress(Integer nextTierProgress) {
    this.nextTierProgress = nextTierProgress;
    return this;
  }

   /**
   * The progress needed to qualify for the next tier
   * @return nextTierProgress
  **/
  @ApiModelProperty(required = true, value = "The progress needed to qualify for the next tier")
  public Integer getNextTierProgress() {
    return nextTierProgress;
  }

  public void setNextTierProgress(Integer nextTierProgress) {
    this.nextTierProgress = nextTierProgress;
  }

  public UserLevelingResource progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * The amount of progress the user has
   * @return progress
  **/
  @ApiModelProperty(required = true, value = "The amount of progress the user has")
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public UserLevelingResource tierNames(List<String> tierNames) {
    this.tierNames = tierNames;
    return this;
  }

  public UserLevelingResource addTierNamesItem(String tierNamesItem) {
    this.tierNames.add(tierNamesItem);
    return this;
  }

   /**
   * The names of the tiers the user has qualified for
   * @return tierNames
  **/
  @ApiModelProperty(required = true, value = "The names of the tiers the user has qualified for")
  public List<String> getTierNames() {
    return tierNames;
  }

  public void setTierNames(List<String> tierNames) {
    this.tierNames = tierNames;
  }

  public UserLevelingResource userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The ID of the user")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLevelingResource userLevelingResource = (UserLevelingResource) o;
    return Objects.equals(this.lastTierName, userLevelingResource.lastTierName) &&
        Objects.equals(this.lastTierProgress, userLevelingResource.lastTierProgress) &&
        Objects.equals(this.levelName, userLevelingResource.levelName) &&
        Objects.equals(this.nextTierName, userLevelingResource.nextTierName) &&
        Objects.equals(this.nextTierProgress, userLevelingResource.nextTierProgress) &&
        Objects.equals(this.progress, userLevelingResource.progress) &&
        Objects.equals(this.tierNames, userLevelingResource.tierNames) &&
        Objects.equals(this.userId, userLevelingResource.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTierName, lastTierProgress, levelName, nextTierName, nextTierProgress, progress, tierNames, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLevelingResource {\n");
    
    sb.append("    lastTierName: ").append(toIndentedString(lastTierName)).append("\n");
    sb.append("    lastTierProgress: ").append(toIndentedString(lastTierProgress)).append("\n");
    sb.append("    levelName: ").append(toIndentedString(levelName)).append("\n");
    sb.append("    nextTierName: ").append(toIndentedString(nextTierName)).append("\n");
    sb.append("    nextTierProgress: ").append(toIndentedString(nextTierProgress)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    tierNames: ").append(toIndentedString(tierNames)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

