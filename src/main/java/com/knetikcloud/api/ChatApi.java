package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ChatBlacklistResource;
import com.knetikcloud.model.ChatMessageResource;
import com.knetikcloud.model.PageResourceChatMessageResource;
import com.knetikcloud.model.PageResourceChatUserThreadResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ChatApi {
  /**
   * Acknowledge number of messages in a thread
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; owner
   * @param id The thread id (required)
   * @param readCount The amount of messages read (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("chat/threads/{id}/acknowledge")
  Call<Void> acknowledgeChatMessage(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Integer readCount
  );

  /**
   * Add a user to a chat message blacklist
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
   * @param blacklistedUserId The user id to blacklist (required)
   * @param id The user id or &#39;me&#39; (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("chat/users/{id}/blacklist/{blacklisted_user_id}")
  Call<Void> addChatMessageBlacklist(
    @retrofit2.http.Path("blacklisted_user_id") Integer blacklistedUserId, @retrofit2.http.Path("id") String id
  );

  /**
   * Delete a message
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
   * @param id The message id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("chat/messages/{id}")
  Call<Void> deleteChatMessage(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Edit your message
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; owner
   * @param id The message id (required)
   * @param chatMessageResource The chat message resource (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("chat/messages/{id}")
  Call<Void> editChatMessage(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body ChatMessageResource chatMessageResource
  );

  /**
   * Get a message
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
   * @param id The message id (required)
   * @return Call&lt;ChatMessageResource&gt;
   */
  @GET("chat/messages/{id}")
  Call<ChatMessageResource> getChatMessage(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a list of blocked users for chat messaging
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
   * @param id The user id or &#39;me&#39; (required)
   * @return Call&lt;List&lt;ChatBlacklistResource&gt;&gt;
   */
  @GET("chat/users/{id}/blacklist")
  Call<List<ChatBlacklistResource>> getChatMessageBlacklist(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List your threads
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; owner
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceChatUserThreadResource&gt;
   */
  @GET("chat/threads")
  Call<PageResourceChatUserThreadResource> getChatThreads(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List messages with a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; owner
   * @param id The user id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceChatMessageResource&gt;
   */
  @GET("chat/users/{id}/messages")
  Call<PageResourceChatMessageResource> getDirectMessages(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List messages in a thread
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
   * @param id The thread id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceChatMessageResource&gt;
   */
  @GET("chat/threads/{id}/messages")
  Call<PageResourceChatMessageResource> getThreadMessages(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List messages in a topic
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
   * @param id The topic id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceChatMessageResource&gt;
   */
  @GET("chat/topics/{id}/messages")
  Call<PageResourceChatMessageResource> getTopicMessages(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Remove a user from a blacklist
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
   * @param blacklistedUserId The user id to blacklist (required)
   * @param id The user id or &#39;me&#39; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("chat/users/{id}/blacklist/{blacklisted_user_id}")
  Call<Void> removeChatBlacklist(
    @retrofit2.http.Path("blacklisted_user_id") Integer blacklistedUserId, @retrofit2.http.Path("id") String id
  );

  /**
   * Send a message
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param chatMessageResource The chat message resource (optional)
   * @return Call&lt;ChatMessageResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("chat/messages")
  Call<ChatMessageResource> sendChatMessage(
    @retrofit2.http.Body ChatMessageResource chatMessageResource
  );

}
