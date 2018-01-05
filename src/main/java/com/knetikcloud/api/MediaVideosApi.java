package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.CommentResource;
import com.knetikcloud.model.ContributionResource;
import com.knetikcloud.model.DispositionResource;
import com.knetikcloud.model.FlagResource;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.PageResourceCommentResource;
import com.knetikcloud.model.PageResourceDispositionResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceVideoRelationshipResource;
import com.knetikcloud.model.PageResourceVideoResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.VideoRelationshipResource;
import com.knetikcloud.model.VideoResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MediaVideosApi {
  /**
   * Adds a user to a video&#39;s whitelist
   * Whitelisted users can view video regardless of privacy setting.
   * @param id The video id (required)
   * @param userId The user id (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/videos/{id}/whitelist")
  Call<Void> addUserToVideoWhitelist(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body IntWrapper userId
  );

  /**
   * Adds a new video in the system
   * 
   * @param videoResource The video object (optional)
   * @return Call&lt;VideoResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/videos")
  Call<VideoResource> addVideo(
    @retrofit2.http.Body VideoResource videoResource
  );

  /**
   * Add a new video comment
   * 
   * @param videoId The video id  (required)
   * @param commentResource The comment object (optional)
   * @return Call&lt;CommentResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/videos/{video_id}/comments")
  Call<CommentResource> addVideoComment(
    @retrofit2.http.Path("video_id") Integer videoId, @retrofit2.http.Body CommentResource commentResource
  );

  /**
   * Adds a contributor to a video
   * 
   * @param videoId The video id (required)
   * @param contributionResource The contribution object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/videos/{video_id}/contributors")
  Call<Void> addVideoContributor(
    @retrofit2.http.Path("video_id") Long videoId, @retrofit2.http.Body ContributionResource contributionResource
  );

  /**
   * Add a new flag
   * 
   * @param videoId The video id (required)
   * @param reason The flag reason (optional)
   * @return Call&lt;FlagResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/videos/{video_id}/moderation")
  Call<FlagResource> addVideoFlag(
    @retrofit2.http.Path("video_id") Long videoId, @retrofit2.http.Body StringWrapper reason
  );

  /**
   * Adds one or more existing videos as related to this one
   * 
   * @param videoId The video id (required)
   * @param videoRelationshipResource The video relationship object  (optional)
   * @return Call&lt;VideoRelationshipResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/videos/{video_id}/related")
  Call<VideoRelationshipResource> addVideoRelationships(
    @retrofit2.http.Path("video_id") Long videoId, @retrofit2.http.Body VideoRelationshipResource videoRelationshipResource
  );

  /**
   * Create a video disposition
   * 
   * @param videoId The video id (required)
   * @param dispositionResource The disposition object (optional)
   * @return Call&lt;DispositionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/videos/{video_id}/dispositions")
  Call<DispositionResource> createVideoDisposition(
    @retrofit2.http.Path("video_id") Integer videoId, @retrofit2.http.Body DispositionResource dispositionResource
  );

  /**
   * Create a video template
   * Video Templates define a type of video and the properties they have
   * @param videoTemplateResource The video template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/videos/templates")
  Call<TemplateResource> createVideoTemplate(
    @retrofit2.http.Body TemplateResource videoTemplateResource
  );

  /**
   * Deletes a video from the system if no resources are attached to it
   * 
   * @param id The video id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("media/videos/{id}")
  Call<Void> deleteVideo(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Delete a video comment
   * 
   * @param videoId The video id (required)
   * @param id The comment id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("media/videos/{video_id}/comments/{id}")
  Call<Void> deleteVideoComment(
    @retrofit2.http.Path("video_id") Long videoId, @retrofit2.http.Path("id") Long id
  );

  /**
   * Delete a video disposition
   * 
   * @param dispositionId The disposition id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("media/videos/{video_id}/dispositions/{disposition_id}")
  Call<Void> deleteVideoDisposition(
    @retrofit2.http.Path("disposition_id") Long dispositionId
  );

  /**
   * Delete a flag
   * 
   * @param videoId The video id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("media/videos/{video_id}/moderation")
  Call<Void> deleteVideoFlag(
    @retrofit2.http.Path("video_id") Long videoId
  );

  /**
   * Delete a video&#39;s relationship
   * 
   * @param videoId The video id (required)
   * @param id The relationship id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("media/videos/{video_id}/related/{id}")
  Call<Void> deleteVideoRelationship(
    @retrofit2.http.Path("video_id") Long videoId, @retrofit2.http.Path("id") Long id
  );

  /**
   * Delete a video template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("media/videos/templates/{id}")
  Call<Void> deleteVideoTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get user videos
   * 
   * @param userId The user id (required)
   * @param excludeFlagged Skip videos that have been flagged by the current user (optional, default to true)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceVideoResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/videos")
  Call<PageResourceVideoResource> getUserVideos(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Query("exclude_flagged") Boolean excludeFlagged, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Loads a specific video details
   * 
   * @param id The video id (required)
   * @return Call&lt;VideoResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("media/videos/{id}")
  Call<VideoResource> getVideo(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Returns a page of comments for a video
   * 
   * @param videoId The video id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceCommentResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("media/videos/{video_id}/comments")
  Call<PageResourceCommentResource> getVideoComments(
    @retrofit2.http.Path("video_id") Integer videoId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Returns a page of dispositions for a video
   * 
   * @param videoId The video id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceDispositionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("media/videos/{video_id}/dispositions")
  Call<PageResourceDispositionResource> getVideoDispositions(
    @retrofit2.http.Path("video_id") Integer videoId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Returns a page of video relationships
   * 
   * @param videoId The video id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceVideoRelationshipResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("media/videos/{video_id}/related")
  Call<PageResourceVideoRelationshipResource> getVideoRelationships(
    @retrofit2.http.Path("video_id") Long videoId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Get a single video template
   * 
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("media/videos/templates/{id}")
  Call<TemplateResource> getVideoTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search video templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("media/videos/templates")
  Call<PageResourceTemplateResource> getVideoTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

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
   * @return Call&lt;PageResourceVideoResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("media/videos")
  Call<PageResourceVideoResource> getVideos(
    @retrofit2.http.Query("exclude_flagged") Boolean excludeFlagged, @retrofit2.http.Query("filter_videos_by_uploader") Integer filterVideosByUploader, @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_tagset") String filterTagset, @retrofit2.http.Query("filter_videos_by_name") String filterVideosByName, @retrofit2.http.Query("filter_videos_by_contributor") Integer filterVideosByContributor, @retrofit2.http.Query("filter_videos_by_author") Integer filterVideosByAuthor, @retrofit2.http.Query("filter_has_author") Boolean filterHasAuthor, @retrofit2.http.Query("filter_has_uploader") Boolean filterHasUploader, @retrofit2.http.Query("filter_related_to") String filterRelatedTo, @retrofit2.http.Query("filter_friends") Boolean filterFriends, @retrofit2.http.Query("filter_disposition") String filterDisposition, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Removes a user from a video&#39;s whitelist
   * Remove the user with the id given in the path from the whitelist of users that can view this video regardless of privacy setting.
   * @param videoId The video id (required)
   * @param id The user id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("media/videos/{video_id}/whitelist/{id}")
  Call<Void> removeUserFromVideoWhitelist(
    @retrofit2.http.Path("video_id") Long videoId, @retrofit2.http.Path("id") Integer id
  );

  /**
   * Removes a contributor from a video
   * 
   * @param videoId The video id (required)
   * @param id The contributor id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("media/videos/{video_id}/contributors/{id}")
  Call<Void> removeVideoContributor(
    @retrofit2.http.Path("video_id") Long videoId, @retrofit2.http.Path("id") Integer id
  );

  /**
   * Modifies a video&#39;s details
   * 
   * @param id The video id (required)
   * @param videoResource The video object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("media/videos/{id}")
  Call<Void> updateVideo(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body VideoResource videoResource
  );

  /**
   * Update a video comment
   * 
   * @param videoId The video id (required)
   * @param id The comment id (required)
   * @param content The comment content (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("media/videos/{video_id}/comments/{id}/content")
  Call<Void> updateVideoComment(
    @retrofit2.http.Path("video_id") Long videoId, @retrofit2.http.Path("id") Long id, @retrofit2.http.Body StringWrapper content
  );

  /**
   * Update a video&#39;s relationship details
   * 
   * @param videoId The video id (required)
   * @param relationshipId The relationship id (required)
   * @param details The video relationship details (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("media/videos/{video_id}/related/{id}/relationship_details")
  Call<Void> updateVideoRelationship(
    @retrofit2.http.Path("video_id") Long videoId, @retrofit2.http.Path("relationship_id") Long relationshipId, @retrofit2.http.Body StringWrapper details
  );

  /**
   * Update a video template
   * 
   * @param id The id of the template (required)
   * @param videoTemplateResource The video template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("media/videos/templates/{id}")
  Call<TemplateResource> updateVideoTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource videoTemplateResource
  );

  /**
   * Increment a video&#39;s view count
   * 
   * @param id The video id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/videos/{id}/views")
  Call<Void> viewVideo(
    @retrofit2.http.Path("id") Long id
  );

}
