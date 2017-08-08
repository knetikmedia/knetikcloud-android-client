package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.CommentResource;
import com.knetikcloud.model.ContributionResource;
import com.knetikcloud.model.DispositionResource;
import com.knetikcloud.model.FlagResource;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.PageResourceCommentResource;
import com.knetikcloud.model.PageResourceDispositionResource;
import com.knetikcloud.model.PageResourceVideoRelationshipResource;
import com.knetikcloud.model.PageResourceVideoResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.VideoRelationshipResource;
import com.knetikcloud.model.VideoResource;

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
@Component("com.knetikcloud.api.MediaVideosApi")
public class MediaVideosApi {
    private ApiClient apiClient;

    public MediaVideosApi() {
        this(new ApiClient());
    }

    @Autowired
    public MediaVideosApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Adds a user to a video&#39;s whitelist
     * Whitelisted users can view video regardless of privacy setting.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The video id
     * @param userId The user id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addUserToVideoWhitelist(Long id, IntWrapper userId) throws RestClientException {
        Object postBody = userId;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling addUserToVideoWhitelist");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/media/videos/{id}/whitelist").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Adds a new video in the system
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoResource The video object
     * @return VideoResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoResource addVideo(VideoResource videoResource) throws RestClientException {
        Object postBody = videoResource;
        
        String path = UriComponentsBuilder.fromPath("/media/videos").build().toUriString();
        
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

        ParameterizedTypeReference<VideoResource> returnType = new ParameterizedTypeReference<VideoResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Add a new video comment
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id 
     * @param commentResource The comment object
     * @return CommentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentResource addVideoComment(Integer videoId, CommentResource commentResource) throws RestClientException {
        Object postBody = commentResource;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling addVideoComment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/comments").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CommentResource> returnType = new ParameterizedTypeReference<CommentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Adds a contributor to a video
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param contributionResource The contribution object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addVideoContributor(Long videoId, ContributionResource contributionResource) throws RestClientException {
        Object postBody = contributionResource;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling addVideoContributor");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/contributors").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Add a new flag
     * 
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param reason The flag reason
     * @return FlagResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FlagResource addVideoFlag(Long videoId, StringWrapper reason) throws RestClientException {
        Object postBody = reason;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling addVideoFlag");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/moderation").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<FlagResource> returnType = new ParameterizedTypeReference<FlagResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Adds one or more existing videos as related to this one
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param videoRelationshipResource The video relationship object 
     * @return VideoRelationshipResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoRelationshipResource addVideoRelationships(Long videoId, VideoRelationshipResource videoRelationshipResource) throws RestClientException {
        Object postBody = videoRelationshipResource;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling addVideoRelationships");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/related").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VideoRelationshipResource> returnType = new ParameterizedTypeReference<VideoRelationshipResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a video disposition
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param dispositionResource The disposition object
     * @return DispositionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DispositionResource createVideoDisposition(Integer videoId, DispositionResource dispositionResource) throws RestClientException {
        Object postBody = dispositionResource;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling createVideoDisposition");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/dispositions").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DispositionResource> returnType = new ParameterizedTypeReference<DispositionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a video from the system if no resources are attached to it
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The video id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteVideo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteVideo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/media/videos/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a video comment
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param id The comment id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteVideoComment(Long videoId, Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling deleteVideoComment");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteVideoComment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/comments/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a video disposition
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param dispositionId The disposition id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteVideoDisposition(Long dispositionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dispositionId' is set
        if (dispositionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dispositionId' when calling deleteVideoDisposition");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("disposition_id", dispositionId);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/dispositions/{disposition_id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a flag
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteVideoFlag(Long videoId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling deleteVideoFlag");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/moderation").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a video&#39;s relationship
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param id The relationship id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteVideoRelationship(Long videoId, Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling deleteVideoRelationship");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteVideoRelationship");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/related/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Get user videos
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The user id
     * @param excludeFlagged Skip videos that have been flagged by the current user
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceVideoResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceVideoResource getUserVideos(Integer userId, Boolean excludeFlagged, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserVideos");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/videos").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclude_flagged", excludeFlagged));
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

        ParameterizedTypeReference<PageResourceVideoResource> returnType = new ParameterizedTypeReference<PageResourceVideoResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Loads a specific video details
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The video id
     * @return VideoResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoResource getVideo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getVideo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/media/videos/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VideoResource> returnType = new ParameterizedTypeReference<VideoResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a page of comments for a video
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceCommentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceCommentResource getVideoComments(Integer videoId, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling getVideoComments");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/comments").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
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

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PageResourceCommentResource> returnType = new ParameterizedTypeReference<PageResourceCommentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a page of dispositions for a video
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceDispositionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceDispositionResource getVideoDispositions(Integer videoId, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling getVideoDispositions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/dispositions").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
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

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PageResourceDispositionResource> returnType = new ParameterizedTypeReference<PageResourceDispositionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a page of video relationships
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceVideoRelationshipResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceVideoRelationshipResource getVideoRelationships(Long videoId, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling getVideoRelationships");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/related").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
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

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PageResourceVideoRelationshipResource> returnType = new ParameterizedTypeReference<PageResourceVideoRelationshipResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Search videos using the documented filters
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param excludeFlagged Skip videos that have been flagged by the current user
     * @param filterVideosByUploader Filter for videos by uploader id
     * @param filterCategory Filter for videos from a specific category by id
     * @param filterTagset Filter for videos with specified tags (separated by comma)
     * @param filterVideosByName Filter for videos which name *STARTS* with the given string
     * @param filterVideosByContributor Filter for videos with contribution from the artist specified by ID
     * @param filterVideosByAuthor Filter for videos with an artist as author specified by ID
     * @param filterHasAuthor Filter for videos that have an author set if true, or that have no author if false
     * @param filterHasUploader Filter for videos that have an uploader set if true, or that have no uploader if false
     * @param filterRelatedTo Filter for videos that have designated a particular video as the TO of a relationship. Pattern should match VIDEO_ID or VIDEO_ID:DETAILS to match with a specific details string as well
     * @param filterFriends Filter for videos uploaded by friends. &#39;true&#39; for friends of the caller (requires user token) or a user id for a specific user&#39;s friends (requires VIDEOS_ADMIN permission)
     * @param filterDisposition Filter for videos a given user has a given disposition towards. USER_ID:DISPOSITION where USER_ID is the id of the user who has this disposition or &#39;me&#39; for the caller (requires user token for &#39;me&#39;) and DISPOSITION is the name of the disposition. E.G. filter_disposition&#x3D;123:like or filter_disposition&#x3D;me:favorite
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceVideoResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceVideoResource getVideos(Boolean excludeFlagged, Integer filterVideosByUploader, String filterCategory, String filterTagset, String filterVideosByName, Integer filterVideosByContributor, Integer filterVideosByAuthor, Boolean filterHasAuthor, Boolean filterHasUploader, String filterRelatedTo, Boolean filterFriends, String filterDisposition, Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/media/videos").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclude_flagged", excludeFlagged));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_videos_by_uploader", filterVideosByUploader));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_category", filterCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tagset", filterTagset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_videos_by_name", filterVideosByName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_videos_by_contributor", filterVideosByContributor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_videos_by_author", filterVideosByAuthor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_has_author", filterHasAuthor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_has_uploader", filterHasUploader));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_related_to", filterRelatedTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_friends", filterFriends));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_disposition", filterDisposition));
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

        ParameterizedTypeReference<PageResourceVideoResource> returnType = new ParameterizedTypeReference<PageResourceVideoResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Removes a user from a video&#39;s whitelist
     * Remove the user with the id given in the path from the whitelist of users that can view this video regardless of privacy setting.
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param id The user id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void removeUserFromVideoWhitelist(Long videoId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling removeUserFromVideoWhitelist");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling removeUserFromVideoWhitelist");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/whitelist/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Removes a contributor from a video
     * 
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param id The contributor id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void removeVideoContributor(Long videoId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling removeVideoContributor");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling removeVideoContributor");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/contributors/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Modifies a video&#39;s details
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The video id
     * @param videoResource The video object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateVideo(Long id, VideoResource videoResource) throws RestClientException {
        Object postBody = videoResource;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateVideo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/media/videos/{id}").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a video comment
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param id The comment id
     * @param content The comment content
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateVideoComment(Long videoId, Long id, StringWrapper content) throws RestClientException {
        Object postBody = content;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling updateVideoComment");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateVideoComment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/comments/{id}/content").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a video&#39;s relationship details
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param videoId The video id
     * @param relationshipId The relationship id
     * @param details The video relationship details
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateVideoRelationship(Long videoId, Long relationshipId, StringWrapper details) throws RestClientException {
        Object postBody = details;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling updateVideoRelationship");
        }
        
        // verify the required parameter 'relationshipId' is set
        if (relationshipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'relationshipId' when calling updateVideoRelationship");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("video_id", videoId);
        uriVariables.put("relationship_id", relationshipId);
        String path = UriComponentsBuilder.fromPath("/media/videos/{video_id}/related/{id}/relationship_details").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Increment a video&#39;s view count
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The video id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void viewVideo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling viewVideo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/media/videos/{id}/views").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
