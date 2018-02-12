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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T10:36:54.503-05:00")
public class EventContextResource {
  @SerializedName("definition")
  private String definition = null;

  @SerializedName("event_name")
  private String eventName = null;

  @SerializedName("parameters")
  private Map<String, ExpressionResource> parameters = null;

  @SerializedName("type")
  private String type = null;

  public EventContextResource definition(String definition) {
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

  public EventContextResource eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(value = "")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public EventContextResource parameters(Map<String, ExpressionResource> parameters) {
    this.parameters = parameters;
    return this;
  }

  public EventContextResource putParametersItem(String key, ExpressionResource parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String, ExpressionResource>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public Map<String, ExpressionResource> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, ExpressionResource> parameters) {
    this.parameters = parameters;
  }

  public EventContextResource type(String type) {
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
    EventContextResource eventContextResource = (EventContextResource) o;
    return Objects.equals(this.definition, eventContextResource.definition) &&
        Objects.equals(this.eventName, eventContextResource.eventName) &&
        Objects.equals(this.parameters, eventContextResource.parameters) &&
        Objects.equals(this.type, eventContextResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, eventName, parameters, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventContextResource {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

