# ContentPollsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**answerPollUsingPOST**](ContentPollsApi.md#answerPollUsingPOST) | **POST** /media/polls/{id}/response | Add your vote to a poll
[**createPollTemplateUsingPOST**](ContentPollsApi.md#createPollTemplateUsingPOST) | **POST** /media/polls/templates | Create a poll template
[**createPollUsingPOST**](ContentPollsApi.md#createPollUsingPOST) | **POST** /media/polls | Create a new poll
[**deletePollTemplateUsingDELETE**](ContentPollsApi.md#deletePollTemplateUsingDELETE) | **DELETE** /media/polls/templates/{id} | Delete a poll template
[**deletePollUsingDELETE**](ContentPollsApi.md#deletePollUsingDELETE) | **DELETE** /media/polls/{id} | Delete an existing poll
[**getPollAnswerUsingGET**](ContentPollsApi.md#getPollAnswerUsingGET) | **GET** /media/polls/{id}/response | Get poll answer
[**getPollTemplateUsingGET**](ContentPollsApi.md#getPollTemplateUsingGET) | **GET** /media/polls/templates/{id} | Get a single poll template
[**getPollTemplatesUsingGET**](ContentPollsApi.md#getPollTemplatesUsingGET) | **GET** /media/polls/templates | List and search poll templates
[**getPollUsingGET**](ContentPollsApi.md#getPollUsingGET) | **GET** /media/polls/{id} | Get a single poll
[**getPollsUsingGET**](ContentPollsApi.md#getPollsUsingGET) | **GET** /media/polls | List and search polls
[**updatePollTemplateUsingPUT**](ContentPollsApi.md#updatePollTemplateUsingPUT) | **PUT** /media/polls/templates/{id} | Update a poll template
[**updatePollUsingPUT**](ContentPollsApi.md#updatePollUsingPUT) | **PUT** /media/polls/{id} | Update an existing poll


<a name="answerPollUsingPOST"></a>
# **answerPollUsingPOST**
> PollResponseResource answerPollUsingPOST(id, answerKey)

Add your vote to a poll

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
String id = "id_example"; // String | The poll id
String answerKey = "answerKey_example"; // String | The answer key
try {
    PollResponseResource result = apiInstance.answerPollUsingPOST(id, answerKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#answerPollUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The poll id |
 **answerKey** | **String**| The answer key | [optional]

### Return type

[**PollResponseResource**](PollResponseResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPollTemplateUsingPOST"></a>
# **createPollTemplateUsingPOST**
> TemplateResource createPollTemplateUsingPOST(pollTemplateResource)

Create a poll template

Poll templates define a type of poll and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
TemplateResource pollTemplateResource = new TemplateResource(); // TemplateResource | The poll template resource object
try {
    TemplateResource result = apiInstance.createPollTemplateUsingPOST(pollTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#createPollTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pollTemplateResource** | [**TemplateResource**](TemplateResource.md)| The poll template resource object | [optional]

### Return type

[**TemplateResource**](TemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPollUsingPOST"></a>
# **createPollUsingPOST**
> PollResource createPollUsingPOST(pollResource)

Create a new poll

Polls are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
PollResource pollResource = new PollResource(); // PollResource | The poll object
try {
    PollResource result = apiInstance.createPollUsingPOST(pollResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#createPollUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pollResource** | [**PollResource**](PollResource.md)| The poll object | [optional]

### Return type

[**PollResource**](PollResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePollTemplateUsingDELETE"></a>
# **deletePollTemplateUsingDELETE**
> deletePollTemplateUsingDELETE(id, cascade)

Delete a poll template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deletePollTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#deletePollTemplateUsingDELETE");
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

<a name="deletePollUsingDELETE"></a>
# **deletePollUsingDELETE**
> deletePollUsingDELETE(id)

Delete an existing poll

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
String id = "id_example"; // String | The poll id
try {
    apiInstance.deletePollUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#deletePollUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The poll id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPollAnswerUsingGET"></a>
# **getPollAnswerUsingGET**
> PollResponseResource getPollAnswerUsingGET(id)

Get poll answer

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
String id = "id_example"; // String | The poll id
try {
    PollResponseResource result = apiInstance.getPollAnswerUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#getPollAnswerUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The poll id |

### Return type

[**PollResponseResource**](PollResponseResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPollTemplateUsingGET"></a>
# **getPollTemplateUsingGET**
> TemplateResource getPollTemplateUsingGET(id)

Get a single poll template

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
String id = "id_example"; // String | The id of the template
try {
    TemplateResource result = apiInstance.getPollTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#getPollTemplateUsingGET");
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

<a name="getPollTemplatesUsingGET"></a>
# **getPollTemplatesUsingGET**
> PageTemplateResource getPollTemplatesUsingGET(size, page, order)

List and search poll templates

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageTemplateResource result = apiInstance.getPollTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#getPollTemplatesUsingGET");
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

<a name="getPollUsingGET"></a>
# **getPollUsingGET**
> PollResource getPollUsingGET(id)

Get a single poll

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
String id = "id_example"; // String | The poll id
try {
    PollResource result = apiInstance.getPollUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#getPollUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The poll id |

### Return type

[**PollResource**](PollResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPollsUsingGET"></a>
# **getPollsUsingGET**
> PagePollResource getPollsUsingGET(filterCategory, filterTagset, filterText, size, page, order)

List and search polls

Get a list of polls with optional filtering. Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
String filterCategory = "filterCategory_example"; // String | Filter for polls from a specific category by id
String filterTagset = "filterTagset_example"; // String | Filter for polls with specified tags (separated by comma)
String filterText = "filterText_example"; // String | Filter for polls whose text contains a string
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PagePollResource result = apiInstance.getPollsUsingGET(filterCategory, filterTagset, filterText, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#getPollsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterCategory** | **String**| Filter for polls from a specific category by id | [optional]
 **filterTagset** | **String**| Filter for polls with specified tags (separated by comma) | [optional]
 **filterText** | **String**| Filter for polls whose text contains a string | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PagePollResource**](PagePollResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePollTemplateUsingPUT"></a>
# **updatePollTemplateUsingPUT**
> updatePollTemplateUsingPUT(id, pollTemplateResource)

Update a poll template

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
String id = "id_example"; // String | The id of the template
TemplateResource pollTemplateResource = new TemplateResource(); // TemplateResource | The poll template resource object
try {
    apiInstance.updatePollTemplateUsingPUT(id, pollTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#updatePollTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **pollTemplateResource** | [**TemplateResource**](TemplateResource.md)| The poll template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePollUsingPUT"></a>
# **updatePollUsingPUT**
> updatePollUsingPUT(id, pollResource)

Update an existing poll

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentPollsApi;

ContentPollsApi apiInstance = new ContentPollsApi();
String id = "id_example"; // String | The poll id
PollResource pollResource = new PollResource(); // PollResource | The poll object
try {
    apiInstance.updatePollUsingPUT(id, pollResource);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentPollsApi#updatePollUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The poll id |
 **pollResource** | [**PollResource**](PollResource.md)| The poll object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

