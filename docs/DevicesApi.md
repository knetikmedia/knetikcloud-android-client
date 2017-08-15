# DevicesApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDeviceUsers**](DevicesApi.md#addDeviceUsers) | **POST** /devices/{id}/users | Add device users
[**createDevice**](DevicesApi.md#createDevice) | **POST** /devices | Create a device
[**deleteDevice**](DevicesApi.md#deleteDevice) | **DELETE** /devices/{id} | Delete a device
[**deleteDeviceUser**](DevicesApi.md#deleteDeviceUser) | **DELETE** /devices/{id}/users/{user_id} | Delete a device user
[**deleteDeviceUsers**](DevicesApi.md#deleteDeviceUsers) | **DELETE** /devices/{id}/users | Delete all device users
[**getDevice**](DevicesApi.md#getDevice) | **GET** /devices/{id} | Get a single device
[**getDevices**](DevicesApi.md#getDevices) | **GET** /devices | List and search devices
[**updateDevice**](DevicesApi.md#updateDevice) | **PUT** /devices/{id} | Update a device


<a name="addDeviceUsers"></a>
# **addDeviceUsers**
> DeviceResource addDeviceUsers(userResources, id)

Add device users

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.DevicesApi;


DevicesApi apiInstance = new DevicesApi();
List<SimpleUserResource> userResources = Arrays.asList(new SimpleUserResource()); // List<SimpleUserResource> | userResources
Integer id = 56; // Integer | id
try {
    DeviceResource result = apiInstance.addDeviceUsers(userResources, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#addDeviceUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userResources** | [**List&lt;SimpleUserResource&gt;**](SimpleUserResource.md)| userResources |
 **id** | **Integer**| id |

### Return type

[**DeviceResource**](DeviceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDevice"></a>
# **createDevice**
> DeviceResource createDevice(device)

Create a device

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.DevicesApi;


DevicesApi apiInstance = new DevicesApi();
DeviceResource device = new DeviceResource(); // DeviceResource | device
try {
    DeviceResource result = apiInstance.createDevice(device);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#createDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device** | [**DeviceResource**](DeviceResource.md)| device |

### Return type

[**DeviceResource**](DeviceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDevice"></a>
# **deleteDevice**
> deleteDevice(id)

Delete a device

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.DevicesApi;


DevicesApi apiInstance = new DevicesApi();
Integer id = 56; // Integer | id
try {
    apiInstance.deleteDevice(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#deleteDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDeviceUser"></a>
# **deleteDeviceUser**
> deleteDeviceUser(id, userId)

Delete a device user

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.DevicesApi;


DevicesApi apiInstance = new DevicesApi();
Integer id = 56; // Integer | The id of the device
Integer userId = 56; // Integer | The user id of the device user
try {
    apiInstance.deleteDeviceUser(id, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#deleteDeviceUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the device |
 **userId** | **Integer**| The user id of the device user |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDeviceUsers"></a>
# **deleteDeviceUsers**
> deleteDeviceUsers(id, filterId)

Delete all device users

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.DevicesApi;


DevicesApi apiInstance = new DevicesApi();
Integer id = 56; // Integer | The id of the device
String filterId = "filterId_example"; // String | Filter for device users to delete with a user id in a given comma separated list of ids
try {
    apiInstance.deleteDeviceUsers(id, filterId);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#deleteDeviceUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the device |
 **filterId** | **String**| Filter for device users to delete with a user id in a given comma separated list of ids | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDevice"></a>
# **getDevice**
> DeviceResource getDevice(id)

Get a single device

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.DevicesApi;


DevicesApi apiInstance = new DevicesApi();
Integer id = 56; // Integer | id
try {
    DeviceResource result = apiInstance.getDevice(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#getDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**DeviceResource**](DeviceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDevices"></a>
# **getDevices**
> PageResourceDeviceResource getDevices(filterMake, filterModel, size, page, order)

List and search devices

Get a list of devices with optional filtering

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.DevicesApi;


DevicesApi apiInstance = new DevicesApi();
String filterMake = "filterMake_example"; // String | Filter for devices with specified make
String filterModel = "filterModel_example"; // String | Filter for devices with specified model
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceDeviceResource result = apiInstance.getDevices(filterMake, filterModel, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#getDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterMake** | **String**| Filter for devices with specified make | [optional]
 **filterModel** | **String**| Filter for devices with specified model | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceDeviceResource**](PageResourceDeviceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDevice"></a>
# **updateDevice**
> DeviceResource updateDevice(device, id)

Update a device

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.DevicesApi;


DevicesApi apiInstance = new DevicesApi();
DeviceResource device = new DeviceResource(); // DeviceResource | device
Integer id = 56; // Integer | id
try {
    DeviceResource result = apiInstance.updateDevice(device, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#updateDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device** | [**DeviceResource**](DeviceResource.md)| device |
 **id** | **Integer**| id |

### Return type

[**DeviceResource**](DeviceResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

