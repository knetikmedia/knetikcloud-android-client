
# RefundRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The amount to refund. If left off, will refund the remaining balance of the transaction or specific item balance (if SKU provided), whichever is less. |  [optional]
**bundleSku** | **String** | The SKU of a bundle item from the invoice that the target item is within. |  [optional]
**notes** | **String** | Notes about or reason for the refund | 
**sku** | **String** | The SKU of a specific item from the invoice to refund. Affects the maximum refund amount (not to exceed the price of this item times quantity on invoice). Transaction must be tied to an invoice if used. |  [optional]



