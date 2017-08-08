package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.PageResourceSimpleReferenceResourceobject;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.VariableTypeResource;

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
@Component("com.knetikcloud.api.BRERuleEngineVariablesApi")
public class BRERuleEngineVariablesApi {
    private ApiClient apiClient;

    public BRERuleEngineVariablesApi() {
        this(new ApiClient());
    }

    @Autowired
    public BRERuleEngineVariablesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of variable types available
     * Types include integer, string, user and invoice. These are used to qualify trigger parameters and action variables with strong typing.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return List&lt;VariableTypeResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<VariableTypeResource> getBREVariableTypes() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/bre/variable-types").build().toUriString();
        
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

        ParameterizedTypeReference<List<VariableTypeResource>> returnType = new ParameterizedTypeReference<List<VariableTypeResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List valid values for a type
     * Used to lookup users to fill in a user constant for example. Only types marked as enumerable are suppoorted here.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param name The name of the type
     * @param filterName Filter results by those with names starting with this string
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceSimpleReferenceResourceobject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceSimpleReferenceResourceobject getBREVariableValues(String name, String filterName, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getBREVariableValues");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/bre/variable-types/{name}/values").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_name", filterName));
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

        ParameterizedTypeReference<PageResourceSimpleReferenceResourceobject> returnType = new ParameterizedTypeReference<PageResourceSimpleReferenceResourceobject>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
