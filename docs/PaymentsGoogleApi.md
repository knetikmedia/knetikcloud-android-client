# PaymentsGoogleApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handlePaymentUsingPOST**](PaymentsGoogleApi.md#handlePaymentUsingPOST) | **POST** /payment/provider/google/payments | Mark an invoice paid with Google


<a name="handlePaymentUsingPOST"></a>
# **handlePaymentUsingPOST**
> Integer handlePaymentUsingPOST(request)

Mark an invoice paid with Google

Mark an invoice paid with Google. Verifies signature from Google and treats the developerPayload field inside the json payload as the id of the invoice to pay. Returns the transaction ID if successful.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsGoogleApi;

PaymentsGoogleApi apiInstance = new PaymentsGoogleApi();
GooglePaymentRequest request = new GooglePaymentRequest(); // GooglePaymentRequest | The request for paying an invoice through a Google in-app payment
try {
    Integer result = apiInstance.handlePaymentUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsGoogleApi#handlePaymentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GooglePaymentRequest**](GooglePaymentRequest.md)| The request for paying an invoice through a Google in-app payment | [optional]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

