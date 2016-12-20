# PaymentsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentMethodUsingPOST**](PaymentsApi.md#createPaymentMethodUsingPOST) | **POST** /users/{user_id}/payment-methods | Create a new payment method for a user
[**deletePaymentMethodUsingDELETE**](PaymentsApi.md#deletePaymentMethodUsingDELETE) | **DELETE** /users/{user_id}/payment-methods/{id} | Delete an existing payment method for a user
[**getPaymentMethodUsingGET**](PaymentsApi.md#getPaymentMethodUsingGET) | **GET** /users/{user_id}/payment-methods/{id} | Get a single payment method for a user
[**getPaymentMethodsUsingGET**](PaymentsApi.md#getPaymentMethodsUsingGET) | **GET** /users/{user_id}/payment-methods | Get all payment methods for a user
[**paymentAuthorizationUsingPOST**](PaymentsApi.md#paymentAuthorizationUsingPOST) | **POST** /payment/authorizations | Authorize payment of an invoice for later capture
[**paymentCaptureUsingPOST**](PaymentsApi.md#paymentCaptureUsingPOST) | **POST** /payment/authorizations/{id}/capture | Capture an existing invoice payment authorization
[**updatePaymentMethodUsingPUT**](PaymentsApi.md#updatePaymentMethodUsingPUT) | **PUT** /users/{user_id}/payment-methods/{id} | Update an existing payment method for a user


<a name="createPaymentMethodUsingPOST"></a>
# **createPaymentMethodUsingPOST**
> PaymentMethodResource createPaymentMethodUsingPOST(userId, paymentMethod)

Create a new payment method for a user

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsApi;

PaymentsApi apiInstance = new PaymentsApi();
Integer userId = 56; // Integer | ID of the user for whom the payment method is being created
PaymentMethodResource paymentMethod = new PaymentMethodResource(); // PaymentMethodResource | Payment method being created
try {
    PaymentMethodResource result = apiInstance.createPaymentMethodUsingPOST(userId, paymentMethod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createPaymentMethodUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| ID of the user for whom the payment method is being created |
 **paymentMethod** | [**PaymentMethodResource**](PaymentMethodResource.md)| Payment method being created | [optional]

### Return type

[**PaymentMethodResource**](PaymentMethodResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deletePaymentMethodUsingDELETE"></a>
# **deletePaymentMethodUsingDELETE**
> deletePaymentMethodUsingDELETE(userId, id)

Delete an existing payment method for a user

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsApi;

PaymentsApi apiInstance = new PaymentsApi();
Integer userId = 56; // Integer | ID of the user for whom the payment method is being updated
Integer id = 56; // Integer | ID of the payment method being deleted
try {
    apiInstance.deletePaymentMethodUsingDELETE(userId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#deletePaymentMethodUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| ID of the user for whom the payment method is being updated |
 **id** | **Integer**| ID of the payment method being deleted |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getPaymentMethodUsingGET"></a>
# **getPaymentMethodUsingGET**
> PaymentMethodResource getPaymentMethodUsingGET(userId, id)

Get a single payment method for a user

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsApi;

PaymentsApi apiInstance = new PaymentsApi();
Integer userId = 56; // Integer | ID of the user for whom the payment method is being retrieved
Integer id = 56; // Integer | ID of the payment method being retrieved
try {
    PaymentMethodResource result = apiInstance.getPaymentMethodUsingGET(userId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getPaymentMethodUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| ID of the user for whom the payment method is being retrieved |
 **id** | **Integer**| ID of the payment method being retrieved |

### Return type

[**PaymentMethodResource**](PaymentMethodResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getPaymentMethodsUsingGET"></a>
# **getPaymentMethodsUsingGET**
> List&lt;PaymentMethodResource&gt; getPaymentMethodsUsingGET(userId, size, page, order)

Get all payment methods for a user

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsApi;

PaymentsApi apiInstance = new PaymentsApi();
Integer userId = 56; // Integer | ID of the user for whom the payment methods are being retrieved
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    List<PaymentMethodResource> result = apiInstance.getPaymentMethodsUsingGET(userId, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getPaymentMethodsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| ID of the user for whom the payment methods are being retrieved |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**List&lt;PaymentMethodResource&gt;**](PaymentMethodResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="paymentAuthorizationUsingPOST"></a>
# **paymentAuthorizationUsingPOST**
> PaymentAuthorizationResource paymentAuthorizationUsingPOST(request)

Authorize payment of an invoice for later capture

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsApi;

PaymentsApi apiInstance = new PaymentsApi();
PaymentAuthorizationResource request = new PaymentAuthorizationResource(); // PaymentAuthorizationResource | Payment authorization request
try {
    PaymentAuthorizationResource result = apiInstance.paymentAuthorizationUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#paymentAuthorizationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**PaymentAuthorizationResource**](PaymentAuthorizationResource.md)| Payment authorization request | [optional]

### Return type

[**PaymentAuthorizationResource**](PaymentAuthorizationResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="paymentCaptureUsingPOST"></a>
# **paymentCaptureUsingPOST**
> paymentCaptureUsingPOST(id)

Capture an existing invoice payment authorization

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsApi;

PaymentsApi apiInstance = new PaymentsApi();
Integer id = 56; // Integer | ID of the payment authorization to capture
try {
    apiInstance.paymentCaptureUsingPOST(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#paymentCaptureUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| ID of the payment authorization to capture |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePaymentMethodUsingPUT"></a>
# **updatePaymentMethodUsingPUT**
> updatePaymentMethodUsingPUT(userId, id, paymentMethod)

Update an existing payment method for a user

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsApi;

PaymentsApi apiInstance = new PaymentsApi();
Integer userId = 56; // Integer | ID of the user for whom the payment method is being updated
Integer id = 56; // Integer | ID of the payment method being updated
PaymentMethodResource paymentMethod = new PaymentMethodResource(); // PaymentMethodResource | The updated payment method data
try {
    apiInstance.updatePaymentMethodUsingPUT(userId, id, paymentMethod);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#updatePaymentMethodUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| ID of the user for whom the payment method is being updated |
 **id** | **Integer**| ID of the payment method being updated |
 **paymentMethod** | [**PaymentMethodResource**](PaymentMethodResource.md)| The updated payment method data | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

