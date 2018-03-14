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
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserInventoryResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:02:11.431-04:00")
public class UserInventoryResource {
  @SerializedName("behavior_data")
  private Object behaviorData = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("expires")
  private Long expires = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("invoice_id")
  private Integer invoiceId = null;

  @SerializedName("item_id")
  private Integer itemId = null;

  @SerializedName("item_name")
  private String itemName = null;

  @SerializedName("item_type_hint")
  private String itemTypeHint = null;

  /**
   * The status of the inventory. Pending inventory is not yet ready for use. Inactive inventory has expired or been used up
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("user")
  private SimpleUserResource user = null;

  public UserInventoryResource behaviorData(Object behaviorData) {
    this.behaviorData = behaviorData;
    return this;
  }

   /**
   * A map of data for behaviors
   * @return behaviorData
  **/
  @ApiModelProperty(value = "A map of data for behaviors")
  public Object getBehaviorData() {
    return behaviorData;
  }

  public void setBehaviorData(Object behaviorData) {
    this.behaviorData = behaviorData;
  }

   /**
   * The date/time this resource was created in seconds since epoch
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

  public UserInventoryResource expires(Long expires) {
    this.expires = expires;
    return this;
  }

   /**
   * The date/time this resource exires in seconds since epoch. Null for no expiration. For subscriptions, this is the end of the &#39;grace period&#39; if left unpaid
   * @return expires
  **/
  @ApiModelProperty(value = "The date/time this resource exires in seconds since epoch. Null for no expiration. For subscriptions, this is the end of the 'grace period' if left unpaid")
  public Long getExpires() {
    return expires;
  }

  public void setExpires(Long expires) {
    this.expires = expires;
  }

   /**
   * The id of the inventory
   * @return id
  **/
  @ApiModelProperty(value = "The id of the inventory")
  public Integer getId() {
    return id;
  }

  public UserInventoryResource invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The id of the invoice that resulted in this inventory, if any
   * @return invoiceId
  **/
  @ApiModelProperty(value = "The id of the invoice that resulted in this inventory, if any")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public UserInventoryResource itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The id of the item
   * @return itemId
  **/
  @ApiModelProperty(value = "The id of the item")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public UserInventoryResource itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

   /**
   * The name of the item
   * @return itemName
  **/
  @ApiModelProperty(value = "The name of the item")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public UserInventoryResource itemTypeHint(String itemTypeHint) {
    this.itemTypeHint = itemTypeHint;
    return this;
  }

   /**
   * The type hint of the item
   * @return itemTypeHint
  **/
  @ApiModelProperty(value = "The type hint of the item")
  public String getItemTypeHint() {
    return itemTypeHint;
  }

  public void setItemTypeHint(String itemTypeHint) {
    this.itemTypeHint = itemTypeHint;
  }

  public UserInventoryResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the inventory. Pending inventory is not yet ready for use. Inactive inventory has expired or been used up
   * @return status
  **/
  @ApiModelProperty(value = "The status of the inventory. Pending inventory is not yet ready for use. Inactive inventory has expired or been used up")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * The date/time this resource was last updated in seconds since epoch
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public UserInventoryResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The id of the user this inventory belongs to
   * @return user
  **/
  @ApiModelProperty(value = "The id of the user this inventory belongs to")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInventoryResource userInventoryResource = (UserInventoryResource) o;
    return Objects.equals(this.behaviorData, userInventoryResource.behaviorData) &&
        Objects.equals(this.createdDate, userInventoryResource.createdDate) &&
        Objects.equals(this.expires, userInventoryResource.expires) &&
        Objects.equals(this.id, userInventoryResource.id) &&
        Objects.equals(this.invoiceId, userInventoryResource.invoiceId) &&
        Objects.equals(this.itemId, userInventoryResource.itemId) &&
        Objects.equals(this.itemName, userInventoryResource.itemName) &&
        Objects.equals(this.itemTypeHint, userInventoryResource.itemTypeHint) &&
        Objects.equals(this.status, userInventoryResource.status) &&
        Objects.equals(this.updatedDate, userInventoryResource.updatedDate) &&
        Objects.equals(this.user, userInventoryResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behaviorData, createdDate, expires, id, invoiceId, itemId, itemName, itemTypeHint, status, updatedDate, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInventoryResource {\n");
    
    sb.append("    behaviorData: ").append(toIndentedString(behaviorData)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemTypeHint: ").append(toIndentedString(itemTypeHint)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

