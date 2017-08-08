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
import com.knetikcloud.model.LeaderboardEntryResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * LeaderboardResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T17:55:38.520-04:00")
public class LeaderboardResource {
  @JsonProperty("entries")
  private List<LeaderboardEntryResource> entries = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("strategy")
  private String strategy = null;

  public LeaderboardResource entries(List<LeaderboardEntryResource> entries) {
    this.entries = entries;
    return this;
  }

  public LeaderboardResource addEntriesItem(LeaderboardEntryResource entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<LeaderboardEntryResource>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * The paginated list of user results, in order from best to worst
   * @return entries
  **/
  @ApiModelProperty(value = "The paginated list of user results, in order from best to worst")
  public List<LeaderboardEntryResource> getEntries() {
    return entries;
  }

  public void setEntries(List<LeaderboardEntryResource> entries) {
    this.entries = entries;
  }

   /**
   * The id of the leaderboard
   * @return id
  **/
  @ApiModelProperty(value = "The id of the leaderboard")
  public Long getId() {
    return id;
  }

  public LeaderboardResource strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * The name of the strategy that defines how entries are stored and compared
   * @return strategy
  **/
  @ApiModelProperty(value = "The name of the strategy that defines how entries are stored and compared")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaderboardResource leaderboardResource = (LeaderboardResource) o;
    return Objects.equals(this.entries, leaderboardResource.entries) &&
        Objects.equals(this.id, leaderboardResource.id) &&
        Objects.equals(this.strategy, leaderboardResource.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, id, strategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaderboardResource {\n");
    
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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

