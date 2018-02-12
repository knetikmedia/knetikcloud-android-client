package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.BundleItem;
import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StoreBundlesApi {
  /**
   * Create a bundle item
   * The SKU for the bundle itself must be unique and there can only be one SKU.  Extra notes for price_override:  The price of all the items (multiplied by the quantity) must equal the price of the bundle.  With individual prices set, items will be processed individually and can be refunded as such.  However, if all prices are set to null, the price of the bundle will be used and will be treated as one item. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param bundleItem The bundle item object (optional)
   * @return Call&lt;BundleItem&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/bundles")
  Call<BundleItem> createBundleItem(
    @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body BundleItem bundleItem
  );

  /**
   * Create a bundle template
   * Bundle Templates define a type of bundle and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
   * @param bundleTemplateResource The new bundle template (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/bundles/templates")
  Call<ItemTemplateResource> createBundleTemplate(
    @retrofit2.http.Body ItemTemplateResource bundleTemplateResource
  );

  /**
   * Delete a bundle item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
   * @param id The id of the bundle (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("store/bundles/{id}")
  Call<Void> deleteBundleItem(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Delete a bundle template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
   * @param id The id of the template (required)
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("store/bundles/templates/{id}")
  Call<Void> deleteBundleTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a single bundle item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the bundle (required)
   * @return Call&lt;BundleItem&gt;
   */
  @GET("store/bundles/{id}")
  Call<BundleItem> getBundleItem(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a single bundle template
   * Bundle Templates define a type of bundle and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the template (required)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @GET("store/bundles/templates/{id}")
  Call<ItemTemplateResource> getBundleTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search bundle templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceItemTemplateResource&gt;
   */
  @GET("store/bundles/templates")
  Call<PageResourceItemTemplateResource> getBundleTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a bundle item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
   * @param id The id of the bundle (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param bundleItem The bundle item object (optional)
   * @return Call&lt;BundleItem&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("store/bundles/{id}")
  Call<BundleItem> updateBundleItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body BundleItem bundleItem
  );

  /**
   * Update a bundle template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BUNDLES_ADMIN
   * @param id The id of the template (required)
   * @param bundleTemplateResource The bundle template resource object (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("store/bundles/templates/{id}")
  Call<ItemTemplateResource> updateBundleTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body ItemTemplateResource bundleTemplateResource
  );

}
