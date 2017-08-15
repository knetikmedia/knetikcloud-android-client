# UtilBatchApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatch**](UtilBatchApi.md#getBatch) | **GET** /batch/{token} | Get batch result with token
[**sendBatch**](UtilBatchApi.md#sendBatch) | **POST** /batch | Request to run API call given the method, content type, path url, and body of request


<a name="getBatch"></a>
# **getBatch**
> List&lt;BatchReturn&gt; getBatch(token)

Get batch result with token

Tokens expire in 24 hours

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.UtilBatchApi;


UtilBatchApi apiInstance = new UtilBatchApi();
String token = "token_example"; // String | token
try {
    List<BatchReturn> result = apiInstance.getBatch(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilBatchApi#getBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |

### Return type

[**List&lt;BatchReturn&gt;**](BatchReturn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendBatch"></a>
# **sendBatch**
> List&lt;BatchReturn&gt; sendBatch(batch)

Request to run API call given the method, content type, path url, and body of request

Should the request take longer than one of the alloted timeout parameters, a token will be returned instead, which can be used on the token endpoint in this service

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.UtilBatchApi;


UtilBatchApi apiInstance = new UtilBatchApi();
Batch batch = new Batch(); // Batch | The batch object
try {
    List<BatchReturn> result = apiInstance.sendBatch(batch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilBatchApi#sendBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch** | [**Batch**](Batch.md)| The batch object | [optional]

### Return type

[**List&lt;BatchReturn&gt;**](BatchReturn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

