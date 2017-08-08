
# InventorySubscriptionResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billDate** | **Long** | The date the subscription will be billed |  [optional]
**credit** | **Double** | A credit of money already applied to a subscription for the next bill, or a debt if negative |  [optional]
**creditLog** | [**List&lt;SubscriptionCreditResource&gt;**](SubscriptionCreditResource.md) | A record of past and present credit/debt changes |  [optional]
**graceEnd** | **Long** | The date the grace period ends |  [optional]
**inventoryId** | **Integer** | The id of the inventory |  [optional]
**inventoryStatus** | [**InventoryStatusEnum**](#InventoryStatusEnum) | The inventory status object |  [optional]
**itemId** | **Integer** | The id of the item |  [optional]
**paymentMethod** | [**PaymentMethodResource**](PaymentMethodResource.md) | The payment method object |  [optional]
**priceOverride** | **Double** | The recurring price that has been set to override the base price. Null if not overriding |  [optional]
**priceOverrideReason** | **String** | An explanation for the reason the price is being overridden |  [optional]
**recurringPrice** | **Double** | The default recurring price |  [optional]
**sku** | **String** | The recurring sku of the subscription |  [optional]
**startDate** | **Long** | The date the subscription will start |  [optional]
**subscriptionStatus** | **Integer** | The status of the subscription |  [optional]
**user** | [**SimpleUserResource**](SimpleUserResource.md) | The user |  [optional]


<a name="InventoryStatusEnum"></a>
## Enum: InventoryStatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;



