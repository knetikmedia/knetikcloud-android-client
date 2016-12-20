# StoreVendorsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVendorUsingPOST**](StoreVendorsApi.md#createVendorUsingPOST) | **POST** /vendors | Create a vendor
[**deleteVendorUsingDELETE**](StoreVendorsApi.md#deleteVendorUsingDELETE) | **DELETE** /vendors/{id} | Delete a vendor
[**getVendorUsingGET**](StoreVendorsApi.md#getVendorUsingGET) | **GET** /vendors/{id} | Get a single vendor
[**getVendorsUsingGET**](StoreVendorsApi.md#getVendorsUsingGET) | **GET** /vendors | List and search vendors
[**updateVendorUsingPUT**](StoreVendorsApi.md#updateVendorUsingPUT) | **PUT** /vendors/{id} | Update a vendor


<a name="createVendorUsingPOST"></a>
# **createVendorUsingPOST**
> VendorResource createVendorUsingPOST(vendor)

Create a vendor

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreVendorsApi;

StoreVendorsApi apiInstance = new StoreVendorsApi();
VendorResource vendor = new VendorResource(); // VendorResource | The vendor
try {
    VendorResource result = apiInstance.createVendorUsingPOST(vendor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreVendorsApi#createVendorUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendor** | [**VendorResource**](VendorResource.md)| The vendor | [optional]

### Return type

[**VendorResource**](VendorResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVendorUsingDELETE"></a>
# **deleteVendorUsingDELETE**
> deleteVendorUsingDELETE(id)

Delete a vendor

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreVendorsApi;

StoreVendorsApi apiInstance = new StoreVendorsApi();
Integer id = 56; // Integer | The id of the vendor
try {
    apiInstance.deleteVendorUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreVendorsApi#deleteVendorUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the vendor |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVendorUsingGET"></a>
# **getVendorUsingGET**
> VendorResource getVendorUsingGET(id)

Get a single vendor

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreVendorsApi;

StoreVendorsApi apiInstance = new StoreVendorsApi();
Integer id = 56; // Integer | The id of the vendor
try {
    VendorResource result = apiInstance.getVendorUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreVendorsApi#getVendorUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the vendor |

### Return type

[**VendorResource**](VendorResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVendorsUsingGET"></a>
# **getVendorsUsingGET**
> PageVendorResource getVendorsUsingGET(filterName, size, page, order)

List and search vendors

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreVendorsApi;

StoreVendorsApi apiInstance = new StoreVendorsApi();
String filterName = "filterName_example"; // String | Filters vendors by name starting with the text provided in the filter
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageVendorResource result = apiInstance.getVendorsUsingGET(filterName, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreVendorsApi#getVendorsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterName** | **String**| Filters vendors by name starting with the text provided in the filter | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageVendorResource**](PageVendorResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVendorUsingPUT"></a>
# **updateVendorUsingPUT**
> updateVendorUsingPUT(id, vendor)

Update a vendor

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreVendorsApi;

StoreVendorsApi apiInstance = new StoreVendorsApi();
Integer id = 56; // Integer | The id of the vendor
VendorResource vendor = new VendorResource(); // VendorResource | The vendor
try {
    apiInstance.updateVendorUsingPUT(id, vendor);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreVendorsApi#updateVendorUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the vendor |
 **vendor** | [**VendorResource**](VendorResource.md)| The vendor | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

