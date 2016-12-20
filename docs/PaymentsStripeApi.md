# PaymentsStripeApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerUsingPOST1**](PaymentsStripeApi.md#createCustomerUsingPOST1) | **POST** /payment/provider/stripe/payment-methods | Create a Stripe payment method for a user
[**payInvoiceUsingPOST1**](PaymentsStripeApi.md#payInvoiceUsingPOST1) | **POST** /payment/provider/stripe/payments | Pay with a single use token


<a name="createCustomerUsingPOST1"></a>
# **createCustomerUsingPOST1**
> PaymentMethodResource createCustomerUsingPOST1(request)

Create a Stripe payment method for a user

Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsStripeApi;

PaymentsStripeApi apiInstance = new PaymentsStripeApi();
StripeCreatePaymentMethod request = new StripeCreatePaymentMethod(); // StripeCreatePaymentMethod | The request to create a Stripe customer with payment info
try {
    PaymentMethodResource result = apiInstance.createCustomerUsingPOST1(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsStripeApi#createCustomerUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StripeCreatePaymentMethod**](StripeCreatePaymentMethod.md)| The request to create a Stripe customer with payment info | [optional]

### Return type

[**PaymentMethodResource**](PaymentMethodResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="payInvoiceUsingPOST1"></a>
# **payInvoiceUsingPOST1**
> payInvoiceUsingPOST1(request)

Pay with a single use token

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsStripeApi;

PaymentsStripeApi apiInstance = new PaymentsStripeApi();
StripePaymentRequest request = new StripePaymentRequest(); // StripePaymentRequest | The request to pay an invoice
try {
    apiInstance.payInvoiceUsingPOST1(request);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsStripeApi#payInvoiceUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StripePaymentRequest**](StripePaymentRequest.md)| The request to pay an invoice | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

