package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.InventorySubscriptionResource;
import com.knetikcloud.model.InvoiceResource;
import com.knetikcloud.model.ReactivateSubscriptionRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.SubscriptionPriceOverrideRequest;

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
@Component("com.knetikcloud.api.UsersSubscriptionsApi")
public class UsersSubscriptionsApi {
    private ApiClient apiClient;

    public UsersSubscriptionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsersSubscriptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get details about a user&#39;s subscription
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The id of the user
     * @param inventoryId The id of the user&#39;s inventory
     * @return InventorySubscriptionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InventorySubscriptionResource getUserSubscriptionDetails(Integer userId, Integer inventoryId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserSubscriptionDetails");
        }
        
        // verify the required parameter 'inventoryId' is set
        if (inventoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryId' when calling getUserSubscriptionDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("inventory_id", inventoryId);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/subscriptions/{inventory_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InventorySubscriptionResource> returnType = new ParameterizedTypeReference<InventorySubscriptionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get details about a user&#39;s subscriptions
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The id of the user
     * @return List&lt;InventorySubscriptionResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InventorySubscriptionResource> getUsersSubscriptionDetails(Integer userId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUsersSubscriptionDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/subscriptions").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<InventorySubscriptionResource>> returnType = new ParameterizedTypeReference<List<InventorySubscriptionResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Reactivate a subscription and charge fee
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The id of the user
     * @param inventoryId The id of the user&#39;s inventory
     * @param reactivateSubscriptionRequest The reactivate subscription request object inventory
     * @return InvoiceResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceResource reactivateUserSubscription(Integer userId, Integer inventoryId, ReactivateSubscriptionRequest reactivateSubscriptionRequest) throws RestClientException {
        Object postBody = reactivateSubscriptionRequest;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling reactivateUserSubscription");
        }
        
        // verify the required parameter 'inventoryId' is set
        if (inventoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryId' when calling reactivateUserSubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("inventory_id", inventoryId);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/subscriptions/{inventory_id}/reactivate").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InvoiceResource> returnType = new ParameterizedTypeReference<InvoiceResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set a new date to bill a subscription on
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The id of the user
     * @param inventoryId The id of the user&#39;s inventory
     * @param billDate The new bill date. Unix timestamp in seconds
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setSubscriptionBillDate(Integer userId, Integer inventoryId, Long billDate) throws RestClientException {
        Object postBody = billDate;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling setSubscriptionBillDate");
        }
        
        // verify the required parameter 'inventoryId' is set
        if (inventoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryId' when calling setSubscriptionBillDate");
        }
        
        // verify the required parameter 'billDate' is set
        if (billDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'billDate' when calling setSubscriptionBillDate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("inventory_id", inventoryId);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/subscriptions/{inventory_id}/bill-date").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set the payment method to use for a subscription
     * May send null to use floating default
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The id of the user
     * @param inventoryId The id of the user&#39;s inventory
     * @param paymentMethodId The id of the payment method
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setSubscriptionPaymentMethod(Integer userId, Integer inventoryId, IntWrapper paymentMethodId) throws RestClientException {
        Object postBody = paymentMethodId;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling setSubscriptionPaymentMethod");
        }
        
        // verify the required parameter 'inventoryId' is set
        if (inventoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryId' when calling setSubscriptionPaymentMethod");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("inventory_id", inventoryId);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/subscriptions/{inventory_id}/payment-method").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set the status of a subscription
     * Note that the new status may be blocked if the system is not configured to allow the current status to be changed to the new, to enforce proper flow. The default options for statuses are shown below but may be altered for special use cases
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The id of the user
     * @param inventoryId The id of the user&#39;s inventory
     * @param status The new status for the subscription. Actual options may differ from the indicated set if the invoice status type data has been altered.  Allowable values: (&#39;current&#39;, &#39;canceled&#39;, &#39;stopped&#39;, &#39;payment_failed&#39;, &#39;suspended&#39;)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setSubscriptionStatus(Integer userId, Integer inventoryId, StringWrapper status) throws RestClientException {
        Object postBody = status;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling setSubscriptionStatus");
        }
        
        // verify the required parameter 'inventoryId' is set
        if (inventoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryId' when calling setSubscriptionStatus");
        }
        
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'status' when calling setSubscriptionStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("inventory_id", inventoryId);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/subscriptions/{inventory_id}/status").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set a new subscription plan for a user
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The id of the user
     * @param inventoryId The id of the user&#39;s inventory
     * @param planId The id of the new plan. Must be from the same subscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setUserSubscriptionPlan(Integer userId, Integer inventoryId, StringWrapper planId) throws RestClientException {
        Object postBody = planId;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling setUserSubscriptionPlan");
        }
        
        // verify the required parameter 'inventoryId' is set
        if (inventoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryId' when calling setUserSubscriptionPlan");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("inventory_id", inventoryId);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/subscriptions/{inventory_id}/plan").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set a new subscription price for a user
     * This new price will be what the user is charged at the begining of each new period. This override is specific to the current subscription and will not carry over if they end and later re-subscribe. It will persist if the plan is changed using the setUserSubscriptionPlan endpoint.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The id of the user
     * @param inventoryId The id of the user&#39;s inventory
     * @param theOverrideDetails override
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setUserSubscriptionPrice(Integer userId, Integer inventoryId, SubscriptionPriceOverrideRequest theOverrideDetails) throws RestClientException {
        Object postBody = theOverrideDetails;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling setUserSubscriptionPrice");
        }
        
        // verify the required parameter 'inventoryId' is set
        if (inventoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryId' when calling setUserSubscriptionPrice");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("inventory_id", inventoryId);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/subscriptions/{inventory_id}/price-override").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
