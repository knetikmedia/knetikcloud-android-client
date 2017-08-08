package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.FattMerchantPaymentMethodRequest;
import com.knetikcloud.model.PaymentMethodResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class PaymentsFattMerchantApi {
  private ApiClient apiClient;

  public PaymentsFattMerchantApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentsFattMerchantApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create or update a FattMerchant payment method for a user
   * Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints.
   * @param request Request containing payment method information for user (optional)
   * @return PaymentMethodResource
   * @throws ApiException if fails to make API call
   */
  public PaymentMethodResource createOrUpdateFattMerchantPaymentMethod(FattMerchantPaymentMethodRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // create path and map variables
    String localVarPath = "/payment/provider/fattmerchant/payment-methods".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
