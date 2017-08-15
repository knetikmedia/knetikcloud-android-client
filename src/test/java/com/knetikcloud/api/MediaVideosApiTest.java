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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediaVideosApi
 */
public class MediaVideosApiTest {

    private MediaVideosApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MediaVideosApi.class);
    }

    /**
     * Adds a user to a video&#39;s whitelist
     *
     * Whitelisted users can view video regardless of privacy setting.
     */
    @Test
    public void addUserToVideoWhitelistTest() {
        Long id = null;
        IntWrapper userId = null;
        // Void response = api.addUserToVideoWhitelist(id, userId);

        // TODO: test validations
    }
    /**
     * Adds a new video in the system
     *
     * 
     */
    @Test
    public void addVideoTest() {
        VideoResource videoResource = null;
        // VideoResource response = api.addVideo(videoResource);

        // TODO: test validations
    }
    /**
     * Add a new video comment
     *
     * 
     */
    @Test
    public void addVideoCommentTest() {
        Integer videoId = null;
        CommentResource commentResource = null;
        // CommentResource response = api.addVideoComment(videoId, commentResource);

        // TODO: test validations
    }
    /**
     * Adds a contributor to a video
     *
     * 
     */
    @Test
    public void addVideoContributorTest() {
        Long videoId = null;
        ContributionResource contributionResource = null;
        // Void response = api.addVideoContributor(videoId, contributionResource);

        // TODO: test validations
    }
    /**
     * Add a new flag
     *
     * 
     */
    @Test
    public void addVideoFlagTest() {
        Long videoId = null;
        StringWrapper reason = null;
        // FlagResource response = api.addVideoFlag(videoId, reason);

        // TODO: test validations
    }
    /**
     * Adds one or more existing videos as related to this one
     *
     * 
     */
    @Test
    public void addVideoRelationshipsTest() {
        Long videoId = null;
        VideoRelationshipResource videoRelationshipResource = null;
        // VideoRelationshipResource response = api.addVideoRelationships(videoId, videoRelationshipResource);

        // TODO: test validations
    }
    /**
     * Create a video disposition
     *
     * 
     */
    @Test
    public void createVideoDispositionTest() {
        Integer videoId = null;
        DispositionResource dispositionResource = null;
        // DispositionResource response = api.createVideoDisposition(videoId, dispositionResource);

        // TODO: test validations
    }
    /**
     * Deletes a video from the system if no resources are attached to it
     *
     * 
     */
    @Test
    public void deleteVideoTest() {
        Long id = null;
        // Void response = api.deleteVideo(id);

        // TODO: test validations
    }
    /**
     * Delete a video comment
     *
     * 
     */
    @Test
    public void deleteVideoCommentTest() {
        Long videoId = null;
        Long id = null;
        // Void response = api.deleteVideoComment(videoId, id);

        // TODO: test validations
    }
    /**
     * Delete a video disposition
     *
     * 
     */
    @Test
    public void deleteVideoDispositionTest() {
        Long dispositionId = null;
        // Void response = api.deleteVideoDisposition(dispositionId);

        // TODO: test validations
    }
    /**
     * Delete a flag
     *
     * 
     */
    @Test
    public void deleteVideoFlagTest() {
        Long videoId = null;
        // Void response = api.deleteVideoFlag(videoId);

        // TODO: test validations
    }
    /**
     * Delete a video&#39;s relationship
     *
     * 
     */
    @Test
    public void deleteVideoRelationshipTest() {
        Long videoId = null;
        Long id = null;
        // Void response = api.deleteVideoRelationship(videoId, id);

        // TODO: test validations
    }
    /**
     * Get user videos
     *
     * 
     */
    @Test
    public void getUserVideosTest() {
        Integer userId = null;
        Boolean excludeFlagged = null;
        Integer size = null;
        Integer page = null;
        // PageResourceVideoResource response = api.getUserVideos(userId, excludeFlagged, size, page);

        // TODO: test validations
    }
    /**
     * Loads a specific video details
     *
     * 
     */
    @Test
    public void getVideoTest() {
        Long id = null;
        // VideoResource response = api.getVideo(id);

        // TODO: test validations
    }
    /**
     * Returns a page of comments for a video
     *
     * 
     */
    @Test
    public void getVideoCommentsTest() {
        Integer videoId = null;
        Integer size = null;
        Integer page = null;
        // PageResourceCommentResource response = api.getVideoComments(videoId, size, page);

        // TODO: test validations
    }
    /**
     * Returns a page of dispositions for a video
     *
     * 
     */
    @Test
    public void getVideoDispositionsTest() {
        Integer videoId = null;
        Integer size = null;
        Integer page = null;
        // PageResourceDispositionResource response = api.getVideoDispositions(videoId, size, page);

        // TODO: test validations
    }
    /**
     * Returns a page of video relationships
     *
     * 
     */
    @Test
    public void getVideoRelationshipsTest() {
        Long videoId = null;
        Integer size = null;
        Integer page = null;
        // PageResourceVideoRelationshipResource response = api.getVideoRelationships(videoId, size, page);

        // TODO: test validations
    }
    /**
     * Search videos using the documented filters
     *
     * 
     */
    @Test
    public void getVideosTest() {
        Boolean excludeFlagged = null;
        Integer filterVideosByUploader = null;
        String filterCategory = null;
        String filterTagset = null;
        String filterVideosByName = null;
        Integer filterVideosByContributor = null;
        Integer filterVideosByAuthor = null;
        Boolean filterHasAuthor = null;
        Boolean filterHasUploader = null;
        String filterRelatedTo = null;
        Boolean filterFriends = null;
        String filterDisposition = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceVideoResource response = api.getVideos(excludeFlagged, filterVideosByUploader, filterCategory, filterTagset, filterVideosByName, filterVideosByContributor, filterVideosByAuthor, filterHasAuthor, filterHasUploader, filterRelatedTo, filterFriends, filterDisposition, size, page, order);

        // TODO: test validations
    }
    /**
     * Removes a user from a video&#39;s whitelist
     *
     * Remove the user with the id given in the path from the whitelist of users that can view this video regardless of privacy setting.
     */
    @Test
    public void removeUserFromVideoWhitelistTest() {
        Long videoId = null;
        Integer id = null;
        // Void response = api.removeUserFromVideoWhitelist(videoId, id);

        // TODO: test validations
    }
    /**
     * Removes a contributor from a video
     *
     * 
     */
    @Test
    public void removeVideoContributorTest() {
        Long videoId = null;
        Integer id = null;
        // Void response = api.removeVideoContributor(videoId, id);

        // TODO: test validations
    }
    /**
     * Modifies a video&#39;s details
     *
     * 
     */
    @Test
    public void updateVideoTest() {
        Long id = null;
        VideoResource videoResource = null;
        // Void response = api.updateVideo(id, videoResource);

        // TODO: test validations
    }
    /**
     * Update a video comment
     *
     * 
     */
    @Test
    public void updateVideoCommentTest() {
        Long videoId = null;
        Long id = null;
        StringWrapper content = null;
        // Void response = api.updateVideoComment(videoId, id, content);

        // TODO: test validations
    }
    /**
     * Update a video&#39;s relationship details
     *
     * 
     */
    @Test
    public void updateVideoRelationshipTest() {
        Long videoId = null;
        Long relationshipId = null;
        StringWrapper details = null;
        // Void response = api.updateVideoRelationship(videoId, relationshipId, details);

        // TODO: test validations
    }
    /**
     * Increment a video&#39;s view count
     *
     * 
     */
    @Test
    public void viewVideoTest() {
        Long id = null;
        // Void response = api.viewVideo(id);

        // TODO: test validations
    }
}
