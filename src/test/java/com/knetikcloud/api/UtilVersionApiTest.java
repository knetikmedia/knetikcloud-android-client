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

import com.knetikcloud.model.Result;
import com.knetikcloud.model.Version;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilVersionApi
 */
@Ignore
public class UtilVersionApiTest {

    private final UtilVersionApi api = new UtilVersionApi();

    
    /**
     * Get current version info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVersionTest() {
        Version response = api.getVersion();

        // TODO: test validations
    }
    
}
