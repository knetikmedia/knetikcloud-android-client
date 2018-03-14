# UsersAddressesApi

All URIs are relative to *https://jsapi-integration.us-east-1.elasticbeanstalk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAddress**](UsersAddressesApi.md#createAddress) | **POST** users/{user_id}/addresses | Create a new address
[**deleteAddress**](UsersAddressesApi.md#deleteAddress) | **DELETE** users/{user_id}/addresses/{id} | Delete an address
[**getAddress**](UsersAddressesApi.md#getAddress) | **GET** users/{user_id}/addresses/{id} | Get a single address
[**getAddresses**](UsersAddressesApi.md#getAddresses) | **GET** users/{user_id}/addresses | List and search addresses
[**updateAddress**](UsersAddressesApi.md#updateAddress) | **PUT** users/{user_id}/addresses/{id} | Update an address


<a name="createAddress"></a>
# **createAddress**
> SavedAddressResource createAddress(userId, savedAddressResource)

Create a new address

&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.UsersAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

UsersAddressesApi apiInstance = new UsersAddressesApi();
String userId = "userId_example"; // String | The id of the user
SavedAddressResource savedAddressResource = new SavedAddressResource(); // SavedAddressResource | The new address
try {
    SavedAddressResource result = apiInstance.createAddress(userId, savedAddressResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAddressesApi#createAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user |
 **savedAddressResource** | [**SavedAddressResource**](SavedAddressResource.md)| The new address | [optional]

### Return type

[**SavedAddressResource**](SavedAddressResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAddress"></a>
# **deleteAddress**
> Void deleteAddress(userId, id)

Delete an address

&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.UsersAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

UsersAddressesApi apiInstance = new UsersAddressesApi();
String userId = "userId_example"; // String | The id of the user
Integer id = 56; // Integer | The id of the address
try {
    Void result = apiInstance.deleteAddress(userId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAddressesApi#deleteAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user |
 **id** | **Integer**| The id of the address |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAddress"></a>
# **getAddress**
> SavedAddressResource getAddress(userId, id)

Get a single address

&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.UsersAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

UsersAddressesApi apiInstance = new UsersAddressesApi();
String userId = "userId_example"; // String | The id of the user
Integer id = 56; // Integer | The id of the address
try {
    SavedAddressResource result = apiInstance.getAddress(userId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAddressesApi#getAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user |
 **id** | **Integer**| The id of the address |

### Return type

[**SavedAddressResource**](SavedAddressResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAddresses"></a>
# **getAddresses**
> PageResourceSavedAddressResource getAddresses(userId, size, page, order)

List and search addresses

&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.UsersAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

UsersAddressesApi apiInstance = new UsersAddressesApi();
String userId = "userId_example"; // String | The id of the user
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceSavedAddressResource result = apiInstance.getAddresses(userId, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAddressesApi#getAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceSavedAddressResource**](PageResourceSavedAddressResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAddress"></a>
# **updateAddress**
> SavedAddressResource updateAddress(userId, id, savedAddressResource)

Update an address

&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or owner

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.UsersAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

UsersAddressesApi apiInstance = new UsersAddressesApi();
String userId = "userId_example"; // String | The id of the user
Integer id = 56; // Integer | The id of the address
SavedAddressResource savedAddressResource = new SavedAddressResource(); // SavedAddressResource | The saved address resource object
try {
    SavedAddressResource result = apiInstance.updateAddress(userId, id, savedAddressResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAddressesApi#updateAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user |
 **id** | **Integer**| The id of the address |
 **savedAddressResource** | [**SavedAddressResource**](SavedAddressResource.md)| The saved address resource object | [optional]

### Return type

[**SavedAddressResource**](SavedAddressResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

