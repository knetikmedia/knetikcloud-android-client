package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.FattMerchantPaymentMethodRequest;
import com.knetikcloud.model.PaymentMethodResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsFattMerchantApi
 */
public class PaymentsFattMerchantApiTest {

    private PaymentsFattMerchantApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsFattMerchantApi.class);
    }

    /**
     * Create or update a FattMerchant payment method for a user
     *
     * Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints.
     */
    @Test
    public void createOrUpdateFattMerchantPaymentMethodTest() {
        FattMerchantPaymentMethodRequest request = null;
        // PaymentMethodResource response = api.createOrUpdateFattMerchantPaymentMethod(request);

        // TODO: test validations
    }
}
