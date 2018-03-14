package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UsersInventoryApi {
  /**
   * Adds an item to the user inventory
   * The inventory is fulfilled asynchronously UNLESS the invoice is explicitely skipped. Depending on the use case, it might require the client to verify that the entitlement was added after the fact or configure a BRE rule to get a notification in real time. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param id The id of the user (required)
   * @param userInventoryAddRequest The user inventory add request object (optional)
   * @return Call&lt;InvoiceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{id}/inventory")
  Call<InvoiceResource> addItemToUserInventory(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body UserInventoryAddRequest userInventoryAddRequest
  );

  /**
   * Check for access to an item without consuming
   * Useful for pre-check and accounts for all various buisness rules. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN or owner
   * @param userId The id of the user to check for or &#39;me&#39; for logged in user (required)
   * @param itemId The id of the item (required)
   * @param sku The specific sku of an entitlement list addition to check entitlement for. This is of very limited and specific use and should generally be left out (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("users/{user_id}/entitlements/{item_id}/check")
  Call<Void> checkUserEntitlementItem(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("item_id") Integer itemId, @retrofit2.http.Query("sku") String sku
  );

  /**
   * Create an entitlement item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param entitlementItem The entitlement item object (optional)
   * @return Call&lt;EntitlementItem&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("entitlements")
  Call<EntitlementItem> createEntitlementItem(
    @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body EntitlementItem entitlementItem
  );

  /**
   * Create an entitlement template
   * Entitlement templates define a type of entitlement and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param template The entitlement template to be created (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("entitlements/templates")
  Call<ItemTemplateResource> createEntitlementTemplate(
    @retrofit2.http.Body ItemTemplateResource template
  );

  /**
   * Delete an entitlement item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param entitlementId The id of the entitlement (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("entitlements/{entitlement_id}")
  Call<Void> deleteEntitlementItem(
    @retrofit2.http.Path("entitlement_id") Integer entitlementId
  );

  /**
   * Delete an entitlement template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("entitlements/templates/{id}")
  Call<Void> deleteEntitlementTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a single entitlement item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param entitlementId The id of the entitlement (required)
   * @return Call&lt;EntitlementItem&gt;
   */
  @GET("entitlements/{entitlement_id}")
  Call<EntitlementItem> getEntitlementItem(
    @retrofit2.http.Path("entitlement_id") Integer entitlementId
  );

  /**
   * List and search entitlement items
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterTemplate Filter for entitlements using a specified template (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceEntitlementItem&gt;
   */
  @GET("entitlements")
  Call<PageResourceEntitlementItem> getEntitlementItems(
    @retrofit2.http.Query("filter_template") String filterTemplate, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single entitlement template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @GET("entitlements/templates/{id}")
  Call<ItemTemplateResource> getEntitlementTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search entitlement templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceItemTemplateResource&gt;
   */
  @GET("entitlements/templates")
  Call<PageResourceItemTemplateResource> getEntitlementTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List the user inventory entries for a given user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN or owner
   * @param id The id of the user (required)
   * @param inactive If true, accepts inactive user inventories (optional, default to false)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param filterItemName Filter by items whose name starts with a string (optional)
   * @param filterItemId Filter by item id (optional)
   * @param filterUsername Filter by entries owned by the user with the specified username (optional)
   * @param filterGroup Filter by entries owned by the users in a given group, by unique name (optional)
   * @param filterDate A comma separated string without spaces.  First value is the operator to search on, second value is the log start date, a unix timestamp in seconds. Can be repeated for a range, eg: GT,123,LT,456  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @return Call&lt;PageResourceUserInventoryResource&gt;
   */
  @GET("users/{id}/inventory")
  Call<PageResourceUserInventoryResource> getUserInventories(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("inactive") Boolean inactive, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("filter_item_name") String filterItemName, @retrofit2.http.Query("filter_item_id") Integer filterItemId, @retrofit2.http.Query("filter_username") String filterUsername, @retrofit2.http.Query("filter_group") String filterGroup, @retrofit2.http.Query("filter_date") String filterDate
  );

  /**
   * Get an inventory entry
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param userId The id of the inventory owner or &#39;me&#39; for the logged in user (required)
   * @param id The id of the user inventory (required)
   * @return Call&lt;UserInventoryResource&gt;
   */
  @GET("users/{user_id}/inventory/{id}")
  Call<UserInventoryResource> getUserInventory(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("id") Integer id
  );

  /**
   * List the log entries for this inventory entry
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN or owner
   * @param userId The id of the inventory owner or &#39;me&#39; for the logged in user (required)
   * @param id The id of the user inventory (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceUserItemLogResource&gt;
   */
  @GET("users/{user_id}/inventory/{id}/log")
  Call<PageResourceUserItemLogResource> getUserInventoryLog(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * List the user inventory entries for all users
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param inactive If true, accepts inactive user inventories (optional, default to false)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param filterItemName Filter by items whose name starts with a string (optional)
   * @param filterItemId Filter by item id (optional)
   * @param filterUsername Filter by entries owned by the user with the specified username (optional)
   * @param filterGroup Filter by entries owned by the users in a given group, by unique name (optional)
   * @param filterDate A comma separated string without spaces.  First value is the operator to search on, second value is the log start date, a unix timestamp in seconds. Can be repeated for a range, eg: GT,123,LT,456  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @return Call&lt;PageResourceUserInventoryResource&gt;
   */
  @GET("inventories")
  Call<PageResourceUserInventoryResource> getUsersInventory(
    @retrofit2.http.Query("inactive") Boolean inactive, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("filter_item_name") String filterItemName, @retrofit2.http.Query("filter_item_id") Integer filterItemId, @retrofit2.http.Query("filter_username") String filterUsername, @retrofit2.http.Query("filter_group") String filterGroup, @retrofit2.http.Query("filter_date") String filterDate
  );

  /**
   * Grant an entitlement
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param userId The id of the user to grant the entitlement to (required)
   * @param grantRequest grantRequest (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/entitlements")
  Call<Void> grantUserEntitlement(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Body EntitlementGrantRequest grantRequest
  );

  /**
   * Update an entitlement item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param entitlementId The id of the entitlement (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param entitlementItem The entitlement item object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("entitlements/{entitlement_id}")
  Call<Void> updateEntitlementItem(
    @retrofit2.http.Path("entitlement_id") Integer entitlementId, @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body EntitlementItem entitlementItem
  );

  /**
   * Update an entitlement template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param template The updated template (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("entitlements/templates/{id}")
  Call<ItemTemplateResource> updateEntitlementTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body ItemTemplateResource template
  );

  /**
   * Set the behavior data for an inventory entry
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param userId The id of the user (required)
   * @param id The id of the user inventory (required)
   * @param data The data map (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/inventory/{id}/behavior-data")
  Call<Void> updateUserInventoryBehaviorData(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body Object data
  );

  /**
   * Set the expiration date
   * Will change the current grace period for a subscription but not the bill date (possibly even ending before having the chance to re-bill). &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param userId user_id (required)
   * @param id The id of the user inventory (required)
   * @param timestamp The new expiration date as a unix timestamp in seconds. May be null (no body). (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/inventory/{id}/expires")
  Call<Void> updateUserInventoryExpires(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body Long timestamp
  );

  /**
   * Set the status for an inventory entry
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param userId The id of the user (required)
   * @param id The id of the user inventory (required)
   * @param inventoryStatus The inventory status object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/inventory/{id}/status")
  Call<Void> updateUserInventoryStatus(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body InventoryStatusWrapper inventoryStatus
  );

  /**
   * Use an item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN or owner
   * @param userId The id of the user to check for or &#39;me&#39; for logged in user (required)
   * @param itemId The id of the item (required)
   * @param sku The specific sku of an entitlement_list addition to check entitlement for. This is of very limited and specific use and should generally be left out (optional)
   * @param info Any additional info to add to the log about this use (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/entitlements/{item_id}/use")
  Call<Void> useUserEntitlementItem(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("item_id") Integer itemId, @retrofit2.http.Query("sku") String sku, @retrofit2.http.Query("info") String info
  );

}
