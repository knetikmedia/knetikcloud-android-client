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
import com.knetikcloud.model.Behavior;
import com.knetikcloud.model.Item;
import com.knetikcloud.model.Property;
import com.knetikcloud.model.Sku;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * StoreItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T17:12:21.889-04:00")
public class StoreItem extends Item {
  @SerializedName("displayable")
  private Boolean displayable = null;

  @SerializedName("geo_country_list")
  private List<String> geoCountryList = null;

  /**
   * Whether to use the geo_country_list as a black list or white list for item geographical availability
   */
  @JsonAdapter(GeoPolicyTypeEnum.Adapter.class)
  public enum GeoPolicyTypeEnum {
    WHITELIST("whitelist"),
    
    BLACKLIST("blacklist");

    private String value;

    GeoPolicyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GeoPolicyTypeEnum fromValue(String text) {
      for (GeoPolicyTypeEnum b : GeoPolicyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GeoPolicyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GeoPolicyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GeoPolicyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GeoPolicyTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("geo_policy_type")
  private GeoPolicyTypeEnum geoPolicyType = null;

  @SerializedName("shipping_tier")
  private Integer shippingTier = null;

  @SerializedName("skus")
  private List<Sku> skus = new ArrayList<Sku>();

  @SerializedName("store_end")
  private Long storeEnd = null;

  @SerializedName("store_start")
  private Long storeStart = null;

  @SerializedName("vendor_id")
  private Integer vendorId = null;

  public StoreItem displayable(Boolean displayable) {
    this.displayable = displayable;
    return this;
  }

   /**
   * Whether or not the item is currently displayable.  Default &#x3D; true
   * @return displayable
  **/
  @ApiModelProperty(example = "false", value = "Whether or not the item is currently displayable.  Default = true")
  public Boolean isDisplayable() {
    return displayable;
  }

  public void setDisplayable(Boolean displayable) {
    this.displayable = displayable;
  }

  public StoreItem geoCountryList(List<String> geoCountryList) {
    this.geoCountryList = geoCountryList;
    return this;
  }

  public StoreItem addGeoCountryListItem(String geoCountryListItem) {
    if (this.geoCountryList == null) {
      this.geoCountryList = new ArrayList<String>();
    }
    this.geoCountryList.add(geoCountryListItem);
    return this;
  }

   /**
   * A list of country ID to include in the blacklist/whitelist geo policy
   * @return geoCountryList
  **/
  @ApiModelProperty(value = "A list of country ID to include in the blacklist/whitelist geo policy")
  public List<String> getGeoCountryList() {
    return geoCountryList;
  }

  public void setGeoCountryList(List<String> geoCountryList) {
    this.geoCountryList = geoCountryList;
  }

  public StoreItem geoPolicyType(GeoPolicyTypeEnum geoPolicyType) {
    this.geoPolicyType = geoPolicyType;
    return this;
  }

   /**
   * Whether to use the geo_country_list as a black list or white list for item geographical availability
   * @return geoPolicyType
  **/
  @ApiModelProperty(value = "Whether to use the geo_country_list as a black list or white list for item geographical availability")
  public GeoPolicyTypeEnum getGeoPolicyType() {
    return geoPolicyType;
  }

  public void setGeoPolicyType(GeoPolicyTypeEnum geoPolicyType) {
    this.geoPolicyType = geoPolicyType;
  }

  public StoreItem shippingTier(Integer shippingTier) {
    this.shippingTier = shippingTier;
    return this;
  }

   /**
   * Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default &#x3D; 0
   * @return shippingTier
  **/
  @ApiModelProperty(value = "Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default = 0")
  public Integer getShippingTier() {
    return shippingTier;
  }

  public void setShippingTier(Integer shippingTier) {
    this.shippingTier = shippingTier;
  }

  public StoreItem skus(List<Sku> skus) {
    this.skus = skus;
    return this;
  }

  public StoreItem addSkusItem(Sku skusItem) {
    this.skus.add(skusItem);
    return this;
  }

   /**
   * The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart
   * @return skus
  **/
  @ApiModelProperty(required = true, value = "The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart")
  public List<Sku> getSkus() {
    return skus;
  }

  public void setSkus(List<Sku> skus) {
    this.skus = skus;
  }

  public StoreItem storeEnd(Long storeEnd) {
    this.storeEnd = storeEnd;
    return this;
  }

   /**
   * The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store
   * @return storeEnd
  **/
  @ApiModelProperty(value = "The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store")
  public Long getStoreEnd() {
    return storeEnd;
  }

  public void setStoreEnd(Long storeEnd) {
    this.storeEnd = storeEnd;
  }

  public StoreItem storeStart(Long storeStart) {
    this.storeStart = storeStart;
    return this;
  }

   /**
   * The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately
   * @return storeStart
  **/
  @ApiModelProperty(value = "The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately")
  public Long getStoreStart() {
    return storeStart;
  }

  public void setStoreStart(Long storeStart) {
    this.storeStart = storeStart;
  }

  public StoreItem vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * The vendor who provides the item
   * @return vendorId
  **/
  @ApiModelProperty(required = true, value = "The vendor who provides the item")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreItem storeItem = (StoreItem) o;
    return Objects.equals(this.displayable, storeItem.displayable) &&
        Objects.equals(this.geoCountryList, storeItem.geoCountryList) &&
        Objects.equals(this.geoPolicyType, storeItem.geoPolicyType) &&
        Objects.equals(this.shippingTier, storeItem.shippingTier) &&
        Objects.equals(this.skus, storeItem.skus) &&
        Objects.equals(this.storeEnd, storeItem.storeEnd) &&
        Objects.equals(this.storeStart, storeItem.storeStart) &&
        Objects.equals(this.vendorId, storeItem.vendorId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayable, geoCountryList, geoPolicyType, shippingTier, skus, storeEnd, storeStart, vendorId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    displayable: ").append(toIndentedString(displayable)).append("\n");
    sb.append("    geoCountryList: ").append(toIndentedString(geoCountryList)).append("\n");
    sb.append("    geoPolicyType: ").append(toIndentedString(geoPolicyType)).append("\n");
    sb.append("    shippingTier: ").append(toIndentedString(shippingTier)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
    sb.append("    storeEnd: ").append(toIndentedString(storeEnd)).append("\n");
    sb.append("    storeStart: ").append(toIndentedString(storeStart)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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

