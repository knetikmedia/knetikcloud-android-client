package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceTransactionResource;
import com.knetikcloud.model.RefundRequest;
import com.knetikcloud.model.RefundResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TransactionResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsTransactionsApi
 */
public class PaymentsTransactionsApiTest {

    private PaymentsTransactionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsTransactionsApi.class);
    }

    /**
     * Get the details for a single transaction
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRANSACTIONS_ADMIN or owner
     */
    @Test
    public void getTransactionTest() {
        Integer id = null;
        // TransactionResource response = api.getTransaction(id);

        // TODO: test validations
    }
    /**
     * List and search transactions
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRANSACTIONS_ADMIN or owner
     */
    @Test
    public void getTransactionsTest() {
        Integer filterInvoice = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTransactionResource response = api.getTransactions(filterInvoice, size, page, order);

        // TODO: test validations
    }
    /**
     * Refund a payment transaction, in full or in part
     *
     * Will not allow for refunding more than the full amount even with multiple partial refunds. Money is refunded to the payment method used to make the original payment. Payment method must support refunds. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_ADMIN
     */
    @Test
    public void refundTransactionTest() {
        Integer id = null;
        RefundRequest request = null;
        // RefundResource response = api.refundTransaction(id, request);

        // TODO: test validations
    }
}
