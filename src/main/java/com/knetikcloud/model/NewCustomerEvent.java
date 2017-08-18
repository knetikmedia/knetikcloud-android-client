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
import com.knetikcloud.model.CustomerConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NewCustomerEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-18T11:17:24.388-04:00")
public class NewCustomerEvent extends BroadcastableEvent {
  @SerializedName("customer_config")
  private CustomerConfig customerConfig = null;

  public NewCustomerEvent customerConfig(CustomerConfig customerConfig) {
    this.customerConfig = customerConfig;
    return this;
  }

   /**
   * Get customerConfig
   * @return customerConfig
  **/
  @ApiModelProperty(value = "")
  public CustomerConfig getCustomerConfig() {
    return customerConfig;
  }

  public void setCustomerConfig(CustomerConfig customerConfig) {
    this.customerConfig = customerConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCustomerEvent newCustomerEvent = (NewCustomerEvent) o;
    return Objects.equals(this.customerConfig, newCustomerEvent.customerConfig) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerConfig, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCustomerEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    customerConfig: ").append(toIndentedString(customerConfig)).append("\n");
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

