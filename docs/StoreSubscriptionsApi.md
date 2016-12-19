# StoreSubscriptionsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscriptionTemplateUsingPOST**](StoreSubscriptionsApi.md#createSubscriptionTemplateUsingPOST) | **POST** /subscriptions/templates | Create a subscription template
[**createSubscriptionUsingPOST**](StoreSubscriptionsApi.md#createSubscriptionUsingPOST) | **POST** /subscriptions | Creates a subscription item and associated plans
[**deletePlanUsingDELETE**](StoreSubscriptionsApi.md#deletePlanUsingDELETE) | **DELETE** /subscriptions/{id}/plans/{plan_id} | Delete a subscription plan
[**deleteSubscriptionTemplateUsingDELETE**](StoreSubscriptionsApi.md#deleteSubscriptionTemplateUsingDELETE) | **DELETE** /subscriptions/templates/{id} | Delete a subscription template
[**getSubscriptionTemplateUsingGET**](StoreSubscriptionsApi.md#getSubscriptionTemplateUsingGET) | **GET** /subscriptions/templates/{id} | Get a single subscription template
[**getSubscriptionTemplatesUsingGET**](StoreSubscriptionsApi.md#getSubscriptionTemplatesUsingGET) | **GET** /subscriptions/templates | List and search subscription templates
[**getSubscriptionUsingGET**](StoreSubscriptionsApi.md#getSubscriptionUsingGET) | **GET** /subscriptions/{id} | Retrieve a single subscription item and associated plans
[**listSubscriptionsUsingGET**](StoreSubscriptionsApi.md#listSubscriptionsUsingGET) | **GET** /subscriptions | List available subscription items and associated plans
[**processUsingPOST**](StoreSubscriptionsApi.md#processUsingPOST) | **POST** /subscriptions/process | Processes subscriptions and charge dues
[**updateSubscriptionTemplateUsingPUT**](StoreSubscriptionsApi.md#updateSubscriptionTemplateUsingPUT) | **PUT** /subscriptions/templates/{id} | Update a subscription template
[**updateSubscriptionUsingPUT**](StoreSubscriptionsApi.md#updateSubscriptionUsingPUT) | **PUT** /subscriptions/{id} | Updates a subscription item and associated plans


<a name="createSubscriptionTemplateUsingPOST"></a>
# **createSubscriptionTemplateUsingPOST**
> SubscriptionTemplateResource createSubscriptionTemplateUsingPOST(subscriptionTemplateResource)

Create a subscription template

Subscription Templates define a type of subscription and the properties they have.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSubscriptionsApi;

StoreSubscriptionsApi apiInstance = new StoreSubscriptionsApi();
SubscriptionTemplateResource subscriptionTemplateResource = new SubscriptionTemplateResource(); // SubscriptionTemplateResource | The new subscription template
try {
    SubscriptionTemplateResource result = apiInstance.createSubscriptionTemplateUsingPOST(subscriptionTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSubscriptionsApi#createSubscriptionTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionTemplateResource** | [**SubscriptionTemplateResource**](SubscriptionTemplateResource.md)| The new subscription template | [optional]

### Return type

[**SubscriptionTemplateResource**](SubscriptionTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSubscriptionUsingPOST"></a>
# **createSubscriptionUsingPOST**
> SubscriptionResource createSubscriptionUsingPOST(subscriptionResource)

Creates a subscription item and associated plans

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSubscriptionsApi;

StoreSubscriptionsApi apiInstance = new StoreSubscriptionsApi();
SubscriptionResource subscriptionResource = new SubscriptionResource(); // SubscriptionResource | The subscription to be created
try {
    SubscriptionResource result = apiInstance.createSubscriptionUsingPOST(subscriptionResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSubscriptionsApi#createSubscriptionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionResource** | [**SubscriptionResource**](SubscriptionResource.md)| The subscription to be created | [optional]

### Return type

[**SubscriptionResource**](SubscriptionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deletePlanUsingDELETE"></a>
# **deletePlanUsingDELETE**
> deletePlanUsingDELETE(id, planId)

Delete a subscription plan

Must not be locked or a migration target

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSubscriptionsApi;

StoreSubscriptionsApi apiInstance = new StoreSubscriptionsApi();
Integer id = 56; // Integer | The id of the subscription
String planId = "planId_example"; // String | The id of the plan
try {
    apiInstance.deletePlanUsingDELETE(id, planId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSubscriptionsApi#deletePlanUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the subscription |
 **planId** | **String**| The id of the plan |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteSubscriptionTemplateUsingDELETE"></a>
# **deleteSubscriptionTemplateUsingDELETE**
> deleteSubscriptionTemplateUsingDELETE(id, cascade)

Delete a subscription template

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSubscriptionsApi;

StoreSubscriptionsApi apiInstance = new StoreSubscriptionsApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | force deleting the template if it's attached to other objects, cascade = detach
try {
    apiInstance.deleteSubscriptionTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSubscriptionsApi#deleteSubscriptionTemplateUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **cascade** | **String**| force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getSubscriptionTemplateUsingGET"></a>
# **getSubscriptionTemplateUsingGET**
> SubscriptionTemplateResource getSubscriptionTemplateUsingGET(id)

Get a single subscription template

Subscription Templates define a type of subscription and the properties they have.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSubscriptionsApi;

StoreSubscriptionsApi apiInstance = new StoreSubscriptionsApi();
String id = "id_example"; // String | The id of the template
try {
    SubscriptionTemplateResource result = apiInstance.getSubscriptionTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSubscriptionsApi#getSubscriptionTemplateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |

### Return type

[**SubscriptionTemplateResource**](SubscriptionTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getSubscriptionTemplatesUsingGET"></a>
# **getSubscriptionTemplatesUsingGET**
> PageSubscriptionTemplateResource getSubscriptionTemplatesUsingGET(size, page, order)

List and search subscription templates

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSubscriptionsApi;

StoreSubscriptionsApi apiInstance = new StoreSubscriptionsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "1"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageSubscriptionTemplateResource result = apiInstance.getSubscriptionTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSubscriptionsApi#getSubscriptionTemplatesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to 1]

### Return type

[**PageSubscriptionTemplateResource**](PageSubscriptionTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getSubscriptionUsingGET"></a>
# **getSubscriptionUsingGET**
> SubscriptionResource getSubscriptionUsingGET(id)

Retrieve a single subscription item and associated plans

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSubscriptionsApi;

StoreSubscriptionsApi apiInstance = new StoreSubscriptionsApi();
Integer id = 56; // Integer | The id of the subscription
try {
    SubscriptionResource result = apiInstance.getSubscriptionUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSubscriptionsApi#getSubscriptionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the subscription |

### Return type

[**SubscriptionResource**](SubscriptionResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listSubscriptionsUsingGET"></a>
# **listSubscriptionsUsingGET**
> PageSubscriptionResource listSubscriptionsUsingGET(size, page, order)

List available subscription items and associated plans

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSubscriptionsApi;

StoreSubscriptionsApi apiInstance = new StoreSubscriptionsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "1"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageSubscriptionResource result = apiInstance.listSubscriptionsUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSubscriptionsApi#listSubscriptionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to 1]

### Return type

[**PageSubscriptionResource**](PageSubscriptionResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="processUsingPOST"></a>
# **processUsingPOST**
> processUsingPOST()

Processes subscriptions and charge dues

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSubscriptionsApi;

StoreSubscriptionsApi apiInstance = new StoreSubscriptionsApi();
try {
    apiInstance.processUsingPOST();
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSubscriptionsApi#processUsingPOST");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateSubscriptionTemplateUsingPUT"></a>
# **updateSubscriptionTemplateUsingPUT**
> updateSubscriptionTemplateUsingPUT(id, subscriptionTemplateResource)

Update a subscription template

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSubscriptionsApi;

StoreSubscriptionsApi apiInstance = new StoreSubscriptionsApi();
String id = "id_example"; // String | The id of the template
SubscriptionTemplateResource subscriptionTemplateResource = new SubscriptionTemplateResource(); // SubscriptionTemplateResource | The subscription template resource object
try {
    apiInstance.updateSubscriptionTemplateUsingPUT(id, subscriptionTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSubscriptionsApi#updateSubscriptionTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **subscriptionTemplateResource** | [**SubscriptionTemplateResource**](SubscriptionTemplateResource.md)| The subscription template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateSubscriptionUsingPUT"></a>
# **updateSubscriptionUsingPUT**
> updateSubscriptionUsingPUT(id, subscriptionResource)

Updates a subscription item and associated plans

Will not remove plans left out

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSubscriptionsApi;

StoreSubscriptionsApi apiInstance = new StoreSubscriptionsApi();
Integer id = 56; // Integer | The id of the subscription
SubscriptionResource subscriptionResource = new SubscriptionResource(); // SubscriptionResource | The subscription resource object
try {
    apiInstance.updateSubscriptionUsingPUT(id, subscriptionResource);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSubscriptionsApi#updateSubscriptionUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the subscription |
 **subscriptionResource** | [**SubscriptionResource**](SubscriptionResource.md)| The subscription resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

