package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.XsollaPaymentRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsXsollaApi
 */
public class PaymentsXsollaApiTest {

    private PaymentsXsollaApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsXsollaApi.class);
    }

    /**
     * Create a payment token that should be used to forward the user to Xsolla so they can complete payment
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; XSOLLA_ADMIN or owner
     */
    @Test
    public void createXsollaTokenUrlTest() {
        XsollaPaymentRequest request = null;
        // String response = api.createXsollaTokenUrl(request);

        // TODO: test validations
    }
}
