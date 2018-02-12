package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceAggregateCountResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ReportingUsersApi {
  /**
   * Get user registration info
   * Get user registration counts grouped by time range. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_USER_ADMIN
   * @param granularity The time duration to aggregate by (optional, default to day)
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceAggregateCountResource&gt;
   */
  @GET("reporting/users/registrations")
  Call<PageResourceAggregateCountResource> getUserRegistrations(
    @retrofit2.http.Query("granularity") String granularity, @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

}
