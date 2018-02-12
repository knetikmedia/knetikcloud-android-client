package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ApplyPaymentRequest;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsAppleApi
 */
public class PaymentsAppleApiTest {

    private PaymentsAppleApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsAppleApi.class);
    }

    /**
     * Pay invoice with Apple receipt
     *
     * Mark an invoice paid using Apple payment receipt. A receipt will only be accepted once and the details of the transaction must match the invoice, including the product_id matching the sku text of the item in the invoice. Returns the transaction ID if successful. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void verifyAppleReceiptTest() {
        ApplyPaymentRequest request = null;
        // String response = api.verifyAppleReceipt(request);

        // TODO: test validations
    }
}
