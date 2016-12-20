# CampaignsChallengesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChallengeActivityUsingPOST**](CampaignsChallengesApi.md#createChallengeActivityUsingPOST) | **POST** /challenges/{challenge_id}/activities | Create a challenge activity
[**createChallengeTemplateUsingPOST**](CampaignsChallengesApi.md#createChallengeTemplateUsingPOST) | **POST** /challenges/templates | Create a challenge template
[**createChallengeUsingPOST**](CampaignsChallengesApi.md#createChallengeUsingPOST) | **POST** /challenges | Create a challenge
[**deleteChallengeActivityUsingDELETE**](CampaignsChallengesApi.md#deleteChallengeActivityUsingDELETE) | **DELETE** /challenges/{challenge_id}/activities/{activity_id} | Delete a challenge activity
[**deleteChallengeEventUsingDELETE**](CampaignsChallengesApi.md#deleteChallengeEventUsingDELETE) | **DELETE** /challenges/events/{id} | Delete a challenge event
[**deleteChallengeTemplateUsingDELETE**](CampaignsChallengesApi.md#deleteChallengeTemplateUsingDELETE) | **DELETE** /challenges/templates/{id} | Delete a challenge template
[**deleteChallengeUsingDELETE**](CampaignsChallengesApi.md#deleteChallengeUsingDELETE) | **DELETE** /challenges/{id} | Delete a challenge
[**getActivitiesUsingGET1**](CampaignsChallengesApi.md#getActivitiesUsingGET1) | **GET** /challenges/{challenge_id}/activities | List and search challenge activities
[**getChallengeActivityUsingGET**](CampaignsChallengesApi.md#getChallengeActivityUsingGET) | **GET** /challenges/{challenge_id}/activities/{activity_id} | Get a single challenge activity
[**getChallengeEventUsingGET**](CampaignsChallengesApi.md#getChallengeEventUsingGET) | **GET** /challenges/events/{id} | Retrieve a single challenge event details
[**getChallengeEventssUsingGET**](CampaignsChallengesApi.md#getChallengeEventssUsingGET) | **GET** /challenges/events | Retrieve a list of challenge events
[**getChallengeTemplateUsingGET**](CampaignsChallengesApi.md#getChallengeTemplateUsingGET) | **GET** /challenges/templates/{id} | Get a single challenge template
[**getChallengeTemplatesUsingGET**](CampaignsChallengesApi.md#getChallengeTemplatesUsingGET) | **GET** /challenges/templates | List and search challenge templates
[**getChallengeUsingGET**](CampaignsChallengesApi.md#getChallengeUsingGET) | **GET** /challenges/{id} | Retrieve a single challenge details
[**getChallengesUsingGET1**](CampaignsChallengesApi.md#getChallengesUsingGET1) | **GET** /challenges | Retrieve a list of challenges
[**updateChallengeActivityUsingPUT**](CampaignsChallengesApi.md#updateChallengeActivityUsingPUT) | **PUT** /challenges/{challenge_id}/activities/{activity_id} | Update a challenge activity
[**updateChallengeTemplateUsingPUT**](CampaignsChallengesApi.md#updateChallengeTemplateUsingPUT) | **PUT** /challenges/templates/{id} | Update a challenge template
[**updateChallengeUsingPUT**](CampaignsChallengesApi.md#updateChallengeUsingPUT) | **PUT** /challenges/{id} | Update a challenge&#39;s information


<a name="createChallengeActivityUsingPOST"></a>
# **createChallengeActivityUsingPOST**
> ChallengeActivityResource createChallengeActivityUsingPOST(challengeId, challengeActivityResource, validateSettings)

Create a challenge activity

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Long challengeId = 789L; // Long | The challenge id
ChallengeActivityResource challengeActivityResource = new ChallengeActivityResource(); // ChallengeActivityResource | The challenge activity resource object
Boolean validateSettings = false; // Boolean | Whether to validate the settings being sent against the available settings on the base activity.
try {
    ChallengeActivityResource result = apiInstance.createChallengeActivityUsingPOST(challengeId, challengeActivityResource, validateSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#createChallengeActivityUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **challengeId** | **Long**| The challenge id |
 **challengeActivityResource** | [**ChallengeActivityResource**](ChallengeActivityResource.md)| The challenge activity resource object | [optional]
 **validateSettings** | **Boolean**| Whether to validate the settings being sent against the available settings on the base activity. | [optional] [default to false]

### Return type

[**ChallengeActivityResource**](ChallengeActivityResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createChallengeTemplateUsingPOST"></a>
# **createChallengeTemplateUsingPOST**
> TemplateResource createChallengeTemplateUsingPOST(challengeTemplateResource)

Create a challenge template

Challenge Templates define a type of challenge and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
TemplateResource challengeTemplateResource = new TemplateResource(); // TemplateResource | The challenge template resource object
try {
    TemplateResource result = apiInstance.createChallengeTemplateUsingPOST(challengeTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#createChallengeTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **challengeTemplateResource** | [**TemplateResource**](TemplateResource.md)| The challenge template resource object | [optional]

### Return type

[**TemplateResource**](TemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createChallengeUsingPOST"></a>
# **createChallengeUsingPOST**
> ChallengeResource createChallengeUsingPOST(challengeResource)

Create a challenge

Challenges do not run on their own.  They must be added to a campaign before events will spawn.

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
ChallengeResource challengeResource = new ChallengeResource(); // ChallengeResource | The challenge resource object
try {
    ChallengeResource result = apiInstance.createChallengeUsingPOST(challengeResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#createChallengeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **challengeResource** | [**ChallengeResource**](ChallengeResource.md)| The challenge resource object | [optional]

### Return type

[**ChallengeResource**](ChallengeResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteChallengeActivityUsingDELETE"></a>
# **deleteChallengeActivityUsingDELETE**
> deleteChallengeActivityUsingDELETE(activityId, challengeId)

Delete a challenge activity

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Long activityId = 789L; // Long | The activity id
Long challengeId = 789L; // Long | The challenge id
try {
    apiInstance.deleteChallengeActivityUsingDELETE(activityId, challengeId);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#deleteChallengeActivityUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityId** | **Long**| The activity id |
 **challengeId** | **Long**| The challenge id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteChallengeEventUsingDELETE"></a>
# **deleteChallengeEventUsingDELETE**
> deleteChallengeEventUsingDELETE(id)

Delete a challenge event

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Long id = 789L; // Long | The challenge event id
try {
    apiInstance.deleteChallengeEventUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#deleteChallengeEventUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The challenge event id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteChallengeTemplateUsingDELETE"></a>
# **deleteChallengeTemplateUsingDELETE**
> deleteChallengeTemplateUsingDELETE(id, cascade)

Delete a challenge template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deleteChallengeTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#deleteChallengeTemplateUsingDELETE");
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

<a name="deleteChallengeUsingDELETE"></a>
# **deleteChallengeUsingDELETE**
> deleteChallengeUsingDELETE(id)

Delete a challenge

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Long id = 789L; // Long | The challenge id
try {
    apiInstance.deleteChallengeUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#deleteChallengeUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The challenge id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getActivitiesUsingGET1"></a>
# **getActivitiesUsingGET1**
> PageBareChallengeActivityResource getActivitiesUsingGET1(challengeId, size, page, order)

List and search challenge activities

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Long challengeId = 789L; // Long | The challenge id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageBareChallengeActivityResource result = apiInstance.getActivitiesUsingGET1(challengeId, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#getActivitiesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **challengeId** | **Long**| The challenge id |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageBareChallengeActivityResource**](PageBareChallengeActivityResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getChallengeActivityUsingGET"></a>
# **getChallengeActivityUsingGET**
> ChallengeActivityResource getChallengeActivityUsingGET(activityId)

Get a single challenge activity

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Long activityId = 789L; // Long | The activity id
try {
    ChallengeActivityResource result = apiInstance.getChallengeActivityUsingGET(activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#getChallengeActivityUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityId** | **Long**| The activity id |

### Return type

[**ChallengeActivityResource**](ChallengeActivityResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getChallengeEventUsingGET"></a>
# **getChallengeEventUsingGET**
> ChallengeEventResource getChallengeEventUsingGET(id)

Retrieve a single challenge event details

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Long id = 789L; // Long | The challenge event id
try {
    ChallengeEventResource result = apiInstance.getChallengeEventUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#getChallengeEventUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The challenge event id |

### Return type

[**ChallengeEventResource**](ChallengeEventResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getChallengeEventssUsingGET"></a>
# **getChallengeEventssUsingGET**
> PageChallengeEventResource getChallengeEventssUsingGET(filterStartDate, filterEndDate, filterCampaigns, filterChallenge, size, page, order)

Retrieve a list of challenge events

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
String filterStartDate = "filterStartDate_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the event start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE).
String filterEndDate = "filterEndDate_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the event end date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE).
Boolean filterCampaigns = true; // Boolean | check only for events from currently running campaigns
Long filterChallenge = 789L; // Long | check only for events from the challenge specified by id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageChallengeEventResource result = apiInstance.getChallengeEventssUsingGET(filterStartDate, filterEndDate, filterCampaigns, filterChallenge, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#getChallengeEventssUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStartDate** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the event start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). | [optional]
 **filterEndDate** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the event end date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). | [optional]
 **filterCampaigns** | **Boolean**| check only for events from currently running campaigns | [optional]
 **filterChallenge** | **Long**| check only for events from the challenge specified by id | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageChallengeEventResource**](PageChallengeEventResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getChallengeTemplateUsingGET"></a>
# **getChallengeTemplateUsingGET**
> TemplateResource getChallengeTemplateUsingGET(id)

Get a single challenge template

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
String id = "id_example"; // String | The id of the template
try {
    TemplateResource result = apiInstance.getChallengeTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#getChallengeTemplateUsingGET");
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

<a name="getChallengeTemplatesUsingGET"></a>
# **getChallengeTemplatesUsingGET**
> PageTemplateResource getChallengeTemplatesUsingGET(size, page, order)

List and search challenge templates

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageTemplateResource result = apiInstance.getChallengeTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#getChallengeTemplatesUsingGET");
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

[**PageTemplateResource**](PageTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getChallengeUsingGET"></a>
# **getChallengeUsingGET**
> ChallengeResource getChallengeUsingGET(id)

Retrieve a single challenge details

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Long id = 789L; // Long | The challenge id
try {
    ChallengeResource result = apiInstance.getChallengeUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#getChallengeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The challenge id |

### Return type

[**ChallengeResource**](ChallengeResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getChallengesUsingGET1"></a>
# **getChallengesUsingGET1**
> PageChallengeResource getChallengesUsingGET1(filterTemplate, filterActiveCampaign)

Retrieve a list of challenges

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Boolean filterTemplate = true; // Boolean | Filter for challenges that are not tied to campaigns (templates)
Boolean filterActiveCampaign = true; // Boolean | Filter for challenges that are tied to active campaigns
try {
    PageChallengeResource result = apiInstance.getChallengesUsingGET1(filterTemplate, filterActiveCampaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#getChallengesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterTemplate** | **Boolean**| Filter for challenges that are not tied to campaigns (templates) | [optional]
 **filterActiveCampaign** | **Boolean**| Filter for challenges that are tied to active campaigns | [optional]

### Return type

[**PageChallengeResource**](PageChallengeResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateChallengeActivityUsingPUT"></a>
# **updateChallengeActivityUsingPUT**
> updateChallengeActivityUsingPUT(activityId, challengeId, challengeActivityResource)

Update a challenge activity

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Long activityId = 789L; // Long | The activity id
Long challengeId = 789L; // Long | The challenge id
ChallengeActivityResource challengeActivityResource = new ChallengeActivityResource(); // ChallengeActivityResource | The challenge activity resource object
try {
    apiInstance.updateChallengeActivityUsingPUT(activityId, challengeId, challengeActivityResource);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#updateChallengeActivityUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityId** | **Long**| The activity id |
 **challengeId** | **Long**| The challenge id |
 **challengeActivityResource** | [**ChallengeActivityResource**](ChallengeActivityResource.md)| The challenge activity resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateChallengeTemplateUsingPUT"></a>
# **updateChallengeTemplateUsingPUT**
> updateChallengeTemplateUsingPUT(id, challengeTemplateResource)

Update a challenge template

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
String id = "id_example"; // String | The id of the template
TemplateResource challengeTemplateResource = new TemplateResource(); // TemplateResource | The challenge template resource object
try {
    apiInstance.updateChallengeTemplateUsingPUT(id, challengeTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#updateChallengeTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **challengeTemplateResource** | [**TemplateResource**](TemplateResource.md)| The challenge template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateChallengeUsingPUT"></a>
# **updateChallengeUsingPUT**
> ChallengeResource updateChallengeUsingPUT(id, challengeResource)

Update a challenge&#39;s information

If the challenge is a copy, changes will propagate to all the related challenges

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsChallengesApi;

CampaignsChallengesApi apiInstance = new CampaignsChallengesApi();
Long id = 789L; // Long | The challenge id
ChallengeResource challengeResource = new ChallengeResource(); // ChallengeResource | The challenge resource object
try {
    ChallengeResource result = apiInstance.updateChallengeUsingPUT(id, challengeResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsChallengesApi#updateChallengeUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The challenge id |
 **challengeResource** | [**ChallengeResource**](ChallengeResource.md)| The challenge resource object | [optional]

### Return type

[**ChallengeResource**](ChallengeResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

