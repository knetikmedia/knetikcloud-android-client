package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.PageResourceVendorResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.VendorResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreVendorsApi
 */
public class StoreVendorsApiTest {

    private StoreVendorsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StoreVendorsApi.class);
    }

    /**
     * Create a vendor
     *
     * 
     */
    @Test
    public void createVendorTest() {
        VendorResource vendor = null;
        // VendorResource response = api.createVendor(vendor);

        // TODO: test validations
    }
    /**
     * Create a vendor template
     *
     * Vendor Templates define a type of vendor and the properties they have.
     */
    @Test
    public void createVendorTemplateTest() {
        ItemTemplateResource vendorTemplateResource = null;
        // ItemTemplateResource response = api.createVendorTemplate(vendorTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete a vendor
     *
     * 
     */
    @Test
    public void deleteVendorTest() {
        Integer id = null;
        // Void response = api.deleteVendor(id);

        // TODO: test validations
    }
    /**
     * Delete a vendor template
     *
     * 
     */
    @Test
    public void deleteVendorTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteVendorTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single vendor
     *
     * 
     */
    @Test
    public void getVendorTest() {
        Integer id = null;
        // VendorResource response = api.getVendor(id);

        // TODO: test validations
    }
    /**
     * Get a single vendor template
     *
     * Vendor Templates define a type of vendor and the properties they have.
     */
    @Test
    public void getVendorTemplateTest() {
        String id = null;
        // ItemTemplateResource response = api.getVendorTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search vendor templates
     *
     * 
     */
    @Test
    public void getVendorTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceItemTemplateResource response = api.getVendorTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * List and search vendors
     *
     * 
     */
    @Test
    public void getVendorsTest() {
        String filterName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceVendorResource response = api.getVendors(filterName, size, page, order);

        // TODO: test validations
    }
    /**
     * Update a vendor
     *
     * 
     */
    @Test
    public void updateVendorTest() {
        Integer id = null;
        VendorResource vendor = null;
        // VendorResource response = api.updateVendor(id, vendor);

        // TODO: test validations
    }
    /**
     * Update a vendor template
     *
     * 
     */
    @Test
    public void updateVendorTemplateTest() {
        String id = null;
        ItemTemplateResource vendorTemplateResource = null;
        // ItemTemplateResource response = api.updateVendorTemplate(id, vendorTemplateResource);

        // TODO: test validations
    }
}
