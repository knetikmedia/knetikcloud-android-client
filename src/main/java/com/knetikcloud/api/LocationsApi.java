package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.CountryResource;
import com.knetikcloud.model.CurrencyResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class LocationsApi {
  private ApiClient apiClient;

  public LocationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LocationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a list of countries
   * 
   * @return List<CountryResource>
   * @throws ApiException if fails to make API call
   */
  public List<CountryResource> getCountries() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/location/countries".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CountryResource>> localVarReturnType = new GenericType<List<CountryResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the iso3 code of your country
   * Determined by geo ip location
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getCountryByGeoLocation() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/location/geolocation/country".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of a country&#39;s states
   * 
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @return List<StateResource>
   * @throws ApiException if fails to make API call
   */
  public List<StateResource> getCountryStates(String countryCodeIso3) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'countryCodeIso3' is set
    if (countryCodeIso3 == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCodeIso3' when calling getCountryStates");
    }
    
    // create path and map variables
    String localVarPath = "/location/countries/{country_code_iso3}/states".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "country_code_iso3" + "\\}", apiClient.escapeString(countryCodeIso3.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<StateResource>> localVarReturnType = new GenericType<List<StateResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the currency information of your country
   * Determined by geo ip location, currency to country mapping and a fallback setting
   * @return CurrencyResource
   * @throws ApiException if fails to make API call
   */
  public CurrencyResource getCurrencyByGeoLocation() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/location/geolocation/currency".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CurrencyResource> localVarReturnType = new GenericType<CurrencyResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
