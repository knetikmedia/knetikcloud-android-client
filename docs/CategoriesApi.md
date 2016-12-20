# CategoriesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCategoryUsingPOST**](CategoriesApi.md#createCategoryUsingPOST) | **POST** /categories | Create a new category
[**createTemplateUsingPOST2**](CategoriesApi.md#createTemplateUsingPOST2) | **POST** /categories/templates | Create a category template
[**deleteCategoryUsingDELETE**](CategoriesApi.md#deleteCategoryUsingDELETE) | **DELETE** /categories/{id} | Delete an existing category
[**deleteTemplateUsingDELETE1**](CategoriesApi.md#deleteTemplateUsingDELETE1) | **DELETE** /categories/templates/{id} | Delete a category template
[**getArticleTemplatesUsingGET1**](CategoriesApi.md#getArticleTemplatesUsingGET1) | **GET** /categories/templates | List and search category templates
[**getCategoriesUsingGET1**](CategoriesApi.md#getCategoriesUsingGET1) | **GET** /categories | List and search categories with optional filters
[**getCategoryUsingGET1**](CategoriesApi.md#getCategoryUsingGET1) | **GET** /categories/{id} | Get a single category
[**getTagsUsingGET**](CategoriesApi.md#getTagsUsingGET) | **GET** /tags | List all trivia tags in the system
[**getTemplateUsingGET1**](CategoriesApi.md#getTemplateUsingGET1) | **GET** /categories/templates/{id} | Get a single category template
[**updateCategoryUsingPUT1**](CategoriesApi.md#updateCategoryUsingPUT1) | **PUT** /categories/{id} | Update an existing category
[**updateTemplateUsingPUT2**](CategoriesApi.md#updateTemplateUsingPUT2) | **PUT** /categories/templates/{id} | Update a category template


<a name="createCategoryUsingPOST"></a>
# **createCategoryUsingPOST**
> CategoryResource createCategoryUsingPOST(category)

Create a new category

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
CategoryResource category = new CategoryResource(); // CategoryResource | The category to create
try {
    CategoryResource result = apiInstance.createCategoryUsingPOST(category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#createCategoryUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | [**CategoryResource**](CategoryResource.md)| The category to create | [optional]

### Return type

[**CategoryResource**](CategoryResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTemplateUsingPOST2"></a>
# **createTemplateUsingPOST2**
> TemplateResource createTemplateUsingPOST2(template)

Create a category template

Templates define a type of category and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
TemplateResource template = new TemplateResource(); // TemplateResource | The template to create
try {
    TemplateResource result = apiInstance.createTemplateUsingPOST2(template);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#createTemplateUsingPOST2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template** | [**TemplateResource**](TemplateResource.md)| The template to create | [optional]

### Return type

[**TemplateResource**](TemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCategoryUsingDELETE"></a>
# **deleteCategoryUsingDELETE**
> deleteCategoryUsingDELETE(id)

Delete an existing category

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
String id = "id_example"; // String | The id of the category to be deleted
try {
    apiInstance.deleteCategoryUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#deleteCategoryUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the category to be deleted |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTemplateUsingDELETE1"></a>
# **deleteTemplateUsingDELETE1**
> deleteTemplateUsingDELETE1(id, cascade)

Delete a category template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deleteTemplateUsingDELETE1(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#deleteTemplateUsingDELETE1");
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

<a name="getArticleTemplatesUsingGET1"></a>
# **getArticleTemplatesUsingGET1**
> PageTemplateResource getArticleTemplatesUsingGET1(size, page, order)

List and search category templates

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageTemplateResource result = apiInstance.getArticleTemplatesUsingGET1(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getArticleTemplatesUsingGET1");
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

[**PageTemplateResource**](PageTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCategoriesUsingGET1"></a>
# **getCategoriesUsingGET1**
> PageCategoryResource getCategoriesUsingGET1(filterSearch, filterActive, size, page, order)

List and search categories with optional filters

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
String filterSearch = "filterSearch_example"; // String | Filter for categories whose names begin with provided string
Boolean filterActive = true; // Boolean | Filter for categories that are specifically active or inactive
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageCategoryResource result = apiInstance.getCategoriesUsingGET1(filterSearch, filterActive, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategoriesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterSearch** | **String**| Filter for categories whose names begin with provided string | [optional]
 **filterActive** | **Boolean**| Filter for categories that are specifically active or inactive | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageCategoryResource**](PageCategoryResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCategoryUsingGET1"></a>
# **getCategoryUsingGET1**
> CategoryResource getCategoryUsingGET1(id)

Get a single category

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
String id = "id_example"; // String | The id of the category to retrieve
try {
    CategoryResource result = apiInstance.getCategoryUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategoryUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the category to retrieve |

### Return type

[**CategoryResource**](CategoryResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTagsUsingGET"></a>
# **getTagsUsingGET**
> Pagestring getTagsUsingGET(size, page)

List all trivia tags in the system

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    Pagestring result = apiInstance.getTagsUsingGET(size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getTagsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**Pagestring**](Pagestring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplateUsingGET1"></a>
# **getTemplateUsingGET1**
> TemplateResource getTemplateUsingGET1(id)

Get a single category template

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
String id = "id_example"; // String | The id of the template
try {
    TemplateResource result = apiInstance.getTemplateUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getTemplateUsingGET1");
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

<a name="updateCategoryUsingPUT1"></a>
# **updateCategoryUsingPUT1**
> updateCategoryUsingPUT1(id, category)

Update an existing category

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
String id = "id_example"; // String | The id of the category
CategoryResource category = new CategoryResource(); // CategoryResource | The category to update
try {
    apiInstance.updateCategoryUsingPUT1(id, category);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#updateCategoryUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the category |
 **category** | [**CategoryResource**](CategoryResource.md)| The category to update | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTemplateUsingPUT2"></a>
# **updateTemplateUsingPUT2**
> updateTemplateUsingPUT2(id, template)

Update a category template

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
String id = "id_example"; // String | The id of the template
TemplateResource template = new TemplateResource(); // TemplateResource | The updated template information
try {
    apiInstance.updateTemplateUsingPUT2(id, template);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#updateTemplateUsingPUT2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **template** | [**TemplateResource**](TemplateResource.md)| The updated template information | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

