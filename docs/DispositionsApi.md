# DispositionsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDispositionUsingPOST**](DispositionsApi.md#addDispositionUsingPOST) | **POST** /dispositions | Add a new disposition. 
[**deleteDispositionUsingDELETE**](DispositionsApi.md#deleteDispositionUsingDELETE) | **DELETE** /dispositions/{id} | Delete a disposition
[**getDispositionCountUsingGET**](DispositionsApi.md#getDispositionCountUsingGET) | **GET** /dispositions/count | Returns a list of disposition counts
[**getDispositionUsingGET**](DispositionsApi.md#getDispositionUsingGET) | **GET** /dispositions/{id} | Returns a disposition
[**getDispositionsUsingGET**](DispositionsApi.md#getDispositionsUsingGET) | **GET** /dispositions | Returns a page of dispositions


<a name="addDispositionUsingPOST"></a>
# **addDispositionUsingPOST**
> DispositionResource addDispositionUsingPOST(disposition)

Add a new disposition. 

### Example
```java
// Import classes:
//import io.swagger.client.api.DispositionsApi;

DispositionsApi apiInstance = new DispositionsApi();
DispositionResource disposition = new DispositionResource(); // DispositionResource | The new disposition record
try {
    DispositionResource result = apiInstance.addDispositionUsingPOST(disposition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DispositionsApi#addDispositionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **disposition** | [**DispositionResource**](DispositionResource.md)| The new disposition record | [optional]

### Return type

[**DispositionResource**](DispositionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDispositionUsingDELETE"></a>
# **deleteDispositionUsingDELETE**
> deleteDispositionUsingDELETE(id)

Delete a disposition

### Example
```java
// Import classes:
//import io.swagger.client.api.DispositionsApi;

DispositionsApi apiInstance = new DispositionsApi();
Long id = 789L; // Long | The id of the disposition record
try {
    apiInstance.deleteDispositionUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DispositionsApi#deleteDispositionUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the disposition record |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDispositionCountUsingGET"></a>
# **getDispositionCountUsingGET**
> List&lt;DispositionCount&gt; getDispositionCountUsingGET(filterContext, filterOwner)

Returns a list of disposition counts

### Example
```java
// Import classes:
//import io.swagger.client.api.DispositionsApi;

DispositionsApi apiInstance = new DispositionsApi();
String filterContext = "filterContext_example"; // String | Filter for dispositions within a context type (games, articles, polls, etc). Optionally with a specific id like filter_context=video:47
String filterOwner = "filterOwner_example"; // String | Filter for dispositions from a specific user by id or 'me'
try {
    List<DispositionCount> result = apiInstance.getDispositionCountUsingGET(filterContext, filterOwner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DispositionsApi#getDispositionCountUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterContext** | **String**| Filter for dispositions within a context type (games, articles, polls, etc). Optionally with a specific id like filter_context&#x3D;video:47 | [optional]
 **filterOwner** | **String**| Filter for dispositions from a specific user by id or &#39;me&#39; | [optional]

### Return type

[**List&lt;DispositionCount&gt;**](DispositionCount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDispositionUsingGET"></a>
# **getDispositionUsingGET**
> DispositionResource getDispositionUsingGET(id)

Returns a disposition

### Example
```java
// Import classes:
//import io.swagger.client.api.DispositionsApi;

DispositionsApi apiInstance = new DispositionsApi();
Long id = 789L; // Long | The id of the disposition record
try {
    DispositionResource result = apiInstance.getDispositionUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DispositionsApi#getDispositionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the disposition record |

### Return type

[**DispositionResource**](DispositionResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDispositionsUsingGET"></a>
# **getDispositionsUsingGET**
> PageDispositionResource getDispositionsUsingGET(filterContext, filterOwner, size, page, order)

Returns a page of dispositions

### Example
```java
// Import classes:
//import io.swagger.client.api.DispositionsApi;

DispositionsApi apiInstance = new DispositionsApi();
String filterContext = "filterContext_example"; // String | Filter for dispositions within a context type (games, articles, polls, etc). Optionally with a specific id like filter_context=video:47
String filterOwner = "filterOwner_example"; // String | Filter for dispositions from a specific user by id or 'me'
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageDispositionResource result = apiInstance.getDispositionsUsingGET(filterContext, filterOwner, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DispositionsApi#getDispositionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterContext** | **String**| Filter for dispositions within a context type (games, articles, polls, etc). Optionally with a specific id like filter_context&#x3D;video:47 | [optional]
 **filterOwner** | **String**| Filter for dispositions from a specific user by id or &#39;me&#39; | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageDispositionResource**](PageDispositionResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

