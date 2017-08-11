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
 * CartItemRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-11T13:41:51.097-04:00")
public class CartItemRequest {
  @SerializedName("affiliate_key")
  private String affiliateKey = null;

  @SerializedName("catalog_sku")
  private String catalogSku = null;

  @SerializedName("price_override")
  private Double priceOverride = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public CartItemRequest affiliateKey(String affiliateKey) {
    this.affiliateKey = affiliateKey;
    return this;
  }

   /**
   * The affiliate key of the item
   * @return affiliateKey
  **/
  @ApiModelProperty(value = "The affiliate key of the item")
  public String getAffiliateKey() {
    return affiliateKey;
  }

  public void setAffiliateKey(String affiliateKey) {
    this.affiliateKey = affiliateKey;
  }

  public CartItemRequest catalogSku(String catalogSku) {
    this.catalogSku = catalogSku;
    return this;
  }

   /**
   * The catalog SKU of the item
   * @return catalogSku
  **/
  @ApiModelProperty(required = true, value = "The catalog SKU of the item")
  public String getCatalogSku() {
    return catalogSku;
  }

  public void setCatalogSku(String catalogSku) {
    this.catalogSku = catalogSku;
  }

  public CartItemRequest priceOverride(Double priceOverride) {
    this.priceOverride = priceOverride;
    return this;
  }

   /**
   * Allows to override the price of an item, if the behavior configuration permits it
   * @return priceOverride
  **/
  @ApiModelProperty(required = true, value = "Allows to override the price of an item, if the behavior configuration permits it")
  public Double getPriceOverride() {
    return priceOverride;
  }

  public void setPriceOverride(Double priceOverride) {
    this.priceOverride = priceOverride;
  }

  public CartItemRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the item
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity of the item")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemRequest cartItemRequest = (CartItemRequest) o;
    return Objects.equals(this.affiliateKey, cartItemRequest.affiliateKey) &&
        Objects.equals(this.catalogSku, cartItemRequest.catalogSku) &&
        Objects.equals(this.priceOverride, cartItemRequest.priceOverride) &&
        Objects.equals(this.quantity, cartItemRequest.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateKey, catalogSku, priceOverride, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemRequest {\n");
    
    sb.append("    affiliateKey: ").append(toIndentedString(affiliateKey)).append("\n");
    sb.append("    catalogSku: ").append(toIndentedString(catalogSku)).append("\n");
    sb.append("    priceOverride: ").append(toIndentedString(priceOverride)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

