package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.PageResourceRevenueCountryReportResource;
import com.knetikcloud.model.PageResourceRevenueProductReportResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.RevenueReportResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class ReportingRevenueApi {
  private ApiClient apiClient;

  public ReportingRevenueApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportingRevenueApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get item revenue info
   * Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range
   * @param currencyCode The code for a currency to get sales data for (required)
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @return RevenueReportResource
   * @throws ApiException if fails to make API call
   */
  public RevenueReportResource getItemRevenue(String currencyCode, Long startDate, Long endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyCode' when calling getItemRevenue");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/revenue/item-sales/{currency_code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

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

    GenericType<RevenueReportResource> localVarReturnType = new GenericType<RevenueReportResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get refund revenue info
   * Get basic info about revenue loss from refunds (for all item types), summed up within a time range.
   * @param currencyCode The code for a currency to get refund data for (required)
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @return RevenueReportResource
   * @throws ApiException if fails to make API call
   */
  public RevenueReportResource getRefundRevenue(String currencyCode, Long startDate, Long endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyCode' when calling getRefundRevenue");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/revenue/refunds/{currency_code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

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

    GenericType<RevenueReportResource> localVarReturnType = new GenericType<RevenueReportResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get revenue info by country
   * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top
   * @param currencyCode The code for a currency to get sales data for (required)
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceRevenueCountryReportResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceRevenueCountryReportResource getRevenueByCountry(String currencyCode, Long startDate, Long endDate, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyCode' when calling getRevenueByCountry");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/revenue/countries/{currency_code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
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

    GenericType<PageResourceRevenueCountryReportResource> localVarReturnType = new GenericType<PageResourceRevenueCountryReportResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get revenue info by item
   * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top
   * @param currencyCode The code for a currency to get sales data for (required)
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceRevenueProductReportResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceRevenueProductReportResource getRevenueByItem(String currencyCode, Long startDate, Long endDate, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyCode' when calling getRevenueByItem");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/revenue/products/{currency_code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
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

    GenericType<PageResourceRevenueProductReportResource> localVarReturnType = new GenericType<PageResourceRevenueProductReportResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get subscription revenue info
   * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range
   * @param currencyCode The code for a currency to get sales data for (required)
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
   * @return RevenueReportResource
   * @throws ApiException if fails to make API call
   */
  public RevenueReportResource getSubscriptionRevenue(String currencyCode, Long startDate, Long endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyCode' when calling getSubscriptionRevenue");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/revenue/subscription-sales/{currency_code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

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

    GenericType<RevenueReportResource> localVarReturnType = new GenericType<RevenueReportResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
