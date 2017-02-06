# PaymentsOptimalApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**silentPostOptimal**](PaymentsOptimalApi.md#silentPostOptimal) | **POST** /payment/provider/optimal/silent | Initiate silent post with Optimal


<a name="silentPostOptimal"></a>
# **silentPostOptimal**
> String silentPostOptimal(request)

Initiate silent post with Optimal

Will return the url for a hosted payment endpoint to post to. See Optimal documentation for details.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsOptimalApi;

PaymentsOptimalApi apiInstance = new PaymentsOptimalApi();
OptimalPaymentRequest request = new OptimalPaymentRequest(); // OptimalPaymentRequest | The payment request to initiate
try {
    String result = apiInstance.silentPostOptimal(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsOptimalApi#silentPostOptimal");
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

