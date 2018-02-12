package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceLocationLogResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TokenDetailsResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilSecurityApi
 */
public class UtilSecurityApiTest {

    private UtilSecurityApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UtilSecurityApi.class);
    }

    /**
     * Returns the authentication log for a user
     *
     * A log entry is recorded everytime a user requests a new token. Standard pagination available. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SECURITY_ADMIN
     */
    @Test
    public void getUserLocationLogTest() {
        Integer userId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceLocationLogResource response = api.getUserLocationLog(userId, size, page, order);

        // TODO: test validations
    }
    /**
     * Returns the authentication token details. Use /users endpoint for detailed user&#39;s info
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SECURITY_ADMIN
     */
    @Test
    public void getUserTokenDetailsTest() {
        // TokenDetailsResource response = api.getUserTokenDetails();

        // TODO: test validations
    }
}
