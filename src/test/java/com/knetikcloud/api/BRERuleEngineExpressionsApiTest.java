/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.api;

import com.knetikcloud.model.LookupTypeResource;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BRERuleEngineExpressionsApi
 */
@Ignore
public class BRERuleEngineExpressionsApiTest {

    private final BRERuleEngineExpressionsApi api = new BRERuleEngineExpressionsApi();

    
    /**
     * Get a list of &#39;lookup&#39; type expressions
     *
     * These are expression types that take a second expression as input and produce a value. These can be used in addition to the standard types, like parameter, global and constant (see BRE documentation for details).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBREExpressionsTest() {
        List<LookupTypeResource> response = api.getBREExpressions();

        // TODO: test validations
    }
    
}
