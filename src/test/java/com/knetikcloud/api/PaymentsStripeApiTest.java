package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PaymentMethodResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StripeCreatePaymentMethod;
import com.knetikcloud.model.StripePaymentRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsStripeApi
 */
public class PaymentsStripeApiTest {

    private PaymentsStripeApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsStripeApi.class);
    }

    /**
     * Create a Stripe payment method for a user
     *
     * Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints.
     */
    @Test
    public void createStripePaymentMethodTest() {
        StripeCreatePaymentMethod request = null;
        // PaymentMethodResource response = api.createStripePaymentMethod(request);

        // TODO: test validations
    }
    /**
     * Pay with a single use token
     *
     * 
     */
    @Test
    public void payStripeInvoiceTest() {
        StripePaymentRequest request = null;
        // Void response = api.payStripeInvoice(request);

        // TODO: test validations
    }
}
