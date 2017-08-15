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
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DispositionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T18:00:14.521-04:00")
public class DispositionResource {
  @SerializedName("context")
  private String context = null;

  @SerializedName("context_id")
  private String contextId = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("user")
  private SimpleUserResource user = null;

  public DispositionResource context(String context) {
    this.context = context;
    return this;
  }

   /**
   * The context of that resource. Required when passed to /dispositions rather than context specific endpoint
   * @return context
  **/
  @ApiModelProperty(value = "The context of that resource. Required when passed to /dispositions rather than context specific endpoint")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public DispositionResource contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

   /**
   * The context_id of that resource. Required when passed to /dispositions rather than context specific endpoint
   * @return contextId
  **/
  @ApiModelProperty(value = "The context_id of that resource. Required when passed to /dispositions rather than context specific endpoint")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }

  public DispositionResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the disposition, 1-20 characters. (ex: like/dislike/favorite, etc)
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the disposition, 1-20 characters. (ex: like/dislike/favorite, etc)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DispositionResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The user
   * @return user
  **/
  @ApiModelProperty(value = "The user")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispositionResource dispositionResource = (DispositionResource) o;
    return Objects.equals(this.context, dispositionResource.context) &&
        Objects.equals(this.contextId, dispositionResource.contextId) &&
        Objects.equals(this.createdDate, dispositionResource.createdDate) &&
        Objects.equals(this.id, dispositionResource.id) &&
        Objects.equals(this.name, dispositionResource.name) &&
        Objects.equals(this.user, dispositionResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, contextId, createdDate, id, name, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispositionResource {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

