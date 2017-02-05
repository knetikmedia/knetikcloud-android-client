# ReportingRevenueApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executiveRevenueCountrySalesUsingGET**](ReportingRevenueApi.md#executiveRevenueCountrySalesUsingGET) | **GET** /reporting/revenue/countries/{currency_code} | Get revenue info by country
[**executiveRevenueItemSalesUsingGET**](ReportingRevenueApi.md#executiveRevenueItemSalesUsingGET) | **GET** /reporting/revenue/item-sales/{currency_code} | Get item revenue info
[**executiveRevenueProductSalesUsingGET**](ReportingRevenueApi.md#executiveRevenueProductSalesUsingGET) | **GET** /reporting/revenue/products/{currency_code} | Get revenue info by item
[**executiveRevenueRefundsUsingGET**](ReportingRevenueApi.md#executiveRevenueRefundsUsingGET) | **GET** /reporting/revenue/refunds/{currency_code} | Get refund revenue info
[**executiveRevenueSubscriptionSalesUsingGET**](ReportingRevenueApi.md#executiveRevenueSubscriptionSalesUsingGET) | **GET** /reporting/revenue/subscription-sales/{currency_code} | Get subscription revenue info


<a name="executiveRevenueCountrySalesUsingGET"></a>
# **executiveRevenueCountrySalesUsingGET**
> PageResourceRevenueCountryReportResource executiveRevenueCountrySalesUsingGET(currencyCode, startDate, endDate, size, page)

Get revenue info by country

Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingRevenueApi;

ReportingRevenueApi apiInstance = new ReportingRevenueApi();
String currencyCode = "currencyCode_example"; // String | The code for a currency to get sales data for
Long startDate = 789L; // Long | The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
Long endDate = 789L; // Long | The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceRevenueCountryReportResource result = apiInstance.executiveRevenueCountrySalesUsingGET(currencyCode, startDate, endDate, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingRevenueApi#executiveRevenueCountrySalesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyCode** | **String**| The code for a currency to get sales data for |
 **startDate** | **Long**| The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time | [optional]
 **endDate** | **Long**| The end of the time range to aggregate, unix timestamp in seconds. Default is end of time | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceRevenueCountryReportResource**](PageResourceRevenueCountryReportResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executiveRevenueItemSalesUsingGET"></a>
# **executiveRevenueItemSalesUsingGET**
> RevenueReportResource executiveRevenueItemSalesUsingGET(currencyCode, startDate, endDate)

Get item revenue info

Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingRevenueApi;

ReportingRevenueApi apiInstance = new ReportingRevenueApi();
String currencyCode = "currencyCode_example"; // String | The code for a currency to get sales data for
Long startDate = 789L; // Long | The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
Long endDate = 789L; // Long | The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
try {
    RevenueReportResource result = apiInstance.executiveRevenueItemSalesUsingGET(currencyCode, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingRevenueApi#executiveRevenueItemSalesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyCode** | **String**| The code for a currency to get sales data for |
 **startDate** | **Long**| The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time | [optional]
 **endDate** | **Long**| The end of the time range to aggregate, unix timestamp in seconds. Default is end of time | [optional]

### Return type

[**RevenueReportResource**](RevenueReportResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executiveRevenueProductSalesUsingGET"></a>
# **executiveRevenueProductSalesUsingGET**
> PageResourceRevenueProductReportResource executiveRevenueProductSalesUsingGET(currencyCode, startDate, endDate, size, page)

Get revenue info by item

Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingRevenueApi;

ReportingRevenueApi apiInstance = new ReportingRevenueApi();
String currencyCode = "currencyCode_example"; // String | The code for a currency to get sales data for
Long startDate = 789L; // Long | The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
Long endDate = 789L; // Long | The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceRevenueProductReportResource result = apiInstance.executiveRevenueProductSalesUsingGET(currencyCode, startDate, endDate, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingRevenueApi#executiveRevenueProductSalesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyCode** | **String**| The code for a currency to get sales data for |
 **startDate** | **Long**| The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time | [optional]
 **endDate** | **Long**| The end of the time range to aggregate, unix timestamp in seconds. Default is end of time | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceRevenueProductReportResource**](PageResourceRevenueProductReportResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executiveRevenueRefundsUsingGET"></a>
# **executiveRevenueRefundsUsingGET**
> RevenueReportResource executiveRevenueRefundsUsingGET(currencyCode, startDate, endDate)

Get refund revenue info

Get basic info about revenue loss from refunds (for all item types), summed up within a time range.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingRevenueApi;

ReportingRevenueApi apiInstance = new ReportingRevenueApi();
String currencyCode = "currencyCode_example"; // String | The code for a currency to get refund data for
Long startDate = 789L; // Long | The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
Long endDate = 789L; // Long | The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
try {
    RevenueReportResource result = apiInstance.executiveRevenueRefundsUsingGET(currencyCode, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingRevenueApi#executiveRevenueRefundsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyCode** | **String**| The code for a currency to get refund data for |
 **startDate** | **Long**| The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time | [optional]
 **endDate** | **Long**| The end of the time range to aggregate, unix timestamp in seconds. Default is end of time | [optional]

### Return type

[**RevenueReportResource**](RevenueReportResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executiveRevenueSubscriptionSalesUsingGET"></a>
# **executiveRevenueSubscriptionSalesUsingGET**
> RevenueReportResource executiveRevenueSubscriptionSalesUsingGET(currencyCode, startDate, endDate)

Get subscription revenue info

Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingRevenueApi;

ReportingRevenueApi apiInstance = new ReportingRevenueApi();
String currencyCode = "currencyCode_example"; // String | The code for a currency to get sales data for
Long startDate = 789L; // Long | The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
Long endDate = 789L; // Long | The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
try {
    RevenueReportResource result = apiInstance.executiveRevenueSubscriptionSalesUsingGET(currencyCode, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingRevenueApi#executiveRevenueSubscriptionSalesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyCode** | **String**| The code for a currency to get sales data for |
 **startDate** | **Long**| The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time | [optional]
 **endDate** | **Long**| The end of the time range to aggregate, unix timestamp in seconds. Default is end of time | [optional]

### Return type

[**RevenueReportResource**](RevenueReportResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

