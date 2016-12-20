# BRERuleEngineCategoriesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplateUsingPOST1**](BRERuleEngineCategoriesApi.md#createTemplateUsingPOST1) | **POST** /bre/categories/templates | Create a BRE category template
[**deleteTemplateUsingDELETE**](BRERuleEngineCategoriesApi.md#deleteTemplateUsingDELETE) | **DELETE** /bre/categories/templates/{id} | Delete a BRE category template
[**getCategoriesUsingGET**](BRERuleEngineCategoriesApi.md#getCategoriesUsingGET) | **GET** /bre/categories | List categories
[**getCategoryUsingGET**](BRERuleEngineCategoriesApi.md#getCategoryUsingGET) | **GET** /bre/categories/{name} | Get a single category
[**getTemplateUsingGET**](BRERuleEngineCategoriesApi.md#getTemplateUsingGET) | **GET** /bre/categories/templates/{id} | Get a single BRE category template
[**getTemplatesUsingGET**](BRERuleEngineCategoriesApi.md#getTemplatesUsingGET) | **GET** /bre/categories/templates | List and search BRE category templates
[**updateCategoryUsingPUT**](BRERuleEngineCategoriesApi.md#updateCategoryUsingPUT) | **PUT** /bre/categories/{name} | Update a category
[**updateTemplateUsingPUT1**](BRERuleEngineCategoriesApi.md#updateTemplateUsingPUT1) | **PUT** /bre/categories/templates/{id} | Update a BRE category template


<a name="createTemplateUsingPOST1"></a>
# **createTemplateUsingPOST1**
> TemplateResource createTemplateUsingPOST1(template)

Create a BRE category template

Templates define a type of BRE category and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineCategoriesApi;

BRERuleEngineCategoriesApi apiInstance = new BRERuleEngineCategoriesApi();
TemplateResource template = new TemplateResource(); // TemplateResource | The category template to create
try {
    TemplateResource result = apiInstance.createTemplateUsingPOST1(template);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineCategoriesApi#createTemplateUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template** | [**TemplateResource**](TemplateResource.md)| The category template to create | [optional]

### Return type

[**TemplateResource**](TemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteTemplateUsingDELETE"></a>
# **deleteTemplateUsingDELETE**
> deleteTemplateUsingDELETE(id, cascade)

Delete a BRE category template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineCategoriesApi;

BRERuleEngineCategoriesApi apiInstance = new BRERuleEngineCategoriesApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deleteTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineCategoriesApi#deleteTemplateUsingDELETE");
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
 - **Accept**: */*

<a name="getCategoriesUsingGET"></a>
# **getCategoriesUsingGET**
> PageBreCategoryResource getCategoriesUsingGET(size, page)

List categories

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineCategoriesApi;

BRERuleEngineCategoriesApi apiInstance = new BRERuleEngineCategoriesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageBreCategoryResource result = apiInstance.getCategoriesUsingGET(size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineCategoriesApi#getCategoriesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageBreCategoryResource**](PageBreCategoryResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getCategoryUsingGET"></a>
# **getCategoryUsingGET**
> BreCategoryResource getCategoryUsingGET(name)

Get a single category

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineCategoriesApi;

BRERuleEngineCategoriesApi apiInstance = new BRERuleEngineCategoriesApi();
String name = "name_example"; // String | The category name
try {
    BreCategoryResource result = apiInstance.getCategoryUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineCategoriesApi#getCategoryUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The category name |

### Return type

[**BreCategoryResource**](BreCategoryResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getTemplateUsingGET"></a>
# **getTemplateUsingGET**
> TemplateResource getTemplateUsingGET(id)

Get a single BRE category template

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineCategoriesApi;

BRERuleEngineCategoriesApi apiInstance = new BRERuleEngineCategoriesApi();
String id = "id_example"; // String | The id of the template
try {
    TemplateResource result = apiInstance.getTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineCategoriesApi#getTemplateUsingGET");
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
 - **Accept**: */*

<a name="getTemplatesUsingGET"></a>
# **getTemplatesUsingGET**
> PageTemplateResource getTemplatesUsingGET(size, page, order)

List and search BRE category templates

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineCategoriesApi;

BRERuleEngineCategoriesApi apiInstance = new BRERuleEngineCategoriesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageTemplateResource result = apiInstance.getTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineCategoriesApi#getTemplatesUsingGET");
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
 - **Accept**: */*

<a name="updateCategoryUsingPUT"></a>
# **updateCategoryUsingPUT**
> updateCategoryUsingPUT(name, category)

Update a category

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineCategoriesApi;

BRERuleEngineCategoriesApi apiInstance = new BRERuleEngineCategoriesApi();
String name = "name_example"; // String | The category name
BreCategoryResource category = new BreCategoryResource(); // BreCategoryResource | The updated BRE category information
try {
    apiInstance.updateCategoryUsingPUT(name, category);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineCategoriesApi#updateCategoryUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The category name |
 **category** | [**BreCategoryResource**](BreCategoryResource.md)| The updated BRE category information | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateTemplateUsingPUT1"></a>
# **updateTemplateUsingPUT1**
> updateTemplateUsingPUT1(id, template)

Update a BRE category template

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineCategoriesApi;

BRERuleEngineCategoriesApi apiInstance = new BRERuleEngineCategoriesApi();
String id = "id_example"; // String | The id of the template
TemplateResource template = new TemplateResource(); // TemplateResource | The updated category template definition
try {
    apiInstance.updateTemplateUsingPUT1(id, template);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineCategoriesApi#updateTemplateUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **template** | [**TemplateResource**](TemplateResource.md)| The updated category template definition | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

