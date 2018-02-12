package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.CreateBillingAgreementRequest;
import com.knetikcloud.model.CreatePayPalPaymentRequest;
import com.knetikcloud.model.FinalizeBillingAgreementRequest;
import com.knetikcloud.model.FinalizePayPalPaymentRequest;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PaymentsPayPalClassicApi {
  /**
   * Create a PayPal Classic billing agreement for the user
   * Returns the token that should be used to forward the user to PayPal so they can accept the agreement. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to create a PayPal billing agreement (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment/provider/paypal/classic/agreements/start")
  Call<String> createPayPalBillingAgreementUrl(
    @retrofit2.http.Body CreateBillingAgreementRequest request
  );

  /**
   * Create a payment token for PayPal express checkout
   * Returns the token that should be used to forward the user to PayPal so they can complete the checkout. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to create a PayPal payment token (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment/provider/paypal/classic/checkout/start")
  Call<String> createPayPalExpressCheckout(
    @retrofit2.http.Body CreatePayPalPaymentRequest request
  );

  /**
   * Finalizes a billing agreement after the user has accepted through PayPal
   * Returns the ID of the new payment method created for the user for the billing agreement. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to finalize a PayPal billing agreement (optional)
   * @return Call&lt;Integer&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment/provider/paypal/classic/agreements/finish")
  Call<Integer> finalizePayPalBillingAgreement(
    @retrofit2.http.Body FinalizeBillingAgreementRequest request
  );

  /**
   * Finalizes a payment after the user has completed checkout with PayPal
   * The invoice will be marked paid/failed by asynchronous IPN callback. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYPAL_CLASSIC_ADMIN or owner
   * @param request The request to finalize the payment (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment/provider/paypal/classic/checkout/finish")
  Call<Void> finalizePayPalCheckout(
    @retrofit2.http.Body FinalizePayPalPaymentRequest request
  );

}
