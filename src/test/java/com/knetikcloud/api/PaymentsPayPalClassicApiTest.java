package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.CreateBillingAgreementRequest;
import com.knetikcloud.model.CreatePayPalPaymentRequest;
import com.knetikcloud.model.FinalizeBillingAgreementRequest;
import com.knetikcloud.model.FinalizePayPalPaymentRequest;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsPayPalClassicApi
 */
public class PaymentsPayPalClassicApiTest {

    private PaymentsPayPalClassicApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsPayPalClassicApi.class);
    }

    /**
     * Create a PayPal Classic billing agreement for the user
     *
     * Returns the token that should be used to forward the user to PayPal so they can accept the agreement.
     */
    @Test
    public void createPayPalBillingAgreementUrlTest() {
        CreateBillingAgreementRequest request = null;
        // String response = api.createPayPalBillingAgreementUrl(request);

        // TODO: test validations
    }
    /**
     * Create a payment token for PayPal express checkout
     *
     * Returns the token that should be used to forward the user to PayPal so they can complete the checkout.
     */
    @Test
    public void createPayPalExpressCheckoutTest() {
        CreatePayPalPaymentRequest request = null;
        // String response = api.createPayPalExpressCheckout(request);

        // TODO: test validations
    }
    /**
     * Finalizes a billing agreement after the user has accepted through PayPal
     *
     * Returns the ID of the new payment method created for the user for the billing agreement.
     */
    @Test
    public void finalizePayPalBillingAgreementTest() {
        FinalizeBillingAgreementRequest request = null;
        // Integer response = api.finalizePayPalBillingAgreement(request);

        // TODO: test validations
    }
    /**
     * Finalizes a payment after the user has completed checkout with PayPal
     *
     * The invoice will be marked paid/failed by asynchronous IPN callback.
     */
    @Test
    public void finalizePayPalCheckoutTest() {
        FinalizePayPalPaymentRequest request = null;
        // Void response = api.finalizePayPalCheckout(request);

        // TODO: test validations
    }
}
