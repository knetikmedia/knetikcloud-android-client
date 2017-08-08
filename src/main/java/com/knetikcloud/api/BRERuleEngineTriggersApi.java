package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.PageResourceBreTriggerResource;
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
@Component("com.knetikcloud.api.BRERuleEngineTriggersApi")
public class BRERuleEngineTriggersApi {
    private ApiClient apiClient;

    public BRERuleEngineTriggersApi() {
        this(new ApiClient());
    }

    @Autowired
    public BRERuleEngineTriggersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a trigger
     * Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param breTriggerResource The BRE trigger resource object
     * @return BreTriggerResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BreTriggerResource createBRETrigger(BreTriggerResource breTriggerResource) throws RestClientException {
        Object postBody = breTriggerResource;
        
        String path = UriComponentsBuilder.fromPath("/bre/triggers").build().toUriString();
        
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

        ParameterizedTypeReference<BreTriggerResource> returnType = new ParameterizedTypeReference<BreTriggerResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete a trigger
     * May fail if there are existing rules against it. Cannot delete core triggers
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param eventName The trigger event name
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteBRETrigger(String eventName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'eventName' is set
        if (eventName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventName' when calling deleteBRETrigger");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("event_name", eventName);
        String path = UriComponentsBuilder.fromPath("/bre/triggers/{event_name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Get a single trigger
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param eventName The trigger event name
     * @return BreTriggerResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BreTriggerResource getBRETrigger(String eventName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'eventName' is set
        if (eventName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventName' when calling getBRETrigger");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("event_name", eventName);
        String path = UriComponentsBuilder.fromPath("/bre/triggers/{event_name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<BreTriggerResource> returnType = new ParameterizedTypeReference<BreTriggerResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List triggers
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param filterSystem Filter for triggers that are system triggers when true, or not when false. Leave off for both mixed
     * @param filterCategory Filter for triggers that are within a specific category
     * @param filterTags Filter for triggers that have all of the given tags (comma separated list)
     * @param filterName Filter for triggers that have names containing the given string
     * @param filterSearch Filter for triggers containing the given words somewhere within name, description and tags
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceBreTriggerResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceBreTriggerResource getBRETriggers(Boolean filterSystem, String filterCategory, String filterTags, String filterName, String filterSearch, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/bre/triggers").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_system", filterSystem));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_category", filterCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tags", filterTags));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_search", filterSearch));
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

        ParameterizedTypeReference<PageResourceBreTriggerResource> returnType = new ParameterizedTypeReference<PageResourceBreTriggerResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a trigger
     * May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param eventName The trigger event name
     * @param breTriggerResource The BRE trigger resource object
     * @return BreTriggerResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BreTriggerResource updateBRETrigger(String eventName, BreTriggerResource breTriggerResource) throws RestClientException {
        Object postBody = breTriggerResource;
        
        // verify the required parameter 'eventName' is set
        if (eventName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventName' when calling updateBRETrigger");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("event_name", eventName);
        String path = UriComponentsBuilder.fromPath("/bre/triggers/{event_name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<BreTriggerResource> returnType = new ParameterizedTypeReference<BreTriggerResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
