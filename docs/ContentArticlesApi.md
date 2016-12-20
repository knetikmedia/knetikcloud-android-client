# ContentArticlesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createArticleTemplateUsingPOST**](ContentArticlesApi.md#createArticleTemplateUsingPOST) | **POST** /content/articles/templates | Create an article template
[**createArticleUsingPOST**](ContentArticlesApi.md#createArticleUsingPOST) | **POST** /content/articles | Create a new article
[**deleteArticleTemplateUsingDELETE**](ContentArticlesApi.md#deleteArticleTemplateUsingDELETE) | **DELETE** /content/articles/templates/{id} | Delete an article template
[**deleteArticleUsingDELETE**](ContentArticlesApi.md#deleteArticleUsingDELETE) | **DELETE** /content/articles/{id} | Delete an existing article
[**getArticleTemplateUsingGET**](ContentArticlesApi.md#getArticleTemplateUsingGET) | **GET** /content/articles/templates/{id} | Get a single article template
[**getArticleTemplatesUsingGET**](ContentArticlesApi.md#getArticleTemplatesUsingGET) | **GET** /content/articles/templates | List and search article templates
[**getArticleUsingGET**](ContentArticlesApi.md#getArticleUsingGET) | **GET** /content/articles/{id} | Get a single article
[**getArticlesUsingGET**](ContentArticlesApi.md#getArticlesUsingGET) | **GET** /content/articles | List and search articles
[**updateArticleTemplateUsingPUT**](ContentArticlesApi.md#updateArticleTemplateUsingPUT) | **PUT** /content/articles/templates/{id} | Update an article template
[**updateArticleUsingPUT**](ContentArticlesApi.md#updateArticleUsingPUT) | **PUT** /content/articles/{id} | Update an existing article


<a name="createArticleTemplateUsingPOST"></a>
# **createArticleTemplateUsingPOST**
> TemplateResource createArticleTemplateUsingPOST(articleTemplateResource)

Create an article template

Article Templates define a type of article and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentArticlesApi;

ContentArticlesApi apiInstance = new ContentArticlesApi();
TemplateResource articleTemplateResource = new TemplateResource(); // TemplateResource | The article template resource object
try {
    TemplateResource result = apiInstance.createArticleTemplateUsingPOST(articleTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentArticlesApi#createArticleTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleTemplateResource** | [**TemplateResource**](TemplateResource.md)| The article template resource object | [optional]

### Return type

[**TemplateResource**](TemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createArticleUsingPOST"></a>
# **createArticleUsingPOST**
> ArticleResource createArticleUsingPOST(articleResource)

Create a new article

Articles are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentArticlesApi;

ContentArticlesApi apiInstance = new ContentArticlesApi();
ArticleResource articleResource = new ArticleResource(); // ArticleResource | The new article
try {
    ArticleResource result = apiInstance.createArticleUsingPOST(articleResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentArticlesApi#createArticleUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleResource** | [**ArticleResource**](ArticleResource.md)| The new article | [optional]

### Return type

[**ArticleResource**](ArticleResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteArticleTemplateUsingDELETE"></a>
# **deleteArticleTemplateUsingDELETE**
> deleteArticleTemplateUsingDELETE(id, cascade)

Delete an article template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentArticlesApi;

ContentArticlesApi apiInstance = new ContentArticlesApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deleteArticleTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentArticlesApi#deleteArticleTemplateUsingDELETE");
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

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteArticleUsingDELETE"></a>
# **deleteArticleUsingDELETE**
> deleteArticleUsingDELETE(id)

Delete an existing article

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentArticlesApi;

ContentArticlesApi apiInstance = new ContentArticlesApi();
String id = "id_example"; // String | The article id
try {
    apiInstance.deleteArticleUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentArticlesApi#deleteArticleUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The article id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getArticleTemplateUsingGET"></a>
# **getArticleTemplateUsingGET**
> TemplateResource getArticleTemplateUsingGET(id)

Get a single article template

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentArticlesApi;

ContentArticlesApi apiInstance = new ContentArticlesApi();
String id = "id_example"; // String | The id of the template
try {
    TemplateResource result = apiInstance.getArticleTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentArticlesApi#getArticleTemplateUsingGET");
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

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getArticleTemplatesUsingGET"></a>
# **getArticleTemplatesUsingGET**
> PageResourceTemplateResource getArticleTemplatesUsingGET(size, page, order)

List and search article templates

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentArticlesApi;

ContentArticlesApi apiInstance = new ContentArticlesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceTemplateResource result = apiInstance.getArticleTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentArticlesApi#getArticleTemplatesUsingGET");
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

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getArticleUsingGET"></a>
# **getArticleUsingGET**
> ArticleResource getArticleUsingGET(id)

Get a single article

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentArticlesApi;

ContentArticlesApi apiInstance = new ContentArticlesApi();
String id = "id_example"; // String | The article id
try {
    ArticleResource result = apiInstance.getArticleUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentArticlesApi#getArticleUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The article id |

### Return type

[**ArticleResource**](ArticleResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getArticlesUsingGET"></a>
# **getArticlesUsingGET**
> PageResourceArticleResource getArticlesUsingGET(filterCategory, filterTagset, filterTitle, size, page, order)

List and search articles

Get a list of articles with optional filtering. Assets will not be filled in on the resources returned. Use &#39;Get a single article&#39; to retrieve the full resource with assets for a given item as needed.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentArticlesApi;

ContentArticlesApi apiInstance = new ContentArticlesApi();
String filterCategory = "filterCategory_example"; // String | Filter for articles from a specific category by id
String filterTagset = "filterTagset_example"; // String | Filter for articles with specified tags (separated by comma)
String filterTitle = "filterTitle_example"; // String | Filter for articles whose title contains a string
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceArticleResource result = apiInstance.getArticlesUsingGET(filterCategory, filterTagset, filterTitle, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentArticlesApi#getArticlesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterCategory** | **String**| Filter for articles from a specific category by id | [optional]
 **filterTagset** | **String**| Filter for articles with specified tags (separated by comma) | [optional]
 **filterTitle** | **String**| Filter for articles whose title contains a string | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceArticleResource**](PageResourceArticleResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateArticleTemplateUsingPUT"></a>
# **updateArticleTemplateUsingPUT**
> updateArticleTemplateUsingPUT(id, articleTemplateResource)

Update an article template

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentArticlesApi;

ContentArticlesApi apiInstance = new ContentArticlesApi();
String id = "id_example"; // String | The id of the template
TemplateResource articleTemplateResource = new TemplateResource(); // TemplateResource | The article template resource object
try {
    apiInstance.updateArticleTemplateUsingPUT(id, articleTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentArticlesApi#updateArticleTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **articleTemplateResource** | [**TemplateResource**](TemplateResource.md)| The article template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateArticleUsingPUT"></a>
# **updateArticleUsingPUT**
> updateArticleUsingPUT(id, articleResource)

Update an existing article

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentArticlesApi;

ContentArticlesApi apiInstance = new ContentArticlesApi();
String id = "id_example"; // String | The article id
ArticleResource articleResource = new ArticleResource(); // ArticleResource | The article object
try {
    apiInstance.updateArticleUsingPUT(id, articleResource);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentArticlesApi#updateArticleUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The article id |
 **articleResource** | [**ArticleResource**](ArticleResource.md)| The article object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

