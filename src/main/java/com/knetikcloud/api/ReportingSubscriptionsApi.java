package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceBillingReport;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ReportingSubscriptionsApi {
  /**
   * Get a list of available subscription reports in most recent first order
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SUBSCRIPTIONS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceBillingReport&gt;
   */
  @GET("reporting/subscription")
  Call<PageResourceBillingReport> getSubscriptionReports(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

}
