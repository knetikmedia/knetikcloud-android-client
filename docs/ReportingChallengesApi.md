# ReportingChallengesApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChallengeEventLeaderboard**](ReportingChallengesApi.md#getChallengeEventLeaderboard) | **GET** /reporting/events/leaderboard | Retrieve a challenge event leaderboard details
[**getChallengeEventParticipants**](ReportingChallengesApi.md#getChallengeEventParticipants) | **GET** /reporting/events/participants | Retrieve a challenge event participant details


<a name="getChallengeEventLeaderboard"></a>
# **getChallengeEventLeaderboard**
> PageResourceChallengeEventParticipantResource getChallengeEventLeaderboard(filterEvent, size, page, order)

Retrieve a challenge event leaderboard details

Lists all leaderboard entries with additional user details

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.ReportingChallengesApi;


ReportingChallengesApi apiInstance = new ReportingChallengesApi();
Long filterEvent = 789L; // Long | A sepecific challenge event id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "order_example"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceChallengeEventParticipantResource result = apiInstance.getChallengeEventLeaderboard(filterEvent, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingChallengesApi#getChallengeEventLeaderboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterEvent** | **Long**| A sepecific challenge event id | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional]

### Return type

[**PageResourceChallengeEventParticipantResource**](PageResourceChallengeEventParticipantResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChallengeEventParticipants"></a>
# **getChallengeEventParticipants**
> PageResourceChallengeEventParticipantResource getChallengeEventParticipants(filterEvent, size, page, order)

Retrieve a challenge event participant details

Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.ReportingChallengesApi;


ReportingChallengesApi apiInstance = new ReportingChallengesApi();
Long filterEvent = 789L; // Long | A sepecific challenge event id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "order_example"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceChallengeEventParticipantResource result = apiInstance.getChallengeEventParticipants(filterEvent, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingChallengesApi#getChallengeEventParticipants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterEvent** | **Long**| A sepecific challenge event id | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional]

### Return type

[**PageResourceChallengeEventParticipantResource**](PageResourceChallengeEventParticipantResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

