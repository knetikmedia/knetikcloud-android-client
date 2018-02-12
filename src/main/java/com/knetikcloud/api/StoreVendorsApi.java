package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.PageResourceVendorResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.VendorResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StoreVendorsApi {
  /**
   * Create a vendor
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
   * @param vendor The vendor (optional)
   * @return Call&lt;VendorResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("vendors")
  Call<VendorResource> createVendor(
    @retrofit2.http.Body VendorResource vendor
  );

  /**
   * Create a vendor template
   * Vendor Templates define a type of vendor and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param vendorTemplateResource The new vendor template (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("vendors/templates")
  Call<ItemTemplateResource> createVendorTemplate(
    @retrofit2.http.Body ItemTemplateResource vendorTemplateResource
  );

  /**
   * Delete a vendor
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
   * @param id The id of the vendor (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("vendors/{id}")
  Call<Void> deleteVendor(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Delete a vendor template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("vendors/templates/{id}")
  Call<Void> deleteVendorTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a single vendor
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the vendor (required)
   * @return Call&lt;VendorResource&gt;
   */
  @GET("vendors/{id}")
  Call<VendorResource> getVendor(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a single vendor template
   * Vendor Templates define a type of vendor and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @GET("vendors/templates/{id}")
  Call<ItemTemplateResource> getVendorTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search vendor templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceItemTemplateResource&gt;
   */
  @GET("vendors/templates")
  Call<PageResourceItemTemplateResource> getVendorTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List and search vendors
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterName Filters vendors by name starting with the text provided in the filter (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceVendorResource&gt;
   */
  @GET("vendors")
  Call<PageResourceVendorResource> getVendors(
    @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a vendor
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
   * @param id The id of the vendor (required)
   * @param vendor The vendor (optional)
   * @return Call&lt;VendorResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("vendors/{id}")
  Call<VendorResource> updateVendor(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body VendorResource vendor
  );

  /**
   * Update a vendor template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param vendorTemplateResource The vendor template resource object (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("vendors/templates/{id}")
  Call<ItemTemplateResource> updateVendorTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body ItemTemplateResource vendorTemplateResource
  );

}
