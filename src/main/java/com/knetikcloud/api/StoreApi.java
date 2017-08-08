package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.BehaviorDefinitionResource;
import com.knetikcloud.model.InvoiceResource;
import com.knetikcloud.model.PageResourceStoreItem;
import com.knetikcloud.model.PageResourceStoreItemTemplateResource;
import com.knetikcloud.model.QuickBuyRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StoreItem;
import com.knetikcloud.model.StoreItemTemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class StoreApi {
  private ApiClient apiClient;

  public StoreApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StoreApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create an item template
   * Item Templates define a type of item and the properties they have.
   * @param itemTemplateResource The new item template (optional)
   * @return StoreItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public StoreItemTemplateResource createItemTemplate(StoreItemTemplateResource itemTemplateResource) throws ApiException {
    Object localVarPostBody = itemTemplateResource;
    
    // create path and map variables
    String localVarPath = "/store/items/templates".replaceAll("\\{format\\}","json");

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

    GenericType<StoreItemTemplateResource> localVarReturnType = new GenericType<StoreItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a store item
   * SKUs have to be unique in the entire store. If a duplicate SKU is found, a 400 error is generated and the response will have a \&quot;parameters\&quot; field that is a list of duplicates. A duplicate is an object like {item_id, offending_sku_list}. Ex:&lt;br /&gt; {..., parameters: [[{item: 1, skus: [\&quot;SKU-1\&quot;]}]]}&lt;br /&gt; If an item is brand new and has duplicate SKUs within itself, the item ID will be 0.  Item subclasses are not allowed here, you will have to use their respective endpoints.
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param storeItem The store item object (optional)
   * @return StoreItem
   * @throws ApiException if fails to make API call
   */
  public StoreItem createStoreItem(Boolean cascade, StoreItem storeItem) throws ApiException {
    Object localVarPostBody = storeItem;
    
    // create path and map variables
    String localVarPath = "/store/items".replaceAll("\\{format\\}","json");

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

    GenericType<StoreItem> localVarReturnType = new GenericType<StoreItem>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an item template
   * 
   * @param id The id of the template (required)
   * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemTemplate(String id, String cascade) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteItemTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/store/items/templates/{id}".replaceAll("\\{format\\}","json")
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
   * Delete a store item
   * 
   * @param id The id of the item (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteStoreItem(Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteStoreItem");
    }
    
    // create path and map variables
    String localVarPath = "/store/items/{id}".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * List available item behaviors
   * 
   * @return List<BehaviorDefinitionResource>
   * @throws ApiException if fails to make API call
   */
  public List<BehaviorDefinitionResource> getBehaviors() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/store/items/behaviors".replaceAll("\\{format\\}","json");

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

    GenericType<List<BehaviorDefinitionResource>> localVarReturnType = new GenericType<List<BehaviorDefinitionResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single item template
   * Item Templates define a type of item and the properties they have.
   * @param id The id of the template (required)
   * @return StoreItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public StoreItemTemplateResource getItemTemplate(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getItemTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/store/items/templates/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<StoreItemTemplateResource> localVarReturnType = new GenericType<StoreItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search item templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceStoreItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceStoreItemTemplateResource getItemTemplates(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/store/items/templates".replaceAll("\\{format\\}","json");

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

    GenericType<PageResourceStoreItemTemplateResource> localVarReturnType = new GenericType<PageResourceStoreItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a listing of store items
   * The exact structure of each items may differ to include fields specific to the type. The same is true for behaviors.
   * @param limit The amount of items returned (optional)
   * @param page The page of the request (optional)
   * @param useCatalog Whether to remove items that are not intended for display or not in date (optional)
   * @param ignoreLocation Whether to ignore country restrictions based on the caller&#39;s location (optional)
   * @param inStockOnly Whether only in-stock items should be returned.  Default value is false (optional, default to false)
   * @return PageResourceStoreItem
   * @throws ApiException if fails to make API call
   */
  public PageResourceStoreItem getStore(Integer limit, Integer page, Boolean useCatalog, Boolean ignoreLocation, Boolean inStockOnly) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/store".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "use_catalog", useCatalog));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ignore_location", ignoreLocation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "in_stock_only", inStockOnly));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageResourceStoreItem> localVarReturnType = new GenericType<PageResourceStoreItem>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single store item
   * 
   * @param id The id of the item (required)
   * @return StoreItem
   * @throws ApiException if fails to make API call
   */
  public StoreItem getStoreItem(Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStoreItem");
    }
    
    // create path and map variables
    String localVarPath = "/store/items/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<StoreItem> localVarReturnType = new GenericType<StoreItem>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search store items
   * 
   * @param filterNameSearch Filter for items whose name starts with a given string. (optional)
   * @param filterUniqueKey Filter for items whose unique_key is a given string. (optional)
   * @param filterPublished Filter for skus that have been published. (optional)
   * @param filterDisplayable Filter for items that are displayable. (optional)
   * @param filterStart A comma separated string without spaces.  First value is the operator to search on, second value is the store start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterEnd A comma separated string without spaces.  First value is the operator to search on, second value is the store end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the sku start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterStopDate A comma separated string without spaces.  First value is the operator to search on, second value is the sku end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterSku Filter for skus whose name starts with a given string. (optional)
   * @param filterPrice A colon separated string without spaces.  First value is the operator to search on, second value is the price of a sku.  Allowed operators: (LT, GT, LTE, GTE, EQ). (optional)
   * @param filterTag A comma separated list without spaces of the names of tags. Will only return items with at least one of the tags. (optional)
   * @param filterItemsByType Filter for item type based on its type hint. (optional)
   * @param filterBundledSkus Filter for skus inside bundles whose name starts with a given string.  Used only when type hint is &#39;bundle_item&#39; (optional)
   * @param filterVendor Filter for items from a given vendor, by id. (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceStoreItem
   * @throws ApiException if fails to make API call
   */
  public PageResourceStoreItem getStoreItems(String filterNameSearch, String filterUniqueKey, Boolean filterPublished, Boolean filterDisplayable, String filterStart, String filterEnd, String filterStartDate, String filterStopDate, String filterSku, String filterPrice, String filterTag, String filterItemsByType, String filterBundledSkus, Integer filterVendor, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/store/items".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name_search", filterNameSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_unique_key", filterUniqueKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_published", filterPublished));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_displayable", filterDisplayable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_start", filterStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_end", filterEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_start_date", filterStartDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_stop_date", filterStopDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_sku", filterSku));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_price", filterPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tag", filterTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_items_by_type", filterItemsByType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_bundled_skus", filterBundledSkus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_vendor", filterVendor));
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

    GenericType<PageResourceStoreItem> localVarReturnType = new GenericType<PageResourceStoreItem>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * One-step purchase and pay for a single SKU item from a user&#39;s wallet
   * Used to create and automatically pay an invoice for a single unit of a single SKU from a user&#39;s wallet. SKU must be priced in virtual currency and must not be an item that requires shipping. PAYMENTS_ADMIN permission is required if user ID is specified and is not the ID of the currently logged in user. If invoice price does not match expected price, purchase is aborted
   * @param quickBuyRequest Quick buy details (optional)
   * @return InvoiceResource
   * @throws ApiException if fails to make API call
   */
  public InvoiceResource quickBuy(QuickBuyRequest quickBuyRequest) throws ApiException {
    Object localVarPostBody = quickBuyRequest;
    
    // create path and map variables
    String localVarPath = "/store/quick-buy".replaceAll("\\{format\\}","json");

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
   * Update an item template
   * 
   * @param id The id of the template (required)
   * @param itemTemplateResource The item template resource object (optional)
   * @return StoreItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public StoreItemTemplateResource updateItemTemplate(String id, StoreItemTemplateResource itemTemplateResource) throws ApiException {
    Object localVarPostBody = itemTemplateResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateItemTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/store/items/templates/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<StoreItemTemplateResource> localVarReturnType = new GenericType<StoreItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a store item
   * 
   * @param id The id of the item (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param storeItem The store item object (optional)
   * @return StoreItem
   * @throws ApiException if fails to make API call
   */
  public StoreItem updateStoreItem(Integer id, Boolean cascade, StoreItem storeItem) throws ApiException {
    Object localVarPostBody = storeItem;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateStoreItem");
    }
    
    // create path and map variables
    String localVarPath = "/store/items/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<StoreItem> localVarReturnType = new GenericType<StoreItem>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
