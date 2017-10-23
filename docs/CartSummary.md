
# CartSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdDate** | **Long** | The date/time this resource was created in seconds since unix epoch |  [optional]
**currencyCode** | **String** | The unique id code for the currency used in the cart |  [optional]
**grandTotal** | [**BigDecimal**](BigDecimal.md) | The grand total for the cart |  [optional]
**id** | **String** | The unique ID for the cart |  [optional]
**invoiceId** | [**BigDecimal**](BigDecimal.md) | The ID of the invoice associated with this cart |  [optional]
**itemsInCart** | **Integer** | The number of items in the cart |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the cart |  [optional]
**subtotal** | [**BigDecimal**](BigDecimal.md) | The subtotal of all items in the cart |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
PROCESSING | &quot;processing&quot;
CLOSED | &quot;closed&quot;
ONHOLD | &quot;onhold&quot;



