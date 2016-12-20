# ConfigsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConfigUsingPOST**](ConfigsApi.md#createConfigUsingPOST) | **POST** /configs | Create a new config
[**deleteConfigUsingDELETE**](ConfigsApi.md#deleteConfigUsingDELETE) | **DELETE** /configs/{name} | Delete an existing config
[**getConfigUsingGET**](ConfigsApi.md#getConfigUsingGET) | **GET** /configs/{name} | Get a single config
[**getConfigsUsingGET**](ConfigsApi.md#getConfigsUsingGET) | **GET** /configs | List and search configs
[**updateConfigUsingPUT**](ConfigsApi.md#updateConfigUsingPUT) | **PUT** /configs/{name} | Update an existing config


<a name="createConfigUsingPOST"></a>
# **createConfigUsingPOST**
> Config createConfigUsingPOST(config)

Create a new config

### Example
```java
// Import classes:
//import io.swagger.client.api.ConfigsApi;

ConfigsApi apiInstance = new ConfigsApi();
Config config = new Config(); // Config | The config object
try {
    Config result = apiInstance.createConfigUsingPOST(config);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigsApi#createConfigUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | [**Config**](Config.md)| The config object | [optional]

### Return type

[**Config**](Config.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteConfigUsingDELETE"></a>
# **deleteConfigUsingDELETE**
> deleteConfigUsingDELETE(name)

Delete an existing config

### Example
```java
// Import classes:
//import io.swagger.client.api.ConfigsApi;

ConfigsApi apiInstance = new ConfigsApi();
String name = "name_example"; // String | The config name
try {
    apiInstance.deleteConfigUsingDELETE(name);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigsApi#deleteConfigUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The config name |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConfigUsingGET"></a>
# **getConfigUsingGET**
> Config getConfigUsingGET(name)

Get a single config

Only configs that are public readable will be shown without admin access

### Example
```java
// Import classes:
//import io.swagger.client.api.ConfigsApi;

ConfigsApi apiInstance = new ConfigsApi();
String name = "name_example"; // String | The config name
try {
    Config result = apiInstance.getConfigUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigsApi#getConfigUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The config name |

### Return type

[**Config**](Config.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConfigsUsingGET"></a>
# **getConfigsUsingGET**
> PageResourceConfig getConfigsUsingGET(filterSearch, size, page, order)

List and search configs

### Example
```java
// Import classes:
//import io.swagger.client.api.ConfigsApi;

ConfigsApi apiInstance = new ConfigsApi();
String filterSearch = "filterSearch_example"; // String | Filter for configs whose name contains the given string
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "1"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceConfig result = apiInstance.getConfigsUsingGET(filterSearch, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigsApi#getConfigsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterSearch** | **String**| Filter for configs whose name contains the given string | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to 1]

### Return type

[**PageResourceConfig**](PageResourceConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConfigUsingPUT"></a>
# **updateConfigUsingPUT**
> updateConfigUsingPUT(name, config)

Update an existing config

### Example
```java
// Import classes:
//import io.swagger.client.api.ConfigsApi;

ConfigsApi apiInstance = new ConfigsApi();
String name = "name_example"; // String | The config name
Config config = new Config(); // Config | The config object
try {
    apiInstance.updateConfigUsingPUT(name, config);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigsApi#updateConfigUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The config name |
 **config** | [**Config**](Config.md)| The config object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

