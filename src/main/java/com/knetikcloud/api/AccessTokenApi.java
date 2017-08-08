package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.OAuth2Resource;

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
@Component("com.knetikcloud.api.AccessTokenApi")
public class AccessTokenApi {
    private ApiClient apiClient;

    public AccessTokenApi() {
        this(new ApiClient());
    }

    @Autowired
    public AccessTokenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get access token
     * 
     * <p><b>200</b> - OK
     * @param grantType Grant type
     * @param clientId The id of the client
     * @param clientSecret The secret key of the client.  Used only with a grant_type of client_credentials
     * @param username The username of the client.  Used only with a grant_type of password
     * @param password The password of the client.  Used only with a grant_type of password
     * @return OAuth2Resource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OAuth2Resource getOAuthToken(String grantType, String clientId, String clientSecret, String username, String password) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'grantType' when calling getOAuthToken");
        }
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling getOAuthToken");
        }
        
        String path = UriComponentsBuilder.fromPath("/oauth/token").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (grantType != null)
            formParams.add("grant_type", grantType);
        if (clientId != null)
            formParams.add("client_id", clientId);
        if (clientSecret != null)
            formParams.add("client_secret", clientSecret);
        if (username != null)
            formParams.add("username", username);
        if (password != null)
            formParams.add("password", password);

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<OAuth2Resource> returnType = new ParameterizedTypeReference<OAuth2Resource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
