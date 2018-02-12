package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.Version;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilVersionApi
 */
public class UtilVersionApiTest {

    private UtilVersionApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UtilVersionApi.class);
    }

    /**
     * Get current version info
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getVersionTest() {
        // Version response = api.getVersion();

        // TODO: test validations
    }
}
