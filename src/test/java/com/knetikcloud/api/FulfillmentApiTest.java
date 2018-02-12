package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.FulfillmentType;
import com.knetikcloud.model.PageResourceFulfillmentType;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FulfillmentApi
 */
public class FulfillmentApiTest {

    private FulfillmentApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FulfillmentApi.class);
    }

    /**
     * Create a fulfillment type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; FULFILLMENT_ADMIN
     */
    @Test
    public void createFulfillmentTypeTest() {
        FulfillmentType type = null;
        // FulfillmentType response = api.createFulfillmentType(type);

        // TODO: test validations
    }
    /**
     * Delete a fulfillment type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; FULFILLMENT_ADMIN
     */
    @Test
    public void deleteFulfillmentTypeTest() {
        Integer id = null;
        // Void response = api.deleteFulfillmentType(id);

        // TODO: test validations
    }
    /**
     * Get a single fulfillment type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getFulfillmentTypeTest() {
        Integer id = null;
        // FulfillmentType response = api.getFulfillmentType(id);

        // TODO: test validations
    }
    /**
     * List and search fulfillment types
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getFulfillmentTypesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceFulfillmentType response = api.getFulfillmentTypes(size, page, order);

        // TODO: test validations
    }
    /**
     * Update a fulfillment type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; FULFILLMENT_ADMIN
     */
    @Test
    public void updateFulfillmentTypeTest() {
        Integer id = null;
        FulfillmentType fulfillmentType = null;
        // Void response = api.updateFulfillmentType(id, fulfillmentType);

        // TODO: test validations
    }
}
