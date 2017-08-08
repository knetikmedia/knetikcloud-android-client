package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.EntitlementGrantRequest;
import com.knetikcloud.model.EntitlementItem;
import com.knetikcloud.model.InvoiceResource;
import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.PageResourceEntitlementItem;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.PageResourceUserInventoryResource;
import com.knetikcloud.model.PageResourceUserItemLogResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserInventoryAddRequest;
import com.knetikcloud.model.UserInventoryResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class UsersInventoryApi {
  private ApiClient apiClient;

  public UsersInventoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersInventoryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Adds an item to the user inventory
   * The inventory is fulfilled asynchronously UNLESS the invoice is explicitely skipped. Depending on the use case, it might require the client to verify that the entitlement was added after the fact or configure a BRE rule to get a notification in real time
   * @param id The id of the user (required)
   * @param userInventoryAddRequest The user inventory add request object (optional)
   * @return InvoiceResource
   * @throws ApiException if fails to make API call
   */
  public InvoiceResource addItemToUserInventory(Integer id, UserInventoryAddRequest userInventoryAddRequest) throws ApiException {
    Object localVarPostBody = userInventoryAddRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addItemToUserInventory");
    }
    
    // create path and map variables
    String localVarPath = "/users/{id}/inventory".replaceAll("\\{format\\}","json")
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

    GenericType<InvoiceResource> localVarReturnType = new GenericType<InvoiceResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Check for access to an item without consuming
   * Useful for pre-check and accounts for all various buisness rules
   * @param userId The id of the user to check for or &#39;me&#39; for logged in user (required)
   * @param itemId The id of the item (required)
   * @param sku The specific sku of an entitlement list addition to check entitlement for. This is of very limited and specific use and should generally be left out (optional)
   * @throws ApiException if fails to make API call
   */
  public void checkUserEntitlementItem(String userId, Integer itemId, String sku) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling checkUserEntitlementItem");
    }
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling checkUserEntitlementItem");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/entitlements/{item_id}/check".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "item_id" + "\\}", apiClient.escapeString(itemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sku", sku));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Create an entitlement item
   * 
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param entitlementItem The entitlement item object (optional)
   * @return EntitlementItem
   * @throws ApiException if fails to make API call
   */
  public EntitlementItem createEntitlementItem(Boolean cascade, EntitlementItem entitlementItem) throws ApiException {
    Object localVarPostBody = entitlementItem;
    
    // create path and map variables
    String localVarPath = "/entitlements".replaceAll("\\{format\\}","json");

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

    GenericType<EntitlementItem> localVarReturnType = new GenericType<EntitlementItem>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create an entitlement template
   * Entitlement templates define a type of entitlement and the properties they have
   * @param template The entitlement template to be created (optional)
   * @return ItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public ItemTemplateResource createEntitlementTemplate(ItemTemplateResource template) throws ApiException {
    Object localVarPostBody = template;
    
    // create path and map variables
    String localVarPath = "/entitlements/templates".replaceAll("\\{format\\}","json");

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

    GenericType<ItemTemplateResource> localVarReturnType = new GenericType<ItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an entitlement item
   * 
   * @param entitlementId The id of the entitlement (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteEntitlementItem(Integer entitlementId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'entitlementId' is set
    if (entitlementId == null) {
      throw new ApiException(400, "Missing the required parameter 'entitlementId' when calling deleteEntitlementItem");
    }
    
    // create path and map variables
    String localVarPath = "/entitlements/{entitlement_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "entitlement_id" + "\\}", apiClient.escapeString(entitlementId.toString()));

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
   * Delete an entitlement template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteEntitlementTemplate(String id, String cascade) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteEntitlementTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/entitlements/templates/{id}".replaceAll("\\{format\\}","json")
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
   * Get a single entitlement item
   * 
   * @param entitlementId The id of the entitlement (required)
   * @return EntitlementItem
   * @throws ApiException if fails to make API call
   */
  public EntitlementItem getEntitlementItem(Integer entitlementId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'entitlementId' is set
    if (entitlementId == null) {
      throw new ApiException(400, "Missing the required parameter 'entitlementId' when calling getEntitlementItem");
    }
    
    // create path and map variables
    String localVarPath = "/entitlements/{entitlement_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "entitlement_id" + "\\}", apiClient.escapeString(entitlementId.toString()));

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

    GenericType<EntitlementItem> localVarReturnType = new GenericType<EntitlementItem>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search entitlement items
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceEntitlementItem
   * @throws ApiException if fails to make API call
   */
  public PageResourceEntitlementItem getEntitlementItems(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/entitlements".replaceAll("\\{format\\}","json");

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

    GenericType<PageResourceEntitlementItem> localVarReturnType = new GenericType<PageResourceEntitlementItem>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single entitlement template
   * 
   * @param id The id of the template (required)
   * @return ItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public ItemTemplateResource getEntitlementTemplate(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getEntitlementTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/entitlements/templates/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<ItemTemplateResource> localVarReturnType = new GenericType<ItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search entitlement templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceItemTemplateResource getEntitlementTemplates(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/entitlements/templates".replaceAll("\\{format\\}","json");

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

    GenericType<PageResourceItemTemplateResource> localVarReturnType = new GenericType<PageResourceItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List the user inventory entries for a given user
   * 
   * @param id The id of the user (required)
   * @param inactive If true, accepts inactive user inventories (optional, default to false)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param filterItemName Filter by items whose name starts with a string (optional)
   * @param filterItemId Filter by item id (optional)
   * @param filterUsername Filter by entries owned by the user with the specified username (optional)
   * @param filterGroup Filter by entries owned by the users in a given group, by unique name (optional)
   * @param filterDate A comma separated string without spaces.  First value is the operator to search on, second value is the log start date, a unix timestamp in seconds. Can be repeated for a range, eg: GT,123,LT,456  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @return PageResourceUserInventoryResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceUserInventoryResource getUserInventories(Integer id, Boolean inactive, Integer size, Integer page, String filterItemName, Integer filterItemId, String filterUsername, String filterGroup, String filterDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUserInventories");
    }
    
    // create path and map variables
    String localVarPath = "/users/{id}/inventory".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "inactive", inactive));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_item_name", filterItemName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_item_id", filterItemId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_username", filterUsername));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_group", filterGroup));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_date", filterDate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceUserInventoryResource> localVarReturnType = new GenericType<PageResourceUserInventoryResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get an inventory entry
   * 
   * @param userId The id of the inventory owner or &#39;me&#39; for the logged in user (required)
   * @param id The id of the user inventory (required)
   * @return UserInventoryResource
   * @throws ApiException if fails to make API call
   */
  public UserInventoryResource getUserInventory(Integer userId, Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserInventory");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUserInventory");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/inventory/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
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

    GenericType<UserInventoryResource> localVarReturnType = new GenericType<UserInventoryResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List the log entries for this inventory entry
   * 
   * @param userId The id of the inventory owner or &#39;me&#39; for the logged in user (required)
   * @param id The id of the user inventory (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUserItemLogResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceUserItemLogResource getUserInventoryLog(String userId, Integer id, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserInventoryLog");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUserInventoryLog");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/inventory/{id}/log".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<PageResourceUserItemLogResource> localVarReturnType = new GenericType<PageResourceUserItemLogResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List the user inventory entries for all users
   * 
   * @param inactive If true, accepts inactive user inventories (optional, default to false)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param filterItemName Filter by items whose name starts with a string (optional)
   * @param filterItemId Filter by item id (optional)
   * @param filterUsername Filter by entries owned by the user with the specified username (optional)
   * @param filterGroup Filter by entries owned by the users in a given group, by unique name (optional)
   * @param filterDate A comma separated string without spaces.  First value is the operator to search on, second value is the log start date, a unix timestamp in seconds. Can be repeated for a range, eg: GT,123,LT,456  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @return PageResourceUserInventoryResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceUserInventoryResource getUsersInventory(Boolean inactive, Integer size, Integer page, String filterItemName, Integer filterItemId, String filterUsername, String filterGroup, String filterDate) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/inventories".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "inactive", inactive));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_item_name", filterItemName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_item_id", filterItemId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_username", filterUsername));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_group", filterGroup));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_date", filterDate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceUserInventoryResource> localVarReturnType = new GenericType<PageResourceUserInventoryResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Grant an entitlement
   * 
   * @param userId The id of the user to grant the entitlement to (required)
   * @param grantRequest grantRequest (required)
   * @throws ApiException if fails to make API call
   */
  public void grantUserEntitlement(Integer userId, EntitlementGrantRequest grantRequest) throws ApiException {
    Object localVarPostBody = grantRequest;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling grantUserEntitlement");
    }
    
    // verify the required parameter 'grantRequest' is set
    if (grantRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'grantRequest' when calling grantUserEntitlement");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/entitlements".replaceAll("\\{format\\}","json")
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
   * Update an entitlement item
   * 
   * @param entitlementId The id of the entitlement (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param entitlementItem The entitlement item object (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateEntitlementItem(Integer entitlementId, Boolean cascade, EntitlementItem entitlementItem) throws ApiException {
    Object localVarPostBody = entitlementItem;
    
    // verify the required parameter 'entitlementId' is set
    if (entitlementId == null) {
      throw new ApiException(400, "Missing the required parameter 'entitlementId' when calling updateEntitlementItem");
    }
    
    // create path and map variables
    String localVarPath = "/entitlements/{entitlement_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "entitlement_id" + "\\}", apiClient.escapeString(entitlementId.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update an entitlement template
   * 
   * @param id The id of the template (required)
   * @param template The updated template (optional)
   * @return ItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public ItemTemplateResource updateEntitlementTemplate(String id, ItemTemplateResource template) throws ApiException {
    Object localVarPostBody = template;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateEntitlementTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/entitlements/templates/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<ItemTemplateResource> localVarReturnType = new GenericType<ItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set the behavior data for an inventory entry
   * 
   * @param userId The id of the user (required)
   * @param id The id of the user inventory (required)
   * @param data The data map (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateUserInventoryBehaviorData(Integer userId, Integer id, Object data) throws ApiException {
    Object localVarPostBody = data;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUserInventoryBehaviorData");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateUserInventoryBehaviorData");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/inventory/{id}/behavior-data".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
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
   * Set the expiration date
   * Will change the current grace period for a subscription but not the bill date (possibly even ending before having the chance to re-bill)
   * @param userId user_id (required)
   * @param id The id of the user inventory (required)
   * @param timestamp The new expiration date as a unix timestamp in seconds. May be null (no body). (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateUserInventoryExpires(Integer userId, Integer id, Long timestamp) throws ApiException {
    Object localVarPostBody = timestamp;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUserInventoryExpires");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateUserInventoryExpires");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/inventory/{id}/expires".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
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
   * Set the status for an inventory entry
   * 
   * @param userId The id of the user (required)
   * @param id The id of the user inventory (required)
   * @param inventoryStatus The inventory status object (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateUserInventoryStatus(Integer userId, Integer id, String inventoryStatus) throws ApiException {
    Object localVarPostBody = inventoryStatus;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUserInventoryStatus");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateUserInventoryStatus");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/inventory/{id}/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
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
   * Use an item
   * 
   * @param userId The id of the user to check for or &#39;me&#39; for logged in user (required)
   * @param itemId The id of the item (required)
   * @param sku The specific sku of an entitlement_list addition to check entitlement for. This is of very limited and specific use and should generally be left out (optional)
   * @param info Any additional info to add to the log about this use (optional)
   * @throws ApiException if fails to make API call
   */
  public void useUserEntitlementItem(String userId, Integer itemId, String sku, String info) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling useUserEntitlementItem");
    }
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling useUserEntitlementItem");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/entitlements/{item_id}/use".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "item_id" + "\\}", apiClient.escapeString(itemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sku", sku));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "info", info));

    
    
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
}
