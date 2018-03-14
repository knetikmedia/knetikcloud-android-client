# RuleEngineExpressionsApi

All URIs are relative to *https://jsapi-integration.us-east-1.elasticbeanstalk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBREExpression**](RuleEngineExpressionsApi.md#getBREExpression) | **GET** bre/expressions/{type} | Lookup a specific expression
[**getBREExpressions**](RuleEngineExpressionsApi.md#getBREExpressions) | **GET** bre/expressions | Get a list of supported expressions to use in conditions or actions.
[**getExpressionAsText**](RuleEngineExpressionsApi.md#getExpressionAsText) | **POST** bre/expressions | Returns the textual representation of an expression


<a name="getBREExpression"></a>
# **getBREExpression**
> ExpressionResource getBREExpression(type)

Lookup a specific expression

&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EXPRESSIONS_USER

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineExpressionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineExpressionsApi apiInstance = new RuleEngineExpressionsApi();
String type = "type_example"; // String | Specifiy the type of expression as returned by the listing endpoint
try {
    ExpressionResource result = apiInstance.getBREExpression(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineExpressionsApi#getBREExpression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Specifiy the type of expression as returned by the listing endpoint |

### Return type

[**ExpressionResource**](ExpressionResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBREExpressions"></a>
# **getBREExpressions**
> List&lt;ExpressionResource&gt; getBREExpressions(filterTypeGroup)

Get a list of supported expressions to use in conditions or actions.

Each resource contains a type and a definition that are read-only, all the other fields must be provided when using the expression in a rule. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EXPRESSIONS_USER

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineExpressionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineExpressionsApi apiInstance = new RuleEngineExpressionsApi();
String filterTypeGroup = "filterTypeGroup_example"; // String | Filter for expressions by type group
try {
    List<ExpressionResource> result = apiInstance.getBREExpressions(filterTypeGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineExpressionsApi#getBREExpressions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterTypeGroup** | **String**| Filter for expressions by type group | [optional] [enum: operation, lookup, predicate]

### Return type

[**List&lt;ExpressionResource&gt;**](ExpressionResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExpressionAsText"></a>
# **getExpressionAsText**
> StringWrapper getExpressionAsText(expression)

Returns the textual representation of an expression

&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EXPRESSIONS_USER

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.RuleEngineExpressionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

RuleEngineExpressionsApi apiInstance = new RuleEngineExpressionsApi();
ExpressionResource expression = new ExpressionResource(); // ExpressionResource | The expression resource to be converted
try {
    StringWrapper result = apiInstance.getExpressionAsText(expression);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleEngineExpressionsApi#getExpressionAsText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expression** | [**ExpressionResource**](ExpressionResource.md)| The expression resource to be converted | [optional]

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

