package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.CreateBillingAgreementRequest;
import com.knetikcloud.model.CreatePayPalPaymentRequest;
import com.knetikcloud.model.FinalizeBillingAgreementRequest;
import com.knetikcloud.model.FinalizePayPalPaymentRequest;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T17:55:38.520-04:00")
@Component("com.knetikcloud.api.PaymentsPayPalClassicApi")
public class PaymentsPayPalClassicApi {
    private ApiClient apiClient;

    public PaymentsPayPalClassicApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentsPayPalClassicApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a PayPal Classic billing agreement for the user
     * Returns the token that should be used to forward the user to PayPal so they can accept the agreement.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param request The request to create a PayPal billing agreement
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String createPayPalBillingAgreementUrl(CreateBillingAgreementRequest request) throws RestClientException {
        Object postBody = request;
        
        String path = UriComponentsBuilder.fromPath("/payment/provider/paypal/classic/agreements/start").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a payment token for PayPal express checkout
     * Returns the token that should be used to forward the user to PayPal so they can complete the checkout.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param request The request to create a PayPal payment token
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String createPayPalExpressCheckout(CreatePayPalPaymentRequest request) throws RestClientException {
        Object postBody = request;
        
        String path = UriComponentsBuilder.fromPath("/payment/provider/paypal/classic/checkout/start").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Finalizes a billing agreement after the user has accepted through PayPal
     * Returns the ID of the new payment method created for the user for the billing agreement.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param request The request to finalize a PayPal billing agreement
     * @return Integer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Integer finalizePayPalBillingAgreement(FinalizeBillingAgreementRequest request) throws RestClientException {
        Object postBody = request;
        
        String path = UriComponentsBuilder.fromPath("/payment/provider/paypal/classic/agreements/finish").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Integer> returnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Finalizes a payment after the user has completed checkout with PayPal
     * The invoice will be marked paid/failed by asynchronous IPN callback.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param request The request to finalize the payment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void finalizePayPalCheckout(FinalizePayPalPaymentRequest request) throws RestClientException {
        Object postBody = request;
        
        String path = UriComponentsBuilder.fromPath("/payment/provider/paypal/classic/checkout/finish").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
