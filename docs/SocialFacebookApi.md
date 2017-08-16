# SocialFacebookApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linkAccounts**](SocialFacebookApi.md#linkAccounts) | **POST** social/facebook/users | Link facebook account


<a name="linkAccounts"></a>
# **linkAccounts**
> Void linkAccounts(facebookToken)

Link facebook account

Links the current user account to a facebook account, using the acccess token from facebook. Can also be used to update the access token after it has expired.

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.SocialFacebookApi;


SocialFacebookApi apiInstance = new SocialFacebookApi();
FacebookToken facebookToken = new FacebookToken(); // FacebookToken | The token from facebook
try {
    Void result = apiInstance.linkAccounts(facebookToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialFacebookApi#linkAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facebookToken** | [**FacebookToken**](FacebookToken.md)| The token from facebook | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

