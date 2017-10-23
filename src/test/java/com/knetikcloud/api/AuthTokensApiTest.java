package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.OauthAccessTokenResource;
import com.knetikcloud.model.PageResourceOauthAccessTokenResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthTokensApi
 */
public class AuthTokensApiTest {

    private AuthTokensApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthTokensApi.class);
    }

    /**
     * Delete tokens by username, client id, or both
     *
     * 
     */
    @Test
    public void deleteTokensTest() {
        String username = null;
        String clientId = null;
        // Void response = api.deleteTokens(username, clientId);

        // TODO: test validations
    }
    /**
     * Get a single token by username and client id
     *
     * 
     */
    @Test
    public void getTokenTest() {
        String username = null;
        String clientId = null;
        // OauthAccessTokenResource response = api.getToken(username, clientId);

        // TODO: test validations
    }
    /**
     * List usernames and client ids
     *
     * Token value not shown
     */
    @Test
    public void getTokensTest() {
        String filterClientId = null;
        String filterUsername = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceOauthAccessTokenResource response = api.getTokens(filterClientId, filterUsername, size, page, order);

        // TODO: test validations
    }
}
