package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilHealthApi
 */
public class UtilHealthApiTest {

    private UtilHealthApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UtilHealthApi.class);
    }

    /**
     * Get health info
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getHealthTest() {
        // Object response = api.getHealth();

        // TODO: test validations
    }
}
