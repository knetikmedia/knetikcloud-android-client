# UsersGroupsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGroupUsingPOST**](UsersGroupsApi.md#addGroupUsingPOST) | **POST** /users/groups | Adds a new group in the system
[**addMemberUsingPOST**](UsersGroupsApi.md#addMemberUsingPOST) | **POST** /users/groups/{unique_name}/members | Adds a new member to the group
[**createGroupTemplateUsingPOST**](UsersGroupsApi.md#createGroupTemplateUsingPOST) | **POST** /users/groups/templates | Create a group template
[**deleteGroupTemplateUsingDELETE**](UsersGroupsApi.md#deleteGroupTemplateUsingDELETE) | **DELETE** /users/groups/templates/{id} | Delete a group template
[**deleteGroupUsingDELETE**](UsersGroupsApi.md#deleteGroupUsingDELETE) | **DELETE** /users/groups/{unique_name}/members/{user_id} | Removes a user from a group
[**deleteGroupUsingDELETE1**](UsersGroupsApi.md#deleteGroupUsingDELETE1) | **DELETE** /users/groups/{unique_name} | Removes a group from the system IF no resources are attached to it
[**getGroupTemplateUsingGET**](UsersGroupsApi.md#getGroupTemplateUsingGET) | **GET** /users/groups/templates/{id} | Get a single group template
[**getGroupTemplatesUsingGET**](UsersGroupsApi.md#getGroupTemplatesUsingGET) | **GET** /users/groups/templates | List and search group templates
[**getGroupUsingGET**](UsersGroupsApi.md#getGroupUsingGET) | **GET** /users/groups/{unique_name} | Loads a specific group&#39;s details
[**searchGroupsUsingGET**](UsersGroupsApi.md#searchGroupsUsingGET) | **GET** /users/groups/{unique_name}/members | Lists members of the group
[**searchGroupsUsingGET1**](UsersGroupsApi.md#searchGroupsUsingGET1) | **GET** /users/groups | List and search groups
[**updateGroupTemplateUsingPUT**](UsersGroupsApi.md#updateGroupTemplateUsingPUT) | **PUT** /users/groups/templates/{id} | Update a group template
[**updateGroupUsingPUT**](UsersGroupsApi.md#updateGroupUsingPUT) | **PUT** /users/groups/{unique_name} | Modifies a group&#39;s details
[**updateMemberStatusUsingPUT**](UsersGroupsApi.md#updateMemberStatusUsingPUT) | **PUT** /users/groups/{unique_name}/members/{user_id}/status | Change a user&#39;s status


<a name="addGroupUsingPOST"></a>
# **addGroupUsingPOST**
> GroupResource addGroupUsingPOST(groupResource)

Adds a new group in the system

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
GroupResource groupResource = new GroupResource(); // GroupResource | The new group
try {
    GroupResource result = apiInstance.addGroupUsingPOST(groupResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#addGroupUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupResource** | [**GroupResource**](GroupResource.md)| The new group | [optional]

### Return type

[**GroupResource**](GroupResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addMemberUsingPOST"></a>
# **addMemberUsingPOST**
> GroupMemberResource addMemberUsingPOST(uniqueName, username)

Adds a new member to the group

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
String uniqueName = "uniqueName_example"; // String | The group unique name
GroupMemberResource username = new GroupMemberResource(); // GroupMemberResource | The username of a user to add to the group
try {
    GroupMemberResource result = apiInstance.addMemberUsingPOST(uniqueName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#addMemberUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueName** | **String**| The group unique name |
 **username** | [**GroupMemberResource**](GroupMemberResource.md)| The username of a user to add to the group |

### Return type

[**GroupMemberResource**](GroupMemberResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createGroupTemplateUsingPOST"></a>
# **createGroupTemplateUsingPOST**
> TemplateResource createGroupTemplateUsingPOST(groupTemplateResource)

Create a group template

Group Templates define a type of group and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
TemplateResource groupTemplateResource = new TemplateResource(); // TemplateResource | The group template resource object
try {
    TemplateResource result = apiInstance.createGroupTemplateUsingPOST(groupTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#createGroupTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupTemplateResource** | [**TemplateResource**](TemplateResource.md)| The group template resource object | [optional]

### Return type

[**TemplateResource**](TemplateResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroupTemplateUsingDELETE"></a>
# **deleteGroupTemplateUsingDELETE**
> deleteGroupTemplateUsingDELETE(id, cascade)

Delete a group template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deleteGroupTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#deleteGroupTemplateUsingDELETE");
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

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroupUsingDELETE"></a>
# **deleteGroupUsingDELETE**
> deleteGroupUsingDELETE(uniqueName, userId)

Removes a user from a group

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
String uniqueName = "uniqueName_example"; // String | The group unique name
Integer userId = 56; // Integer | The id of the user to remove
try {
    apiInstance.deleteGroupUsingDELETE(uniqueName, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#deleteGroupUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueName** | **String**| The group unique name |
 **userId** | **Integer**| The id of the user to remove |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroupUsingDELETE1"></a>
# **deleteGroupUsingDELETE1**
> deleteGroupUsingDELETE1(uniqueName)

Removes a group from the system IF no resources are attached to it

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
String uniqueName = "uniqueName_example"; // String | The group unique name
try {
    apiInstance.deleteGroupUsingDELETE1(uniqueName);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#deleteGroupUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueName** | **String**| The group unique name |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupTemplateUsingGET"></a>
# **getGroupTemplateUsingGET**
> TemplateResource getGroupTemplateUsingGET(id)

Get a single group template

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
String id = "id_example"; // String | The id of the template
try {
    TemplateResource result = apiInstance.getGroupTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#getGroupTemplateUsingGET");
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

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupTemplatesUsingGET"></a>
# **getGroupTemplatesUsingGET**
> PageResourceTemplateResource getGroupTemplatesUsingGET(size, page, order)

List and search group templates

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceTemplateResource result = apiInstance.getGroupTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#getGroupTemplatesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceTemplateResource**](PageResourceTemplateResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupUsingGET"></a>
# **getGroupUsingGET**
> GroupResource getGroupUsingGET(uniqueName)

Loads a specific group&#39;s details

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
String uniqueName = "uniqueName_example"; // String | The group unique name
try {
    GroupResource result = apiInstance.getGroupUsingGET(uniqueName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#getGroupUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueName** | **String**| The group unique name |

### Return type

[**GroupResource**](GroupResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchGroupsUsingGET"></a>
# **searchGroupsUsingGET**
> PageResourceGroupMemberResource searchGroupsUsingGET(uniqueName, size, page, order)

Lists members of the group

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
String uniqueName = "uniqueName_example"; // String | The group unique name
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceGroupMemberResource result = apiInstance.searchGroupsUsingGET(uniqueName, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#searchGroupsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueName** | **String**| The group unique name |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceGroupMemberResource**](PageResourceGroupMemberResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchGroupsUsingGET1"></a>
# **searchGroupsUsingGET1**
> PageResourceGroupResource searchGroupsUsingGET1(size, page, order)

List and search groups

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "name:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceGroupResource result = apiInstance.searchGroupsUsingGET1(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#searchGroupsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to name:ASC]

### Return type

[**PageResourceGroupResource**](PageResourceGroupResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGroupTemplateUsingPUT"></a>
# **updateGroupTemplateUsingPUT**
> updateGroupTemplateUsingPUT(id, groupTemplateResource)

Update a group template

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
String id = "id_example"; // String | The id of the template
TemplateResource groupTemplateResource = new TemplateResource(); // TemplateResource | The group template resource object
try {
    apiInstance.updateGroupTemplateUsingPUT(id, groupTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#updateGroupTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **groupTemplateResource** | [**TemplateResource**](TemplateResource.md)| The group template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGroupUsingPUT"></a>
# **updateGroupUsingPUT**
> updateGroupUsingPUT(uniqueName, groupResource)

Modifies a group&#39;s details

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
String uniqueName = "uniqueName_example"; // String | The group unique name
GroupResource groupResource = new GroupResource(); // GroupResource | The updated group
try {
    apiInstance.updateGroupUsingPUT(uniqueName, groupResource);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#updateGroupUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueName** | **String**| The group unique name |
 **groupResource** | [**GroupResource**](GroupResource.md)| The updated group | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMemberStatusUsingPUT"></a>
# **updateMemberStatusUsingPUT**
> updateMemberStatusUsingPUT(uniqueName, userId, status)

Change a user&#39;s status

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersGroupsApi;

UsersGroupsApi apiInstance = new UsersGroupsApi();
String uniqueName = "uniqueName_example"; // String | The group unique name
Integer userId = 56; // Integer | The user id of the member to modify
String status = "status_example"; // String | The new status for the user
try {
    apiInstance.updateMemberStatusUsingPUT(uniqueName, userId, status);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersGroupsApi#updateMemberStatusUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueName** | **String**| The group unique name |
 **userId** | **Integer**| The user id of the member to modify |
 **status** | **String**| The new status for the user |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

