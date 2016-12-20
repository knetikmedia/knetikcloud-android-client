# UtilSecurityApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserLocationLogUsingGET**](UtilSecurityApi.md#getUserLocationLogUsingGET) | **GET** /security/country-log | Returns the authentication log for a user
[**userUsingGET**](UtilSecurityApi.md#userUsingGET) | **GET** /me | Returns the authentication token details. Use /users endpoint for detailed user&#39;s info


<a name="getUserLocationLogUsingGET"></a>
# **getUserLocationLogUsingGET**
> PageLocationLogResource getUserLocationLogUsingGET(userId)

Returns the authentication log for a user

A log entry is recorded everytime a user requests a new token. Standard pagination available

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilSecurityApi;

UtilSecurityApi apiInstance = new UtilSecurityApi();
Integer userId = 56; // Integer | The user id
try {
    PageLocationLogResource result = apiInstance.getUserLocationLogUsingGET(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilSecurityApi#getUserLocationLogUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The user id | [optional]

### Return type

[**PageLocationLogResource**](PageLocationLogResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUsingGET"></a>
# **userUsingGET**
> TokenDetailsResource userUsingGET()

Returns the authentication token details. Use /users endpoint for detailed user&#39;s info

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilSecurityApi;

UtilSecurityApi apiInstance = new UtilSecurityApi();
try {
    TokenDetailsResource result = apiInstance.userUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilSecurityApi#userUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TokenDetailsResource**](TokenDetailsResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

