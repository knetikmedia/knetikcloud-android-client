# MediaArtistsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addArtistUsingPOST**](MediaArtistsApi.md#addArtistUsingPOST) | **POST** /media/artists | Adds a new artist in the system
[**createArtistTemplateUsingPOST**](MediaArtistsApi.md#createArtistTemplateUsingPOST) | **POST** /media/artists/templates | Create an artist template
[**deleteArtistTemplateUsingDELETE**](MediaArtistsApi.md#deleteArtistTemplateUsingDELETE) | **DELETE** /media/artists/templates/{id} | Delete an artist template
[**deleteArtistUsingDELETE**](MediaArtistsApi.md#deleteArtistUsingDELETE) | **DELETE** /media/artists/{id} | Removes an artist from the system IF no resources are attached to it
[**getArtistTemplateUsingGET**](MediaArtistsApi.md#getArtistTemplateUsingGET) | **GET** /media/artists/templates/{id} | Get a single artist template
[**getArtistTemplatesUsingGET**](MediaArtistsApi.md#getArtistTemplatesUsingGET) | **GET** /media/artists/templates | List and search artist templates
[**getArtistUsingGET**](MediaArtistsApi.md#getArtistUsingGET) | **GET** /media/artists/{id} | Loads a specific artist details
[**searchArtistsUsingGET**](MediaArtistsApi.md#searchArtistsUsingGET) | **GET** /media/artists | Search for artists
[**updateArtistTemplateUsingPUT**](MediaArtistsApi.md#updateArtistTemplateUsingPUT) | **PUT** /media/artists/templates/{id} | Update an artist template
[**updateArtistUsingPUT**](MediaArtistsApi.md#updateArtistUsingPUT) | **PUT** /media/artists/{id} | Modifies an artist details


<a name="addArtistUsingPOST"></a>
# **addArtistUsingPOST**
> ArtistResource addArtistUsingPOST(artistResource)

Adds a new artist in the system

Adds a new artist in the system. Use specific media contributions endpoint to add contributions

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaArtistsApi;

MediaArtistsApi apiInstance = new MediaArtistsApi();
ArtistResource artistResource = new ArtistResource(); // ArtistResource | The new artist
try {
    ArtistResource result = apiInstance.addArtistUsingPOST(artistResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaArtistsApi#addArtistUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **artistResource** | [**ArtistResource**](ArtistResource.md)| The new artist | [optional]

### Return type

[**ArtistResource**](ArtistResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createArtistTemplateUsingPOST"></a>
# **createArtistTemplateUsingPOST**
> TemplateResource createArtistTemplateUsingPOST(artistTemplateResource)

Create an artist template

Artist Templates define a type of artist and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaArtistsApi;

MediaArtistsApi apiInstance = new MediaArtistsApi();
TemplateResource artistTemplateResource = new TemplateResource(); // TemplateResource | The artist template resource object
try {
    TemplateResource result = apiInstance.createArtistTemplateUsingPOST(artistTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaArtistsApi#createArtistTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **artistTemplateResource** | [**TemplateResource**](TemplateResource.md)| The artist template resource object | [optional]

### Return type

[**TemplateResource**](TemplateResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteArtistTemplateUsingDELETE"></a>
# **deleteArtistTemplateUsingDELETE**
> deleteArtistTemplateUsingDELETE(id, cascade)

Delete an artist template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaArtistsApi;

MediaArtistsApi apiInstance = new MediaArtistsApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deleteArtistTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaArtistsApi#deleteArtistTemplateUsingDELETE");
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

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteArtistUsingDELETE"></a>
# **deleteArtistUsingDELETE**
> deleteArtistUsingDELETE(id)

Removes an artist from the system IF no resources are attached to it

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaArtistsApi;

MediaArtistsApi apiInstance = new MediaArtistsApi();
Long id = 789L; // Long | The artist id
try {
    apiInstance.deleteArtistUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaArtistsApi#deleteArtistUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The artist id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getArtistTemplateUsingGET"></a>
# **getArtistTemplateUsingGET**
> TemplateResource getArtistTemplateUsingGET(id)

Get a single artist template

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaArtistsApi;

MediaArtistsApi apiInstance = new MediaArtistsApi();
String id = "id_example"; // String | The id of the template
try {
    TemplateResource result = apiInstance.getArtistTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaArtistsApi#getArtistTemplateUsingGET");
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

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getArtistTemplatesUsingGET"></a>
# **getArtistTemplatesUsingGET**
> PageResourceTemplateResource getArtistTemplatesUsingGET(size, page, order)

List and search artist templates

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaArtistsApi;

MediaArtistsApi apiInstance = new MediaArtistsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceTemplateResource result = apiInstance.getArtistTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaArtistsApi#getArtistTemplatesUsingGET");
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

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getArtistUsingGET"></a>
# **getArtistUsingGET**
> ArtistResource getArtistUsingGET(id, showContributions)

Loads a specific artist details

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaArtistsApi;

MediaArtistsApi apiInstance = new MediaArtistsApi();
Long id = 789L; // Long | The artist id
Integer showContributions = 56; // Integer | The number of contributions to show fetch
try {
    ArtistResource result = apiInstance.getArtistUsingGET(id, showContributions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaArtistsApi#getArtistUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The artist id |
 **showContributions** | **Integer**| The number of contributions to show fetch | [optional]

### Return type

[**ArtistResource**](ArtistResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchArtistsUsingGET"></a>
# **searchArtistsUsingGET**
> PageResourceArtistResource searchArtistsUsingGET(filterArtistsByName, size, page, order)

Search for artists

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaArtistsApi;

MediaArtistsApi apiInstance = new MediaArtistsApi();
String filterArtistsByName = "filterArtistsByName_example"; // String | Filter for artists which name *STARTS* with the given string
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceArtistResource result = apiInstance.searchArtistsUsingGET(filterArtistsByName, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaArtistsApi#searchArtistsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterArtistsByName** | **String**| Filter for artists which name *STARTS* with the given string | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceArtistResource**](PageResourceArtistResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateArtistTemplateUsingPUT"></a>
# **updateArtistTemplateUsingPUT**
> updateArtistTemplateUsingPUT(id, artistTemplateResource)

Update an artist template

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaArtistsApi;

MediaArtistsApi apiInstance = new MediaArtistsApi();
String id = "id_example"; // String | The id of the template
TemplateResource artistTemplateResource = new TemplateResource(); // TemplateResource | The artist template resource object
try {
    apiInstance.updateArtistTemplateUsingPUT(id, artistTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaArtistsApi#updateArtistTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **artistTemplateResource** | [**TemplateResource**](TemplateResource.md)| The artist template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateArtistUsingPUT"></a>
# **updateArtistUsingPUT**
> updateArtistUsingPUT(id, artistResource)

Modifies an artist details

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaArtistsApi;

MediaArtistsApi apiInstance = new MediaArtistsApi();
Long id = 789L; // Long | The artist id
ArtistResource artistResource = new ArtistResource(); // ArtistResource | The new artist
try {
    apiInstance.updateArtistUsingPUT(id, artistResource);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaArtistsApi#updateArtistUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The artist id |
 **artistResource** | [**ArtistResource**](ArtistResource.md)| The new artist | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

