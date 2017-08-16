package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.CommentResource;
import com.knetikcloud.model.CommentSearch;
import com.knetikcloud.model.PageResourceCommentResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContentCommentsApi
 */
public class ContentCommentsApiTest {

    private ContentCommentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ContentCommentsApi.class);
    }

    /**
     * Add a new comment
     *
     * 
     */
    @Test
    public void addCommentTest() {
        CommentResource commentResource = null;
        // CommentResource response = api.addComment(commentResource);

        // TODO: test validations
    }
    /**
     * Delete a comment
     *
     * 
     */
    @Test
    public void deleteCommentTest() {
        Long id = null;
        // Void response = api.deleteComment(id);

        // TODO: test validations
    }
    /**
     * Return a comment
     *
     * 
     */
    @Test
    public void getCommentTest() {
        Long id = null;
        // CommentResource response = api.getComment(id);

        // TODO: test validations
    }
    /**
     * Returns a page of comments
     *
     * 
     */
    @Test
    public void getCommentsTest() {
        String context = null;
        Integer contextId = null;
        Integer size = null;
        Integer page = null;
        // PageResourceCommentResource response = api.getComments(context, contextId, size, page);

        // TODO: test validations
    }
    /**
     * Search the comment index
     *
     * The body is an ElasticSearch query json. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options
     */
    @Test
    public void searchCommentsTest() {
        Object query = null;
        Integer size = null;
        Integer page = null;
        // CommentSearch response = api.searchComments(query, size, page);

        // TODO: test validations
    }
    /**
     * Update a comment
     *
     * 
     */
    @Test
    public void updateCommentTest() {
        Long id = null;
        StringWrapper content = null;
        // Void response = api.updateComment(id, content);

        // TODO: test validations
    }
}
