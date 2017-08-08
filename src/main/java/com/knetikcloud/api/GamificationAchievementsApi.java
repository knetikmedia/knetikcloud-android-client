package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.AchievementDefinitionResource;
import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.PageResourceAchievementDefinitionResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceUserAchievementGroupResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.UserAchievementGroupResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class GamificationAchievementsApi {
  private ApiClient apiClient;

  public GamificationAchievementsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GamificationAchievementsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new achievement definition
   * If the definition contains a trigger event name, a BRE rule is created, so that tracking logic is executed when the triggering event occurs. If no trigger event name is specified, the user&#39;s achievement status must manually be updated via the API.
   * @param achievement The achievement definition (optional)
   * @return AchievementDefinitionResource
   * @throws ApiException if fails to make API call
   */
  public AchievementDefinitionResource createAchievement(AchievementDefinitionResource achievement) throws ApiException {
    Object localVarPostBody = achievement;
    
    // create path and map variables
    String localVarPath = "/achievements".replaceAll("\\{format\\}","json");

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

    GenericType<AchievementDefinitionResource> localVarReturnType = new GenericType<AchievementDefinitionResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create an achievement template
   * Achievement templates define a type of achievement and the properties they have
   * @param template The achievement template to be created (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource createAchievementTemplate(TemplateResource template) throws ApiException {
    Object localVarPostBody = template;
    
    // create path and map variables
    String localVarPath = "/achievements/templates".replaceAll("\\{format\\}","json");

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
   * Delete an achievement definition
   * Will also disable the associated generated rule, if any.
   * @param name The name of the achievement (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAchievement(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deleteAchievement");
    }
    
    // create path and map variables
    String localVarPath = "/achievements/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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
   * Delete an achievement template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteAchievementTemplate(String id, String cascade) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAchievementTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/achievements/templates/{id}".replaceAll("\\{format\\}","json")
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
   * Get a single achievement definition
   * 
   * @param name The name of the achievement (required)
   * @return AchievementDefinitionResource
   * @throws ApiException if fails to make API call
   */
  public AchievementDefinitionResource getAchievement(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getAchievement");
    }
    
    // create path and map variables
    String localVarPath = "/achievements/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

    GenericType<AchievementDefinitionResource> localVarReturnType = new GenericType<AchievementDefinitionResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single achievement template
   * 
   * @param id The id of the template (required)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource getAchievementTemplate(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAchievementTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/achievements/templates/{id}".replaceAll("\\{format\\}","json")
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
   * List and search achievement templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceTemplateResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceTemplateResource getAchievementTemplates(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/achievements/templates".replaceAll("\\{format\\}","json");

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
   * Get the list of triggers that can be used to trigger an achievement progress update
   * 
   * @return List<BreTriggerResource>
   * @throws ApiException if fails to make API call
   */
  public List<BreTriggerResource> getAchievementTriggers() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/achievements/triggers".replaceAll("\\{format\\}","json");

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

    GenericType<List<BreTriggerResource>> localVarReturnType = new GenericType<List<BreTriggerResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all achievement definitions in the system
   * 
   * @param filterTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterName Filter for achievements whose name contains a string (optional)
   * @param filterHidden Filter for achievements that are hidden or not (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @param filterDerived Filter for achievements that are derived from other services (optional, default to false)
   * @return PageResourceAchievementDefinitionResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceAchievementDefinitionResource getAchievements(String filterTagset, String filterName, Boolean filterHidden, Integer size, Integer page, String order, Boolean filterDerived) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/achievements".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tagset", filterTagset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_hidden", filterHidden));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_derived", filterDerived));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceAchievementDefinitionResource> localVarReturnType = new GenericType<PageResourceAchievementDefinitionResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of derived achievements
   * Used by other services that depend on achievements
   * @param name The name of the derived achievement (required)
   * @return List<AchievementDefinitionResource>
   * @throws ApiException if fails to make API call
   */
  public List<AchievementDefinitionResource> getDerivedAchievements(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getDerivedAchievements");
    }
    
    // create path and map variables
    String localVarPath = "/achievements/derived/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

    GenericType<List<AchievementDefinitionResource>> localVarReturnType = new GenericType<List<AchievementDefinitionResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve progress on a given achievement for a given user
   * Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.
   * @param userId The user&#39;s id (required)
   * @param achievementName The achievement&#39;s name (required)
   * @return UserAchievementGroupResource
   * @throws ApiException if fails to make API call
   */
  public UserAchievementGroupResource getUserAchievementProgress(Integer userId, String achievementName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserAchievementProgress");
    }
    
    // verify the required parameter 'achievementName' is set
    if (achievementName == null) {
      throw new ApiException(400, "Missing the required parameter 'achievementName' when calling getUserAchievementProgress");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/achievements/{achievement_name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "achievement_name" + "\\}", apiClient.escapeString(achievementName.toString()));

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

    GenericType<UserAchievementGroupResource> localVarReturnType = new GenericType<UserAchievementGroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve progress on achievements for a given user
   * Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.
   * @param userId The user&#39;s id (required)
   * @param filterAchievementDerived Filter for achievements that are derived from other services (optional)
   * @param filterAchievementTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterAchievementName Filter for achievements whose name contains a string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUserAchievementGroupResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceUserAchievementGroupResource getUserAchievementsProgress(Integer userId, Boolean filterAchievementDerived, String filterAchievementTagset, String filterAchievementName, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserAchievementsProgress");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/achievements".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_achievement_derived", filterAchievementDerived));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_achievement_tagset", filterAchievementTagset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_achievement_name", filterAchievementName));
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

    GenericType<PageResourceUserAchievementGroupResource> localVarReturnType = new GenericType<PageResourceUserAchievementGroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve progress on a given achievement for all users
   * Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed.
   * @param achievementName The achievement&#39;s name (required)
   * @param filterAchievementDerived Filter for achievements that are derived from other services (optional)
   * @param filterAchievementTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterAchievementName Filter for achievements whose name contains a string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUserAchievementGroupResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceUserAchievementGroupResource getUsersAchievementProgress(String achievementName, Boolean filterAchievementDerived, String filterAchievementTagset, String filterAchievementName, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'achievementName' is set
    if (achievementName == null) {
      throw new ApiException(400, "Missing the required parameter 'achievementName' when calling getUsersAchievementProgress");
    }
    
    // create path and map variables
    String localVarPath = "/users/achievements/{achievement_name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "achievement_name" + "\\}", apiClient.escapeString(achievementName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_achievement_derived", filterAchievementDerived));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_achievement_tagset", filterAchievementTagset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_achievement_name", filterAchievementName));
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

    GenericType<PageResourceUserAchievementGroupResource> localVarReturnType = new GenericType<PageResourceUserAchievementGroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve progress on achievements for all users
   * Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed.
   * @param filterAchievementDerived Filter for achievements that are derived from other services (optional)
   * @param filterAchievementTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterAchievementName Filter for achievements whose name contains a string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUserAchievementGroupResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceUserAchievementGroupResource getUsersAchievementsProgress(Boolean filterAchievementDerived, String filterAchievementTagset, String filterAchievementName, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/users/achievements".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_achievement_derived", filterAchievementDerived));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_achievement_tagset", filterAchievementTagset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_achievement_name", filterAchievementName));
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

    GenericType<PageResourceUserAchievementGroupResource> localVarReturnType = new GenericType<PageResourceUserAchievementGroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Increment an achievement progress record for a user
   * If no progress record yet exists for the user, it will be created. Otherwise it will be updated and the provided value added to the existing progress. May be negative. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
   * @param userId The user&#39;s id (required)
   * @param achievementName The achievement&#39;s name (required)
   * @param progress The amount to add to the progress value (optional)
   * @return UserAchievementGroupResource
   * @throws ApiException if fails to make API call
   */
  public UserAchievementGroupResource incrementAchievementProgress(Integer userId, String achievementName, IntWrapper progress) throws ApiException {
    Object localVarPostBody = progress;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling incrementAchievementProgress");
    }
    
    // verify the required parameter 'achievementName' is set
    if (achievementName == null) {
      throw new ApiException(400, "Missing the required parameter 'achievementName' when calling incrementAchievementProgress");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/achievements/{achievement_name}/progress".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "achievement_name" + "\\}", apiClient.escapeString(achievementName.toString()));

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

    GenericType<UserAchievementGroupResource> localVarReturnType = new GenericType<UserAchievementGroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set an achievement progress record for a user
   * If no progress record yet exists for the user, it will be created. Otherwise it will be updated and progress set to the provided value. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
   * @param userId The user&#39;s id (required)
   * @param achievementName The achievement&#39;s name (required)
   * @param progress The new progress value (optional)
   * @return UserAchievementGroupResource
   * @throws ApiException if fails to make API call
   */
  public UserAchievementGroupResource setAchievementProgress(Integer userId, String achievementName, IntWrapper progress) throws ApiException {
    Object localVarPostBody = progress;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setAchievementProgress");
    }
    
    // verify the required parameter 'achievementName' is set
    if (achievementName == null) {
      throw new ApiException(400, "Missing the required parameter 'achievementName' when calling setAchievementProgress");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/achievements/{achievement_name}/progress".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "achievement_name" + "\\}", apiClient.escapeString(achievementName.toString()));

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

    GenericType<UserAchievementGroupResource> localVarReturnType = new GenericType<UserAchievementGroupResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an achievement definition
   * The existing generated rule, if any, will be deleted. A new rule will be created if a trigger event name is specified in the new version.
   * @param name The name of the achievement (required)
   * @param achievement The achievement definition (optional)
   * @return AchievementDefinitionResource
   * @throws ApiException if fails to make API call
   */
  public AchievementDefinitionResource updateAchievement(String name, AchievementDefinitionResource achievement) throws ApiException {
    Object localVarPostBody = achievement;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling updateAchievement");
    }
    
    // create path and map variables
    String localVarPath = "/achievements/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

    GenericType<AchievementDefinitionResource> localVarReturnType = new GenericType<AchievementDefinitionResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an achievement template
   * 
   * @param id The id of the template (required)
   * @param template The updated template (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource updateAchievementTemplate(String id, TemplateResource template) throws ApiException {
    Object localVarPostBody = template;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateAchievementTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/achievements/templates/{id}".replaceAll("\\{format\\}","json")
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
