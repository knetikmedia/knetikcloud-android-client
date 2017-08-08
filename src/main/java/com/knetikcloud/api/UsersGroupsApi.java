package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.GroupMemberResource;
import com.knetikcloud.model.GroupResource;
import com.knetikcloud.model.PageResourceGroupMemberResource;
import com.knetikcloud.model.PageResourceGroupResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class UsersGroupsApi {
  private ApiClient apiClient;

  public UsersGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersGroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Adds a new member to the group
   * 
   * @param uniqueName The group unique name (required)
   * @param user The id and status for a user to add to the group (required)
   * @return GroupMemberResource
   * @throws ApiException if fails to make API call
   */
  public GroupMemberResource addMemberToGroup(String uniqueName, GroupMemberResource user) throws ApiException {
    Object localVarPostBody = user;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling addMemberToGroup");
    }
    
    // verify the required parameter 'user' is set
    if (user == null) {
      throw new ApiException(400, "Missing the required parameter 'user' when calling addMemberToGroup");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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

    GenericType<GroupMemberResource> localVarReturnType = new GenericType<GroupMemberResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Adds multiple members to the group
   * 
   * @param uniqueName The group unique name (required)
   * @param users The id and status for a list of users to add to the group (required)
   * @return List<GroupMemberResource>
   * @throws ApiException if fails to make API call
   */
  public List<GroupMemberResource> addMembersToGroup(String uniqueName, List<GroupMemberResource> users) throws ApiException {
    Object localVarPostBody = users;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling addMembersToGroup");
    }
    
    // verify the required parameter 'users' is set
    if (users == null) {
      throw new ApiException(400, "Missing the required parameter 'users' when calling addMembersToGroup");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members/batch-add".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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

    GenericType<List<GroupMemberResource>> localVarReturnType = new GenericType<List<GroupMemberResource>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a group
   * 
   * @param groupResource The new group (optional)
   * @return GroupResource
   * @throws ApiException if fails to make API call
   */
  public GroupResource createGroup(GroupResource groupResource) throws ApiException {
    Object localVarPostBody = groupResource;
    
    // create path and map variables
    String localVarPath = "/users/groups".replaceAll("\\{format\\}","json");

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

    GenericType<GroupResource> localVarReturnType = new GenericType<GroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a group template
   * Group Templates define a type of group and the properties they have
   * @param groupTemplateResource The group template resource object (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource createGroupTemplate(TemplateResource groupTemplateResource) throws ApiException {
    Object localVarPostBody = groupTemplateResource;
    
    // create path and map variables
    String localVarPath = "/users/groups/templates".replaceAll("\\{format\\}","json");

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

    GenericType<TemplateResource> localVarReturnType = new GenericType<TemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Removes a group from the system IF no resources are attached to it
   * 
   * @param uniqueName The group unique name (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGroup(String uniqueName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling deleteGroup");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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
   * Delete a group template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteGroupTemplate(String id, String cascade) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteGroupTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/templates/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cascade", cascade));

    
    
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
   * Loads a specific group&#39;s details
   * 
   * @param uniqueName The group unique name (required)
   * @return GroupResource
   * @throws ApiException if fails to make API call
   */
  public GroupResource getGroup(String uniqueName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling getGroup");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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

    GenericType<GroupResource> localVarReturnType = new GenericType<GroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a user from a group
   * 
   * @param uniqueName The group unique name (required)
   * @param userId The id of the user (required)
   * @return GroupMemberResource
   * @throws ApiException if fails to make API call
   */
  public GroupMemberResource getGroupMember(String uniqueName, Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling getGroupMember");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members/{user_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    GenericType<GroupMemberResource> localVarReturnType = new GenericType<GroupMemberResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Lists members of the group
   * 
   * @param uniqueName The group unique name (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceGroupMemberResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceGroupMemberResource getGroupMembers(String uniqueName, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling getGroupMembers");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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

    GenericType<PageResourceGroupMemberResource> localVarReturnType = new GenericType<PageResourceGroupMemberResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single group template
   * 
   * @param id The id of the template (required)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource getGroupTemplate(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/templates/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<TemplateResource> localVarReturnType = new GenericType<TemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search group templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceTemplateResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceTemplateResource getGroupTemplates(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/users/groups/templates".replaceAll("\\{format\\}","json");

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

    GenericType<PageResourceTemplateResource> localVarReturnType = new GenericType<PageResourceTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List groups a user is in
   * 
   * @param userId The id of the user (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getGroupsForUser(Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getGroupsForUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/groups".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Removes a user from a group
   * 
   * @param uniqueName The group unique name (required)
   * @param userId The id of the user to remove (required)
   * @throws ApiException if fails to make API call
   */
  public void removeGroupMember(String uniqueName, Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling removeGroupMember");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeGroupMember");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members/{user_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()))
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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a group
   * 
   * @param uniqueName The group unique name (required)
   * @param groupResource The updated group (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateGroup(String uniqueName, GroupResource groupResource) throws ApiException {
    Object localVarPostBody = groupResource;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling updateGroup");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()));

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
   * Change a user&#39;s status
   * 
   * @param uniqueName The group unique name (required)
   * @param userId The user id of the member to modify (required)
   * @param status The new status for the user (required)
   * @throws ApiException if fails to make API call
   */
  public void updateGroupMemberStatus(String uniqueName, Integer userId, String status) throws ApiException {
    Object localVarPostBody = status;
    
    // verify the required parameter 'uniqueName' is set
    if (uniqueName == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueName' when calling updateGroupMemberStatus");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateGroupMemberStatus");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling updateGroupMemberStatus");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/{unique_name}/members/{user_id}/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "unique_name" + "\\}", apiClient.escapeString(uniqueName.toString()))
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a group template
   * 
   * @param id The id of the template (required)
   * @param groupTemplateResource The group template resource object (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource updateGroupTemplate(String id, TemplateResource groupTemplateResource) throws ApiException {
    Object localVarPostBody = groupTemplateResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateGroupTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/groups/templates/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<TemplateResource> localVarReturnType = new GenericType<TemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search groups
   * 
   * @param filterTemplate Filter for groups using a specific template, by id (optional)
   * @param filterMemberCount Filters groups by member count. Multiple values possible for range search. Format: filter_member_count&#x3D;OP,ts&amp;... where OP in (GT, LT, GOE, LOE, EQ). Ex: filter_member_count&#x3D;GT,14,LT,17 (optional)
   * @param filterName Filter for groups with names starting with the given string (optional)
   * @param filterUniqueName Filter for groups whose unique_name starts with provided string (optional)
   * @param filterParent Filter for groups with a specific parent, by unique name (optional)
   * @param filterStatus Filter for groups with a certain status (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return PageResourceGroupResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceGroupResource updateGroups(String filterTemplate, String filterMemberCount, String filterName, String filterUniqueName, String filterParent, String filterStatus, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/users/groups".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_template", filterTemplate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_member_count", filterMemberCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_unique_name", filterUniqueName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_parent", filterParent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_status", filterStatus));
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

    GenericType<PageResourceGroupResource> localVarReturnType = new GenericType<PageResourceGroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
