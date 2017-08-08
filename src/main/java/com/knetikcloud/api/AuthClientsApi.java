package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.ClientResource;
import com.knetikcloud.model.GrantTypeResource;
import com.knetikcloud.model.PageResourceClientResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class AuthClientsApi {
  private ApiClient apiClient;

  public AuthClientsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthClientsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new client
   * 
   * @param clientResource The client resource object (optional)
   * @return ClientResource
   * @throws ApiException if fails to make API call
   */
  public ClientResource createClient(ClientResource clientResource) throws ApiException {
    Object localVarPostBody = clientResource;
    
    // create path and map variables
    String localVarPath = "/auth/clients".replaceAll("\\{format\\}","json");

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

    GenericType<ClientResource> localVarReturnType = new GenericType<ClientResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a client
   * 
   * @param clientKey The key of the client (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteClient(String clientKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      throw new ApiException(400, "Missing the required parameter 'clientKey' when calling deleteClient");
    }
    
    // create path and map variables
    String localVarPath = "/auth/clients/{client_key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "client_key" + "\\}", apiClient.escapeString(clientKey.toString()));

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
   * Get a single client
   * 
   * @param clientKey The key of the client (required)
   * @return ClientResource
   * @throws ApiException if fails to make API call
   */
  public ClientResource getClient(String clientKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      throw new ApiException(400, "Missing the required parameter 'clientKey' when calling getClient");
    }
    
    // create path and map variables
    String localVarPath = "/auth/clients/{client_key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "client_key" + "\\}", apiClient.escapeString(clientKey.toString()));

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

    GenericType<ClientResource> localVarReturnType = new GenericType<ClientResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List available client grant types
   * 
   * @return List<GrantTypeResource>
   * @throws ApiException if fails to make API call
   */
  public List<GrantTypeResource> getClientGrantTypes() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/auth/clients/grant-types".replaceAll("\\{format\\}","json");

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

    GenericType<List<GrantTypeResource>> localVarReturnType = new GenericType<List<GrantTypeResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search clients
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceClientResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceClientResource getClients(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/auth/clients".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceClientResource> localVarReturnType = new GenericType<PageResourceClientResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set grant types for a client
   * 
   * @param clientKey The key of the client (required)
   * @param grantList A list of unique grant types (optional)
   * @throws ApiException if fails to make API call
   */
  public void setClientGrantTypes(String clientKey, List<String> grantList) throws ApiException {
    Object localVarPostBody = grantList;
    
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      throw new ApiException(400, "Missing the required parameter 'clientKey' when calling setClientGrantTypes");
    }
    
    // create path and map variables
    String localVarPath = "/auth/clients/{client_key}/grant-types".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "client_key" + "\\}", apiClient.escapeString(clientKey.toString()));

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
  /**
   * Set redirect uris for a client
   * 
   * @param clientKey The key of the client (required)
   * @param redirectList A list of unique redirect uris (optional)
   * @throws ApiException if fails to make API call
   */
  public void setClientRedirectUris(String clientKey, List<String> redirectList) throws ApiException {
    Object localVarPostBody = redirectList;
    
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      throw new ApiException(400, "Missing the required parameter 'clientKey' when calling setClientRedirectUris");
    }
    
    // create path and map variables
    String localVarPath = "/auth/clients/{client_key}/redirect-uris".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "client_key" + "\\}", apiClient.escapeString(clientKey.toString()));

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
  /**
   * Update a client
   * 
   * @param clientKey The key of the client (required)
   * @param clientResource The client resource object (optional)
   * @return ClientResource
   * @throws ApiException if fails to make API call
   */
  public ClientResource updateClient(String clientKey, ClientResource clientResource) throws ApiException {
    Object localVarPostBody = clientResource;
    
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      throw new ApiException(400, "Missing the required parameter 'clientKey' when calling updateClient");
    }
    
    // create path and map variables
    String localVarPath = "/auth/clients/{client_key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "client_key" + "\\}", apiClient.escapeString(clientKey.toString()));

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

    GenericType<ClientResource> localVarReturnType = new GenericType<ClientResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
