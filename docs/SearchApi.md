# SearchApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**externalAddUsingPOST**](SearchApi.md#externalAddUsingPOST) | **POST** /search/index/{type}/{id} | Add a new object to an index
[**externalDeleteAllUsingDELETE**](SearchApi.md#externalDeleteAllUsingDELETE) | **DELETE** /search/index/{type} | Delete all objects in an index
[**externalDeleteUsingDELETE**](SearchApi.md#externalDeleteUsingDELETE) | **DELETE** /search/index/{type}/{id} | Delete an object
[**externalRegisterUsingPOST**](SearchApi.md#externalRegisterUsingPOST) | **POST** /search/mappings | Register reference mappings
[**searchUsingPOST**](SearchApi.md#searchUsingPOST) | **POST** /search/index/{type} | Search an index


<a name="externalAddUsingPOST"></a>
# **externalAddUsingPOST**
> externalAddUsingPOST(type, id, _object)

Add a new object to an index

Mainly intended for internal use.

### Example
```java
// Import classes:
//import io.swagger.client.api.SearchApi;

SearchApi apiInstance = new SearchApi();
String type = "type_example"; // String | The index type
String id = "id_example"; // String | The ID of the object
Object _object = null; // Object | The object to add
try {
    apiInstance.externalAddUsingPOST(type, id, _object);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#externalAddUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The index type |
 **id** | **String**| The ID of the object |
 **_object** | **Object**| The object to add | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="externalDeleteAllUsingDELETE"></a>
# **externalDeleteAllUsingDELETE**
> externalDeleteAllUsingDELETE(type)

Delete all objects in an index

Mainly intended for internal use

### Example
```java
// Import classes:
//import io.swagger.client.api.SearchApi;

SearchApi apiInstance = new SearchApi();
String type = "type_example"; // String | The index type
try {
    apiInstance.externalDeleteAllUsingDELETE(type);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#externalDeleteAllUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The index type |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="externalDeleteUsingDELETE"></a>
# **externalDeleteUsingDELETE**
> externalDeleteUsingDELETE(type, id)

Delete an object

Mainly intended for internal use. Requires SEARCH_ADMIN.

### Example
```java
// Import classes:
//import io.swagger.client.api.SearchApi;

SearchApi apiInstance = new SearchApi();
String type = "type_example"; // String | The index type
String id = "id_example"; // String | The ID of the object to delete
try {
    apiInstance.externalDeleteUsingDELETE(type, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#externalDeleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The index type |
 **id** | **String**| The ID of the object to delete |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="externalRegisterUsingPOST"></a>
# **externalRegisterUsingPOST**
> externalRegisterUsingPOST(mappings)

Register reference mappings

Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use.

### Example
```java
// Import classes:
//import io.swagger.client.api.SearchApi;

SearchApi apiInstance = new SearchApi();
List<SearchReferenceMapping> mappings = Arrays.asList(new SearchReferenceMapping()); // List<SearchReferenceMapping> | The mappings to add
try {
    apiInstance.externalRegisterUsingPOST(mappings);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#externalRegisterUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappings** | [**List&lt;SearchReferenceMapping&gt;**](SearchReferenceMapping.md)| The mappings to add | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchUsingPOST"></a>
# **searchUsingPOST**
> PageResourceMapstringobject searchUsingPOST(type, query, size, page)

Search an index

The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type. See individual search endpoints on other resources for details on their format.

### Example
```java
// Import classes:
//import io.swagger.client.api.SearchApi;

SearchApi apiInstance = new SearchApi();
String type = "type_example"; // String | The index type
Object query = null; // Object | The query to be used for the search
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceMapstringobject result = apiInstance.searchUsingPOST(type, query, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The index type |
 **query** | **Object**| The query to be used for the search | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceMapstringobject**](PageResourceMapstringobject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

