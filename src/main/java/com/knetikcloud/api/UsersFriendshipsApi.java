package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceSimpleUserResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UsersFriendshipsApi {
  /**
   * Add a friend
   * As a user, either creates or confirm a pending request. As an admin, call this endpoint twice while inverting the IDs to create a confirmed friendship. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
   * @param userId The id of the user or &#39;me&#39; if logged in (required)
   * @param id The id of the user to befriend (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/friends/{id}")
  Call<Void> addFriend(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get friends list
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
   * @param userId The id of the user or &#39;me&#39; (required)
   * @param filterUsername Filter for friends with the given username (optional)
   * @param filterUserId Filter for friends by user id (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceSimpleUserResource&gt;
   */
  @GET("users/{user_id}/friends")
  Call<PageResourceSimpleUserResource> getFriends(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Query("filter_username") String filterUsername, @retrofit2.http.Query("filter_user_id") Integer filterUserId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Returns the invite token
   * This is a unique invite token that allows direct connection to the request user.  Exposing that token presents privacy issues if the token is leaked. Use friend request flow instead if confirmation is required. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
   * @param userId The id of the user or &#39;me&#39; if logged in (required)
   * @return Call&lt;String&gt;
   */
  @GET("users/{user_id}/invite-token")
  Call<String> getInviteToken(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Get pending invites
   * Invites that the specified user received. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
   * @param userId The id of the user or &#39;me&#39; (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceSimpleUserResource&gt;
   */
  @GET("users/{user_id}/invites")
  Call<PageResourceSimpleUserResource> getInvites(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Redeem friendship token
   * Immediately connects the requested user with the user mapped by the provided invite token. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
   * @param userId The id of the user or &#39;me&#39; if logged in (required)
   * @param token The invite token (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/friends/tokens")
  Call<Void> redeemFriendshipToken(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body StringWrapper token
  );

  /**
   * Remove or decline a friend
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
   * @param userId The id of the user or &#39;me&#39; if logged in (required)
   * @param id The id of the user to befriend (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("users/{user_id}/friends/{id}")
  Call<Void> removeOrDeclineFriend(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("id") Integer id
  );

}
