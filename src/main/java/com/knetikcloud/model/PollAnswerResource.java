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
public class PollAnswerResource {
  
  @SerializedName("count")
  private Integer count = null;
  @SerializedName("key")
  private String key = null;
  @SerializedName("text")
  private String text = null;

  /**
   * The number of users that selected this answer
   **/
  @ApiModelProperty(value = "The number of users that selected this answer")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * The key to the answer (for code reference)
   **/
  @ApiModelProperty(required = true, value = "The key to the answer (for code reference)")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The text of the answer (for user display)
   **/
  @ApiModelProperty(required = true, value = "The text of the answer (for user display)")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PollAnswerResource pollAnswerResource = (PollAnswerResource) o;
    return (this.count == null ? pollAnswerResource.count == null : this.count.equals(pollAnswerResource.count)) &&
        (this.key == null ? pollAnswerResource.key == null : this.key.equals(pollAnswerResource.key)) &&
        (this.text == null ? pollAnswerResource.text == null : this.text.equals(pollAnswerResource.text));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.count == null ? 0: this.count.hashCode());
    result = 31 * result + (this.key == null ? 0: this.key.hashCode());
    result = 31 * result + (this.text == null ? 0: this.text.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollAnswerResource {\n");
    
    sb.append("  count: ").append(count).append("\n");
    sb.append("  key: ").append(key).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
