package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.FattMerchantPaymentMethodRequest;
import com.knetikcloud.model.PaymentMethodResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PaymentsFattMerchantApi {
  /**
   * Create or update a FattMerchant payment method for a user
   * Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints.
   * @param request Request containing payment method information for user (optional)
   * @return Call&lt;PaymentMethodResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("payment/provider/fattmerchant/payment-methods")
  Call<PaymentMethodResource> createOrUpdateFattMerchantPaymentMethod(
    @retrofit2.http.Body FattMerchantPaymentMethodRequest request
  );

}
