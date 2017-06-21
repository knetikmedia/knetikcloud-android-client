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
public class BroadcastableEvent {
  
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastableEvent broadcastableEvent = (BroadcastableEvent) o;
    return (this.client == null ? broadcastableEvent.client == null : this.client.equals(broadcastableEvent.client)) &&
        (this.customer == null ? broadcastableEvent.customer == null : this.customer.equals(broadcastableEvent.customer)) &&
        (this.doNotBroadcast == null ? broadcastableEvent.doNotBroadcast == null : this.doNotBroadcast.equals(broadcastableEvent.doNotBroadcast)) &&
        (this.section == null ? broadcastableEvent.section == null : this.section.equals(broadcastableEvent.section)) &&
        (this.source == null ? broadcastableEvent.source == null : this.source.equals(broadcastableEvent.source)) &&
        (this.specifics == null ? broadcastableEvent.specifics == null : this.specifics.equals(broadcastableEvent.specifics)) &&
        (this.synchronous == null ? broadcastableEvent.synchronous == null : this.synchronous.equals(broadcastableEvent.synchronous)) &&
        (this.timestamp == null ? broadcastableEvent.timestamp == null : this.timestamp.equals(broadcastableEvent.timestamp)) &&
        (this.type == null ? broadcastableEvent.type == null : this.type.equals(broadcastableEvent.type));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastableEvent {\n");
    
    sb.append("  client: ").append(client).append("\n");
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("  doNotBroadcast: ").append(doNotBroadcast).append("\n");
    sb.append("  section: ").append(section).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  specifics: ").append(specifics).append("\n");
    sb.append("  synchronous: ").append(synchronous).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
