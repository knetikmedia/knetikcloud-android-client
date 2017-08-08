# BRERuleEngineExpressionsApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBREExpressions**](BRERuleEngineExpressionsApi.md#getBREExpressions) | **GET** /bre/expressions/lookup | Get a list of &#39;lookup&#39; type expressions


<a name="getBREExpressions"></a>
# **getBREExpressions**
> List&lt;LookupTypeResource&gt; getBREExpressions()

Get a list of &#39;lookup&#39; type expressions

These are expression types that take a second expression as input and produce a value. These can be used in addition to the standard types, like parameter, global and constant (see BRE documentation for details).

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.BRERuleEngineExpressionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

BRERuleEngineExpressionsApi apiInstance = new BRERuleEngineExpressionsApi();
try {
    List<LookupTypeResource> result = apiInstance.getBREExpressions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineExpressionsApi#getBREExpressions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LookupTypeResource&gt;**](LookupTypeResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

