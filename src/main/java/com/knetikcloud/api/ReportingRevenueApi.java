package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.PageResourceRevenueCountryReportResource;
import com.knetikcloud.model.PageResourceRevenueProductReportResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.RevenueReportResource;

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
@Component("com.knetikcloud.api.ReportingRevenueApi")
public class ReportingRevenueApi {
    private ApiClient apiClient;

    public ReportingRevenueApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param currencyCode The code for a currency to get sales data for
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
     * @return RevenueReportResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RevenueReportResource getItemRevenue(String currencyCode, Long startDate, Long endDate) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyCode' when calling getItemRevenue");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currency_code", currencyCode);
        String path = UriComponentsBuilder.fromPath("/reporting/revenue/item-sales/{currency_code}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<RevenueReportResource> returnType = new ParameterizedTypeReference<RevenueReportResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get refund revenue info
     * Get basic info about revenue loss from refunds (for all item types), summed up within a time range.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param currencyCode The code for a currency to get refund data for
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
     * @return RevenueReportResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RevenueReportResource getRefundRevenue(String currencyCode, Long startDate, Long endDate) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyCode' when calling getRefundRevenue");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currency_code", currencyCode);
        String path = UriComponentsBuilder.fromPath("/reporting/revenue/refunds/{currency_code}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<RevenueReportResource> returnType = new ParameterizedTypeReference<RevenueReportResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get revenue info by country
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param currencyCode The code for a currency to get sales data for
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceRevenueCountryReportResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceRevenueCountryReportResource getRevenueByCountry(String currencyCode, Long startDate, Long endDate, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyCode' when calling getRevenueByCountry");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currency_code", currencyCode);
        String path = UriComponentsBuilder.fromPath("/reporting/revenue/countries/{currency_code}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
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

        ParameterizedTypeReference<PageResourceRevenueCountryReportResource> returnType = new ParameterizedTypeReference<PageResourceRevenueCountryReportResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get revenue info by item
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param currencyCode The code for a currency to get sales data for
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceRevenueProductReportResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceRevenueProductReportResource getRevenueByItem(String currencyCode, Long startDate, Long endDate, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyCode' when calling getRevenueByItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currency_code", currencyCode);
        String path = UriComponentsBuilder.fromPath("/reporting/revenue/products/{currency_code}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
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

        ParameterizedTypeReference<PageResourceRevenueProductReportResource> returnType = new ParameterizedTypeReference<PageResourceRevenueProductReportResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get subscription revenue info
     * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param currencyCode The code for a currency to get sales data for
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
     * @return RevenueReportResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RevenueReportResource getSubscriptionRevenue(String currencyCode, Long startDate, Long endDate) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyCode' when calling getSubscriptionRevenue");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currency_code", currencyCode);
        String path = UriComponentsBuilder.fromPath("/reporting/revenue/subscription-sales/{currency_code}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<RevenueReportResource> returnType = new ParameterizedTypeReference<RevenueReportResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
