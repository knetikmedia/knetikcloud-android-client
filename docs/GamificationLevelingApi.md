# GamificationLevelingApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeUserLevelExperienceUsingPUT**](GamificationLevelingApi.md#changeUserLevelExperienceUsingPUT) | **PUT** /users/{user_id}/leveling/{name} | Update or create a leveling progress record for a user
[**createLevelUsingPOST**](GamificationLevelingApi.md#createLevelUsingPOST) | **POST** /leveling | Create a level schema
[**deleteLevelUsingDELETE**](GamificationLevelingApi.md#deleteLevelUsingDELETE) | **DELETE** /leveling/{name} | Delete a level
[**getAvailableTriggersUsingGET1**](GamificationLevelingApi.md#getAvailableTriggersUsingGET1) | **GET** /leveling/triggers | Get the list of triggers that can be used to trigger a leveling progress update
[**getLevelUsingGET**](GamificationLevelingApi.md#getLevelUsingGET) | **GET** /leveling/{name} | Retrieve a particular level
[**getLevelsUsingGET**](GamificationLevelingApi.md#getLevelsUsingGET) | **GET** /leveling | List and search levels
[**getUserLevelUsingGET**](GamificationLevelingApi.md#getUserLevelUsingGET) | **GET** /users/{user_id}/leveling/{name} | Get a user&#39;s progress for a given level schema
[**getUserLevelsUsingGET**](GamificationLevelingApi.md#getUserLevelsUsingGET) | **GET** /users/{user_id}/leveling | Get a user&#39;s progress for all level schemas
[**updateLevelUsingPUT**](GamificationLevelingApi.md#updateLevelUsingPUT) | **PUT** /leveling/{name} | Update a level


<a name="changeUserLevelExperienceUsingPUT"></a>
# **changeUserLevelExperienceUsingPUT**
> changeUserLevelExperienceUsingPUT(userId, name, progress)

Update or create a leveling progress record for a user

If no progress record yet exists for the user, it will be created. Otherwise it will be updated. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLevelingApi;

GamificationLevelingApi apiInstance = new GamificationLevelingApi();
Integer userId = 56; // Integer | The id of the user
String name = "name_example"; // String | The level schema name
Integer progress = 56; // Integer | The current progress amount
try {
    apiInstance.changeUserLevelExperienceUsingPUT(userId, name, progress);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLevelingApi#changeUserLevelExperienceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **name** | **String**| The level schema name |
 **progress** | **Integer**| The current progress amount | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createLevelUsingPOST"></a>
# **createLevelUsingPOST**
> LevelingResource createLevelUsingPOST(level)

Create a level schema

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLevelingApi;

GamificationLevelingApi apiInstance = new GamificationLevelingApi();
LevelingResource level = new LevelingResource(); // LevelingResource | The level schema definition
try {
    LevelingResource result = apiInstance.createLevelUsingPOST(level);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLevelingApi#createLevelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **level** | [**LevelingResource**](LevelingResource.md)| The level schema definition | [optional]

### Return type

[**LevelingResource**](LevelingResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteLevelUsingDELETE"></a>
# **deleteLevelUsingDELETE**
> deleteLevelUsingDELETE(name)

Delete a level

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLevelingApi;

GamificationLevelingApi apiInstance = new GamificationLevelingApi();
String name = "name_example"; // String | The level schema name
try {
    apiInstance.deleteLevelUsingDELETE(name);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLevelingApi#deleteLevelUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The level schema name |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAvailableTriggersUsingGET1"></a>
# **getAvailableTriggersUsingGET1**
> List&lt;BreTriggerResource&gt; getAvailableTriggersUsingGET1()

Get the list of triggers that can be used to trigger a leveling progress update

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLevelingApi;

GamificationLevelingApi apiInstance = new GamificationLevelingApi();
try {
    List<BreTriggerResource> result = apiInstance.getAvailableTriggersUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLevelingApi#getAvailableTriggersUsingGET1");
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
 - **Accept**: */*

<a name="getLevelUsingGET"></a>
# **getLevelUsingGET**
> LevelingResource getLevelUsingGET(name)

Retrieve a particular level

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLevelingApi;

GamificationLevelingApi apiInstance = new GamificationLevelingApi();
String name = "name_example"; // String | The level schema name
try {
    LevelingResource result = apiInstance.getLevelUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLevelingApi#getLevelUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The level schema name |

### Return type

[**LevelingResource**](LevelingResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getLevelsUsingGET"></a>
# **getLevelsUsingGET**
> PageLevelingResource getLevelsUsingGET(filterName, size, page, order)

List and search levels

Get a list of levels schemas with optional filtering

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLevelingApi;

GamificationLevelingApi apiInstance = new GamificationLevelingApi();
String filterName = "filterName_example"; // String | Filter for level schemas whose name contains a given string
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "name:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageLevelingResource result = apiInstance.getLevelsUsingGET(filterName, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLevelingApi#getLevelsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterName** | **String**| Filter for level schemas whose name contains a given string | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to name:ASC]

### Return type

[**PageLevelingResource**](PageLevelingResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserLevelUsingGET"></a>
# **getUserLevelUsingGET**
> UserLevelingResource getUserLevelUsingGET(userId, name)

Get a user&#39;s progress for a given level schema

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLevelingApi;

GamificationLevelingApi apiInstance = new GamificationLevelingApi();
Integer userId = 56; // Integer | The id of the user
String name = "name_example"; // String | The level schema name
try {
    UserLevelingResource result = apiInstance.getUserLevelUsingGET(userId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLevelingApi#getUserLevelUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **name** | **String**| The level schema name |

### Return type

[**UserLevelingResource**](UserLevelingResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserLevelsUsingGET"></a>
# **getUserLevelsUsingGET**
> PageUserLevelingResource getUserLevelsUsingGET(userId)

Get a user&#39;s progress for all level schemas

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLevelingApi;

GamificationLevelingApi apiInstance = new GamificationLevelingApi();
Integer userId = 56; // Integer | The id of the user
try {
    PageUserLevelingResource result = apiInstance.getUserLevelsUsingGET(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLevelingApi#getUserLevelsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |

### Return type

[**PageUserLevelingResource**](PageUserLevelingResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateLevelUsingPUT"></a>
# **updateLevelUsingPUT**
> updateLevelUsingPUT(name, newLevel)

Update a level

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLevelingApi;

GamificationLevelingApi apiInstance = new GamificationLevelingApi();
String name = "name_example"; // String | The level schema name
LevelingResource newLevel = new LevelingResource(); // LevelingResource | The level schema definition
try {
    apiInstance.updateLevelUsingPUT(name, newLevel);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLevelingApi#updateLevelUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The level schema name |
 **newLevel** | [**LevelingResource**](LevelingResource.md)| The level schema definition | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

