# BRERuleEngineActionsApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBREActions**](BRERuleEngineActionsApi.md#getBREActions) | **GET** /bre/actions | Get a list of available actions


<a name="getBREActions"></a>
# **getBREActions**
> List&lt;ActionResource&gt; getBREActions(filterCategory, filterName, filterTags, filterSearch)

Get a list of available actions

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.BRERuleEngineActionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

BRERuleEngineActionsApi apiInstance = new BRERuleEngineActionsApi();
String filterCategory = "filterCategory_example"; // String | Filter for actions that are within a specific category
String filterName = "filterName_example"; // String | Filter for actions that have names containing the given string
String filterTags = "filterTags_example"; // String | Filter for actions that have all of the given tags (comma separated list)
String filterSearch = "filterSearch_example"; // String | Filter for actions containing the given words somewhere within name, description and tags
try {
    List<ActionResource> result = apiInstance.getBREActions(filterCategory, filterName, filterTags, filterSearch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineActionsApi#getBREActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterCategory** | **String**| Filter for actions that are within a specific category | [optional] [enum: achievement, behavior, comment, disposition, device, entitlement, friends, fulfillment, gamification, inventory, invoice, media, scheduler, store, subscription, user, wallet, custom, challenge, activity, campaign, event]
 **filterName** | **String**| Filter for actions that have names containing the given string | [optional]
 **filterTags** | **String**| Filter for actions that have all of the given tags (comma separated list) | [optional]
 **filterSearch** | **String**| Filter for actions containing the given words somewhere within name, description and tags | [optional]

### Return type

[**List&lt;ActionResource&gt;**](ActionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

