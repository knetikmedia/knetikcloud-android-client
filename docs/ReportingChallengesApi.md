# ReportingChallengesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChallengeEventLeaderboardUsingGET**](ReportingChallengesApi.md#getChallengeEventLeaderboardUsingGET) | **GET** /reporting/events/leaderboard | Retrieve a challenge event leaderboard details
[**getChallengeEventParticipantsUsingGET**](ReportingChallengesApi.md#getChallengeEventParticipantsUsingGET) | **GET** /reporting/events/participants | Retrieve a challenge event participant details


<a name="getChallengeEventLeaderboardUsingGET"></a>
# **getChallengeEventLeaderboardUsingGET**
> PageResourceChallengeEventParticipantResource getChallengeEventLeaderboardUsingGET(filterEvent)

Retrieve a challenge event leaderboard details

Lists all leaderboard entries with additional user details

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingChallengesApi;

ReportingChallengesApi apiInstance = new ReportingChallengesApi();
Long filterEvent = 789L; // Long | A sepecific challenge event id
try {
    PageResourceChallengeEventParticipantResource result = apiInstance.getChallengeEventLeaderboardUsingGET(filterEvent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingChallengesApi#getChallengeEventLeaderboardUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterEvent** | **Long**| A sepecific challenge event id | [optional]

### Return type

[**PageResourceChallengeEventParticipantResource**](PageResourceChallengeEventParticipantResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChallengeEventParticipantsUsingGET"></a>
# **getChallengeEventParticipantsUsingGET**
> PageResourceChallengeEventParticipantResource getChallengeEventParticipantsUsingGET(filterEvent)

Retrieve a challenge event participant details

Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportingChallengesApi;

ReportingChallengesApi apiInstance = new ReportingChallengesApi();
Long filterEvent = 789L; // Long | A sepecific challenge event id
try {
    PageResourceChallengeEventParticipantResource result = apiInstance.getChallengeEventParticipantsUsingGET(filterEvent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingChallengesApi#getChallengeEventParticipantsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterEvent** | **Long**| A sepecific challenge event id | [optional]

### Return type

[**PageResourceChallengeEventParticipantResource**](PageResourceChallengeEventParticipantResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

