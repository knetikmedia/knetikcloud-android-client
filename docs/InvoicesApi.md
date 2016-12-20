# InvoicesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInvoiceUsingPOST**](InvoicesApi.md#createInvoiceUsingPOST) | **POST** /invoices | Create an invoice
[**getInvoiceHistoryUsingGET**](InvoicesApi.md#getInvoiceHistoryUsingGET) | **GET** /invoices | Retrieve invoices
[**getInvoiceUsingGET**](InvoicesApi.md#getInvoiceUsingGET) | **GET** /invoices/{id} | Retrieve an invoice
[**getLogsUsingGET**](InvoicesApi.md#getLogsUsingGET) | **GET** /invoices/{id}/logs | List invoice logs
[**listFulFillmentStatusesUsingGET**](InvoicesApi.md#listFulFillmentStatusesUsingGET) | **GET** /invoices/fulfillment-statuses | Lists available fulfillment statuses
[**listPaymentStatusesUsingGET**](InvoicesApi.md#listPaymentStatusesUsingGET) | **GET** /invoices/payment-statuses | Lists available payment statuses
[**payInvoiceUsingPOST**](InvoicesApi.md#payInvoiceUsingPOST) | **POST** /invoices/{id}/payments | Trigger payment of an invoice
[**setItemFulfillmentStatusUsingPUT**](InvoicesApi.md#setItemFulfillmentStatusUsingPUT) | **PUT** /invoices/{id}/items/{sku}/fulfillment-status | Set the fulfillment status of an invoice item
[**setOrderNotesUsingPUT**](InvoicesApi.md#setOrderNotesUsingPUT) | **PUT** /invoices/{id}/order-notes | Set the order notes of an invoice
[**setPaymentStatusUsingPUT**](InvoicesApi.md#setPaymentStatusUsingPUT) | **PUT** /invoices/{id}/payment-status | Set the payment status of an invoice
[**updateBillingInfoUsingPUT**](InvoicesApi.md#updateBillingInfoUsingPUT) | **PUT** /invoices/{id}/billing-address | Set or update billing info


<a name="createInvoiceUsingPOST"></a>
# **createInvoiceUsingPOST**
> List&lt;InvoiceResource&gt; createInvoiceUsingPOST(req)

Create an invoice

Create an invoice(s) by providing a cart GUID. Note that there may be multiple invoices created, one per vendor.

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoicesApi;

InvoicesApi apiInstance = new InvoicesApi();
InvoiceCreateRequest req = new InvoiceCreateRequest(); // InvoiceCreateRequest | Invoice to be created
try {
    List<InvoiceResource> result = apiInstance.createInvoiceUsingPOST(req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#createInvoiceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**InvoiceCreateRequest**](InvoiceCreateRequest.md)| Invoice to be created | [optional]

### Return type

[**List&lt;InvoiceResource&gt;**](InvoiceResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInvoiceHistoryUsingGET"></a>
# **getInvoiceHistoryUsingGET**
> PageResourceInvoiceResource getInvoiceHistoryUsingGET(filterUser, filterEmail, filterFulfillmentStatus, filterPaymentStatus, filterItemName, filterCreatedDate, size, page, order)

Retrieve invoices

Without INVOICES_ADMIN permission the results are automatically filtered for only the logged in user&#39;s invoices. It is recomended however that filter_user be added to avoid issues for admin users accidentally getting additional invoices.

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoicesApi;

InvoicesApi apiInstance = new InvoicesApi();
Integer filterUser = 56; // Integer | The id of a user to get invoices for. Automtically added if not being called with admin permissions.
String filterEmail = "filterEmail_example"; // String | Filters invoices by customer's email. Admins only.
String filterFulfillmentStatus = "filterFulfillmentStatus_example"; // String | Filters invoices by fulfillment status type. Can be a comma separated list of statuses
String filterPaymentStatus = "filterPaymentStatus_example"; // String | Filters invoices by payment status type. Can be a comma separated list of statuses
String filterItemName = "filterItemName_example"; // String | Filters invoices by item name containing the given string
String filterCreatedDate = "filterCreatedDate_example"; // String | Filters invoices by creation date. Multiple values possible for range search. Format: filter_created_date=OP,ts&... where OP in (GT, LT, GOE, LOE, EQ) and ts is a unix timestamp in seconds. Ex: filter_created_date=GT,1452154258,LT,1554254874
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceInvoiceResource result = apiInstance.getInvoiceHistoryUsingGET(filterUser, filterEmail, filterFulfillmentStatus, filterPaymentStatus, filterItemName, filterCreatedDate, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#getInvoiceHistoryUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterUser** | **Integer**| The id of a user to get invoices for. Automtically added if not being called with admin permissions. | [optional]
 **filterEmail** | **String**| Filters invoices by customer&#39;s email. Admins only. | [optional]
 **filterFulfillmentStatus** | **String**| Filters invoices by fulfillment status type. Can be a comma separated list of statuses | [optional]
 **filterPaymentStatus** | **String**| Filters invoices by payment status type. Can be a comma separated list of statuses | [optional]
 **filterItemName** | **String**| Filters invoices by item name containing the given string | [optional]
 **filterCreatedDate** | **String**| Filters invoices by creation date. Multiple values possible for range search. Format: filter_created_date&#x3D;OP,ts&amp;... where OP in (GT, LT, GOE, LOE, EQ) and ts is a unix timestamp in seconds. Ex: filter_created_date&#x3D;GT,1452154258,LT,1554254874 | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceInvoiceResource**](PageResourceInvoiceResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInvoiceUsingGET"></a>
# **getInvoiceUsingGET**
> InvoiceResource getInvoiceUsingGET(id, postalCode)

Retrieve an invoice

The postal code associated with the invoice may be required for security purposes if the invoice has one set and the config postal_code_required is set to true. Send &#39;none&#39; if the invoice has no postal code.

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoicesApi;

InvoicesApi apiInstance = new InvoicesApi();
Integer id = 56; // Integer | The id of the invoice
String postalCode = "postalCode_example"; // String | The postal code of the invoice or 'none'.
try {
    InvoiceResource result = apiInstance.getInvoiceUsingGET(id, postalCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#getInvoiceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the invoice |
 **postalCode** | **String**| The postal code of the invoice or &#39;none&#39;. | [optional]

### Return type

[**InvoiceResource**](InvoiceResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLogsUsingGET"></a>
# **getLogsUsingGET**
> PageResourceInvoiceLogEntry getLogsUsingGET(id, size, page)

List invoice logs

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoicesApi;

InvoicesApi apiInstance = new InvoicesApi();
Integer id = 56; // Integer | The id of the invoice
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceInvoiceLogEntry result = apiInstance.getLogsUsingGET(id, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#getLogsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the invoice |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceInvoiceLogEntry**](PageResourceInvoiceLogEntry.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFulFillmentStatusesUsingGET"></a>
# **listFulFillmentStatusesUsingGET**
> List&lt;String&gt; listFulFillmentStatusesUsingGET()

Lists available fulfillment statuses

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoicesApi;

InvoicesApi apiInstance = new InvoicesApi();
try {
    List<String> result = apiInstance.listFulFillmentStatusesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#listFulFillmentStatusesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPaymentStatusesUsingGET"></a>
# **listPaymentStatusesUsingGET**
> List&lt;String&gt; listPaymentStatusesUsingGET()

Lists available payment statuses

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoicesApi;

InvoicesApi apiInstance = new InvoicesApi();
try {
    List<String> result = apiInstance.listPaymentStatusesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#listPaymentStatusesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payInvoiceUsingPOST"></a>
# **payInvoiceUsingPOST**
> payInvoiceUsingPOST(id, request)

Trigger payment of an invoice

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoicesApi;

InvoicesApi apiInstance = new InvoicesApi();
Integer id = 56; // Integer | The id of the invoice
PayBySavedMethodRequest request = new PayBySavedMethodRequest(); // PayBySavedMethodRequest | Payment info
try {
    apiInstance.payInvoiceUsingPOST(id, request);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#payInvoiceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the invoice |
 **request** | [**PayBySavedMethodRequest**](PayBySavedMethodRequest.md)| Payment info | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setItemFulfillmentStatusUsingPUT"></a>
# **setItemFulfillmentStatusUsingPUT**
> setItemFulfillmentStatusUsingPUT(id, sku, status)

Set the fulfillment status of an invoice item

This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which.

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoicesApi;

InvoicesApi apiInstance = new InvoicesApi();
Integer id = 56; // Integer | The id of the invoice
String sku = "sku_example"; // String | The sku of an item in the invoice
String status = "status_example"; // String | The new fulfillment status for the item. Additional options may be available based on configuration.  Allowable values:  'unfulfilled', 'fulfilled', 'not fulfillable', 'failed', 'processing', 'failed_permanent', 'delayed'
try {
    apiInstance.setItemFulfillmentStatusUsingPUT(id, sku, status);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#setItemFulfillmentStatusUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the invoice |
 **sku** | **String**| The sku of an item in the invoice |
 **status** | **String**| The new fulfillment status for the item. Additional options may be available based on configuration.  Allowable values:  &#39;unfulfilled&#39;, &#39;fulfilled&#39;, &#39;not fulfillable&#39;, &#39;failed&#39;, &#39;processing&#39;, &#39;failed_permanent&#39;, &#39;delayed&#39; |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setOrderNotesUsingPUT"></a>
# **setOrderNotesUsingPUT**
> setOrderNotesUsingPUT(id, orderNotes)

Set the order notes of an invoice

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoicesApi;

InvoicesApi apiInstance = new InvoicesApi();
Integer id = 56; // Integer | The id of the invoice
String orderNotes = "orderNotes_example"; // String | Payment status info
try {
    apiInstance.setOrderNotesUsingPUT(id, orderNotes);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#setOrderNotesUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the invoice |
 **orderNotes** | **String**| Payment status info | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setPaymentStatusUsingPUT"></a>
# **setPaymentStatusUsingPUT**
> setPaymentStatusUsingPUT(id, request)

Set the payment status of an invoice

This may trigger fulfillment if setting the status to &#39;paid&#39;. This is mainly intended to support external payment systems that cannot be incorporated into the payment method system. Payment status changes are restricted by a specific flow determining which status can lead to which.

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoicesApi;

InvoicesApi apiInstance = new InvoicesApi();
Integer id = 56; // Integer | The id of the invoice
InvoicePaymentStatusRequest request = new InvoicePaymentStatusRequest(); // InvoicePaymentStatusRequest | Payment status info
try {
    apiInstance.setPaymentStatusUsingPUT(id, request);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#setPaymentStatusUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the invoice |
 **request** | [**InvoicePaymentStatusRequest**](InvoicePaymentStatusRequest.md)| Payment status info | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBillingInfoUsingPUT"></a>
# **updateBillingInfoUsingPUT**
> updateBillingInfoUsingPUT(id, billingInfoRequest)

Set or update billing info

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoicesApi;

InvoicesApi apiInstance = new InvoicesApi();
Integer id = 56; // Integer | The id of the invoice
AddressResource billingInfoRequest = new AddressResource(); // AddressResource | Address info
try {
    apiInstance.updateBillingInfoUsingPUT(id, billingInfoRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#updateBillingInfoUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the invoice |
 **billingInfoRequest** | [**AddressResource**](AddressResource.md)| Address info | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

