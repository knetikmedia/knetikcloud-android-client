package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceAggregateInvoiceReportResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ReportingOrdersApi {
  /**
   * Retrieve invoice counts aggregated by time ranges
   * 
   * @param currencyCode The code for a currency to get sales data for (required)
   * @param granularity The time duration to aggregate by (optional, default to day)
   * @param filterPaymentStatus A payment status to filter results by, can be a comma separated list (optional)
   * @param filterFulfillmentStatus An invoice fulfillment status to filter results by, can be a comma separated list (optional)
   * @param startDate The start of the time range to return, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to return, unix timestamp in seconds. Default is end of time (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @return Call&lt;PageResourceAggregateInvoiceReportResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("reporting/orders/count/{currency_code}")
  Call<PageResourceAggregateInvoiceReportResource> getInvoiceReports(
    @retrofit2.http.Path("currency_code") String currencyCode, @retrofit2.http.Query("granularity") String granularity, @retrofit2.http.Query("filter_payment_status") String filterPaymentStatus, @retrofit2.http.Query("filter_fulfillment_status") String filterFulfillmentStatus, @retrofit2.http.Query("start_date") Long startDate, @retrofit2.http.Query("end_date") Long endDate, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

}
