# MediaModerationApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFlagReportUsingGET**](MediaModerationApi.md#getFlagReportUsingGET) | **GET** /moderation/reports/{id} | Get a flag report
[**getFlagsReportUsingGET**](MediaModerationApi.md#getFlagsReportUsingGET) | **GET** /moderation/reports | Returns a page of flag reports
[**setFlagResolutionUsingPUT**](MediaModerationApi.md#setFlagResolutionUsingPUT) | **PUT** /moderation/reports/{id} | Update a flag report


<a name="getFlagReportUsingGET"></a>
# **getFlagReportUsingGET**
> getFlagReportUsingGET(id)

Get a flag report

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaModerationApi;

MediaModerationApi apiInstance = new MediaModerationApi();
Long id = 789L; // Long | The flag report id
try {
    apiInstance.getFlagReportUsingGET(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaModerationApi#getFlagReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The flag report id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFlagsReportUsingGET"></a>
# **getFlagsReportUsingGET**
> PageResourceFlagReportResource getFlagsReportUsingGET(excludeResolved, filterContext, size, page)

Returns a page of flag reports

Context can be either a free-form string or a pre-defined context name

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaModerationApi;

MediaModerationApi apiInstance = new MediaModerationApi();
Boolean excludeResolved = true; // Boolean | Ignore resolved context
String filterContext = "filterContext_example"; // String | Filter by moderation context
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceFlagReportResource result = apiInstance.getFlagsReportUsingGET(excludeResolved, filterContext, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaModerationApi#getFlagsReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **excludeResolved** | **Boolean**| Ignore resolved context | [optional] [default to true]
 **filterContext** | **String**| Filter by moderation context | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceFlagReportResource**](PageResourceFlagReportResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setFlagResolutionUsingPUT"></a>
# **setFlagResolutionUsingPUT**
> setFlagResolutionUsingPUT(id, flagReportResource)

Update a flag report

Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of &#39;banned&#39; you will need to pass the reason.

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaModerationApi;

MediaModerationApi apiInstance = new MediaModerationApi();
Long id = 789L; // Long | The flag report id
FlagReportResource flagReportResource = new FlagReportResource(); // FlagReportResource | The new flag report
try {
    apiInstance.setFlagResolutionUsingPUT(id, flagReportResource);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaModerationApi#setFlagResolutionUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The flag report id |
 **flagReportResource** | [**FlagReportResource**](FlagReportResource.md)| The new flag report | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

