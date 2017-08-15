# AmazonWebServicesS3Api

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDownloadURL**](AmazonWebServicesS3Api.md#getDownloadURL) | **GET** /amazon/s3/downloadurl | Get a temporary signed S3 URL for download
[**getSignedS3URL**](AmazonWebServicesS3Api.md#getSignedS3URL) | **GET** /amazon/s3/signedposturl | Get a signed S3 URL for upload


<a name="getDownloadURL"></a>
# **getDownloadURL**
> String getDownloadURL(bucket, path, expiration)

Get a temporary signed S3 URL for download

To give access to files in your own S3 account, you will need to grant KnetikcCloud access to the file by adjusting your bucket policy accordingly. See S3 documentation for details.

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.AmazonWebServicesS3Api;


AmazonWebServicesS3Api apiInstance = new AmazonWebServicesS3Api();
String bucket = "bucket_example"; // String | S3 bucket name
String path = "path_example"; // String | The path to the file relative the bucket (the s3 object key)
Integer expiration = 60; // Integer | The number of seconds this URL will be valid. Default to 60
try {
    String result = apiInstance.getDownloadURL(bucket, path, expiration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AmazonWebServicesS3Api#getDownloadURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucket** | **String**| S3 bucket name | [optional]
 **path** | **String**| The path to the file relative the bucket (the s3 object key) | [optional]
 **expiration** | **Integer**| The number of seconds this URL will be valid. Default to 60 | [optional] [default to 60]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSignedS3URL"></a>
# **getSignedS3URL**
> AmazonS3Activity getSignedS3URL(filename, contentType)

Get a signed S3 URL for upload

Requires the file name and file content type (i.e., &#39;video/mpeg&#39;). Make a PUT to the resulting url to upload the file and use the cdn_url to retrieve it after.

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.AmazonWebServicesS3Api;


AmazonWebServicesS3Api apiInstance = new AmazonWebServicesS3Api();
String filename = "filename_example"; // String | The file name
String contentType = "contentType_example"; // String | The content type
try {
    AmazonS3Activity result = apiInstance.getSignedS3URL(filename, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AmazonWebServicesS3Api#getSignedS3URL");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

