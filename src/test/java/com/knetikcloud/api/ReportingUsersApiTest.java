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

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.PageResourceAggregateCountResource;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingUsersApi
 */
@Ignore
public class ReportingUsersApiTest {

    private final ReportingUsersApi api = new ReportingUsersApi();

    
    /**
     * Get user registration info
     *
     * Get user registration counts grouped by time range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserRegistrationsTest() throws ApiException {
        String granularity = null;
        Long startDate = null;
        Long endDate = null;
        Integer size = null;
        Integer page = null;
        PageResourceAggregateCountResource response = api.getUserRegistrations(granularity, startDate, endDate, size, page);

        // TODO: test validations
    }
    
}
