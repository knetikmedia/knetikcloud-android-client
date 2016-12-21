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
public class ActivityEntitlementResource {
  
  @SerializedName("currency_code")
  private String currencyCode = null;
  @SerializedName("item_id")
  private Integer itemId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("price")
  private Double price = null;
  @SerializedName("sku")
  private String sku = null;

  /**
   * The ISO3 currency code the price is in, if available
   **/
  @ApiModelProperty(value = "The ISO3 currency code the price is in, if available")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The id of the entitlement item
   **/
  @ApiModelProperty(required = true, value = "The id of the entitlement item")
  public Integer getItemId() {
    return itemId;
  }
  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  /**
   * The name of the entitlement item
   **/
  @ApiModelProperty(value = "The name of the entitlement item")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The price of the sku, if available
   **/
  @ApiModelProperty(value = "The price of the sku, if available")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   * The sku id, if available. If multiple are available, then first one is returned
   **/
  @ApiModelProperty(value = "The sku id, if available. If multiple are available, then first one is returned")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityEntitlementResource activityEntitlementResource = (ActivityEntitlementResource) o;
    return (this.currencyCode == null ? activityEntitlementResource.currencyCode == null : this.currencyCode.equals(activityEntitlementResource.currencyCode)) &&
        (this.itemId == null ? activityEntitlementResource.itemId == null : this.itemId.equals(activityEntitlementResource.itemId)) &&
        (this.name == null ? activityEntitlementResource.name == null : this.name.equals(activityEntitlementResource.name)) &&
        (this.price == null ? activityEntitlementResource.price == null : this.price.equals(activityEntitlementResource.price)) &&
        (this.sku == null ? activityEntitlementResource.sku == null : this.sku.equals(activityEntitlementResource.sku));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.currencyCode == null ? 0: this.currencyCode.hashCode());
    result = 31 * result + (this.itemId == null ? 0: this.itemId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityEntitlementResource {\n");
    
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  itemId: ").append(itemId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
