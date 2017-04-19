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

import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LeaderboardEntryResource {
  
  @SerializedName("rank")
  private Long rank = null;
  @SerializedName("score")
  private Long score = null;
  @SerializedName("user")
  private SimpleUserResource user = null;

  /**
   * The position of the user in the leaderboard. Null means non-compete or disqualification
   **/
  @ApiModelProperty(value = "The position of the user in the leaderboard. Null means non-compete or disqualification")
  public Long getRank() {
    return rank;
  }
  public void setRank(Long rank) {
    this.rank = rank;
  }

  /**
   * The raw score in this leaderboard. Null means non-compete or disqualification
   **/
  @ApiModelProperty(value = "The raw score in this leaderboard. Null means non-compete or disqualification")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }

  /**
   * The player for this entry
   **/
  @ApiModelProperty(required = true, value = "The player for this entry")
  public SimpleUserResource getUser() {
    return user;
  }
  public void setUser(SimpleUserResource user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaderboardEntryResource leaderboardEntryResource = (LeaderboardEntryResource) o;
    return (this.rank == null ? leaderboardEntryResource.rank == null : this.rank.equals(leaderboardEntryResource.rank)) &&
        (this.score == null ? leaderboardEntryResource.score == null : this.score.equals(leaderboardEntryResource.score)) &&
        (this.user == null ? leaderboardEntryResource.user == null : this.user.equals(leaderboardEntryResource.user));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.rank == null ? 0: this.rank.hashCode());
    result = 31 * result + (this.score == null ? 0: this.score.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaderboardEntryResource {\n");
    
    sb.append("  rank: ").append(rank).append("\n");
    sb.append("  score: ").append(score).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
