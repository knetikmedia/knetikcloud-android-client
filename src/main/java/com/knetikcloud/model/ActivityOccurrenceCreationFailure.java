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
import com.knetikcloud.model.ActivityOccurrenceJoinResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ActivityOccurrenceCreationFailure
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-18T11:17:24.388-04:00")
public class ActivityOccurrenceCreationFailure {
  @SerializedName("user_results")
  private List<ActivityOccurrenceJoinResult> userResults = null;

  public ActivityOccurrenceCreationFailure userResults(List<ActivityOccurrenceJoinResult> userResults) {
    this.userResults = userResults;
    return this;
  }

  public ActivityOccurrenceCreationFailure addUserResultsItem(ActivityOccurrenceJoinResult userResultsItem) {
    if (this.userResults == null) {
      this.userResults = new ArrayList<ActivityOccurrenceJoinResult>();
    }
    this.userResults.add(userResultsItem);
    return this;
  }

   /**
   * The details of each user&#39;s entry, or just the current user&#39;s if not run with ACTIVITIES_ADMIN permission
   * @return userResults
  **/
  @ApiModelProperty(value = "The details of each user's entry, or just the current user's if not run with ACTIVITIES_ADMIN permission")
  public List<ActivityOccurrenceJoinResult> getUserResults() {
    return userResults;
  }

  public void setUserResults(List<ActivityOccurrenceJoinResult> userResults) {
    this.userResults = userResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityOccurrenceCreationFailure activityOccurrenceCreationFailure = (ActivityOccurrenceCreationFailure) o;
    return Objects.equals(this.userResults, activityOccurrenceCreationFailure.userResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityOccurrenceCreationFailure {\n");
    
    sb.append("    userResults: ").append(toIndentedString(userResults)).append("\n");
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

