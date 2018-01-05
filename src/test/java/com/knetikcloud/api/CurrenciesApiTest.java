package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.CurrencyResource;
import com.knetikcloud.model.PageResourceCurrencyResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CurrenciesApi
 */
public class CurrenciesApiTest {

    private CurrenciesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CurrenciesApi.class);
    }

    /**
     * Create a currency
     *
     * 
     */
    @Test
    public void createCurrencyTest() {
        CurrencyResource currency = null;
        // CurrencyResource response = api.createCurrency(currency);

        // TODO: test validations
    }
    /**
     * Delete a currency
     *
     * 
     */
    @Test
    public void deleteCurrencyTest() {
        String code = null;
        // Void response = api.deleteCurrency(code);

        // TODO: test validations
    }
    /**
     * List and search currencies
     *
     * 
     */
    @Test
    public void getCurrenciesTest() {
        Boolean filterDefault = null;
        Boolean filterEnabledCurrencies = null;
        String filterType = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceCurrencyResource response = api.getCurrencies(filterDefault, filterEnabledCurrencies, filterType, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single currency
     *
     * 
     */
    @Test
    public void getCurrencyTest() {
        String code = null;
        // CurrencyResource response = api.getCurrency(code);

        // TODO: test validations
    }
    /**
     * Update a currency
     *
     * 
     */
    @Test
    public void updateCurrencyTest() {
        String code = null;
        CurrencyResource currency = null;
        // Void response = api.updateCurrency(code, currency);

        // TODO: test validations
    }
}
