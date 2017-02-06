# LocationsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCities**](LocationsApi.md#getCities) | **GET** /location/countries/{country_code_iso3}/states/{state_code}/cities | Get a list of a state&#39;s cities
[**getCountries1**](LocationsApi.md#getCountries1) | **GET** /location/countries | Get a list of countries
[**getCountries2**](LocationsApi.md#getCountries2) | **GET** /location/countries/{country_code_iso3}/states | Get a list of a country&#39;s states
[**getCountryByGeoLocation**](LocationsApi.md#getCountryByGeoLocation) | **GET** /location/geolocation/country | Get the iso3 code of your country
[**getCurrencyByGeoLocation**](LocationsApi.md#getCurrencyByGeoLocation) | **GET** /location/geolocation/currency | Get the currency information of your country


<a name="getCities"></a>
# **getCities**
> List&lt;CityResource&gt; getCities(countryCodeIso3, stateCode)

Get a list of a state&#39;s cities

### Example
```java
// Import classes:
//import io.swagger.client.api.LocationsApi;

LocationsApi apiInstance = new LocationsApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
String stateCode = "stateCode_example"; // String | The code of the state
try {
    List<CityResource> result = apiInstance.getCities(countryCodeIso3, stateCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getCities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCodeIso3** | **String**| The iso3 code of the country |
 **stateCode** | **String**| The code of the state |

### Return type

[**List&lt;CityResource&gt;**](CityResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCountries1"></a>
# **getCountries1**
> List&lt;CountryResource&gt; getCountries1()

Get a list of countries

### Example
```java
// Import classes:
//import io.swagger.client.api.LocationsApi;

LocationsApi apiInstance = new LocationsApi();
try {
    List<CountryResource> result = apiInstance.getCountries1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getCountries1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CountryResource&gt;**](CountryResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCountries2"></a>
# **getCountries2**
> List&lt;StateResource&gt; getCountries2(countryCodeIso3)

Get a list of a country&#39;s states

### Example
```java
// Import classes:
//import io.swagger.client.api.LocationsApi;

LocationsApi apiInstance = new LocationsApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
try {
    List<StateResource> result = apiInstance.getCountries2(countryCodeIso3);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getCountries2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCodeIso3** | **String**| The iso3 code of the country |

### Return type

[**List&lt;StateResource&gt;**](StateResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCountryByGeoLocation"></a>
# **getCountryByGeoLocation**
> String getCountryByGeoLocation()

Get the iso3 code of your country

Determined by geo ip location

### Example
```java
// Import classes:
//import io.swagger.client.api.LocationsApi;

LocationsApi apiInstance = new LocationsApi();
try {
    String result = apiInstance.getCountryByGeoLocation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getCountryByGeoLocation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrencyByGeoLocation"></a>
# **getCurrencyByGeoLocation**
> CurrencyResource getCurrencyByGeoLocation()

Get the currency information of your country

Determined by geo ip location, currency to country mapping and a fallback setting

### Example
```java
// Import classes:
//import io.swagger.client.api.LocationsApi;

LocationsApi apiInstance = new LocationsApi();
try {
    CurrencyResource result = apiInstance.getCurrencyByGeoLocation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getCurrencyByGeoLocation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrencyResource**](CurrencyResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

