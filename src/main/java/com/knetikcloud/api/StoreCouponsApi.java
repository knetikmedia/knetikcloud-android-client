package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.CouponItem;
import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StoreCouponsApi {
  /**
   * Create a coupon item
   * SKUs have to be unique in the entire store. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; COUPONS_ADMIN
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param couponItem The coupon item object (optional)
   * @return Call&lt;CouponItem&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/coupons")
  Call<CouponItem> createCouponItem(
    @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body CouponItem couponItem
  );

  /**
   * Create a coupon template
   * Coupon Templates define a type of coupon and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param couponTemplateResource The new coupon template (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/coupons/templates")
  Call<ItemTemplateResource> createCouponTemplate(
    @retrofit2.http.Body ItemTemplateResource couponTemplateResource
  );

  /**
   * Delete a coupon item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; COUPONS_ADMIN
   * @param id The id of the coupon (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("store/coupons/{id}")
  Call<Void> deleteCouponItem(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Delete a coupon template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("store/coupons/templates/{id}")
  Call<Void> deleteCouponTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a single coupon item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; COUPONS_ADMIN
   * @param id The id of the coupon (required)
   * @return Call&lt;CouponItem&gt;
   */
  @GET("store/coupons/{id}")
  Call<CouponItem> getCouponItem(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a coupon by sku
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param sku A sku of the coupon (required)
   * @return Call&lt;CouponItem&gt;
   */
  @GET("store/coupons/skus/{sku}")
  Call<CouponItem> getCouponItemBySku(
    @retrofit2.http.Path("sku") String sku
  );

  /**
   * Get a single coupon template
   * Coupon Templates define a type of coupon and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or COUPONS_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @GET("store/coupons/templates/{id}")
  Call<ItemTemplateResource> getCouponTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search coupon templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or COUPONS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceItemTemplateResource&gt;
   */
  @GET("store/coupons/templates")
  Call<PageResourceItemTemplateResource> getCouponTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a coupon item
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; COUPONS_ADMIN
   * @param id The id of the coupon (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param couponItem The coupon item object (optional)
   * @return Call&lt;CouponItem&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("store/coupons/{id}")
  Call<CouponItem> updateCouponItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body CouponItem couponItem
  );

  /**
   * Update a coupon template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param couponTemplateResource The coupon template resource object (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("store/coupons/templates/{id}")
  Call<ItemTemplateResource> updateCouponTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body ItemTemplateResource couponTemplateResource
  );

}
