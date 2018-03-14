package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.EntitlementGrantRequest;
import com.knetikcloud.model.EntitlementItem;
import com.knetikcloud.model.InventoryStatusWrapper;
import com.knetikcloud.model.InvoiceResource;
import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.PageResourceEntitlementItem;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.PageResourceUserInventoryResource;
import com.knetikcloud.model.PageResourceUserItemLogResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserInventoryAddRequest;
import com.knetikcloud.model.UserInventoryResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersInventoryApi
 */
public class UsersInventoryApiTest {

    private UsersInventoryApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersInventoryApi.class);
    }

    /**
     * Adds an item to the user inventory
     *
     * The inventory is fulfilled asynchronously UNLESS the invoice is explicitely skipped. Depending on the use case, it might require the client to verify that the entitlement was added after the fact or configure a BRE rule to get a notification in real time. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void addItemToUserInventoryTest() {
        Integer id = null;
        UserInventoryAddRequest userInventoryAddRequest = null;
        // InvoiceResource response = api.addItemToUserInventory(id, userInventoryAddRequest);

        // TODO: test validations
    }
    /**
     * Check for access to an item without consuming
     *
     * Useful for pre-check and accounts for all various buisness rules. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN or owner
     */
    @Test
    public void checkUserEntitlementItemTest() {
        String userId = null;
        Integer itemId = null;
        String sku = null;
        // Void response = api.checkUserEntitlementItem(userId, itemId, sku);

        // TODO: test validations
    }
    /**
     * Create an entitlement item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void createEntitlementItemTest() {
        Boolean cascade = null;
        EntitlementItem entitlementItem = null;
        // EntitlementItem response = api.createEntitlementItem(cascade, entitlementItem);

        // TODO: test validations
    }
    /**
     * Create an entitlement template
     *
     * Entitlement templates define a type of entitlement and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createEntitlementTemplateTest() {
        ItemTemplateResource template = null;
        // ItemTemplateResource response = api.createEntitlementTemplate(template);

        // TODO: test validations
    }
    /**
     * Delete an entitlement item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void deleteEntitlementItemTest() {
        Integer entitlementId = null;
        // Void response = api.deleteEntitlementItem(entitlementId);

        // TODO: test validations
    }
    /**
     * Delete an entitlement template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteEntitlementTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteEntitlementTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single entitlement item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getEntitlementItemTest() {
        Integer entitlementId = null;
        // EntitlementItem response = api.getEntitlementItem(entitlementId);

        // TODO: test validations
    }
    /**
     * List and search entitlement items
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getEntitlementItemsTest() {
        String filterTemplate = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceEntitlementItem response = api.getEntitlementItems(filterTemplate, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single entitlement template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN
     */
    @Test
    public void getEntitlementTemplateTest() {
        String id = null;
        // ItemTemplateResource response = api.getEntitlementTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search entitlement templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN
     */
    @Test
    public void getEntitlementTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceItemTemplateResource response = api.getEntitlementTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * List the user inventory entries for a given user
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN or owner
     */
    @Test
    public void getUserInventoriesTest() {
        Integer id = null;
        Boolean inactive = null;
        Integer size = null;
        Integer page = null;
        String filterItemName = null;
        Integer filterItemId = null;
        String filterUsername = null;
        String filterGroup = null;
        String filterDate = null;
        // PageResourceUserInventoryResource response = api.getUserInventories(id, inactive, size, page, filterItemName, filterItemId, filterUsername, filterGroup, filterDate);

        // TODO: test validations
    }
    /**
     * Get an inventory entry
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void getUserInventoryTest() {
        String userId = null;
        Integer id = null;
        // UserInventoryResource response = api.getUserInventory(userId, id);

        // TODO: test validations
    }
    /**
     * List the log entries for this inventory entry
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN or owner
     */
    @Test
    public void getUserInventoryLogTest() {
        String userId = null;
        Integer id = null;
        Integer size = null;
        Integer page = null;
        // PageResourceUserItemLogResource response = api.getUserInventoryLog(userId, id, size, page);

        // TODO: test validations
    }
    /**
     * List the user inventory entries for all users
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void getUsersInventoryTest() {
        Boolean inactive = null;
        Integer size = null;
        Integer page = null;
        String filterItemName = null;
        Integer filterItemId = null;
        String filterUsername = null;
        String filterGroup = null;
        String filterDate = null;
        // PageResourceUserInventoryResource response = api.getUsersInventory(inactive, size, page, filterItemName, filterItemId, filterUsername, filterGroup, filterDate);

        // TODO: test validations
    }
    /**
     * Grant an entitlement
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void grantUserEntitlementTest() {
        Integer userId = null;
        EntitlementGrantRequest grantRequest = null;
        // Void response = api.grantUserEntitlement(userId, grantRequest);

        // TODO: test validations
    }
    /**
     * Update an entitlement item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void updateEntitlementItemTest() {
        Integer entitlementId = null;
        Boolean cascade = null;
        EntitlementItem entitlementItem = null;
        // Void response = api.updateEntitlementItem(entitlementId, cascade, entitlementItem);

        // TODO: test validations
    }
    /**
     * Update an entitlement template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateEntitlementTemplateTest() {
        String id = null;
        ItemTemplateResource template = null;
        // ItemTemplateResource response = api.updateEntitlementTemplate(id, template);

        // TODO: test validations
    }
    /**
     * Set the behavior data for an inventory entry
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void updateUserInventoryBehaviorDataTest() {
        Integer userId = null;
        Integer id = null;
        Object data = null;
        // Void response = api.updateUserInventoryBehaviorData(userId, id, data);

        // TODO: test validations
    }
    /**
     * Set the expiration date
     *
     * Will change the current grace period for a subscription but not the bill date (possibly even ending before having the chance to re-bill). &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void updateUserInventoryExpiresTest() {
        Integer userId = null;
        Integer id = null;
        Long timestamp = null;
        // Void response = api.updateUserInventoryExpires(userId, id, timestamp);

        // TODO: test validations
    }
    /**
     * Set the status for an inventory entry
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void updateUserInventoryStatusTest() {
        Integer userId = null;
        Integer id = null;
        InventoryStatusWrapper inventoryStatus = null;
        // Void response = api.updateUserInventoryStatus(userId, id, inventoryStatus);

        // TODO: test validations
    }
    /**
     * Use an item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN or owner
     */
    @Test
    public void useUserEntitlementItemTest() {
        String userId = null;
        Integer itemId = null;
        String sku = null;
        String info = null;
        // Void response = api.useUserEntitlementItem(userId, itemId, sku, info);

        // TODO: test validations
    }
}
