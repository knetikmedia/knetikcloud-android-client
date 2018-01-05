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
 * UserRelationshipResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T16:56:09.934-05:00")
public class UserRelationshipResource {
  @SerializedName("child")
  private SimpleUserResource child = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("parent")
  private SimpleUserResource parent = null;

  public UserRelationshipResource child(SimpleUserResource child) {
    this.child = child;
    return this;
  }

   /**
   * The child in the relationship
   * @return child
  **/
  @ApiModelProperty(required = true, value = "The child in the relationship")
  public SimpleUserResource getChild() {
    return child;
  }

  public void setChild(SimpleUserResource child) {
    this.child = child;
  }

  public UserRelationshipResource context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Context about the relationship or its type
   * @return context
  **/
  @ApiModelProperty(value = "Context about the relationship or its type")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

   /**
   * A generated unique id. Read-Only
   * @return id
  **/
  @ApiModelProperty(value = "A generated unique id. Read-Only")
  public Long getId() {
    return id;
  }

  public UserRelationshipResource parent(SimpleUserResource parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The parent in the relationship
   * @return parent
  **/
  @ApiModelProperty(required = true, value = "The parent in the relationship")
  public SimpleUserResource getParent() {
    return parent;
  }

  public void setParent(SimpleUserResource parent) {
    this.parent = parent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRelationshipResource userRelationshipResource = (UserRelationshipResource) o;
    return Objects.equals(this.child, userRelationshipResource.child) &&
        Objects.equals(this.context, userRelationshipResource.context) &&
        Objects.equals(this.id, userRelationshipResource.id) &&
        Objects.equals(this.parent, userRelationshipResource.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(child, context, id, parent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRelationshipResource {\n");
    
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

