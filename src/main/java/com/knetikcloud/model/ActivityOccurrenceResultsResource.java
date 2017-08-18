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
import com.knetikcloud.model.UserActivityResultsResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ActivityOccurrenceResultsResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-18T00:46:46.781-04:00")
public class ActivityOccurrenceResultsResource {
  @SerializedName("users")
  private List<UserActivityResultsResource> users = new ArrayList<UserActivityResultsResource>();

  public ActivityOccurrenceResultsResource users(List<UserActivityResultsResource> users) {
    this.users = users;
    return this;
  }

  public ActivityOccurrenceResultsResource addUsersItem(UserActivityResultsResource usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * The game results for each user. Include all users that played (paid to get in) even if they were eliminated without a result. A null metric is allowed
   * @return users
  **/
  @ApiModelProperty(required = true, value = "The game results for each user. Include all users that played (paid to get in) even if they were eliminated without a result. A null metric is allowed")
  public List<UserActivityResultsResource> getUsers() {
    return users;
  }

  public void setUsers(List<UserActivityResultsResource> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityOccurrenceResultsResource activityOccurrenceResultsResource = (ActivityOccurrenceResultsResource) o;
    return Objects.equals(this.users, activityOccurrenceResultsResource.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityOccurrenceResultsResource {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

