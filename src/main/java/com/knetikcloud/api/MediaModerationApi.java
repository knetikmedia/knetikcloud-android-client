package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.FlagReportResource;
import com.knetikcloud.model.PageResourceFlagReportResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MediaModerationApi {
  /**
   * Get a flag report
   * 
   * @param id The flag report id (required)
   * @return Call&lt;FlagReportResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("moderation/reports/{id}")
  Call<FlagReportResource> getModerationReport(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Returns a page of flag reports
   * Context can be either a free-form string or a pre-defined context name
   * @param excludeResolved Ignore resolved context (optional, default to true)
   * @param filterContext Filter by moderation context (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceFlagReportResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("moderation/reports")
  Call<PageResourceFlagReportResource> getModerationReports(
    @retrofit2.http.Query("exclude_resolved") Boolean excludeResolved, @retrofit2.http.Query("filter_context") String filterContext, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Update a flag report
   * Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of &#39;banned&#39; you will need to pass the reason.
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
