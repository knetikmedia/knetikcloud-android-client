# PaymentsOptimalApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**silentPostUsingPOST**](PaymentsOptimalApi.md#silentPostUsingPOST) | **POST** /payment/provider/optimal/silent | Initiate silent post with Optimal


<a name="silentPostUsingPOST"></a>
# **silentPostUsingPOST**
> String silentPostUsingPOST(request)

Initiate silent post with Optimal

Will return the url for a hosted payment endpoint to post to. See Optimal documentation for details.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsOptimalApi;

PaymentsOptimalApi apiInstance = new PaymentsOptimalApi();
OptimalPaymentRequest request = new OptimalPaymentRequest(); // OptimalPaymentRequest | The payment request to initiate
try {
    String result = apiInstance.silentPostUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsOptimalApi#silentPostUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**OptimalPaymentRequest**](OptimalPaymentRequest.md)| The payment request to initiate | [optional]

### Return type

**String**

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

