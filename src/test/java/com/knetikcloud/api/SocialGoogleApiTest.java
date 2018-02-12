package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.GoogleToken;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SocialGoogleApi
 */
public class SocialGoogleApiTest {

    private SocialGoogleApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SocialGoogleApi.class);
    }

    /**
     * Link google account
     *
     * Links the current user account to a google account, using the acccess token from google. Can also be used to update the access token after it has expired. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; Non-google user token
     */
    @Test
    public void linkAccounts1Test() {
        GoogleToken googleToken = null;
        // Void response = api.linkAccounts1(googleToken);

        // TODO: test validations
    }
}
