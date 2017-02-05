# PaymentsPayPalClassicApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBillingAgreementUrlUsingPOST**](PaymentsPayPalClassicApi.md#createBillingAgreementUrlUsingPOST) | **POST** /payment/provider/paypal/classic/agreements/start | Create a PayPal Classic billing agreement for the user
[**expressCheckoutUsingPOST**](PaymentsPayPalClassicApi.md#expressCheckoutUsingPOST) | **POST** /payment/provider/paypal/classic/checkout/start | Create a payment token for PayPal express checkout
[**finalizeBillingAgreementUsingPOST**](PaymentsPayPalClassicApi.md#finalizeBillingAgreementUsingPOST) | **POST** /payment/provider/paypal/classic/agreements/finish | Finalizes a billing agreement after the user has accepted through PayPal
[**finalizeCheckoutUsingPOST**](PaymentsPayPalClassicApi.md#finalizeCheckoutUsingPOST) | **POST** /payment/provider/paypal/classic/checkout/finish | Finalizes a payment after the user has completed checkout with PayPal


<a name="createBillingAgreementUrlUsingPOST"></a>
# **createBillingAgreementUrlUsingPOST**
> String createBillingAgreementUrlUsingPOST(request)

Create a PayPal Classic billing agreement for the user

Returns the token that should be used to forward the user to PayPal so they can accept the agreement.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsPayPalClassicApi;

PaymentsPayPalClassicApi apiInstance = new PaymentsPayPalClassicApi();
CreateBillingAgreementRequest request = new CreateBillingAgreementRequest(); // CreateBillingAgreementRequest | The request to create a PayPal billing agreement
try {
    String result = apiInstance.createBillingAgreementUrlUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsPayPalClassicApi#createBillingAgreementUrlUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateBillingAgreementRequest**](CreateBillingAgreementRequest.md)| The request to create a PayPal billing agreement | [optional]

### Return type

**String**

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="expressCheckoutUsingPOST"></a>
# **expressCheckoutUsingPOST**
> String expressCheckoutUsingPOST(request)

Create a payment token for PayPal express checkout

Returns the token that should be used to forward the user to PayPal so they can complete the checkout.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsPayPalClassicApi;

PaymentsPayPalClassicApi apiInstance = new PaymentsPayPalClassicApi();
CreatePayPalPaymentRequest request = new CreatePayPalPaymentRequest(); // CreatePayPalPaymentRequest | The request to create a PayPal payment token
try {
    String result = apiInstance.expressCheckoutUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsPayPalClassicApi#expressCheckoutUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreatePayPalPaymentRequest**](CreatePayPalPaymentRequest.md)| The request to create a PayPal payment token | [optional]

### Return type

**String**

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="finalizeBillingAgreementUsingPOST"></a>
# **finalizeBillingAgreementUsingPOST**
> Integer finalizeBillingAgreementUsingPOST(request)

Finalizes a billing agreement after the user has accepted through PayPal

Returns the ID of the new payment method created for the user for the billing agreement.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsPayPalClassicApi;

PaymentsPayPalClassicApi apiInstance = new PaymentsPayPalClassicApi();
FinalizeBillingAgreementRequest request = new FinalizeBillingAgreementRequest(); // FinalizeBillingAgreementRequest | The request to finalize a PayPal billing agreement
try {
    Integer result = apiInstance.finalizeBillingAgreementUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsPayPalClassicApi#finalizeBillingAgreementUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**FinalizeBillingAgreementRequest**](FinalizeBillingAgreementRequest.md)| The request to finalize a PayPal billing agreement | [optional]

### Return type

**Integer**

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="finalizeCheckoutUsingPOST"></a>
# **finalizeCheckoutUsingPOST**
> finalizeCheckoutUsingPOST(request)

Finalizes a payment after the user has completed checkout with PayPal

The invoice will be marked paid/failed by asynchronous IPN callback.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsPayPalClassicApi;

PaymentsPayPalClassicApi apiInstance = new PaymentsPayPalClassicApi();
FinalizePayPalPaymentRequest request = new FinalizePayPalPaymentRequest(); // FinalizePayPalPaymentRequest | The request to finalize the payment
try {
    apiInstance.finalizeCheckoutUsingPOST(request);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsPayPalClassicApi#finalizeCheckoutUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**FinalizePayPalPaymentRequest**](FinalizePayPalPaymentRequest.md)| The request to finalize the payment | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

