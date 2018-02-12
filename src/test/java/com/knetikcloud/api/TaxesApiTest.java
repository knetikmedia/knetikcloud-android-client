package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.CountryTaxResource;
import com.knetikcloud.model.PageResourceCountryTaxResource;
import com.knetikcloud.model.PageResourceStateTaxResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StateTaxResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaxesApi
 */
public class TaxesApiTest {

    private TaxesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TaxesApi.class);
    }

    /**
     * Create a country tax
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
     */
    @Test
    public void createCountryTaxTest() {
        CountryTaxResource taxResource = null;
        // CountryTaxResource response = api.createCountryTax(taxResource);

        // TODO: test validations
    }
    /**
     * Create a state tax
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
     */
    @Test
    public void createStateTaxTest() {
        String countryCodeIso3 = null;
        StateTaxResource taxResource = null;
        // StateTaxResource response = api.createStateTax(countryCodeIso3, taxResource);

        // TODO: test validations
    }
    /**
     * Delete an existing tax
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
     */
    @Test
    public void deleteCountryTaxTest() {
        String countryCodeIso3 = null;
        // Void response = api.deleteCountryTax(countryCodeIso3);

        // TODO: test validations
    }
    /**
     * Delete an existing state tax
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
     */
    @Test
    public void deleteStateTaxTest() {
        String countryCodeIso3 = null;
        String stateCode = null;
        // Void response = api.deleteStateTax(countryCodeIso3, stateCode);

        // TODO: test validations
    }
    /**
     * Get a single tax
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getCountryTaxTest() {
        String countryCodeIso3 = null;
        // CountryTaxResource response = api.getCountryTax(countryCodeIso3);

        // TODO: test validations
    }
    /**
     * List and search taxes
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
     */
    @Test
    public void getCountryTaxesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceCountryTaxResource response = api.getCountryTaxes(size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single state tax
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getStateTaxTest() {
        String countryCodeIso3 = null;
        String stateCode = null;
        // StateTaxResource response = api.getStateTax(countryCodeIso3, stateCode);

        // TODO: test validations
    }
    /**
     * List and search taxes across all countries
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getStateTaxesForCountriesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceStateTaxResource response = api.getStateTaxesForCountries(size, page, order);

        // TODO: test validations
    }
    /**
     * List and search taxes within a country
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getStateTaxesForCountryTest() {
        String countryCodeIso3 = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceStateTaxResource response = api.getStateTaxesForCountry(countryCodeIso3, size, page, order);

        // TODO: test validations
    }
    /**
     * Create or update a tax
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
     */
    @Test
    public void updateCountryTaxTest() {
        String countryCodeIso3 = null;
        CountryTaxResource taxResource = null;
        // CountryTaxResource response = api.updateCountryTax(countryCodeIso3, taxResource);

        // TODO: test validations
    }
    /**
     * Create or update a state tax
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
     */
    @Test
    public void updateStateTaxTest() {
        String countryCodeIso3 = null;
        String stateCode = null;
        StateTaxResource taxResource = null;
        // StateTaxResource response = api.updateStateTax(countryCodeIso3, stateCode, taxResource);

        // TODO: test validations
    }
}
