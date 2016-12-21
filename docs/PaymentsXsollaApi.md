# PaymentsXsollaApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTokenUrlUsingPOST**](PaymentsXsollaApi.md#createTokenUrlUsingPOST) | **POST** /payment/provider/xsolla/payment | Create a payment token that should be used to forward the user to Xsolla so they can complete payment
[**receiveNotificationUsingPOST**](PaymentsXsollaApi.md#receiveNotificationUsingPOST) | **POST** /payment/provider/xsolla/notifications | Receives payment response from Xsolla


<a name="createTokenUrlUsingPOST"></a>
# **createTokenUrlUsingPOST**
> String createTokenUrlUsingPOST(request)

Create a payment token that should be used to forward the user to Xsolla so they can complete payment

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsXsollaApi;

PaymentsXsollaApi apiInstance = new PaymentsXsollaApi();
XsollaPaymentRequest request = new XsollaPaymentRequest(); // XsollaPaymentRequest | The payment request to be sent to XSolla
try {
    String result = apiInstance.createTokenUrlUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsXsollaApi#createTokenUrlUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**XsollaPaymentRequest**](XsollaPaymentRequest.md)| The payment request to be sent to XSolla | [optional]

### Return type

**String**

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="receiveNotificationUsingPOST"></a>
# **receiveNotificationUsingPOST**
> receiveNotificationUsingPOST()

Receives payment response from Xsolla

Only used by XSolla to call back to JSAPI after processing user payment action

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsXsollaApi;

PaymentsXsollaApi apiInstance = new PaymentsXsollaApi();
try {
    apiInstance.receiveNotificationUsingPOST();
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsXsollaApi#receiveNotificationUsingPOST");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

