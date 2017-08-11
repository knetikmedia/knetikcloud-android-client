package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.OptimalPaymentRequest;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PaymentsOptimalApi {
  /**
   * Initiate silent post with Optimal
   * Will return the url for a hosted payment endpoint to post to. See Optimal documentation for details.
   * @param request The payment request to initiate (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment/provider/optimal/silent")
  Call<String> silentPostOptimal(
    @retrofit2.http.Body OptimalPaymentRequest request
  );

}
