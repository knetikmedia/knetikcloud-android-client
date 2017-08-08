package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

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


public interface PaymentsWalletsApi {
  /**
   * Returns the user&#39;s wallet for the given currency code
   * 
   * @param userId The ID of the user for whom wallet is being retrieved (required)
   * @param currencyCode Currency code of the user&#39;s wallet (required)
   * @return Call&lt;SimpleWallet&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/wallets/{currency_code}")
  Call<SimpleWallet> getUserWallet(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("currency_code") String currencyCode
  );

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
   * @return Call&lt;PageResourceWalletTransactionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/wallets/{currency_code}/transactions")
  Call<PageResourceWalletTransactionResource> getUserWalletTransactions(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("currency_code") String currencyCode, @retrofit2.http.Query("filter_type") String filterType, @retrofit2.http.Query("filter_max_date") Long filterMaxDate, @retrofit2.http.Query("filter_min_date") Long filterMinDate, @retrofit2.http.Query("filter_sign") String filterSign, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List all of a user&#39;s wallets
   * 
   * @param userId The ID of the user for whom wallets are being retrieved (required)
   * @return Call&lt;List&lt;SimpleWallet&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/wallets")
  Call<List<SimpleWallet>> getUserWallets(
    @retrofit2.http.Path("user_id") Integer userId
  );

  /**
   * Retrieves a summation of wallet balances by currency code
   * 
   * @return Call&lt;PageResourceWalletTotalResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("wallets/totals")
  Call<PageResourceWalletTotalResponse> getWalletBalances();
    

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
   * @return Call&lt;PageResourceWalletTransactionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("wallets/transactions")
  Call<PageResourceWalletTransactionResource> getWalletTransactions(
    @retrofit2.http.Query("filter_invoice") Integer filterInvoice, @retrofit2.http.Query("filter_type") String filterType, @retrofit2.http.Query("filter_date") String filterDate, @retrofit2.http.Query("filter_sign") String filterSign, @retrofit2.http.Query("filter_user_id") Integer filterUserId, @retrofit2.http.Query("filter_username") String filterUsername, @retrofit2.http.Query("filter_details") String filterDetails, @retrofit2.http.Query("filter_currency_code") String filterCurrencyCode, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Retrieve a list of wallets across the system
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceSimpleWallet&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("wallets")
  Call<PageResourceSimpleWallet> getWallets(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Updates the balance for a user&#39;s wallet
   * 
   * @param userId The ID of the user for whom wallet is being modified (required)
   * @param currencyCode Currency code of the user&#39;s wallet (required)
   * @param request The requested balance modification to be made to the user&#39;s wallet (optional)
   * @return Call&lt;WalletTransactionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/wallets/{currency_code}/balance")
  Call<WalletTransactionResource> updateWalletBalance(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("currency_code") String currencyCode, @retrofit2.http.Body WalletAlterRequest request
  );

}
