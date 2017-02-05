# StoreSalesApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCatalogSaleUsingPOST**](StoreSalesApi.md#createCatalogSaleUsingPOST) | **POST** /store/sales | Create a sale
[**deleteCatalogSaleUsingDELETE**](StoreSalesApi.md#deleteCatalogSaleUsingDELETE) | **DELETE** /store/sales/{id} | Delete a sale
[**getCatalogSaleUsingGET**](StoreSalesApi.md#getCatalogSaleUsingGET) | **GET** /store/sales/{id} | Get a single sale
[**getCatalogSalesUsingGET**](StoreSalesApi.md#getCatalogSalesUsingGET) | **GET** /store/sales | List and search sales
[**updateCatalogSaleUsingPUT**](StoreSalesApi.md#updateCatalogSaleUsingPUT) | **PUT** /store/sales/{id} | Update a sale


<a name="createCatalogSaleUsingPOST"></a>
# **createCatalogSaleUsingPOST**
> CatalogSale createCatalogSaleUsingPOST(catalogSale)

Create a sale

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSalesApi;

StoreSalesApi apiInstance = new StoreSalesApi();
CatalogSale catalogSale = new CatalogSale(); // CatalogSale | The catalog sale object
try {
    CatalogSale result = apiInstance.createCatalogSaleUsingPOST(catalogSale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSalesApi#createCatalogSaleUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogSale** | [**CatalogSale**](CatalogSale.md)| The catalog sale object | [optional]

### Return type

[**CatalogSale**](CatalogSale.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCatalogSaleUsingDELETE"></a>
# **deleteCatalogSaleUsingDELETE**
> deleteCatalogSaleUsingDELETE(id)

Delete a sale

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSalesApi;

StoreSalesApi apiInstance = new StoreSalesApi();
Integer id = 56; // Integer | The id of the sale
try {
    apiInstance.deleteCatalogSaleUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSalesApi#deleteCatalogSaleUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the sale |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCatalogSaleUsingGET"></a>
# **getCatalogSaleUsingGET**
> CatalogSale getCatalogSaleUsingGET(id)

Get a single sale

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSalesApi;

StoreSalesApi apiInstance = new StoreSalesApi();
Integer id = 56; // Integer | The id of the sale
try {
    CatalogSale result = apiInstance.getCatalogSaleUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSalesApi#getCatalogSaleUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the sale |

### Return type

[**CatalogSale**](CatalogSale.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCatalogSalesUsingGET"></a>
# **getCatalogSalesUsingGET**
> PageResourceCatalogSale getCatalogSalesUsingGET(size, page, order)

List and search sales

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSalesApi;

StoreSalesApi apiInstance = new StoreSalesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceCatalogSale result = apiInstance.getCatalogSalesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSalesApi#getCatalogSalesUsingGET");
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

[**PageResourceCatalogSale**](PageResourceCatalogSale.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCatalogSaleUsingPUT"></a>
# **updateCatalogSaleUsingPUT**
> updateCatalogSaleUsingPUT(id, catalogSale)

Update a sale

### Example
```java
// Import classes:
//import io.swagger.client.api.StoreSalesApi;

StoreSalesApi apiInstance = new StoreSalesApi();
Integer id = 56; // Integer | The id of the sale
CatalogSale catalogSale = new CatalogSale(); // CatalogSale | The catalog sale object
try {
    apiInstance.updateCatalogSaleUsingPUT(id, catalogSale);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreSalesApi#updateCatalogSaleUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the sale |
 **catalogSale** | [**CatalogSale**](CatalogSale.md)| The catalog sale object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

