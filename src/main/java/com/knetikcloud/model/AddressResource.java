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
 * AddressResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T18:00:14.521-04:00")
public class AddressResource {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("state_code")
  private String stateCode = null;

  public AddressResource address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * The first line of the address
   * @return address1
  **/
  @ApiModelProperty(required = true, value = "The first line of the address")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public AddressResource address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * A second line of the address
   * @return address2
  **/
  @ApiModelProperty(value = "A second line of the address")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public AddressResource city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city
   * @return city
  **/
  @ApiModelProperty(required = true, value = "The city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressResource countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The iso3 code for the country
   * @return countryCode
  **/
  @ApiModelProperty(required = true, value = "The iso3 code for the country")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AddressResource postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code
   * @return postalCode
  **/
  @ApiModelProperty(value = "The postal code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AddressResource stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * The code for the state. Required if the country has states/provinces/equivalent
   * @return stateCode
  **/
  @ApiModelProperty(value = "The code for the state. Required if the country has states/provinces/equivalent")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressResource addressResource = (AddressResource) o;
    return Objects.equals(this.address1, addressResource.address1) &&
        Objects.equals(this.address2, addressResource.address2) &&
        Objects.equals(this.city, addressResource.city) &&
        Objects.equals(this.countryCode, addressResource.countryCode) &&
        Objects.equals(this.postalCode, addressResource.postalCode) &&
        Objects.equals(this.stateCode, addressResource.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, countryCode, postalCode, stateCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressResource {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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

