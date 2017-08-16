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
     * 
     */
    @Test
    public void createXsollaTokenUrlTest() {
        XsollaPaymentRequest request = null;
        // String response = api.createXsollaTokenUrl(request);

        // TODO: test validations
    }
    /**
     * Receives payment response from Xsolla
     *
     * Only used by Xsolla to call back to JSAPI after processing user payment action
     */
    @Test
    public void receiveXsollaNotificationTest() {
        // Void response = api.receiveXsollaNotification();

        // TODO: test validations
    }
}
