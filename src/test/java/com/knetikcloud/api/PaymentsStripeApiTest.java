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
     * Obtain a token from Stripe, following their examples and documentation. Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints. Ensure that Stripe itself has been configured with the webhook so that invoices are marked paid. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; STRIPE_ADMIN or owner
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
     * Obtain a token from Stripe, following their examples and documentation. Pays an invoice without creating a payment method. Ensure that Stripe itself has been configured with the webhook so that invoices are marked paid. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void payStripeInvoiceTest() {
        StripePaymentRequest request = null;
        // Void response = api.payStripeInvoice(request);

        // TODO: test validations
    }
}
