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
import com.knetikcloud.model.AnswerResource;
import com.knetikcloud.model.NestedCategory;
import com.knetikcloud.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * QuestionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:02:11.431-04:00")
public class QuestionResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @SerializedName("answers")
  private List<AnswerResource> answers = null;

  @SerializedName("category")
  private NestedCategory category = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("difficulty")
  private Integer difficulty = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("import_id")
  private Long importId = null;

  @SerializedName("published_date")
  private Long publishedDate = null;

  @SerializedName("question")
  private Property question = null;

  @SerializedName("source1")
  private String source1 = null;

  @SerializedName("source2")
  private String source2 = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("vendor")
  private String vendor = null;

  public QuestionResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public QuestionResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public QuestionResource answers(List<AnswerResource> answers) {
    this.answers = answers;
    return this;
  }

  public QuestionResource addAnswersItem(AnswerResource answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<AnswerResource>();
    }
    this.answers.add(answersItem);
    return this;
  }

   /**
   * The list of available answers
   * @return answers
  **/
  @ApiModelProperty(value = "The list of available answers")
  public List<AnswerResource> getAnswers() {
    return answers;
  }

  public void setAnswers(List<AnswerResource> answers) {
    this.answers = answers;
  }

  public QuestionResource category(NestedCategory category) {
    this.category = category;
    return this;
  }

   /**
   * The category for the question
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The category for the question")
  public NestedCategory getCategory() {
    return category;
  }

  public void setCategory(NestedCategory category) {
    this.category = category;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

  public QuestionResource difficulty(Integer difficulty) {
    this.difficulty = difficulty;
    return this;
  }

   /**
   * The difficulty of the question
   * @return difficulty
  **/
  @ApiModelProperty(required = true, value = "The difficulty of the question")
  public Integer getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(Integer difficulty) {
    this.difficulty = difficulty;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public String getId() {
    return id;
  }

  public QuestionResource importId(Long importId) {
    this.importId = importId;
    return this;
  }

   /**
   * The id of the import job that created the question, or null if not from an import
   * @return importId
  **/
  @ApiModelProperty(value = "The id of the import job that created the question, or null if not from an import")
  public Long getImportId() {
    return importId;
  }

  public void setImportId(Long importId) {
    this.importId = importId;
  }

  public QuestionResource publishedDate(Long publishedDate) {
    this.publishedDate = publishedDate;
    return this;
  }

   /**
   * When the question becomes available, null for never, in seconds since epoch
   * @return publishedDate
  **/
  @ApiModelProperty(value = "When the question becomes available, null for never, in seconds since epoch")
  public Long getPublishedDate() {
    return publishedDate;
  }

  public void setPublishedDate(Long publishedDate) {
    this.publishedDate = publishedDate;
  }

  public QuestionResource question(Property question) {
    this.question = question;
    return this;
  }

   /**
   * The question. Different &#39;type&#39; values indicate different structures as the question may be test, image, etc. See information on additional properties for the list and their structures
   * @return question
  **/
  @ApiModelProperty(required = true, value = "The question. Different 'type' values indicate different structures as the question may be test, image, etc. See information on additional properties for the list and their structures")
  public Property getQuestion() {
    return question;
  }

  public void setQuestion(Property question) {
    this.question = question;
  }

  public QuestionResource source1(String source1) {
    this.source1 = source1;
    return this;
  }

   /**
   * The first source of the question
   * @return source1
  **/
  @ApiModelProperty(value = "The first source of the question")
  public String getSource1() {
    return source1;
  }

  public void setSource1(String source1) {
    this.source1 = source1;
  }

  public QuestionResource source2(String source2) {
    this.source2 = source2;
    return this;
  }

   /**
   * The second source of the question
   * @return source2
  **/
  @ApiModelProperty(value = "The second source of the question")
  public String getSource2() {
    return source2;
  }

  public void setSource2(String source2) {
    this.source2 = source2;
  }

  public QuestionResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public QuestionResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The list of tags
   * @return tags
  **/
  @ApiModelProperty(value = "The list of tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public QuestionResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A question template this question is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "A question template this question is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public QuestionResource vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * The supplier of the question
   * @return vendor
  **/
  @ApiModelProperty(value = "The supplier of the question")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionResource questionResource = (QuestionResource) o;
    return Objects.equals(this.additionalProperties, questionResource.additionalProperties) &&
        Objects.equals(this.answers, questionResource.answers) &&
        Objects.equals(this.category, questionResource.category) &&
        Objects.equals(this.createdDate, questionResource.createdDate) &&
        Objects.equals(this.difficulty, questionResource.difficulty) &&
        Objects.equals(this.id, questionResource.id) &&
        Objects.equals(this.importId, questionResource.importId) &&
        Objects.equals(this.publishedDate, questionResource.publishedDate) &&
        Objects.equals(this.question, questionResource.question) &&
        Objects.equals(this.source1, questionResource.source1) &&
        Objects.equals(this.source2, questionResource.source2) &&
        Objects.equals(this.tags, questionResource.tags) &&
        Objects.equals(this.template, questionResource.template) &&
        Objects.equals(this.updatedDate, questionResource.updatedDate) &&
        Objects.equals(this.vendor, questionResource.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, answers, category, createdDate, difficulty, id, importId, publishedDate, question, source1, source2, tags, template, updatedDate, vendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    source1: ").append(toIndentedString(source1)).append("\n");
    sb.append("    source2: ").append(toIndentedString(source2)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

