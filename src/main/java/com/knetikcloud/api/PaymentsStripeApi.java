package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.PaymentMethodResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StripeCreatePaymentMethod;
import com.knetikcloud.model.StripePaymentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class PaymentsStripeApi {
  private ApiClient apiClient;

  public PaymentsStripeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentsStripeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Stripe payment method for a user
   * Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints.
   * @param request The request to create a Stripe customer with payment info (optional)
   * @return PaymentMethodResource
   * @throws ApiException if fails to make API call
   */
  public PaymentMethodResource createStripePaymentMethod(StripeCreatePaymentMethod request) throws ApiException {
    Object localVarPostBody = request;
    
    // create path and map variables
    String localVarPath = "/payment/provider/stripe/payment-methods".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PaymentMethodResource> localVarReturnType = new GenericType<PaymentMethodResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Pay with a single use token
   * 
   * @param request The request to pay an invoice (optional)
   * @throws ApiException if fails to make API call
   */
  public void payStripeInvoice(StripePaymentRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // create path and map variables
    String localVarPath = "/payment/provider/stripe/payments".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
