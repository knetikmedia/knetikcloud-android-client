# AuthPermissionsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPermissionUsingPOST**](AuthPermissionsApi.md#createPermissionUsingPOST) | **POST** /auth/permissions | Create a new permission
[**deletePermissionUsingDELETE**](AuthPermissionsApi.md#deletePermissionUsingDELETE) | **DELETE** /auth/permissions/{permission} | Delete a permission
[**getPermissionUsingGET**](AuthPermissionsApi.md#getPermissionUsingGET) | **GET** /auth/permissions/{permission} | Get a single permission
[**getPermissionUsingGET1**](AuthPermissionsApi.md#getPermissionUsingGET1) | **GET** /auth/permissions | List and search permissions
[**updatePermissionUsingPUT**](AuthPermissionsApi.md#updatePermissionUsingPUT) | **PUT** /auth/permissions/{permission} | Update a permission


<a name="createPermissionUsingPOST"></a>
# **createPermissionUsingPOST**
> PermissionResource createPermissionUsingPOST(permissionResource)

Create a new permission

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthPermissionsApi;

AuthPermissionsApi apiInstance = new AuthPermissionsApi();
PermissionResource permissionResource = new PermissionResource(); // PermissionResource | The permission resource object
try {
    PermissionResource result = apiInstance.createPermissionUsingPOST(permissionResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthPermissionsApi#createPermissionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permissionResource** | [**PermissionResource**](PermissionResource.md)| The permission resource object | [optional]

### Return type

[**PermissionResource**](PermissionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePermissionUsingDELETE"></a>
# **deletePermissionUsingDELETE**
> deletePermissionUsingDELETE(permission, force)

Delete a permission

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthPermissionsApi;

AuthPermissionsApi apiInstance = new AuthPermissionsApi();
String permission = "permission_example"; // String | The permission value
Boolean force = true; // Boolean | If true, removes permission assigned to roles
try {
    apiInstance.deletePermissionUsingDELETE(permission, force);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthPermissionsApi#deletePermissionUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permission** | **String**| The permission value |
 **force** | **Boolean**| If true, removes permission assigned to roles | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPermissionUsingGET"></a>
# **getPermissionUsingGET**
> PermissionResource getPermissionUsingGET(permission)

Get a single permission

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthPermissionsApi;

AuthPermissionsApi apiInstance = new AuthPermissionsApi();
String permission = "permission_example"; // String | The permission value
try {
    PermissionResource result = apiInstance.getPermissionUsingGET(permission);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthPermissionsApi#getPermissionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permission** | **String**| The permission value |

### Return type

[**PermissionResource**](PermissionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPermissionUsingGET1"></a>
# **getPermissionUsingGET1**
> PagePermissionResource getPermissionUsingGET1(size, page, order)

List and search permissions

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthPermissionsApi;

AuthPermissionsApi apiInstance = new AuthPermissionsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "permission:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PagePermissionResource result = apiInstance.getPermissionUsingGET1(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthPermissionsApi#getPermissionUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to permission:ASC]

### Return type

[**PagePermissionResource**](PagePermissionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePermissionUsingPUT"></a>
# **updatePermissionUsingPUT**
> updatePermissionUsingPUT(permission, permissionResource)

Update a permission

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthPermissionsApi;

AuthPermissionsApi apiInstance = new AuthPermissionsApi();
String permission = "permission_example"; // String | The permission value
PermissionResource permissionResource = new PermissionResource(); // PermissionResource | The permission resource object
try {
    apiInstance.updatePermissionUsingPUT(permission, permissionResource);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthPermissionsApi#updatePermissionUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permission** | **String**| The permission value |
 **permissionResource** | [**PermissionResource**](PermissionResource.md)| The permission resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

