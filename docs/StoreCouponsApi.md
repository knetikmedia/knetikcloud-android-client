# StoreCouponsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCouponItemUsingPOST**](StoreCouponsApi.md#createCouponItemUsingPOST) | **POST** /store/coupons | Create a coupon item
[**createCouponTemplateUsingPOST**](StoreCouponsApi.md#createCouponTemplateUsingPOST) | **POST** /store/coupons/templates | Create a coupon template
[**deleteCouponItemUsingDELETE**](StoreCouponsApi.md#deleteCouponItemUsingDELETE) | **DELETE** /store/coupons/{id} | Delete a coupon item
[**deleteCouponTemplateUsingDELETE**](StoreCouponsApi.md#deleteCouponTemplateUsingDELETE) | **DELETE** /store/coupons/templates/{id} | Delete a coupon template
[**getCouponItemUsingGET**](StoreCouponsApi.md#getCouponItemUsingGET) | **GET** /store/coupons/{id} | Get a single coupon item
[**getCouponTemplateUsingGET**](StoreCouponsApi.md#getCouponTemplateUsingGET) | **GET** /store/coupons/templates/{id} | Get a single coupon template
[**getCouponTemplatesUsingGET**](StoreCouponsApi.md#getCouponTemplatesUsingGET) | **GET** /store/coupons/templates | List and search coupon templates
[**updateCouponItemUsingPUT**](StoreCouponsApi.md#updateCouponItemUsingPUT) | **PUT** /store/coupons/{id} | Update a coupon item
[**updateCouponTemplateUsingPUT**](StoreCouponsApi.md#updateCouponTemplateUsingPUT) | **PUT** /store/coupons/templates/{id} | Update a coupon template


<a name="createCouponItemUsingPOST"></a>
# **createCouponItemUsingPOST**
> CouponItem createCouponItemUsingPOST(couponItem)

Create a coupon item

SKUs have to be unique in the entire store.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreCouponsApi;

StoreCouponsApi apiInstance = new StoreCouponsApi();
CouponItem couponItem = new CouponItem(); // CouponItem | The coupon item object
try {
    CouponItem result = apiInstance.createCouponItemUsingPOST(couponItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreCouponsApi#createCouponItemUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **couponItem** | [**CouponItem**](CouponItem.md)| The coupon item object | [optional]

### Return type

[**CouponItem**](CouponItem.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCouponTemplateUsingPOST"></a>
# **createCouponTemplateUsingPOST**
> ItemTemplateResource createCouponTemplateUsingPOST(couponTemplateResource)

Create a coupon template

Coupon Templates define a type of coupon and the properties they have.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreCouponsApi;

StoreCouponsApi apiInstance = new StoreCouponsApi();
ItemTemplateResource couponTemplateResource = new ItemTemplateResource(); // ItemTemplateResource | The new coupon template
try {
    ItemTemplateResource result = apiInstance.createCouponTemplateUsingPOST(couponTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreCouponsApi#createCouponTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **couponTemplateResource** | [**ItemTemplateResource**](ItemTemplateResource.md)| The new coupon template | [optional]

### Return type

[**ItemTemplateResource**](ItemTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCouponItemUsingDELETE"></a>
# **deleteCouponItemUsingDELETE**
> deleteCouponItemUsingDELETE(id)

Delete a coupon item

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreCouponsApi;

StoreCouponsApi apiInstance = new StoreCouponsApi();
Integer id = 56; // Integer | The id of the coupon
try {
    apiInstance.deleteCouponItemUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreCouponsApi#deleteCouponItemUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the coupon |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCouponTemplateUsingDELETE"></a>
# **deleteCouponTemplateUsingDELETE**
> deleteCouponTemplateUsingDELETE(id, cascade)

Delete a coupon template

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreCouponsApi;

StoreCouponsApi apiInstance = new StoreCouponsApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | force deleting the template if it's attached to other objects, cascade = detach
try {
    apiInstance.deleteCouponTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreCouponsApi#deleteCouponTemplateUsingDELETE");
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
 - **Accept**: application/json

<a name="getCouponItemUsingGET"></a>
# **getCouponItemUsingGET**
> CouponItem getCouponItemUsingGET(id)

Get a single coupon item

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreCouponsApi;

StoreCouponsApi apiInstance = new StoreCouponsApi();
Integer id = 56; // Integer | The id of the coupon
try {
    CouponItem result = apiInstance.getCouponItemUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreCouponsApi#getCouponItemUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the coupon |

### Return type

[**CouponItem**](CouponItem.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCouponTemplateUsingGET"></a>
# **getCouponTemplateUsingGET**
> ItemTemplateResource getCouponTemplateUsingGET(id)

Get a single coupon template

Coupon Templates define a type of coupon and the properties they have.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreCouponsApi;

StoreCouponsApi apiInstance = new StoreCouponsApi();
String id = "id_example"; // String | The id of the template
try {
    ItemTemplateResource result = apiInstance.getCouponTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreCouponsApi#getCouponTemplateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |

### Return type

[**ItemTemplateResource**](ItemTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCouponTemplatesUsingGET"></a>
# **getCouponTemplatesUsingGET**
> PageItemTemplateResource getCouponTemplatesUsingGET(size, page, order)

List and search coupon templates

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreCouponsApi;

StoreCouponsApi apiInstance = new StoreCouponsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageItemTemplateResource result = apiInstance.getCouponTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreCouponsApi#getCouponTemplatesUsingGET");
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

[**PageItemTemplateResource**](PageItemTemplateResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCouponItemUsingPUT"></a>
# **updateCouponItemUsingPUT**
> updateCouponItemUsingPUT(id, couponItem)

Update a coupon item

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreCouponsApi;

StoreCouponsApi apiInstance = new StoreCouponsApi();
Integer id = 56; // Integer | The id of the coupon
CouponItem couponItem = new CouponItem(); // CouponItem | The coupon item object
try {
    apiInstance.updateCouponItemUsingPUT(id, couponItem);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreCouponsApi#updateCouponItemUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the coupon |
 **couponItem** | [**CouponItem**](CouponItem.md)| The coupon item object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCouponTemplateUsingPUT"></a>
# **updateCouponTemplateUsingPUT**
> updateCouponTemplateUsingPUT(id, couponTemplateResource)

Update a coupon template

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreCouponsApi;

StoreCouponsApi apiInstance = new StoreCouponsApi();
String id = "id_example"; // String | The id of the template
ItemTemplateResource couponTemplateResource = new ItemTemplateResource(); // ItemTemplateResource | The coupon template resource object
try {
    apiInstance.updateCouponTemplateUsingPUT(id, couponTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreCouponsApi#updateCouponTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **couponTemplateResource** | [**ItemTemplateResource**](ItemTemplateResource.md)| The coupon template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

