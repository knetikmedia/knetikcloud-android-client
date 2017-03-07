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

package io.swagger.client.model;

import io.swagger.client.model.NestedCategory;
import io.swagger.client.model.PollAnswerResource;
import io.swagger.client.model.Property;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PollResource {
  
  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
  @SerializedName("answers")
  private List<PollAnswerResource> answers = null;
  @SerializedName("category")
  private NestedCategory category = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("text")
  private String text = null;
  public enum TypeEnum {
     TEXT,  IMAGE,  VIDEO,  AUDIO, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;

  /**
   * Whether the poll is active
   **/
  @ApiModelProperty(required = true, value = "Whether the poll is active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   * The answers to the poll
   **/
  @ApiModelProperty(required = true, value = "The answers to the poll")
  public List<PollAnswerResource> getAnswers() {
    return answers;
  }
  public void setAnswers(List<PollAnswerResource> answers) {
    this.answers = answers;
  }

  /**
   * The category for the poll
   **/
  @ApiModelProperty(required = true, value = "The category for the poll")
  public NestedCategory getCategory() {
    return category;
  }
  public void setCategory(NestedCategory category) {
    this.category = category;
  }

  /**
   * The date/time this resource was created in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * The id of the poll
   **/
  @ApiModelProperty(value = "The id of the poll")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The tags for the poll
   **/
  @ApiModelProperty(value = "The tags for the poll")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * A poll template this poll is validated against (private). May be null and no validation of additional_properties will be done
   **/
  @ApiModelProperty(value = "A poll template this poll is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  /**
   * The text of the poll
   **/
  @ApiModelProperty(required = true, value = "The text of the poll")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * The media type of the poll
   **/
  @ApiModelProperty(required = true, value = "The media type of the poll")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The date/time this resource was last updated in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PollResource pollResource = (PollResource) o;
    return (this.active == null ? pollResource.active == null : this.active.equals(pollResource.active)) &&
        (this.additionalProperties == null ? pollResource.additionalProperties == null : this.additionalProperties.equals(pollResource.additionalProperties)) &&
        (this.answers == null ? pollResource.answers == null : this.answers.equals(pollResource.answers)) &&
        (this.category == null ? pollResource.category == null : this.category.equals(pollResource.category)) &&
        (this.createdDate == null ? pollResource.createdDate == null : this.createdDate.equals(pollResource.createdDate)) &&
        (this.id == null ? pollResource.id == null : this.id.equals(pollResource.id)) &&
        (this.tags == null ? pollResource.tags == null : this.tags.equals(pollResource.tags)) &&
        (this.template == null ? pollResource.template == null : this.template.equals(pollResource.template)) &&
        (this.text == null ? pollResource.text == null : this.text.equals(pollResource.text)) &&
        (this.type == null ? pollResource.type == null : this.type.equals(pollResource.type)) &&
        (this.updatedDate == null ? pollResource.updatedDate == null : this.updatedDate.equals(pollResource.updatedDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.answers == null ? 0: this.answers.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    result = 31 * result + (this.text == null ? 0: this.text.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollResource {\n");
    
    sb.append("  active: ").append(active).append("\n");
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  answers: ").append(answers).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}