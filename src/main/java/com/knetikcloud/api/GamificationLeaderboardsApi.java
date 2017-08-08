package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.LeaderboardEntryResource;
import com.knetikcloud.model.LeaderboardResource;
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
@Component("com.knetikcloud.api.GamificationLeaderboardsApi")
public class GamificationLeaderboardsApi {
    private ApiClient apiClient;

    public GamificationLeaderboardsApi() {
        this(new ApiClient());
    }

    @Autowired
    public GamificationLeaderboardsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieves leaderboard details and paginated entries
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. Sorting is based on the fields of LeaderboardEntryResource rather than the returned LeaderboardResource.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param contextType The context type for the leaderboard
     * @param contextId The context id for the leaderboard
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return LeaderboardResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LeaderboardResource getLeaderboard(String contextType, String contextId, Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'contextType' is set
        if (contextType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contextType' when calling getLeaderboard");
        }
        
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contextId' when calling getLeaderboard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("context_type", contextType);
        uriVariables.put("context_id", contextId);
        String path = UriComponentsBuilder.fromPath("/leaderboards/{context_type}/{context_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<LeaderboardResource> returnType = new ParameterizedTypeReference<LeaderboardResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a specific user entry with rank
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param contextType The context type for the leaderboard
     * @param contextId The context id for the leaderboard
     * @param id The id of a user
     * @return LeaderboardEntryResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LeaderboardEntryResource getLeaderboardRank(String contextType, String contextId, String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'contextType' is set
        if (contextType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contextType' when calling getLeaderboardRank");
        }
        
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contextId' when calling getLeaderboardRank");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getLeaderboardRank");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("context_type", contextType);
        uriVariables.put("context_id", contextId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/leaderboards/{context_type}/{context_id}/users/{id}/rank").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<LeaderboardEntryResource> returnType = new ParameterizedTypeReference<LeaderboardEntryResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a list of available leaderboard strategy names
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> getLeaderboardStrategies() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/leaderboards/strategies").build().toUriString();
        
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

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
