# AWSS3Api

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSignedS3URL**](AWSS3Api.md#getSignedS3URL) | **GET** /amazon/s3/signedposturl | Get a signed S3 URL


<a name="getSignedS3URL"></a>
# **getSignedS3URL**
> AmazonS3Activity getSignedS3URL(filename, contentType)

Get a signed S3 URL

Requires the file name and file content type (i.e., &#39;video/mpeg&#39;)

### Example
```java
// Import classes:
//import io.swagger.client.api.AWSS3Api;

AWSS3Api apiInstance = new AWSS3Api();
String filename = "filename_example"; // String | The file name
String contentType = "contentType_example"; // String | The content type
try {
    AmazonS3Activity result = apiInstance.getSignedS3URL(filename, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AWSS3Api#getSignedS3URL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| The file name | [optional]
 **contentType** | **String**| The content type | [optional]

### Return type

[**AmazonS3Activity**](AmazonS3Activity.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

