package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceRevenueCountryReportResource;
import com.knetikcloud.model.PageResourceRevenueProductReportResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.RevenueReportResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ReportingRevenueApi {
  /**
   * Get item revenue info
   * Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_REVENUE_ADMIN
   * @param currencyCode The code for a currency to get sales data for (required)
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @return Call&lt;RevenueReportResource&gt;
   */
  @GET("reporting/revenue/item-sales/{currency_code}")
  Call<RevenueReportResource> getItemRevenue(
    @retrofit2.http.Path("currency_code") String currencyCode, @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate
  );

  /**
   * Get refund revenue info
   * Get basic info about revenue loss from refunds (for all item types), summed up within a time range. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_REVENUE_ADMIN
   * @param currencyCode The code for a currency to get refund data for (required)
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @return Call&lt;RevenueReportResource&gt;
   */
  @GET("reporting/revenue/refunds/{currency_code}")
  Call<RevenueReportResource> getRefundRevenue(
    @retrofit2.http.Path("currency_code") String currencyCode, @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate
  );

  /**
   * Get revenue info by country
   * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_REVENUE_ADMIN
   * @param currencyCode The code for a currency to get sales data for (required)
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceRevenueCountryReportResource&gt;
   */
  @GET("reporting/revenue/countries/{currency_code}")
  Call<PageResourceRevenueCountryReportResource> getRevenueByCountry(
    @retrofit2.http.Path("currency_code") String currencyCode, @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Get revenue info by item
   * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_REVENUE_ADMIN
   * @param currencyCode The code for a currency to get sales data for (required)
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceRevenueProductReportResource&gt;
   */
  @GET("reporting/revenue/products/{currency_code}")
  Call<PageResourceRevenueProductReportResource> getRevenueByItem(
    @retrofit2.http.Path("currency_code") String currencyCode, @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Get subscription revenue info
   * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; REPORTING_REVENUE_ADMIN
   * @param currencyCode The code for a currency to get sales data for (required)
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @return Call&lt;RevenueReportResource&gt;
   */
  @GET("reporting/revenue/subscription-sales/{currency_code}")
  Call<RevenueReportResource> getSubscriptionRevenue(
    @retrofit2.http.Path("currency_code") String currencyCode, @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate
  );

}
