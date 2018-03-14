# PaymentsXsollaApi

All URIs are relative to *https://jsapi-integration.us-east-1.elasticbeanstalk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createXsollaTokenUrl**](PaymentsXsollaApi.md#createXsollaTokenUrl) | **POST** payment/provider/xsolla/payment | Create a payment token that should be used to forward the user to Xsolla so they can complete payment


<a name="createXsollaTokenUrl"></a>
# **createXsollaTokenUrl**
> String createXsollaTokenUrl(request)

Create a payment token that should be used to forward the user to Xsolla so they can complete payment

&lt;b&gt;Permissions Needed:&lt;/b&gt; XSOLLA_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.PaymentsXsollaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

PaymentsXsollaApi apiInstance = new PaymentsXsollaApi();
XsollaPaymentRequest request = new XsollaPaymentRequest(); // XsollaPaymentRequest | The payment request to be sent to XSolla
try {
    String result = apiInstance.createXsollaTokenUrl(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsXsollaApi#createXsollaTokenUrl");
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

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

