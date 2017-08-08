package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.ClientResource;
import com.knetikcloud.model.PageResourceRoleResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.RoleResource;
import com.knetikcloud.model.UserResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class AuthRolesApi {
  private ApiClient apiClient;

  public AuthRolesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthRolesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new role
   * 
   * @param roleResource The role resource object (optional)
   * @return RoleResource
   * @throws ApiException if fails to make API call
   */
  public RoleResource createRole(RoleResource roleResource) throws ApiException {
    Object localVarPostBody = roleResource;
    
    // create path and map variables
    String localVarPath = "/auth/roles".replaceAll("\\{format\\}","json");

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

    GenericType<RoleResource> localVarReturnType = new GenericType<RoleResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a role
   * 
   * @param role The role value (required)
   * @param force If true, removes role from users/clients (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteRole(String role, Boolean force) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling deleteRole");
    }
    
    // create path and map variables
    String localVarPath = "/auth/roles/{role}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    
    
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
   * Get roles for a client
   * 
   * @param clientKey The client key (required)
   * @return List<RoleResource>
   * @throws ApiException if fails to make API call
   */
  public List<RoleResource> getClientRoles(String clientKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      throw new ApiException(400, "Missing the required parameter 'clientKey' when calling getClientRoles");
    }
    
    // create path and map variables
    String localVarPath = "/auth/clients/{client_key}/roles".replaceAll("\\{format\\}","json")
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

    GenericType<List<RoleResource>> localVarReturnType = new GenericType<List<RoleResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single role
   * 
   * @param role The role value (required)
   * @return RoleResource
   * @throws ApiException if fails to make API call
   */
  public RoleResource getRole(String role) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling getRole");
    }
    
    // create path and map variables
    String localVarPath = "/auth/roles/{role}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()));

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

    GenericType<RoleResource> localVarReturnType = new GenericType<RoleResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search roles
   * 
   * @param filterName Filter for roles that have a name starting with specified string (optional)
   * @param filterRole Filter for roles that have a role starting with specified string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return PageResourceRoleResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceRoleResource getRoles(String filterName, String filterRole, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/auth/roles".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_role", filterRole));
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

    GenericType<PageResourceRoleResource> localVarReturnType = new GenericType<PageResourceRoleResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get roles for a user
   * 
   * @param userId The user&#39;s id (required)
   * @return List<RoleResource>
   * @throws ApiException if fails to make API call
   */
  public List<RoleResource> getUserRoles(Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserRoles");
    }
    
    // create path and map variables
    String localVarPath = "/auth/users/{user_id}/roles".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<List<RoleResource>> localVarReturnType = new GenericType<List<RoleResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set roles for a client
   * 
   * @param clientKey The client key (required)
   * @param rolesList The list of unique roles (optional)
   * @return ClientResource
   * @throws ApiException if fails to make API call
   */
  public ClientResource setClientRoles(String clientKey, List<String> rolesList) throws ApiException {
    Object localVarPostBody = rolesList;
    
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      throw new ApiException(400, "Missing the required parameter 'clientKey' when calling setClientRoles");
    }
    
    // create path and map variables
    String localVarPath = "/auth/clients/{client_key}/roles".replaceAll("\\{format\\}","json")
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
  /**
   * Set permissions for a role
   * 
   * @param role The role value (required)
   * @param permissionsList The list of unique permissions (optional)
   * @return RoleResource
   * @throws ApiException if fails to make API call
   */
  public RoleResource setPermissionsForRole(String role, List<String> permissionsList) throws ApiException {
    Object localVarPostBody = permissionsList;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling setPermissionsForRole");
    }
    
    // create path and map variables
    String localVarPath = "/auth/roles/{role}/permissions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()));

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

    GenericType<RoleResource> localVarReturnType = new GenericType<RoleResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set roles for a user
   * 
   * @param userId The user&#39;s id (required)
   * @param rolesList The list of unique roles (optional)
   * @return UserResource
   * @throws ApiException if fails to make API call
   */
  public UserResource setUserRoles(Integer userId, List<String> rolesList) throws ApiException {
    Object localVarPostBody = rolesList;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setUserRoles");
    }
    
    // create path and map variables
    String localVarPath = "/auth/users/{user_id}/roles".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UserResource> localVarReturnType = new GenericType<UserResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a role
   * 
   * @param role The role value (required)
   * @param roleResource The role resource object (optional)
   * @return RoleResource
   * @throws ApiException if fails to make API call
   */
  public RoleResource updateRole(String role, RoleResource roleResource) throws ApiException {
    Object localVarPostBody = roleResource;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling updateRole");
    }
    
    // create path and map variables
    String localVarPath = "/auth/roles/{role}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()));

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

    GenericType<RoleResource> localVarReturnType = new GenericType<RoleResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
