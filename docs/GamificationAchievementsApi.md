# GamificationAchievementsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAchievementUsingPOST**](GamificationAchievementsApi.md#createAchievementUsingPOST) | **POST** /achievements | Create a new achievement definition
[**createTemplateUsingPOST**](GamificationAchievementsApi.md#createTemplateUsingPOST) | **POST** /achievements/templates | Create an achievement template
[**deleteAchievementTemplateUsingDELETE**](GamificationAchievementsApi.md#deleteAchievementTemplateUsingDELETE) | **DELETE** /achievements/templates/{id} | Delete an achievement template
[**deleteAchievementUsingDELETE**](GamificationAchievementsApi.md#deleteAchievementUsingDELETE) | **DELETE** /achievements/{name} | Delete an achievement definition
[**findAllByGroupNameUsingGET**](GamificationAchievementsApi.md#findAllByGroupNameUsingGET) | **GET** /achievements/derived/{name} | Get a list of derived achievements
[**getAchievementTemplateUsingGET**](GamificationAchievementsApi.md#getAchievementTemplateUsingGET) | **GET** /achievements/templates/{id} | Get a single achievement template
[**getAchievementTemplatesUsingGET**](GamificationAchievementsApi.md#getAchievementTemplatesUsingGET) | **GET** /achievements/templates | List and search achievement templates
[**getAchievementUsingGET**](GamificationAchievementsApi.md#getAchievementUsingGET) | **GET** /achievements/{name} | Get a single achievement definition
[**getAchievementsUsingGET**](GamificationAchievementsApi.md#getAchievementsUsingGET) | **GET** /achievements | Get all achievement definitions in the system
[**getAllUserProgressForAchievementUsingGET**](GamificationAchievementsApi.md#getAllUserProgressForAchievementUsingGET) | **GET** /users/achievements/{achievement_name} | Retrieve progress on a given achievement for all users
[**getAllUserProgressUsingGET**](GamificationAchievementsApi.md#getAllUserProgressUsingGET) | **GET** /users/achievements | Retrieve progress on achievements for all users
[**getAvailableTriggersUsingGET**](GamificationAchievementsApi.md#getAvailableTriggersUsingGET) | **GET** /achievements/triggers | Get the list of triggers that can be used to trigger an achievement progress update
[**getUserProgressForAchievementUsingGET**](GamificationAchievementsApi.md#getUserProgressForAchievementUsingGET) | **GET** /users/{user_id}/achievements/{achievement_name} | Retrieve progress on a given achievement for a given user
[**getUserProgressUsingGET**](GamificationAchievementsApi.md#getUserProgressUsingGET) | **GET** /users/{user_id}/achievements | Retrieve progress on achievements for a given user
[**updateAchievementUsingPUT**](GamificationAchievementsApi.md#updateAchievementUsingPUT) | **PUT** /achievements/{name} | Update an achievement definition
[**updateProgressUsingPUT**](GamificationAchievementsApi.md#updateProgressUsingPUT) | **PUT** /users/{user_id}/achievements/{achievement_name} | Update or create an achievement progress record for a user
[**updateTemplateUsingPUT**](GamificationAchievementsApi.md#updateTemplateUsingPUT) | **PUT** /achievements/templates/{id} | Update an achievement template


<a name="createAchievementUsingPOST"></a>
# **createAchievementUsingPOST**
> AchievementDefinitionResource createAchievementUsingPOST(achievement)

Create a new achievement definition

If the definition contains a trigger event name, a BRE rule is created, so that tracking logic is executed when the triggering event occurs. If no trigger event name is specified, the user&#39;s achievement status must manually be updated via the API.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
AchievementDefinitionResource achievement = new AchievementDefinitionResource(); // AchievementDefinitionResource | The achievement definition
try {
    AchievementDefinitionResource result = apiInstance.createAchievementUsingPOST(achievement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#createAchievementUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **achievement** | [**AchievementDefinitionResource**](AchievementDefinitionResource.md)| The achievement definition | [optional]

### Return type

[**AchievementDefinitionResource**](AchievementDefinitionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTemplateUsingPOST"></a>
# **createTemplateUsingPOST**
> TemplateResource createTemplateUsingPOST(template)

Create an achievement template

Achievement templates define a type of achievement and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
TemplateResource template = new TemplateResource(); // TemplateResource | The achievement template to be created
try {
    TemplateResource result = apiInstance.createTemplateUsingPOST(template);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#createTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template** | [**TemplateResource**](TemplateResource.md)| The achievement template to be created | [optional]

### Return type

[**TemplateResource**](TemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAchievementTemplateUsingDELETE"></a>
# **deleteAchievementTemplateUsingDELETE**
> deleteAchievementTemplateUsingDELETE(id, cascade)

Delete an achievement template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deleteAchievementTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#deleteAchievementTemplateUsingDELETE");
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
 - **Accept**: application/json

<a name="deleteAchievementUsingDELETE"></a>
# **deleteAchievementUsingDELETE**
> deleteAchievementUsingDELETE(name)

Delete an achievement definition

Will also disable the associated generated rule, if any.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
String name = "name_example"; // String | The name of the achievement
try {
    apiInstance.deleteAchievementUsingDELETE(name);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#deleteAchievementUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the achievement |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllByGroupNameUsingGET"></a>
# **findAllByGroupNameUsingGET**
> List&lt;AchievementDefinitionResource&gt; findAllByGroupNameUsingGET(name)

Get a list of derived achievements

Used by other services that depend on achievements

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
String name = "name_example"; // String | The name of the derived achievement
try {
    List<AchievementDefinitionResource> result = apiInstance.findAllByGroupNameUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#findAllByGroupNameUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the derived achievement |

### Return type

[**List&lt;AchievementDefinitionResource&gt;**](AchievementDefinitionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAchievementTemplateUsingGET"></a>
# **getAchievementTemplateUsingGET**
> TemplateResource getAchievementTemplateUsingGET(id)

Get a single achievement template

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
String id = "id_example"; // String | The id of the template
try {
    TemplateResource result = apiInstance.getAchievementTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#getAchievementTemplateUsingGET");
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
 - **Accept**: application/json

<a name="getAchievementTemplatesUsingGET"></a>
# **getAchievementTemplatesUsingGET**
> PageResourceTemplateResource getAchievementTemplatesUsingGET(size, page, order)

List and search achievement templates

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceTemplateResource result = apiInstance.getAchievementTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#getAchievementTemplatesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceTemplateResource**](PageResourceTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAchievementUsingGET"></a>
# **getAchievementUsingGET**
> AchievementDefinitionResource getAchievementUsingGET(name)

Get a single achievement definition

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
String name = "name_example"; // String | The name of the achievement
try {
    AchievementDefinitionResource result = apiInstance.getAchievementUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#getAchievementUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the achievement |

### Return type

[**AchievementDefinitionResource**](AchievementDefinitionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAchievementsUsingGET"></a>
# **getAchievementsUsingGET**
> PageResourceAchievementDefinitionResource getAchievementsUsingGET(filterTagset, filterName, filterHidden, filterDerived, size, page, order)

Get all achievement definitions in the system

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
String filterTagset = "filterTagset_example"; // String | Filter for achievements with specified tags (separated by comma)
String filterName = "filterName_example"; // String | Filter for achievements whose name contains a string
Boolean filterHidden = true; // Boolean | Filter for achievements that are hidden or not
Boolean filterDerived = true; // Boolean | Filter for achievements that are derived from other services
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "name:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceAchievementDefinitionResource result = apiInstance.getAchievementsUsingGET(filterTagset, filterName, filterHidden, filterDerived, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#getAchievementsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterTagset** | **String**| Filter for achievements with specified tags (separated by comma) | [optional]
 **filterName** | **String**| Filter for achievements whose name contains a string | [optional]
 **filterHidden** | **Boolean**| Filter for achievements that are hidden or not | [optional]
 **filterDerived** | **Boolean**| Filter for achievements that are derived from other services | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to name:ASC]

### Return type

[**PageResourceAchievementDefinitionResource**](PageResourceAchievementDefinitionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllUserProgressForAchievementUsingGET"></a>
# **getAllUserProgressForAchievementUsingGET**
> PageResourceUserAchievementGroupResource getAllUserProgressForAchievementUsingGET(achievementName, filterAchievementDerived, filterAchievementTagset, filterAchievementHidden, size, page)

Retrieve progress on a given achievement for all users

Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
String achievementName = "achievementName_example"; // String | The achievement's name
Boolean filterAchievementDerived = true; // Boolean | Filter for achievements that are derived from other services
String filterAchievementTagset = "filterAchievementTagset_example"; // String | Filter for achievements with specified tags (separated by comma)
Boolean filterAchievementHidden = true; // Boolean | Filter for achievements that are hidden or not
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUserAchievementGroupResource result = apiInstance.getAllUserProgressForAchievementUsingGET(achievementName, filterAchievementDerived, filterAchievementTagset, filterAchievementHidden, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#getAllUserProgressForAchievementUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **achievementName** | **String**| The achievement&#39;s name |
 **filterAchievementDerived** | **Boolean**| Filter for achievements that are derived from other services | [optional]
 **filterAchievementTagset** | **String**| Filter for achievements with specified tags (separated by comma) | [optional]
 **filterAchievementHidden** | **Boolean**| Filter for achievements that are hidden or not | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUserAchievementGroupResource**](PageResourceUserAchievementGroupResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllUserProgressUsingGET"></a>
# **getAllUserProgressUsingGET**
> PageResourceUserAchievementGroupResource getAllUserProgressUsingGET(filterAchievementDerived, filterAchievementTagset, filterAchievementName, filterAchievementHidden, size, page)

Retrieve progress on achievements for all users

Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
Boolean filterAchievementDerived = true; // Boolean | Filter for achievements that are derived from other services
String filterAchievementTagset = "filterAchievementTagset_example"; // String | Filter for achievements with specified tags (separated by comma)
String filterAchievementName = "filterAchievementName_example"; // String | Filter for achievements whose name contains a string
Boolean filterAchievementHidden = true; // Boolean | Filter for achievements that are hidden or not
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUserAchievementGroupResource result = apiInstance.getAllUserProgressUsingGET(filterAchievementDerived, filterAchievementTagset, filterAchievementName, filterAchievementHidden, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#getAllUserProgressUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterAchievementDerived** | **Boolean**| Filter for achievements that are derived from other services | [optional]
 **filterAchievementTagset** | **String**| Filter for achievements with specified tags (separated by comma) | [optional]
 **filterAchievementName** | **String**| Filter for achievements whose name contains a string | [optional]
 **filterAchievementHidden** | **Boolean**| Filter for achievements that are hidden or not | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUserAchievementGroupResource**](PageResourceUserAchievementGroupResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAvailableTriggersUsingGET"></a>
# **getAvailableTriggersUsingGET**
> List&lt;BreTriggerResource&gt; getAvailableTriggersUsingGET()

Get the list of triggers that can be used to trigger an achievement progress update

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
try {
    List<BreTriggerResource> result = apiInstance.getAvailableTriggersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#getAvailableTriggersUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BreTriggerResource&gt;**](BreTriggerResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserProgressForAchievementUsingGET"></a>
# **getUserProgressForAchievementUsingGET**
> UserAchievementGroupResource getUserProgressForAchievementUsingGET(userId, achievementName)

Retrieve progress on a given achievement for a given user

Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
Integer userId = 56; // Integer | The user's id
String achievementName = "achievementName_example"; // String | The achievement's name
try {
    UserAchievementGroupResource result = apiInstance.getUserProgressForAchievementUsingGET(userId, achievementName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#getUserProgressForAchievementUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The user&#39;s id |
 **achievementName** | **String**| The achievement&#39;s name |

### Return type

[**UserAchievementGroupResource**](UserAchievementGroupResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserProgressUsingGET"></a>
# **getUserProgressUsingGET**
> PageResourceUserAchievementGroupResource getUserProgressUsingGET(userId, filterAchievementDerived, filterAchievementTagset, filterAchievementName, filterAchievementHidden, size, page)

Retrieve progress on achievements for a given user

Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
Integer userId = 56; // Integer | The user's id
Boolean filterAchievementDerived = true; // Boolean | Filter for achievements that are derived from other services
String filterAchievementTagset = "filterAchievementTagset_example"; // String | Filter for achievements with specified tags (separated by comma)
String filterAchievementName = "filterAchievementName_example"; // String | Filter for achievements whose name contains a string
Boolean filterAchievementHidden = true; // Boolean | Filter for achievements that are hidden or not
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUserAchievementGroupResource result = apiInstance.getUserProgressUsingGET(userId, filterAchievementDerived, filterAchievementTagset, filterAchievementName, filterAchievementHidden, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#getUserProgressUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The user&#39;s id |
 **filterAchievementDerived** | **Boolean**| Filter for achievements that are derived from other services | [optional]
 **filterAchievementTagset** | **String**| Filter for achievements with specified tags (separated by comma) | [optional]
 **filterAchievementName** | **String**| Filter for achievements whose name contains a string | [optional]
 **filterAchievementHidden** | **Boolean**| Filter for achievements that are hidden or not | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUserAchievementGroupResource**](PageResourceUserAchievementGroupResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAchievementUsingPUT"></a>
# **updateAchievementUsingPUT**
> updateAchievementUsingPUT(name, achievement)

Update an achievement definition

The existing generated rule, if any, will be deleted. A new rule will be created if a trigger event name is specified in the new version.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
String name = "name_example"; // String | The name of the achievement
AchievementDefinitionResource achievement = new AchievementDefinitionResource(); // AchievementDefinitionResource | The achievement definition
try {
    apiInstance.updateAchievementUsingPUT(name, achievement);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#updateAchievementUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the achievement |
 **achievement** | [**AchievementDefinitionResource**](AchievementDefinitionResource.md)| The achievement definition | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProgressUsingPUT"></a>
# **updateProgressUsingPUT**
> UserAchievementGroupResource updateProgressUsingPUT(userId, achievementName, request)

Update or create an achievement progress record for a user

If no progress record yet exists for the user, it will be created. Otherwise it will be updated. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
Integer userId = 56; // Integer | The user's id
String achievementName = "achievementName_example"; // String | The achievement's name
AchievementProgressUpdateRequest request = new AchievementProgressUpdateRequest(); // AchievementProgressUpdateRequest | The progress update details
try {
    UserAchievementGroupResource result = apiInstance.updateProgressUsingPUT(userId, achievementName, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#updateProgressUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The user&#39;s id |
 **achievementName** | **String**| The achievement&#39;s name |
 **request** | [**AchievementProgressUpdateRequest**](AchievementProgressUpdateRequest.md)| The progress update details | [optional]

### Return type

[**UserAchievementGroupResource**](UserAchievementGroupResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTemplateUsingPUT"></a>
# **updateTemplateUsingPUT**
> updateTemplateUsingPUT(id, template)

Update an achievement template

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationAchievementsApi;

GamificationAchievementsApi apiInstance = new GamificationAchievementsApi();
String id = "id_example"; // String | The id of the template
TemplateResource template = new TemplateResource(); // TemplateResource | The updated template
try {
    apiInstance.updateTemplateUsingPUT(id, template);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationAchievementsApi#updateTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **template** | [**TemplateResource**](TemplateResource.md)| The updated template | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

