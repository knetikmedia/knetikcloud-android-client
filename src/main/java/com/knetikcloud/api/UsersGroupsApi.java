package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.GroupMemberResource;
import com.knetikcloud.model.GroupResource;
import com.knetikcloud.model.PageResourceGroupMemberResource;
import com.knetikcloud.model.PageResourceGroupResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UsersGroupsApi {
  /**
   * Adds a new member to the group
   * 
   * @param uniqueName The group unique name (required)
   * @param user The id and status for a user to add to the group (required)
   * @return Call&lt;GroupMemberResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/groups/{unique_name}/members")
  Call<GroupMemberResource> addMemberToGroup(
    @retrofit2.http.Path("unique_name") String uniqueName, @retrofit2.http.Body GroupMemberResource user
  );

  /**
   * Adds multiple members to the group
   * 
   * @param uniqueName The group unique name (required)
   * @param users The id and status for a list of users to add to the group (required)
   * @return Call&lt;List&lt;GroupMemberResource&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/groups/{unique_name}/members/batch-add")
  Call<List<GroupMemberResource>> addMembersToGroup(
    @retrofit2.http.Path("unique_name") String uniqueName, @retrofit2.http.Body List<GroupMemberResource> users
  );

  /**
   * Create a group
   * 
   * @param groupResource The new group (optional)
   * @return Call&lt;GroupResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/groups")
  Call<GroupResource> createGroup(
    @retrofit2.http.Body GroupResource groupResource
  );

  /**
   * Create an group member template
   * GroupMember Templates define a type of group member and the properties they have
   * @param groupMemberTemplateResource The group member template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/groups/members/templates")
  Call<TemplateResource> createGroupMemberTemplate(
    @retrofit2.http.Body TemplateResource groupMemberTemplateResource
  );

  /**
   * Create a group template
   * Group Templates define a type of group and the properties they have
   * @param groupTemplateResource The group template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/groups/templates")
  Call<TemplateResource> createGroupTemplate(
    @retrofit2.http.Body TemplateResource groupTemplateResource
  );

  /**
   * Removes a group from the system
   * All groups listing this as the parent are also removed and users are in turn removed from this and those groups. This may result in users no longer being in this group&#39;s parent if they were not added to it directly as well.
   * @param uniqueName The group unique name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("users/groups/{unique_name}")
  Call<Void> deleteGroup(
    @retrofit2.http.Path("unique_name") String uniqueName
  );

  /**
   * Delete an group member template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("users/groups/members/templates/{id}")
  Call<Void> deleteGroupMemberTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Delete a group template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("users/groups/templates/{id}")
  Call<Void> deleteGroupTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Loads a specific group&#39;s details
   * 
   * @param uniqueName The group unique name (required)
   * @return Call&lt;GroupResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/groups/{unique_name}")
  Call<GroupResource> getGroup(
    @retrofit2.http.Path("unique_name") String uniqueName
  );

  /**
   * Get group ancestors
   * Returns a list of ancestor groups in reverse order (parent, then grandparent, etc
   * @param uniqueName The group unique name (required)
   * @return Call&lt;List&lt;GroupResource&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/groups/{unique_name}/ancestors")
  Call<List<GroupResource>> getGroupAncestors(
    @retrofit2.http.Path("unique_name") String uniqueName
  );

  /**
   * Get a user from a group
   * 
   * @param uniqueName The group unique name (required)
   * @param userId The id of the user (required)
   * @return Call&lt;GroupMemberResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/groups/{unique_name}/members/{user_id}")
  Call<GroupMemberResource> getGroupMember(
    @retrofit2.http.Path("unique_name") String uniqueName, @retrofit2.http.Path("user_id") Integer userId
  );

  /**
   * Get a single group member template
   * 
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/groups/members/templates/{id}")
  Call<TemplateResource> getGroupMemberTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search group member templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/groups/members/templates")
  Call<PageResourceTemplateResource> getGroupMemberTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Lists members of the group
   * 
   * @param uniqueName The group unique name (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to order:ASC)
   * @return Call&lt;PageResourceGroupMemberResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/groups/{unique_name}/members")
  Call<PageResourceGroupMemberResource> getGroupMembers(
    @retrofit2.http.Path("unique_name") String uniqueName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single group template
   * 
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/groups/templates/{id}")
  Call<TemplateResource> getGroupTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search group templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/groups/templates")
  Call<PageResourceTemplateResource> getGroupTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List groups a user is in
   * 
   * @param userId The id of the user (required)
   * @param filterChildren Whether to limit group list to children of groups only. If true, shows only groups with parents. If false, shows only groups with no parent. (optional)
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/groups")
  Call<List<String>> getGroupsForUser(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Query("filter_children") Boolean filterChildren
  );

  /**
   * List and search groups
   * 
   * @param filterTemplate Filter for groups using a specific template, by id (optional)
   * @param filterMemberCount Filters groups by member count. Multiple values possible for range search. Format: filter_member_count&#x3D;OP,ts&amp;... where OP in (GT, LT, GOE, LOE, EQ). Ex: filter_member_count&#x3D;GT,14,LT,17 (optional)
   * @param filterName Filter for groups with names starting with the given string (optional)
   * @param filterUniqueName Filter for groups whose unique_name starts with provided string (optional)
   * @param filterParent Filter for groups with a specific parent, by unique name (optional)
   * @param filterStatus Filter for groups with a certain status (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return Call&lt;PageResourceGroupResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/groups")
  Call<PageResourceGroupResource> listGroups(
    @retrofit2.http.Query("filter_template") String filterTemplate, @retrofit2.http.Query("filter_member_count") String filterMemberCount, @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("filter_unique_name") String filterUniqueName, @retrofit2.http.Query("filter_parent") String filterParent, @retrofit2.http.Query("filter_status") String filterStatus, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Removes a user from a group
   * 
   * @param uniqueName The group unique name (required)
   * @param userId The id of the user to remove (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("users/groups/{unique_name}/members/{user_id}")
  Call<Void> removeGroupMember(
    @retrofit2.http.Path("unique_name") String uniqueName, @retrofit2.http.Path("user_id") Integer userId
  );

  /**
   * Update a group
   * If adding/removing/changing parent, user membership in group/new parent groups may be modified. The parent being removed will remove members from this sub group unless they were added explicitly to the parent and the new parent will gain members unless they were already a part of it.
   * @param uniqueName The group unique name (required)
   * @param groupResource The updated group (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/groups/{unique_name}")
  Call<Void> updateGroup(
    @retrofit2.http.Path("unique_name") String uniqueName, @retrofit2.http.Body GroupResource groupResource
  );

  /**
   * Change a user&#39;s order
   * 
   * @param uniqueName The group unique name (required)
   * @param userId The user id of the member to modify (required)
   * @param order The new order for the membership (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/groups/{unique_name}/members/{user_id}/order")
  Call<Void> updateGroupMemberProperties(
    @retrofit2.http.Path("unique_name") String uniqueName, @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Body StringWrapper order
  );

  /**
   * Change a user&#39;s membership properties
   * 
   * @param uniqueName The group unique name (required)
   * @param userId The user id of the member to modify (required)
   * @param properties The new properties for the membership (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/groups/{unique_name}/members/{user_id}/properties")
  Call<Void> updateGroupMemberProperties1(
    @retrofit2.http.Path("unique_name") String uniqueName, @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Body Object properties
  );

  /**
   * Change a user&#39;s status
   * 
   * @param uniqueName The group unique name (required)
   * @param userId The user id of the member to modify (required)
   * @param status The new status for the user (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/groups/{unique_name}/members/{user_id}/status")
  Call<Void> updateGroupMemberStatus(
    @retrofit2.http.Path("unique_name") String uniqueName, @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Body String status
  );

  /**
   * Update an group member template
   * 
   * @param id The id of the template (required)
   * @param groupMemberTemplateResource The group member template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/groups/members/templates/{id}")
  Call<TemplateResource> updateGroupMemberTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource groupMemberTemplateResource
  );

  /**
   * Update a group template
   * 
   * @param id The id of the template (required)
   * @param groupTemplateResource The group template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/groups/templates/{id}")
  Call<TemplateResource> updateGroupTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource groupTemplateResource
  );

}
