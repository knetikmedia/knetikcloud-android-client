package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceBillingReport;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingSubscriptionsApi
 */
public class ReportingSubscriptionsApiTest {

    private ReportingSubscriptionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReportingSubscriptionsApi.class);
    }

    /**
     * Get a list of available subscription reports in most recent first order
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SUBSCRIPTIONS_ADMIN
     */
    @Test
    public void getSubscriptionReportsTest() {
        Integer size = null;
        Integer page = null;
        // PageResourceBillingReport response = api.getSubscriptionReports(size, page);

        // TODO: test validations
    }
}
