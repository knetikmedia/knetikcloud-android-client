package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.FacebookToken;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SocialFacebookApi
 */
public class SocialFacebookApiTest {

    private SocialFacebookApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SocialFacebookApi.class);
    }

    /**
     * Link facebook account
     *
     * Links the current user account to a facebook account, using the acccess token from facebook. Can also be used to update the access token after it has expired. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; Non-facebook user token
     */
    @Test
    public void linkAccountsTest() {
        FacebookToken facebookToken = null;
        // Void response = api.linkAccounts(facebookToken);

        // TODO: test validations
    }
}
