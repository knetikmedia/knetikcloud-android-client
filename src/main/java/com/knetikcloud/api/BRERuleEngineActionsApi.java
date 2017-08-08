package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.ActionResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class BRERuleEngineActionsApi {
  private ApiClient apiClient;

  public BRERuleEngineActionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BRERuleEngineActionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a list of available actions
   * 
   * @param filterCategory Filter for actions that are within a specific category (optional)
   * @param filterName Filter for actions that have names containing the given string (optional)
   * @param filterTags Filter for actions that have all of the given tags (comma separated list) (optional)
   * @param filterSearch Filter for actions containing the given words somewhere within name, description and tags (optional)
   * @return List<ActionResource>
   * @throws ApiException if fails to make API call
   */
  public List<ActionResource> getBREActions(String filterCategory, String filterName, String filterTags, String filterSearch) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/bre/actions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tags", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_search", filterSearch));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<List<ActionResource>> localVarReturnType = new GenericType<List<ActionResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
