package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ExpressionResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RuleEngineExpressionsApi
 */
public class RuleEngineExpressionsApiTest {

    private RuleEngineExpressionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RuleEngineExpressionsApi.class);
    }

    /**
     * Lookup a specific expression
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EXPRESSIONS_USER
     */
    @Test
    public void getBREExpressionTest() {
        String type = null;
        // ExpressionResource response = api.getBREExpression(type);

        // TODO: test validations
    }
    /**
     * Get a list of supported expressions to use in conditions or actions.
     *
     * Each resource contains a type and a definition that are read-only, all the other fields must be provided when using the expression in a rule. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EXPRESSIONS_USER
     */
    @Test
    public void getBREExpressionsTest() {
        String filterTypeGroup = null;
        // List<ExpressionResource> response = api.getBREExpressions(filterTypeGroup);

        // TODO: test validations
    }
    /**
     * Returns the textual representation of an expression
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EXPRESSIONS_USER
     */
    @Test
    public void getExpressionAsTextTest() {
        ExpressionResource expression = null;
        // StringWrapper response = api.getExpressionAsText(expression);

        // TODO: test validations
    }
}
