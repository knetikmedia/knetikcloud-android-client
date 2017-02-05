# BRERuleEngineEventsApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fireEventUsingPOST**](BRERuleEngineEventsApi.md#fireEventUsingPOST) | **POST** /bre/events | Fire a new event, based on an existing trigger


<a name="fireEventUsingPOST"></a>
# **fireEventUsingPOST**
> fireEventUsingPOST(breEvent)

Fire a new event, based on an existing trigger

Parameters within the event must match names and types from the trigger. Actual rule execution is asynchornous.

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineEventsApi;

BRERuleEngineEventsApi apiInstance = new BRERuleEngineEventsApi();
BreEvent breEvent = new BreEvent(); // BreEvent | The BRE event object
try {
    apiInstance.fireEventUsingPOST(breEvent);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineEventsApi#fireEventUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **breEvent** | [**BreEvent**](BreEvent.md)| The BRE event object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

