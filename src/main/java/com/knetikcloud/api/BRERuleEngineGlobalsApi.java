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


public interface BRERuleEngineGlobalsApi {
  /**
   * Create a global definition
   * Once created you can then use in a custom rule. Note that global definitions cannot be modified or deleted if in use.
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
   * May fail if there are existing rules against it. Cannot delete core globals
   * @param id The id of the global definition (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("bre/globals/definitions/{id}")
  Call<Void> deleteBREGlobal(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a single global definition
   * 
   * @param id The id of the global definition (required)
   * @return Call&lt;BreGlobalResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("bre/globals/definitions/{id}")
  Call<BreGlobalResource> getBREGlobal(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List global definitions
   * 
   * @param filterSystem Filter for globals that are system globals when true, or not when false. Leave off for both mixed (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceBreGlobalResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("bre/globals/definitions")
  Call<PageResourceBreGlobalResource> getBREGlobals(
    @retrofit2.http.Query("filter_system") Boolean filterSystem, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Update a global definition
   * May fail if new parameters mismatch requirements of existing rules. Cannot update core globals
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
