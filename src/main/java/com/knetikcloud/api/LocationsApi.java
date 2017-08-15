package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.CountryResource;
import com.knetikcloud.model.CurrencyResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface LocationsApi {
  /**
   * Get a list of countries
   * 
   * @return Call&lt;List&lt;CountryResource&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("location/countries")
  Call<List<CountryResource>> getCountries();
    

  /**
   * Get the iso3 code of your country
   * Determined by geo ip location
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("location/geolocation/country")
  Call<String> getCountryByGeoLocation();
    

  /**
   * Get a list of a country&#39;s states
   * 
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @return Call&lt;List&lt;StateResource&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("location/countries/{country_code_iso3}/states")
  Call<List<StateResource>> getCountryStates(
    @retrofit2.http.Path("country_code_iso3") String countryCodeIso3
  );

  /**
   * Get the currency information of your country
   * Determined by geo ip location, currency to country mapping and a fallback setting
   * @return Call&lt;CurrencyResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("location/geolocation/currency")
  Call<CurrencyResource> getCurrencyByGeoLocation();
    

}
