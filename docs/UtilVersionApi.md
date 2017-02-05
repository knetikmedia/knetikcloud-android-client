# UtilVersionApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsingGET3**](UtilVersionApi.md#getUsingGET3) | **GET** /version | Get current version info


<a name="getUsingGET3"></a>
# **getUsingGET3**
> Version getUsingGET3()

Get current version info

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilVersionApi;

UtilVersionApi apiInstance = new UtilVersionApi();
try {
    Version result = apiInstance.getUsingGET3();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilVersionApi#getUsingGET3");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Version**](Version.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

