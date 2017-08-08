package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.PageResourceMapstringobject;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SearchReferenceMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class SearchApi {
  private ApiClient apiClient;

  public SearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add a new object to an index
   * Mainly intended for internal use.
   * @param type The index type (required)
   * @param id The ID of the object (required)
   * @param object The object to add (optional)
   * @throws ApiException if fails to make API call
   */
  public void addSearchIndex(String type, String id, Object object) throws ApiException {
    Object localVarPostBody = object;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling addSearchIndex");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addSearchIndex");
    }
    
    // create path and map variables
    String localVarPath = "/search/index/{type}/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Register reference mappings
   * Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use.
   * @param mappings The mappings to add (optional)
   * @throws ApiException if fails to make API call
   */
  public void addSearchMappings(List<SearchReferenceMapping> mappings) throws ApiException {
    Object localVarPostBody = mappings;
    
    // create path and map variables
    String localVarPath = "/search/mappings".replaceAll("\\{format\\}","json");

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
   * Delete an object
   * Mainly intended for internal use. Requires SEARCH_ADMIN.
   * @param type The index type (required)
   * @param id The ID of the object to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSearchIndex(String type, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling deleteSearchIndex");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteSearchIndex");
    }
    
    // create path and map variables
    String localVarPath = "/search/index/{type}/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
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
   * Delete all objects in an index
   * Mainly intended for internal use
   * @param type The index type (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSearchIndexes(String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling deleteSearchIndexes");
    }
    
    // create path and map variables
    String localVarPath = "/search/index/{type}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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
   * Search an index
   * The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type. See individual search endpoints on other resources for details on their format.
   * @param type The index type (required)
   * @param query The query to be used for the search (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceMapstringobject
   * @throws ApiException if fails to make API call
   */
  public PageResourceMapstringobject searchIndex(String type, Object query, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchIndex");
    }
    
    // create path and map variables
    String localVarPath = "/search/index/{type}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageResourceMapstringobject> localVarReturnType = new GenericType<PageResourceMapstringobject>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
