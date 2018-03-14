package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.BreGlobalResource;
import com.knetikcloud.model.PageResourceBreGlobalResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface RuleEngineGlobalsApi {
  /**
   * Create a global definition
   * Once created you can then use in a custom rule. Note that global definitions cannot be modified or deleted if in use. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_ADMIN
   * @param breGlobalResource The BRE global resource object (optional)
   * @return Call&lt;BreGlobalResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bre/globals/definitions")
  Call<BreGlobalResource> createBREGlobal(
    @retrofit2.http.Body BreGlobalResource breGlobalResource
  );

  /**
   * Delete a global
   * May fail if there are existing rules against it. Cannot delete core globals. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_ADMIN
   * @param id The id of the global definition (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("bre/globals/definitions/{id}")
  Call<Void> deleteBREGlobal(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a single global definition
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_USER
   * @param id The id of the global definition (required)
   * @return Call&lt;BreGlobalResource&gt;
   */
  @GET("bre/globals/definitions/{id}")
  Call<BreGlobalResource> getBREGlobal(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List global definitions
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_USER
   * @param filterSystem Filter for globals that are system globals when true, or not when false. Leave off for both mixed (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceBreGlobalResource&gt;
   */
  @GET("bre/globals/definitions")
  Call<PageResourceBreGlobalResource> getBREGlobals(
    @retrofit2.http.Query("filter_system") Boolean filterSystem, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Update a global definition
   * May fail if new parameters mismatch requirements of existing rules. Cannot update core globals. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_ADMIN
   * @param id The id of the global definition (required)
   * @param breGlobalResource The BRE global resource object (optional)
   * @return Call&lt;BreGlobalResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("bre/globals/definitions/{id}")
  Call<BreGlobalResource> updateBREGlobal(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body BreGlobalResource breGlobalResource
  );

}
