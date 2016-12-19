# CampaignsRewardsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRewardSetUsingPOST**](CampaignsRewardsApi.md#createRewardSetUsingPOST) | **POST** /rewards | Create a reward set
[**deleteRewardSetUsingDELETE**](CampaignsRewardsApi.md#deleteRewardSetUsingDELETE) | **DELETE** /rewards/{id} | Delete a reward set
[**getRewardSetUsingGET**](CampaignsRewardsApi.md#getRewardSetUsingGET) | **GET** /rewards/{id} | Get a single reward set
[**getRewardSetsUsingGET**](CampaignsRewardsApi.md#getRewardSetsUsingGET) | **GET** /rewards | List and search reward sets
[**updateRewardSetUsingPUT**](CampaignsRewardsApi.md#updateRewardSetUsingPUT) | **PUT** /rewards/{id} | Update a reward set


<a name="createRewardSetUsingPOST"></a>
# **createRewardSetUsingPOST**
> RewardSetResource createRewardSetUsingPOST(rewardSetResource)

Create a reward set

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsRewardsApi;

CampaignsRewardsApi apiInstance = new CampaignsRewardsApi();
RewardSetResource rewardSetResource = new RewardSetResource(); // RewardSetResource | The reward set resource object
try {
    RewardSetResource result = apiInstance.createRewardSetUsingPOST(rewardSetResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsRewardsApi#createRewardSetUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rewardSetResource** | [**RewardSetResource**](RewardSetResource.md)| The reward set resource object | [optional]

### Return type

[**RewardSetResource**](RewardSetResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteRewardSetUsingDELETE"></a>
# **deleteRewardSetUsingDELETE**
> deleteRewardSetUsingDELETE(id)

Delete a reward set

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsRewardsApi;

CampaignsRewardsApi apiInstance = new CampaignsRewardsApi();
Integer id = 56; // Integer | The reward id
try {
    apiInstance.deleteRewardSetUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsRewardsApi#deleteRewardSetUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The reward id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getRewardSetUsingGET"></a>
# **getRewardSetUsingGET**
> RewardSetResource getRewardSetUsingGET(id)

Get a single reward set

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsRewardsApi;

CampaignsRewardsApi apiInstance = new CampaignsRewardsApi();
Integer id = 56; // Integer | The reward id
try {
    RewardSetResource result = apiInstance.getRewardSetUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsRewardsApi#getRewardSetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The reward id |

### Return type

[**RewardSetResource**](RewardSetResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getRewardSetsUsingGET"></a>
# **getRewardSetsUsingGET**
> PageRewardSetResource getRewardSetsUsingGET(size, page, order)

List and search reward sets

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsRewardsApi;

CampaignsRewardsApi apiInstance = new CampaignsRewardsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "1"; // String | a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageRewardSetResource result = apiInstance.getRewardSetsUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsRewardsApi#getRewardSetsUsingGET");
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

[**PageRewardSetResource**](PageRewardSetResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateRewardSetUsingPUT"></a>
# **updateRewardSetUsingPUT**
> updateRewardSetUsingPUT(id, rewardSetResource)

Update a reward set

### Example
```java
// Import classes:
//import io.swagger.client.api.CampaignsRewardsApi;

CampaignsRewardsApi apiInstance = new CampaignsRewardsApi();
Integer id = 56; // Integer | The reward id
RewardSetResource rewardSetResource = new RewardSetResource(); // RewardSetResource | The reward set resource object
try {
    apiInstance.updateRewardSetUsingPUT(id, rewardSetResource);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsRewardsApi#updateRewardSetUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The reward id |
 **rewardSetResource** | [**RewardSetResource**](RewardSetResource.md)| The reward set resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

