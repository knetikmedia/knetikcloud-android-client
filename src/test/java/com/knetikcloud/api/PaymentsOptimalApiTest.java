package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.OptimalPaymentRequest;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsOptimalApi
 */
public class PaymentsOptimalApiTest {

    private PaymentsOptimalApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsOptimalApi.class);
    }

    /**
     * Initiate silent post with Optimal
     *
     * Will return the url for a hosted payment endpoint to post to. See Optimal documentation for details. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; OPTIMAL_ADMIN or owner
     */
    @Test
    public void silentPostOptimalTest() {
        OptimalPaymentRequest request = null;
        // String response = api.silentPostOptimal(request);

        // TODO: test validations
    }
}
