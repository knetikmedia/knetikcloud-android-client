# ContentCommentsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCommentUsingPOST**](ContentCommentsApi.md#addCommentUsingPOST) | **POST** /comments | Add a new comment
[**deleteCommentUsingDELETE**](ContentCommentsApi.md#deleteCommentUsingDELETE) | **DELETE** /comments/{id} | Delete a comment
[**getCommentUsingGET**](ContentCommentsApi.md#getCommentUsingGET) | **GET** /comments/{id} | Returns a comment by comment id
[**getCommentsUsingGET**](ContentCommentsApi.md#getCommentsUsingGET) | **GET** /comments | Returns a page of comments
[**searchCommentsUsingPOST**](ContentCommentsApi.md#searchCommentsUsingPOST) | **POST** /comments/search | Search the comment index
[**updateCommentUsingPUT**](ContentCommentsApi.md#updateCommentUsingPUT) | **PUT** /comments/{id}/content | Update comment content


<a name="addCommentUsingPOST"></a>
# **addCommentUsingPOST**
> CommentResource addCommentUsingPOST(commentResource)

Add a new comment

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentCommentsApi;

ContentCommentsApi apiInstance = new ContentCommentsApi();
CommentResource commentResource = new CommentResource(); // CommentResource | The comment to be added
try {
    CommentResource result = apiInstance.addCommentUsingPOST(commentResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentCommentsApi#addCommentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentResource** | [**CommentResource**](CommentResource.md)| The comment to be added | [optional]

### Return type

[**CommentResource**](CommentResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCommentUsingDELETE"></a>
# **deleteCommentUsingDELETE**
> deleteCommentUsingDELETE(id)

Delete a comment

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentCommentsApi;

ContentCommentsApi apiInstance = new ContentCommentsApi();
Long id = 789L; // Long | The comment id
try {
    apiInstance.deleteCommentUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentCommentsApi#deleteCommentUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The comment id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCommentUsingGET"></a>
# **getCommentUsingGET**
> CommentResource getCommentUsingGET(id)

Returns a comment by comment id

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentCommentsApi;

ContentCommentsApi apiInstance = new ContentCommentsApi();
Long id = 789L; // Long | The comment id
try {
    CommentResource result = apiInstance.getCommentUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentCommentsApi#getCommentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The comment id |

### Return type

[**CommentResource**](CommentResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCommentsUsingGET"></a>
# **getCommentsUsingGET**
> PageResourceCommentResource getCommentsUsingGET(context, contextId, size, page)

Returns a page of comments

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentCommentsApi;

ContentCommentsApi apiInstance = new ContentCommentsApi();
String context = "context_example"; // String | Get comments by context type
Integer contextId = 56; // Integer | Get comments by context id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceCommentResource result = apiInstance.getCommentsUsingGET(context, contextId, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentCommentsApi#getCommentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| Get comments by context type |
 **contextId** | **Integer**| Get comments by context id |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceCommentResource**](PageResourceCommentResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchCommentsUsingPOST"></a>
# **searchCommentsUsingPOST**
> CommentSearch searchCommentsUsingPOST(query, size, page)

Search the comment index

The body is an ElasticSearch query json. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentCommentsApi;

ContentCommentsApi apiInstance = new ContentCommentsApi();
Object query = null; // Object | The search query
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    CommentSearch result = apiInstance.searchCommentsUsingPOST(query, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentCommentsApi#searchCommentsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **Object**| The search query | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**CommentSearch**](CommentSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCommentUsingPUT"></a>
# **updateCommentUsingPUT**
> updateCommentUsingPUT(id, content)

Update comment content

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentCommentsApi;

ContentCommentsApi apiInstance = new ContentCommentsApi();
Long id = 789L; // Long | The comment id
String content = "content_example"; // String | The comment content
try {
    apiInstance.updateCommentUsingPUT(id, content);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentCommentsApi#updateCommentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The comment id |
 **content** | **String**| The comment content | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

