# MessagingApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendRawEmailUsingPOST**](MessagingApi.md#sendRawEmailUsingPOST) | **POST** /messaging/raw-email | Send a raw email to one or more users
[**sendRawSMSUsingPOST**](MessagingApi.md#sendRawSMSUsingPOST) | **POST** /messaging/raw-sms | Send a raw SMS
[**sendRawSMSUsingPOST1**](MessagingApi.md#sendRawSMSUsingPOST1) | **POST** /messaging/templated-sms | Send a new templated SMS
[**sendTemplateEmailUsingPOST**](MessagingApi.md#sendTemplateEmailUsingPOST) | **POST** /messaging/templated-email | Send a templated email to one or more users


<a name="sendRawEmailUsingPOST"></a>
# **sendRawEmailUsingPOST**
> sendRawEmailUsingPOST(rawEmailResource)

Send a raw email to one or more users

### Example
```java
// Import classes:
//import io.swagger.client.api.MessagingApi;

MessagingApi apiInstance = new MessagingApi();
RawEmailResource rawEmailResource = new RawEmailResource(); // RawEmailResource | The new raw email to be sent
try {
    apiInstance.sendRawEmailUsingPOST(rawEmailResource);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#sendRawEmailUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rawEmailResource** | [**RawEmailResource**](RawEmailResource.md)| The new raw email to be sent | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendRawSMSUsingPOST"></a>
# **sendRawSMSUsingPOST**
> sendRawSMSUsingPOST(rawSMSResource)

Send a raw SMS

Sends a raw SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.

### Example
```java
// Import classes:
//import io.swagger.client.api.MessagingApi;

MessagingApi apiInstance = new MessagingApi();
RawSMSResource rawSMSResource = new RawSMSResource(); // RawSMSResource | The new raw SMS to be sent
try {
    apiInstance.sendRawSMSUsingPOST(rawSMSResource);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#sendRawSMSUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rawSMSResource** | [**RawSMSResource**](RawSMSResource.md)| The new raw SMS to be sent | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendRawSMSUsingPOST1"></a>
# **sendRawSMSUsingPOST1**
> sendRawSMSUsingPOST1(templateSMSResource)

Send a new templated SMS

Sends a templated SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.

### Example
```java
// Import classes:
//import io.swagger.client.api.MessagingApi;

MessagingApi apiInstance = new MessagingApi();
TemplateSMSResource templateSMSResource = new TemplateSMSResource(); // TemplateSMSResource | The new template SMS to be sent
try {
    apiInstance.sendRawSMSUsingPOST1(templateSMSResource);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#sendRawSMSUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateSMSResource** | [**TemplateSMSResource**](TemplateSMSResource.md)| The new template SMS to be sent | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTemplateEmailUsingPOST"></a>
# **sendTemplateEmailUsingPOST**
> sendTemplateEmailUsingPOST(messageResource)

Send a templated email to one or more users

### Example
```java
// Import classes:
//import io.swagger.client.api.MessagingApi;

MessagingApi apiInstance = new MessagingApi();
TemplateEmailResource messageResource = new TemplateEmailResource(); // TemplateEmailResource | The new template email to be sent
try {
    apiInstance.sendTemplateEmailUsingPOST(messageResource);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#sendTemplateEmailUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageResource** | [**TemplateEmailResource**](TemplateEmailResource.md)| The new template email to be sent | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

