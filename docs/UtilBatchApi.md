# UtilBatchApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchPOSTUsingPOST**](UtilBatchApi.md#getBatchPOSTUsingPOST) | **POST** /batch | Request to run API call given the method, content type, path url, and body of request


<a name="getBatchPOSTUsingPOST"></a>
# **getBatchPOSTUsingPOST**
> getBatchPOSTUsingPOST(batch)

Request to run API call given the method, content type, path url, and body of request

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilBatchApi;

UtilBatchApi apiInstance = new UtilBatchApi();
Batch batch = new Batch(); // Batch | The batch object
try {
    apiInstance.getBatchPOSTUsingPOST(batch);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilBatchApi#getBatchPOSTUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch** | [**Batch**](Batch.md)| The batch object | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

