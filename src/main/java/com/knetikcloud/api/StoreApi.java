package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.BehaviorDefinitionResource;
import com.knetikcloud.model.InvoiceResource;
import com.knetikcloud.model.PageResourceStoreItem;
import com.knetikcloud.model.PageResourceStoreItemTemplateResource;
import com.knetikcloud.model.QuickBuyRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StoreItem;
import com.knetikcloud.model.StoreItemTemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StoreApi {
  /**
   * Create an item template
   * Item Templates define a type of item and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param itemTemplateResource The new item template (optional)
   * @return Call&lt;StoreItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/items/templates")
  Call<StoreItemTemplateResource> createItemTemplate(
    @retrofit2.http.Body StoreItemTemplateResource itemTemplateResource
  );

  /**
   * Create a store item
   * SKUs have to be unique in the entire store. If a duplicate SKU is found, a 400 error is generated and the response will have a \&quot;parameters\&quot; field that is a list of duplicates. A duplicate is an object like {item_id, offending_sku_list}. Ex:&lt;br /&gt; {..., parameters: [[{item: 1, skus: [\&quot;SKU-1\&quot;]}]]}&lt;br /&gt; If an item is brand new and has duplicate SKUs within itself, the item ID will be 0.  Item subclasses are not allowed here, you will have to use their respective endpoints. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; STORE_ADMIN
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param storeItem The store item object (optional)
   * @return Call&lt;StoreItem&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/items")
  Call<StoreItem> createStoreItem(
    @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body StoreItem storeItem
  );

  /**
   * Delete an item template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("store/items/templates/{id}")
  Call<Void> deleteItemTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Delete a store item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; STORE_ADMIN
   * @param id The id of the item (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("store/items/{id}")
  Call<Void> deleteStoreItem(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * List available item behaviors
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @return Call&lt;List&lt;BehaviorDefinitionResource&gt;&gt;
   */
  @GET("store/items/behaviors")
  Call<List<BehaviorDefinitionResource>> getBehaviors();
    

  /**
   * Get a single item template
   * Item Templates define a type of item and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;StoreItemTemplateResource&gt;
   */
  @GET("store/items/templates/{id}")
  Call<StoreItemTemplateResource> getItemTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search item templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceStoreItemTemplateResource&gt;
   */
  @GET("store/items/templates")
  Call<PageResourceStoreItemTemplateResource> getItemTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single store item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the item (required)
   * @return Call&lt;StoreItem&gt;
   */
  @GET("store/items/{id}")
  Call<StoreItem> getStoreItem(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * List and search store items
   * If called without permission STORE_ADMIN the only items marked displayable, whose start and end date are null or appropriate to the current date, and whose geo policy allows the caller&#39;s country will be returned. Similarly skus will be filtered, possibly resulting in an item returned with no skus the user can purchase. br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterNameSearch Filter for items whose name starts with a given string. (optional)
   * @param filterUniqueKey Filter for items whose unique_key is a given string. (optional)
   * @param filterPublished Filter for skus that have been published. (optional)
   * @param filterDisplayable Filter for items that are displayable. (optional)
   * @param filterStart A comma separated string without spaces.  First value is the operator to search on, second value is the store start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterEnd A comma separated string without spaces.  First value is the operator to search on, second value is the store end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the sku start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterStopDate A comma separated string without spaces.  First value is the operator to search on, second value is the sku end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterSku Filter for skus whose name starts with a given string. (optional)
   * @param filterPrice A colon separated string without spaces.  First value is the operator to search on, second value is the price of a sku.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterTag A comma separated list without spaces of the names of tags. Will only return items with at least one of the tags. (optional)
   * @param filterItemsByType Filter for item type based on its type hint. (optional)
   * @param filterBundledSkus Filter for skus inside bundles whose name starts with a given string.  Used only when type hint is &#39;bundle_item&#39; (optional)
   * @param filterVendor Filter for items from a given vendor, by id. (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceStoreItem&gt;
   */
  @GET("store/items")
  Call<PageResourceStoreItem> getStoreItems(
    @retrofit2.http.Query("filter_name_search") String filterNameSearch, @retrofit2.http.Query("filter_unique_key") String filterUniqueKey, @retrofit2.http.Query("filter_published") Boolean filterPublished, @retrofit2.http.Query("filter_displayable") Boolean filterDisplayable, @retrofit2.http.Query("filter_start") String filterStart, @retrofit2.http.Query("filter_end") String filterEnd, @retrofit2.http.Query("filter_start_date") String filterStartDate, @retrofit2.http.Query("filter_stop_date") String filterStopDate, @retrofit2.http.Query("filter_sku") String filterSku, @retrofit2.http.Query("filter_price") String filterPrice, @retrofit2.http.Query("filter_tag") String filterTag, @retrofit2.http.Query("filter_items_by_type") String filterItemsByType, @retrofit2.http.Query("filter_bundled_skus") String filterBundledSkus, @retrofit2.http.Query("filter_vendor") Integer filterVendor, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * One-step purchase and pay for a single SKU item from a user&#39;s wallet
   * Used to create and automatically pay an invoice for a single unit of a single SKU from a user&#39;s wallet. SKU must be priced in virtual currency and must not be an item that requires shipping. PAYMENTS_ADMIN permission is required if user ID is specified and is not the ID of the currently logged in user. If invoice price does not match expected price, purchase is aborted. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_USER and owner, or PAYMENTS_ADMIN
   * @param quickBuyRequest Quick buy details (optional)
   * @return Call&lt;InvoiceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/quick-buy")
  Call<InvoiceResource> quickBuy(
    @retrofit2.http.Body QuickBuyRequest quickBuyRequest
  );

  /**
   * Update an item template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param itemTemplateResource The item template resource object (optional)
   * @return Call&lt;StoreItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("store/items/templates/{id}")
  Call<StoreItemTemplateResource> updateItemTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body StoreItemTemplateResource itemTemplateResource
  );

  /**
   * Update a store item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; STORE_ADMIN
   * @param id The id of the item (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param storeItem The store item object (optional)
   * @return Call&lt;StoreItem&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("store/items/{id}")
  Call<StoreItem> updateStoreItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body StoreItem storeItem
  );

}
