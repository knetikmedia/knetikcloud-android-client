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

package io.swagger.client.model;

import io.swagger.client.model.PaymentMethodTypeResource;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PaymentMethodResource {
  
  @SerializedName("created_date")
  private Long createdDate = null;
  @SerializedName("default")
  private Boolean _default = null;
  @SerializedName("disabled")
  private Boolean disabled = null;
  @SerializedName("expiration_date")
  private Long expirationDate = null;
  @SerializedName("expiration_month")
  private Integer expirationMonth = null;
  @SerializedName("expiration_year")
  private Integer expirationYear = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("last4")
  private String last4 = null;
  @SerializedName("long_description")
  private String longDescription = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("payment_method_type")
  private PaymentMethodTypeResource paymentMethodType = null;
  public enum PaymentTypeEnum {
     card,  bank_account, 
  };
  @SerializedName("payment_type")
  private PaymentTypeEnum paymentType = null;
  @SerializedName("short_description")
  private String shortDescription = null;
  @SerializedName("sort")
  private Integer sort = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("unique_key")
  private String uniqueKey = null;
  @SerializedName("updated_date")
  private Long updatedDate = null;
  @SerializedName("user_id")
  private Integer userId = null;
  @SerializedName("verified")
  private Boolean verified = null;

  /**
   * The date/time this resource was created in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDefault() {
    return _default;
  }
  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  /**
   * Whether this payment method is disabled or not
   **/
  @ApiModelProperty(value = "Whether this payment method is disabled or not")
  public Boolean getDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  /**
   * The expiration date for the payment method, expressed as seconds since epoch. Typically used for credit card payment methods
   **/
  @ApiModelProperty(value = "The expiration date for the payment method, expressed as seconds since epoch. Typically used for credit card payment methods")
  public Long getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  /**
   * The expiration month (1 - 12) for the payment method. Typically used for credit card payment methods
   **/
  @ApiModelProperty(value = "The expiration month (1 - 12) for the payment method. Typically used for credit card payment methods")
  public Integer getExpirationMonth() {
    return expirationMonth;
  }
  public void setExpirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  /**
   * The expiration year for the payment method. Typically used for credit card payment methods
   **/
  @ApiModelProperty(value = "The expiration year for the payment method. Typically used for credit card payment methods")
  public Integer getExpirationYear() {
    return expirationYear;
  }
  public void setExpirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
  }

  /**
   * The unique ID for that resource
   **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * The last 4 digits of the account number for the payment method. Typically used for credit card payment methods
   **/
  @ApiModelProperty(value = "The last 4 digits of the account number for the payment method. Typically used for credit card payment methods")
  public String getLast4() {
    return last4;
  }
  public void setLast4(String last4) {
    this.last4 = last4;
  }

  /**
   * The user friendly name of that resource. Defaults to blank string
   **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  /**
   * The user friendly name of that resource
   **/
  @ApiModelProperty(required = true, value = "The user friendly name of that resource")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The type of payment method. Must be a pre-existing value
   **/
  @ApiModelProperty(required = true, value = "The type of payment method. Must be a pre-existing value")
  public PaymentMethodTypeResource getPaymentMethodType() {
    return paymentMethodType;
  }
  public void setPaymentMethodType(PaymentMethodTypeResource paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  /**
   * The generic payment type. Default is card
   **/
  @ApiModelProperty(value = "The generic payment type. Default is card")
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }

  /**
   * The user friendly name of that resource. Defaults to blank string
   **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  /**
   * The sort value for the payment method
   **/
  @ApiModelProperty(value = "The sort value for the payment method")
  public Integer getSort() {
    return sort;
  }
  public void setSort(Integer sort) {
    this.sort = sort;
  }

  /**
   * The unique token for the payment method
   **/
  @ApiModelProperty(value = "The unique token for the payment method")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * An optional unique identifier
   **/
  @ApiModelProperty(value = "An optional unique identifier")
  public String getUniqueKey() {
    return uniqueKey;
  }
  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  /**
   * The date/time this resource was last updated in seconds since unix epoch
   **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  /**
   * The user's id. If null, indicates a shared payment method that any user can use (i.e., 'wallet')
   **/
  @ApiModelProperty(value = "The user's id. If null, indicates a shared payment method that any user can use (i.e., 'wallet')")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodResource paymentMethodResource = (PaymentMethodResource) o;
    return (this.createdDate == null ? paymentMethodResource.createdDate == null : this.createdDate.equals(paymentMethodResource.createdDate)) &&
        (this._default == null ? paymentMethodResource._default == null : this._default.equals(paymentMethodResource._default)) &&
        (this.disabled == null ? paymentMethodResource.disabled == null : this.disabled.equals(paymentMethodResource.disabled)) &&
        (this.expirationDate == null ? paymentMethodResource.expirationDate == null : this.expirationDate.equals(paymentMethodResource.expirationDate)) &&
        (this.expirationMonth == null ? paymentMethodResource.expirationMonth == null : this.expirationMonth.equals(paymentMethodResource.expirationMonth)) &&
        (this.expirationYear == null ? paymentMethodResource.expirationYear == null : this.expirationYear.equals(paymentMethodResource.expirationYear)) &&
        (this.id == null ? paymentMethodResource.id == null : this.id.equals(paymentMethodResource.id)) &&
        (this.last4 == null ? paymentMethodResource.last4 == null : this.last4.equals(paymentMethodResource.last4)) &&
        (this.longDescription == null ? paymentMethodResource.longDescription == null : this.longDescription.equals(paymentMethodResource.longDescription)) &&
        (this.name == null ? paymentMethodResource.name == null : this.name.equals(paymentMethodResource.name)) &&
        (this.paymentMethodType == null ? paymentMethodResource.paymentMethodType == null : this.paymentMethodType.equals(paymentMethodResource.paymentMethodType)) &&
        (this.paymentType == null ? paymentMethodResource.paymentType == null : this.paymentType.equals(paymentMethodResource.paymentType)) &&
        (this.shortDescription == null ? paymentMethodResource.shortDescription == null : this.shortDescription.equals(paymentMethodResource.shortDescription)) &&
        (this.sort == null ? paymentMethodResource.sort == null : this.sort.equals(paymentMethodResource.sort)) &&
        (this.token == null ? paymentMethodResource.token == null : this.token.equals(paymentMethodResource.token)) &&
        (this.uniqueKey == null ? paymentMethodResource.uniqueKey == null : this.uniqueKey.equals(paymentMethodResource.uniqueKey)) &&
        (this.updatedDate == null ? paymentMethodResource.updatedDate == null : this.updatedDate.equals(paymentMethodResource.updatedDate)) &&
        (this.userId == null ? paymentMethodResource.userId == null : this.userId.equals(paymentMethodResource.userId)) &&
        (this.verified == null ? paymentMethodResource.verified == null : this.verified.equals(paymentMethodResource.verified));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this._default == null ? 0: this._default.hashCode());
    result = 31 * result + (this.disabled == null ? 0: this.disabled.hashCode());
    result = 31 * result + (this.expirationDate == null ? 0: this.expirationDate.hashCode());
    result = 31 * result + (this.expirationMonth == null ? 0: this.expirationMonth.hashCode());
    result = 31 * result + (this.expirationYear == null ? 0: this.expirationYear.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.last4 == null ? 0: this.last4.hashCode());
    result = 31 * result + (this.longDescription == null ? 0: this.longDescription.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.paymentMethodType == null ? 0: this.paymentMethodType.hashCode());
    result = 31 * result + (this.paymentType == null ? 0: this.paymentType.hashCode());
    result = 31 * result + (this.shortDescription == null ? 0: this.shortDescription.hashCode());
    result = 31 * result + (this.sort == null ? 0: this.sort.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    result = 31 * result + (this.uniqueKey == null ? 0: this.uniqueKey.hashCode());
    result = 31 * result + (this.updatedDate == null ? 0: this.updatedDate.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.verified == null ? 0: this.verified.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodResource {\n");
    
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  _default: ").append(_default).append("\n");
    sb.append("  disabled: ").append(disabled).append("\n");
    sb.append("  expirationDate: ").append(expirationDate).append("\n");
    sb.append("  expirationMonth: ").append(expirationMonth).append("\n");
    sb.append("  expirationYear: ").append(expirationYear).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  last4: ").append(last4).append("\n");
    sb.append("  longDescription: ").append(longDescription).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  paymentMethodType: ").append(paymentMethodType).append("\n");
    sb.append("  paymentType: ").append(paymentType).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  uniqueKey: ").append(uniqueKey).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  verified: ").append(verified).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
