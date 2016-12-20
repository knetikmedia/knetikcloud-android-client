# BRERuleEngineTriggersApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTriggerUsingPOST**](BRERuleEngineTriggersApi.md#createTriggerUsingPOST) | **POST** /bre/triggers | Create a trigger
[**deleteTriggerUsingDELETE**](BRERuleEngineTriggersApi.md#deleteTriggerUsingDELETE) | **DELETE** /bre/triggers/{event_name} | Delete a trigger
[**getTriggerUsingGET**](BRERuleEngineTriggersApi.md#getTriggerUsingGET) | **GET** /bre/triggers/{event_name} | Get a single trigger
[**getTriggersUsingGET**](BRERuleEngineTriggersApi.md#getTriggersUsingGET) | **GET** /bre/triggers | List triggers
[**updateTriggerUsingPUT**](BRERuleEngineTriggersApi.md#updateTriggerUsingPUT) | **PUT** /bre/triggers/{event_name} | Update a trigger


<a name="createTriggerUsingPOST"></a>
# **createTriggerUsingPOST**
> BreTriggerResource createTriggerUsingPOST(breTriggerResource)

Create a trigger

Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineTriggersApi;

BRERuleEngineTriggersApi apiInstance = new BRERuleEngineTriggersApi();
BreTriggerResource breTriggerResource = new BreTriggerResource(); // BreTriggerResource | The BRE trigger resource object
try {
    BreTriggerResource result = apiInstance.createTriggerUsingPOST(breTriggerResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineTriggersApi#createTriggerUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **breTriggerResource** | [**BreTriggerResource**](BreTriggerResource.md)| The BRE trigger resource object | [optional]

### Return type

[**BreTriggerResource**](BreTriggerResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteTriggerUsingDELETE"></a>
# **deleteTriggerUsingDELETE**
> deleteTriggerUsingDELETE(eventName)

Delete a trigger

May fail if there are existing rules against it. Cannot delete core triggers

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineTriggersApi;

BRERuleEngineTriggersApi apiInstance = new BRERuleEngineTriggersApi();
String eventName = "eventName_example"; // String | The trigger event name
try {
    apiInstance.deleteTriggerUsingDELETE(eventName);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineTriggersApi#deleteTriggerUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventName** | **String**| The trigger event name |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getTriggerUsingGET"></a>
# **getTriggerUsingGET**
> BreTriggerResource getTriggerUsingGET(eventName)

Get a single trigger

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineTriggersApi;

BRERuleEngineTriggersApi apiInstance = new BRERuleEngineTriggersApi();
String eventName = "eventName_example"; // String | The trigger event name
try {
    BreTriggerResource result = apiInstance.getTriggerUsingGET(eventName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineTriggersApi#getTriggerUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventName** | **String**| The trigger event name |

### Return type

[**BreTriggerResource**](BreTriggerResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getTriggersUsingGET"></a>
# **getTriggersUsingGET**
> PageBreTriggerResource getTriggersUsingGET(filterSystem, filterCategory, filterName, size, page)

List triggers

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineTriggersApi;

BRERuleEngineTriggersApi apiInstance = new BRERuleEngineTriggersApi();
Boolean filterSystem = true; // Boolean | Filter for triggers that are system triggers when true, or not when false. Leave off for both mixed
String filterCategory = "filterCategory_example"; // String | Filter for triggers that are within a specific category
String filterName = "filterName_example"; // String | Filter for triggers that have names containing the given string
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageBreTriggerResource result = apiInstance.getTriggersUsingGET(filterSystem, filterCategory, filterName, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineTriggersApi#getTriggersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterSystem** | **Boolean**| Filter for triggers that are system triggers when true, or not when false. Leave off for both mixed | [optional]
 **filterCategory** | **String**| Filter for triggers that are within a specific category | [optional] [enum: achievement, behavior, comment, disposition, entitlement, friends, fulfillment, gamification, inventory, invoice, media, scheduler, store, subscription, user, wallet, custom, challenge, activity, campaign, event]
 **filterName** | **String**| Filter for triggers that have names containing the given string | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageBreTriggerResource**](PageBreTriggerResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateTriggerUsingPUT"></a>
# **updateTriggerUsingPUT**
> updateTriggerUsingPUT(eventName, breTriggerResource)

Update a trigger

May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineTriggersApi;

BRERuleEngineTriggersApi apiInstance = new BRERuleEngineTriggersApi();
String eventName = "eventName_example"; // String | The trigger event name
BreTriggerResource breTriggerResource = new BreTriggerResource(); // BreTriggerResource | The BRE trigger resource object
try {
    apiInstance.updateTriggerUsingPUT(eventName, breTriggerResource);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineTriggersApi#updateTriggerUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventName** | **String**| The trigger event name |
 **breTriggerResource** | [**BreTriggerResource**](BreTriggerResource.md)| The BRE trigger resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

