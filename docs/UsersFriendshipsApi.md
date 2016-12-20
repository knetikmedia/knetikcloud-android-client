# UsersFriendshipsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFriendUsingPOST**](UsersFriendshipsApi.md#addFriendUsingPOST) | **POST** /users/{user_id}/friends/{id} | Add a friend
[**connectUsingTokenUsingPOST**](UsersFriendshipsApi.md#connectUsingTokenUsingPOST) | **POST** /users/{user_id}/friends/tokens | Redeem friendship token
[**getFriendsUsingGET**](UsersFriendshipsApi.md#getFriendsUsingGET) | **GET** /users/{user_id}/friends | Get friends list
[**getInviteTokenUsingGET**](UsersFriendshipsApi.md#getInviteTokenUsingGET) | **GET** /users/{user_id}/invite-token | Returns the invite token
[**getInvitesUsingGET**](UsersFriendshipsApi.md#getInvitesUsingGET) | **GET** /users/{user_id}/invites | Get pending invites
[**removeFriendUsingDELETE**](UsersFriendshipsApi.md#removeFriendUsingDELETE) | **DELETE** /users/{user_id}/friends/{id} | Remove or decline a friend


<a name="addFriendUsingPOST"></a>
# **addFriendUsingPOST**
> addFriendUsingPOST(userId, id)

Add a friend

As a user, either creates or confirm a pending request. As an admin, call this endpoint twice while inverting the IDs to create a confirmed friendship.

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersFriendshipsApi;

UsersFriendshipsApi apiInstance = new UsersFriendshipsApi();
String userId = "userId_example"; // String | The id of the user or 'me' if logged in
Integer id = 56; // Integer | The id of the user to befriend
try {
    apiInstance.addFriendUsingPOST(userId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersFriendshipsApi#addFriendUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user or &#39;me&#39; if logged in |
 **id** | **Integer**| The id of the user to befriend |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="connectUsingTokenUsingPOST"></a>
# **connectUsingTokenUsingPOST**
> connectUsingTokenUsingPOST(userId, token)

Redeem friendship token

Immediately connects the requested user with the user mapped by the provided invite token

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersFriendshipsApi;

UsersFriendshipsApi apiInstance = new UsersFriendshipsApi();
String userId = "userId_example"; // String | The id of the user or 'me' if logged in
String token = "token_example"; // String | The invite token
try {
    apiInstance.connectUsingTokenUsingPOST(userId, token);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersFriendshipsApi#connectUsingTokenUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user or &#39;me&#39; if logged in |
 **token** | **String**| The invite token | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFriendsUsingGET"></a>
# **getFriendsUsingGET**
> PageSimpleUserResource getFriendsUsingGET(userId, size, page, order)

Get friends list

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersFriendshipsApi;

UsersFriendshipsApi apiInstance = new UsersFriendshipsApi();
String userId = "userId_example"; // String | The id of the user or 'me'
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageSimpleUserResource result = apiInstance.getFriendsUsingGET(userId, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersFriendshipsApi#getFriendsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user or &#39;me&#39; |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageSimpleUserResource**](PageSimpleUserResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInviteTokenUsingGET"></a>
# **getInviteTokenUsingGET**
> String getInviteTokenUsingGET(userId)

Returns the invite token

This is a unique invite token that allows direct connection to the request user.  Exposing that token presents privacy issues if the token is leaked. Use friend request flow instead if confirmation is required

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersFriendshipsApi;

UsersFriendshipsApi apiInstance = new UsersFriendshipsApi();
String userId = "userId_example"; // String | The id of the user or 'me' if logged in
try {
    String result = apiInstance.getInviteTokenUsingGET(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersFriendshipsApi#getInviteTokenUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user or &#39;me&#39; if logged in |

### Return type

**String**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInvitesUsingGET"></a>
# **getInvitesUsingGET**
> PageSimpleUserResource getInvitesUsingGET(userId, size, page, order)

Get pending invites

Invites that the specified user received

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersFriendshipsApi;

UsersFriendshipsApi apiInstance = new UsersFriendshipsApi();
String userId = "userId_example"; // String | The id of the user or 'me'
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageSimpleUserResource result = apiInstance.getInvitesUsingGET(userId, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersFriendshipsApi#getInvitesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user or &#39;me&#39; |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageSimpleUserResource**](PageSimpleUserResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeFriendUsingDELETE"></a>
# **removeFriendUsingDELETE**
> removeFriendUsingDELETE(userId, id)

Remove or decline a friend

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersFriendshipsApi;

UsersFriendshipsApi apiInstance = new UsersFriendshipsApi();
String userId = "userId_example"; // String | The id of the user or 'me' if logged in
Integer id = 56; // Integer | The id of the user to befriend
try {
    apiInstance.removeFriendUsingDELETE(userId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersFriendshipsApi#removeFriendUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user or &#39;me&#39; if logged in |
 **id** | **Integer**| The id of the user to befriend |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

