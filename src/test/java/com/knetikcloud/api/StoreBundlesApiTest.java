package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.BundleItem;
import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreBundlesApi
 */
public class StoreBundlesApiTest {

    private StoreBundlesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StoreBundlesApi.class);
    }

    /**
     * Create a bundle item
     *
     * The SKU for the bundle itself must be unique and there can only be one SKU.  Extra notes for price_override:  The price of all the items (multiplied by the quantity) must equal the price of the bundle.  With individual prices set, items will be processed individually and can be refunded as such.  However, if all prices are set to null, the price of the bundle will be used and will be treated as one item. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
     */
    @Test
    public void createBundleItemTest() {
        Boolean cascade = null;
        BundleItem bundleItem = null;
        // BundleItem response = api.createBundleItem(cascade, bundleItem);

        // TODO: test validations
    }
    /**
     * Create a bundle template
     *
     * Bundle Templates define a type of bundle and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
     */
    @Test
    public void createBundleTemplateTest() {
        ItemTemplateResource bundleTemplateResource = null;
        // ItemTemplateResource response = api.createBundleTemplate(bundleTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete a bundle item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
     */
    @Test
    public void deleteBundleItemTest() {
        Integer id = null;
        // Void response = api.deleteBundleItem(id);

        // TODO: test validations
    }
    /**
     * Delete a bundle template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
     */
    @Test
    public void deleteBundleTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteBundleTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single bundle item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getBundleItemTest() {
        Integer id = null;
        // BundleItem response = api.getBundleItem(id);

        // TODO: test validations
    }
    /**
     * Get a single bundle template
     *
     * Bundle Templates define a type of bundle and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getBundleTemplateTest() {
        String id = null;
        // ItemTemplateResource response = api.getBundleTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search bundle templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getBundleTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceItemTemplateResource response = api.getBundleTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Update a bundle item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
     */
    @Test
    public void updateBundleItemTest() {
        Integer id = null;
        Boolean cascade = null;
        BundleItem bundleItem = null;
        // BundleItem response = api.updateBundleItem(id, cascade, bundleItem);

        // TODO: test validations
    }
    /**
     * Update a bundle template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
     */
    @Test
    public void updateBundleTemplateTest() {
        String id = null;
        ItemTemplateResource bundleTemplateResource = null;
        // ItemTemplateResource response = api.updateBundleTemplate(id, bundleTemplateResource);

        // TODO: test validations
    }
}
