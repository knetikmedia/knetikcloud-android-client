# GamificationMetricsApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMetric**](GamificationMetricsApi.md#addMetric) | **POST** metrics | Add a metric


<a name="addMetric"></a>
# **addMetric**
> Void addMetric(metric)

Add a metric

Post a new score/stat for an activity occurrence without ending the occurrence itself

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.GamificationMetricsApi;


GamificationMetricsApi apiInstance = new GamificationMetricsApi();
MetricResource metric = new MetricResource(); // MetricResource | The new metric
try {
    Void result = apiInstance.addMetric(metric);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationMetricsApi#addMetric");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metric** | [**MetricResource**](MetricResource.md)| The new metric | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

