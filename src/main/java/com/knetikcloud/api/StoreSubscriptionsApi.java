package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceSubscriptionResource;
import com.knetikcloud.model.PageResourceSubscriptionTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SubscriptionResource;
import com.knetikcloud.model.SubscriptionTemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StoreSubscriptionsApi {
  /**
   * Creates a subscription item and associated plans
   * 
   * @param subscriptionResource The subscription to be created (optional)
   * @return Call&lt;SubscriptionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("subscriptions")
  Call<SubscriptionResource> createSubscription(
    @retrofit2.http.Body SubscriptionResource subscriptionResource
  );

  /**
   * Create a subscription template
   * Subscription Templates define a type of subscription and the properties they have.
   * @param subscriptionTemplateResource The new subscription template (optional)
   * @return Call&lt;SubscriptionTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("subscriptions/templates")
  Call<SubscriptionTemplateResource> createSubscriptionTemplate(
    @retrofit2.http.Body SubscriptionTemplateResource subscriptionTemplateResource
  );

  /**
   * Delete a subscription plan
   * Must not be locked or a migration target
   * @param id The id of the subscription (required)
   * @param planId The id of the plan (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("subscriptions/{id}/plans/{plan_id}")
  Call<Void> deleteSubscription(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("plan_id") String planId
  );

  /**
   * Delete a subscription template
   * 
   * @param id The id of the template (required)
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("subscriptions/templates/{id}")
  Call<Void> deleteSubscriptionTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Retrieve a single subscription item and associated plans
   * 
   * @param id The id of the subscription (required)
   * @return Call&lt;SubscriptionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("subscriptions/{id}")
  Call<SubscriptionResource> getSubscription(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a single subscription template
   * Subscription Templates define a type of subscription and the properties they have.
   * @param id The id of the template (required)
   * @return Call&lt;SubscriptionTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("subscriptions/templates/{id}")
  Call<SubscriptionTemplateResource> getSubscriptionTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search subscription templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceSubscriptionTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("subscriptions/templates")
  Call<PageResourceSubscriptionTemplateResource> getSubscriptionTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List available subscription items and associated plans
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceSubscriptionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("subscriptions")
  Call<PageResourceSubscriptionResource> getSubscriptions(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Processes subscriptions and charge dues
   * 
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("subscriptions/process")
  Call<Void> processSubscriptions();
    

  /**
   * Updates a subscription item and associated plans
   * Will not remove plans left out
   * @param id The id of the subscription (required)
   * @param subscriptionResource The subscription resource object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("subscriptions/{id}")
  Call<Void> updateSubscription(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body SubscriptionResource subscriptionResource
  );

  /**
   * Update a subscription template
   * 
   * @param id The id of the template (required)
   * @param subscriptionTemplateResource The subscription template resource object (optional)
   * @return Call&lt;SubscriptionTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("subscriptions/templates/{id}")
  Call<SubscriptionTemplateResource> updateSubscriptionTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body SubscriptionTemplateResource subscriptionTemplateResource
  );

}
