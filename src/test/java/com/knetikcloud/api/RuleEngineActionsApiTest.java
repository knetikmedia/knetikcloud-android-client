package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ActionResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RuleEngineActionsApi
 */
public class RuleEngineActionsApiTest {

    private RuleEngineActionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RuleEngineActionsApi.class);
    }

    /**
     * Get a list of available actions
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_ACTIONS_USER
     */
    @Test
    public void getBREActionsTest() {
        String filterCategory = null;
        String filterName = null;
        String filterTags = null;
        String filterSearch = null;
        // List<ActionResource> response = api.getBREActions(filterCategory, filterName, filterTags, filterSearch);

        // TODO: test validations
    }
}
