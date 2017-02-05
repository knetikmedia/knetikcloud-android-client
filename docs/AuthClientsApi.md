# AuthClientsApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignClientGrantTypesUsingPUT**](AuthClientsApi.md#assignClientGrantTypesUsingPUT) | **PUT** /auth/clients/{client_key}/grant-types | Set grant types for a client
[**assignClientRedirectUrisUsingPUT**](AuthClientsApi.md#assignClientRedirectUrisUsingPUT) | **PUT** /auth/clients/{client_key}/redirect-uris | Set redirect uris for a client
[**createClientUsingPOST**](AuthClientsApi.md#createClientUsingPOST) | **POST** /auth/clients | Create a new client
[**deleteClientUsingDELETE**](AuthClientsApi.md#deleteClientUsingDELETE) | **DELETE** /auth/clients/{client_key} | Delete a client
[**getClientUsingGET**](AuthClientsApi.md#getClientUsingGET) | **GET** /auth/clients/{client_key} | Get a single client
[**getClientsUsingGET**](AuthClientsApi.md#getClientsUsingGET) | **GET** /auth/clients | List and search clients
[**listAvailableGrantTypesUsingGET**](AuthClientsApi.md#listAvailableGrantTypesUsingGET) | **GET** /auth/clients/grant-types | List available client grant types
[**updateClientUsingPUT**](AuthClientsApi.md#updateClientUsingPUT) | **PUT** /auth/clients/{client_key} | Update a client


<a name="assignClientGrantTypesUsingPUT"></a>
# **assignClientGrantTypesUsingPUT**
> assignClientGrantTypesUsingPUT(clientKey, grantList)

Set grant types for a client

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthClientsApi;

AuthClientsApi apiInstance = new AuthClientsApi();
String clientKey = "clientKey_example"; // String | The key of the client
List<String> grantList = Arrays.asList(new List<String>()); // List<String> | A list of unique grant types
try {
    apiInstance.assignClientGrantTypesUsingPUT(clientKey, grantList);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthClientsApi#assignClientGrantTypesUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| The key of the client |
 **grantList** | **List&lt;String&gt;**| A list of unique grant types | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assignClientRedirectUrisUsingPUT"></a>
# **assignClientRedirectUrisUsingPUT**
> assignClientRedirectUrisUsingPUT(clientKey, redirectList)

Set redirect uris for a client

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthClientsApi;

AuthClientsApi apiInstance = new AuthClientsApi();
String clientKey = "clientKey_example"; // String | The key of the client
List<String> redirectList = Arrays.asList(new List<String>()); // List<String> | A list of unique redirect uris
try {
    apiInstance.assignClientRedirectUrisUsingPUT(clientKey, redirectList);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthClientsApi#assignClientRedirectUrisUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| The key of the client |
 **redirectList** | **List&lt;String&gt;**| A list of unique redirect uris | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClientUsingPOST"></a>
# **createClientUsingPOST**
> ClientResource createClientUsingPOST(clientResource)

Create a new client

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthClientsApi;

AuthClientsApi apiInstance = new AuthClientsApi();
ClientResource clientResource = new ClientResource(); // ClientResource | The client resource object
try {
    ClientResource result = apiInstance.createClientUsingPOST(clientResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthClientsApi#createClientUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientResource** | [**ClientResource**](ClientResource.md)| The client resource object | [optional]

### Return type

[**ClientResource**](ClientResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClientUsingDELETE"></a>
# **deleteClientUsingDELETE**
> deleteClientUsingDELETE(clientKey)

Delete a client

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthClientsApi;

AuthClientsApi apiInstance = new AuthClientsApi();
String clientKey = "clientKey_example"; // String | The key of the client
try {
    apiInstance.deleteClientUsingDELETE(clientKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthClientsApi#deleteClientUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| The key of the client |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientUsingGET"></a>
# **getClientUsingGET**
> ClientResource getClientUsingGET(clientKey)

Get a single client

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthClientsApi;

AuthClientsApi apiInstance = new AuthClientsApi();
String clientKey = "clientKey_example"; // String | The key of the client
try {
    ClientResource result = apiInstance.getClientUsingGET(clientKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthClientsApi#getClientUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| The key of the client |

### Return type

[**ClientResource**](ClientResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientsUsingGET"></a>
# **getClientsUsingGET**
> PageResourceClientResource getClientsUsingGET(size, page, order)

List and search clients

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthClientsApi;

AuthClientsApi apiInstance = new AuthClientsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceClientResource result = apiInstance.getClientsUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthClientsApi#getClientsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceClientResource**](PageResourceClientResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAvailableGrantTypesUsingGET"></a>
# **listAvailableGrantTypesUsingGET**
> List&lt;GrantTypeResource&gt; listAvailableGrantTypesUsingGET()

List available client grant types

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthClientsApi;

AuthClientsApi apiInstance = new AuthClientsApi();
try {
    List<GrantTypeResource> result = apiInstance.listAvailableGrantTypesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthClientsApi#listAvailableGrantTypesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GrantTypeResource&gt;**](GrantTypeResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClientUsingPUT"></a>
# **updateClientUsingPUT**
> updateClientUsingPUT(clientKey, clientResource)

Update a client

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthClientsApi;

AuthClientsApi apiInstance = new AuthClientsApi();
String clientKey = "clientKey_example"; // String | The key of the client
ClientResource clientResource = new ClientResource(); // ClientResource | The client resource object
try {
    apiInstance.updateClientUsingPUT(clientKey, clientResource);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthClientsApi#updateClientUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| The key of the client |
 **clientResource** | [**ClientResource**](ClientResource.md)| The client resource object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

