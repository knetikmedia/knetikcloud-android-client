package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.PageResourceAggregateInvoiceReportResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class ReportingOrdersApi {
  private ApiClient apiClient;

  public ReportingOrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportingOrdersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve invoice counts aggregated by time ranges
   * 
   * @param currencyCode The code for a currency to get sales data for (required)
   * @param granularity The time duration to aggregate by (optional, default to day)
   * @param filterPaymentStatus A payment status to filter results by, can be a comma separated list (optional)
   * @param filterFulfillmentStatus An invoice fulfillment status to filter results by, can be a comma separated list (optional)
   * @param startDate The start of the time range to return, unix timestamp in seconds. Default is beginning of time (optional)
   * @param endDate The end of the time range to return, unix timestamp in seconds. Default is end of time (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @return PageResourceAggregateInvoiceReportResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceAggregateInvoiceReportResource getInvoiceReports(String currencyCode, String granularity, String filterPaymentStatus, String filterFulfillmentStatus, Long startDate, Long endDate, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyCode' when calling getInvoiceReports");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/orders/count/{currency_code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_payment_status", filterPaymentStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_fulfillment_status", filterFulfillmentStatus));
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

    GenericType<PageResourceAggregateInvoiceReportResource> localVarReturnType = new GenericType<PageResourceAggregateInvoiceReportResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
