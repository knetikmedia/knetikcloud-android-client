package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceSimpleReferenceResourceobject;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.VariableTypeResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RuleEngineVariablesApi
 */
public class RuleEngineVariablesApiTest {

    private RuleEngineVariablesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RuleEngineVariablesApi.class);
    }

    /**
     * Get a list of variable types available
     *
     * Types include integer, string, user and invoice. These are used to qualify trigger parameters and action variables with strong typing. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_VARIABLES_USER
     */
    @Test
    public void getBREVariableTypesTest() {
        // List<VariableTypeResource> response = api.getBREVariableTypes();

        // TODO: test validations
    }
    /**
     * List valid values for a type
     *
     * Used to lookup users to fill in a user constant for example. Only types marked as enumerable are suppoorted here. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_VARIABLES_USER
     */
    @Test
    public void getBREVariableValuesTest() {
        String name = null;
        String filterName = null;
        Integer size = null;
        Integer page = null;
        // PageResourceSimpleReferenceResourceobject response = api.getBREVariableValues(name, filterName, size, page);

        // TODO: test validations
    }
}
