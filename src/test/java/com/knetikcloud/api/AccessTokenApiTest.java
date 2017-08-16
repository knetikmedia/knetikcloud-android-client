package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.OAuth2Resource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessTokenApi
 */
public class AccessTokenApiTest {

    private AccessTokenApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccessTokenApi.class);
    }

    /**
     * Get access token
     *
     * 
     */
    @Test
    public void getOAuthTokenTest() {
        String grantType = null;
        String clientId = null;
        String clientSecret = null;
        String username = null;
        String password = null;
        String token = null;
        String refreshToken = null;
        // OAuth2Resource response = api.getOAuthToken(grantType, clientId, clientSecret, username, password, token, refreshToken);

        // TODO: test validations
    }
}
