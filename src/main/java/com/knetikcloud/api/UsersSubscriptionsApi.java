package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.InventorySubscriptionResource;
import com.knetikcloud.model.InvoiceResource;
import com.knetikcloud.model.ReactivateSubscriptionRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.SubscriptionPriceOverrideRequest;
import com.knetikcloud.model.SubscriptionStatusWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UsersSubscriptionsApi {
  /**
   * Get details about a user&#39;s subscription
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN or owner
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @return Call&lt;InventorySubscriptionResource&gt;
   */
  @GET("users/{user_id}/subscriptions/{inventory_id}")
  Call<InventorySubscriptionResource> getUserSubscriptionDetails(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("inventory_id") Integer inventoryId
  );

  /**
   * Get details about a user&#39;s subscriptions
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN or owner
   * @param userId The id of the user (required)
   * @return Call&lt;List&lt;InventorySubscriptionResource&gt;&gt;
   */
  @GET("users/{user_id}/subscriptions")
  Call<List<InventorySubscriptionResource>> getUsersSubscriptionDetails(
    @retrofit2.http.Path("user_id") Integer userId
  );

  /**
   * Reactivate a subscription and charge fee
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param reactivateSubscriptionRequest The reactivate subscription request object inventory (optional)
   * @return Call&lt;InvoiceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/subscriptions/{inventory_id}/reactivate")
  Call<InvoiceResource> reactivateUserSubscription(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("inventory_id") Integer inventoryId, @retrofit2.http.Body ReactivateSubscriptionRequest reactivateSubscriptionRequest
  );

  /**
   * Set a new date to bill a subscription on
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param billDate The new bill date. Unix timestamp in seconds (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/subscriptions/{inventory_id}/bill-date")
  Call<Void> setSubscriptionBillDate(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("inventory_id") Integer inventoryId, @retrofit2.http.Body Long billDate
  );

  /**
   * Set the payment method to use for a subscription
   * May send null to use floating default. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN or owner
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param paymentMethodId The id of the payment method (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/subscriptions/{inventory_id}/payment-method")
  Call<Void> setSubscriptionPaymentMethod(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("inventory_id") Integer inventoryId, @retrofit2.http.Body IntWrapper paymentMethodId
  );

  /**
   * Set the status of a subscription
   * Note that the new status may be blocked if the system is not configured to allow the current status to be changed to the new, to enforce proper flow. The default options for statuses are shown below but may be altered for special use cases. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN or owner
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param status The new status for the subscription (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/subscriptions/{inventory_id}/status")
  Call<Void> setSubscriptionStatus(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("inventory_id") Integer inventoryId, @retrofit2.http.Body SubscriptionStatusWrapper status
  );

  /**
   * Set a new subscription plan for a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param planId The id of the new plan. Must be from the same subscription (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/subscriptions/{inventory_id}/plan")
  Call<Void> setUserSubscriptionPlan(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("inventory_id") Integer inventoryId, @retrofit2.http.Body StringWrapper planId
  );

  /**
   * Set a new subscription price for a user
   * This new price will be what the user is charged at the begining of each new period. This override is specific to the current subscription and will not carry over if they end and later re-subscribe. It will persist if the plan is changed using the setUserSubscriptionPlan endpoint. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN
   * @param userId The id of the user (required)
   * @param inventoryId The id of the user&#39;s inventory (required)
   * @param theOverrideDetails override (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/subscriptions/{inventory_id}/price-override")
  Call<Void> setUserSubscriptionPrice(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("inventory_id") Integer inventoryId, @retrofit2.http.Body SubscriptionPriceOverrideRequest theOverrideDetails
  );

}
