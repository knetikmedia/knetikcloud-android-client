package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceSubscriptionResource;
import com.knetikcloud.model.PageResourceSubscriptionTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SubscriptionResource;
import com.knetikcloud.model.SubscriptionTemplateResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreSubscriptionsApi
 */
public class StoreSubscriptionsApiTest {

    private StoreSubscriptionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StoreSubscriptionsApi.class);
    }

    /**
     * Creates a subscription item and associated plans
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SUBSCRIPTIONS_ADMIN
     */
    @Test
    public void createSubscriptionTest() {
        SubscriptionResource subscriptionResource = null;
        // SubscriptionResource response = api.createSubscription(subscriptionResource);

        // TODO: test validations
    }
    /**
     * Create a subscription template
     *
     * Subscription Templates define a type of subscription and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createSubscriptionTemplateTest() {
        SubscriptionTemplateResource subscriptionTemplateResource = null;
        // SubscriptionTemplateResource response = api.createSubscriptionTemplate(subscriptionTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete a subscription plan
     *
     * Must not be locked or a migration target. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SUBSCRIPTIONS_ADMIN
     */
    @Test
    public void deleteSubscriptionTest() {
        Integer id = null;
        String planId = null;
        // Void response = api.deleteSubscription(id, planId);

        // TODO: test validations
    }
    /**
     * Delete a subscription template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteSubscriptionTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteSubscriptionTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Retrieve a single subscription item and associated plans
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getSubscriptionTest() {
        Integer id = null;
        // SubscriptionResource response = api.getSubscription(id);

        // TODO: test validations
    }
    /**
     * Get a single subscription template
     *
     * Subscription Templates define a type of subscription and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void getSubscriptionTemplateTest() {
        String id = null;
        // SubscriptionTemplateResource response = api.getSubscriptionTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search subscription templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or SUBSCRIPTIONS_ADMIN
     */
    @Test
    public void getSubscriptionTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceSubscriptionTemplateResource response = api.getSubscriptionTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * List available subscription items and associated plans
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getSubscriptionsTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceSubscriptionResource response = api.getSubscriptions(size, page, order);

        // TODO: test validations
    }
    /**
     * Processes subscriptions and charge dues
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SUBSCRIPTIONS_ADMIN
     */
    @Test
    public void processSubscriptionsTest() {
        // Void response = api.processSubscriptions();

        // TODO: test validations
    }
    /**
     * Updates a subscription item and associated plans
     *
     * Will not remove plans left out. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SUBSCRIPTIONS_ADMIN
     */
    @Test
    public void updateSubscriptionTest() {
        Integer id = null;
        SubscriptionResource subscriptionResource = null;
        // Void response = api.updateSubscription(id, subscriptionResource);

        // TODO: test validations
    }
    /**
     * Update a subscription template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateSubscriptionTemplateTest() {
        String id = null;
        SubscriptionTemplateResource subscriptionTemplateResource = null;
        // SubscriptionTemplateResource response = api.updateSubscriptionTemplate(id, subscriptionTemplateResource);

        // TODO: test validations
    }
}
