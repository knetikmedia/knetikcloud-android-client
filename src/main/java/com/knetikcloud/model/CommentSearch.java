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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CommentSearch {
  
  @SerializedName("content")
  private String content = null;
  @SerializedName("context")
  private String context = null;
  @SerializedName("context_id")
  private Integer contextId = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("owner_id")
  private Integer ownerId = null;
  @SerializedName("owner_username")
  private String ownerUsername = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getContextId() {
    return contextId;
  }
  public void setContextId(Integer contextId) {
    this.contextId = contextId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOwnerUsername() {
    return ownerUsername;
  }
  public void setOwnerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentSearch commentSearch = (CommentSearch) o;
    return (this.content == null ? commentSearch.content == null : this.content.equals(commentSearch.content)) &&
        (this.context == null ? commentSearch.context == null : this.context.equals(commentSearch.context)) &&
        (this.contextId == null ? commentSearch.contextId == null : this.contextId.equals(commentSearch.contextId)) &&
        (this.id == null ? commentSearch.id == null : this.id.equals(commentSearch.id)) &&
        (this.ownerId == null ? commentSearch.ownerId == null : this.ownerId.equals(commentSearch.ownerId)) &&
        (this.ownerUsername == null ? commentSearch.ownerUsername == null : this.ownerUsername.equals(commentSearch.ownerUsername));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.content == null ? 0: this.content.hashCode());
    result = 31 * result + (this.context == null ? 0: this.context.hashCode());
    result = 31 * result + (this.contextId == null ? 0: this.contextId.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.ownerId == null ? 0: this.ownerId.hashCode());
    result = 31 * result + (this.ownerUsername == null ? 0: this.ownerUsername.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentSearch {\n");
    
    sb.append("  content: ").append(content).append("\n");
    sb.append("  context: ").append(context).append("\n");
    sb.append("  contextId: ").append(contextId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  ownerId: ").append(ownerId).append("\n");
    sb.append("  ownerUsername: ").append(ownerUsername).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
