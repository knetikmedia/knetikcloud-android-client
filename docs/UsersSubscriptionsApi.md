# UsersSubscriptionsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSubscriptionDetailsUsingGET**](UsersSubscriptionsApi.md#getSubscriptionDetailsUsingGET) | **GET** /users/{user_id}/subscriptions/{inventory_id} | Get details about a user&#39;s subscription
[**getSubscriptionDetailsUsingGET1**](UsersSubscriptionsApi.md#getSubscriptionDetailsUsingGET1) | **GET** /users/{user_id}/subscriptions | Get details about a user&#39;s subscriptions
[**reactivateUsingPOST**](UsersSubscriptionsApi.md#reactivateUsingPOST) | **POST** /users/{user_id}/subscriptions/{inventory_id}/reactivate | Reactivate a subscription and charge fee
[**setBillDateUsingPUT**](UsersSubscriptionsApi.md#setBillDateUsingPUT) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/bill-date | Set a new date to bill a subscription on
[**setPaymentMethodUsingPUT**](UsersSubscriptionsApi.md#setPaymentMethodUsingPUT) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/payment-method | Set the payment method to use for a subscription
[**setStatusUsingPUT**](UsersSubscriptionsApi.md#setStatusUsingPUT) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/status | Set the status of a subscription
[**setUserPlanUsingPUT**](UsersSubscriptionsApi.md#setUserPlanUsingPUT) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/plan | Set a new subscription plan for a user


<a name="getSubscriptionDetailsUsingGET"></a>
# **getSubscriptionDetailsUsingGET**
> InventorySubscriptionResource getSubscriptionDetailsUsingGET(userId, inventoryId)

Get details about a user&#39;s subscription

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersSubscriptionsApi;

UsersSubscriptionsApi apiInstance = new UsersSubscriptionsApi();
Integer userId = 56; // Integer | The id of the user
Integer inventoryId = 56; // Integer | The id of the user's inventory
try {
    InventorySubscriptionResource result = apiInstance.getSubscriptionDetailsUsingGET(userId, inventoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersSubscriptionsApi#getSubscriptionDetailsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **inventoryId** | **Integer**| The id of the user&#39;s inventory |

### Return type

[**InventorySubscriptionResource**](InventorySubscriptionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubscriptionDetailsUsingGET1"></a>
# **getSubscriptionDetailsUsingGET1**
> List&lt;InventorySubscriptionResource&gt; getSubscriptionDetailsUsingGET1(userId)

Get details about a user&#39;s subscriptions

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersSubscriptionsApi;

UsersSubscriptionsApi apiInstance = new UsersSubscriptionsApi();
Integer userId = 56; // Integer | The id of the user
try {
    List<InventorySubscriptionResource> result = apiInstance.getSubscriptionDetailsUsingGET1(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersSubscriptionsApi#getSubscriptionDetailsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |

### Return type

[**List&lt;InventorySubscriptionResource&gt;**](InventorySubscriptionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reactivateUsingPOST"></a>
# **reactivateUsingPOST**
> InvoiceResource reactivateUsingPOST(userId, inventoryId, reactivateSubscriptionRequest)

Reactivate a subscription and charge fee

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersSubscriptionsApi;

UsersSubscriptionsApi apiInstance = new UsersSubscriptionsApi();
Integer userId = 56; // Integer | The id of the user
Integer inventoryId = 56; // Integer | The id of the user's inventory
ReactivateSubscriptionRequest reactivateSubscriptionRequest = new ReactivateSubscriptionRequest(); // ReactivateSubscriptionRequest | The reactivate subscription request object inventory
try {
    InvoiceResource result = apiInstance.reactivateUsingPOST(userId, inventoryId, reactivateSubscriptionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersSubscriptionsApi#reactivateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **inventoryId** | **Integer**| The id of the user&#39;s inventory |
 **reactivateSubscriptionRequest** | [**ReactivateSubscriptionRequest**](ReactivateSubscriptionRequest.md)| The reactivate subscription request object inventory | [optional]

### Return type

[**InvoiceResource**](InvoiceResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setBillDateUsingPUT"></a>
# **setBillDateUsingPUT**
> setBillDateUsingPUT(userId, inventoryId, billDate)

Set a new date to bill a subscription on

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersSubscriptionsApi;

UsersSubscriptionsApi apiInstance = new UsersSubscriptionsApi();
Integer userId = 56; // Integer | The id of the user
Integer inventoryId = 56; // Integer | The id of the user's inventory
Long billDate = 789L; // Long | The new bill date. Unix timestamp in seconds
try {
    apiInstance.setBillDateUsingPUT(userId, inventoryId, billDate);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersSubscriptionsApi#setBillDateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **inventoryId** | **Integer**| The id of the user&#39;s inventory |
 **billDate** | **Long**| The new bill date. Unix timestamp in seconds |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setPaymentMethodUsingPUT"></a>
# **setPaymentMethodUsingPUT**
> setPaymentMethodUsingPUT(userId, inventoryId, paymentMethodId)

Set the payment method to use for a subscription

May send null to use floating default

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersSubscriptionsApi;

UsersSubscriptionsApi apiInstance = new UsersSubscriptionsApi();
Integer userId = 56; // Integer | The id of the user
Integer inventoryId = 56; // Integer | The id of the user's inventory
Integer paymentMethodId = 56; // Integer | The id of the payment method
try {
    apiInstance.setPaymentMethodUsingPUT(userId, inventoryId, paymentMethodId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersSubscriptionsApi#setPaymentMethodUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **inventoryId** | **Integer**| The id of the user&#39;s inventory |
 **paymentMethodId** | **Integer**| The id of the payment method | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setStatusUsingPUT"></a>
# **setStatusUsingPUT**
> setStatusUsingPUT(userId, inventoryId, status)

Set the status of a subscription

The body is a json string (put in quotes) that should match a desired invoice status type. Note that the new status may be blocked if the system is not configured to allow the current status to be changed to the new, to enforce proper flow. The default options for statuses are shown below but may be altered for special use cases

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersSubscriptionsApi;

UsersSubscriptionsApi apiInstance = new UsersSubscriptionsApi();
Integer userId = 56; // Integer | The id of the user
Integer inventoryId = 56; // Integer | The id of the user's inventory
String status = "status_example"; // String | The new status for the subscription. Actual options may differ from the indicated set if the invoice status type data has been altered.  Allowable values: ('current', 'canceled', 'stopped', 'payment_failed', 'suspended')
try {
    apiInstance.setStatusUsingPUT(userId, inventoryId, status);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersSubscriptionsApi#setStatusUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **inventoryId** | **Integer**| The id of the user&#39;s inventory |
 **status** | **String**| The new status for the subscription. Actual options may differ from the indicated set if the invoice status type data has been altered.  Allowable values: (&#39;current&#39;, &#39;canceled&#39;, &#39;stopped&#39;, &#39;payment_failed&#39;, &#39;suspended&#39;) |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setUserPlanUsingPUT"></a>
# **setUserPlanUsingPUT**
> setUserPlanUsingPUT(userId, inventoryId, planId)

Set a new subscription plan for a user

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersSubscriptionsApi;

UsersSubscriptionsApi apiInstance = new UsersSubscriptionsApi();
Integer userId = 56; // Integer | The id of the user
Integer inventoryId = 56; // Integer | The id of the user's inventory
String planId = "planId_example"; // String | The id of the new plan. Must be from the same subscription
try {
    apiInstance.setUserPlanUsingPUT(userId, inventoryId, planId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersSubscriptionsApi#setUserPlanUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **inventoryId** | **Integer**| The id of the user&#39;s inventory |
 **planId** | **String**| The id of the new plan. Must be from the same subscription | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

