# ActivitiesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeActivityOccurrenceUsingPUT**](ActivitiesApi.md#completeActivityOccurrenceUsingPUT) | **PUT** /activity-occurrences/{activity_occurrence_id}/status | Updated the status of an activity occurrence
[**createActivityOccurrenceUsingPOST**](ActivitiesApi.md#createActivityOccurrenceUsingPOST) | **POST** /activity-occurrences | Create a new activity occurrence
[**createActivityUsingPOST**](ActivitiesApi.md#createActivityUsingPOST) | **POST** /activities | Create an activity
[**deleteActivityUsingDELETE**](ActivitiesApi.md#deleteActivityUsingDELETE) | **DELETE** /activities/{id} | Delete an activity
[**getActivitiesUsingGET**](ActivitiesApi.md#getActivitiesUsingGET) | **GET** /activities | List activity definitions
[**getActivityUsingGET**](ActivitiesApi.md#getActivityUsingGET) | **GET** /activities/{id} | Get a single activity
[**postResultsUsingPOST**](ActivitiesApi.md#postResultsUsingPOST) | **POST** /activity-occurrences/{activity_occurrence_id}/results | Sets the status of an activity occurrence to FINISHED and logs metrics
[**updateActivityUsingPUT**](ActivitiesApi.md#updateActivityUsingPUT) | **PUT** /activities/{id} | Update an activity


<a name="completeActivityOccurrenceUsingPUT"></a>
# **completeActivityOccurrenceUsingPUT**
> completeActivityOccurrenceUsingPUT(activityOccurrenceId, activityCccurrenceStatus)

Updated the status of an activity occurrence

If setting to &#39;FINISHED&#39; you must POST to /results instead to record the metrics and get synchronous reward results

### Example
```java
// Import classes:
//import io.swagger.client.api.ActivitiesApi;

ActivitiesApi apiInstance = new ActivitiesApi();
Long activityOccurrenceId = 789L; // Long | The id of the activity occurrence
String activityCccurrenceStatus = "activityCccurrenceStatus_example"; // String | The activity occurrence status object
try {
    apiInstance.completeActivityOccurrenceUsingPUT(activityOccurrenceId, activityCccurrenceStatus);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#completeActivityOccurrenceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityOccurrenceId** | **Long**| The id of the activity occurrence |
 **activityCccurrenceStatus** | **String**| The activity occurrence status object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createActivityOccurrenceUsingPOST"></a>
# **createActivityOccurrenceUsingPOST**
> ActivityOccurrenceResource createActivityOccurrenceUsingPOST(test, activityOccurrenceResource)

Create a new activity occurrence

Has to enforce extra rules if not used as an admin

### Example
```java
// Import classes:
//import io.swagger.client.api.ActivitiesApi;

ActivitiesApi apiInstance = new ActivitiesApi();
Boolean test = false; // Boolean | if true, indicates that the occurrence should NOT be created. This can be used to test for eligibility and valid settings
ActivityOccurrenceResource activityOccurrenceResource = new ActivityOccurrenceResource(); // ActivityOccurrenceResource | The activity occurrence object
try {
    ActivityOccurrenceResource result = apiInstance.createActivityOccurrenceUsingPOST(test, activityOccurrenceResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#createActivityOccurrenceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test** | **Boolean**| if true, indicates that the occurrence should NOT be created. This can be used to test for eligibility and valid settings | [optional] [default to false]
 **activityOccurrenceResource** | [**ActivityOccurrenceResource**](ActivityOccurrenceResource.md)| The activity occurrence object | [optional]

### Return type

[**ActivityOccurrenceResource**](ActivityOccurrenceResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createActivityUsingPOST"></a>
# **createActivityUsingPOST**
> ActivityResource createActivityUsingPOST(activityResource)

Create an activity

### Example
```java
// Import classes:
//import io.swagger.client.api.ActivitiesApi;

ActivitiesApi apiInstance = new ActivitiesApi();
ActivityResource activityResource = new ActivityResource(); // ActivityResource | The activity resource object
try {
    ActivityResource result = apiInstance.createActivityUsingPOST(activityResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#createActivityUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityResource** | [**ActivityResource**](ActivityResource.md)| The activity resource object | [optional]

### Return type

[**ActivityResource**](ActivityResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteActivityUsingDELETE"></a>
# **deleteActivityUsingDELETE**
> deleteActivityUsingDELETE(id)

Delete an activity

### Example
```java
// Import classes:
//import io.swagger.client.api.ActivitiesApi;

ActivitiesApi apiInstance = new ActivitiesApi();
Long id = 789L; // Long | The id of the activity
try {
    apiInstance.deleteActivityUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#deleteActivityUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the activity |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getActivitiesUsingGET"></a>
# **getActivitiesUsingGET**
> PageBareActivityResource getActivitiesUsingGET(filterTemplate, size, page, order)

List activity definitions

### Example
```java
// Import classes:
//import io.swagger.client.api.ActivitiesApi;

ActivitiesApi apiInstance = new ActivitiesApi();
Boolean filterTemplate = true; // Boolean | Filter for activities that are templates, or specifically not if false
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageBareActivityResource result = apiInstance.getActivitiesUsingGET(filterTemplate, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#getActivitiesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterTemplate** | **Boolean**| Filter for activities that are templates, or specifically not if false | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageBareActivityResource**](PageBareActivityResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getActivityUsingGET"></a>
# **getActivityUsingGET**
> ActivityResource getActivityUsingGET(id)

Get a single activity

### Example
```java
// Import classes:
//import io.swagger.client.api.ActivitiesApi;

ActivitiesApi apiInstance = new ActivitiesApi();
Long id = 789L; // Long | The id of the activity
try {
    ActivityResource result = apiInstance.getActivityUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#getActivityUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the activity |

### Return type

[**ActivityResource**](ActivityResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="postResultsUsingPOST"></a>
# **postResultsUsingPOST**
> ActivityOccurrenceResults postResultsUsingPOST(activityOccurrenceId, activityOccurrenceResults)

Sets the status of an activity occurrence to FINISHED and logs metrics

### Example
```java
// Import classes:
//import io.swagger.client.api.ActivitiesApi;

ActivitiesApi apiInstance = new ActivitiesApi();
Long activityOccurrenceId = 789L; // Long | The id of the activity occurrence
ActivityOccurrenceResults activityOccurrenceResults = new ActivityOccurrenceResults(); // ActivityOccurrenceResults | The activity occurrence object
try {
    ActivityOccurrenceResults result = apiInstance.postResultsUsingPOST(activityOccurrenceId, activityOccurrenceResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#postResultsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityOccurrenceId** | **Long**| The id of the activity occurrence |
 **activityOccurrenceResults** | [**ActivityOccurrenceResults**](ActivityOccurrenceResults.md)| The activity occurrence object | [optional]

### Return type

[**ActivityOccurrenceResults**](ActivityOccurrenceResults.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateActivityUsingPUT"></a>
# **updateActivityUsingPUT**
> updateActivityUsingPUT(id, activityResource)

Update an activity

### Example
```java
// Import classes:
//import io.swagger.client.api.ActivitiesApi;

ActivitiesApi apiInstance = new ActivitiesApi();
Long id = 789L; // Long | The id of the activity
ActivityResource activityResource = new ActivityResource(); // ActivityResource | The activity resource object
try {
    apiInstance.updateActivityUsingPUT(id, activityResource);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#updateActivityUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the activity |
 **activityResource** | [**ActivityResource**](ActivityResource.md)| The activity resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

