# TaxesApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaxUsingPOST**](TaxesApi.md#createTaxUsingPOST) | **POST** /tax/countries/{country_code_iso3}/states | Create a tax
[**deleteTaxUsingDELETE**](TaxesApi.md#deleteTaxUsingDELETE) | **DELETE** /tax/countries/{country_code_iso3} | Delete an existing tax
[**deleteTaxUsingDELETE1**](TaxesApi.md#deleteTaxUsingDELETE1) | **DELETE** /tax/countries/{country_code_iso3}/states/{state_code} | Delete an existing tax
[**getAllTaxesUsingGET**](TaxesApi.md#getAllTaxesUsingGET) | **GET** /tax/states | List and search taxes across all countries
[**getTaxUsingGET**](TaxesApi.md#getTaxUsingGET) | **GET** /tax/countries/{country_code_iso3} | Get a single tax
[**getTaxUsingGET1**](TaxesApi.md#getTaxUsingGET1) | **GET** /tax/countries/{country_code_iso3}/states/{state_code} | Get a single tax
[**getTaxesUsingGET**](TaxesApi.md#getTaxesUsingGET) | **GET** /tax/countries | List and search taxes
[**getTaxesUsingGET1**](TaxesApi.md#getTaxesUsingGET1) | **GET** /tax/countries/{country_code_iso3}/states | List and search taxes within a country
[**updateTaxUsingPOST**](TaxesApi.md#updateTaxUsingPOST) | **POST** /tax/countries | Create a tax
[**updateTaxUsingPUT**](TaxesApi.md#updateTaxUsingPUT) | **PUT** /tax/countries/{country_code_iso3} | Create or update a tax
[**updateTaxUsingPUT1**](TaxesApi.md#updateTaxUsingPUT1) | **PUT** /tax/countries/{country_code_iso3}/states/{state_code} | Create or update a tax


<a name="createTaxUsingPOST"></a>
# **createTaxUsingPOST**
> createTaxUsingPOST(countryCodeIso3, taxResource)

Create a tax

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
StateTaxResource taxResource = new StateTaxResource(); // StateTaxResource | The tax object
try {
    apiInstance.createTaxUsingPOST(countryCodeIso3, taxResource);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#createTaxUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCodeIso3** | **String**| The iso3 code of the country |
 **taxResource** | [**StateTaxResource**](StateTaxResource.md)| The tax object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTaxUsingDELETE"></a>
# **deleteTaxUsingDELETE**
> deleteTaxUsingDELETE(countryCodeIso3)

Delete an existing tax

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
try {
    apiInstance.deleteTaxUsingDELETE(countryCodeIso3);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#deleteTaxUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCodeIso3** | **String**| The iso3 code of the country |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTaxUsingDELETE1"></a>
# **deleteTaxUsingDELETE1**
> deleteTaxUsingDELETE1(countryCodeIso3, stateCode)

Delete an existing tax

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
String stateCode = "stateCode_example"; // String | The code of the state
try {
    apiInstance.deleteTaxUsingDELETE1(countryCodeIso3, stateCode);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#deleteTaxUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCodeIso3** | **String**| The iso3 code of the country |
 **stateCode** | **String**| The code of the state |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllTaxesUsingGET"></a>
# **getAllTaxesUsingGET**
> PageResourceStateTaxResource getAllTaxesUsingGET(size, page, order)

List and search taxes across all countries

Get a list of taxes

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "name:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceStateTaxResource result = apiInstance.getAllTaxesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#getAllTaxesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to name:ASC]

### Return type

[**PageResourceStateTaxResource**](PageResourceStateTaxResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaxUsingGET"></a>
# **getTaxUsingGET**
> CountryTaxResource getTaxUsingGET(countryCodeIso3)

Get a single tax

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
try {
    CountryTaxResource result = apiInstance.getTaxUsingGET(countryCodeIso3);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#getTaxUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCodeIso3** | **String**| The iso3 code of the country |

### Return type

[**CountryTaxResource**](CountryTaxResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaxUsingGET1"></a>
# **getTaxUsingGET1**
> StateTaxResource getTaxUsingGET1(countryCodeIso3, stateCode)

Get a single tax

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
String stateCode = "stateCode_example"; // String | The code of the state
try {
    StateTaxResource result = apiInstance.getTaxUsingGET1(countryCodeIso3, stateCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#getTaxUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCodeIso3** | **String**| The iso3 code of the country |
 **stateCode** | **String**| The code of the state |

### Return type

[**StateTaxResource**](StateTaxResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaxesUsingGET"></a>
# **getTaxesUsingGET**
> PageResourceCountryTaxResource getTaxesUsingGET(size, page, order)

List and search taxes

Get a list of taxes

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "name:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceCountryTaxResource result = apiInstance.getTaxesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#getTaxesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to name:ASC]

### Return type

[**PageResourceCountryTaxResource**](PageResourceCountryTaxResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaxesUsingGET1"></a>
# **getTaxesUsingGET1**
> PageResourceStateTaxResource getTaxesUsingGET1(countryCodeIso3, size, page, order)

List and search taxes within a country

Get a list of taxes

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned
String order = "name:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceStateTaxResource result = apiInstance.getTaxesUsingGET1(countryCodeIso3, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#getTaxesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCodeIso3** | **String**| The iso3 code of the country |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to name:ASC]

### Return type

[**PageResourceStateTaxResource**](PageResourceStateTaxResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaxUsingPOST"></a>
# **updateTaxUsingPOST**
> updateTaxUsingPOST(taxResource)

Create a tax

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
CountryTaxResource taxResource = new CountryTaxResource(); // CountryTaxResource | The tax object
try {
    apiInstance.updateTaxUsingPOST(taxResource);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#updateTaxUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxResource** | [**CountryTaxResource**](CountryTaxResource.md)| The tax object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaxUsingPUT"></a>
# **updateTaxUsingPUT**
> updateTaxUsingPUT(countryCodeIso3, taxResource)

Create or update a tax

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
CountryTaxResource taxResource = new CountryTaxResource(); // CountryTaxResource | The tax object
try {
    apiInstance.updateTaxUsingPUT(countryCodeIso3, taxResource);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#updateTaxUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCodeIso3** | **String**| The iso3 code of the country |
 **taxResource** | [**CountryTaxResource**](CountryTaxResource.md)| The tax object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaxUsingPUT1"></a>
# **updateTaxUsingPUT1**
> updateTaxUsingPUT1(countryCodeIso3, stateCode, taxResource)

Create or update a tax

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
String stateCode = "stateCode_example"; // String | The code of the state
StateTaxResource taxResource = new StateTaxResource(); // StateTaxResource | The tax object
try {
    apiInstance.updateTaxUsingPUT1(countryCodeIso3, stateCode, taxResource);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#updateTaxUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCodeIso3** | **String**| The iso3 code of the country |
 **stateCode** | **String**| The code of the state |
 **taxResource** | [**StateTaxResource**](StateTaxResource.md)| The tax object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

