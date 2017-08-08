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

import com.knetikcloud.model.PageResourceSimpleReferenceResourceobject;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.VariableTypeResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BRERuleEngineVariablesApi
 */
@Ignore
public class BRERuleEngineVariablesApiTest {

    private final BRERuleEngineVariablesApi api = new BRERuleEngineVariablesApi();

    
    /**
     * Get a list of variable types available
     *
     * Types include integer, string, user and invoice. These are used to qualify trigger parameters and action variables with strong typing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBREVariableTypesTest() {
        List<VariableTypeResource> response = api.getBREVariableTypes();

        // TODO: test validations
    }
    
    /**
     * List valid values for a type
     *
     * Used to lookup users to fill in a user constant for example. Only types marked as enumerable are suppoorted here.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBREVariableValuesTest() {
        String name = null;
        String filterName = null;
        Integer size = null;
        Integer page = null;
        PageResourceSimpleReferenceResourceobject response = api.getBREVariableValues(name, filterName, size, page);

        // TODO: test validations
    }
    
}
