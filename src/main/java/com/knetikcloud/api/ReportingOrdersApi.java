package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.PageResourceAggregateInvoiceReportResource;
import com.knetikcloud.model.Result;

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
@Component("com.knetikcloud.api.ReportingOrdersApi")
public class ReportingOrdersApi {
    private ApiClient apiClient;

    public ReportingOrdersApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param currencyCode The code for a currency to get sales data for
     * @param granularity The time duration to aggregate by
     * @param filterPaymentStatus A payment status to filter results by, can be a comma separated list
     * @param filterFulfillmentStatus An invoice fulfillment status to filter results by, can be a comma separated list
     * @param startDate The start of the time range to return, unix timestamp in seconds. Default is beginning of time
     * @param endDate The end of the time range to return, unix timestamp in seconds. Default is end of time
     * @param size The number of objects returned per page
     * @param page The number of the page returned
     * @return PageResourceAggregateInvoiceReportResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceAggregateInvoiceReportResource getInvoiceReports(String currencyCode, String granularity, String filterPaymentStatus, String filterFulfillmentStatus, Long startDate, Long endDate, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyCode' when calling getInvoiceReports");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currency_code", currencyCode);
        String path = UriComponentsBuilder.fromPath("/reporting/orders/count/{currency_code}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "granularity", granularity));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_payment_status", filterPaymentStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_fulfillment_status", filterFulfillmentStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PageResourceAggregateInvoiceReportResource> returnType = new ParameterizedTypeReference<PageResourceAggregateInvoiceReportResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
