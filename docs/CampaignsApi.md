# CampaignsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addChallengesUsingPOST**](CampaignsApi.md#addChallengesUsingPOST) | **POST** /campaigns/{id}/challenges | Add a challenge to a campaign
[**createCampaignTemplateUsingPOST**](CampaignsApi.md#createCampaignTemplateUsingPOST) | **POST** /campaigns/templates | Create a campaign template
[**createCampaignUsingPOST**](CampaignsApi.md#createCampaignUsingPOST) | **POST** /campaigns | Create a campaign
[**deleteCampaignTemplateUsingDELETE**](CampaignsApi.md#deleteCampaignTemplateUsingDELETE) | **DELETE** /campaigns/templates/{id} | Delete a campaign template
[**deleteCampaignUsingDELETE**](CampaignsApi.md#deleteCampaignUsingDELETE) | **DELETE** /campaigns/{id} | Delete a campaign
[**getCampaignTemplateUsingGET**](CampaignsApi.md#getCampaignTemplateUsingGET) | **GET** /campaigns/templates/{id} | Get a single campaign template
[**getCampaignTemplatesUsingGET**](CampaignsApi.md#getCampaignTemplatesUsingGET) | **GET** /campaigns/templates | List and search campaign templates
[**getCampaignUsingGET**](CampaignsApi.md#getCampaignUsingGET) | **GET** /campaigns/{id} | Returns a single campaign
[**getCampaignsUsingGET**](CampaignsApi.md#getCampaignsUsingGET) | **GET** /campaigns | List and search campaigns
[**getChallengesUsingGET**](CampaignsApi.md#getChallengesUsingGET) | **GET** /campaigns/{id}/challenges | List the challenges associated with a campaign
[**removeChallengeUsingDELETE**](CampaignsApi.md#removeChallengeUsingDELETE) | **DELETE** /campaigns/{campaign_id}/challenges/{id} | Remove a challenge from a campaign
[**updateCampaignTemplateUsingPUT**](CampaignsApi.md#updateCampaignTemplateUsingPUT) | **PUT** /campaigns/templates/{id} | Update an campaign template
[**updateCampaignUsingPUT**](CampaignsApi.md#updateCampaignUsingPUT) | **PUT** /campaigns/{id} | Update a campaign


<a name="addChallengesUsingPOST"></a>
# **addChallengesUsingPOST**
> addChallengesUsingPOST(id, challengeId)

Add a challenge to a campaign

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
Long id = 789L; // Long | The id of the campaign
Long challengeId = 789L; // Long | The id of the challenge
try {
    apiInstance.addChallengesUsingPOST(id, challengeId);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#addChallengesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the campaign |
 **challengeId** | **Long**| The id of the challenge | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCampaignTemplateUsingPOST"></a>
# **createCampaignTemplateUsingPOST**
> TemplateResource createCampaignTemplateUsingPOST(campaignTemplateResource)

Create a campaign template

Campaign Templates define a type of campaign and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
TemplateResource campaignTemplateResource = new TemplateResource(); // TemplateResource | The campaign template resource object
try {
    TemplateResource result = apiInstance.createCampaignTemplateUsingPOST(campaignTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#createCampaignTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignTemplateResource** | [**TemplateResource**](TemplateResource.md)| The campaign template resource object | [optional]

### Return type

[**TemplateResource**](TemplateResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCampaignUsingPOST"></a>
# **createCampaignUsingPOST**
> CampaignResource createCampaignUsingPOST(campaignResource)

Create a campaign

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
CampaignResource campaignResource = new CampaignResource(); // CampaignResource | The campaign resource object
try {
    CampaignResource result = apiInstance.createCampaignUsingPOST(campaignResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#createCampaignUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignResource** | [**CampaignResource**](CampaignResource.md)| The campaign resource object | [optional]

### Return type

[**CampaignResource**](CampaignResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCampaignTemplateUsingDELETE"></a>
# **deleteCampaignTemplateUsingDELETE**
> deleteCampaignTemplateUsingDELETE(id, cascade)

Delete a campaign template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deleteCampaignTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#deleteCampaignTemplateUsingDELETE");
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

<a name="deleteCampaignUsingDELETE"></a>
# **deleteCampaignUsingDELETE**
> deleteCampaignUsingDELETE(id)

Delete a campaign

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
Long id = 789L; // Long | The campaign id
try {
    apiInstance.deleteCampaignUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#deleteCampaignUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The campaign id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignTemplateUsingGET"></a>
# **getCampaignTemplateUsingGET**
> TemplateResource getCampaignTemplateUsingGET(id)

Get a single campaign template

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | The id of the template
try {
    TemplateResource result = apiInstance.getCampaignTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignTemplateUsingGET");
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

<a name="getCampaignTemplatesUsingGET"></a>
# **getCampaignTemplatesUsingGET**
> PageResourceTemplateResource getCampaignTemplatesUsingGET(size, page, order)

List and search campaign templates

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceTemplateResource result = apiInstance.getCampaignTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignTemplatesUsingGET");
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

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignUsingGET"></a>
# **getCampaignUsingGET**
> CampaignResource getCampaignUsingGET(id)

Returns a single campaign

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
Long id = 789L; // Long | The campaign id
try {
    CampaignResource result = apiInstance.getCampaignUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The campaign id |

### Return type

[**CampaignResource**](CampaignResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignsUsingGET"></a>
# **getCampaignsUsingGET**
> PageResourceCampaignResource getCampaignsUsingGET(filterActive, size, page, order)

List and search campaigns

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
Boolean filterActive = true; // Boolean | Filter for campaigns that are active
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceCampaignResource result = apiInstance.getCampaignsUsingGET(filterActive, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterActive** | **Boolean**| Filter for campaigns that are active | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceCampaignResource**](PageResourceCampaignResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChallengesUsingGET"></a>
# **getChallengesUsingGET**
> PageResourceChallengeResource getChallengesUsingGET(id)

List the challenges associated with a campaign

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
Long id = 789L; // Long | The campaign id
try {
    PageResourceChallengeResource result = apiInstance.getChallengesUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getChallengesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The campaign id |

### Return type

[**PageResourceChallengeResource**](PageResourceChallengeResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeChallengeUsingDELETE"></a>
# **removeChallengeUsingDELETE**
> removeChallengeUsingDELETE(campaignId, id)

Remove a challenge from a campaign

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
Long campaignId = 789L; // Long | The campaign id
Long id = 789L; // Long | The challenge id
try {
    apiInstance.removeChallengeUsingDELETE(campaignId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#removeChallengeUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| The campaign id |
 **id** | **Long**| The challenge id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCampaignTemplateUsingPUT"></a>
# **updateCampaignTemplateUsingPUT**
> updateCampaignTemplateUsingPUT(id, campaignTemplateResource)

Update an campaign template

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | The id of the template
TemplateResource campaignTemplateResource = new TemplateResource(); // TemplateResource | The campaign template resource object
try {
    apiInstance.updateCampaignTemplateUsingPUT(id, campaignTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#updateCampaignTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **campaignTemplateResource** | [**TemplateResource**](TemplateResource.md)| The campaign template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCampaignUsingPUT"></a>
# **updateCampaignUsingPUT**
> updateCampaignUsingPUT(id, campaignResource)

Update a campaign

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsApi;

CampaignsApi apiInstance = new CampaignsApi();
Long id = 789L; // Long | The campaign id
CampaignResource campaignResource = new CampaignResource(); // CampaignResource | The campaign resource object
try {
    apiInstance.updateCampaignUsingPUT(id, campaignResource);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#updateCampaignUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The campaign id |
 **campaignResource** | [**CampaignResource**](CampaignResource.md)| The campaign resource object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

