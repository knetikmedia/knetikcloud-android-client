package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.OAuth2Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class AccessTokenApi {
  private ApiClient apiClient;

  public AccessTokenApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccessTokenApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get access token
   * 
   * @param grantType Grant type (required)
   * @param clientId The id of the client (required)
   * @param clientSecret The secret key of the client.  Used only with a grant_type of client_credentials (optional)
   * @param username The username of the client.  Used only with a grant_type of password (optional)
   * @param password The password of the client.  Used only with a grant_type of password (optional)
   * @return OAuth2Resource
   * @throws ApiException if fails to make API call
   */
  public OAuth2Resource getOAuthToken(String grantType, String clientId, String clientSecret, String username, String password) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'grantType' is set
    if (grantType == null) {
      throw new ApiException(400, "Missing the required parameter 'grantType' when calling getOAuthToken");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getOAuthToken");
    }
    
    // create path and map variables
    String localVarPath = "/oauth/token".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (grantType != null)
      localVarFormParams.put("grant_type", grantType);
if (clientId != null)
      localVarFormParams.put("client_id", clientId);
if (clientSecret != null)
      localVarFormParams.put("client_secret", clientSecret);
if (username != null)
      localVarFormParams.put("username", username);
if (password != null)
      localVarFormParams.put("password", password);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OAuth2Resource> localVarReturnType = new GenericType<OAuth2Resource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
