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

import io.swagger.client.model.UserActivityResultsResource;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ActivityOccurrenceResults {
  
  @SerializedName("users")
  private List<UserActivityResultsResource> users = null;

  /**
   * The game results for each user. Include all users that played (paid to get in) even if they were eliminated without a result. A null metric is allowed
   **/
  @ApiModelProperty(required = true, value = "The game results for each user. Include all users that played (paid to get in) even if they were eliminated without a result. A null metric is allowed")
  public List<UserActivityResultsResource> getUsers() {
    return users;
  }
  public void setUsers(List<UserActivityResultsResource> users) {
    this.users = users;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityOccurrenceResults activityOccurrenceResults = (ActivityOccurrenceResults) o;
    return (this.users == null ? activityOccurrenceResults.users == null : this.users.equals(activityOccurrenceResults.users));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.users == null ? 0: this.users.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityOccurrenceResults {\n");
    
    sb.append("  users: ").append(users).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
