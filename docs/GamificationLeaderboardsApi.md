# GamificationLeaderboardsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLeaderboardUsingGET**](GamificationLeaderboardsApi.md#getLeaderboardUsingGET) | **GET** /leaderboards/{context_type}/{context_id} | Retrieves leaderboard details and paginated entries
[**getStrategiesUsingGET**](GamificationLeaderboardsApi.md#getStrategiesUsingGET) | **GET** /leaderboards/strategies | Get a list of available leaderboard strategy names
[**getUserRankUsingGET**](GamificationLeaderboardsApi.md#getUserRankUsingGET) | **GET** /leaderboards/{context_type}/{context_id}/users/{id}/rank | Retrieves a specific user entry with rank


<a name="getLeaderboardUsingGET"></a>
# **getLeaderboardUsingGET**
> LeaderboardResource getLeaderboardUsingGET(contextType, contextId, size, page)

Retrieves leaderboard details and paginated entries

The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLeaderboardsApi;

GamificationLeaderboardsApi apiInstance = new GamificationLeaderboardsApi();
String contextType = "contextType_example"; // String | The context type for the leaderboard
String contextId = "contextId_example"; // String | The context id for the leaderboard
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    LeaderboardResource result = apiInstance.getLeaderboardUsingGET(contextType, contextId, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLeaderboardsApi#getLeaderboardUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextType** | **String**| The context type for the leaderboard |
 **contextId** | **String**| The context id for the leaderboard |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**LeaderboardResource**](LeaderboardResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStrategiesUsingGET"></a>
# **getStrategiesUsingGET**
> List&lt;String&gt; getStrategiesUsingGET()

Get a list of available leaderboard strategy names

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLeaderboardsApi;

GamificationLeaderboardsApi apiInstance = new GamificationLeaderboardsApi();
try {
    List<String> result = apiInstance.getStrategiesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLeaderboardsApi#getStrategiesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserRankUsingGET"></a>
# **getUserRankUsingGET**
> LeaderboardEntryResource getUserRankUsingGET(contextType, contextId, id)

Retrieves a specific user entry with rank

The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationLeaderboardsApi;

GamificationLeaderboardsApi apiInstance = new GamificationLeaderboardsApi();
String contextType = "contextType_example"; // String | The context type for the leaderboard
String contextId = "contextId_example"; // String | The context id for the leaderboard
String id = "id_example"; // String | The id of a user
try {
    LeaderboardEntryResource result = apiInstance.getUserRankUsingGET(contextType, contextId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationLeaderboardsApi#getUserRankUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextType** | **String**| The context type for the leaderboard |
 **contextId** | **String**| The context id for the leaderboard |
 **id** | **String**| The id of a user |

### Return type

[**LeaderboardEntryResource**](LeaderboardEntryResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

