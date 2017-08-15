# PaymentsFattMerchantApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateFattMerchantPaymentMethod**](PaymentsFattMerchantApi.md#createOrUpdateFattMerchantPaymentMethod) | **PUT** /payment/provider/fattmerchant/payment-methods | Create or update a FattMerchant payment method for a user


<a name="createOrUpdateFattMerchantPaymentMethod"></a>
# **createOrUpdateFattMerchantPaymentMethod**
> PaymentMethodResource createOrUpdateFattMerchantPaymentMethod(request)

Create or update a FattMerchant payment method for a user

Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints.

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.PaymentsFattMerchantApi;


PaymentsFattMerchantApi apiInstance = new PaymentsFattMerchantApi();
FattMerchantPaymentMethodRequest request = new FattMerchantPaymentMethodRequest(); // FattMerchantPaymentMethodRequest | Request containing payment method information for user
try {
    PaymentMethodResource result = apiInstance.createOrUpdateFattMerchantPaymentMethod(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsFattMerchantApi#createOrUpdateFattMerchantPaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**FattMerchantPaymentMethodRequest**](FattMerchantPaymentMethodRequest.md)| Request containing payment method information for user | [optional]

### Return type

[**PaymentMethodResource**](PaymentMethodResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

