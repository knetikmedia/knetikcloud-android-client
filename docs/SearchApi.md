# SearchApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchIndex**](SearchApi.md#searchIndex) | **POST** search/index/{type} | Search an index


<a name="searchIndex"></a>
# **searchIndex**
> PageResourceMapstringobject searchIndex(type, query, size, page)

Search an index

The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type but mostly matches the resource from it&#39;s main endpoint. Exceptions include referenced objects (like user) being replaced with the full user resource to allow deeper searching.

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String type = "type_example"; // String | The index type
Object query = null; // Object | The query to be used for the search
Integer size = 25; // Integer | The number of documents returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceMapstringobject result = apiInstance.searchIndex(type, query, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The index type |
 **query** | **Object**| The query to be used for the search | [optional]
 **size** | **Integer**| The number of documents returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceMapstringobject**](PageResourceMapstringobject.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

