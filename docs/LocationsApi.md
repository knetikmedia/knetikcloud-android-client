# LocationsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**citiesUsingGET**](LocationsApi.md#citiesUsingGET) | **GET** /location/countries/{country_code_iso3}/states/{state_code}/cities | Get a list of a state&#39;s cities
[**countriesUsingGET**](LocationsApi.md#countriesUsingGET) | **GET** /location/countries | Get a list of countries
[**getCurrencyByGeoLocationUsingGET**](LocationsApi.md#getCurrencyByGeoLocationUsingGET) | **GET** /location/geolocation/currency | Get the currency information of your country
[**getGeoLocationCountryUsingGET**](LocationsApi.md#getGeoLocationCountryUsingGET) | **GET** /location/geolocation/country | Get the iso3 code of your country
[**statesUsingGET**](LocationsApi.md#statesUsingGET) | **GET** /location/countries/{country_code_iso3}/states | Get a list of a country&#39;s states


<a name="citiesUsingGET"></a>
# **citiesUsingGET**
> List&lt;CityResource&gt; citiesUsingGET(countryCodeIso3, stateCode)

Get a list of a state&#39;s cities

### Example
```java
// Import classes:
//import io.swagger.client.api.LocationsApi;

LocationsApi apiInstance = new LocationsApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
String stateCode = "stateCode_example"; // String | The code of the state
try {
    List<CityResource> result = apiInstance.citiesUsingGET(countryCodeIso3, stateCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#citiesUsingGET");
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
 - **Accept**: */*

<a name="countriesUsingGET"></a>
# **countriesUsingGET**
> List&lt;CountryResource&gt; countriesUsingGET()

Get a list of countries

### Example
```java
// Import classes:
//import io.swagger.client.api.LocationsApi;

LocationsApi apiInstance = new LocationsApi();
try {
    List<CountryResource> result = apiInstance.countriesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#countriesUsingGET");
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
 - **Accept**: */*

<a name="getCurrencyByGeoLocationUsingGET"></a>
# **getCurrencyByGeoLocationUsingGET**
> CurrencyResource getCurrencyByGeoLocationUsingGET()

Get the currency information of your country

Determined by geo ip location, currency to country mapping and a fallback setting

### Example
```java
// Import classes:
//import io.swagger.client.api.LocationsApi;

LocationsApi apiInstance = new LocationsApi();
try {
    CurrencyResource result = apiInstance.getCurrencyByGeoLocationUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getCurrencyByGeoLocationUsingGET");
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
 - **Accept**: */*

<a name="getGeoLocationCountryUsingGET"></a>
# **getGeoLocationCountryUsingGET**
> String getGeoLocationCountryUsingGET()

Get the iso3 code of your country

Determined by geo ip location

### Example
```java
// Import classes:
//import io.swagger.client.api.LocationsApi;

LocationsApi apiInstance = new LocationsApi();
try {
    String result = apiInstance.getGeoLocationCountryUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getGeoLocationCountryUsingGET");
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
 - **Accept**: */*

<a name="statesUsingGET"></a>
# **statesUsingGET**
> List&lt;StateResource&gt; statesUsingGET(countryCodeIso3)

Get a list of a country&#39;s states

### Example
```java
// Import classes:
//import io.swagger.client.api.LocationsApi;

LocationsApi apiInstance = new LocationsApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
try {
    List<StateResource> result = apiInstance.statesUsingGET(countryCodeIso3);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#statesUsingGET");
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
 - **Accept**: */*

