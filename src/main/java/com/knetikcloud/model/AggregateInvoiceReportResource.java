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
public class AggregateInvoiceReportResource {
  
  @SerializedName("count")
  private Long count = null;
  @SerializedName("date")
  private String date = null;
  @SerializedName("revenue")
  private Double revenue = null;
  @SerializedName("user_count")
  private Long userCount = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getRevenue() {
    return revenue;
  }
  public void setRevenue(Double revenue) {
    this.revenue = revenue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getUserCount() {
    return userCount;
  }
  public void setUserCount(Long userCount) {
    this.userCount = userCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateInvoiceReportResource aggregateInvoiceReportResource = (AggregateInvoiceReportResource) o;
    return (this.count == null ? aggregateInvoiceReportResource.count == null : this.count.equals(aggregateInvoiceReportResource.count)) &&
        (this.date == null ? aggregateInvoiceReportResource.date == null : this.date.equals(aggregateInvoiceReportResource.date)) &&
        (this.revenue == null ? aggregateInvoiceReportResource.revenue == null : this.revenue.equals(aggregateInvoiceReportResource.revenue)) &&
        (this.userCount == null ? aggregateInvoiceReportResource.userCount == null : this.userCount.equals(aggregateInvoiceReportResource.userCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.count == null ? 0: this.count.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.revenue == null ? 0: this.revenue.hashCode());
    result = 31 * result + (this.userCount == null ? 0: this.userCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateInvoiceReportResource {\n");
    
    sb.append("  count: ").append(count).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  revenue: ").append(revenue).append("\n");
    sb.append("  userCount: ").append(userCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}