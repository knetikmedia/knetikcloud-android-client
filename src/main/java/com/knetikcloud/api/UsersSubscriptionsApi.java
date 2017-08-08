package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class UsersSubscriptionsApi {
  private ApiClient apiClient;

  public UsersSubscriptionsApi() {
    this(Configuration.getDefaultApiClient());
  }

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
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @return InventorySubscriptionResource
   * @throws ApiException if fails to make API call
   */
  public InventorySubscriptionResource getUserSubscriptionDetails(Integer userId, Integer inventoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserSubscriptionDetails");
    }
    
    // verify the required parameter 'inventoryId' is set
    if (inventoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryId' when calling getUserSubscriptionDetails");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/subscriptions/{inventory_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "inventory_id" + "\\}", apiClient.escapeString(inventoryId.toString()));

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

    GenericType<InventorySubscriptionResource> localVarReturnType = new GenericType<InventorySubscriptionResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get details about a user&#39;s subscriptions
   * 
   * @param userId The id of the user (required)
   * @return List<InventorySubscriptionResource>
   * @throws ApiException if fails to make API call
   */
  public List<InventorySubscriptionResource> getUsersSubscriptionDetails(Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUsersSubscriptionDetails");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/subscriptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<List<InventorySubscriptionResource>> localVarReturnType = new GenericType<List<InventorySubscriptionResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Reactivate a subscription and charge fee
   * 
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param reactivateSubscriptionRequest The reactivate subscription request object inventory (optional)
   * @return InvoiceResource
   * @throws ApiException if fails to make API call
   */
  public InvoiceResource reactivateUserSubscription(Integer userId, Integer inventoryId, ReactivateSubscriptionRequest reactivateSubscriptionRequest) throws ApiException {
    Object localVarPostBody = reactivateSubscriptionRequest;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling reactivateUserSubscription");
    }
    
    // verify the required parameter 'inventoryId' is set
    if (inventoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryId' when calling reactivateUserSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/subscriptions/{inventory_id}/reactivate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "inventory_id" + "\\}", apiClient.escapeString(inventoryId.toString()));

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

    GenericType<InvoiceResource> localVarReturnType = new GenericType<InvoiceResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set a new date to bill a subscription on
   * 
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param billDate The new bill date. Unix timestamp in seconds (required)
   * @throws ApiException if fails to make API call
   */
  public void setSubscriptionBillDate(Integer userId, Integer inventoryId, Long billDate) throws ApiException {
    Object localVarPostBody = billDate;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setSubscriptionBillDate");
    }
    
    // verify the required parameter 'inventoryId' is set
    if (inventoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryId' when calling setSubscriptionBillDate");
    }
    
    // verify the required parameter 'billDate' is set
    if (billDate == null) {
      throw new ApiException(400, "Missing the required parameter 'billDate' when calling setSubscriptionBillDate");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/subscriptions/{inventory_id}/bill-date".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "inventory_id" + "\\}", apiClient.escapeString(inventoryId.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set the payment method to use for a subscription
   * May send null to use floating default
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param paymentMethodId The id of the payment method (optional)
   * @throws ApiException if fails to make API call
   */
  public void setSubscriptionPaymentMethod(Integer userId, Integer inventoryId, IntWrapper paymentMethodId) throws ApiException {
    Object localVarPostBody = paymentMethodId;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setSubscriptionPaymentMethod");
    }
    
    // verify the required parameter 'inventoryId' is set
    if (inventoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryId' when calling setSubscriptionPaymentMethod");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/subscriptions/{inventory_id}/payment-method".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "inventory_id" + "\\}", apiClient.escapeString(inventoryId.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set the status of a subscription
   * Note that the new status may be blocked if the system is not configured to allow the current status to be changed to the new, to enforce proper flow. The default options for statuses are shown below but may be altered for special use cases
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param status The new status for the subscription. Actual options may differ from the indicated set if the invoice status type data has been altered.  Allowable values: (&#39;current&#39;, &#39;canceled&#39;, &#39;stopped&#39;, &#39;payment_failed&#39;, &#39;suspended&#39;) (required)
   * @throws ApiException if fails to make API call
   */
  public void setSubscriptionStatus(Integer userId, Integer inventoryId, StringWrapper status) throws ApiException {
    Object localVarPostBody = status;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setSubscriptionStatus");
    }
    
    // verify the required parameter 'inventoryId' is set
    if (inventoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryId' when calling setSubscriptionStatus");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling setSubscriptionStatus");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/subscriptions/{inventory_id}/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "inventory_id" + "\\}", apiClient.escapeString(inventoryId.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set a new subscription plan for a user
   * 
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param planId The id of the new plan. Must be from the same subscription (optional)
   * @throws ApiException if fails to make API call
   */
  public void setUserSubscriptionPlan(Integer userId, Integer inventoryId, StringWrapper planId) throws ApiException {
    Object localVarPostBody = planId;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setUserSubscriptionPlan");
    }
    
    // verify the required parameter 'inventoryId' is set
    if (inventoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryId' when calling setUserSubscriptionPlan");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/subscriptions/{inventory_id}/plan".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "inventory_id" + "\\}", apiClient.escapeString(inventoryId.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set a new subscription price for a user
   * This new price will be what the user is charged at the begining of each new period. This override is specific to the current subscription and will not carry over if they end and later re-subscribe. It will persist if the plan is changed using the setUserSubscriptionPlan endpoint.
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param theOverrideDetails override (optional)
   * @throws ApiException if fails to make API call
   */
  public void setUserSubscriptionPrice(Integer userId, Integer inventoryId, SubscriptionPriceOverrideRequest theOverrideDetails) throws ApiException {
    Object localVarPostBody = theOverrideDetails;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setUserSubscriptionPrice");
    }
    
    // verify the required parameter 'inventoryId' is set
    if (inventoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryId' when calling setUserSubscriptionPrice");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/subscriptions/{inventory_id}/price-override".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "inventory_id" + "\\}", apiClient.escapeString(inventoryId.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
