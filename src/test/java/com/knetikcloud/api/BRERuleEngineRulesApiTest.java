package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.BooleanResource;
import com.knetikcloud.model.BreRule;
import com.knetikcloud.model.Expressionobject;
import com.knetikcloud.model.PageResourceBreRule;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BRERuleEngineRulesApi
 */
public class BRERuleEngineRulesApiTest {

    private BRERuleEngineRulesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BRERuleEngineRulesApi.class);
    }

    /**
     * Create a rule
     *
     * Rules define which actions to run when a given event verifies the specified condition. Full list of predicates and other type of expressions can be found at GET /bre/expressions/
     */
    @Test
    public void createBRERuleTest() {
        BreRule breRule = null;
        // BreRule response = api.createBRERule(breRule);

        // TODO: test validations
    }
    /**
     * Delete a rule
     *
     * May fail if there are existing rules against it. Cannot delete core rules
     */
    @Test
    public void deleteBRERuleTest() {
        String id = null;
        // Void response = api.deleteBRERule(id);

        // TODO: test validations
    }
    /**
     * Returns a string representation of the provided expression
     *
     * 
     */
    @Test
    public void getBREExpressionAsStringTest() {
        Expressionobject expression = null;
        // String response = api.getBREExpressionAsString(expression);

        // TODO: test validations
    }
    /**
     * Get a single rule
     *
     * 
     */
    @Test
    public void getBRERuleTest() {
        String id = null;
        // BreRule response = api.getBRERule(id);

        // TODO: test validations
    }
    /**
     * List rules
     *
     * 
     */
    @Test
    public void getBRERulesTest() {
        String filterName = null;
        Boolean filterEnabled = null;
        Boolean filterSystem = null;
        String filterTrigger = null;
        String filterAction = null;
        String filterCondition = null;
        Integer size = null;
        Integer page = null;
        // PageResourceBreRule response = api.getBRERules(filterName, filterEnabled, filterSystem, filterTrigger, filterAction, filterCondition, size, page);

        // TODO: test validations
    }
    /**
     * Enable or disable a rule
     *
     * This is helpful for turning off systems rules which cannot be deleted or modified otherwise
     */
    @Test
    public void setBRERuleTest() {
        String id = null;
        BooleanResource enabled = null;
        // Void response = api.setBRERule(id, enabled);

        // TODO: test validations
    }
    /**
     * Update a rule
     *
     * Cannot update system rules
     */
    @Test
    public void updateBRERuleTest() {
        String id = null;
        BreRule breRule = null;
        // BreRule response = api.updateBRERule(id, breRule);

        // TODO: test validations
    }
}
