package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.NewPasswordRequest;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceUserBaseResource;
import com.knetikcloud.model.PasswordResetRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.UserResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add a tag to a user
   * 
   * @param userId The id of the user (required)
   * @param tag tag (required)
   * @throws ApiException if fails to make API call
   */
  public void addUserTag(Integer userId, StringWrapper tag) throws ApiException {
    Object localVarPostBody = tag;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addUserTag");
    }
    
    // verify the required parameter 'tag' is set
    if (tag == null) {
      throw new ApiException(400, "Missing the required parameter 'tag' when calling addUserTag");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/tags".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Create a user template
   * User Templates define a type of user and the properties they have
   * @param userTemplateResource The user template resource object (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource createUserTemplate(TemplateResource userTemplateResource) throws ApiException {
    Object localVarPostBody = userTemplateResource;
    
    // create path and map variables
    String localVarPath = "/users/templates".replaceAll("\\{format\\}","json");

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
   * Delete a user template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserTemplate(String id, String cascade) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteUserTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/templates/{id}".replaceAll("\\{format\\}","json")
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
   * Get a single user
   * Additional private info is included as USERS_ADMIN
   * @param id The id of the user or &#39;me&#39; (required)
   * @return UserResource
   * @throws ApiException if fails to make API call
   */
  public UserResource getUser(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<UserResource> localVarReturnType = new GenericType<UserResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List tags for a user
   * 
   * @param userId The id of the user (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getUserTags(Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserTags");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/tags".replaceAll("\\{format\\}","json")
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

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single user template
   * 
   * @param id The id of the template (required)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource getUserTemplate(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUserTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/templates/{id}".replaceAll("\\{format\\}","json")
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
   * List and search user templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceTemplateResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceTemplateResource getUserTemplates(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/users/templates".replaceAll("\\{format\\}","json");

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
   * List and search users
   * Additional private info is included as USERS_ADMIN
   * @param filterDisplayname Filter for users whose display name starts with provided string. (optional)
   * @param filterEmail Filter for users whose email starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterFirstname Filter for users whose first name starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterFullname Filter for users whose full name starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterLastname Filter for users whose last name starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterUsername Filter for users whose username starts with the provided string. Requires USERS_ADMIN permission (optional)
   * @param filterTag Filter for users who have a given tag (optional)
   * @param filterGroup Filter for users in a given group, by unique name (optional)
   * @param filterRole Filter for users with a given role (optional)
   * @param filterSearch Filter for users whose display_name starts with the provided string, or username if display_name is null (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceUserBaseResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceUserBaseResource getUsers(String filterDisplayname, String filterEmail, String filterFirstname, String filterFullname, String filterLastname, String filterUsername, String filterTag, String filterGroup, String filterRole, String filterSearch, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/users".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_displayname", filterDisplayname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_email", filterEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_firstname", filterFirstname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_fullname", filterFullname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_lastname", filterLastname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_username", filterUsername));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tag", filterTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_group", filterGroup));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_role", filterRole));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_search", filterSearch));
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

    GenericType<PageResourceUserBaseResource> localVarReturnType = new GenericType<PageResourceUserBaseResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Choose a new password after a reset
   * Finish resetting a user&#39;s password using the secret provided from the password-reset endpoint.  Password should be in plain text and will be encrypted on receipt. Use SSL for security.
   * @param id The id of the user (required)
   * @param newPasswordRequest The new password request object (optional)
   * @throws ApiException if fails to make API call
   */
  public void passwordReset(Integer id, NewPasswordRequest newPasswordRequest) throws ApiException {
    Object localVarPostBody = newPasswordRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling passwordReset");
    }
    
    // create path and map variables
    String localVarPath = "/users/{id}/password-reset".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Register a new user
   * Password should be in plain text and will be encrypted on receipt. Use SSL for security
   * @param userResource The user resource object (optional)
   * @return UserResource
   * @throws ApiException if fails to make API call
   */
  public UserResource registerUser(UserResource userResource) throws ApiException {
    Object localVarPostBody = userResource;
    
    // create path and map variables
    String localVarPath = "/users".replaceAll("\\{format\\}","json");

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

    GenericType<UserResource> localVarReturnType = new GenericType<UserResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Remove a tag from a user
   * 
   * @param userId The id of the user (required)
   * @param tag The tag to remove (required)
   * @throws ApiException if fails to make API call
   */
  public void removeUserTag(Integer userId, String tag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeUserTag");
    }
    
    // verify the required parameter 'tag' is set
    if (tag == null) {
      throw new ApiException(400, "Missing the required parameter 'tag' when calling removeUserTag");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/tags/{tag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

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
   * Set a user&#39;s password
   * Password should be in plain text and will be encrypted on receipt. Use SSL for security.
   * @param id The id of the user (required)
   * @param password The new plain text password (optional)
   * @throws ApiException if fails to make API call
   */
  public void setPassword(Integer id, StringWrapper password) throws ApiException {
    Object localVarPostBody = password;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setPassword");
    }
    
    // create path and map variables
    String localVarPath = "/users/{id}/password".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Reset a user&#39;s password
   * A reset code will be generated and a &#39;forgot_password&#39; BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit
   * @param id The id of the user (required)
   * @throws ApiException if fails to make API call
   */
  public void startPasswordReset(Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling startPasswordReset");
    }
    
    // create path and map variables
    String localVarPath = "/users/{id}/password-reset".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Reset a user&#39;s password without user id
   * A reset code will be generated and a &#39;forgot_password&#39; BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit.  Must submit their email, username, or mobile phone number
   * @param passwordReset An object containing one of three methods to look up a user (optional)
   * @throws ApiException if fails to make API call
   */
  public void submitPasswordReset(PasswordResetRequest passwordReset) throws ApiException {
    Object localVarPostBody = passwordReset;
    
    // create path and map variables
    String localVarPath = "/users/password-reset".replaceAll("\\{format\\}","json");

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a user
   * Password will not be edited on this endpoint, use password specific endpoints.
   * @param id The id of the user or &#39;me&#39; (required)
   * @param userResource The user resource object (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateUser(String id, UserResource userResource) throws ApiException {
    Object localVarPostBody = userResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/{id}".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a user template
   * 
   * @param id The id of the template (required)
   * @param userTemplateResource The user template resource object (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource updateUserTemplate(String id, TemplateResource userTemplateResource) throws ApiException {
    Object localVarPostBody = userTemplateResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateUserTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/users/templates/{id}".replaceAll("\\{format\\}","json")
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
}
