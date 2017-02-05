# CurrenciesApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCurrencyUsingPOST**](CurrenciesApi.md#createCurrencyUsingPOST) | **POST** /currencies | Create a currency
[**deleteCurrencyUsingDELETE**](CurrenciesApi.md#deleteCurrencyUsingDELETE) | **DELETE** /currencies/{code} | Delete a currency
[**getCurrenciesUsingGET**](CurrenciesApi.md#getCurrenciesUsingGET) | **GET** /currencies | List and search currencies
[**getCurrencyUsingGET**](CurrenciesApi.md#getCurrencyUsingGET) | **GET** /currencies/{code} | Get a single currency
[**updateCurrencyUsingPUT**](CurrenciesApi.md#updateCurrencyUsingPUT) | **PUT** /currencies/{code} | Update a currency


<a name="createCurrencyUsingPOST"></a>
# **createCurrencyUsingPOST**
> CurrencyResource createCurrencyUsingPOST(currency)

Create a currency

### Example
```java
// Import classes:
//import io.swagger.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
CurrencyResource currency = new CurrencyResource(); // CurrencyResource | The currency object
try {
    CurrencyResource result = apiInstance.createCurrencyUsingPOST(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#createCurrencyUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | [**CurrencyResource**](CurrencyResource.md)| The currency object | [optional]

### Return type

[**CurrencyResource**](CurrencyResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCurrencyUsingDELETE"></a>
# **deleteCurrencyUsingDELETE**
> deleteCurrencyUsingDELETE(code)

Delete a currency

### Example
```java
// Import classes:
//import io.swagger.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String code = "code_example"; // String | The currency code
try {
    apiInstance.deleteCurrencyUsingDELETE(code);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#deleteCurrencyUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The currency code |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrenciesUsingGET"></a>
# **getCurrenciesUsingGET**
> PageResourceCurrencyResource getCurrenciesUsingGET(filterEnabledCurrencies, filterType, size, page, order)

List and search currencies

### Example
```java
// Import classes:
//import io.swagger.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
Boolean filterEnabledCurrencies = true; // Boolean | Filter for alternate currencies setup explicitely in system config
String filterType = "filterType_example"; // String | Filter currencies by type.  Allowable values: ('virtual', 'real')
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "name:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceCurrencyResource result = apiInstance.getCurrenciesUsingGET(filterEnabledCurrencies, filterType, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#getCurrenciesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterEnabledCurrencies** | **Boolean**| Filter for alternate currencies setup explicitely in system config | [optional]
 **filterType** | **String**| Filter currencies by type.  Allowable values: (&#39;virtual&#39;, &#39;real&#39;) | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to name:ASC]

### Return type

[**PageResourceCurrencyResource**](PageResourceCurrencyResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrencyUsingGET"></a>
# **getCurrencyUsingGET**
> CurrencyResource getCurrencyUsingGET(code)

Get a single currency

### Example
```java
// Import classes:
//import io.swagger.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String code = "code_example"; // String | The currency code
try {
    CurrencyResource result = apiInstance.getCurrencyUsingGET(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#getCurrencyUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The currency code |

### Return type

[**CurrencyResource**](CurrencyResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCurrencyUsingPUT"></a>
# **updateCurrencyUsingPUT**
> updateCurrencyUsingPUT(code, currency)

Update a currency

### Example
```java
// Import classes:
//import io.swagger.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String code = "code_example"; // String | The currency code
CurrencyResource currency = new CurrencyResource(); // CurrencyResource | The currency object
try {
    apiInstance.updateCurrencyUsingPUT(code, currency);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#updateCurrencyUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The currency code |
 **currency** | [**CurrencyResource**](CurrencyResource.md)| The currency object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

