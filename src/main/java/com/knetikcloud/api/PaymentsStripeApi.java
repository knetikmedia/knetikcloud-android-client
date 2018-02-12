package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PaymentMethodResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StripeCreatePaymentMethod;
import com.knetikcloud.model.StripePaymentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PaymentsStripeApi {
  /**
   * Create a Stripe payment method for a user
   * Obtain a token from Stripe, following their examples and documentation. Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints. Ensure that Stripe itself has been configured with the webhook so that invoices are marked paid. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; STRIPE_ADMIN or owner
   * @param request The request to create a Stripe customer with payment info (optional)
   * @return Call&lt;PaymentMethodResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment/provider/stripe/payment-methods")
  Call<PaymentMethodResource> createStripePaymentMethod(
    @retrofit2.http.Body StripeCreatePaymentMethod request
  );

  /**
   * Pay with a single use token
   * Obtain a token from Stripe, following their examples and documentation. Pays an invoice without creating a payment method. Ensure that Stripe itself has been configured with the webhook so that invoices are marked paid. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param request The request to pay an invoice (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment/provider/stripe/payments")
  Call<Void> payStripeInvoice(
    @retrofit2.http.Body StripePaymentRequest request
  );

}
