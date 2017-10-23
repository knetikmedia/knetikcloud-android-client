package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceRevenueCountryReportResource;
import com.knetikcloud.model.PageResourceRevenueProductReportResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.RevenueReportResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingRevenueApi
 */
public class ReportingRevenueApiTest {

    private ReportingRevenueApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReportingRevenueApi.class);
    }

    /**
     * Get item revenue info
     *
     * Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range
     */
    @Test
    public void getItemRevenueTest() {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        // RevenueReportResource response = api.getItemRevenue(currencyCode, startDate, endDate);

        // TODO: test validations
    }
    /**
     * Get refund revenue info
     *
     * Get basic info about revenue loss from refunds (for all item types), summed up within a time range.
     */
    @Test
    public void getRefundRevenueTest() {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        // RevenueReportResource response = api.getRefundRevenue(currencyCode, startDate, endDate);

        // TODO: test validations
    }
    /**
     * Get revenue info by country
     *
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top
     */
    @Test
    public void getRevenueByCountryTest() {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        Integer size = null;
        Integer page = null;
        // PageResourceRevenueCountryReportResource response = api.getRevenueByCountry(currencyCode, startDate, endDate, size, page);

        // TODO: test validations
    }
    /**
     * Get revenue info by item
     *
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top
     */
    @Test
    public void getRevenueByItemTest() {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        Integer size = null;
        Integer page = null;
        // PageResourceRevenueProductReportResource response = api.getRevenueByItem(currencyCode, startDate, endDate, size, page);

        // TODO: test validations
    }
    /**
     * Get subscription revenue info
     *
     * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range
     */
    @Test
    public void getSubscriptionRevenueTest() {
        String currencyCode = null;
        Long startDate = null;
        Long endDate = null;
        // RevenueReportResource response = api.getSubscriptionRevenue(currencyCode, startDate, endDate);

        // TODO: test validations
    }
}
