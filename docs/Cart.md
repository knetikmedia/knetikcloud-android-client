
# Cart

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableShippingOptions** | [**List&lt;CartShippingOption&gt;**](CartShippingOption.md) |  |  [optional]
**countryTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**coupons** | [**List&lt;CouponDefinition&gt;**](CouponDefinition.md) |  |  [optional]
**created** | **Long** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**discountTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**errorCode** | **Integer** |  |  [optional]
**errorMessage** | **String** |  |  [optional]
**grandTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**id** | **String** |  |  [optional]
**invoiceId** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**items** | [**List&lt;CartLineItem&gt;**](CartLineItem.md) |  |  [optional]
**owner** | **Integer** |  |  [optional]
**selectedShippingOptions** | [**List&lt;CartShippingOption&gt;**](CartShippingOption.md) |  |  [optional]
**shippable** | **Boolean** |  |  [optional]
**shippingAddress** | [**CartShippingAddressRequest**](CartShippingAddressRequest.md) |  |  [optional]
**shippingCost** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**stateTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**subtotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**updated** | **Long** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
PROCESSING | &quot;processing&quot;
CLOSED | &quot;closed&quot;
ONHOLD | &quot;onhold&quot;



