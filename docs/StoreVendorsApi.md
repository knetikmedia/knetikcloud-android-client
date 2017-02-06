# StoreVendorsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVendor**](StoreVendorsApi.md#createVendor) | **POST** /vendors | Create a vendor
[**deleteVendor**](StoreVendorsApi.md#deleteVendor) | **DELETE** /vendors/{id} | Delete a vendor
[**getVendor**](StoreVendorsApi.md#getVendor) | **GET** /vendors/{id} | Get a single vendor
[**getVendors**](StoreVendorsApi.md#getVendors) | **GET** /vendors | List and search vendors
[**updateVendor**](StoreVendorsApi.md#updateVendor) | **PUT** /vendors/{id} | Update a vendor


<a name="createVendor"></a>
# **createVendor**
> VendorResource createVendor(vendor)

Create a vendor

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreVendorsApi;

StoreVendorsApi apiInstance = new StoreVendorsApi();
VendorResource vendor = new VendorResource(); // VendorResource | The vendor
try {
    VendorResource result = apiInstance.createVendor(vendor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreVendorsApi#createVendor");
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

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVendor"></a>
# **deleteVendor**
> deleteVendor(id)

Delete a vendor

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreVendorsApi;

StoreVendorsApi apiInstance = new StoreVendorsApi();
Integer id = 56; // Integer | The id of the vendor
try {
    apiInstance.deleteVendor(id);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreVendorsApi#deleteVendor");
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

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVendor"></a>
# **getVendor**
> VendorResource getVendor(id)

Get a single vendor

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreVendorsApi;

StoreVendorsApi apiInstance = new StoreVendorsApi();
Integer id = 56; // Integer | The id of the vendor
try {
    VendorResource result = apiInstance.getVendor(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreVendorsApi#getVendor");
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

<a name="getVendors"></a>
# **getVendors**
> PageResourceVendorResource getVendors(filterName, size, page, order)

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
    PageResourceVendorResource result = apiInstance.getVendors(filterName, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreVendorsApi#getVendors");
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

[**PageResourceVendorResource**](PageResourceVendorResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVendor"></a>
# **updateVendor**
> updateVendor(id, vendor)

Update a vendor

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreVendorsApi;

StoreVendorsApi apiInstance = new StoreVendorsApi();
Integer id = 56; // Integer | The id of the vendor
VendorResource vendor = new VendorResource(); // VendorResource | The vendor
try {
    apiInstance.updateVendor(id, vendor);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreVendorsApi#updateVendor");
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

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

