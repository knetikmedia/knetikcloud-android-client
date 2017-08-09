package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceAggregateInvoiceReportResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingOrdersApi
 */
public class ReportingOrdersApiTest {

    private ReportingOrdersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReportingOrdersApi.class);
    }

    /**
     * Retrieve invoice counts aggregated by time ranges
     *
     * 
     */
    @Test
    public void getInvoiceReportsTest() {
        String currencyCode = null;
        String granularity = null;
        String filterPaymentStatus = null;
        String filterFulfillmentStatus = null;
        Long startDate = null;
        Long endDate = null;
        Integer size = null;
        Integer page = null;
        // PageResourceAggregateInvoiceReportResource response = api.getInvoiceReports(currencyCode, granularity, filterPaymentStatus, filterFulfillmentStatus, startDate, endDate, size, page);

        // TODO: test validations
    }
}
