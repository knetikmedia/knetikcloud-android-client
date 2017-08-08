package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceAggregateCountResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingUsersApi
 */
public class ReportingUsersApiTest {

    private ReportingUsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReportingUsersApi.class);
    }

    /**
     * Get user registration info
     *
     * Get user registration counts grouped by time range
     */
    @Test
    public void getUserRegistrationsTest() {
        String granularity = null;
        Long startDate = null;
        Long endDate = null;
        Integer size = null;
        Integer page = null;
        // PageResourceAggregateCountResource response = api.getUserRegistrations(granularity, startDate, endDate, size, page);

        // TODO: test validations
    }
}
