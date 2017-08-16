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
import com.knetikcloud.model.FileGroupPropertyDefinitionResource;
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VideoGroupPropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-16T14:20:46.819-04:00")
public class VideoGroupPropertyDefinitionResource extends FileGroupPropertyDefinitionResource {
  @SerializedName("max_height")
  private Integer maxHeight = null;

  @SerializedName("max_length")
  private Integer maxLength = null;

  @SerializedName("max_width")
  private Integer maxWidth = null;

  @SerializedName("min_height")
  private Integer minHeight = null;

  @SerializedName("min_length")
  private Integer minLength = null;

  @SerializedName("min_width")
  private Integer minWidth = null;

  public VideoGroupPropertyDefinitionResource maxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * If provided, the maximum height of each video
   * @return maxHeight
  **/
  @ApiModelProperty(value = "If provided, the maximum height of each video")
  public Integer getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }

  public VideoGroupPropertyDefinitionResource maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * If provided, the maximum length of each video
   * @return maxLength
  **/
  @ApiModelProperty(value = "If provided, the maximum length of each video")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public VideoGroupPropertyDefinitionResource maxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * If provided, the maximum width of each video
   * @return maxWidth
  **/
  @ApiModelProperty(value = "If provided, the maximum width of each video")
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  public VideoGroupPropertyDefinitionResource minHeight(Integer minHeight) {
    this.minHeight = minHeight;
    return this;
  }

   /**
   * If provided, the minimum height of each video
   * @return minHeight
  **/
  @ApiModelProperty(value = "If provided, the minimum height of each video")
  public Integer getMinHeight() {
    return minHeight;
  }

  public void setMinHeight(Integer minHeight) {
    this.minHeight = minHeight;
  }

  public VideoGroupPropertyDefinitionResource minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * If provided, the minimum length of each video
   * @return minLength
  **/
  @ApiModelProperty(value = "If provided, the minimum length of each video")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public VideoGroupPropertyDefinitionResource minWidth(Integer minWidth) {
    this.minWidth = minWidth;
    return this;
  }

   /**
   * If provided, the minimum width of each video
   * @return minWidth
  **/
  @ApiModelProperty(value = "If provided, the minimum width of each video")
  public Integer getMinWidth() {
    return minWidth;
  }

  public void setMinWidth(Integer minWidth) {
    this.minWidth = minWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoGroupPropertyDefinitionResource videoGroupPropertyDefinitionResource = (VideoGroupPropertyDefinitionResource) o;
    return Objects.equals(this.maxHeight, videoGroupPropertyDefinitionResource.maxHeight) &&
        Objects.equals(this.maxLength, videoGroupPropertyDefinitionResource.maxLength) &&
        Objects.equals(this.maxWidth, videoGroupPropertyDefinitionResource.maxWidth) &&
        Objects.equals(this.minHeight, videoGroupPropertyDefinitionResource.minHeight) &&
        Objects.equals(this.minLength, videoGroupPropertyDefinitionResource.minLength) &&
        Objects.equals(this.minWidth, videoGroupPropertyDefinitionResource.minWidth) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxHeight, maxLength, maxWidth, minHeight, minLength, minWidth, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoGroupPropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    minHeight: ").append(toIndentedString(minHeight)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
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

