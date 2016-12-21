# UsersInventoryApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemUsingPOST1**](UsersInventoryApi.md#addItemUsingPOST1) | **POST** /users/{id}/inventory | Adds an item to the user inventory
[**createItemUsingPOST**](UsersInventoryApi.md#createItemUsingPOST) | **POST** /entitlements | Create an entitlement item
[**createTemplateUsingPOST3**](UsersInventoryApi.md#createTemplateUsingPOST3) | **POST** /entitlements/templates | Create an entitlement template
[**deleteEntitlementTemplateUsingDELETE**](UsersInventoryApi.md#deleteEntitlementTemplateUsingDELETE) | **DELETE** /entitlements/templates/{id} | Delete an entitlement template
[**deleteItemUsingDELETE**](UsersInventoryApi.md#deleteItemUsingDELETE) | **DELETE** /entitlements/{entitlement_id} | Delete an entitlement item
[**entitlementCheckUsingGET**](UsersInventoryApi.md#entitlementCheckUsingGET) | **GET** /users/{user_id}/entitlements/{item_id}/check | Check for access to an item without consuming
[**entitlementUseUsingPOST**](UsersInventoryApi.md#entitlementUseUsingPOST) | **POST** /users/{user_id}/entitlements/{item_id}/use | Use an item
[**getCurrenciesUsingGET1**](UsersInventoryApi.md#getCurrenciesUsingGET1) | **GET** /entitlements | List and search entitlement items
[**getEntitlementTemplateUsingGET**](UsersInventoryApi.md#getEntitlementTemplateUsingGET) | **GET** /entitlements/templates/{id} | Get a single entitlement template
[**getEntitlementTemplatesUsingGET**](UsersInventoryApi.md#getEntitlementTemplatesUsingGET) | **GET** /entitlements/templates | List and search entitlement templates
[**getInventoryListUsingGET**](UsersInventoryApi.md#getInventoryListUsingGET) | **GET** /inventories | List the user inventory entries for all users
[**getInventoryUsingGET**](UsersInventoryApi.md#getInventoryUsingGET) | **GET** /users/{user_id}/inventory/{id} | Get an inventory entry
[**getItemUsingGET**](UsersInventoryApi.md#getItemUsingGET) | **GET** /entitlements/{entitlement_id} | Get a single entitlement item
[**getUserInventoryListUsingGET**](UsersInventoryApi.md#getUserInventoryListUsingGET) | **GET** /users/{id}/inventory | List the user inventory entries for a given user
[**getUserInventoryLogUsingGET**](UsersInventoryApi.md#getUserInventoryLogUsingGET) | **GET** /users/{user_id}/inventory/{id}/log | List the log entries for this inventory entry.
[**updateItemUsingPUT1**](UsersInventoryApi.md#updateItemUsingPUT1) | **PUT** /entitlements/{entitlement_id} | Update an entitlement item
[**updateTemplateUsingPUT3**](UsersInventoryApi.md#updateTemplateUsingPUT3) | **PUT** /entitlements/templates/{id} | Update an entitlement template
[**updateUserInventoryBehaviorDataUsingPUT**](UsersInventoryApi.md#updateUserInventoryBehaviorDataUsingPUT) | **PUT** /users/{user_id}/inventory/{id}/behavior-data | Set the behavior data for an inventory entry
[**updateUserInventoryExpiresUsingPUT**](UsersInventoryApi.md#updateUserInventoryExpiresUsingPUT) | **PUT** /users/{user_id}/inventory/{id}/expires | Set the expiration date
[**updateUserInventoryStatusUsingPUT**](UsersInventoryApi.md#updateUserInventoryStatusUsingPUT) | **PUT** /users/{user_id}/inventory/{id}/status | Set the status for an inventory entry


<a name="addItemUsingPOST1"></a>
# **addItemUsingPOST1**
> InvoiceResource addItemUsingPOST1(id, userInventoryAddRequest)

Adds an item to the user inventory

The inventory is fulfilled asynchronously UNLESS the invoice is explicitely skipped. Depending on the use case, it might require the client to verify that the entitlement was added after the fact or configure a BRE rule to get a notification in real time

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Integer id = 56; // Integer | The id of the user
UserInventoryAddRequest userInventoryAddRequest = new UserInventoryAddRequest(); // UserInventoryAddRequest | The user inventory add request object
try {
    InvoiceResource result = apiInstance.addItemUsingPOST1(id, userInventoryAddRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#addItemUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the user |
 **userInventoryAddRequest** | [**UserInventoryAddRequest**](UserInventoryAddRequest.md)| The user inventory add request object | [optional]

### Return type

[**InvoiceResource**](InvoiceResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createItemUsingPOST"></a>
# **createItemUsingPOST**
> EntitlementItem createItemUsingPOST(entitlementItem)

Create an entitlement item

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
EntitlementItem entitlementItem = new EntitlementItem(); // EntitlementItem | The entitlement item object
try {
    EntitlementItem result = apiInstance.createItemUsingPOST(entitlementItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#createItemUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entitlementItem** | [**EntitlementItem**](EntitlementItem.md)| The entitlement item object | [optional]

### Return type

[**EntitlementItem**](EntitlementItem.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTemplateUsingPOST3"></a>
# **createTemplateUsingPOST3**
> ItemTemplateResource createTemplateUsingPOST3(template)

Create an entitlement template

Entitlement templates define a type of entitlement and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
ItemTemplateResource template = new ItemTemplateResource(); // ItemTemplateResource | The entitlement template to be created
try {
    ItemTemplateResource result = apiInstance.createTemplateUsingPOST3(template);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#createTemplateUsingPOST3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template** | [**ItemTemplateResource**](ItemTemplateResource.md)| The entitlement template to be created | [optional]

### Return type

[**ItemTemplateResource**](ItemTemplateResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEntitlementTemplateUsingDELETE"></a>
# **deleteEntitlementTemplateUsingDELETE**
> deleteEntitlementTemplateUsingDELETE(id, cascade)

Delete an entitlement template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deleteEntitlementTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#deleteEntitlementTemplateUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **cascade** | **String**| The value needed to delete used templates | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemUsingDELETE"></a>
# **deleteItemUsingDELETE**
> deleteItemUsingDELETE(entitlementId)

Delete an entitlement item

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Integer entitlementId = 56; // Integer | The id of the entitlement
try {
    apiInstance.deleteItemUsingDELETE(entitlementId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#deleteItemUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entitlementId** | **Integer**| The id of the entitlement |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entitlementCheckUsingGET"></a>
# **entitlementCheckUsingGET**
> entitlementCheckUsingGET(userId, itemId, sku)

Check for access to an item without consuming

Useful for pre-check and accounts for all various buisness rules

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
String userId = "userId_example"; // String | The id of the user to check for or 'me' for logged in user
Integer itemId = 56; // Integer | The id of the item
String sku = "sku_example"; // String | The specific sku of an entitlement list addition to check entitlement for. This is of very limited and specific use and should generally be left out
try {
    apiInstance.entitlementCheckUsingGET(userId, itemId, sku);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#entitlementCheckUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user to check for or &#39;me&#39; for logged in user |
 **itemId** | **Integer**| The id of the item |
 **sku** | **String**| The specific sku of an entitlement list addition to check entitlement for. This is of very limited and specific use and should generally be left out | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entitlementUseUsingPOST"></a>
# **entitlementUseUsingPOST**
> entitlementUseUsingPOST(userId, itemId, sku, info)

Use an item

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
String userId = "userId_example"; // String | The id of the user to check for or 'me' for logged in user
Integer itemId = 56; // Integer | The id of the item
String sku = "sku_example"; // String | The specific sku of an entitlement_list addition to check entitlement for. This is of very limited and specific use and should generally be left out
String info = "info_example"; // String | Any additional info to add to the log about this use
try {
    apiInstance.entitlementUseUsingPOST(userId, itemId, sku, info);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#entitlementUseUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user to check for or &#39;me&#39; for logged in user |
 **itemId** | **Integer**| The id of the item |
 **sku** | **String**| The specific sku of an entitlement_list addition to check entitlement for. This is of very limited and specific use and should generally be left out | [optional]
 **info** | **String**| Any additional info to add to the log about this use | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrenciesUsingGET1"></a>
# **getCurrenciesUsingGET1**
> PageResourceEntitlementItem getCurrenciesUsingGET1(size, page, order)

List and search entitlement items

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceEntitlementItem result = apiInstance.getCurrenciesUsingGET1(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#getCurrenciesUsingGET1");
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

[**PageResourceEntitlementItem**](PageResourceEntitlementItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEntitlementTemplateUsingGET"></a>
# **getEntitlementTemplateUsingGET**
> ItemTemplateResource getEntitlementTemplateUsingGET(id)

Get a single entitlement template

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
String id = "id_example"; // String | The id of the template
try {
    ItemTemplateResource result = apiInstance.getEntitlementTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#getEntitlementTemplateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |

### Return type

[**ItemTemplateResource**](ItemTemplateResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEntitlementTemplatesUsingGET"></a>
# **getEntitlementTemplatesUsingGET**
> PageResourceItemTemplateResource getEntitlementTemplatesUsingGET(size, page, order)

List and search entitlement templates

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceItemTemplateResource result = apiInstance.getEntitlementTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#getEntitlementTemplatesUsingGET");
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

[**PageResourceItemTemplateResource**](PageResourceItemTemplateResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInventoryListUsingGET"></a>
# **getInventoryListUsingGET**
> PageResourceUserInventoryResource getInventoryListUsingGET(inactive, size, page, filterItemName, filterUsername, filterGroup, filterDate)

List the user inventory entries for all users

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Boolean inactive = false; // Boolean | If true, accepts inactive user inventories
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String filterItemName = "filterItemName_example"; // String | Filter by items whose name starts with a string
String filterUsername = "filterUsername_example"; // String | Filter by entries owned by the user with the specified username
String filterGroup = "filterGroup_example"; // String | Filter by entries owned by the users in a given group, by unique name
String filterDate = "filterDate_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the log start date, a unix timestamp in seconds. Can be repeated for a range, eg: GT,123,LT,456  Allowed operators: (GT, LT, EQ, GOE, LOE).
try {
    PageResourceUserInventoryResource result = apiInstance.getInventoryListUsingGET(inactive, size, page, filterItemName, filterUsername, filterGroup, filterDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#getInventoryListUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inactive** | **Boolean**| If true, accepts inactive user inventories | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **filterItemName** | **String**| Filter by items whose name starts with a string | [optional]
 **filterUsername** | **String**| Filter by entries owned by the user with the specified username | [optional]
 **filterGroup** | **String**| Filter by entries owned by the users in a given group, by unique name | [optional]
 **filterDate** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the log start date, a unix timestamp in seconds. Can be repeated for a range, eg: GT,123,LT,456  Allowed operators: (GT, LT, EQ, GOE, LOE). | [optional]

### Return type

[**PageResourceUserInventoryResource**](PageResourceUserInventoryResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInventoryUsingGET"></a>
# **getInventoryUsingGET**
> UserInventoryResource getInventoryUsingGET(userId, id)

Get an inventory entry

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Integer userId = 56; // Integer | The id of the inventory owner or 'me' for the logged in user
Integer id = 56; // Integer | The id of the user inventory
try {
    UserInventoryResource result = apiInstance.getInventoryUsingGET(userId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#getInventoryUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the inventory owner or &#39;me&#39; for the logged in user |
 **id** | **Integer**| The id of the user inventory |

### Return type

[**UserInventoryResource**](UserInventoryResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getItemUsingGET"></a>
# **getItemUsingGET**
> EntitlementItem getItemUsingGET(entitlementId)

Get a single entitlement item

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Integer entitlementId = 56; // Integer | The id of the entitlement
try {
    EntitlementItem result = apiInstance.getItemUsingGET(entitlementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#getItemUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entitlementId** | **Integer**| The id of the entitlement |

### Return type

[**EntitlementItem**](EntitlementItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserInventoryListUsingGET"></a>
# **getUserInventoryListUsingGET**
> PageResourceUserInventoryResource getUserInventoryListUsingGET(id, inactive, size, page, filterItemName, filterMinDate, filterMaxDate)

List the user inventory entries for a given user

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Integer id = 56; // Integer | The id of the user
Boolean inactive = false; // Boolean | If true, accepts inactive user inventories
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String filterItemName = "filterItemName_example"; // String | Filter by items whose name starts with a string
Long filterMinDate = 789L; // Long | Filter for inventory added after the specified date, unix timestamp in seconds
Long filterMaxDate = 789L; // Long | Filter for inventory added before the specified date, unix timestamp in seconds
try {
    PageResourceUserInventoryResource result = apiInstance.getUserInventoryListUsingGET(id, inactive, size, page, filterItemName, filterMinDate, filterMaxDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#getUserInventoryListUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the user |
 **inactive** | **Boolean**| If true, accepts inactive user inventories | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **filterItemName** | **String**| Filter by items whose name starts with a string | [optional]
 **filterMinDate** | **Long**| Filter for inventory added after the specified date, unix timestamp in seconds | [optional]
 **filterMaxDate** | **Long**| Filter for inventory added before the specified date, unix timestamp in seconds | [optional]

### Return type

[**PageResourceUserInventoryResource**](PageResourceUserInventoryResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserInventoryLogUsingGET"></a>
# **getUserInventoryLogUsingGET**
> PageResourceUserItemLogResource getUserInventoryLogUsingGET(userId, id, size, page)

List the log entries for this inventory entry.

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
String userId = "userId_example"; // String | The id of the inventory owner or 'me' for the logged in user
Integer id = 56; // Integer | The id of the user inventory
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUserItemLogResource result = apiInstance.getUserInventoryLogUsingGET(userId, id, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#getUserInventoryLogUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the inventory owner or &#39;me&#39; for the logged in user |
 **id** | **Integer**| The id of the user inventory |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUserItemLogResource**](PageResourceUserItemLogResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemUsingPUT1"></a>
# **updateItemUsingPUT1**
> updateItemUsingPUT1(entitlementId, entitlementItem)

Update an entitlement item

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Integer entitlementId = 56; // Integer | The id of the entitlement
EntitlementItem entitlementItem = new EntitlementItem(); // EntitlementItem | The entitlement item object
try {
    apiInstance.updateItemUsingPUT1(entitlementId, entitlementItem);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#updateItemUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entitlementId** | **Integer**| The id of the entitlement |
 **entitlementItem** | [**EntitlementItem**](EntitlementItem.md)| The entitlement item object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTemplateUsingPUT3"></a>
# **updateTemplateUsingPUT3**
> updateTemplateUsingPUT3(id, template)

Update an entitlement template

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
String id = "id_example"; // String | The id of the template
ItemTemplateResource template = new ItemTemplateResource(); // ItemTemplateResource | The updated template
try {
    apiInstance.updateTemplateUsingPUT3(id, template);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#updateTemplateUsingPUT3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **template** | [**ItemTemplateResource**](ItemTemplateResource.md)| The updated template | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserInventoryBehaviorDataUsingPUT"></a>
# **updateUserInventoryBehaviorDataUsingPUT**
> updateUserInventoryBehaviorDataUsingPUT(userId, id, data)

Set the behavior data for an inventory entry

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Integer userId = 56; // Integer | The id of the user
Integer id = 56; // Integer | The id of the user inventory
Object data = null; // Object | The data map
try {
    apiInstance.updateUserInventoryBehaviorDataUsingPUT(userId, id, data);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#updateUserInventoryBehaviorDataUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **id** | **Integer**| The id of the user inventory |
 **data** | **Object**| The data map | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserInventoryExpiresUsingPUT"></a>
# **updateUserInventoryExpiresUsingPUT**
> updateUserInventoryExpiresUsingPUT(userId, id, timestamp)

Set the expiration date

Will change the current grace period for a subscription but not the bill date (possibly even ending before having the chance to re-bill)

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Integer userId = 56; // Integer | user_id
Integer id = 56; // Integer | The id of the user inventory
Long timestamp = 789L; // Long | The new expiration date as a unix timestamp in seconds. May be null (no body).
try {
    apiInstance.updateUserInventoryExpiresUsingPUT(userId, id, timestamp);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#updateUserInventoryExpiresUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| user_id |
 **id** | **Integer**| The id of the user inventory |
 **timestamp** | **Long**| The new expiration date as a unix timestamp in seconds. May be null (no body). | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserInventoryStatusUsingPUT"></a>
# **updateUserInventoryStatusUsingPUT**
> updateUserInventoryStatusUsingPUT(userId, id, inventoryStatus)

Set the status for an inventory entry

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersInventoryApi;

UsersInventoryApi apiInstance = new UsersInventoryApi();
Integer userId = 56; // Integer | The id of the user
Integer id = 56; // Integer | The id of the user inventory
String inventoryStatus = "inventoryStatus_example"; // String | The inventory status object
try {
    apiInstance.updateUserInventoryStatusUsingPUT(userId, id, inventoryStatus);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInventoryApi#updateUserInventoryStatusUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The id of the user |
 **id** | **Integer**| The id of the user inventory |
 **inventoryStatus** | **String**| The inventory status object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

