package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.LeaderboardEntryResource;
import com.knetikcloud.model.LeaderboardResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class GamificationLeaderboardsApi {
  private ApiClient apiClient;

  public GamificationLeaderboardsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GamificationLeaderboardsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieves leaderboard details and paginated entries
   * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. Sorting is based on the fields of LeaderboardEntryResource rather than the returned LeaderboardResource.
   * @param contextType The context type for the leaderboard (required)
   * @param contextId The context id for the leaderboard (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to score:DESC,updated:ASC,user_id:ASC)
   * @return LeaderboardResource
   * @throws ApiException if fails to make API call
   */
  public LeaderboardResource getLeaderboard(String contextType, String contextId, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contextType' is set
    if (contextType == null) {
      throw new ApiException(400, "Missing the required parameter 'contextType' when calling getLeaderboard");
    }
    
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling getLeaderboard");
    }
    
    // create path and map variables
    String localVarPath = "/leaderboards/{context_type}/{context_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "context_type" + "\\}", apiClient.escapeString(contextType.toString()))
      .replaceAll("\\{" + "context_id" + "\\}", apiClient.escapeString(contextId.toString()));

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

    GenericType<LeaderboardResource> localVarReturnType = new GenericType<LeaderboardResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieves a specific user entry with rank
   * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard
   * @param contextType The context type for the leaderboard (required)
   * @param contextId The context id for the leaderboard (required)
   * @param id The id of a user (required)
   * @return LeaderboardEntryResource
   * @throws ApiException if fails to make API call
   */
  public LeaderboardEntryResource getLeaderboardRank(String contextType, String contextId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contextType' is set
    if (contextType == null) {
      throw new ApiException(400, "Missing the required parameter 'contextType' when calling getLeaderboardRank");
    }
    
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling getLeaderboardRank");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getLeaderboardRank");
    }
    
    // create path and map variables
    String localVarPath = "/leaderboards/{context_type}/{context_id}/users/{id}/rank".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "context_type" + "\\}", apiClient.escapeString(contextType.toString()))
      .replaceAll("\\{" + "context_id" + "\\}", apiClient.escapeString(contextId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<LeaderboardEntryResource> localVarReturnType = new GenericType<LeaderboardEntryResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of available leaderboard strategy names
   * 
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getLeaderboardStrategies() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/leaderboards/strategies".replaceAll("\\{format\\}","json");

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

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
