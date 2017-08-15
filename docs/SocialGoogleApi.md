# SocialGoogleApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linkAccounts1**](SocialGoogleApi.md#linkAccounts1) | **POST** /social/google/users | Link google account


<a name="linkAccounts1"></a>
# **linkAccounts1**
> linkAccounts1(googleToken)

Link google account

Links the current user account to a google account, using the acccess token from google. Can also be used to update the access token after it has expired.

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.SocialGoogleApi;


SocialGoogleApi apiInstance = new SocialGoogleApi();
GoogleToken googleToken = new GoogleToken(); // GoogleToken | The token from google
try {
    apiInstance.linkAccounts1(googleToken);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialGoogleApi#linkAccounts1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **googleToken** | [**GoogleToken**](GoogleToken.md)| The token from google | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

