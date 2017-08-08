# UsersRelationshipsApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserRelationship**](UsersRelationshipsApi.md#createUserRelationship) | **POST** /users/relationships | Create a user relationship
[**deleteUserRelationship**](UsersRelationshipsApi.md#deleteUserRelationship) | **DELETE** /users/relationships/{id} | Delete a user relationship
[**getUserRelationship**](UsersRelationshipsApi.md#getUserRelationship) | **GET** /users/relationships/{id} | Get a user relationship
[**getUserRelationships**](UsersRelationshipsApi.md#getUserRelationships) | **GET** /users/relationships | Get a list of user relationships
[**updateUserRelationship**](UsersRelationshipsApi.md#updateUserRelationship) | **PUT** /users/relationships/{id} | Update a user relationship


<a name="createUserRelationship"></a>
# **createUserRelationship**
> UserRelationshipResource createUserRelationship(relationship)

Create a user relationship

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.UsersRelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersRelationshipsApi apiInstance = new UsersRelationshipsApi();
UserRelationshipResource relationship = new UserRelationshipResource(); // UserRelationshipResource | The new relationship
try {
    UserRelationshipResource result = apiInstance.createUserRelationship(relationship);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRelationshipsApi#createUserRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship** | [**UserRelationshipResource**](UserRelationshipResource.md)| The new relationship | [optional]

### Return type

[**UserRelationshipResource**](UserRelationshipResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserRelationship"></a>
# **deleteUserRelationship**
> deleteUserRelationship(id)

Delete a user relationship

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.UsersRelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersRelationshipsApi apiInstance = new UsersRelationshipsApi();
Long id = 789L; // Long | The id of the relationship
try {
    apiInstance.deleteUserRelationship(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRelationshipsApi#deleteUserRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the relationship |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserRelationship"></a>
# **getUserRelationship**
> UserRelationshipResource getUserRelationship(id)

Get a user relationship

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.UsersRelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersRelationshipsApi apiInstance = new UsersRelationshipsApi();
Long id = 789L; // Long | The id of the relationship
try {
    UserRelationshipResource result = apiInstance.getUserRelationship(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRelationshipsApi#getUserRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the relationship |

### Return type

[**UserRelationshipResource**](UserRelationshipResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserRelationships"></a>
# **getUserRelationships**
> PageResourceUserRelationshipResource getUserRelationships(size, page, order)

Get a list of user relationships

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.UsersRelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersRelationshipsApi apiInstance = new UsersRelationshipsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "order_example"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceUserRelationshipResource result = apiInstance.getUserRelationships(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRelationshipsApi#getUserRelationships");
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

[**PageResourceUserRelationshipResource**](PageResourceUserRelationshipResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserRelationship"></a>
# **updateUserRelationship**
> UserRelationshipResource updateUserRelationship(id, relationship)

Update a user relationship

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.UsersRelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersRelationshipsApi apiInstance = new UsersRelationshipsApi();
Long id = 789L; // Long | The id of the relationship
UserRelationshipResource relationship = new UserRelationshipResource(); // UserRelationshipResource | The new relationship
try {
    UserRelationshipResource result = apiInstance.updateUserRelationship(id, relationship);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRelationshipsApi#updateUserRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the relationship |
 **relationship** | [**UserRelationshipResource**](UserRelationshipResource.md)| The new relationship | [optional]

### Return type

[**UserRelationshipResource**](UserRelationshipResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

