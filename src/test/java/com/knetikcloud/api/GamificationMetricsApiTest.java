package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.MetricResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationMetricsApi
 */
public class GamificationMetricsApiTest {

    private GamificationMetricsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GamificationMetricsApi.class);
    }

    /**
     * Add a metric
     *
     * Post a new score/stat for an activity occurrence without ending the occurrence itself
     */
    @Test
    public void addMetricTest() {
        MetricResource metric = null;
        // Void response = api.addMetric(metric);

        // TODO: test validations
    }
}
