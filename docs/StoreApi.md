# StoreApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createItemTemplateUsingPOST**](StoreApi.md#createItemTemplateUsingPOST) | **POST** /store/items/templates | Create an item template
[**createStoreItemExternalUsingPOST**](StoreApi.md#createStoreItemExternalUsingPOST) | **POST** /store/items | Create a store item
[**deleteItemTemplateUsingDELETE**](StoreApi.md#deleteItemTemplateUsingDELETE) | **DELETE** /store/items/templates/{id} | Delete an item template
[**deleteStoreItemUsingDELETE1**](StoreApi.md#deleteStoreItemUsingDELETE1) | **DELETE** /store/items/{id} | Delete a store item
[**getItemTemplateUsingGET**](StoreApi.md#getItemTemplateUsingGET) | **GET** /store/items/templates/{id} | Get a single item template
[**getItemTemplatesUsingGET**](StoreApi.md#getItemTemplatesUsingGET) | **GET** /store/items/templates | List and search item templates
[**getStoreItemUsingGET1**](StoreApi.md#getStoreItemUsingGET1) | **GET** /store/items/{id} | Get a single store item
[**getStoreItemsUsingGET**](StoreApi.md#getStoreItemsUsingGET) | **GET** /store/items | List and search store items
[**getUsingGET2**](StoreApi.md#getUsingGET2) | **GET** /store | Get a listing of store items
[**updateItemTemplateUsingPUT**](StoreApi.md#updateItemTemplateUsingPUT) | **PUT** /store/items/templates/{id} | Update an item template
[**updateStoreItemExternalUsingPUT**](StoreApi.md#updateStoreItemExternalUsingPUT) | **PUT** /store/items/{id} | Update a store item


<a name="createItemTemplateUsingPOST"></a>
# **createItemTemplateUsingPOST**
> StoreItemTemplateResource createItemTemplateUsingPOST(itemTemplateResource)

Create an item template

Item Templates define a type of item and the properties they have.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreApi;

StoreApi apiInstance = new StoreApi();
StoreItemTemplateResource itemTemplateResource = new StoreItemTemplateResource(); // StoreItemTemplateResource | The new item template
try {
    StoreItemTemplateResource result = apiInstance.createItemTemplateUsingPOST(itemTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#createItemTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemTemplateResource** | [**StoreItemTemplateResource**](StoreItemTemplateResource.md)| The new item template | [optional]

### Return type

[**StoreItemTemplateResource**](StoreItemTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createStoreItemExternalUsingPOST"></a>
# **createStoreItemExternalUsingPOST**
> StoreItem createStoreItemExternalUsingPOST(storeItem)

Create a store item

SKUs have to be unique in the entire store. If a duplicate SKU is found, a 400 error is generated and the response will have a \&quot;parameters\&quot; field that is a list of duplicates. A duplicate is an object like {item_id, offending_sku_list}. Ex:&lt;br /&gt; {..., parameters: [[{item: 1, skus: [\&quot;SKU-1\&quot;]}]]}&lt;br /&gt; If an item is brand new and has duplicate SKUs within itself, the item ID will be 0.  Item subclasses are not allowed here, you will have to use their respective endpoints.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreApi;

StoreApi apiInstance = new StoreApi();
StoreItem storeItem = new StoreItem(); // StoreItem | The store item object
try {
    StoreItem result = apiInstance.createStoreItemExternalUsingPOST(storeItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#createStoreItemExternalUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeItem** | [**StoreItem**](StoreItem.md)| The store item object | [optional]

### Return type

[**StoreItem**](StoreItem.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemTemplateUsingDELETE"></a>
# **deleteItemTemplateUsingDELETE**
> deleteItemTemplateUsingDELETE(id, cascade)

Delete an item template

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreApi;

StoreApi apiInstance = new StoreApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | force deleting the template if it's attached to other objects, cascade = detach
try {
    apiInstance.deleteItemTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#deleteItemTemplateUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **cascade** | **String**| force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStoreItemUsingDELETE1"></a>
# **deleteStoreItemUsingDELETE1**
> deleteStoreItemUsingDELETE1(id)

Delete a store item

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreApi;

StoreApi apiInstance = new StoreApi();
Integer id = 56; // Integer | The id of the item
try {
    apiInstance.deleteStoreItemUsingDELETE1(id);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#deleteStoreItemUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the item |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getItemTemplateUsingGET"></a>
# **getItemTemplateUsingGET**
> StoreItemTemplateResource getItemTemplateUsingGET(id)

Get a single item template

Item Templates define a type of item and the properties they have.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreApi;

StoreApi apiInstance = new StoreApi();
String id = "id_example"; // String | The id of the template
try {
    StoreItemTemplateResource result = apiInstance.getItemTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getItemTemplateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |

### Return type

[**StoreItemTemplateResource**](StoreItemTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getItemTemplatesUsingGET"></a>
# **getItemTemplatesUsingGET**
> PageResourceStoreItemTemplateResource getItemTemplatesUsingGET(size, page, order)

List and search item templates

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreApi;

StoreApi apiInstance = new StoreApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceStoreItemTemplateResource result = apiInstance.getItemTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getItemTemplatesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceStoreItemTemplateResource**](PageResourceStoreItemTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreItemUsingGET1"></a>
# **getStoreItemUsingGET1**
> StoreItem getStoreItemUsingGET1(id)

Get a single store item

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreApi;

StoreApi apiInstance = new StoreApi();
Integer id = 56; // Integer | The id of the item
try {
    StoreItem result = apiInstance.getStoreItemUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getStoreItemUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the item |

### Return type

[**StoreItem**](StoreItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreItemsUsingGET"></a>
# **getStoreItemsUsingGET**
> PageResourceStoreItem getStoreItemsUsingGET(filterNameSearch, filterUniqueKey, filterPublished, filterDisplayable, filterStart, filterEnd, filterStartDate, filterStopDate, filterSku, filterPrice, filterTag, filterItemsByType, filterBundledSkus, size, page, order)

List and search store items

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreApi;

StoreApi apiInstance = new StoreApi();
String filterNameSearch = "filterNameSearch_example"; // String | Filter for items whose name starts with a given string.
String filterUniqueKey = "filterUniqueKey_example"; // String | Filter for items whose unique_key is a given string.
Boolean filterPublished = true; // Boolean | Filter for skus that have been published.
Boolean filterDisplayable = true; // Boolean | Filter for items that are displayable.
String filterStart = "filterStart_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the store start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
String filterEnd = "filterEnd_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the store end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
String filterStartDate = "filterStartDate_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the sku start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
String filterStopDate = "filterStopDate_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the sku end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
String filterSku = "filterSku_example"; // String | Filter for skus whose name starts with a given string.
String filterPrice = "filterPrice_example"; // String | A colon separated string without spaces.  First value is the operator to search on, second value is the price of a sku.  Allowed operators: (LT, GT, LTE, GTE, EQ).
String filterTag = "filterTag_example"; // String | A comma separated list without spaces of the names of tags. Will only return items with at least one of the tags.
String filterItemsByType = "filterItemsByType_example"; // String | Filter for item type based on its type hint.
String filterBundledSkus = "filterBundledSkus_example"; // String | Filter for skus inside bundles whose name starts with a given string.  Used only when type hint is 'bundle_item'
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceStoreItem result = apiInstance.getStoreItemsUsingGET(filterNameSearch, filterUniqueKey, filterPublished, filterDisplayable, filterStart, filterEnd, filterStartDate, filterStopDate, filterSku, filterPrice, filterTag, filterItemsByType, filterBundledSkus, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getStoreItemsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterNameSearch** | **String**| Filter for items whose name starts with a given string. | [optional]
 **filterUniqueKey** | **String**| Filter for items whose unique_key is a given string. | [optional]
 **filterPublished** | **Boolean**| Filter for skus that have been published. | [optional]
 **filterDisplayable** | **Boolean**| Filter for items that are displayable. | [optional]
 **filterStart** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the store start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). | [optional]
 **filterEnd** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the store end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). | [optional]
 **filterStartDate** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the sku start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). | [optional]
 **filterStopDate** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the sku end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). | [optional]
 **filterSku** | **String**| Filter for skus whose name starts with a given string. | [optional]
 **filterPrice** | **String**| A colon separated string without spaces.  First value is the operator to search on, second value is the price of a sku.  Allowed operators: (LT, GT, LTE, GTE, EQ). | [optional]
 **filterTag** | **String**| A comma separated list without spaces of the names of tags. Will only return items with at least one of the tags. | [optional]
 **filterItemsByType** | **String**| Filter for item type based on its type hint. | [optional]
 **filterBundledSkus** | **String**| Filter for skus inside bundles whose name starts with a given string.  Used only when type hint is &#39;bundle_item&#39; | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceStoreItem**](PageResourceStoreItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsingGET2"></a>
# **getUsingGET2**
> PageResourceStoreItem getUsingGET2(storeListRequest)

Get a listing of store items

The exact structure of each items may differ to include fields specific to the type. The same is true for behaviors.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreApi;

StoreApi apiInstance = new StoreApi();
StoreListRequest storeListRequest = new StoreListRequest(); // StoreListRequest | The store list request object
try {
    PageResourceStoreItem result = apiInstance.getUsingGET2(storeListRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeListRequest** | [**StoreListRequest**](StoreListRequest.md)| The store list request object | [optional]

### Return type

[**PageResourceStoreItem**](PageResourceStoreItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemTemplateUsingPUT"></a>
# **updateItemTemplateUsingPUT**
> updateItemTemplateUsingPUT(id, itemTemplateResource)

Update an item template

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreApi;

StoreApi apiInstance = new StoreApi();
String id = "id_example"; // String | The id of the template
StoreItemTemplateResource itemTemplateResource = new StoreItemTemplateResource(); // StoreItemTemplateResource | The item template resource object
try {
    apiInstance.updateItemTemplateUsingPUT(id, itemTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#updateItemTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **itemTemplateResource** | [**StoreItemTemplateResource**](StoreItemTemplateResource.md)| The item template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStoreItemExternalUsingPUT"></a>
# **updateStoreItemExternalUsingPUT**
> updateStoreItemExternalUsingPUT(id, storeItem)

Update a store item

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreApi;

StoreApi apiInstance = new StoreApi();
Integer id = 56; // Integer | The id of the item
StoreItem storeItem = new StoreItem(); // StoreItem | The store item object
try {
    apiInstance.updateStoreItemExternalUsingPUT(id, storeItem);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#updateStoreItemExternalUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the item |
 **storeItem** | [**StoreItem**](StoreItem.md)| The store item object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

