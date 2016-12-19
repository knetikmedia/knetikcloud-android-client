# BRERuleEngineVariablesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListUsingGET**](BRERuleEngineVariablesApi.md#getListUsingGET) | **GET** /bre/variable-types | Get a list of variable types available


<a name="getListUsingGET"></a>
# **getListUsingGET**
> List&lt;VariableTypeResource&gt; getListUsingGET()

Get a list of variable types available

Types include integer, string, user and invoice. These are used to qualify trigger parameters and action variables with strong typing.

### Example
```java
// Import classes:
//import io.swagger.client.api.BRERuleEngineVariablesApi;

BRERuleEngineVariablesApi apiInstance = new BRERuleEngineVariablesApi();
try {
    List<VariableTypeResource> result = apiInstance.getListUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineVariablesApi#getListUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;VariableTypeResource&gt;**](VariableTypeResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

