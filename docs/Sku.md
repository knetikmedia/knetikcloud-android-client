
# Sku

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalProperties** | [**Map&lt;String, Property&gt;**](Property.md) | A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template |  [optional]
**currencyCode** | **String** | The currency code for the SKU, a three letter string (ISO3) | 
**description** | **String** | The friendly name of the SKU as it will appear on invoices and reports. Typically represents the option name like red, large, etc | 
**inventory** | **Integer** | The number of SKUs currently in stock |  [optional]
**minInventoryThreshold** | **Integer** | Alerts vendor when SKU inventory drops below this value |  [optional]
**notAvailable** | **Boolean** |  |  [optional]
**notDisplayable** | **Boolean** |  |  [optional]
**originalPrice** | [**BigDecimal**](BigDecimal.md) | The base price before any sale | 
**price** | [**BigDecimal**](BigDecimal.md) | The current price of the SKU with sales, if any. Set original_price for the base |  [optional]
**published** | **Boolean** | Whether or not the SKU is currently visible to users. This will not block users from purchase. Use start_date or stop_date to prevent purchase. Default: true |  [optional]
**saleId** | **Integer** | The id of a sale affecting the price, if any |  [optional]
**saleName** | **String** | The name of a sale affecting the price, if any |  [optional]
**sku** | **String** | The stock keeping unit (SKU), a unique identifier for a given product.  Max 40 characters | 
**startDate** | **Long** | The date the sku becomes visible (if published) and available for purchase, unix timestamp in seconds.  If set to null, sku will become available immediately |  [optional]
**stopDate** | **Long** | The date the sku becomes hidden and unavailable for purchase, unix timestamp in seconds.  If set to null, sku is always available |  [optional]



