package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.CountryResource;
import com.knetikcloud.model.CurrencyResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StateResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationsApi
 */
public class LocationsApiTest {

    private LocationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LocationsApi.class);
    }

    /**
     * Get a list of countries
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getCountriesTest() {
        // List<CountryResource> response = api.getCountries();

        // TODO: test validations
    }
    /**
     * Get the iso3 code of your country
     *
     * Determined by geo ip location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getCountryByGeoLocationTest() {
        // String response = api.getCountryByGeoLocation();

        // TODO: test validations
    }
    /**
     * Get a list of a country&#39;s states
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getCountryStatesTest() {
        String countryCodeIso3 = null;
        // List<StateResource> response = api.getCountryStates(countryCodeIso3);

        // TODO: test validations
    }
    /**
     * Get the currency information of your country
     *
     * Determined by geo ip location, currency to country mapping and a fallback setting. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getCurrencyByGeoLocationTest() {
        // CurrencyResource response = api.getCurrencyByGeoLocation();

        // TODO: test validations
    }
}
