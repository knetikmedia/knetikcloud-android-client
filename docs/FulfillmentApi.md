# FulfillmentApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFulfillmentTypeUsingPOST**](FulfillmentApi.md#createFulfillmentTypeUsingPOST) | **POST** /store/fulfillment/types | Create a fulfillment type
[**deleteFulfillmentTypeUsingDELETE**](FulfillmentApi.md#deleteFulfillmentTypeUsingDELETE) | **DELETE** /store/fulfillment/types/{id} | Delete a fulfillment type
[**getFulfillmentTypeUsingGET**](FulfillmentApi.md#getFulfillmentTypeUsingGET) | **GET** /store/fulfillment/types/{id} | Get a single fulfillment type
[**getFulfillmentsUsingGET**](FulfillmentApi.md#getFulfillmentsUsingGET) | **GET** /store/fulfillment/types | List and search fulfillment types
[**updateFulfillmentTypeUsingPUT**](FulfillmentApi.md#updateFulfillmentTypeUsingPUT) | **PUT** /store/fulfillment/types/{id} | Update a fulfillment type


<a name="createFulfillmentTypeUsingPOST"></a>
# **createFulfillmentTypeUsingPOST**
> FulfillmentType createFulfillmentTypeUsingPOST(type)

Create a fulfillment type

### Example
```java
// Import classes:
//import io.swagger.client.api.FulfillmentApi;

FulfillmentApi apiInstance = new FulfillmentApi();
FulfillmentType type = new FulfillmentType(); // FulfillmentType | The fulfillment type
try {
    FulfillmentType result = apiInstance.createFulfillmentTypeUsingPOST(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#createFulfillmentTypeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**FulfillmentType**](FulfillmentType.md)| The fulfillment type | [optional]

### Return type

[**FulfillmentType**](FulfillmentType.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFulfillmentTypeUsingDELETE"></a>
# **deleteFulfillmentTypeUsingDELETE**
> deleteFulfillmentTypeUsingDELETE(id)

Delete a fulfillment type

### Example
```java
// Import classes:
//import io.swagger.client.api.FulfillmentApi;

FulfillmentApi apiInstance = new FulfillmentApi();
Integer id = 56; // Integer | The id
try {
    apiInstance.deleteFulfillmentTypeUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#deleteFulfillmentTypeUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFulfillmentTypeUsingGET"></a>
# **getFulfillmentTypeUsingGET**
> FulfillmentType getFulfillmentTypeUsingGET(id)

Get a single fulfillment type

### Example
```java
// Import classes:
//import io.swagger.client.api.FulfillmentApi;

FulfillmentApi apiInstance = new FulfillmentApi();
Integer id = 56; // Integer | The id
try {
    FulfillmentType result = apiInstance.getFulfillmentTypeUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#getFulfillmentTypeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id |

### Return type

[**FulfillmentType**](FulfillmentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFulfillmentsUsingGET"></a>
# **getFulfillmentsUsingGET**
> PageResourceFulfillmentType getFulfillmentsUsingGET(size, page, order)

List and search fulfillment types

### Example
```java
// Import classes:
//import io.swagger.client.api.FulfillmentApi;

FulfillmentApi apiInstance = new FulfillmentApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceFulfillmentType result = apiInstance.getFulfillmentsUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#getFulfillmentsUsingGET");
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

[**PageResourceFulfillmentType**](PageResourceFulfillmentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFulfillmentTypeUsingPUT"></a>
# **updateFulfillmentTypeUsingPUT**
> updateFulfillmentTypeUsingPUT(id, fulfillmentType)

Update a fulfillment type

### Example
```java
// Import classes:
//import io.swagger.client.api.FulfillmentApi;

FulfillmentApi apiInstance = new FulfillmentApi();
Integer id = 56; // Integer | The id
FulfillmentType fulfillmentType = new FulfillmentType(); // FulfillmentType | The fulfillment type
try {
    apiInstance.updateFulfillmentTypeUsingPUT(id, fulfillmentType);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#updateFulfillmentTypeUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id |
 **fulfillmentType** | [**FulfillmentType**](FulfillmentType.md)| The fulfillment type | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

