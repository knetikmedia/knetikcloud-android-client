package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.DispositionCount;
import com.knetikcloud.model.DispositionResource;
import com.knetikcloud.model.PageResourceDispositionResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DispositionsApi
 */
public class DispositionsApiTest {

    private DispositionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DispositionsApi.class);
    }

    /**
     * Add a new disposition
     *
     * 
     */
    @Test
    public void addDispositionTest() {
        DispositionResource disposition = null;
        // DispositionResource response = api.addDisposition(disposition);

        // TODO: test validations
    }
    /**
     * Delete a disposition
     *
     * 
     */
    @Test
    public void deleteDispositionTest() {
        Long id = null;
        // Void response = api.deleteDisposition(id);

        // TODO: test validations
    }
    /**
     * Returns a disposition
     *
     * 
     */
    @Test
    public void getDispositionTest() {
        Long id = null;
        // DispositionResource response = api.getDisposition(id);

        // TODO: test validations
    }
    /**
     * Returns a list of disposition counts
     *
     * 
     */
    @Test
    public void getDispositionCountsTest() {
        String filterContext = null;
        String filterOwner = null;
        // List<DispositionCount> response = api.getDispositionCounts(filterContext, filterOwner);

        // TODO: test validations
    }
    /**
     * Returns a page of dispositions
     *
     * 
     */
    @Test
    public void getDispositionsTest() {
        String filterContext = null;
        String filterOwner = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceDispositionResource response = api.getDispositions(filterContext, filterOwner, size, page, order);

        // TODO: test validations
    }
}
