# UtilHealthApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHealthInfoUsingGET**](UtilHealthApi.md#getHealthInfoUsingGET) | **GET** /health | Get health info


<a name="getHealthInfoUsingGET"></a>
# **getHealthInfoUsingGET**
> Object getHealthInfoUsingGET()

Get health info

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilHealthApi;

UtilHealthApi apiInstance = new UtilHealthApi();
try {
    Object result = apiInstance.getHealthInfoUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilHealthApi#getHealthInfoUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

