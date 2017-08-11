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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SearchReferenceMapping
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-11T13:41:51.097-04:00")
public class SearchReferenceMapping {
  @SerializedName("id")
  private String id = null;

  @SerializedName("ref_id_field")
  private String refIdField = null;

  @SerializedName("ref_type")
  private String refType = null;

  @SerializedName("source_field_to_destination_field")
  private Map<String, String> sourceFieldToDestinationField = new HashMap<String, String>();

  @SerializedName("type")
  private String type = null;

  public SearchReferenceMapping id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the mapping to protect against duplicates
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the mapping to protect against duplicates")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SearchReferenceMapping refIdField(String refIdField) {
    this.refIdField = refIdField;
    return this;
  }

   /**
   * The field within the type that contains the id from the refType
   * @return refIdField
  **/
  @ApiModelProperty(required = true, value = "The field within the type that contains the id from the refType")
  public String getRefIdField() {
    return refIdField;
  }

  public void setRefIdField(String refIdField) {
    this.refIdField = refIdField;
  }

  public SearchReferenceMapping refType(String refType) {
    this.refType = refType;
    return this;
  }

   /**
   * The index type that the mapping pulls data from
   * @return refType
  **/
  @ApiModelProperty(required = true, value = "The index type that the mapping pulls data from")
  public String getRefType() {
    return refType;
  }

  public void setRefType(String refType) {
    this.refType = refType;
  }

  public SearchReferenceMapping sourceFieldToDestinationField(Map<String, String> sourceFieldToDestinationField) {
    this.sourceFieldToDestinationField = sourceFieldToDestinationField;
    return this;
  }

  public SearchReferenceMapping putSourceFieldToDestinationFieldItem(String key, String sourceFieldToDestinationFieldItem) {
    this.sourceFieldToDestinationField.put(key, sourceFieldToDestinationFieldItem);
    return this;
  }

   /**
   * A map whose keys are the field names in the refType and values are the field name in the type
   * @return sourceFieldToDestinationField
  **/
  @ApiModelProperty(required = true, value = "A map whose keys are the field names in the refType and values are the field name in the type")
  public Map<String, String> getSourceFieldToDestinationField() {
    return sourceFieldToDestinationField;
  }

  public void setSourceFieldToDestinationField(Map<String, String> sourceFieldToDestinationField) {
    this.sourceFieldToDestinationField = sourceFieldToDestinationField;
  }

  public SearchReferenceMapping type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The index type that the mapping is for
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The index type that the mapping is for")
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
    SearchReferenceMapping searchReferenceMapping = (SearchReferenceMapping) o;
    return Objects.equals(this.id, searchReferenceMapping.id) &&
        Objects.equals(this.refIdField, searchReferenceMapping.refIdField) &&
        Objects.equals(this.refType, searchReferenceMapping.refType) &&
        Objects.equals(this.sourceFieldToDestinationField, searchReferenceMapping.sourceFieldToDestinationField) &&
        Objects.equals(this.type, searchReferenceMapping.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, refIdField, refType, sourceFieldToDestinationField, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchReferenceMapping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    refIdField: ").append(toIndentedString(refIdField)).append("\n");
    sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
    sb.append("    sourceFieldToDestinationField: ").append(toIndentedString(sourceFieldToDestinationField)).append("\n");
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

