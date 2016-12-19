# UsersApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTagUsingPOST1**](UsersApi.md#addTagUsingPOST1) | **POST** /users/{user_id}/tags | Add a tag to a user
[**createUserTemplateUsingPOST**](UsersApi.md#createUserTemplateUsingPOST) | **POST** /users/templates | Create a user template
[**deleteUserTemplateUsingDELETE**](UsersApi.md#deleteUserTemplateUsingDELETE) | **DELETE** /users/templates/{id} | Delete a user template
[**doPasswordResetUsingPUT**](UsersApi.md#doPasswordResetUsingPUT) | **PUT** /users/{id}/password-reset | Choose a new password after a reset
[**getTagsUsingGET3**](UsersApi.md#getTagsUsingGET3) | **GET** /users/{user_id}/tags | List tags for a user
[**getUserTemplateUsingGET**](UsersApi.md#getUserTemplateUsingGET) | **GET** /users/templates/{id} | Get a single user template
[**getUserTemplatesUsingGET**](UsersApi.md#getUserTemplatesUsingGET) | **GET** /users/templates | List and search user templates
[**getUserUsingGET**](UsersApi.md#getUserUsingGET) | **GET** /users/{id} | Get a single user
[**getUsersUsingGET**](UsersApi.md#getUsersUsingGET) | **GET** /users | List and search users
[**initiatePasswordResetUsingPOST**](UsersApi.md#initiatePasswordResetUsingPOST) | **POST** /users/{id}/password-reset | Reset a user&#39;s password
[**registerUserUsingPOST**](UsersApi.md#registerUserUsingPOST) | **POST** /users | Register a new user
[**removeTagUsingDELETE1**](UsersApi.md#removeTagUsingDELETE1) | **DELETE** /users/{user_id}/tags/{tag} | Remove a tag from a user
[**setPasswordUsingPUT**](UsersApi.md#setPasswordUsingPUT) | **PUT** /users/{id}/password | Set a user&#39;s password
[**updateUserTemplateUsingPUT**](UsersApi.md#updateUserTemplateUsingPUT) | **PUT** /users/templates/{id} | Update a user template
[**updateUserUsingPUT**](UsersApi.md#updateUserUsingPUT) | **PUT** /users/{id} | Update a user&#39;s info


<a name="addTagUsingPOST1"></a>
# **addTagUsingPOST1**
> addTagUsingPOST1(userId, tag)

Add a tag to a user

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | The id of the user
String tag = "tag_example"; // String | tag
try {
    apiInstance.addTagUsingPOST1(userId, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#addTagUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **tag** | **String**| tag |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createUserTemplateUsingPOST"></a>
# **createUserTemplateUsingPOST**
> TemplateResource createUserTemplateUsingPOST(userTemplateResource)

Create a user template

User Templates define a type of user and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
TemplateResource userTemplateResource = new TemplateResource(); // TemplateResource | The user template resource object
try {
    TemplateResource result = apiInstance.createUserTemplateUsingPOST(userTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createUserTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userTemplateResource** | [**TemplateResource**](TemplateResource.md)| The user template resource object | [optional]

### Return type

[**TemplateResource**](TemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUserTemplateUsingDELETE"></a>
# **deleteUserTemplateUsingDELETE**
> deleteUserTemplateUsingDELETE(id, cascade)

Delete a user template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deleteUserTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserTemplateUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **cascade** | **String**| The value needed to delete used templates | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="doPasswordResetUsingPUT"></a>
# **doPasswordResetUsingPUT**
> doPasswordResetUsingPUT(id, newPasswordRequest)

Choose a new password after a reset

Finish resetting a user&#39;s password using the secret provided from the password-reset endpoint.  Password should be in plain text and will be encrypted on receipt. Use SSL for security.

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | The id of the user
NewPasswordRequest newPasswordRequest = new NewPasswordRequest(); // NewPasswordRequest | The new password request object
try {
    apiInstance.doPasswordResetUsingPUT(id, newPasswordRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#doPasswordResetUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the user |
 **newPasswordRequest** | [**NewPasswordRequest**](NewPasswordRequest.md)| The new password request object | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getTagsUsingGET3"></a>
# **getTagsUsingGET3**
> List&lt;String&gt; getTagsUsingGET3(userId)

List tags for a user

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | The id of the user
try {
    List<String> result = apiInstance.getTagsUsingGET3(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getTagsUsingGET3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |

### Return type

**List&lt;String&gt;**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserTemplateUsingGET"></a>
# **getUserTemplateUsingGET**
> TemplateResource getUserTemplateUsingGET(id)

Get a single user template

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String id = "id_example"; // String | The id of the template
try {
    TemplateResource result = apiInstance.getUserTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserTemplateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |

### Return type

[**TemplateResource**](TemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserTemplatesUsingGET"></a>
# **getUserTemplatesUsingGET**
> PageTemplateResource getUserTemplatesUsingGET(size, page, order)

List and search user templates

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "1"; // String | a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageTemplateResource result = apiInstance.getUserTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserTemplatesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to 1]

### Return type

[**PageTemplateResource**](PageTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> UserResource getUserUsingGET(id)

Get a single user

Additional private info is included as USERS_ADMIN

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String id = "id_example"; // String | The id of the user or 'me'
try {
    UserResource result = apiInstance.getUserUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the user or &#39;me&#39; |

### Return type

[**UserResource**](UserResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsersUsingGET"></a>
# **getUsersUsingGET**
> PageUserBaseResource getUsersUsingGET(filterRole, filterDisplayname, filterEmail, filterFirstname, filterFullname, filterLastname, filterUsername, filterTag, filterGroup, size, page, order)

List and search users

Additional private info is included as USERS_ADMIN

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String filterRole = "filterRole_example"; // String | Filter for users whose roles has the provided role
String filterDisplayname = "filterDisplayname_example"; // String | Filter for users whose display name starts with provided string.
String filterEmail = "filterEmail_example"; // String | Filter for users whose email starts with provided string. Requires USERS_ADMIN permission
String filterFirstname = "filterFirstname_example"; // String | Filter for users whose first name starts with provided string. Requires USERS_ADMIN permission
String filterFullname = "filterFullname_example"; // String | Filter for users whose full name starts with provided string. Requires USERS_ADMIN permission
String filterLastname = "filterLastname_example"; // String | Filter for users whose last name starts with provided string. Requires USERS_ADMIN permission
String filterUsername = "filterUsername_example"; // String | Filter for users whose username starts with the provided string. Requires USERS_ADMIN permission
String filterTag = "filterTag_example"; // String | Filter for users who have a given tag
String filterGroup = "filterGroup_example"; // String | Filter for users in a given group, by unique name
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "1"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageUserBaseResource result = apiInstance.getUsersUsingGET(filterRole, filterDisplayname, filterEmail, filterFirstname, filterFullname, filterLastname, filterUsername, filterTag, filterGroup, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterRole** | **String**| Filter for users whose roles has the provided role | [optional]
 **filterDisplayname** | **String**| Filter for users whose display name starts with provided string. | [optional]
 **filterEmail** | **String**| Filter for users whose email starts with provided string. Requires USERS_ADMIN permission | [optional]
 **filterFirstname** | **String**| Filter for users whose first name starts with provided string. Requires USERS_ADMIN permission | [optional]
 **filterFullname** | **String**| Filter for users whose full name starts with provided string. Requires USERS_ADMIN permission | [optional]
 **filterLastname** | **String**| Filter for users whose last name starts with provided string. Requires USERS_ADMIN permission | [optional]
 **filterUsername** | **String**| Filter for users whose username starts with the provided string. Requires USERS_ADMIN permission | [optional]
 **filterTag** | **String**| Filter for users who have a given tag | [optional]
 **filterGroup** | **String**| Filter for users in a given group, by unique name | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to 1]

### Return type

[**PageUserBaseResource**](PageUserBaseResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="initiatePasswordResetUsingPOST"></a>
# **initiatePasswordResetUsingPOST**
> initiatePasswordResetUsingPOST(id)

Reset a user&#39;s password

A reset code will be generated and a &#39;forgot_password&#39; BRE event will be fired with that code; this can be routed to the user as needed and submitted to the &#39;choose a new password&#39; endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | The id of the user
try {
    apiInstance.initiatePasswordResetUsingPOST(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#initiatePasswordResetUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the user |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="registerUserUsingPOST"></a>
# **registerUserUsingPOST**
> UserResource registerUserUsingPOST(userResource)

Register a new user

Password should be in plain text and will be encrypted on receipt. Use SSL for security

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UserResource userResource = new UserResource(); // UserResource | The user resource object
try {
    UserResource result = apiInstance.registerUserUsingPOST(userResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#registerUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userResource** | [**UserResource**](UserResource.md)| The user resource object | [optional]

### Return type

[**UserResource**](UserResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="removeTagUsingDELETE1"></a>
# **removeTagUsingDELETE1**
> removeTagUsingDELETE1(userId, tag)

Remove a tag from a user

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | The id of the user
String tag = "tag_example"; // String | The tag to remove
try {
    apiInstance.removeTagUsingDELETE1(userId, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#removeTagUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **tag** | **String**| The tag to remove |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="setPasswordUsingPUT"></a>
# **setPasswordUsingPUT**
> setPasswordUsingPUT(id, password)

Set a user&#39;s password

Password should be in plain text and will be encrypted on receipt. Use SSL for security.

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | The id of the user
String password = "password_example"; // String | The new plain text password
try {
    apiInstance.setPasswordUsingPUT(id, password);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#setPasswordUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the user |
 **password** | **String**| The new plain text password | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateUserTemplateUsingPUT"></a>
# **updateUserTemplateUsingPUT**
> updateUserTemplateUsingPUT(id, userTemplateResource)

Update a user template

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String id = "id_example"; // String | The id of the template
TemplateResource userTemplateResource = new TemplateResource(); // TemplateResource | The user template resource object
try {
    apiInstance.updateUserTemplateUsingPUT(id, userTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUserTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **userTemplateResource** | [**TemplateResource**](TemplateResource.md)| The user template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateUserUsingPUT"></a>
# **updateUserUsingPUT**
> updateUserUsingPUT(id, userResource)

Update a user&#39;s info

Password will not be edited on this endpoint, use password specific endpoints.

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String id = "id_example"; // String | The id of the user or 'me'
UserResource userResource = new UserResource(); // UserResource | The user resource object
try {
    apiInstance.updateUserUsingPUT(id, userResource);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the user or &#39;me&#39; |
 **userResource** | [**UserResource**](UserResource.md)| The user resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

