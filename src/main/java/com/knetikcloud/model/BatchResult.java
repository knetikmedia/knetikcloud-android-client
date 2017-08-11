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
import com.knetikcloud.model.BatchReturn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BatchResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-11T13:41:51.097-04:00")
public class BatchResult {
  @SerializedName("batch_return")
  private List<BatchReturn> batchReturn = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public BatchResult batchReturn(List<BatchReturn> batchReturn) {
    this.batchReturn = batchReturn;
    return this;
  }

  public BatchResult addBatchReturnItem(BatchReturn batchReturnItem) {
    if (this.batchReturn == null) {
      this.batchReturn = new ArrayList<BatchReturn>();
    }
    this.batchReturn.add(batchReturnItem);
    return this;
  }

   /**
   * List of batch responses.  Returns in the order requested
   * @return batchReturn
  **/
  @ApiModelProperty(value = "List of batch responses.  Returns in the order requested")
  public List<BatchReturn> getBatchReturn() {
    return batchReturn;
  }

  public void setBatchReturn(List<BatchReturn> batchReturn) {
    this.batchReturn = batchReturn;
  }

   /**
   * The date the batch call started processing
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the batch call started processing")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The token to use at the /batch/{token} endpoint if the request times out
   * @return id
  **/
  @ApiModelProperty(value = "The token to use at the /batch/{token} endpoint if the request times out")
  public String getId() {
    return id;
  }

   /**
   * The date the batch call finished processing
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the batch call finished processing")
  public Long getUpdatedDate() {
    return updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResult batchResult = (BatchResult) o;
    return Objects.equals(this.batchReturn, batchResult.batchReturn) &&
        Objects.equals(this.createdDate, batchResult.createdDate) &&
        Objects.equals(this.id, batchResult.id) &&
        Objects.equals(this.updatedDate, batchResult.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchReturn, createdDate, id, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResult {\n");
    
    sb.append("    batchReturn: ").append(toIndentedString(batchReturn)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

