package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.ShippingItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StoreShippingApi {
  /**
   * Create a shipping item
   * A shipping item represents a shipping option and cost. SKUs have to be unique in the entire store.
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param shippingItem The shipping item object (optional)
   * @return Call&lt;ShippingItem&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/shipping")
  Call<ShippingItem> createShippingItem(
    @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body ShippingItem shippingItem
  );

  /**
   * Create a shipping template
   * Shipping Templates define a type of shipping and the properties they have.
   * @param shippingTemplateResource The new shipping template (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/shipping/templates")
  Call<ItemTemplateResource> createShippingTemplate(
    @retrofit2.http.Body ItemTemplateResource shippingTemplateResource
  );

  /**
   * Delete a shipping item
   * 
   * @param id The id of the shipping item (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("store/shipping/{id}")
  Call<Void> deleteShippingItem(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Delete a shipping template
   * 
   * @param id The id of the template (required)
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("store/shipping/templates/{id}")
  Call<Void> deleteShippingTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a single shipping item
   * 
   * @param id The id of the shipping item (required)
   * @return Call&lt;ShippingItem&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("store/shipping/{id}")
  Call<ShippingItem> getShippingItem(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a single shipping template
   * Shipping Templates define a type of shipping and the properties they have.
   * @param id The id of the template (required)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("store/shipping/templates/{id}")
  Call<ItemTemplateResource> getShippingTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search shipping templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("store/shipping/templates")
  Call<PageResourceItemTemplateResource> getShippingTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a shipping item
   * 
   * @param id The id of the shipping item (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param shippingItem The shipping item object (optional)
   * @return Call&lt;ShippingItem&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("store/shipping/{id}")
  Call<ShippingItem> updateShippingItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body ShippingItem shippingItem
  );

  /**
   * Update a shipping template
   * 
   * @param id The id of the template (required)
   * @param shippingTemplateResource The shipping template resource object (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("store/shipping/templates/{id}")
  Call<ItemTemplateResource> updateShippingTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body ItemTemplateResource shippingTemplateResource
  );

}
