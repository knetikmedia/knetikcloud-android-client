# StoreShippingApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createShippingItemUsingPOST**](StoreShippingApi.md#createShippingItemUsingPOST) | **POST** /store/shipping | Create a shipping item
[**createShippingTemplateUsingPOST**](StoreShippingApi.md#createShippingTemplateUsingPOST) | **POST** /store/shipping/templates | Create a shipping template
[**deleteShippingItemUsingDELETE**](StoreShippingApi.md#deleteShippingItemUsingDELETE) | **DELETE** /store/shipping/{id} | Delete a shipping item
[**deleteShippingTemplateUsingDELETE**](StoreShippingApi.md#deleteShippingTemplateUsingDELETE) | **DELETE** /store/shipping/templates/{id} | Delete a shipping template
[**getShippingItemUsingGET**](StoreShippingApi.md#getShippingItemUsingGET) | **GET** /store/shipping/{id} | Get a single shipping item
[**getShippingTemplateUsingGET**](StoreShippingApi.md#getShippingTemplateUsingGET) | **GET** /store/shipping/templates/{id} | Get a single shipping template
[**getShippingTemplatesUsingGET**](StoreShippingApi.md#getShippingTemplatesUsingGET) | **GET** /store/shipping/templates | List and search shipping templates
[**updateShippingItemUsingPUT**](StoreShippingApi.md#updateShippingItemUsingPUT) | **PUT** /store/shipping/{id} | Update a shipping item
[**updateShippingTemplateUsingPUT**](StoreShippingApi.md#updateShippingTemplateUsingPUT) | **PUT** /store/shipping/templates/{id} | Update a shipping template


<a name="createShippingItemUsingPOST"></a>
# **createShippingItemUsingPOST**
> ShippingItem createShippingItemUsingPOST(shippingItem)

Create a shipping item

A shipping item represents a shipping option and cost. SKUs have to be unique in the entire store.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShippingApi;

StoreShippingApi apiInstance = new StoreShippingApi();
ShippingItem shippingItem = new ShippingItem(); // ShippingItem | The shipping item object
try {
    ShippingItem result = apiInstance.createShippingItemUsingPOST(shippingItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShippingApi#createShippingItemUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shippingItem** | [**ShippingItem**](ShippingItem.md)| The shipping item object | [optional]

### Return type

[**ShippingItem**](ShippingItem.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createShippingTemplateUsingPOST"></a>
# **createShippingTemplateUsingPOST**
> ItemTemplateResource createShippingTemplateUsingPOST(shippingTemplateResource)

Create a shipping template

Shipping Templates define a type of shipping and the properties they have.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShippingApi;

StoreShippingApi apiInstance = new StoreShippingApi();
ItemTemplateResource shippingTemplateResource = new ItemTemplateResource(); // ItemTemplateResource | The new shipping template
try {
    ItemTemplateResource result = apiInstance.createShippingTemplateUsingPOST(shippingTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShippingApi#createShippingTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shippingTemplateResource** | [**ItemTemplateResource**](ItemTemplateResource.md)| The new shipping template | [optional]

### Return type

[**ItemTemplateResource**](ItemTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteShippingItemUsingDELETE"></a>
# **deleteShippingItemUsingDELETE**
> deleteShippingItemUsingDELETE(id)

Delete a shipping item

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShippingApi;

StoreShippingApi apiInstance = new StoreShippingApi();
Integer id = 56; // Integer | The id of the shipping item
try {
    apiInstance.deleteShippingItemUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShippingApi#deleteShippingItemUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the shipping item |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteShippingTemplateUsingDELETE"></a>
# **deleteShippingTemplateUsingDELETE**
> deleteShippingTemplateUsingDELETE(id, cascade)

Delete a shipping template

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShippingApi;

StoreShippingApi apiInstance = new StoreShippingApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | force deleting the template if it's attached to other objects, cascade = detach
try {
    apiInstance.deleteShippingTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShippingApi#deleteShippingTemplateUsingDELETE");
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
 - **Accept**: */*

<a name="getShippingItemUsingGET"></a>
# **getShippingItemUsingGET**
> ShippingItem getShippingItemUsingGET(id)

Get a single shipping item

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShippingApi;

StoreShippingApi apiInstance = new StoreShippingApi();
Integer id = 56; // Integer | The id of the shipping item
try {
    ShippingItem result = apiInstance.getShippingItemUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShippingApi#getShippingItemUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the shipping item |

### Return type

[**ShippingItem**](ShippingItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getShippingTemplateUsingGET"></a>
# **getShippingTemplateUsingGET**
> ItemTemplateResource getShippingTemplateUsingGET(id)

Get a single shipping template

Shipping Templates define a type of shipping and the properties they have.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShippingApi;

StoreShippingApi apiInstance = new StoreShippingApi();
String id = "id_example"; // String | The id of the template
try {
    ItemTemplateResource result = apiInstance.getShippingTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShippingApi#getShippingTemplateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |

### Return type

[**ItemTemplateResource**](ItemTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getShippingTemplatesUsingGET"></a>
# **getShippingTemplatesUsingGET**
> PageItemTemplateResource getShippingTemplatesUsingGET(size, page, order)

List and search shipping templates

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShippingApi;

StoreShippingApi apiInstance = new StoreShippingApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageItemTemplateResource result = apiInstance.getShippingTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShippingApi#getShippingTemplatesUsingGET");
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

[**PageItemTemplateResource**](PageItemTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateShippingItemUsingPUT"></a>
# **updateShippingItemUsingPUT**
> updateShippingItemUsingPUT(id, shippingItem)

Update a shipping item

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShippingApi;

StoreShippingApi apiInstance = new StoreShippingApi();
Integer id = 56; // Integer | The id of the shipping item
ShippingItem shippingItem = new ShippingItem(); // ShippingItem | The shipping item object
try {
    apiInstance.updateShippingItemUsingPUT(id, shippingItem);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShippingApi#updateShippingItemUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the shipping item |
 **shippingItem** | [**ShippingItem**](ShippingItem.md)| The shipping item object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateShippingTemplateUsingPUT"></a>
# **updateShippingTemplateUsingPUT**
> updateShippingTemplateUsingPUT(id, shippingTemplateResource)

Update a shipping template

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShippingApi;

StoreShippingApi apiInstance = new StoreShippingApi();
String id = "id_example"; // String | The id of the template
ItemTemplateResource shippingTemplateResource = new ItemTemplateResource(); // ItemTemplateResource | The shipping template resource object
try {
    apiInstance.updateShippingTemplateUsingPUT(id, shippingTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShippingApi#updateShippingTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **shippingTemplateResource** | [**ItemTemplateResource**](ItemTemplateResource.md)| The shipping template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

