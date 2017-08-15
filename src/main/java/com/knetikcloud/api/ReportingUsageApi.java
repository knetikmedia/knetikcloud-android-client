package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceUsageInfo;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ReportingUsageApi {
  /**
   * Returns aggregated endpoint usage information by day
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceUsageInfo&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("reporting/usage/day")
  Call<PageResourceUsageInfo> getUsageByDay(
    @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate, @retrofit2.http.Query("combine_endpoints") Boolean combineEndpoints, @retrofit2.http.Query("method") String method, @retrofit2.http.Query("url") String url, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Returns aggregated endpoint usage information by hour
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceUsageInfo&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("reporting/usage/hour")
  Call<PageResourceUsageInfo> getUsageByHour(
    @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate, @retrofit2.http.Query("combine_endpoints") Boolean combineEndpoints, @retrofit2.http.Query("method") String method, @retrofit2.http.Query("url") String url, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Returns aggregated endpoint usage information by minute
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceUsageInfo&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("reporting/usage/minute")
  Call<PageResourceUsageInfo> getUsageByMinute(
    @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate, @retrofit2.http.Query("combine_endpoints") Boolean combineEndpoints, @retrofit2.http.Query("method") String method, @retrofit2.http.Query("url") String url, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Returns aggregated endpoint usage information by month
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceUsageInfo&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("reporting/usage/month")
  Call<PageResourceUsageInfo> getUsageByMonth(
    @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate, @retrofit2.http.Query("combine_endpoints") Boolean combineEndpoints, @retrofit2.http.Query("method") String method, @retrofit2.http.Query("url") String url, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Returns aggregated endpoint usage information by year
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @param combineEndpoints Whether to combine counts from different endpoints. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceUsageInfo&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("reporting/usage/year")
  Call<PageResourceUsageInfo> getUsageByYear(
    @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate, @retrofit2.http.Query("combine_endpoints") Boolean combineEndpoints, @retrofit2.http.Query("method") String method, @retrofit2.http.Query("url") String url, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Returns list of endpoints called (method and url)
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("reporting/usage/endpoints")
  Call<List<String>> getUsageEndpoints(
    @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate
  );

}
