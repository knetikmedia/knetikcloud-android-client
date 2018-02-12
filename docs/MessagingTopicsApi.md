# MessagingTopicsApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableTopicSubscriber**](MessagingTopicsApi.md#disableTopicSubscriber) | **PUT** messaging/topics/{id}/subscribers/{user_id}/disabled | Enable or disable messages for a user
[**getTopicSubscriber**](MessagingTopicsApi.md#getTopicSubscriber) | **GET** messaging/topics/{id}/subscribers/{user_id} | Get a subscriber to a topic
[**getTopicSubscribers**](MessagingTopicsApi.md#getTopicSubscribers) | **GET** messaging/topics/{id}/subscribers | Get all subscribers to a topic
[**getUserTopics**](MessagingTopicsApi.md#getUserTopics) | **GET** users/{id}/topics | Get all messaging topics for a given user


<a name="disableTopicSubscriber"></a>
# **disableTopicSubscriber**
> Void disableTopicSubscriber(id, userId, disabled)

Enable or disable messages for a user

Useful for opt-out options on a single topic. Consider multiple topics for multiple opt-out options.

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MessagingTopicsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MessagingTopicsApi apiInstance = new MessagingTopicsApi();
String id = "id_example"; // String | The id of the topic
String userId = "userId_example"; // String | The id of the subscriber or 'me'
ValueWrapperboolean disabled = new ValueWrapperboolean(); // ValueWrapperboolean | disabled
try {
    Void result = apiInstance.disableTopicSubscriber(id, userId, disabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingTopicsApi#disableTopicSubscriber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the topic |
 **userId** | **String**| The id of the subscriber or &#39;me&#39; |
 **disabled** | [**ValueWrapperboolean**](ValueWrapperboolean.md)| disabled |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTopicSubscriber"></a>
# **getTopicSubscriber**
> TopicSubscriberResource getTopicSubscriber(id, userId)

Get a subscriber to a topic

&lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MessagingTopicsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MessagingTopicsApi apiInstance = new MessagingTopicsApi();
String id = "id_example"; // String | The id of the topic
String userId = "userId_example"; // String | The id of the subscriber or 'me'
try {
    TopicSubscriberResource result = apiInstance.getTopicSubscriber(id, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingTopicsApi#getTopicSubscriber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the topic |
 **userId** | **String**| The id of the subscriber or &#39;me&#39; |

### Return type

[**TopicSubscriberResource**](TopicSubscriberResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTopicSubscribers"></a>
# **getTopicSubscribers**
> PageResourceTopicSubscriberResource getTopicSubscribers(id)

Get all subscribers to a topic

&lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MessagingTopicsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MessagingTopicsApi apiInstance = new MessagingTopicsApi();
String id = "id_example"; // String | The id of the topic
try {
    PageResourceTopicSubscriberResource result = apiInstance.getTopicSubscribers(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingTopicsApi#getTopicSubscribers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the topic |

### Return type

[**PageResourceTopicSubscriberResource**](PageResourceTopicSubscriberResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserTopics"></a>
# **getUserTopics**
> PageResourceTopicResource getUserTopics(id)

Get all messaging topics for a given user

&lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MessagingTopicsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MessagingTopicsApi apiInstance = new MessagingTopicsApi();
String id = "id_example"; // String | The id of the user or 'me'
try {
    PageResourceTopicResource result = apiInstance.getUserTopics(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingTopicsApi#getUserTopics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the user or &#39;me&#39; |

### Return type

[**PageResourceTopicResource**](PageResourceTopicResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

