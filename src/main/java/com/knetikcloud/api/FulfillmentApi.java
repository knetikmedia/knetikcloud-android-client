package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.FulfillmentType;
import com.knetikcloud.model.PageResourceFulfillmentType;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface FulfillmentApi {
  /**
   * Create a fulfillment type
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; FULFILLMENT_ADMIN
   * @param type The fulfillment type (optional)
   * @return Call&lt;FulfillmentType&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/fulfillment/types")
  Call<FulfillmentType> createFulfillmentType(
    @retrofit2.http.Body FulfillmentType type
  );

  /**
   * Delete a fulfillment type
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; FULFILLMENT_ADMIN
   * @param id The id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("store/fulfillment/types/{id}")
  Call<Void> deleteFulfillmentType(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a single fulfillment type
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id (required)
   * @return Call&lt;FulfillmentType&gt;
   */
  @GET("store/fulfillment/types/{id}")
  Call<FulfillmentType> getFulfillmentType(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * List and search fulfillment types
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceFulfillmentType&gt;
   */
  @GET("store/fulfillment/types")
  Call<PageResourceFulfillmentType> getFulfillmentTypes(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a fulfillment type
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; FULFILLMENT_ADMIN
   * @param id The fulfillment id (required)
   * @param fulfillmentType The fulfillment type (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("store/fulfillment/types/{id}")
  Call<Void> updateFulfillmentType(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body FulfillmentType fulfillmentType
  );

}
