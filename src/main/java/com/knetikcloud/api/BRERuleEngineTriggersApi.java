package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.PageResourceBreTriggerResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class BRERuleEngineTriggersApi {
  private ApiClient apiClient;

  public BRERuleEngineTriggersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BRERuleEngineTriggersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a trigger
   * Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services
   * @param breTriggerResource The BRE trigger resource object (optional)
   * @return BreTriggerResource
   * @throws ApiException if fails to make API call
   */
  public BreTriggerResource createBRETrigger(BreTriggerResource breTriggerResource) throws ApiException {
    Object localVarPostBody = breTriggerResource;
    
    // create path and map variables
    String localVarPath = "/bre/triggers".replaceAll("\\{format\\}","json");

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

    GenericType<BreTriggerResource> localVarReturnType = new GenericType<BreTriggerResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a trigger
   * May fail if there are existing rules against it. Cannot delete core triggers
   * @param eventName The trigger event name (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBRETrigger(String eventName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'eventName' is set
    if (eventName == null) {
      throw new ApiException(400, "Missing the required parameter 'eventName' when calling deleteBRETrigger");
    }
    
    // create path and map variables
    String localVarPath = "/bre/triggers/{event_name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "event_name" + "\\}", apiClient.escapeString(eventName.toString()));

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
   * Get a single trigger
   * 
   * @param eventName The trigger event name (required)
   * @return BreTriggerResource
   * @throws ApiException if fails to make API call
   */
  public BreTriggerResource getBRETrigger(String eventName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'eventName' is set
    if (eventName == null) {
      throw new ApiException(400, "Missing the required parameter 'eventName' when calling getBRETrigger");
    }
    
    // create path and map variables
    String localVarPath = "/bre/triggers/{event_name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "event_name" + "\\}", apiClient.escapeString(eventName.toString()));

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

    GenericType<BreTriggerResource> localVarReturnType = new GenericType<BreTriggerResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List triggers
   * 
   * @param filterSystem Filter for triggers that are system triggers when true, or not when false. Leave off for both mixed (optional)
   * @param filterCategory Filter for triggers that are within a specific category (optional)
   * @param filterTags Filter for triggers that have all of the given tags (comma separated list) (optional)
   * @param filterName Filter for triggers that have names containing the given string (optional)
   * @param filterSearch Filter for triggers containing the given words somewhere within name, description and tags (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceBreTriggerResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceBreTriggerResource getBRETriggers(Boolean filterSystem, String filterCategory, String filterTags, String filterName, String filterSearch, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/bre/triggers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_system", filterSystem));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tags", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_search", filterSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceBreTriggerResource> localVarReturnType = new GenericType<PageResourceBreTriggerResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a trigger
   * May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers
   * @param eventName The trigger event name (required)
   * @param breTriggerResource The BRE trigger resource object (optional)
   * @return BreTriggerResource
   * @throws ApiException if fails to make API call
   */
  public BreTriggerResource updateBRETrigger(String eventName, BreTriggerResource breTriggerResource) throws ApiException {
    Object localVarPostBody = breTriggerResource;
    
    // verify the required parameter 'eventName' is set
    if (eventName == null) {
      throw new ApiException(400, "Missing the required parameter 'eventName' when calling updateBRETrigger");
    }
    
    // create path and map variables
    String localVarPath = "/bre/triggers/{event_name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "event_name" + "\\}", apiClient.escapeString(eventName.toString()));

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

    GenericType<BreTriggerResource> localVarReturnType = new GenericType<BreTriggerResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
