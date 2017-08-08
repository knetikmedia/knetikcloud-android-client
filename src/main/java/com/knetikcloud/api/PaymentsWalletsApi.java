package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.PageResourceSimpleWallet;
import com.knetikcloud.model.PageResourceWalletTotalResponse;
import com.knetikcloud.model.PageResourceWalletTransactionResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SimpleWallet;
import com.knetikcloud.model.WalletAlterRequest;
import com.knetikcloud.model.WalletTransactionResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class PaymentsWalletsApi {
  private ApiClient apiClient;

  public PaymentsWalletsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentsWalletsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Returns the user&#39;s wallet for the given currency code
   * 
   * @param userId The ID of the user for whom wallet is being retrieved (required)
   * @param currencyCode Currency code of the user&#39;s wallet (required)
   * @return SimpleWallet
   * @throws ApiException if fails to make API call
   */
  public SimpleWallet getUserWallet(Integer userId, String currencyCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserWallet");
    }
    
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyCode' when calling getUserWallet");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/wallets/{currency_code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<SimpleWallet> localVarReturnType = new GenericType<SimpleWallet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve a user&#39;s wallet transactions
   * 
   * @param userId The ID of the user for whom wallet transactions are being retrieved (required)
   * @param currencyCode Currency code of the user&#39;s wallet (required)
   * @param filterType Filter for transactions with specified type (optional)
   * @param filterMaxDate Filter for transactions from no earlier than the specified date as a unix timestamp in seconds (optional)
   * @param filterMinDate Filter for transactions from no later than the specified date as a unix timestamp in seconds (optional)
   * @param filterSign Filter for transactions with amount with the given sign.  Allowable values: (&#39;positive&#39;, &#39;negative&#39;) (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceWalletTransactionResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceWalletTransactionResource getUserWalletTransactions(Integer userId, String currencyCode, String filterType, Long filterMaxDate, Long filterMinDate, String filterSign, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserWalletTransactions");
    }
    
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyCode' when calling getUserWalletTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/wallets/{currency_code}/transactions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_type", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_max_date", filterMaxDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_min_date", filterMinDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_sign", filterSign));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceWalletTransactionResource> localVarReturnType = new GenericType<PageResourceWalletTransactionResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List all of a user&#39;s wallets
   * 
   * @param userId The ID of the user for whom wallets are being retrieved (required)
   * @return List<SimpleWallet>
   * @throws ApiException if fails to make API call
   */
  public List<SimpleWallet> getUserWallets(Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserWallets");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/wallets".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<List<SimpleWallet>> localVarReturnType = new GenericType<List<SimpleWallet>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieves a summation of wallet balances by currency code
   * 
   * @return PageResourceWalletTotalResponse
   * @throws ApiException if fails to make API call
   */
  public PageResourceWalletTotalResponse getWalletBalances() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/wallets/totals".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceWalletTotalResponse> localVarReturnType = new GenericType<PageResourceWalletTotalResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve wallet transactions across the system
   * 
   * @param filterInvoice Filter for transactions from a specific invoice (optional)
   * @param filterType Filter for transactions with specified type (optional)
   * @param filterDate A comma separated string without spaces.  First value is the operator to search on, second value is the log start date, a unix timestamp in seconds. Can be repeated for a range, eg: GT,123,LT,456  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterSign Filter for transactions with amount with the given sign (optional)
   * @param filterUserId Filter for transactions for specific userId (optional)
   * @param filterUsername Filter for transactions for specific username that start with the given string (optional)
   * @param filterDetails Filter for transactions for specific details that start with the given string (optional)
   * @param filterCurrencyCode Filter for transactions for specific currency code (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceWalletTransactionResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceWalletTransactionResource getWalletTransactions(Integer filterInvoice, String filterType, String filterDate, String filterSign, Integer filterUserId, String filterUsername, String filterDetails, String filterCurrencyCode, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/wallets/transactions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_invoice", filterInvoice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_type", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_date", filterDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_sign", filterSign));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_user_id", filterUserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_username", filterUsername));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_details", filterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_currency_code", filterCurrencyCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceWalletTransactionResource> localVarReturnType = new GenericType<PageResourceWalletTransactionResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve a list of wallets across the system
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceSimpleWallet
   * @throws ApiException if fails to make API call
   */
  public PageResourceSimpleWallet getWallets(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/wallets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceSimpleWallet> localVarReturnType = new GenericType<PageResourceSimpleWallet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates the balance for a user&#39;s wallet
   * 
   * @param userId The ID of the user for whom wallet is being modified (required)
   * @param currencyCode Currency code of the user&#39;s wallet (required)
   * @param request The requested balance modification to be made to the user&#39;s wallet (optional)
   * @return WalletTransactionResource
   * @throws ApiException if fails to make API call
   */
  public WalletTransactionResource updateWalletBalance(Integer userId, String currencyCode, WalletAlterRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateWalletBalance");
    }
    
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyCode' when calling updateWalletBalance");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/wallets/{currency_code}/balance".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<WalletTransactionResource> localVarReturnType = new GenericType<WalletTransactionResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
