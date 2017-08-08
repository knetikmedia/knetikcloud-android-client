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
import com.knetikcloud.model.BroadcastableEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CacheClearEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T17:12:21.889-04:00")
public class CacheClearEvent extends BroadcastableEvent {
  @SerializedName("customer_setup")
  private Boolean customerSetup = null;

  @SerializedName("customer_teardown")
  private Boolean customerTeardown = null;

  public CacheClearEvent customerSetup(Boolean customerSetup) {
    this.customerSetup = customerSetup;
    return this;
  }

   /**
   * Get customerSetup
   * @return customerSetup
  **/
  @ApiModelProperty(value = "")
  public Boolean isCustomerSetup() {
    return customerSetup;
  }

  public void setCustomerSetup(Boolean customerSetup) {
    this.customerSetup = customerSetup;
  }

  public CacheClearEvent customerTeardown(Boolean customerTeardown) {
    this.customerTeardown = customerTeardown;
    return this;
  }

   /**
   * Get customerTeardown
   * @return customerTeardown
  **/
  @ApiModelProperty(value = "")
  public Boolean isCustomerTeardown() {
    return customerTeardown;
  }

  public void setCustomerTeardown(Boolean customerTeardown) {
    this.customerTeardown = customerTeardown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheClearEvent cacheClearEvent = (CacheClearEvent) o;
    return Objects.equals(this.customerSetup, cacheClearEvent.customerSetup) &&
        Objects.equals(this.customerTeardown, cacheClearEvent.customerTeardown) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerSetup, customerTeardown, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheClearEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    customerSetup: ").append(toIndentedString(customerSetup)).append("\n");
    sb.append("    customerTeardown: ").append(toIndentedString(customerTeardown)).append("\n");
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

