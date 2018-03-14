# ReportingOrdersApi

All URIs are relative to *https://jsapi-integration.us-east-1.elasticbeanstalk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInvoiceReports**](ReportingOrdersApi.md#getInvoiceReports) | **GET** reporting/orders/count/{currency_code} | Retrieve invoice counts aggregated by time ranges


<a name="getInvoiceReports"></a>
# **getInvoiceReports**
> PageResourceAggregateInvoiceReportResource getInvoiceReports(currencyCode, granularity, filterPaymentStatus, filterFulfillmentStatus, startDate, endDate, size, page)

Retrieve invoice counts aggregated by time ranges

&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_ORDERS_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ReportingOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ReportingOrdersApi apiInstance = new ReportingOrdersApi();
String currencyCode = "currencyCode_example"; // String | The code for a currency to get sales data for
String granularity = "day"; // String | The time duration to aggregate by
String filterPaymentStatus = "filterPaymentStatus_example"; // String | A payment status to filter results by, can be a comma separated list
String filterFulfillmentStatus = "filterFulfillmentStatus_example"; // String | An invoice fulfillment status to filter results by, can be a comma separated list
Long startDate = 789L; // Long | The start of the time range to return, unix timestamp in seconds. Default is beginning of time
Long endDate = 789L; // Long | The end of the time range to return, unix timestamp in seconds. Default is end of time
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
try {
    PageResourceAggregateInvoiceReportResource result = apiInstance.getInvoiceReports(currencyCode, granularity, filterPaymentStatus, filterFulfillmentStatus, startDate, endDate, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingOrdersApi#getInvoiceReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyCode** | **String**| The code for a currency to get sales data for |
 **granularity** | **String**| The time duration to aggregate by | [optional] [default to day] [enum: millisecond, second, minute, hour, day, week, month, year]
 **filterPaymentStatus** | **String**| A payment status to filter results by, can be a comma separated list | [optional]
 **filterFulfillmentStatus** | **String**| An invoice fulfillment status to filter results by, can be a comma separated list | [optional]
 **startDate** | **Long**| The start of the time range to return, unix timestamp in seconds. Default is beginning of time | [optional]
 **endDate** | **Long**| The end of the time range to return, unix timestamp in seconds. Default is end of time | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]

### Return type

[**PageResourceAggregateInvoiceReportResource**](PageResourceAggregateInvoiceReportResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

