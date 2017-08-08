package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.PageResourceUsageInfo;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class ReportingUsageApi {
  private ApiClient apiClient;

  public ReportingUsageApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportingUsageApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Returns aggregated endpoint usage information by day
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUsageInfo
   * @throws ApiException if fails to make API call
   */
  public PageResourceUsageInfo getUsageByDay(Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByDay");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByDay");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/usage/day".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "combine_endpoints", combineEndpoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "method", method));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
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

    GenericType<PageResourceUsageInfo> localVarReturnType = new GenericType<PageResourceUsageInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns aggregated endpoint usage information by hour
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUsageInfo
   * @throws ApiException if fails to make API call
   */
  public PageResourceUsageInfo getUsageByHour(Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByHour");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByHour");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/usage/hour".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "combine_endpoints", combineEndpoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "method", method));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
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

    GenericType<PageResourceUsageInfo> localVarReturnType = new GenericType<PageResourceUsageInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns aggregated endpoint usage information by minute
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUsageInfo
   * @throws ApiException if fails to make API call
   */
  public PageResourceUsageInfo getUsageByMinute(Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByMinute");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByMinute");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/usage/minute".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "combine_endpoints", combineEndpoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "method", method));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
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

    GenericType<PageResourceUsageInfo> localVarReturnType = new GenericType<PageResourceUsageInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns aggregated endpoint usage information by month
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUsageInfo
   * @throws ApiException if fails to make API call
   */
  public PageResourceUsageInfo getUsageByMonth(Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByMonth");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByMonth");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/usage/month".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "combine_endpoints", combineEndpoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "method", method));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
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

    GenericType<PageResourceUsageInfo> localVarReturnType = new GenericType<PageResourceUsageInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns aggregated endpoint usage information by year
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @param combineEndpoints Whether to combine counts from different endpoints. Removes the url and method from the result object (optional, default to false)
   * @param method Filter for a certain endpoint method.  Must include url as well to work (optional)
   * @param url Filter for a certain endpoint.  Must include method as well to work (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceUsageInfo
   * @throws ApiException if fails to make API call
   */
  public PageResourceUsageInfo getUsageByYear(Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByYear");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByYear");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/usage/year".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "combine_endpoints", combineEndpoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "method", method));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
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

    GenericType<PageResourceUsageInfo> localVarReturnType = new GenericType<PageResourceUsageInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns list of endpoints called (method and url)
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds (required)
   * @param endDate The ending of the range being requested, unix timestamp in seconds (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getUsageEndpoints(Long startDate, Long endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageEndpoints");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageEndpoints");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/usage/endpoints".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));

    
    
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
}
