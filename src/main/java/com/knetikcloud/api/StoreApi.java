package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T17:55:38.520-04:00")
@Component("com.knetikcloud.api.StoreApi")
public class StoreApi {
    private ApiClient apiClient;

    public StoreApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param itemTemplateResource The new item template
     * @return StoreItemTemplateResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StoreItemTemplateResource createItemTemplate(StoreItemTemplateResource itemTemplateResource) throws RestClientException {
        Object postBody = itemTemplateResource;
        
        String path = UriComponentsBuilder.fromPath("/store/items/templates").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<StoreItemTemplateResource> returnType = new ParameterizedTypeReference<StoreItemTemplateResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a store item
     * SKUs have to be unique in the entire store. If a duplicate SKU is found, a 400 error is generated and the response will have a \&quot;parameters\&quot; field that is a list of duplicates. A duplicate is an object like {item_id, offending_sku_list}. Ex:&lt;br /&gt; {..., parameters: [[{item: 1, skus: [\&quot;SKU-1\&quot;]}]]}&lt;br /&gt; If an item is brand new and has duplicate SKUs within itself, the item ID will be 0.  Item subclasses are not allowed here, you will have to use their respective endpoints.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values.
     * @param storeItem The store item object
     * @return StoreItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StoreItem createStoreItem(Boolean cascade, StoreItem storeItem) throws RestClientException {
        Object postBody = storeItem;
        
        String path = UriComponentsBuilder.fromPath("/store/items").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cascade", cascade));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<StoreItem> returnType = new ParameterizedTypeReference<StoreItem>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete an item template
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the template
     * @param cascade force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteItemTemplate(String id, String cascade) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteItemTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/store/items/templates/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cascade", cascade));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete a store item
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the item
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteStoreItem(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteStoreItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/store/items/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List available item behaviors
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return List&lt;BehaviorDefinitionResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BehaviorDefinitionResource> getBehaviors() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/store/items/behaviors").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<List<BehaviorDefinitionResource>> returnType = new ParameterizedTypeReference<List<BehaviorDefinitionResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a single item template
     * Item Templates define a type of item and the properties they have.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the template
     * @return StoreItemTemplateResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StoreItemTemplateResource getItemTemplate(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getItemTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/store/items/templates/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<StoreItemTemplateResource> returnType = new ParameterizedTypeReference<StoreItemTemplateResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List and search item templates
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceStoreItemTemplateResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceStoreItemTemplateResource getItemTemplates(Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/store/items/templates").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PageResourceStoreItemTemplateResource> returnType = new ParameterizedTypeReference<PageResourceStoreItemTemplateResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a listing of store items
     * The exact structure of each items may differ to include fields specific to the type. The same is true for behaviors.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param limit The amount of items returned
     * @param page The page of the request
     * @param useCatalog Whether to remove items that are not intended for display or not in date
     * @param ignoreLocation Whether to ignore country restrictions based on the caller&#39;s location
     * @param inStockOnly Whether only in-stock items should be returned.  Default value is false
     * @return PageResourceStoreItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceStoreItem getStore(Integer limit, Integer page, Boolean useCatalog, Boolean ignoreLocation, Boolean inStockOnly) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/store").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "use_catalog", useCatalog));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ignore_location", ignoreLocation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "in_stock_only", inStockOnly));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PageResourceStoreItem> returnType = new ParameterizedTypeReference<PageResourceStoreItem>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a single store item
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the item
     * @return StoreItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StoreItem getStoreItem(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getStoreItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/store/items/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<StoreItem> returnType = new ParameterizedTypeReference<StoreItem>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List and search store items
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param filterNameSearch Filter for items whose name starts with a given string.
     * @param filterUniqueKey Filter for items whose unique_key is a given string.
     * @param filterPublished Filter for skus that have been published.
     * @param filterDisplayable Filter for items that are displayable.
     * @param filterStart A comma separated string without spaces.  First value is the operator to search on, second value is the store start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
     * @param filterEnd A comma separated string without spaces.  First value is the operator to search on, second value is the store end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
     * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the sku start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
     * @param filterStopDate A comma separated string without spaces.  First value is the operator to search on, second value is the sku end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
     * @param filterSku Filter for skus whose name starts with a given string.
     * @param filterPrice A colon separated string without spaces.  First value is the operator to search on, second value is the price of a sku.  Allowed operators: (LT, GT, LTE, GTE, EQ).
     * @param filterTag A comma separated list without spaces of the names of tags. Will only return items with at least one of the tags.
     * @param filterItemsByType Filter for item type based on its type hint.
     * @param filterBundledSkus Filter for skus inside bundles whose name starts with a given string.  Used only when type hint is &#39;bundle_item&#39;
     * @param filterVendor Filter for items from a given vendor, by id.
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceStoreItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceStoreItem getStoreItems(String filterNameSearch, String filterUniqueKey, Boolean filterPublished, Boolean filterDisplayable, String filterStart, String filterEnd, String filterStartDate, String filterStopDate, String filterSku, String filterPrice, String filterTag, String filterItemsByType, String filterBundledSkus, Integer filterVendor, Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/store/items").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_name_search", filterNameSearch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_unique_key", filterUniqueKey));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_published", filterPublished));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_displayable", filterDisplayable));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_start", filterStart));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_end", filterEnd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_start_date", filterStartDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_stop_date", filterStopDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_sku", filterSku));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_price", filterPrice));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tag", filterTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_items_by_type", filterItemsByType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_bundled_skus", filterBundledSkus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_vendor", filterVendor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PageResourceStoreItem> returnType = new ParameterizedTypeReference<PageResourceStoreItem>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * One-step purchase and pay for a single SKU item from a user&#39;s wallet
     * Used to create and automatically pay an invoice for a single unit of a single SKU from a user&#39;s wallet. SKU must be priced in virtual currency and must not be an item that requires shipping. PAYMENTS_ADMIN permission is required if user ID is specified and is not the ID of the currently logged in user. If invoice price does not match expected price, purchase is aborted
     * <p><b>200</b> - Item has been purchased, invoice provided in response
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Invoice total does not match SKU price
     * @param quickBuyRequest Quick buy details
     * @return InvoiceResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceResource quickBuy(QuickBuyRequest quickBuyRequest) throws RestClientException {
        Object postBody = quickBuyRequest;
        
        String path = UriComponentsBuilder.fromPath("/store/quick-buy").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<InvoiceResource> returnType = new ParameterizedTypeReference<InvoiceResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update an item template
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the template
     * @param itemTemplateResource The item template resource object
     * @return StoreItemTemplateResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StoreItemTemplateResource updateItemTemplate(String id, StoreItemTemplateResource itemTemplateResource) throws RestClientException {
        Object postBody = itemTemplateResource;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateItemTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/store/items/templates/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<StoreItemTemplateResource> returnType = new ParameterizedTypeReference<StoreItemTemplateResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a store item
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the item
     * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values.
     * @param storeItem The store item object
     * @return StoreItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StoreItem updateStoreItem(Integer id, Boolean cascade, StoreItem storeItem) throws RestClientException {
        Object postBody = storeItem;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateStoreItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/store/items/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cascade", cascade));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<StoreItem> returnType = new ParameterizedTypeReference<StoreItem>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
