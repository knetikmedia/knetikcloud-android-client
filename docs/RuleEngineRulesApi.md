# RuleEngineRulesApi

All URIs are relative to *https://jsapi-integration.us-east-1.elasticbeanstalk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBRERule**](RuleEngineRulesApi.md#createBRERule) | **POST** bre/rules | Create a rule
[**deleteBRERule**](RuleEngineRulesApi.md#deleteBRERule) | **DELETE** bre/rules/{id} | Delete a rule
[**getBREExpressionAsString**](RuleEngineRulesApi.md#getBREExpressionAsString) | **POST** bre/rules/expression-as-string | Returns a string representation of the provided expression
[**getBRERule**](RuleEngineRulesApi.md#getBRERule) | **GET** bre/rules/{id} | Get a single rule
[**getBRERules**](RuleEngineRulesApi.md#getBRERules) | **GET** bre/rules | List rules
[**setBRERule**](RuleEngineRulesApi.md#setBRERule) | **PUT** bre/rules/{id}/enabled | Enable or disable a rule
[**updateBRERule**](RuleEngineRulesApi.md#updateBRERule) | **PUT** bre/rules/{id} | Update a rule


<a name="createBRERule"></a>
# **createBRERule**
> BreRule createBRERule(breRule)

Create a rule

Rules define which actions to run when a given event verifies the specified condition. Full list of predicates and other type of expressions can be found at GET /bre/expressions/. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineRulesApi apiInstance = new RuleEngineRulesApi();
BreRule breRule = new BreRule(); // BreRule | The BRE rule object
try {
    BreRule result = apiInstance.createBRERule(breRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineRulesApi#createBRERule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **breRule** | [**BreRule**](BreRule.md)| The BRE rule object | [optional]

### Return type

[**BreRule**](BreRule.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBRERule"></a>
# **deleteBRERule**
> Void deleteBRERule(id)

Delete a rule

May fail if there are existing rules against it. Cannot delete core rules. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineRulesApi apiInstance = new RuleEngineRulesApi();
String id = "id_example"; // String | The id of the rule
try {
    Void result = apiInstance.deleteBRERule(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineRulesApi#deleteBRERule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the rule |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBREExpressionAsString"></a>
# **getBREExpressionAsString**
> String getBREExpressionAsString(expression)

Returns a string representation of the provided expression

&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineRulesApi apiInstance = new RuleEngineRulesApi();
Expressionobject expression = new Expressionobject(); // Expressionobject | The expression
try {
    String result = apiInstance.getBREExpressionAsString(expression);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineRulesApi#getBREExpressionAsString");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expression** | [**Expressionobject**](Expressionobject.md)| The expression | [optional]

### Return type

**String**

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBRERule"></a>
# **getBRERule**
> BreRule getBRERule(id)

Get a single rule

&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineRulesApi apiInstance = new RuleEngineRulesApi();
String id = "id_example"; // String | The id of the rule
try {
    BreRule result = apiInstance.getBRERule(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineRulesApi#getBRERule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the rule |

### Return type

[**BreRule**](BreRule.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBRERules"></a>
# **getBRERules**
> PageResourceBreRule getBRERules(filterName, filterEnabled, filterSystem, filterTrigger, filterAction, filterCondition, size, page)

List rules

&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineRulesApi apiInstance = new RuleEngineRulesApi();
String filterName = "filterName_example"; // String | Filter for rules containing the given name
Boolean filterEnabled = null; // Boolean | Filter for rules by active status, null for both
Boolean filterSystem = true; // Boolean | Filter for rules that are system rules when true, or not when false. Leave off for both mixed
String filterTrigger = "filterTrigger_example"; // String | Filter for rules that are for the trigger with the given name
String filterAction = "filterAction_example"; // String | Filter for rules that use the action with the given name
String filterCondition = "filterCondition_example"; // String | Filter for rules that have a condition containing the given string
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceBreRule result = apiInstance.getBRERules(filterName, filterEnabled, filterSystem, filterTrigger, filterAction, filterCondition, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineRulesApi#getBRERules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterName** | **String**| Filter for rules containing the given name | [optional]
 **filterEnabled** | **Boolean**| Filter for rules by active status, null for both | [optional] [default to null]
 **filterSystem** | **Boolean**| Filter for rules that are system rules when true, or not when false. Leave off for both mixed | [optional]
 **filterTrigger** | **String**| Filter for rules that are for the trigger with the given name | [optional]
 **filterAction** | **String**| Filter for rules that use the action with the given name | [optional]
 **filterCondition** | **String**| Filter for rules that have a condition containing the given string | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceBreRule**](PageResourceBreRule.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setBRERule"></a>
# **setBRERule**
> Void setBRERule(id, enabled)

Enable or disable a rule

This is helpful for turning off systems rules which cannot be deleted or modified otherwise. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineRulesApi apiInstance = new RuleEngineRulesApi();
String id = "id_example"; // String | The id of the rule
BooleanResource enabled = new BooleanResource(); // BooleanResource | The boolean value
try {
    Void result = apiInstance.setBRERule(id, enabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineRulesApi#setBRERule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the rule |
 **enabled** | [**BooleanResource**](BooleanResource.md)| The boolean value | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBRERule"></a>
# **updateBRERule**
> BreRule updateBRERule(id, breRule)

Update a rule

Cannot update system rules. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineRulesApi apiInstance = new RuleEngineRulesApi();
String id = "id_example"; // String | The id of the rule
BreRule breRule = new BreRule(); // BreRule | The BRE rule object
try {
    BreRule result = apiInstance.updateBRERule(id, breRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineRulesApi#updateBRERule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the rule |
 **breRule** | [**BreRule**](BreRule.md)| The BRE rule object | [optional]

### Return type

[**BreRule**](BreRule.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

