package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.InventorySubscriptionResource;
import com.knetikcloud.model.InvoiceResource;
import com.knetikcloud.model.ReactivateSubscriptionRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.SubscriptionPriceOverrideRequest;
import com.knetikcloud.model.SubscriptionStatusWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersSubscriptionsApi
 */
public class UsersSubscriptionsApiTest {

    private UsersSubscriptionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersSubscriptionsApi.class);
    }

    /**
     * Get details about a user&#39;s subscription
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN or owner
     */
    @Test
    public void getUserSubscriptionDetailsTest() {
        Integer userId = null;
        Integer inventoryId = null;
        // InventorySubscriptionResource response = api.getUserSubscriptionDetails(userId, inventoryId);

        // TODO: test validations
    }
    /**
     * Get details about a user&#39;s subscriptions
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN or owner
     */
    @Test
    public void getUsersSubscriptionDetailsTest() {
        Integer userId = null;
        // List<InventorySubscriptionResource> response = api.getUsersSubscriptionDetails(userId);

        // TODO: test validations
    }
    /**
     * Reactivate a subscription and charge fee
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN
     */
    @Test
    public void reactivateUserSubscriptionTest() {
        Integer userId = null;
        Integer inventoryId = null;
        ReactivateSubscriptionRequest reactivateSubscriptionRequest = null;
        // InvoiceResource response = api.reactivateUserSubscription(userId, inventoryId, reactivateSubscriptionRequest);

        // TODO: test validations
    }
    /**
     * Set a new date to bill a subscription on
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN
     */
    @Test
    public void setSubscriptionBillDateTest() {
        Integer userId = null;
        Integer inventoryId = null;
        Long billDate = null;
        // Void response = api.setSubscriptionBillDate(userId, inventoryId, billDate);

        // TODO: test validations
    }
    /**
     * Set the payment method to use for a subscription
     *
     * May send null to use floating default. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN or owner
     */
    @Test
    public void setSubscriptionPaymentMethodTest() {
        Integer userId = null;
        Integer inventoryId = null;
        IntWrapper paymentMethodId = null;
        // Void response = api.setSubscriptionPaymentMethod(userId, inventoryId, paymentMethodId);

        // TODO: test validations
    }
    /**
     * Set the status of a subscription
     *
     * Note that the new status may be blocked if the system is not configured to allow the current status to be changed to the new, to enforce proper flow. The default options for statuses are shown below but may be altered for special use cases. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN or owner
     */
    @Test
    public void setSubscriptionStatusTest() {
        Integer userId = null;
        Integer inventoryId = null;
        SubscriptionStatusWrapper status = null;
        // Void response = api.setSubscriptionStatus(userId, inventoryId, status);

        // TODO: test validations
    }
    /**
     * Set a new subscription plan for a user
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN
     */
    @Test
    public void setUserSubscriptionPlanTest() {
        Integer userId = null;
        Integer inventoryId = null;
        StringWrapper planId = null;
        // Void response = api.setUserSubscriptionPlan(userId, inventoryId, planId);

        // TODO: test validations
    }
    /**
     * Set a new subscription price for a user
     *
     * This new price will be what the user is charged at the begining of each new period. This override is specific to the current subscription and will not carry over if they end and later re-subscribe. It will persist if the plan is changed using the setUserSubscriptionPlan endpoint. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_SUBSCRIPTIONS_ADMIN
     */
    @Test
    public void setUserSubscriptionPriceTest() {
        Integer userId = null;
        Integer inventoryId = null;
        SubscriptionPriceOverrideRequest theOverrideDetails = null;
        // Void response = api.setUserSubscriptionPrice(userId, inventoryId, theOverrideDetails);

        // TODO: test validations
    }
}
