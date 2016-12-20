# StoreShoppingCartsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDiscountUsingPOST**](StoreShoppingCartsApi.md#addDiscountUsingPOST) | **POST** /carts/{id}/discounts | Adds a coupon to the cart
[**addItemUsingPOST**](StoreShoppingCartsApi.md#addItemUsingPOST) | **POST** /carts/{id}/items | Add an item to the cart
[**assignCartUsingPUT**](StoreShoppingCartsApi.md#assignCartUsingPUT) | **PUT** /carts/{id}/owner | Sets the owner of a cart if none is set already
[**checkShippableUsingGET**](StoreShoppingCartsApi.md#checkShippableUsingGET) | **GET** /carts/{id}/shippable | Returns whether a cart requires shipping
[**createCartUsingPOST**](StoreShoppingCartsApi.md#createCartUsingPOST) | **POST** /carts | Creates a new cart from scratch
[**getCartUsingGET**](StoreShoppingCartsApi.md#getCartUsingGET) | **GET** /carts/{id} | Returns the cart with the given GUID
[**getCountriesUsingGET**](StoreShoppingCartsApi.md#getCountriesUsingGET) | **GET** /carts/{id}/countries | Get the list of available shipping countries per vendor
[**modifyShippingAddressUsingPUT**](StoreShoppingCartsApi.md#modifyShippingAddressUsingPUT) | **PUT** /carts/{id}/shipping-address | Modifies or sets the order shipping address
[**removeDiscountUsingDELETE**](StoreShoppingCartsApi.md#removeDiscountUsingDELETE) | **DELETE** /carts/{id}/discounts/{code} | Removes a coupon from the cart
[**searchCartsUsingGET**](StoreShoppingCartsApi.md#searchCartsUsingGET) | **GET** /carts | Get a list of carts
[**setCartCurrencyUsingPUT**](StoreShoppingCartsApi.md#setCartCurrencyUsingPUT) | **PUT** /carts/{id}/currency | Sets the currency to use for the cart
[**updateItemUsingPUT**](StoreShoppingCartsApi.md#updateItemUsingPUT) | **PUT** /carts/{id}/items | Changes the quantity of an item already in the cart


<a name="addDiscountUsingPOST"></a>
# **addDiscountUsingPOST**
> addDiscountUsingPOST(id, skuRequest)

Adds a coupon to the cart

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
String id = "id_example"; // String | The id of the cart
SkuRequest skuRequest = new SkuRequest(); // SkuRequest | The request of the sku
try {
    apiInstance.addDiscountUsingPOST(id, skuRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#addDiscountUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the cart |
 **skuRequest** | [**SkuRequest**](SkuRequest.md)| The request of the sku | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemUsingPOST"></a>
# **addItemUsingPOST**
> addItemUsingPOST(id, cartItemRequest)

Add an item to the cart

Currently, carts cannot contain virtual and real currency items at the same time. Furthermore, the API only support a single virtual item at the moment

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
String id = "id_example"; // String | The id of the cart
CartItemRequest cartItemRequest = new CartItemRequest(); // CartItemRequest | The cart item request object
try {
    apiInstance.addItemUsingPOST(id, cartItemRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#addItemUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the cart |
 **cartItemRequest** | [**CartItemRequest**](CartItemRequest.md)| The cart item request object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assignCartUsingPUT"></a>
# **assignCartUsingPUT**
> assignCartUsingPUT(id, userId)

Sets the owner of a cart if none is set already

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
String id = "id_example"; // String | The id of the cart
Integer userId = 56; // Integer | The id of the user
try {
    apiInstance.assignCartUsingPUT(id, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#assignCartUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the cart |
 **userId** | **Integer**| The id of the user | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkShippableUsingGET"></a>
# **checkShippableUsingGET**
> CartShippableResponse checkShippableUsingGET(id)

Returns whether a cart requires shipping

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
String id = "id_example"; // String | The id of the cart
try {
    CartShippableResponse result = apiInstance.checkShippableUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#checkShippableUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the cart |

### Return type

[**CartShippableResponse**](CartShippableResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCartUsingPOST"></a>
# **createCartUsingPOST**
> String createCartUsingPOST(owner, currencyCode)

Creates a new cart from scratch

You don&#39;t have to have a user to create a cart but the API requires authentication to checkout

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
Integer owner = 56; // Integer | Set the owner of a cart. If not specified, defaults to the calling user's id. If specified and is not the calling user's id, SHOPPING_CARTS_ADMIN permission is required
String currencyCode = "currencyCode_example"; // String | Set the currency for the cart, by currency code. May be disallowed by site settings.
try {
    String result = apiInstance.createCartUsingPOST(owner, currencyCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#createCartUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **Integer**| Set the owner of a cart. If not specified, defaults to the calling user&#39;s id. If specified and is not the calling user&#39;s id, SHOPPING_CARTS_ADMIN permission is required | [optional]
 **currencyCode** | **String**| Set the currency for the cart, by currency code. May be disallowed by site settings. | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCartUsingGET"></a>
# **getCartUsingGET**
> Cart getCartUsingGET(id)

Returns the cart with the given GUID

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
String id = "id_example"; // String | The id of the cart
try {
    Cart result = apiInstance.getCartUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#getCartUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the cart |

### Return type

[**Cart**](Cart.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCountriesUsingGET"></a>
# **getCountriesUsingGET**
> SampleCountriesResponse getCountriesUsingGET(id)

Get the list of available shipping countries per vendor

Since a cart can have multiple vendors with different shipping options, the countries are broken down by vendors. Please see notes about the response object as the fields are variable.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
String id = "id_example"; // String | The id of the cart
try {
    SampleCountriesResponse result = apiInstance.getCountriesUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#getCountriesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the cart |

### Return type

[**SampleCountriesResponse**](SampleCountriesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyShippingAddressUsingPUT"></a>
# **modifyShippingAddressUsingPUT**
> modifyShippingAddressUsingPUT(id, cartShippingAddressRequest)

Modifies or sets the order shipping address

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
String id = "id_example"; // String | The id of the cart
CartShippingAddressRequest cartShippingAddressRequest = new CartShippingAddressRequest(); // CartShippingAddressRequest | The cart shipping address request object
try {
    apiInstance.modifyShippingAddressUsingPUT(id, cartShippingAddressRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#modifyShippingAddressUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the cart |
 **cartShippingAddressRequest** | [**CartShippingAddressRequest**](CartShippingAddressRequest.md)| The cart shipping address request object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeDiscountUsingDELETE"></a>
# **removeDiscountUsingDELETE**
> removeDiscountUsingDELETE(id, code)

Removes a coupon from the cart

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
String id = "id_example"; // String | The id of the cart
String code = "code_example"; // String | The SKU code of the coupon to remove
try {
    apiInstance.removeDiscountUsingDELETE(id, code);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#removeDiscountUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the cart |
 **code** | **String**| The SKU code of the coupon to remove |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchCartsUsingGET"></a>
# **searchCartsUsingGET**
> PageResourceCartSummary searchCartsUsingGET(filterOwnerId, size, page, order)

Get a list of carts

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
Integer filterOwnerId = 56; // Integer | Filter by the id of the owner
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceCartSummary result = apiInstance.searchCartsUsingGET(filterOwnerId, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#searchCartsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterOwnerId** | **Integer**| Filter by the id of the owner | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceCartSummary**](PageResourceCartSummary.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setCartCurrencyUsingPUT"></a>
# **setCartCurrencyUsingPUT**
> setCartCurrencyUsingPUT(id, currencyCode)

Sets the currency to use for the cart

May be disallowed by site settings.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
String id = "id_example"; // String | The id of the cart
String currencyCode = "currencyCode_example"; // String | The code of the currency
try {
    apiInstance.setCartCurrencyUsingPUT(id, currencyCode);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#setCartCurrencyUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the cart |
 **currencyCode** | **String**| The code of the currency | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemUsingPUT"></a>
# **updateItemUsingPUT**
> updateItemUsingPUT(id, cartItemRequest)

Changes the quantity of an item already in the cart

A quantity of zero will remove the item from the cart altogether.

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreShoppingCartsApi;

StoreShoppingCartsApi apiInstance = new StoreShoppingCartsApi();
String id = "id_example"; // String | The id of the cart
CartItemRequest cartItemRequest = new CartItemRequest(); // CartItemRequest | The cart item request object
try {
    apiInstance.updateItemUsingPUT(id, cartItemRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreShoppingCartsApi#updateItemUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the cart |
 **cartItemRequest** | [**CartItemRequest**](CartItemRequest.md)| The cart item request object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

