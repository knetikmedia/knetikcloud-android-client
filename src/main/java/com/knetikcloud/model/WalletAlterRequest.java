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

/**
 * WalletAlterRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T16:56:09.934-05:00")
public class WalletAlterRequest {
  @SerializedName("delta")
  private Double delta = null;

  @SerializedName("invoice_id")
  private Integer invoiceId = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("type")
  private String type = null;

  public WalletAlterRequest delta(Double delta) {
    this.delta = delta;
    return this;
  }

   /**
   * The amount of currency to add/remove. positive to add, negative to remove
   * @return delta
  **/
  @ApiModelProperty(required = true, value = "The amount of currency to add/remove. positive to add, negative to remove")
  public Double getDelta() {
    return delta;
  }

  public void setDelta(Double delta) {
    this.delta = delta;
  }

  public WalletAlterRequest invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The id of an invoice to attribute the transaction to
   * @return invoiceId
  **/
  @ApiModelProperty(value = "The id of an invoice to attribute the transaction to")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public WalletAlterRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The admin entered or system generated reason
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "The admin entered or system generated reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public WalletAlterRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The transaction type to allow for search/etc
   * @return type
  **/
  @ApiModelProperty(value = "The transaction type to allow for search/etc")
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
    WalletAlterRequest walletAlterRequest = (WalletAlterRequest) o;
    return Objects.equals(this.delta, walletAlterRequest.delta) &&
        Objects.equals(this.invoiceId, walletAlterRequest.invoiceId) &&
        Objects.equals(this.reason, walletAlterRequest.reason) &&
        Objects.equals(this.type, walletAlterRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delta, invoiceId, reason, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletAlterRequest {\n");
    
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

