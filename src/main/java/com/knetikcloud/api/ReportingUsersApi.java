package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.PageResourceAggregateCountResource;
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
@Component("com.knetikcloud.api.ReportingUsersApi")
public class ReportingUsersApi {
    private ApiClient apiClient;

    public ReportingUsersApi() {
        this(new ApiClient());
    }

    @Autowired
    public ReportingUsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get user registration info
     * Get user registration counts grouped by time range
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param granularity The time duration to aggregate by
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceAggregateCountResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceAggregateCountResource getUserRegistrations(String granularity, Long startDate, Long endDate, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/reporting/users/registrations").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "granularity", granularity));
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

        ParameterizedTypeReference<PageResourceAggregateCountResource> returnType = new ParameterizedTypeReference<PageResourceAggregateCountResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
