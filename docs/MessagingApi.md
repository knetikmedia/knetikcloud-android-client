# MessagingApi

All URIs are relative to *https://devsandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendRawEmail**](MessagingApi.md#sendRawEmail) | **POST** messaging/raw-email | Send a raw email to one or more users
[**sendRawPush**](MessagingApi.md#sendRawPush) | **POST** messaging/raw-push | Send a raw push notification
[**sendRawSMS**](MessagingApi.md#sendRawSMS) | **POST** messaging/raw-sms | Send a raw SMS
[**sendTemplatedEmail**](MessagingApi.md#sendTemplatedEmail) | **POST** messaging/templated-email | Send a templated email to one or more users
[**sendTemplatedPush**](MessagingApi.md#sendTemplatedPush) | **POST** messaging/templated-push | Send a templated push notification
[**sendTemplatedSMS**](MessagingApi.md#sendTemplatedSMS) | **POST** messaging/templated-sms | Send a new templated SMS


<a name="sendRawEmail"></a>
# **sendRawEmail**
> Void sendRawEmail(rawEmailResource)

Send a raw email to one or more users

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
RawEmailResource rawEmailResource = new RawEmailResource(); // RawEmailResource | The new raw email to be sent
try {
    Void result = apiInstance.sendRawEmail(rawEmailResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#sendRawEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rawEmailResource** | [**RawEmailResource**](RawEmailResource.md)| The new raw email to be sent | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendRawPush"></a>
# **sendRawPush**
> Void sendRawPush(rawPushResource)

Send a raw push notification

Sends a raw push notification message to one or more users. User&#39;s without registered mobile device for the application will be skipped.

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
RawPushResource rawPushResource = new RawPushResource(); // RawPushResource | The new raw push notification to be sent
try {
    Void result = apiInstance.sendRawPush(rawPushResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#sendRawPush");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rawPushResource** | [**RawPushResource**](RawPushResource.md)| The new raw push notification to be sent | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendRawSMS"></a>
# **sendRawSMS**
> Void sendRawSMS(rawSMSResource)

Send a raw SMS

Sends a raw SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
RawSMSResource rawSMSResource = new RawSMSResource(); // RawSMSResource | The new raw SMS to be sent
try {
    Void result = apiInstance.sendRawSMS(rawSMSResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#sendRawSMS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rawSMSResource** | [**RawSMSResource**](RawSMSResource.md)| The new raw SMS to be sent | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTemplatedEmail"></a>
# **sendTemplatedEmail**
> Void sendTemplatedEmail(messageResource)

Send a templated email to one or more users

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
TemplateEmailResource messageResource = new TemplateEmailResource(); // TemplateEmailResource | The new template email to be sent
try {
    Void result = apiInstance.sendTemplatedEmail(messageResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#sendTemplatedEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageResource** | [**TemplateEmailResource**](TemplateEmailResource.md)| The new template email to be sent | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTemplatedPush"></a>
# **sendTemplatedPush**
> Void sendTemplatedPush(templatePushResource)

Send a templated push notification

Sends a templated push notification message to one or more users. User&#39;s without registered mobile device for the application will be skipped.

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
TemplatePushResource templatePushResource = new TemplatePushResource(); // TemplatePushResource | The new templated push notification to be sent
try {
    Void result = apiInstance.sendTemplatedPush(templatePushResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#sendTemplatedPush");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatePushResource** | [**TemplatePushResource**](TemplatePushResource.md)| The new templated push notification to be sent | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTemplatedSMS"></a>
# **sendTemplatedSMS**
> Void sendTemplatedSMS(templateSMSResource)

Send a new templated SMS

Sends a templated SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
TemplateSMSResource templateSMSResource = new TemplateSMSResource(); // TemplateSMSResource | The new template SMS to be sent
try {
    Void result = apiInstance.sendTemplatedSMS(templateSMSResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#sendTemplatedSMS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateSMSResource** | [**TemplateSMSResource**](TemplateSMSResource.md)| The new template SMS to be sent | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

