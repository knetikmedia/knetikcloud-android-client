package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.GooglePaymentRequest;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsGoogleApi
 */
public class PaymentsGoogleApiTest {

    private PaymentsGoogleApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsGoogleApi.class);
    }

    /**
     * Mark an invoice paid with Google
     *
     * Mark an invoice paid with Google. Verifies signature from Google and treats the developerPayload field inside the json payload as the id of the invoice to pay. Returns the transaction ID if successful.
     */
    @Test
    public void handleGooglePaymentTest() {
        GooglePaymentRequest request = null;
        // Integer response = api.handleGooglePayment(request);

        // TODO: test validations
    }
}
