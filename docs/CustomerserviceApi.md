# CustomerserviceApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerUsingPOST**](CustomerserviceApi.md#createCustomerUsingPOST) | **POST** /customers | Create a customer
[**getCustomersUsingGET**](CustomerserviceApi.md#getCustomersUsingGET) | **GET** /customers | List and search customers


<a name="createCustomerUsingPOST"></a>
# **createCustomerUsingPOST**
> createCustomerUsingPOST(customer)

Create a customer

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerserviceApi;

CustomerserviceApi apiInstance = new CustomerserviceApi();
CustomerConfig customer = new CustomerConfig(); // CustomerConfig | customer
try {
    apiInstance.createCustomerUsingPOST(customer);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerserviceApi#createCustomerUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**CustomerConfig**](CustomerConfig.md)| customer |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomersUsingGET"></a>
# **getCustomersUsingGET**
> List&lt;CustomerResource&gt; getCustomersUsingGET(size, page, order)

List and search customers

Get a list of customers with optional filtering

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerserviceApi;

CustomerserviceApi apiInstance = new CustomerserviceApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "name:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    List<CustomerResource> result = apiInstance.getCustomersUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerserviceApi#getCustomersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to name:ASC]

### Return type

[**List&lt;CustomerResource&gt;**](CustomerResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

