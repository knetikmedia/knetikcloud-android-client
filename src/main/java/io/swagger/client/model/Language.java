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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Language {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("date_created")
  private Long dateCreated = null;
  @SerializedName("date_updated")
  private Long dateUpdated = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("direction")
  private String direction = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("is_primary")
  private Boolean isPrimary = null;
  @SerializedName("name")
  private String name = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getDateUpdated() {
    return dateUpdated;
  }
  public void setDateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDirection() {
    return direction;
  }
  public void setDirection(String direction) {
    this.direction = direction;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsPrimary() {
    return isPrimary;
  }
  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Language language = (Language) o;
    return (this.code == null ? language.code == null : this.code.equals(language.code)) &&
        (this.dateCreated == null ? language.dateCreated == null : this.dateCreated.equals(language.dateCreated)) &&
        (this.dateUpdated == null ? language.dateUpdated == null : this.dateUpdated.equals(language.dateUpdated)) &&
        (this.description == null ? language.description == null : this.description.equals(language.description)) &&
        (this.direction == null ? language.direction == null : this.direction.equals(language.direction)) &&
        (this.id == null ? language.id == null : this.id.equals(language.id)) &&
        (this.isPrimary == null ? language.isPrimary == null : this.isPrimary.equals(language.isPrimary)) &&
        (this.name == null ? language.name == null : this.name.equals(language.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.dateCreated == null ? 0: this.dateCreated.hashCode());
    result = 31 * result + (this.dateUpdated == null ? 0: this.dateUpdated.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.direction == null ? 0: this.direction.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.isPrimary == null ? 0: this.isPrimary.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Language {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  dateCreated: ").append(dateCreated).append("\n");
    sb.append("  dateUpdated: ").append(dateUpdated).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  direction: ").append(direction).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  isPrimary: ").append(isPrimary).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
