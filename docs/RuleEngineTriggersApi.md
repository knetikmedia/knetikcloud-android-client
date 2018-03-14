# RuleEngineTriggersApi

All URIs are relative to *https://jsapi-integration.us-east-1.elasticbeanstalk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBRETrigger**](RuleEngineTriggersApi.md#createBRETrigger) | **POST** bre/triggers | Create a trigger
[**deleteBRETrigger**](RuleEngineTriggersApi.md#deleteBRETrigger) | **DELETE** bre/triggers/{event_name} | Delete a trigger
[**getBRETrigger**](RuleEngineTriggersApi.md#getBRETrigger) | **GET** bre/triggers/{event_name} | Get a single trigger
[**getBRETriggers**](RuleEngineTriggersApi.md#getBRETriggers) | **GET** bre/triggers | List triggers
[**updateBRETrigger**](RuleEngineTriggersApi.md#updateBRETrigger) | **PUT** bre/triggers/{event_name} | Update a trigger


<a name="createBRETrigger"></a>
# **createBRETrigger**
> BreTriggerResource createBRETrigger(breTriggerResource)

Create a trigger

Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineTriggersApi apiInstance = new RuleEngineTriggersApi();
BreTriggerResource breTriggerResource = new BreTriggerResource(); // BreTriggerResource | The BRE trigger resource object
try {
    BreTriggerResource result = apiInstance.createBRETrigger(breTriggerResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineTriggersApi#createBRETrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **breTriggerResource** | [**BreTriggerResource**](BreTriggerResource.md)| The BRE trigger resource object | [optional]

### Return type

[**BreTriggerResource**](BreTriggerResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBRETrigger"></a>
# **deleteBRETrigger**
> Void deleteBRETrigger(eventName)

Delete a trigger

May fail if there are existing rules against it. Cannot delete core triggers. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineTriggersApi apiInstance = new RuleEngineTriggersApi();
String eventName = "eventName_example"; // String | The trigger event name
try {
    Void result = apiInstance.deleteBRETrigger(eventName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineTriggersApi#deleteBRETrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventName** | **String**| The trigger event name |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBRETrigger"></a>
# **getBRETrigger**
> BreTriggerResource getBRETrigger(eventName)

Get a single trigger

&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_USER

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineTriggersApi apiInstance = new RuleEngineTriggersApi();
String eventName = "eventName_example"; // String | The trigger event name
try {
    BreTriggerResource result = apiInstance.getBRETrigger(eventName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineTriggersApi#getBRETrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventName** | **String**| The trigger event name |

### Return type

[**BreTriggerResource**](BreTriggerResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBRETriggers"></a>
# **getBRETriggers**
> PageResourceBreTriggerResource getBRETriggers(filterSystem, filterCategory, filterTags, filterName, filterSearch, size, page)

List triggers

&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_USER

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineTriggersApi apiInstance = new RuleEngineTriggersApi();
Boolean filterSystem = true; // Boolean | Filter for triggers that are system triggers when true, or not when false. Leave off for both mixed
String filterCategory = "filterCategory_example"; // String | Filter for triggers that are within a specific category
String filterTags = "filterTags_example"; // String | Filter for triggers that have all of the given tags (comma separated list)
String filterName = "filterName_example"; // String | Filter for triggers that have names containing the given string
String filterSearch = "filterSearch_example"; // String | Filter for triggers containing the given words somewhere within name, description and tags
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceBreTriggerResource result = apiInstance.getBRETriggers(filterSystem, filterCategory, filterTags, filterName, filterSearch, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineTriggersApi#getBRETriggers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterSystem** | **Boolean**| Filter for triggers that are system triggers when true, or not when false. Leave off for both mixed | [optional]
 **filterCategory** | **String**| Filter for triggers that are within a specific category | [optional] [enum: achievement, behavior, comment, disposition, device, entitlement, friends, fulfillment, gamification, inventory, invoice, media, scheduler, store, subscription, user, wallet, custom, challenge, activity, campaign, event]
 **filterTags** | **String**| Filter for triggers that have all of the given tags (comma separated list) | [optional]
 **filterName** | **String**| Filter for triggers that have names containing the given string | [optional]
 **filterSearch** | **String**| Filter for triggers containing the given words somewhere within name, description and tags | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceBreTriggerResource**](PageResourceBreTriggerResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBRETrigger"></a>
# **updateBRETrigger**
> BreTriggerResource updateBRETrigger(eventName, breTriggerResource)

Update a trigger

May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineTriggersApi apiInstance = new RuleEngineTriggersApi();
String eventName = "eventName_example"; // String | The trigger event name
BreTriggerResource breTriggerResource = new BreTriggerResource(); // BreTriggerResource | The BRE trigger resource object
try {
    BreTriggerResource result = apiInstance.updateBRETrigger(eventName, breTriggerResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineTriggersApi#updateBRETrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventName** | **String**| The trigger event name |
 **breTriggerResource** | [**BreTriggerResource**](BreTriggerResource.md)| The BRE trigger resource object | [optional]

### Return type

[**BreTriggerResource**](BreTriggerResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

