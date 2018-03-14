# RuleEngineActionsApi

All URIs are relative to *https://jsapi-integration.us-east-1.elasticbeanstalk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBREActions**](RuleEngineActionsApi.md#getBREActions) | **GET** bre/actions | Get a list of available actions


<a name="getBREActions"></a>
# **getBREActions**
> List&lt;ActionResource&gt; getBREActions(filterCategory, filterName, filterTags, filterSearch)

Get a list of available actions

&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_ACTIONS_USER

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineActionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineActionsApi apiInstance = new RuleEngineActionsApi();
String filterCategory = "filterCategory_example"; // String | Filter for actions that are within a specific category
String filterName = "filterName_example"; // String | Filter for actions that have names containing the given string
String filterTags = "filterTags_example"; // String | Filter for actions that have all of the given tags (comma separated list)
String filterSearch = "filterSearch_example"; // String | Filter for actions containing the given words somewhere within name, description and tags
try {
    List<ActionResource> result = apiInstance.getBREActions(filterCategory, filterName, filterTags, filterSearch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineActionsApi#getBREActions");
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

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

