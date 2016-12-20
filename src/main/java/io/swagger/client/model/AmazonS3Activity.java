/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
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
public class AmazonS3Activity {
  
  @SerializedName("action")
  private String action = null;
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("filename")
  private String filename = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("object_key")
  private String objectKey = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("user_id")
  private Integer userId = null;

  /**
   * S3 action (i.e., 'PUT') associated with the activity
   **/
  @ApiModelProperty(value = "S3 action (i.e., 'PUT') associated with the activity")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Date the resource was created in S3
   **/
  @ApiModelProperty(value = "Date the resource was created in S3")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * Name of the file being processed as a resource in S3
   **/
  @ApiModelProperty(value = "Name of the file being processed as a resource in S3")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * Unique id of the S3 activity
   **/
  @ApiModelProperty(value = "Unique id of the S3 activity")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * S3 object key for the resource
   **/
  @ApiModelProperty(value = "S3 object key for the resource")
  public String getObjectKey() {
    return objectKey;
  }
  public void setObjectKey(String objectKey) {
    this.objectKey = objectKey;
  }

  /**
   * URL for accessing the S3 resource
   **/
  @ApiModelProperty(value = "URL for accessing the S3 resource")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The id of the user that created this S3 activity
   **/
  @ApiModelProperty(value = "The id of the user that created this S3 activity")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmazonS3Activity amazonS3Activity = (AmazonS3Activity) o;
    return (this.action == null ? amazonS3Activity.action == null : this.action.equals(amazonS3Activity.action)) &&
        (this.createdDate == null ? amazonS3Activity.createdDate == null : this.createdDate.equals(amazonS3Activity.createdDate)) &&
        (this.filename == null ? amazonS3Activity.filename == null : this.filename.equals(amazonS3Activity.filename)) &&
        (this.id == null ? amazonS3Activity.id == null : this.id.equals(amazonS3Activity.id)) &&
        (this.objectKey == null ? amazonS3Activity.objectKey == null : this.objectKey.equals(amazonS3Activity.objectKey)) &&
        (this.url == null ? amazonS3Activity.url == null : this.url.equals(amazonS3Activity.url)) &&
        (this.userId == null ? amazonS3Activity.userId == null : this.userId.equals(amazonS3Activity.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.action == null ? 0: this.action.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.filename == null ? 0: this.filename.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.objectKey == null ? 0: this.objectKey.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonS3Activity {\n");
    
    sb.append("  action: ").append(action).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  filename: ").append(filename).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  objectKey: ").append(objectKey).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
