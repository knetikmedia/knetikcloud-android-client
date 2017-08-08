package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.CountryTaxResource;
import com.knetikcloud.model.PageResourceCountryTaxResource;
import com.knetikcloud.model.PageResourceStateTaxResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StateTaxResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class TaxesApi {
  private ApiClient apiClient;

  public TaxesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TaxesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a country tax
   * 
   * @param taxResource The tax object (optional)
   * @return CountryTaxResource
   * @throws ApiException if fails to make API call
   */
  public CountryTaxResource createCountryTax(CountryTaxResource taxResource) throws ApiException {
    Object localVarPostBody = taxResource;
    
    // create path and map variables
    String localVarPath = "/tax/countries".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<CountryTaxResource> localVarReturnType = new GenericType<CountryTaxResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a state tax
   * 
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param taxResource The tax object (optional)
   * @return StateTaxResource
   * @throws ApiException if fails to make API call
   */
  public StateTaxResource createStateTax(String countryCodeIso3, StateTaxResource taxResource) throws ApiException {
    Object localVarPostBody = taxResource;
    
    // verify the required parameter 'countryCodeIso3' is set
    if (countryCodeIso3 == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCodeIso3' when calling createStateTax");
    }
    
    // create path and map variables
    String localVarPath = "/tax/countries/{country_code_iso3}/states".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<StateTaxResource> localVarReturnType = new GenericType<StateTaxResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an existing tax
   * 
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCountryTax(String countryCodeIso3) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'countryCodeIso3' is set
    if (countryCodeIso3 == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCodeIso3' when calling deleteCountryTax");
    }
    
    // create path and map variables
    String localVarPath = "/tax/countries/{country_code_iso3}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete an existing state tax
   * 
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param stateCode The code of the state (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteStateTax(String countryCodeIso3, String stateCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'countryCodeIso3' is set
    if (countryCodeIso3 == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCodeIso3' when calling deleteStateTax");
    }
    
    // verify the required parameter 'stateCode' is set
    if (stateCode == null) {
      throw new ApiException(400, "Missing the required parameter 'stateCode' when calling deleteStateTax");
    }
    
    // create path and map variables
    String localVarPath = "/tax/countries/{country_code_iso3}/states/{state_code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "country_code_iso3" + "\\}", apiClient.escapeString(countryCodeIso3.toString()))
      .replaceAll("\\{" + "state_code" + "\\}", apiClient.escapeString(stateCode.toString()));

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

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a single tax
   * 
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @return CountryTaxResource
   * @throws ApiException if fails to make API call
   */
  public CountryTaxResource getCountryTax(String countryCodeIso3) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'countryCodeIso3' is set
    if (countryCodeIso3 == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCodeIso3' when calling getCountryTax");
    }
    
    // create path and map variables
    String localVarPath = "/tax/countries/{country_code_iso3}".replaceAll("\\{format\\}","json")
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

    GenericType<CountryTaxResource> localVarReturnType = new GenericType<CountryTaxResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search taxes
   * Get a list of taxes
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return PageResourceCountryTaxResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceCountryTaxResource getCountryTaxes(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/tax/countries".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageResourceCountryTaxResource> localVarReturnType = new GenericType<PageResourceCountryTaxResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single state tax
   * 
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param stateCode The code of the state (required)
   * @return StateTaxResource
   * @throws ApiException if fails to make API call
   */
  public StateTaxResource getStateTax(String countryCodeIso3, String stateCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'countryCodeIso3' is set
    if (countryCodeIso3 == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCodeIso3' when calling getStateTax");
    }
    
    // verify the required parameter 'stateCode' is set
    if (stateCode == null) {
      throw new ApiException(400, "Missing the required parameter 'stateCode' when calling getStateTax");
    }
    
    // create path and map variables
    String localVarPath = "/tax/countries/{country_code_iso3}/states/{state_code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "country_code_iso3" + "\\}", apiClient.escapeString(countryCodeIso3.toString()))
      .replaceAll("\\{" + "state_code" + "\\}", apiClient.escapeString(stateCode.toString()));

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

    GenericType<StateTaxResource> localVarReturnType = new GenericType<StateTaxResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search taxes across all countries
   * Get a list of taxes
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return PageResourceStateTaxResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceStateTaxResource getStateTaxesForCountries(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/tax/states".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageResourceStateTaxResource> localVarReturnType = new GenericType<PageResourceStateTaxResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search taxes within a country
   * Get a list of taxes
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return PageResourceStateTaxResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceStateTaxResource getStateTaxesForCountry(String countryCodeIso3, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'countryCodeIso3' is set
    if (countryCodeIso3 == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCodeIso3' when calling getStateTaxesForCountry");
    }
    
    // create path and map variables
    String localVarPath = "/tax/countries/{country_code_iso3}/states".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "country_code_iso3" + "\\}", apiClient.escapeString(countryCodeIso3.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageResourceStateTaxResource> localVarReturnType = new GenericType<PageResourceStateTaxResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create or update a tax
   * 
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param taxResource The tax object (optional)
   * @return CountryTaxResource
   * @throws ApiException if fails to make API call
   */
  public CountryTaxResource updateCountryTax(String countryCodeIso3, CountryTaxResource taxResource) throws ApiException {
    Object localVarPostBody = taxResource;
    
    // verify the required parameter 'countryCodeIso3' is set
    if (countryCodeIso3 == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCodeIso3' when calling updateCountryTax");
    }
    
    // create path and map variables
    String localVarPath = "/tax/countries/{country_code_iso3}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<CountryTaxResource> localVarReturnType = new GenericType<CountryTaxResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create or update a state tax
   * 
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param stateCode The code of the state (required)
   * @param taxResource The tax object (optional)
   * @return StateTaxResource
   * @throws ApiException if fails to make API call
   */
  public StateTaxResource updateStateTax(String countryCodeIso3, String stateCode, StateTaxResource taxResource) throws ApiException {
    Object localVarPostBody = taxResource;
    
    // verify the required parameter 'countryCodeIso3' is set
    if (countryCodeIso3 == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCodeIso3' when calling updateStateTax");
    }
    
    // verify the required parameter 'stateCode' is set
    if (stateCode == null) {
      throw new ApiException(400, "Missing the required parameter 'stateCode' when calling updateStateTax");
    }
    
    // create path and map variables
    String localVarPath = "/tax/countries/{country_code_iso3}/states/{state_code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "country_code_iso3" + "\\}", apiClient.escapeString(countryCodeIso3.toString()))
      .replaceAll("\\{" + "state_code" + "\\}", apiClient.escapeString(stateCode.toString()));

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

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<StateTaxResource> localVarReturnType = new GenericType<StateTaxResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
