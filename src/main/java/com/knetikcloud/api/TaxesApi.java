package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.CountryTaxResource;
import com.knetikcloud.model.PageResourceCountryTaxResource;
import com.knetikcloud.model.PageResourceStateTaxResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StateTaxResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TaxesApi {
  /**
   * Create a country tax
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
   * @param taxResource The tax object (optional)
   * @return Call&lt;CountryTaxResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tax/countries")
  Call<CountryTaxResource> createCountryTax(
    @retrofit2.http.Body CountryTaxResource taxResource
  );

  /**
   * Create a state tax
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param taxResource The tax object (optional)
   * @return Call&lt;StateTaxResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tax/countries/{country_code_iso3}/states")
  Call<StateTaxResource> createStateTax(
    @retrofit2.http.Path("country_code_iso3") String countryCodeIso3, @retrofit2.http.Body StateTaxResource taxResource
  );

  /**
   * Delete an existing tax
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("tax/countries/{country_code_iso3}")
  Call<Void> deleteCountryTax(
    @retrofit2.http.Path("country_code_iso3") String countryCodeIso3
  );

  /**
   * Delete an existing state tax
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param stateCode The code of the state (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("tax/countries/{country_code_iso3}/states/{state_code}")
  Call<Void> deleteStateTax(
    @retrofit2.http.Path("country_code_iso3") String countryCodeIso3, @retrofit2.http.Path("state_code") String stateCode
  );

  /**
   * Get a single tax
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @return Call&lt;CountryTaxResource&gt;
   */
  @GET("tax/countries/{country_code_iso3}")
  Call<CountryTaxResource> getCountryTax(
    @retrofit2.http.Path("country_code_iso3") String countryCodeIso3
  );

  /**
   * List and search taxes
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return Call&lt;PageResourceCountryTaxResource&gt;
   */
  @GET("tax/countries")
  Call<PageResourceCountryTaxResource> getCountryTaxes(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single state tax
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param stateCode The code of the state (required)
   * @return Call&lt;StateTaxResource&gt;
   */
  @GET("tax/countries/{country_code_iso3}/states/{state_code}")
  Call<StateTaxResource> getStateTax(
    @retrofit2.http.Path("country_code_iso3") String countryCodeIso3, @retrofit2.http.Path("state_code") String stateCode
  );

  /**
   * List and search taxes across all countries
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceStateTaxResource&gt;
   */
  @GET("tax/states")
  Call<PageResourceStateTaxResource> getStateTaxesForCountries(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List and search taxes within a country
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceStateTaxResource&gt;
   */
  @GET("tax/countries/{country_code_iso3}/states")
  Call<PageResourceStateTaxResource> getStateTaxesForCountry(
    @retrofit2.http.Path("country_code_iso3") String countryCodeIso3, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Create or update a tax
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param taxResource The tax object (optional)
   * @return Call&lt;CountryTaxResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("tax/countries/{country_code_iso3}")
  Call<CountryTaxResource> updateCountryTax(
    @retrofit2.http.Path("country_code_iso3") String countryCodeIso3, @retrofit2.http.Body CountryTaxResource taxResource
  );

  /**
   * Create or update a state tax
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TAX_ADMIN
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param stateCode The code of the state (required)
   * @param taxResource The tax object (optional)
   * @return Call&lt;StateTaxResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("tax/countries/{country_code_iso3}/states/{state_code}")
  Call<StateTaxResource> updateStateTax(
    @retrofit2.http.Path("country_code_iso3") String countryCodeIso3, @retrofit2.http.Path("state_code") String stateCode, @retrofit2.http.Body StateTaxResource taxResource
  );

}
