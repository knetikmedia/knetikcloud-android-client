# LogsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserLogUsingPOST**](LogsApi.md#addUserLogUsingPOST) | **POST** /audit/logs | Add a new user log entry
[**getEventLogUsingGET**](LogsApi.md#getEventLogUsingGET) | **GET** /bre/logs/event-log/{id} | Get an existing BRE event log entry by id
[**getEventsLogsUsingGET**](LogsApi.md#getEventsLogsUsingGET) | **GET** /bre/logs/event-log | Returns a list of BRE event log entries
[**getForwardLogUsingGET**](LogsApi.md#getForwardLogUsingGET) | **GET** /bre/logs/forward-log/{id} | Get an existing forward log entry by id
[**getForwardLogsUsingGET**](LogsApi.md#getForwardLogsUsingGET) | **GET** /bre/logs/forward-log | Returns a list of forward log entries
[**getUserLogsUsingGET**](LogsApi.md#getUserLogsUsingGET) | **GET** /audit/logs/{id} | Returns a user log entry by id
[**getUserLogsUsingGET1**](LogsApi.md#getUserLogsUsingGET1) | **GET** /audit/logs | Returns a page of user logs entries


<a name="addUserLogUsingPOST"></a>
# **addUserLogUsingPOST**
> addUserLogUsingPOST(logEntry)

Add a new user log entry

### Example
```java
// Import classes:
//import io.swagger.client.api.LogsApi;

LogsApi apiInstance = new LogsApi();
UserActionLog logEntry = new UserActionLog(); // UserActionLog | The user log entry to be added
try {
    apiInstance.addUserLogUsingPOST(logEntry);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#addUserLogUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logEntry** | [**UserActionLog**](UserActionLog.md)| The user log entry to be added | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getEventLogUsingGET"></a>
# **getEventLogUsingGET**
> BreEventLog getEventLogUsingGET(id)

Get an existing BRE event log entry by id

### Example
```java
// Import classes:
//import io.swagger.client.api.LogsApi;

LogsApi apiInstance = new LogsApi();
String id = "id_example"; // String | The BRE event log entry id
try {
    BreEventLog result = apiInstance.getEventLogUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getEventLogUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The BRE event log entry id |

### Return type

[**BreEventLog**](BreEventLog.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getEventsLogsUsingGET"></a>
# **getEventsLogsUsingGET**
> PageBreEventLog getEventsLogsUsingGET(filterStartDate, filterEventName, size, page, order)

Returns a list of BRE event log entries

### Example
```java
// Import classes:
//import io.swagger.client.api.LogsApi;

LogsApi apiInstance = new LogsApi();
String filterStartDate = "filterStartDate_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the event log start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE).
String filterEventName = "filterEventName_example"; // String | Filter event logs by event name
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:DESC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageBreEventLog result = apiInstance.getEventsLogsUsingGET(filterStartDate, filterEventName, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getEventsLogsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStartDate** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the event log start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). | [optional]
 **filterEventName** | **String**| Filter event logs by event name | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:DESC]

### Return type

[**PageBreEventLog**](PageBreEventLog.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getForwardLogUsingGET"></a>
# **getForwardLogUsingGET**
> ForwardLog getForwardLogUsingGET(id)

Get an existing forward log entry by id

### Example
```java
// Import classes:
//import io.swagger.client.api.LogsApi;

LogsApi apiInstance = new LogsApi();
String id = "id_example"; // String | The forward log entry id
try {
    ForwardLog result = apiInstance.getForwardLogUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getForwardLogUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The forward log entry id |

### Return type

[**ForwardLog**](ForwardLog.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getForwardLogsUsingGET"></a>
# **getForwardLogsUsingGET**
> PageForwardLog getForwardLogsUsingGET(filterStartDate, filterEndDate, filterStatusCode, size, page, order)

Returns a list of forward log entries

### Example
```java
// Import classes:
//import io.swagger.client.api.LogsApi;

LogsApi apiInstance = new LogsApi();
String filterStartDate = "filterStartDate_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the log start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE).
String filterEndDate = "filterEndDate_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the log end date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE).
Integer filterStatusCode = 56; // Integer | Filter forward logs by http status code
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:DESC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageForwardLog result = apiInstance.getForwardLogsUsingGET(filterStartDate, filterEndDate, filterStatusCode, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getForwardLogsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStartDate** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the log start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). | [optional]
 **filterEndDate** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the log end date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). | [optional]
 **filterStatusCode** | **Integer**| Filter forward logs by http status code | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:DESC]

### Return type

[**PageForwardLog**](PageForwardLog.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserLogsUsingGET"></a>
# **getUserLogsUsingGET**
> UserActionLog getUserLogsUsingGET(id)

Returns a user log entry by id

### Example
```java
// Import classes:
//import io.swagger.client.api.LogsApi;

LogsApi apiInstance = new LogsApi();
String id = "id_example"; // String | The user log entry id
try {
    UserActionLog result = apiInstance.getUserLogsUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getUserLogsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user log entry id |

### Return type

[**UserActionLog**](UserActionLog.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserLogsUsingGET1"></a>
# **getUserLogsUsingGET1**
> PageUserActionLog getUserLogsUsingGET1(filterUser, filterActionName, size, page)

Returns a page of user logs entries

### Example
```java
// Import classes:
//import io.swagger.client.api.LogsApi;

LogsApi apiInstance = new LogsApi();
Integer filterUser = 56; // Integer | Filter for actions taken by a specific user by id
String filterActionName = "filterActionName_example"; // String | Filter for actions of a specific name
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageUserActionLog result = apiInstance.getUserLogsUsingGET1(filterUser, filterActionName, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getUserLogsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterUser** | **Integer**| Filter for actions taken by a specific user by id | [optional]
 **filterActionName** | **String**| Filter for actions of a specific name | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageUserActionLog**](PageUserActionLog.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

