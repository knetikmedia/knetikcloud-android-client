# UsersAddressesApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAddressUsingPOST**](UsersAddressesApi.md#createAddressUsingPOST) | **POST** /users/{user_id}/addresses | Save a new address
[**deleteAddressUsingDELETE**](UsersAddressesApi.md#deleteAddressUsingDELETE) | **DELETE** /users/{user_id}/addresses/{id} | Delete an address
[**getAddressUsingGET**](UsersAddressesApi.md#getAddressUsingGET) | **GET** /users/{user_id}/addresses/{id} | Get a single address
[**getAddressesUsingGET**](UsersAddressesApi.md#getAddressesUsingGET) | **GET** /users/{user_id}/addresses | List and search addresses
[**updateAddressUsingPUT**](UsersAddressesApi.md#updateAddressUsingPUT) | **PUT** /users/{user_id}/addresses/{id} | Update an address


<a name="createAddressUsingPOST"></a>
# **createAddressUsingPOST**
> SavedAddressResource createAddressUsingPOST(userId, savedAddressResource)

Save a new address

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersAddressesApi;

UsersAddressesApi apiInstance = new UsersAddressesApi();
String userId = "userId_example"; // String | The id of the user
SavedAddressResource savedAddressResource = new SavedAddressResource(); // SavedAddressResource | The new address
try {
    SavedAddressResource result = apiInstance.createAddressUsingPOST(userId, savedAddressResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAddressesApi#createAddressUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user |
 **savedAddressResource** | [**SavedAddressResource**](SavedAddressResource.md)| The new address | [optional]

### Return type

[**SavedAddressResource**](SavedAddressResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAddressUsingDELETE"></a>
# **deleteAddressUsingDELETE**
> deleteAddressUsingDELETE(userId, id)

Delete an address

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersAddressesApi;

UsersAddressesApi apiInstance = new UsersAddressesApi();
String userId = "userId_example"; // String | The id of the user
Integer id = 56; // Integer | The id of the address
try {
    apiInstance.deleteAddressUsingDELETE(userId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAddressesApi#deleteAddressUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user |
 **id** | **Integer**| The id of the address |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddressUsingGET"></a>
# **getAddressUsingGET**
> SavedAddressResource getAddressUsingGET(userId, id)

Get a single address

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersAddressesApi;

UsersAddressesApi apiInstance = new UsersAddressesApi();
String userId = "userId_example"; // String | The id of the user
Integer id = 56; // Integer | The id of the address
try {
    SavedAddressResource result = apiInstance.getAddressUsingGET(userId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAddressesApi#getAddressUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user |
 **id** | **Integer**| The id of the address |

### Return type

[**SavedAddressResource**](SavedAddressResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddressesUsingGET"></a>
# **getAddressesUsingGET**
> PageResourceSavedAddressResource getAddressesUsingGET(userId, size, page, order)

List and search addresses

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersAddressesApi;

UsersAddressesApi apiInstance = new UsersAddressesApi();
String userId = "userId_example"; // String | The id of the user
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceSavedAddressResource result = apiInstance.getAddressesUsingGET(userId, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAddressesApi#getAddressesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceSavedAddressResource**](PageResourceSavedAddressResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAddressUsingPUT"></a>
# **updateAddressUsingPUT**
> updateAddressUsingPUT(userId, id, savedAddressResource)

Update an address

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersAddressesApi;

UsersAddressesApi apiInstance = new UsersAddressesApi();
String userId = "userId_example"; // String | The id of the user
Integer id = 56; // Integer | The id of the address
SavedAddressResource savedAddressResource = new SavedAddressResource(); // SavedAddressResource | The saved address resource object
try {
    apiInstance.updateAddressUsingPUT(userId, id, savedAddressResource);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAddressesApi#updateAddressUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user |
 **id** | **Integer**| The id of the address |
 **savedAddressResource** | [**SavedAddressResource**](SavedAddressResource.md)| The saved address resource object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

