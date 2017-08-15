package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.LookupTypeResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BRERuleEngineExpressionsApi
 */
public class BRERuleEngineExpressionsApiTest {

    private BRERuleEngineExpressionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BRERuleEngineExpressionsApi.class);
    }

    /**
     * Get a list of &#39;lookup&#39; type expressions
     *
     * These are expression types that take a second expression as input and produce a value. These can be used in addition to the standard types, like parameter, global and constant (see BRE documentation for details).
     */
    @Test
    public void getBREExpressionsTest() {
        // List<LookupTypeResource> response = api.getBREExpressions();

        // TODO: test validations
    }
}
