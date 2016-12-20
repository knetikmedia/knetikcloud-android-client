# PaymentsWalletsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWalletTotalsUsingGET**](PaymentsWalletsApi.md#getWalletTotalsUsingGET) | **GET** /wallets/totals | Retrieves a summation of wallet balances by currency code
[**getWalletUsingGET**](PaymentsWalletsApi.md#getWalletUsingGET) | **GET** /users/{user_id}/wallets/{currency_code} | Returns the user&#39;s wallet for the given currency code
[**getWalletsUsingGET**](PaymentsWalletsApi.md#getWalletsUsingGET) | **GET** /users/{user_id}/wallets | List all of a user&#39;s wallets
[**getWalletsUsingGET1**](PaymentsWalletsApi.md#getWalletsUsingGET1) | **GET** /wallets | Retrieve a list of wallets across the system
[**transactionHistoryUsingGET**](PaymentsWalletsApi.md#transactionHistoryUsingGET) | **GET** /wallets/transactions | Retrieve wallet transactions across the system
[**updateBalanceUsingPUT**](PaymentsWalletsApi.md#updateBalanceUsingPUT) | **PUT** /users/{user_id}/wallets/{currency_code}/balance | Updates the balance for a user&#39;s wallet
[**userTransactionHistoryUsingGET**](PaymentsWalletsApi.md#userTransactionHistoryUsingGET) | **GET** /users/{user_id}/wallets/{currency_code}/transactions | Retrieve a user&#39;s wallet transactions


<a name="getWalletTotalsUsingGET"></a>
# **getWalletTotalsUsingGET**
> PageWalletTotalResponse getWalletTotalsUsingGET()

Retrieves a summation of wallet balances by currency code

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsWalletsApi;

PaymentsWalletsApi apiInstance = new PaymentsWalletsApi();
try {
    PageWalletTotalResponse result = apiInstance.getWalletTotalsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsWalletsApi#getWalletTotalsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PageWalletTotalResponse**](PageWalletTotalResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getWalletUsingGET"></a>
# **getWalletUsingGET**
> SimpleWallet getWalletUsingGET(userId, currencyCode)

Returns the user&#39;s wallet for the given currency code

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsWalletsApi;

PaymentsWalletsApi apiInstance = new PaymentsWalletsApi();
Integer userId = 56; // Integer | The ID of the user for whom wallet is being retrieved
String currencyCode = "currencyCode_example"; // String | Currency code of the user's wallet
try {
    SimpleWallet result = apiInstance.getWalletUsingGET(userId, currencyCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsWalletsApi#getWalletUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The ID of the user for whom wallet is being retrieved |
 **currencyCode** | **String**| Currency code of the user&#39;s wallet |

### Return type

[**SimpleWallet**](SimpleWallet.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getWalletsUsingGET"></a>
# **getWalletsUsingGET**
> List&lt;SimpleWallet&gt; getWalletsUsingGET(userId)

List all of a user&#39;s wallets

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsWalletsApi;

PaymentsWalletsApi apiInstance = new PaymentsWalletsApi();
Integer userId = 56; // Integer | The ID of the user for whom wallets are being retrieved
try {
    List<SimpleWallet> result = apiInstance.getWalletsUsingGET(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsWalletsApi#getWalletsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The ID of the user for whom wallets are being retrieved |

### Return type

[**List&lt;SimpleWallet&gt;**](SimpleWallet.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getWalletsUsingGET1"></a>
# **getWalletsUsingGET1**
> PageSimpleWallet getWalletsUsingGET1(size, page, order)

Retrieve a list of wallets across the system

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsWalletsApi;

PaymentsWalletsApi apiInstance = new PaymentsWalletsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageSimpleWallet result = apiInstance.getWalletsUsingGET1(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsWalletsApi#getWalletsUsingGET1");
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

[**PageSimpleWallet**](PageSimpleWallet.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="transactionHistoryUsingGET"></a>
# **transactionHistoryUsingGET**
> PageWalletTransactionResource transactionHistoryUsingGET(filterInvoice, filterType, filterMaxDate, filterMinDate, filterSign, filterUserId, filterUsername, filterDetails, filterCurrencyCode, size, page, order)

Retrieve wallet transactions across the system

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsWalletsApi;

PaymentsWalletsApi apiInstance = new PaymentsWalletsApi();
Integer filterInvoice = 56; // Integer | Filter for transactions from a specific invoice
String filterType = "filterType_example"; // String | Filter for transactions with specified type
Long filterMaxDate = 789L; // Long | Filter for transactions from no earlier than the specified date as a unix timestamp in seconds
Long filterMinDate = 789L; // Long | Filter for transactions from no later than the specified date as a unix timestamp in seconds
String filterSign = "filterSign_example"; // String | Filter for transactions with amount with the given sign
Integer filterUserId = 56; // Integer | Filter for transactions for specific userId
String filterUsername = "filterUsername_example"; // String | Filter for transactions for specific username that start with the given string
String filterDetails = "filterDetails_example"; // String | Filter for transactions for specific details that start with the given string
String filterCurrencyCode = "filterCurrencyCode_example"; // String | Filter for transactions for specific currency code
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageWalletTransactionResource result = apiInstance.transactionHistoryUsingGET(filterInvoice, filterType, filterMaxDate, filterMinDate, filterSign, filterUserId, filterUsername, filterDetails, filterCurrencyCode, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsWalletsApi#transactionHistoryUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterInvoice** | **Integer**| Filter for transactions from a specific invoice | [optional]
 **filterType** | **String**| Filter for transactions with specified type | [optional]
 **filterMaxDate** | **Long**| Filter for transactions from no earlier than the specified date as a unix timestamp in seconds | [optional]
 **filterMinDate** | **Long**| Filter for transactions from no later than the specified date as a unix timestamp in seconds | [optional]
 **filterSign** | **String**| Filter for transactions with amount with the given sign | [optional] [enum: positive, negative]
 **filterUserId** | **Integer**| Filter for transactions for specific userId | [optional]
 **filterUsername** | **String**| Filter for transactions for specific username that start with the given string | [optional]
 **filterDetails** | **String**| Filter for transactions for specific details that start with the given string | [optional]
 **filterCurrencyCode** | **String**| Filter for transactions for specific currency code | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageWalletTransactionResource**](PageWalletTransactionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateBalanceUsingPUT"></a>
# **updateBalanceUsingPUT**
> WalletTransactionResource updateBalanceUsingPUT(userId, currencyCode, request)

Updates the balance for a user&#39;s wallet

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsWalletsApi;

PaymentsWalletsApi apiInstance = new PaymentsWalletsApi();
Integer userId = 56; // Integer | The ID of the user for whom wallet is being modified
String currencyCode = "currencyCode_example"; // String | Currency code of the user's wallet
WalletAlterRequest request = new WalletAlterRequest(); // WalletAlterRequest | The requested balance modification to be made to the user's wallet
try {
    WalletTransactionResource result = apiInstance.updateBalanceUsingPUT(userId, currencyCode, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsWalletsApi#updateBalanceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The ID of the user for whom wallet is being modified |
 **currencyCode** | **String**| Currency code of the user&#39;s wallet |
 **request** | [**WalletAlterRequest**](WalletAlterRequest.md)| The requested balance modification to be made to the user&#39;s wallet | [optional]

### Return type

[**WalletTransactionResource**](WalletTransactionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="userTransactionHistoryUsingGET"></a>
# **userTransactionHistoryUsingGET**
> PageWalletTransactionResource userTransactionHistoryUsingGET(userId, currencyCode, filterType, filterMaxDate, filterMinDate, filterSign, size, page, order)

Retrieve a user&#39;s wallet transactions

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsWalletsApi;

PaymentsWalletsApi apiInstance = new PaymentsWalletsApi();
Integer userId = 56; // Integer | The ID of the user for whom wallet transactions are being retrieved
String currencyCode = "currencyCode_example"; // String | Currency code of the user's wallet
String filterType = "filterType_example"; // String | Filter for transactions with specified type
Long filterMaxDate = 789L; // Long | Filter for transactions from no earlier than the specified date as a unix timestamp in seconds
Long filterMinDate = 789L; // Long | Filter for transactions from no later than the specified date as a unix timestamp in seconds
String filterSign = "filterSign_example"; // String | Filter for transactions with amount with the given sign.  Allowable values: ('positive', 'negative')
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageWalletTransactionResource result = apiInstance.userTransactionHistoryUsingGET(userId, currencyCode, filterType, filterMaxDate, filterMinDate, filterSign, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsWalletsApi#userTransactionHistoryUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The ID of the user for whom wallet transactions are being retrieved |
 **currencyCode** | **String**| Currency code of the user&#39;s wallet |
 **filterType** | **String**| Filter for transactions with specified type | [optional]
 **filterMaxDate** | **Long**| Filter for transactions from no earlier than the specified date as a unix timestamp in seconds | [optional]
 **filterMinDate** | **Long**| Filter for transactions from no later than the specified date as a unix timestamp in seconds | [optional]
 **filterSign** | **String**| Filter for transactions with amount with the given sign.  Allowable values: (&#39;positive&#39;, &#39;negative&#39;) | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageWalletTransactionResource**](PageWalletTransactionResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

