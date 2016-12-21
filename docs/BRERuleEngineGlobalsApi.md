# BRERuleEngineGlobalsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGlobalUsingPOST**](BRERuleEngineGlobalsApi.md#createGlobalUsingPOST) | **POST** /bre/globals/definitions | Create a global definition
[**deleteGlobalUsingDELETE**](BRERuleEngineGlobalsApi.md#deleteGlobalUsingDELETE) | **DELETE** /bre/globals/definitions/{id} | Delete a global
[**getGlobalUsingGET**](BRERuleEngineGlobalsApi.md#getGlobalUsingGET) | **GET** /bre/globals/definitions/{id} | Get a single global definition
[**getGlobalsUsingGET**](BRERuleEngineGlobalsApi.md#getGlobalsUsingGET) | **GET** /bre/globals/definitions | List global definitions
[**updateGlobalUsingPUT**](BRERuleEngineGlobalsApi.md#updateGlobalUsingPUT) | **PUT** /bre/globals/definitions/{id} | Update a global definition


<a name="createGlobalUsingPOST"></a>
# **createGlobalUsingPOST**
> BreGlobalResource createGlobalUsingPOST(breGlobalResource)

Create a global definition

Once created you can then use in a custom rule. Note that global definitions cannot be modified or deleted if in use.

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineGlobalsApi;

BRERuleEngineGlobalsApi apiInstance = new BRERuleEngineGlobalsApi();
BreGlobalResource breGlobalResource = new BreGlobalResource(); // BreGlobalResource | The BRE global resource object
try {
    BreGlobalResource result = apiInstance.createGlobalUsingPOST(breGlobalResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineGlobalsApi#createGlobalUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **breGlobalResource** | [**BreGlobalResource**](BreGlobalResource.md)| The BRE global resource object | [optional]

### Return type

[**BreGlobalResource**](BreGlobalResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGlobalUsingDELETE"></a>
# **deleteGlobalUsingDELETE**
> deleteGlobalUsingDELETE(id)

Delete a global

May fail if there are existing rules against it. Cannot delete core globals

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineGlobalsApi;

BRERuleEngineGlobalsApi apiInstance = new BRERuleEngineGlobalsApi();
String id = "id_example"; // String | The id of the global definition
try {
    apiInstance.deleteGlobalUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineGlobalsApi#deleteGlobalUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the global definition |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGlobalUsingGET"></a>
# **getGlobalUsingGET**
> BreGlobalResource getGlobalUsingGET(id)

Get a single global definition

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineGlobalsApi;

BRERuleEngineGlobalsApi apiInstance = new BRERuleEngineGlobalsApi();
String id = "id_example"; // String | The id of the global definition
try {
    BreGlobalResource result = apiInstance.getGlobalUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineGlobalsApi#getGlobalUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the global definition |

### Return type

[**BreGlobalResource**](BreGlobalResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGlobalsUsingGET"></a>
# **getGlobalsUsingGET**
> PageResourceBreGlobalResource getGlobalsUsingGET(filterSystem, size, page)

List global definitions

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineGlobalsApi;

BRERuleEngineGlobalsApi apiInstance = new BRERuleEngineGlobalsApi();
Boolean filterSystem = true; // Boolean | Filter for globals that are system globals when true, or not when false. Leave off for both mixed
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceBreGlobalResource result = apiInstance.getGlobalsUsingGET(filterSystem, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineGlobalsApi#getGlobalsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterSystem** | **Boolean**| Filter for globals that are system globals when true, or not when false. Leave off for both mixed | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceBreGlobalResource**](PageResourceBreGlobalResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGlobalUsingPUT"></a>
# **updateGlobalUsingPUT**
> updateGlobalUsingPUT(id, breGlobalResource)

Update a global definition

May fail if new parameters mismatch requirements of existing rules. Cannot update core globals

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineGlobalsApi;

BRERuleEngineGlobalsApi apiInstance = new BRERuleEngineGlobalsApi();
String id = "id_example"; // String | The id of the global definition
BreGlobalResource breGlobalResource = new BreGlobalResource(); // BreGlobalResource | The BRE global resource object
try {
    apiInstance.updateGlobalUsingPUT(id, breGlobalResource);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineGlobalsApi#updateGlobalUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the global definition |
 **breGlobalResource** | [**BreGlobalResource**](BreGlobalResource.md)| The BRE global resource object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

