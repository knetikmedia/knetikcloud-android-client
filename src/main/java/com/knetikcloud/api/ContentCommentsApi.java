package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.CommentResource;
import com.knetikcloud.model.PageResourceCommentResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ContentCommentsApi {
  /**
   * Add a new comment
   * 
   * @param commentResource The comment to be added (optional)
   * @return Call&lt;CommentResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("comments")
  Call<CommentResource> addComment(
    @retrofit2.http.Body CommentResource commentResource
  );

  /**
   * Delete a comment
   * 
   * @param id The comment id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("comments/{id}")
  Call<Void> deleteComment(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Return a comment
   * 
   * @param id The comment id (required)
   * @return Call&lt;CommentResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("comments/{id}")
  Call<CommentResource> getComment(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Returns a page of comments
   * 
   * @param context Get comments by context type (required)
   * @param contextId Get comments by context id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceCommentResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("comments")
  Call<PageResourceCommentResource> getComments(
    @retrofit2.http.Query("context") String context, @retrofit2.http.Query("context_id") Integer contextId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Update a comment
   * 
   * @param id The comment id (required)
   * @param content The comment content (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("comments/{id}/content")
  Call<Void> updateComment(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body StringWrapper content
  );

}
