package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.FlagReportResource;
import com.knetikcloud.model.FlagResource;
import com.knetikcloud.model.PageResourceFlagReportResource;
import com.knetikcloud.model.PageResourceFlagResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MediaModerationApi {
  /**
   * Add a flag
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param flagResource The flag resource object (optional)
   * @return Call&lt;FlagResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("moderation/flags")
  Call<FlagResource> addFlag(
    @retrofit2.http.Body FlagResource flagResource
  );

  /**
   * Delete a flag
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN or owner
   * @param contextName The name of the context (optional)
   * @param contextId The id of the context (optional)
   * @param userId The id of the user (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("moderation/flags")
  Call<Void> deleteFlag(
    @retrofit2.http.Query("context_name") String contextName, @retrofit2.http.Query("context_id") String contextId, @retrofit2.http.Query("user_id") Integer userId
  );

  /**
   * Returns a page of flags
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN or owner
   * @param filterContext Filter by flag context (optional)
   * @param filterContextId Filter by flag context ID (optional)
   * @param filterUserId Filter by user ID (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceFlagResource&gt;
   */
  @GET("moderation/flags")
  Call<PageResourceFlagResource> getFlags(
    @retrofit2.http.Query("filter_context") String filterContext, @retrofit2.http.Query("filter_context_id") String filterContextId, @retrofit2.http.Query("filter_user_id") Integer filterUserId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Get a flag report
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
   * @param id The flag report id (required)
   * @return Call&lt;FlagReportResource&gt;
   */
  @GET("moderation/reports/{id}")
  Call<FlagReportResource> getModerationReport(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Returns a page of flag reports
   * Context can be either a free-form string or a pre-defined context name. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
   * @param excludeResolved Ignore resolved context (optional, default to true)
   * @param filterContext Filter by moderation context (optional)
   * @param filterContextId Filter by moderation context ID (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceFlagReportResource&gt;
   */
  @GET("moderation/reports")
  Call<PageResourceFlagReportResource> getModerationReports(
    @retrofit2.http.Query("exclude_resolved") Boolean excludeResolved, @retrofit2.http.Query("filter_context") String filterContext, @retrofit2.http.Query("filter_context_id") String filterContextId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a flag report
   * Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of &#39;banned&#39; you will need to pass the reason. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
   * @param id The flag report id (required)
   * @param flagReportResource The new flag report (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("moderation/reports/{id}")
  Call<Void> updateModerationReport(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body FlagReportResource flagReportResource
  );

}
