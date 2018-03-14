package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.BreGlobalResource;
import com.knetikcloud.model.PageResourceBreGlobalResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RuleEngineGlobalsApi
 */
public class RuleEngineGlobalsApiTest {

    private RuleEngineGlobalsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RuleEngineGlobalsApi.class);
    }

    /**
     * Create a global definition
     *
     * Once created you can then use in a custom rule. Note that global definitions cannot be modified or deleted if in use. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_ADMIN
     */
    @Test
    public void createBREGlobalTest() {
        BreGlobalResource breGlobalResource = null;
        // BreGlobalResource response = api.createBREGlobal(breGlobalResource);

        // TODO: test validations
    }
    /**
     * Delete a global
     *
     * May fail if there are existing rules against it. Cannot delete core globals. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_ADMIN
     */
    @Test
    public void deleteBREGlobalTest() {
        String id = null;
        // Void response = api.deleteBREGlobal(id);

        // TODO: test validations
    }
    /**
     * Get a single global definition
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_USER
     */
    @Test
    public void getBREGlobalTest() {
        String id = null;
        // BreGlobalResource response = api.getBREGlobal(id);

        // TODO: test validations
    }
    /**
     * List global definitions
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_USER
     */
    @Test
    public void getBREGlobalsTest() {
        Boolean filterSystem = null;
        Integer size = null;
        Integer page = null;
        // PageResourceBreGlobalResource response = api.getBREGlobals(filterSystem, size, page);

        // TODO: test validations
    }
    /**
     * Update a global definition
     *
     * May fail if new parameters mismatch requirements of existing rules. Cannot update core globals. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_ADMIN
     */
    @Test
    public void updateBREGlobalTest() {
        String id = null;
        BreGlobalResource breGlobalResource = null;
        // BreGlobalResource response = api.updateBREGlobal(id, breGlobalResource);

        // TODO: test validations
    }
}
