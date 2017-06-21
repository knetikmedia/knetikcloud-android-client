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

import com.knetikcloud.model.BroadcastableEvent;
import com.knetikcloud.model.CustomerConfig;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class NewCustomerEvent extends BroadcastableEvent {
  
  @SerializedName("client")
  private String client = null;
  @SerializedName("customer")
  private String customer = null;
  @SerializedName("do_not_broadcast")
  private Boolean doNotBroadcast = null;
  @SerializedName("section")
  private String section = null;
  @SerializedName("source")
  private Object source = null;
  @SerializedName("specifics")
  private String specifics = null;
  @SerializedName("synchronous")
  private Boolean synchronous = null;
  @SerializedName("timestamp")
  private Long timestamp = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("customer_config")
  private CustomerConfig customerConfig = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClient() {
    return client;
  }
  public void setClient(String client) {
    this.client = client;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCustomer() {
    return customer;
  }
  public void setCustomer(String customer) {
    this.customer = customer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDoNotBroadcast() {
    return doNotBroadcast;
  }
  public void setDoNotBroadcast(Boolean doNotBroadcast) {
    this.doNotBroadcast = doNotBroadcast;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSection() {
    return section;
  }
  public void setSection(String section) {
    this.section = section;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getSource() {
    return source;
  }
  public void setSource(Object source) {
    this.source = source;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSpecifics() {
    return specifics;
  }
  public void setSpecifics(String specifics) {
    this.specifics = specifics;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSynchronous() {
    return synchronous;
  }
  public void setSynchronous(Boolean synchronous) {
    this.synchronous = synchronous;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * The type of the event. Used for polymorphic type recognition and thus must match an expected type
   **/
  @ApiModelProperty(required = true, value = "The type of the event. Used for polymorphic type recognition and thus must match an expected type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CustomerConfig getCustomerConfig() {
    return customerConfig;
  }
  public void setCustomerConfig(CustomerConfig customerConfig) {
    this.customerConfig = customerConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCustomerEvent newCustomerEvent = (NewCustomerEvent) o;
    return (this.client == null ? newCustomerEvent.client == null : this.client.equals(newCustomerEvent.client)) &&
        (this.customer == null ? newCustomerEvent.customer == null : this.customer.equals(newCustomerEvent.customer)) &&
        (this.doNotBroadcast == null ? newCustomerEvent.doNotBroadcast == null : this.doNotBroadcast.equals(newCustomerEvent.doNotBroadcast)) &&
        (this.section == null ? newCustomerEvent.section == null : this.section.equals(newCustomerEvent.section)) &&
        (this.source == null ? newCustomerEvent.source == null : this.source.equals(newCustomerEvent.source)) &&
        (this.specifics == null ? newCustomerEvent.specifics == null : this.specifics.equals(newCustomerEvent.specifics)) &&
        (this.synchronous == null ? newCustomerEvent.synchronous == null : this.synchronous.equals(newCustomerEvent.synchronous)) &&
        (this.timestamp == null ? newCustomerEvent.timestamp == null : this.timestamp.equals(newCustomerEvent.timestamp)) &&
        (this.type == null ? newCustomerEvent.type == null : this.type.equals(newCustomerEvent.type)) &&
        (this.customerConfig == null ? newCustomerEvent.customerConfig == null : this.customerConfig.equals(newCustomerEvent.customerConfig));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.client == null ? 0: this.client.hashCode());
    result = 31 * result + (this.customer == null ? 0: this.customer.hashCode());
    result = 31 * result + (this.doNotBroadcast == null ? 0: this.doNotBroadcast.hashCode());
    result = 31 * result + (this.section == null ? 0: this.section.hashCode());
    result = 31 * result + (this.source == null ? 0: this.source.hashCode());
    result = 31 * result + (this.specifics == null ? 0: this.specifics.hashCode());
    result = 31 * result + (this.synchronous == null ? 0: this.synchronous.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.customerConfig == null ? 0: this.customerConfig.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCustomerEvent {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  client: ").append(client).append("\n");
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("  doNotBroadcast: ").append(doNotBroadcast).append("\n");
    sb.append("  section: ").append(section).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  specifics: ").append(specifics).append("\n");
    sb.append("  synchronous: ").append(synchronous).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  customerConfig: ").append(customerConfig).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
