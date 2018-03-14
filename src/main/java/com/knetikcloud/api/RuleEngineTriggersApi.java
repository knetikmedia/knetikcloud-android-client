package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.PageResourceBreTriggerResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface RuleEngineTriggersApi {
  /**
   * Create a trigger
   * Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_ADMIN
   * @param breTriggerResource The BRE trigger resource object (optional)
   * @return Call&lt;BreTriggerResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bre/triggers")
  Call<BreTriggerResource> createBRETrigger(
    @retrofit2.http.Body BreTriggerResource breTriggerResource
  );

  /**
   * Delete a trigger
   * May fail if there are existing rules against it. Cannot delete core triggers. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_ADMIN
   * @param eventName The trigger event name (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("bre/triggers/{event_name}")
  Call<Void> deleteBRETrigger(
    @retrofit2.http.Path("event_name") String eventName
  );

  /**
   * Get a single trigger
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_USER
   * @param eventName The trigger event name (required)
   * @return Call&lt;BreTriggerResource&gt;
   */
  @GET("bre/triggers/{event_name}")
  Call<BreTriggerResource> getBRETrigger(
    @retrofit2.http.Path("event_name") String eventName
  );

  /**
   * List triggers
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_USER
   * @param filterSystem Filter for triggers that are system triggers when true, or not when false. Leave off for both mixed (optional)
   * @param filterCategory Filter for triggers that are within a specific category (optional)
   * @param filterTags Filter for triggers that have all of the given tags (comma separated list) (optional)
   * @param filterName Filter for triggers that have names containing the given string (optional)
   * @param filterSearch Filter for triggers containing the given words somewhere within name, description and tags (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceBreTriggerResource&gt;
   */
  @GET("bre/triggers")
  Call<PageResourceBreTriggerResource> getBRETriggers(
    @retrofit2.http.Query("filter_system") Boolean filterSystem, @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_tags") String filterTags, @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("filter_search") String filterSearch, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Update a trigger
   * May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_TRIGGERS_ADMIN
   * @param eventName The trigger event name (required)
   * @param breTriggerResource The BRE trigger resource object (optional)
   * @return Call&lt;BreTriggerResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("bre/triggers/{event_name}")
  Call<BreTriggerResource> updateBRETrigger(
    @retrofit2.http.Path("event_name") String eventName, @retrofit2.http.Body BreTriggerResource breTriggerResource
  );

}
