# UtilMaintenanceApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMaintenance**](UtilMaintenanceApi.md#deleteMaintenance) | **DELETE** /maintenance | Delete maintenance info
[**getMaintenance**](UtilMaintenanceApi.md#getMaintenance) | **GET** /maintenance | Get current maintenance info
[**updateMaintenance**](UtilMaintenanceApi.md#updateMaintenance) | **POST** /maintenance | Set current maintenance info
[**updateMaintenance1**](UtilMaintenanceApi.md#updateMaintenance1) | **PUT** /maintenance | Set current maintenance info


<a name="deleteMaintenance"></a>
# **deleteMaintenance**
> deleteMaintenance()

Delete maintenance info

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilMaintenanceApi;

UtilMaintenanceApi apiInstance = new UtilMaintenanceApi();
try {
    apiInstance.deleteMaintenance();
} catch (ApiException e) {
    System.err.println("Exception when calling UtilMaintenanceApi#deleteMaintenance");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMaintenance"></a>
# **getMaintenance**
> Maintenance getMaintenance()

Get current maintenance info

Get current maintenance info. 404 if no maintenance.

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilMaintenanceApi;

UtilMaintenanceApi apiInstance = new UtilMaintenanceApi();
try {
    Maintenance result = apiInstance.getMaintenance();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilMaintenanceApi#getMaintenance");
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

<a name="updateMaintenance"></a>
# **updateMaintenance**
> updateMaintenance(maintenance)

Set current maintenance info

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilMaintenanceApi;

UtilMaintenanceApi apiInstance = new UtilMaintenanceApi();
Maintenance maintenance = new Maintenance(); // Maintenance | The maintenance object
try {
    apiInstance.updateMaintenance(maintenance);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilMaintenanceApi#updateMaintenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maintenance** | [**Maintenance**](Maintenance.md)| The maintenance object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMaintenance1"></a>
# **updateMaintenance1**
> updateMaintenance1(maintenance)

Set current maintenance info

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilMaintenanceApi;

UtilMaintenanceApi apiInstance = new UtilMaintenanceApi();
Maintenance maintenance = new Maintenance(); // Maintenance | The maintenance object
try {
    apiInstance.updateMaintenance1(maintenance);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilMaintenanceApi#updateMaintenance1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maintenance** | [**Maintenance**](Maintenance.md)| The maintenance object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

