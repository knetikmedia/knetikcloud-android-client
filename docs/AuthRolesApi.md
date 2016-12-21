# AuthRolesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignClientRolesUsingPUT**](AuthRolesApi.md#assignClientRolesUsingPUT) | **PUT** /auth/clients/{client_key}/roles | Set roles for a client
[**assignPermissionsUsingPUT**](AuthRolesApi.md#assignPermissionsUsingPUT) | **PUT** /auth/roles/{role}/permissions | Set permissions for a role
[**assignUserRolesExternalUsingPUT**](AuthRolesApi.md#assignUserRolesExternalUsingPUT) | **PUT** /auth/users/{user_id}/roles | Set roles for a user
[**createRoleUsingPOST**](AuthRolesApi.md#createRoleUsingPOST) | **POST** /auth/roles | Create a new role
[**deleteRoleUsingDELETE**](AuthRolesApi.md#deleteRoleUsingDELETE) | **DELETE** /auth/roles/{role} | Delete a role
[**getClientRolesUsingGET**](AuthRolesApi.md#getClientRolesUsingGET) | **GET** /auth/clients/{client_key}/roles | Get roles for a client
[**getRoleUsingGET**](AuthRolesApi.md#getRoleUsingGET) | **GET** /auth/roles/{role} | Get a single role
[**getRolesUsingGET**](AuthRolesApi.md#getRolesUsingGET) | **GET** /auth/roles | List and search roles
[**getUserRolesUsingGET**](AuthRolesApi.md#getUserRolesUsingGET) | **GET** /auth/users/{user_id}/roles | Get roles for a user
[**updateRoleUsingPUT**](AuthRolesApi.md#updateRoleUsingPUT) | **PUT** /auth/roles/{role} | Update a role


<a name="assignClientRolesUsingPUT"></a>
# **assignClientRolesUsingPUT**
> assignClientRolesUsingPUT(clientKey, rolesList)

Set roles for a client

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthRolesApi;

AuthRolesApi apiInstance = new AuthRolesApi();
String clientKey = "clientKey_example"; // String | The client key
List<String> rolesList = Arrays.asList(new List<String>()); // List<String> | The list of unique roles
try {
    apiInstance.assignClientRolesUsingPUT(clientKey, rolesList);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#assignClientRolesUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| The client key |
 **rolesList** | **List&lt;String&gt;**| The list of unique roles | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assignPermissionsUsingPUT"></a>
# **assignPermissionsUsingPUT**
> assignPermissionsUsingPUT(role, permissionsList)

Set permissions for a role

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthRolesApi;

AuthRolesApi apiInstance = new AuthRolesApi();
String role = "role_example"; // String | The role value
List<String> permissionsList = Arrays.asList(new List<String>()); // List<String> | The list of unique permissions
try {
    apiInstance.assignPermissionsUsingPUT(role, permissionsList);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#assignPermissionsUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| The role value |
 **permissionsList** | **List&lt;String&gt;**| The list of unique permissions | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assignUserRolesExternalUsingPUT"></a>
# **assignUserRolesExternalUsingPUT**
> assignUserRolesExternalUsingPUT(userId, rolesList)

Set roles for a user

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthRolesApi;

AuthRolesApi apiInstance = new AuthRolesApi();
Integer userId = 56; // Integer | The user's id
List<String> rolesList = Arrays.asList(new List<String>()); // List<String> | The list of unique roles
try {
    apiInstance.assignUserRolesExternalUsingPUT(userId, rolesList);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#assignUserRolesExternalUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The user&#39;s id |
 **rolesList** | **List&lt;String&gt;**| The list of unique roles | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRoleUsingPOST"></a>
# **createRoleUsingPOST**
> RoleResource createRoleUsingPOST(roleResource)

Create a new role

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthRolesApi;

AuthRolesApi apiInstance = new AuthRolesApi();
RoleResource roleResource = new RoleResource(); // RoleResource | The role resource object
try {
    RoleResource result = apiInstance.createRoleUsingPOST(roleResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#createRoleUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleResource** | [**RoleResource**](RoleResource.md)| The role resource object | [optional]

### Return type

[**RoleResource**](RoleResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRoleUsingDELETE"></a>
# **deleteRoleUsingDELETE**
> deleteRoleUsingDELETE(role, force)

Delete a role

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthRolesApi;

AuthRolesApi apiInstance = new AuthRolesApi();
String role = "role_example"; // String | The role value
Boolean force = true; // Boolean | If true, removes role from users/clients
try {
    apiInstance.deleteRoleUsingDELETE(role, force);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#deleteRoleUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| The role value |
 **force** | **Boolean**| If true, removes role from users/clients | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientRolesUsingGET"></a>
# **getClientRolesUsingGET**
> List&lt;RoleResource&gt; getClientRolesUsingGET(clientKey)

Get roles for a client

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthRolesApi;

AuthRolesApi apiInstance = new AuthRolesApi();
String clientKey = "clientKey_example"; // String | The client key
try {
    List<RoleResource> result = apiInstance.getClientRolesUsingGET(clientKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#getClientRolesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| The client key |

### Return type

[**List&lt;RoleResource&gt;**](RoleResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRoleUsingGET"></a>
# **getRoleUsingGET**
> RoleResource getRoleUsingGET(role)

Get a single role

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthRolesApi;

AuthRolesApi apiInstance = new AuthRolesApi();
String role = "role_example"; // String | The role value
try {
    RoleResource result = apiInstance.getRoleUsingGET(role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#getRoleUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| The role value |

### Return type

[**RoleResource**](RoleResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRolesUsingGET"></a>
# **getRolesUsingGET**
> PageResourceRoleResource getRolesUsingGET(size, page, order)

List and search roles

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthRolesApi;

AuthRolesApi apiInstance = new AuthRolesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "name:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceRoleResource result = apiInstance.getRolesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#getRolesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to name:ASC]

### Return type

[**PageResourceRoleResource**](PageResourceRoleResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserRolesUsingGET"></a>
# **getUserRolesUsingGET**
> List&lt;RoleResource&gt; getUserRolesUsingGET(userId)

Get roles for a user

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthRolesApi;

AuthRolesApi apiInstance = new AuthRolesApi();
Integer userId = 56; // Integer | The user's id
try {
    List<RoleResource> result = apiInstance.getUserRolesUsingGET(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#getUserRolesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The user&#39;s id |

### Return type

[**List&lt;RoleResource&gt;**](RoleResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRoleUsingPUT"></a>
# **updateRoleUsingPUT**
> updateRoleUsingPUT(role, roleResource)

Update a role

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthRolesApi;

AuthRolesApi apiInstance = new AuthRolesApi();
String role = "role_example"; // String | The role value
RoleResource roleResource = new RoleResource(); // RoleResource | The role resource object
try {
    apiInstance.updateRoleUsingPUT(role, roleResource);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#updateRoleUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| The role value |
 **roleResource** | [**RoleResource**](RoleResource.md)| The role resource object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

