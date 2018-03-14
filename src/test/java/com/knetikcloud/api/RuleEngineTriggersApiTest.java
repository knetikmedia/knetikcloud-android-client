package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.PageResourceBreTriggerResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RuleEngineTriggersApi
 */
public class RuleEngineTriggersApiTest {

    private RuleEngineTriggersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RuleEngineTriggersApi.class);
    }

    /**
     * Create a trigger
     *
     * Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_ADMIN
     */
    @Test
    public void createBRETriggerTest() {
        BreTriggerResource breTriggerResource = null;
        // BreTriggerResource response = api.createBRETrigger(breTriggerResource);

        // TODO: test validations
    }
    /**
     * Delete a trigger
     *
     * May fail if there are existing rules against it. Cannot delete core triggers. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_ADMIN
     */
    @Test
    public void deleteBRETriggerTest() {
        String eventName = null;
        // Void response = api.deleteBRETrigger(eventName);

        // TODO: test validations
    }
    /**
     * Get a single trigger
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_USER
     */
    @Test
    public void getBRETriggerTest() {
        String eventName = null;
        // BreTriggerResource response = api.getBRETrigger(eventName);

        // TODO: test validations
    }
    /**
     * List triggers
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_USER
     */
    @Test
    public void getBRETriggersTest() {
        Boolean filterSystem = null;
        String filterCategory = null;
        String filterTags = null;
        String filterName = null;
        String filterSearch = null;
        Integer size = null;
        Integer page = null;
        // PageResourceBreTriggerResource response = api.getBRETriggers(filterSystem, filterCategory, filterTags, filterName, filterSearch, size, page);

        // TODO: test validations
    }
    /**
     * Update a trigger
     *
     * May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_ADMIN
     */
    @Test
    public void updateBRETriggerTest() {
        String eventName = null;
        BreTriggerResource breTriggerResource = null;
        // BreTriggerResource response = api.updateBRETrigger(eventName, breTriggerResource);

        // TODO: test validations
    }
}
