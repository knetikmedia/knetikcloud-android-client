package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ChatMessageRequest;
import com.knetikcloud.model.ChatMessageResource;
import com.knetikcloud.model.NewPasswordRequest;
import com.knetikcloud.model.PageResourceChatMessageResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceUserBaseResource;
import com.knetikcloud.model.PasswordResetRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.UserResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UsersApi {
  /**
   * Add a tag to a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN
   * @param userId The id of the user (required)
   * @param tag tag (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/tags")
  Call<Void> addUserTag(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Body StringWrapper tag
  );

  /**
   * Create a user template
   * User Templates define a type of user and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param userTemplateResource The user template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/templates")
  Call<TemplateResource> createUserTemplate(
    @retrofit2.http.Body TemplateResource userTemplateResource
  );

  /**
   * Delete a user template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("users/templates/{id}")
  Call<Void> deleteUserTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a list of direct messages with this user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param recipientId The user id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceChatMessageResource&gt;
   */
  @GET("users/{recipient_id}/messages")
  Call<PageResourceChatMessageResource> getDirectMessages1(
    @retrofit2.http.Path("recipient_id") Integer recipientId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Get a single user
   * Additional private info is included as USERS_ADMIN. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the user or &#39;me&#39; (required)
   * @return Call&lt;UserResource&gt;
   */
  @GET("users/{id}")
  Call<UserResource> getUser(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List tags for a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN
   * @param userId The id of the user (required)
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("users/{user_id}/tags")
  Call<List<String>> getUserTags(
    @retrofit2.http.Path("user_id") Integer userId
  );

  /**
   * Get a single user template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or USERS_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("users/templates/{id}")
  Call<TemplateResource> getUserTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search user templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or USERS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("users/templates")
  Call<PageResourceTemplateResource> getUserTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List and search users
   * Additional private info is included as USERS_ADMIN. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterDisplayname Filter for users whose display name starts with provided string. (optional)
   * @param filterEmail Filter for users whose email starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterFirstname Filter for users whose first name starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterFullname Filter for users whose full name starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterLastname Filter for users whose last name starts with provided string. Requires USERS_ADMIN permission (optional)
   * @param filterUsername Filter for users whose username starts with the provided string. Requires USERS_ADMIN permission (optional)
   * @param filterTag Filter for users who have a given tag (optional)
   * @param filterGroup Filter for users in a given group, by unique name (optional)
   * @param filterRole Filter for users with a given role (optional)
   * @param filterLastActivity A comma separated string without spaces.  First value is the operator to search on, second value is the date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterIdList A comma separated list of ids. (optional)
   * @param filterSearch Filter for users whose display_name starts with the provided string, or username if display_name is null (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceUserBaseResource&gt;
   */
  @GET("users")
  Call<PageResourceUserBaseResource> getUsers(
    @retrofit2.http.Query("filter_displayname") String filterDisplayname, @retrofit2.http.Query("filter_email") String filterEmail, @retrofit2.http.Query("filter_firstname") String filterFirstname, @retrofit2.http.Query("filter_fullname") String filterFullname, @retrofit2.http.Query("filter_lastname") String filterLastname, @retrofit2.http.Query("filter_username") String filterUsername, @retrofit2.http.Query("filter_tag") String filterTag, @retrofit2.http.Query("filter_group") String filterGroup, @retrofit2.http.Query("filter_role") String filterRole, @retrofit2.http.Query("filter_last_activity") String filterLastActivity, @retrofit2.http.Query("filter_id_list") String filterIdList, @retrofit2.http.Query("filter_search") String filterSearch, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Choose a new password after a reset
   * Finish resetting a user&#39;s password using the secret provided from the password-reset endpoint.  Password should be in plain text and will be encrypted on receipt. Use SSL for security. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the user (required)
   * @param newPasswordRequest The new password request object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{id}/password-reset")
  Call<Void> passwordReset(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body NewPasswordRequest newPasswordRequest
  );

  /**
   * Send a user message
   * 
   * @param recipientId The user id (required)
   * @param chatMessageRequest The chat message request (optional)
   * @return Call&lt;ChatMessageResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{recipient_id}/messages")
  Call<ChatMessageResource> postUserMessage(
    @retrofit2.http.Path("recipient_id") Integer recipientId, @retrofit2.http.Body ChatMessageRequest chatMessageRequest
  );

  /**
   * Register a new user
   * Password should be in plain text and will be encrypted on receipt. Use SSL for security. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param userResource The user resource object (optional)
   * @return Call&lt;UserResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users")
  Call<UserResource> registerUser(
    @retrofit2.http.Body UserResource userResource
  );

  /**
   * Remove a tag from a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN
   * @param userId The id of the user (required)
   * @param tag The tag to remove (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("users/{user_id}/tags/{tag}")
  Call<Void> removeUserTag(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("tag") String tag
  );

  /**
   * Set a user&#39;s password
   * Password should be in plain text and will be encrypted on receipt. Use SSL for security. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or (USERS_USER and owner)
   * @param id The id of the user (required)
   * @param password The new plain text password (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{id}/password")
  Call<Void> setPassword(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body StringWrapper password
  );

  /**
   * Reset a user&#39;s password
   * A reset code will be generated and a &#39;forgot_password&#39; BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the user (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{id}/password-reset")
  Call<Void> startPasswordReset(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Reset a user&#39;s password without user id
   * A reset code will be generated and a &#39;forgot_password&#39; BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit.  Must submit their email, username, or mobile phone number. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param passwordReset An object containing one of three methods to look up a user (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/password-reset")
  Call<Void> submitPasswordReset(
    @retrofit2.http.Body PasswordResetRequest passwordReset
  );

  /**
   * Update a user
   * Password will not be edited on this endpoint, use password specific endpoints. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or owner
   * @param id The id of the user or &#39;me&#39; (required)
   * @param userResource The user resource object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{id}")
  Call<Void> updateUser(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body UserResource userResource
  );

  /**
   * Update a user template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param userTemplateResource The user template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/templates/{id}")
  Call<TemplateResource> updateUserTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource userTemplateResource
  );

}
