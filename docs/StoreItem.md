
# StoreItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayable** | **Boolean** | Whether or not the item is currently displayable.  Default &#x3D; true |  [optional]
**geoCountryList** | **List&lt;String&gt;** | A list of country ID to include in the blacklist/whitelist geo policy |  [optional]
**geoPolicyType** | [**GeoPolicyTypeEnum**](#GeoPolicyTypeEnum) | Whether to use the geo_country_list as a black list or white list for item geographical availability |  [optional]
**shippingTier** | **Integer** | Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default &#x3D; 0 |  [optional]
**skus** | [**List&lt;Sku&gt;**](Sku.md) | The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart | 
**storeEnd** | **Long** | The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store |  [optional]
**storeStart** | **Long** | The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately |  [optional]
**vendorId** | **Integer** | The vendor who provides the item | 


<a name="GeoPolicyTypeEnum"></a>
## Enum: GeoPolicyTypeEnum
Name | Value
---- | -----
WHITELIST | &quot;whitelist&quot;
BLACKLIST | &quot;blacklist&quot;



