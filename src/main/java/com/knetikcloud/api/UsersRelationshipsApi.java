package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceUserRelationshipResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserRelationshipResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UsersRelationshipsApi {
  /**
   * Create a user relationship
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; RELATIONSHIPS_ADMIN
   * @param relationship The new relationship (optional)
   * @return Call&lt;UserRelationshipResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/relationships")
  Call<UserRelationshipResource> createUserRelationship(
    @retrofit2.http.Body UserRelationshipResource relationship
  );

  /**
   * Delete a user relationship
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; RELATIONSHIPS_ADMIN
   * @param id The id of the relationship (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("users/relationships/{id}")
  Call<Void> deleteUserRelationship(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Get a user relationship
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; RELATIONSHIPS_USER or RELATIONSHIPS_ADMIN
   * @param id The id of the relationship (required)
   * @return Call&lt;UserRelationshipResource&gt;
   */
  @GET("users/relationships/{id}")
  Call<UserRelationshipResource> getUserRelationship(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Get a list of user relationships
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; RELATIONSHIPS_USER or RELATIONSHIPS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceUserRelationshipResource&gt;
   */
  @GET("users/relationships")
  Call<PageResourceUserRelationshipResource> getUserRelationships(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a user relationship
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; RELATIONSHIPS_ADMIN
   * @param id The id of the relationship (required)
   * @param relationship The new relationship (optional)
   * @return Call&lt;UserRelationshipResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/relationships/{id}")
  Call<UserRelationshipResource> updateUserRelationship(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body UserRelationshipResource relationship
  );

}
