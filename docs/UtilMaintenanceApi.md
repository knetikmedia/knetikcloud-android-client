# UtilMaintenanceApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUsingDELETE1**](UtilMaintenanceApi.md#deleteUsingDELETE1) | **DELETE** /maintenance | Remove maintenance info
[**getUsingGET1**](UtilMaintenanceApi.md#getUsingGET1) | **GET** /maintenance | Get current maintenance info
[**postUsingPOST**](UtilMaintenanceApi.md#postUsingPOST) | **POST** /maintenance | Set current maintenance info
[**postUsingPUT**](UtilMaintenanceApi.md#postUsingPUT) | **PUT** /maintenance | Set current maintenance info


<a name="deleteUsingDELETE1"></a>
# **deleteUsingDELETE1**
> deleteUsingDELETE1()

Remove maintenance info

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilMaintenanceApi;

UtilMaintenanceApi apiInstance = new UtilMaintenanceApi();
try {
    apiInstance.deleteUsingDELETE1();
} catch (ApiException e) {
    System.err.println("Exception when calling UtilMaintenanceApi#deleteUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsingGET1"></a>
# **getUsingGET1**
> Maintenance getUsingGET1()

Get current maintenance info

Get current maintenance info. 404 if no maintenance.

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilMaintenanceApi;

UtilMaintenanceApi apiInstance = new UtilMaintenanceApi();
try {
    Maintenance result = apiInstance.getUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilMaintenanceApi#getUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Maintenance**](Maintenance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsingPOST"></a>
# **postUsingPOST**
> postUsingPOST(maintenance)

Set current maintenance info

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilMaintenanceApi;

UtilMaintenanceApi apiInstance = new UtilMaintenanceApi();
Maintenance maintenance = new Maintenance(); // Maintenance | The Maintenance Object
try {
    apiInstance.postUsingPOST(maintenance);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilMaintenanceApi#postUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maintenance** | [**Maintenance**](Maintenance.md)| The Maintenance Object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsingPUT"></a>
# **postUsingPUT**
> postUsingPUT(maintenance)

Set current maintenance info

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilMaintenanceApi;

UtilMaintenanceApi apiInstance = new UtilMaintenanceApi();
Maintenance maintenance = new Maintenance(); // Maintenance | The Maintenance Object
try {
    apiInstance.postUsingPUT(maintenance);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilMaintenanceApi#postUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maintenance** | [**Maintenance**](Maintenance.md)| The Maintenance Object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

