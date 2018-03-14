# ChatApi

All URIs are relative to *https://jsapi-integration.us-east-1.elasticbeanstalk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acknowledgeChatMessage**](ChatApi.md#acknowledgeChatMessage) | **PUT** chat/threads/{id}/acknowledge | Acknowledge number of messages in a thread
[**addChatMessageBlacklist**](ChatApi.md#addChatMessageBlacklist) | **POST** chat/users/{id}/blacklist/{blacklisted_user_id} | Add a user to a chat message blacklist
[**deleteChatMessage**](ChatApi.md#deleteChatMessage) | **DELETE** chat/messages/{id} | Delete a message
[**editChatMessage**](ChatApi.md#editChatMessage) | **PUT** chat/messages/{id} | Edit your message
[**getChatMessage**](ChatApi.md#getChatMessage) | **GET** chat/messages/{id} | Get a message
[**getChatMessageBlacklist**](ChatApi.md#getChatMessageBlacklist) | **GET** chat/users/{id}/blacklist | Get a list of blocked users for chat messaging
[**getChatThreads**](ChatApi.md#getChatThreads) | **GET** chat/threads | List your threads
[**getDirectMessages**](ChatApi.md#getDirectMessages) | **GET** chat/users/{id}/messages | List messages with a user
[**getThreadMessages**](ChatApi.md#getThreadMessages) | **GET** chat/threads/{id}/messages | List messages in a thread
[**getTopicMessages**](ChatApi.md#getTopicMessages) | **GET** chat/topics/{id}/messages | List messages in a topic
[**removeChatBlacklist**](ChatApi.md#removeChatBlacklist) | **DELETE** chat/users/{id}/blacklist/{blacklisted_user_id} | Remove a user from a blacklist
[**sendChatMessage**](ChatApi.md#sendChatMessage) | **POST** chat/messages | Send a message


<a name="acknowledgeChatMessage"></a>
# **acknowledgeChatMessage**
> Void acknowledgeChatMessage(id, readCount)

Acknowledge number of messages in a thread

&lt;b&gt;Permissions Needed:&lt;/b&gt; owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
String id = "id_example"; // String | The thread id
Integer readCount = 56; // Integer | The amount of messages read
try {
    Void result = apiInstance.acknowledgeChatMessage(id, readCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#acknowledgeChatMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The thread id |
 **readCount** | **Integer**| The amount of messages read | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addChatMessageBlacklist"></a>
# **addChatMessageBlacklist**
> Void addChatMessageBlacklist(blacklistedUserId, id)

Add a user to a chat message blacklist

&lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
Integer blacklistedUserId = 56; // Integer | The user id to blacklist
String id = "id_example"; // String | The user id or 'me'
try {
    Void result = apiInstance.addChatMessageBlacklist(blacklistedUserId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#addChatMessageBlacklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blacklistedUserId** | **Integer**| The user id to blacklist |
 **id** | **String**| The user id or &#39;me&#39; |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteChatMessage"></a>
# **deleteChatMessage**
> Void deleteChatMessage(id)

Delete a message

&lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
String id = "id_example"; // String | The message id
try {
    Void result = apiInstance.deleteChatMessage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#deleteChatMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The message id |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editChatMessage"></a>
# **editChatMessage**
> Void editChatMessage(id, chatMessageResource)

Edit your message

&lt;b&gt;Permissions Needed:&lt;/b&gt; owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
String id = "id_example"; // String | The message id
ChatMessageResource chatMessageResource = new ChatMessageResource(); // ChatMessageResource | The chat message resource
try {
    Void result = apiInstance.editChatMessage(id, chatMessageResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#editChatMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The message id |
 **chatMessageResource** | [**ChatMessageResource**](ChatMessageResource.md)| The chat message resource | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChatMessage"></a>
# **getChatMessage**
> ChatMessageResource getChatMessage(id)

Get a message

&lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
String id = "id_example"; // String | The message id
try {
    ChatMessageResource result = apiInstance.getChatMessage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The message id |

### Return type

[**ChatMessageResource**](ChatMessageResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChatMessageBlacklist"></a>
# **getChatMessageBlacklist**
> List&lt;ChatBlacklistResource&gt; getChatMessageBlacklist(id)

Get a list of blocked users for chat messaging

&lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
String id = "id_example"; // String | The user id or 'me'
try {
    List<ChatBlacklistResource> result = apiInstance.getChatMessageBlacklist(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatMessageBlacklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user id or &#39;me&#39; |

### Return type

[**List&lt;ChatBlacklistResource&gt;**](ChatBlacklistResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChatThreads"></a>
# **getChatThreads**
> PageResourceChatUserThreadResource getChatThreads(size, page, order)

List your threads

&lt;b&gt;Permissions Needed:&lt;/b&gt; owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "order_example"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceChatUserThreadResource result = apiInstance.getChatThreads(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatThreads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional]

### Return type

[**PageResourceChatUserThreadResource**](PageResourceChatUserThreadResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDirectMessages"></a>
# **getDirectMessages**
> PageResourceChatMessageResource getDirectMessages(id, size, page, order)

List messages with a user

&lt;b&gt;Permissions Needed:&lt;/b&gt; owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
Integer id = 56; // Integer | The user id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "order_example"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceChatMessageResource result = apiInstance.getDirectMessages(id, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getDirectMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The user id |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional]

### Return type

[**PageResourceChatMessageResource**](PageResourceChatMessageResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getThreadMessages"></a>
# **getThreadMessages**
> PageResourceChatMessageResource getThreadMessages(id, size, page, order)

List messages in a thread

&lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
String id = "id_example"; // String | The thread id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "order_example"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceChatMessageResource result = apiInstance.getThreadMessages(id, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getThreadMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The thread id |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional]

### Return type

[**PageResourceChatMessageResource**](PageResourceChatMessageResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTopicMessages"></a>
# **getTopicMessages**
> PageResourceChatMessageResource getTopicMessages(id, size, page, order)

List messages in a topic

&lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
String id = "id_example"; // String | The topic id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "order_example"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceChatMessageResource result = apiInstance.getTopicMessages(id, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getTopicMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The topic id |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional]

### Return type

[**PageResourceChatMessageResource**](PageResourceChatMessageResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeChatBlacklist"></a>
# **removeChatBlacklist**
> Void removeChatBlacklist(blacklistedUserId, id)

Remove a user from a blacklist

&lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
Integer blacklistedUserId = 56; // Integer | The user id to blacklist
String id = "id_example"; // String | The user id or 'me'
try {
    Void result = apiInstance.removeChatBlacklist(blacklistedUserId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#removeChatBlacklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blacklistedUserId** | **Integer**| The user id to blacklist |
 **id** | **String**| The user id or &#39;me&#39; |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendChatMessage"></a>
# **sendChatMessage**
> ChatMessageResource sendChatMessage(chatMessageResource)

Send a message

&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

ChatApi apiInstance = new ChatApi();
ChatMessageResource chatMessageResource = new ChatMessageResource(); // ChatMessageResource | The chat message resource
try {
    ChatMessageResource result = apiInstance.sendChatMessage(chatMessageResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#sendChatMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatMessageResource** | [**ChatMessageResource**](ChatMessageResource.md)| The chat message resource | [optional]

### Return type

[**ChatMessageResource**](ChatMessageResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

