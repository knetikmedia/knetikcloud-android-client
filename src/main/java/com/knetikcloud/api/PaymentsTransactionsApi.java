package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceTransactionResource;
import com.knetikcloud.model.RefundRequest;
import com.knetikcloud.model.RefundResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TransactionResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PaymentsTransactionsApi {
  /**
   * Get the details for a single transaction
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRANSACTIONS_ADMIN or owner
   * @param id id (required)
   * @return Call&lt;TransactionResource&gt;
   */
  @GET("transactions/{id}")
  Call<TransactionResource> getTransaction(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * List and search transactions
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRANSACTIONS_ADMIN or owner
   * @param filterInvoice Filter for transactions from a specific invoice (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTransactionResource&gt;
   */
  @GET("transactions")
  Call<PageResourceTransactionResource> getTransactions(
    @retrofit2.http.Query("filter_invoice") Integer filterInvoice, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Refund a payment transaction, in full or in part
   * Will not allow for refunding more than the full amount even with multiple partial refunds. Money is refunded to the payment method used to make the original payment. Payment method must support refunds. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_ADMIN
   * @param id The id of the transaction to refund (required)
   * @param request Request containing refund details (optional)
   * @return Call&lt;RefundResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transactions/{id}/refunds")
  Call<RefundResource> refundTransaction(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body RefundRequest request
  );

}
