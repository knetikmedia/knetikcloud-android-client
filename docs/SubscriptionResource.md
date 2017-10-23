
# SubscriptionResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalProperties** | [**Map&lt;String, Property&gt;**](Property.md) | The additional properties for the subscription |  [optional]
**availability** | [**AvailabilityEnum**](#AvailabilityEnum) | Who can purchase this subscription |  [optional]
**behaviors** | [**List&lt;Behavior&gt;**](Behavior.md) | The behaviors linked to the item, describing various options and interactions. May not be included in item lists |  [optional]
**category** | **String** | The category of the subscription |  [optional]
**consolidationDayOfMonth** | **Integer** | The day of the month 1..31 this subscription will renew |  [optional]
**createdDate** | **Long** | The date the item was created, unix timestamp in seconds |  [optional]
**displayable** | **Boolean** | Whether or not the item is currently visible to users. Does not block purchase; Use store_start or store_end to block purchase.  Default &#x3D; true |  [optional]
**geoCountryList** | **List&lt;String&gt;** | The geo country list for the subscription |  [optional]
**geoPolicyType** | [**GeoPolicyTypeEnum**](#GeoPolicyTypeEnum) | The geo policy type for the subscription |  [optional]
**id** | **Integer** | The id of the item |  [optional]
**longDescription** | **String** | A long description of the subscription |  [optional]
**name** | **String** | The name of the item | 
**plans** | [**List&lt;SubscriptionPlanResource&gt;**](SubscriptionPlanResource.md) | The billing options for this subscription |  [optional]
**shortDescription** | **String** | A short description of the subscription.  Max 255 characters |  [optional]
**sort** | **Integer** | A number to use in sorting items.  Default 500 |  [optional]
**storeEnd** | **Long** | Used to schedule removal from store.  Null means the subscription will never be removed |  [optional]
**storeStart** | **Long** | Used to schedule appearance in store.  Null means the subscription will appear now |  [optional]
**tags** | **List&lt;String&gt;** | The tags for the subscription |  [optional]
**template** | **String** | The template being used |  [optional]
**uniqueKey** | **String** | The unique key of the subscription |  [optional]
**updatedDate** | **Long** | The date the item was last updated |  [optional]
**vendorId** | **Integer** | The id of the vendor | 


<a name="AvailabilityEnum"></a>
## Enum: AvailabilityEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
NEW_SUBSCRIBERS | &quot;new_subscribers&quot;


<a name="GeoPolicyTypeEnum"></a>
## Enum: GeoPolicyTypeEnum
Name | Value
---- | -----
WHITELIST | &quot;whitelist&quot;
BLACKLIST | &quot;blacklist&quot;



