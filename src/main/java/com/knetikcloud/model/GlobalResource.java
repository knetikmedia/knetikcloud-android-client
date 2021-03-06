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
import com.knetikcloud.model.ExpressionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Expressions are instructions for the rule engine to resolve certain values. For example instead of &#x60;user 1&#x60; it&#39;d state &#x60;user provided by the event&#x60;. Full list and definitions available at GET /bre/expressions.
 */
@ApiModel(description = "Expressions are instructions for the rule engine to resolve certain values. For example instead of `user 1` it'd state `user provided by the event`. Full list and definitions available at GET /bre/expressions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:02:11.431-04:00")
public class GlobalResource {
  @SerializedName("definition")
  private String definition = null;

  @SerializedName("global_def_id")
  private String globalDefId = null;

  @SerializedName("scopes")
  private Map<String, ExpressionResource> scopes = null;

  @SerializedName("type")
  private String type = null;

  public GlobalResource definition(String definition) {
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(value = "")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public GlobalResource globalDefId(String globalDefId) {
    this.globalDefId = globalDefId;
    return this;
  }

   /**
   * Get globalDefId
   * @return globalDefId
  **/
  @ApiModelProperty(value = "")
  public String getGlobalDefId() {
    return globalDefId;
  }

  public void setGlobalDefId(String globalDefId) {
    this.globalDefId = globalDefId;
  }

  public GlobalResource scopes(Map<String, ExpressionResource> scopes) {
    this.scopes = scopes;
    return this;
  }

  public GlobalResource putScopesItem(String key, ExpressionResource scopesItem) {
    if (this.scopes == null) {
      this.scopes = new HashMap<String, ExpressionResource>();
    }
    this.scopes.put(key, scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(value = "")
  public Map<String, ExpressionResource> getScopes() {
    return scopes;
  }

  public void setScopes(Map<String, ExpressionResource> scopes) {
    this.scopes = scopes;
  }

  public GlobalResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalResource globalResource = (GlobalResource) o;
    return Objects.equals(this.definition, globalResource.definition) &&
        Objects.equals(this.globalDefId, globalResource.globalDefId) &&
        Objects.equals(this.scopes, globalResource.scopes) &&
        Objects.equals(this.type, globalResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, globalDefId, scopes, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalResource {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    globalDefId: ").append(toIndentedString(globalDefId)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

