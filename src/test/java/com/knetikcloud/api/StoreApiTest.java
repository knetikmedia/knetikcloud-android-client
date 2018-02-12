package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.BehaviorDefinitionResource;
import com.knetikcloud.model.InvoiceResource;
import com.knetikcloud.model.PageResourceStoreItem;
import com.knetikcloud.model.PageResourceStoreItemTemplateResource;
import com.knetikcloud.model.QuickBuyRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StoreItem;
import com.knetikcloud.model.StoreItemTemplateResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreApi
 */
public class StoreApiTest {

    private StoreApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StoreApi.class);
    }

    /**
     * Create an item template
     *
     * Item Templates define a type of item and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createItemTemplateTest() {
        StoreItemTemplateResource itemTemplateResource = null;
        // StoreItemTemplateResource response = api.createItemTemplate(itemTemplateResource);

        // TODO: test validations
    }
    /**
     * Create a store item
     *
     * SKUs have to be unique in the entire store. If a duplicate SKU is found, a 400 error is generated and the response will have a \&quot;parameters\&quot; field that is a list of duplicates. A duplicate is an object like {item_id, offending_sku_list}. Ex:&lt;br /&gt; {..., parameters: [[{item: 1, skus: [\&quot;SKU-1\&quot;]}]]}&lt;br /&gt; If an item is brand new and has duplicate SKUs within itself, the item ID will be 0.  Item subclasses are not allowed here, you will have to use their respective endpoints. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; STORE_ADMIN
     */
    @Test
    public void createStoreItemTest() {
        Boolean cascade = null;
        StoreItem storeItem = null;
        // StoreItem response = api.createStoreItem(cascade, storeItem);

        // TODO: test validations
    }
    /**
     * Delete an item template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteItemTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteItemTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Delete a store item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; STORE_ADMIN
     */
    @Test
    public void deleteStoreItemTest() {
        Integer id = null;
        // Void response = api.deleteStoreItem(id);

        // TODO: test validations
    }
    /**
     * List available item behaviors
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getBehaviorsTest() {
        // List<BehaviorDefinitionResource> response = api.getBehaviors();

        // TODO: test validations
    }
    /**
     * Get a single item template
     *
     * Item Templates define a type of item and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void getItemTemplateTest() {
        String id = null;
        // StoreItemTemplateResource response = api.getItemTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search item templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void getItemTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceStoreItemTemplateResource response = api.getItemTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single store item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getStoreItemTest() {
        Integer id = null;
        // StoreItem response = api.getStoreItem(id);

        // TODO: test validations
    }
    /**
     * List and search store items
     *
     * If called without permission STORE_ADMIN the only items marked displayable, whose start and end date are null or appropriate to the current date, and whose geo policy allows the caller&#39;s country will be returned. Similarly skus will be filtered, possibly resulting in an item returned with no skus the user can purchase. br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getStoreItemsTest() {
        String filterNameSearch = null;
        String filterUniqueKey = null;
        Boolean filterPublished = null;
        Boolean filterDisplayable = null;
        String filterStart = null;
        String filterEnd = null;
        String filterStartDate = null;
        String filterStopDate = null;
        String filterSku = null;
        String filterPrice = null;
        String filterTag = null;
        String filterItemsByType = null;
        String filterBundledSkus = null;
        Integer filterVendor = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceStoreItem response = api.getStoreItems(filterNameSearch, filterUniqueKey, filterPublished, filterDisplayable, filterStart, filterEnd, filterStartDate, filterStopDate, filterSku, filterPrice, filterTag, filterItemsByType, filterBundledSkus, filterVendor, size, page, order);

        // TODO: test validations
    }
    /**
     * One-step purchase and pay for a single SKU item from a user&#39;s wallet
     *
     * Used to create and automatically pay an invoice for a single unit of a single SKU from a user&#39;s wallet. SKU must be priced in virtual currency and must not be an item that requires shipping. PAYMENTS_ADMIN permission is required if user ID is specified and is not the ID of the currently logged in user. If invoice price does not match expected price, purchase is aborted. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_USER and owner, or PAYMENTS_ADMIN
     */
    @Test
    public void quickBuyTest() {
        QuickBuyRequest quickBuyRequest = null;
        // InvoiceResource response = api.quickBuy(quickBuyRequest);

        // TODO: test validations
    }
    /**
     * Update an item template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateItemTemplateTest() {
        String id = null;
        StoreItemTemplateResource itemTemplateResource = null;
        // StoreItemTemplateResource response = api.updateItemTemplate(id, itemTemplateResource);

        // TODO: test validations
    }
    /**
     * Update a store item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; STORE_ADMIN
     */
    @Test
    public void updateStoreItemTest() {
        Integer id = null;
        Boolean cascade = null;
        StoreItem storeItem = null;
        // StoreItem response = api.updateStoreItem(id, cascade, storeItem);

        // TODO: test validations
    }
}
