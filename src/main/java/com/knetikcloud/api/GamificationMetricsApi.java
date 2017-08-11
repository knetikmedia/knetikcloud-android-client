package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.MetricResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface GamificationMetricsApi {
  /**
   * Add a metric
   * Post a new score/stat for an activity occurrence without ending the occurrence itself
   * @param metric The new metric (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("metrics")
  Call<Void> addMetric(
    @retrofit2.http.Body MetricResource metric
  );

}
