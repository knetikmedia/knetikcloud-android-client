# AuthTokensApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTokenUsingDELETE**](AuthTokensApi.md#deleteTokenUsingDELETE) | **DELETE** /auth/tokens/{username} | Delete all tokens by username
[**deleteTokenWithClientIdUsingDELETE**](AuthTokensApi.md#deleteTokenWithClientIdUsingDELETE) | **DELETE** /auth/tokens/{username}/{client_id} | Delete a token by username and client id
[**getTokenByUserUsingGET**](AuthTokensApi.md#getTokenByUserUsingGET) | **GET** /auth/tokens/{username}/{client_id} | Get a single token by username and client id
[**getTokensUsingGET**](AuthTokensApi.md#getTokensUsingGET) | **GET** /auth/tokens | List usernames and client ids


<a name="deleteTokenUsingDELETE"></a>
# **deleteTokenUsingDELETE**
> deleteTokenUsingDELETE(username)

Delete all tokens by username

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthTokensApi;

AuthTokensApi apiInstance = new AuthTokensApi();
String username = "username_example"; // String | The username of the user
try {
    apiInstance.deleteTokenUsingDELETE(username);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTokensApi#deleteTokenUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username of the user |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTokenWithClientIdUsingDELETE"></a>
# **deleteTokenWithClientIdUsingDELETE**
> deleteTokenWithClientIdUsingDELETE(username, clientId)

Delete a token by username and client id

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthTokensApi;

AuthTokensApi apiInstance = new AuthTokensApi();
String username = "username_example"; // String | The username of the user
String clientId = "clientId_example"; // String | The id of the client
try {
    apiInstance.deleteTokenWithClientIdUsingDELETE(username, clientId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTokensApi#deleteTokenWithClientIdUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username of the user |
 **clientId** | **String**| The id of the client |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenByUserUsingGET"></a>
# **getTokenByUserUsingGET**
> OauthAccessTokenResource getTokenByUserUsingGET(username, clientId)

Get a single token by username and client id

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthTokensApi;

AuthTokensApi apiInstance = new AuthTokensApi();
String username = "username_example"; // String | The username of the user
String clientId = "clientId_example"; // String | The id of the client
try {
    OauthAccessTokenResource result = apiInstance.getTokenByUserUsingGET(username, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTokensApi#getTokenByUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username of the user |
 **clientId** | **String**| The id of the client |

### Return type

[**OauthAccessTokenResource**](OauthAccessTokenResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokensUsingGET"></a>
# **getTokensUsingGET**
> PageResourceOauthAccessTokenResource getTokensUsingGET(filterClientId, filterUsername, size, page, order)

List usernames and client ids

Token value not shown

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthTokensApi;

AuthTokensApi apiInstance = new AuthTokensApi();
String filterClientId = "filterClientId_example"; // String | Filters for token whose client id matches provided string
String filterUsername = "filterUsername_example"; // String | Filters for token whose username matches provided string
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "username:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceOauthAccessTokenResource result = apiInstance.getTokensUsingGET(filterClientId, filterUsername, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTokensApi#getTokensUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterClientId** | **String**| Filters for token whose client id matches provided string | [optional]
 **filterUsername** | **String**| Filters for token whose username matches provided string | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to username:ASC]

### Return type

[**PageResourceOauthAccessTokenResource**](PageResourceOauthAccessTokenResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

