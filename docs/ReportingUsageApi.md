# ReportingUsageApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsageByDayUsingGET**](ReportingUsageApi.md#getUsageByDayUsingGET) | **GET** /reporting/usage/day | Returns aggregated endpoint usage information by the day
[**getUsageByHourUsingGET**](ReportingUsageApi.md#getUsageByHourUsingGET) | **GET** /reporting/usage/hour | Returns aggregated endpoint usage information by hour
[**getUsageByMinuteUsingGET**](ReportingUsageApi.md#getUsageByMinuteUsingGET) | **GET** /reporting/usage/minute | Returns aggregated endpoint usage information by minute
[**getUsageByMonthUsingGET**](ReportingUsageApi.md#getUsageByMonthUsingGET) | **GET** /reporting/usage/month | Returns aggregated endpoint usage information by month
[**getUsageByYearUsingGET**](ReportingUsageApi.md#getUsageByYearUsingGET) | **GET** /reporting/usage/year | Returns aggregated endpoint usage information by year


<a name="getUsageByDayUsingGET"></a>
# **getUsageByDayUsingGET**
> PageResourceUsageInfo getUsageByDayUsingGET(startDate, endDate, combineEndpoints, size, page)

Returns aggregated endpoint usage information by the day

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingUsageApi;

ReportingUsageApi apiInstance = new ReportingUsageApi();
Long startDate = 789L; // Long | The beginning of the range being requested, unix timestamp in seconds
Long endDate = 789L; // Long | The ending of the range being requested, unix timestamp in seconds
Boolean combineEndpoints = false; // Boolean | Whether to combine counts from different endpoint. Removes the url and method from the result object
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUsageInfo result = apiInstance.getUsageByDayUsingGET(startDate, endDate, combineEndpoints, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingUsageApi#getUsageByDayUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| The beginning of the range being requested, unix timestamp in seconds |
 **endDate** | **Long**| The ending of the range being requested, unix timestamp in seconds |
 **combineEndpoints** | **Boolean**| Whether to combine counts from different endpoint. Removes the url and method from the result object | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUsageInfo**](PageResourceUsageInfo.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsageByHourUsingGET"></a>
# **getUsageByHourUsingGET**
> PageResourceUsageInfo getUsageByHourUsingGET(startDate, endDate, combineEndpoints, size, page)

Returns aggregated endpoint usage information by hour

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingUsageApi;

ReportingUsageApi apiInstance = new ReportingUsageApi();
Long startDate = 789L; // Long | The beginning of the range being requested, unix timestamp in seconds
Long endDate = 789L; // Long | The ending of the range being requested, unix timestamp in seconds
Boolean combineEndpoints = false; // Boolean | Whether to combine counts from different endpoint. Removes the url and method from the result object
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUsageInfo result = apiInstance.getUsageByHourUsingGET(startDate, endDate, combineEndpoints, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingUsageApi#getUsageByHourUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| The beginning of the range being requested, unix timestamp in seconds |
 **endDate** | **Long**| The ending of the range being requested, unix timestamp in seconds |
 **combineEndpoints** | **Boolean**| Whether to combine counts from different endpoint. Removes the url and method from the result object | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUsageInfo**](PageResourceUsageInfo.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsageByMinuteUsingGET"></a>
# **getUsageByMinuteUsingGET**
> PageResourceUsageInfo getUsageByMinuteUsingGET(startDate, endDate, combineEndpoints, size, page)

Returns aggregated endpoint usage information by minute

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingUsageApi;

ReportingUsageApi apiInstance = new ReportingUsageApi();
Long startDate = 789L; // Long | The beginning of the range being requested, unix timestamp in seconds
Long endDate = 789L; // Long | The ending of the range being requested, unix timestamp in seconds
Boolean combineEndpoints = false; // Boolean | Whether to combine counts from different endpoint. Removes the url and method from the result object
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUsageInfo result = apiInstance.getUsageByMinuteUsingGET(startDate, endDate, combineEndpoints, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingUsageApi#getUsageByMinuteUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| The beginning of the range being requested, unix timestamp in seconds |
 **endDate** | **Long**| The ending of the range being requested, unix timestamp in seconds |
 **combineEndpoints** | **Boolean**| Whether to combine counts from different endpoint. Removes the url and method from the result object | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUsageInfo**](PageResourceUsageInfo.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsageByMonthUsingGET"></a>
# **getUsageByMonthUsingGET**
> PageResourceUsageInfo getUsageByMonthUsingGET(startDate, endDate, combineEndpoints, size, page)

Returns aggregated endpoint usage information by month

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingUsageApi;

ReportingUsageApi apiInstance = new ReportingUsageApi();
Long startDate = 789L; // Long | The beginning of the range being requested, unix timestamp in seconds
Long endDate = 789L; // Long | The ending of the range being requested, unix timestamp in seconds
Boolean combineEndpoints = false; // Boolean | Whether to combine counts from different endpoint. Removes the url and method from the result object
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUsageInfo result = apiInstance.getUsageByMonthUsingGET(startDate, endDate, combineEndpoints, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingUsageApi#getUsageByMonthUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| The beginning of the range being requested, unix timestamp in seconds |
 **endDate** | **Long**| The ending of the range being requested, unix timestamp in seconds |
 **combineEndpoints** | **Boolean**| Whether to combine counts from different endpoint. Removes the url and method from the result object | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUsageInfo**](PageResourceUsageInfo.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsageByYearUsingGET"></a>
# **getUsageByYearUsingGET**
> PageResourceUsageInfo getUsageByYearUsingGET(startDate, endDate, combineEndpoints, size, page)

Returns aggregated endpoint usage information by year

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingUsageApi;

ReportingUsageApi apiInstance = new ReportingUsageApi();
Long startDate = 789L; // Long | The beginning of the range being requested, unix timestamp in seconds
Long endDate = 789L; // Long | The ending of the range being requested, unix timestamp in seconds
Boolean combineEndpoints = false; // Boolean | Whether to combine counts from different endpoint. Removes the url and method from the result object
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUsageInfo result = apiInstance.getUsageByYearUsingGET(startDate, endDate, combineEndpoints, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingUsageApi#getUsageByYearUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| The beginning of the range being requested, unix timestamp in seconds |
 **endDate** | **Long**| The ending of the range being requested, unix timestamp in seconds |
 **combineEndpoints** | **Boolean**| Whether to combine counts from different endpoint. Removes the url and method from the result object | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUsageInfo**](PageResourceUsageInfo.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

