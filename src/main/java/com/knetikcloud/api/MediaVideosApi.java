package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class MediaVideosApi {
  private ApiClient apiClient;

  public MediaVideosApi() {
    this(Configuration.getDefaultApiClient());
  }

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
   * @param id The video id (required)
   * @param userId The user id (optional)
   * @throws ApiException if fails to make API call
   */
  public void addUserToVideoWhitelist(Long id, IntWrapper userId) throws ApiException {
    Object localVarPostBody = userId;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addUserToVideoWhitelist");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{id}/whitelist".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Adds a new video in the system
   * 
   * @param videoResource The video object (optional)
   * @return VideoResource
   * @throws ApiException if fails to make API call
   */
  public VideoResource addVideo(VideoResource videoResource) throws ApiException {
    Object localVarPostBody = videoResource;
    
    // create path and map variables
    String localVarPath = "/media/videos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<VideoResource> localVarReturnType = new GenericType<VideoResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add a new video comment
   * 
   * @param videoId The video id  (required)
   * @param commentResource The comment object (optional)
   * @return CommentResource
   * @throws ApiException if fails to make API call
   */
  public CommentResource addVideoComment(Integer videoId, CommentResource commentResource) throws ApiException {
    Object localVarPostBody = commentResource;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling addVideoComment");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/comments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<CommentResource> localVarReturnType = new GenericType<CommentResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Adds a contributor to a video
   * 
   * @param videoId The video id (required)
   * @param contributionResource The contribution object (optional)
   * @throws ApiException if fails to make API call
   */
  public void addVideoContributor(Long videoId, ContributionResource contributionResource) throws ApiException {
    Object localVarPostBody = contributionResource;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling addVideoContributor");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/contributors".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Add a new flag
   * 
   * @param videoId The video id (required)
   * @param reason The flag reason (optional)
   * @return FlagResource
   * @throws ApiException if fails to make API call
   */
  public FlagResource addVideoFlag(Long videoId, StringWrapper reason) throws ApiException {
    Object localVarPostBody = reason;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling addVideoFlag");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/moderation".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<FlagResource> localVarReturnType = new GenericType<FlagResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Adds one or more existing videos as related to this one
   * 
   * @param videoId The video id (required)
   * @param videoRelationshipResource The video relationship object  (optional)
   * @return VideoRelationshipResource
   * @throws ApiException if fails to make API call
   */
  public VideoRelationshipResource addVideoRelationships(Long videoId, VideoRelationshipResource videoRelationshipResource) throws ApiException {
    Object localVarPostBody = videoRelationshipResource;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling addVideoRelationships");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/related".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<VideoRelationshipResource> localVarReturnType = new GenericType<VideoRelationshipResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a video disposition
   * 
   * @param videoId The video id (required)
   * @param dispositionResource The disposition object (optional)
   * @return DispositionResource
   * @throws ApiException if fails to make API call
   */
  public DispositionResource createVideoDisposition(Integer videoId, DispositionResource dispositionResource) throws ApiException {
    Object localVarPostBody = dispositionResource;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling createVideoDisposition");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/dispositions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<DispositionResource> localVarReturnType = new GenericType<DispositionResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes a video from the system if no resources are attached to it
   * 
   * @param id The video id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVideo(Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteVideo");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a video comment
   * 
   * @param videoId The video id (required)
   * @param id The comment id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVideoComment(Long videoId, Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling deleteVideoComment");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteVideoComment");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/comments/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a video disposition
   * 
   * @param dispositionId The disposition id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVideoDisposition(Long dispositionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispositionId' is set
    if (dispositionId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispositionId' when calling deleteVideoDisposition");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/dispositions/{disposition_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "disposition_id" + "\\}", apiClient.escapeString(dispositionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a flag
   * 
   * @param videoId The video id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVideoFlag(Long videoId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling deleteVideoFlag");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/moderation".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a video&#39;s relationship
   * 
   * @param videoId The video id (required)
   * @param id The relationship id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVideoRelationship(Long videoId, Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling deleteVideoRelationship");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteVideoRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/related/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get user videos
   * 
   * @param userId The user id (required)
   * @param excludeFlagged Skip videos that have been flagged by the current user (optional, default to true)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceVideoResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceVideoResource getUserVideos(Integer userId, Boolean excludeFlagged, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserVideos");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/videos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exclude_flagged", excludeFlagged));
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

    GenericType<PageResourceVideoResource> localVarReturnType = new GenericType<PageResourceVideoResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Loads a specific video details
   * 
   * @param id The video id (required)
   * @return VideoResource
   * @throws ApiException if fails to make API call
   */
  public VideoResource getVideo(Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getVideo");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<VideoResource> localVarReturnType = new GenericType<VideoResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a page of comments for a video
   * 
   * @param videoId The video id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceCommentResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceCommentResource getVideoComments(Integer videoId, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling getVideoComments");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/comments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageResourceCommentResource> localVarReturnType = new GenericType<PageResourceCommentResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a page of dispositions for a video
   * 
   * @param videoId The video id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceDispositionResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceDispositionResource getVideoDispositions(Integer videoId, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling getVideoDispositions");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/dispositions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageResourceDispositionResource> localVarReturnType = new GenericType<PageResourceDispositionResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a page of video relationships
   * 
   * @param videoId The video id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceVideoRelationshipResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceVideoRelationshipResource getVideoRelationships(Long videoId, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling getVideoRelationships");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/related".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageResourceVideoRelationshipResource> localVarReturnType = new GenericType<PageResourceVideoRelationshipResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search videos using the documented filters
   * 
   * @param excludeFlagged Skip videos that have been flagged by the current user (optional, default to true)
   * @param filterVideosByUploader Filter for videos by uploader id (optional)
   * @param filterCategory Filter for videos from a specific category by id (optional)
   * @param filterTagset Filter for videos with specified tags (separated by comma) (optional)
   * @param filterVideosByName Filter for videos which name *STARTS* with the given string (optional)
   * @param filterVideosByContributor Filter for videos with contribution from the artist specified by ID (optional)
   * @param filterVideosByAuthor Filter for videos with an artist as author specified by ID (optional)
   * @param filterHasAuthor Filter for videos that have an author set if true, or that have no author if false (optional)
   * @param filterHasUploader Filter for videos that have an uploader set if true, or that have no uploader if false (optional)
   * @param filterRelatedTo Filter for videos that have designated a particular video as the TO of a relationship. Pattern should match VIDEO_ID or VIDEO_ID:DETAILS to match with a specific details string as well (optional)
   * @param filterFriends Filter for videos uploaded by friends. &#39;true&#39; for friends of the caller (requires user token) or a user id for a specific user&#39;s friends (requires VIDEOS_ADMIN permission) (optional)
   * @param filterDisposition Filter for videos a given user has a given disposition towards. USER_ID:DISPOSITION where USER_ID is the id of the user who has this disposition or &#39;me&#39; for the caller (requires user token for &#39;me&#39;) and DISPOSITION is the name of the disposition. E.G. filter_disposition&#x3D;123:like or filter_disposition&#x3D;me:favorite (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to author:ASC)
   * @return PageResourceVideoResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceVideoResource getVideos(Boolean excludeFlagged, Integer filterVideosByUploader, String filterCategory, String filterTagset, String filterVideosByName, Integer filterVideosByContributor, Integer filterVideosByAuthor, Boolean filterHasAuthor, Boolean filterHasUploader, String filterRelatedTo, Boolean filterFriends, String filterDisposition, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/media/videos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exclude_flagged", excludeFlagged));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_videos_by_uploader", filterVideosByUploader));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tagset", filterTagset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_videos_by_name", filterVideosByName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_videos_by_contributor", filterVideosByContributor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_videos_by_author", filterVideosByAuthor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_has_author", filterHasAuthor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_has_uploader", filterHasUploader));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_related_to", filterRelatedTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_friends", filterFriends));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_disposition", filterDisposition));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageResourceVideoResource> localVarReturnType = new GenericType<PageResourceVideoResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Removes a user from a video&#39;s whitelist
   * Remove the user with the id given in the path from the whitelist of users that can view this video regardless of privacy setting.
   * @param videoId The video id (required)
   * @param id The user id (required)
   * @throws ApiException if fails to make API call
   */
  public void removeUserFromVideoWhitelist(Long videoId, Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling removeUserFromVideoWhitelist");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeUserFromVideoWhitelist");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/whitelist/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Removes a contributor from a video
   * 
   * @param videoId The video id (required)
   * @param id The contributor id (required)
   * @throws ApiException if fails to make API call
   */
  public void removeVideoContributor(Long videoId, Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling removeVideoContributor");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeVideoContributor");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/contributors/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Modifies a video&#39;s details
   * 
   * @param id The video id (required)
   * @param videoResource The video object (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateVideo(Long id, VideoResource videoResource) throws ApiException {
    Object localVarPostBody = videoResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateVideo");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a video comment
   * 
   * @param videoId The video id (required)
   * @param id The comment id (required)
   * @param content The comment content (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateVideoComment(Long videoId, Long id, StringWrapper content) throws ApiException {
    Object localVarPostBody = content;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling updateVideoComment");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateVideoComment");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/comments/{id}/content".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a video&#39;s relationship details
   * 
   * @param videoId The video id (required)
   * @param relationshipId The relationship id (required)
   * @param details The video relationship details (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateVideoRelationship(Long videoId, Long relationshipId, StringWrapper details) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
      throw new ApiException(400, "Missing the required parameter 'videoId' when calling updateVideoRelationship");
    }
    
    // verify the required parameter 'relationshipId' is set
    if (relationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'relationshipId' when calling updateVideoRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{video_id}/related/{id}/relationship_details".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "video_id" + "\\}", apiClient.escapeString(videoId.toString()))
      .replaceAll("\\{" + "relationship_id" + "\\}", apiClient.escapeString(relationshipId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Increment a video&#39;s view count
   * 
   * @param id The video id (required)
   * @throws ApiException if fails to make API call
   */
  public void viewVideo(Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling viewVideo");
    }
    
    // create path and map variables
    String localVarPath = "/media/videos/{id}/views".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
