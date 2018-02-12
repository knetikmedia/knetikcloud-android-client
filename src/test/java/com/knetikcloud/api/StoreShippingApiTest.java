package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.ShippingItem;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreShippingApi
 */
public class StoreShippingApiTest {

    private StoreShippingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StoreShippingApi.class);
    }

    /**
     * Create a shipping item
     *
     * A shipping item represents a shipping option and cost. SKUs have to be unique in the entire store. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHIPPING_ADMIN
     */
    @Test
    public void createShippingItemTest() {
        Boolean cascade = null;
        ShippingItem shippingItem = null;
        // ShippingItem response = api.createShippingItem(cascade, shippingItem);

        // TODO: test validations
    }
    /**
     * Create a shipping template
     *
     * Shipping Templates define a type of shipping and the properties they have.
     */
    @Test
    public void createShippingTemplateTest() {
        ItemTemplateResource shippingTemplateResource = null;
        // ItemTemplateResource response = api.createShippingTemplate(shippingTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete a shipping item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHIPPING_ADMIN
     */
    @Test
    public void deleteShippingItemTest() {
        Integer id = null;
        // Void response = api.deleteShippingItem(id);

        // TODO: test validations
    }
    /**
     * Delete a shipping template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteShippingTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteShippingTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single shipping item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getShippingItemTest() {
        Integer id = null;
        // ShippingItem response = api.getShippingItem(id);

        // TODO: test validations
    }
    /**
     * Get a single shipping template
     *
     * Shipping Templates define a type of shipping and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or SHIPPING_ADMIN
     */
    @Test
    public void getShippingTemplateTest() {
        String id = null;
        // ItemTemplateResource response = api.getShippingTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search shipping templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or SHIPPING_ADMIN
     */
    @Test
    public void getShippingTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceItemTemplateResource response = api.getShippingTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Update a shipping item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHIPPING_ADMIN
     */
    @Test
    public void updateShippingItemTest() {
        Integer id = null;
        Boolean cascade = null;
        ShippingItem shippingItem = null;
        // ShippingItem response = api.updateShippingItem(id, cascade, shippingItem);

        // TODO: test validations
    }
    /**
     * Update a shipping template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateShippingTemplateTest() {
        String id = null;
        ItemTemplateResource shippingTemplateResource = null;
        // ItemTemplateResource response = api.updateShippingTemplate(id, shippingTemplateResource);

        // TODO: test validations
    }
}
