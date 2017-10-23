package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.Result;
import com.knetikcloud.model.XsollaPaymentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PaymentsXsollaApi {
  /**
   * Create a payment token that should be used to forward the user to Xsolla so they can complete payment
   * 
   * @param request The payment request to be sent to XSolla (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment/provider/xsolla/payment")
  Call<String> createXsollaTokenUrl(
    @retrofit2.http.Body XsollaPaymentRequest request
  );

}
