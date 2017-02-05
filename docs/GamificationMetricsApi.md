# GamificationMetricsApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMetricUsingPOST**](GamificationMetricsApi.md#addMetricUsingPOST) | **POST** /metrics | Add a metric


<a name="addMetricUsingPOST"></a>
# **addMetricUsingPOST**
> addMetricUsingPOST(metric)

Add a metric

Post a new score/stat for an activity occurrence without ending the occurrence itself

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationMetricsApi;

GamificationMetricsApi apiInstance = new GamificationMetricsApi();
MetricResource metric = new MetricResource(); // MetricResource | The new metric
try {
    apiInstance.addMetricUsingPOST(metric);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationMetricsApi#addMetricUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metric** | [**MetricResource**](MetricResource.md)| The new metric | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

