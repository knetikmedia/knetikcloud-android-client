package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.PageResourcePermissionResource;
import com.knetikcloud.model.PermissionResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class AuthPermissionsApi {
  private ApiClient apiClient;

  public AuthPermissionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthPermissionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new permission
   * 
   * @param permissionResource The permission resource object (optional)
   * @return PermissionResource
   * @throws ApiException if fails to make API call
   */
  public PermissionResource createPermission(PermissionResource permissionResource) throws ApiException {
    Object localVarPostBody = permissionResource;
    
    // create path and map variables
    String localVarPath = "/auth/permissions".replaceAll("\\{format\\}","json");

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

    GenericType<PermissionResource> localVarReturnType = new GenericType<PermissionResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a permission
   * 
   * @param permission The permission value (required)
   * @param force If true, removes permission assigned to roles (optional)
   * @throws ApiException if fails to make API call
   */
  public void deletePermission(String permission, Boolean force) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'permission' is set
    if (permission == null) {
      throw new ApiException(400, "Missing the required parameter 'permission' when calling deletePermission");
    }
    
    // create path and map variables
    String localVarPath = "/auth/permissions/{permission}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "permission" + "\\}", apiClient.escapeString(permission.toString()));

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
   * Get a single permission
   * 
   * @param permission The permission value (required)
   * @return PermissionResource
   * @throws ApiException if fails to make API call
   */
  public PermissionResource getPermission(String permission) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'permission' is set
    if (permission == null) {
      throw new ApiException(400, "Missing the required parameter 'permission' when calling getPermission");
    }
    
    // create path and map variables
    String localVarPath = "/auth/permissions/{permission}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "permission" + "\\}", apiClient.escapeString(permission.toString()));

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

    GenericType<PermissionResource> localVarReturnType = new GenericType<PermissionResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search permissions
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to permission:ASC)
   * @return PageResourcePermissionResource
   * @throws ApiException if fails to make API call
   */
  public PageResourcePermissionResource getPermissions(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/auth/permissions".replaceAll("\\{format\\}","json");

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

    GenericType<PageResourcePermissionResource> localVarReturnType = new GenericType<PageResourcePermissionResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a permission
   * 
   * @param permission The permission value (required)
   * @param permissionResource The permission resource object (optional)
   * @return PermissionResource
   * @throws ApiException if fails to make API call
   */
  public PermissionResource updatePermission(String permission, PermissionResource permissionResource) throws ApiException {
    Object localVarPostBody = permissionResource;
    
    // verify the required parameter 'permission' is set
    if (permission == null) {
      throw new ApiException(400, "Missing the required parameter 'permission' when calling updatePermission");
    }
    
    // create path and map variables
    String localVarPath = "/auth/permissions/{permission}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "permission" + "\\}", apiClient.escapeString(permission.toString()));

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

    GenericType<PermissionResource> localVarReturnType = new GenericType<PermissionResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
