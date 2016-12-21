# ReportingUsersApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executiveRevenueItemSalesUsingGET1**](ReportingUsersApi.md#executiveRevenueItemSalesUsingGET1) | **GET** /reporting/users/registrations | Get user registration info


<a name="executiveRevenueItemSalesUsingGET1"></a>
# **executiveRevenueItemSalesUsingGET1**
> PageResourceAggregateCountResource executiveRevenueItemSalesUsingGET1(granularity, startDate, endDate)

Get user registration info

Get user registration counts grouped by time range

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingUsersApi;

ReportingUsersApi apiInstance = new ReportingUsersApi();
String granularity = "day"; // String | The time duration to aggregate by
Long startDate = 789L; // Long | The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
Long endDate = 789L; // Long | The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
try {
    PageResourceAggregateCountResource result = apiInstance.executiveRevenueItemSalesUsingGET1(granularity, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingUsersApi#executiveRevenueItemSalesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **granularity** | **String**| The time duration to aggregate by | [optional] [default to day] [enum: millisecond, second, minute, hour, day, week, month, year]
 **startDate** | **Long**| The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time | [optional]
 **endDate** | **Long**| The end of the time range to aggregate, unix timestamp in seconds. Default is end of time | [optional]

### Return type

[**PageResourceAggregateCountResource**](PageResourceAggregateCountResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

