package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.CurrencyResource;
import com.knetikcloud.model.PageResourceCurrencyResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class CurrenciesApi {
  private ApiClient apiClient;

  public CurrenciesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CurrenciesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a currency
   * 
   * @param currency The currency object (optional)
   * @return CurrencyResource
   * @throws ApiException if fails to make API call
   */
  public CurrencyResource createCurrency(CurrencyResource currency) throws ApiException {
    Object localVarPostBody = currency;
    
    // create path and map variables
    String localVarPath = "/currencies".replaceAll("\\{format\\}","json");

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

    GenericType<CurrencyResource> localVarReturnType = new GenericType<CurrencyResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a currency
   * 
   * @param code The currency code (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCurrency(String code) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling deleteCurrency");
    }
    
    // create path and map variables
    String localVarPath = "/currencies/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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
   * List and search currencies
   * 
   * @param filterEnabledCurrencies Filter for alternate currencies setup explicitely in system config (optional)
   * @param filterType Filter currencies by type.  Allowable values: (&#39;virtual&#39;, &#39;real&#39;) (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return PageResourceCurrencyResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceCurrencyResource getCurrencies(Boolean filterEnabledCurrencies, String filterType, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/currencies".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_enabled_currencies", filterEnabledCurrencies));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_type", filterType));
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

    GenericType<PageResourceCurrencyResource> localVarReturnType = new GenericType<PageResourceCurrencyResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single currency
   * 
   * @param code The currency code (required)
   * @return CurrencyResource
   * @throws ApiException if fails to make API call
   */
  public CurrencyResource getCurrency(String code) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getCurrency");
    }
    
    // create path and map variables
    String localVarPath = "/currencies/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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
  /**
   * Update a currency
   * 
   * @param code The currency code (required)
   * @param currency The currency object (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateCurrency(String code, CurrencyResource currency) throws ApiException {
    Object localVarPostBody = currency;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling updateCurrency");
    }
    
    // create path and map variables
    String localVarPath = "/currencies/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
