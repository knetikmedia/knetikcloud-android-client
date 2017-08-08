package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.PageResourceUsageInfo;
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
@Component("com.knetikcloud.api.ReportingUsageApi")
public class ReportingUsageApi {
    private ApiClient apiClient;

    public ReportingUsageApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param startDate The beginning of the range being requested, unix timestamp in seconds
     * @param endDate The ending of the range being requested, unix timestamp in seconds
     * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object
     * @param method Filter for a certain endpoint method.  Must include url as well to work
     * @param url Filter for a certain endpoint.  Must include method as well to work
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceUsageInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceUsageInfo getUsageByDay(Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling getUsageByDay");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling getUsageByDay");
        }
        
        String path = UriComponentsBuilder.fromPath("/reporting/usage/day").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "combine_endpoints", combineEndpoints));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "method", method));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "url", url));
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

        ParameterizedTypeReference<PageResourceUsageInfo> returnType = new ParameterizedTypeReference<PageResourceUsageInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns aggregated endpoint usage information by hour
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param startDate The beginning of the range being requested, unix timestamp in seconds
     * @param endDate The ending of the range being requested, unix timestamp in seconds
     * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object
     * @param method Filter for a certain endpoint method.  Must include url as well to work
     * @param url Filter for a certain endpoint.  Must include method as well to work
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceUsageInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceUsageInfo getUsageByHour(Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling getUsageByHour");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling getUsageByHour");
        }
        
        String path = UriComponentsBuilder.fromPath("/reporting/usage/hour").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "combine_endpoints", combineEndpoints));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "method", method));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "url", url));
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

        ParameterizedTypeReference<PageResourceUsageInfo> returnType = new ParameterizedTypeReference<PageResourceUsageInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns aggregated endpoint usage information by minute
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param startDate The beginning of the range being requested, unix timestamp in seconds
     * @param endDate The ending of the range being requested, unix timestamp in seconds
     * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object
     * @param method Filter for a certain endpoint method.  Must include url as well to work
     * @param url Filter for a certain endpoint.  Must include method as well to work
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceUsageInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceUsageInfo getUsageByMinute(Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling getUsageByMinute");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling getUsageByMinute");
        }
        
        String path = UriComponentsBuilder.fromPath("/reporting/usage/minute").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "combine_endpoints", combineEndpoints));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "method", method));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "url", url));
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

        ParameterizedTypeReference<PageResourceUsageInfo> returnType = new ParameterizedTypeReference<PageResourceUsageInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns aggregated endpoint usage information by month
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param startDate The beginning of the range being requested, unix timestamp in seconds
     * @param endDate The ending of the range being requested, unix timestamp in seconds
     * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object
     * @param method Filter for a certain endpoint method.  Must include url as well to work
     * @param url Filter for a certain endpoint.  Must include method as well to work
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceUsageInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceUsageInfo getUsageByMonth(Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling getUsageByMonth");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling getUsageByMonth");
        }
        
        String path = UriComponentsBuilder.fromPath("/reporting/usage/month").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "combine_endpoints", combineEndpoints));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "method", method));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "url", url));
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

        ParameterizedTypeReference<PageResourceUsageInfo> returnType = new ParameterizedTypeReference<PageResourceUsageInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns aggregated endpoint usage information by year
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param startDate The beginning of the range being requested, unix timestamp in seconds
     * @param endDate The ending of the range being requested, unix timestamp in seconds
     * @param combineEndpoints Whether to combine counts from different endpoints. Removes the url and method from the result object
     * @param method Filter for a certain endpoint method.  Must include url as well to work
     * @param url Filter for a certain endpoint.  Must include method as well to work
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceUsageInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceUsageInfo getUsageByYear(Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling getUsageByYear");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling getUsageByYear");
        }
        
        String path = UriComponentsBuilder.fromPath("/reporting/usage/year").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "combine_endpoints", combineEndpoints));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "method", method));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "url", url));
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

        ParameterizedTypeReference<PageResourceUsageInfo> returnType = new ParameterizedTypeReference<PageResourceUsageInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns list of endpoints called (method and url)
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param startDate The beginning of the range being requested, unix timestamp in seconds
     * @param endDate The ending of the range being requested, unix timestamp in seconds
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> getUsageEndpoints(Long startDate, Long endDate) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling getUsageEndpoints");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling getUsageEndpoints");
        }
        
        String path = UriComponentsBuilder.fromPath("/reporting/usage/endpoints").build().toUriString();
        
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

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
