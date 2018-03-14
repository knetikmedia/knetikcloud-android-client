package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ActivityOccurrenceCreationFailure;
import com.knetikcloud.model.ActivityOccurrenceJoinResult;
import com.knetikcloud.model.ActivityOccurrenceResource;
import com.knetikcloud.model.ActivityOccurrenceResults;
import com.knetikcloud.model.ActivityOccurrenceResultsResource;
import com.knetikcloud.model.ActivityOccurrenceSettingsResource;
import com.knetikcloud.model.ActivityOccurrenceStatusWrapper;
import com.knetikcloud.model.ActivityResource;
import com.knetikcloud.model.ActivityUserResource;
import com.knetikcloud.model.ActivityUserStatusWrapper;
import com.knetikcloud.model.CreateActivityOccurrenceRequest;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.PageResourceActivityOccurrenceResource;
import com.knetikcloud.model.PageResourceBareActivityResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ActivitiesApi {
  /**
   * Add a user to an occurrence
   * If called with no body, defaults to the user making the call.
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param test if true, indicates that the user should NOT be added. This can be used to test for eligibility (optional, default to false)
   * @param bypassRestrictions if true, indicates that restrictions such as max player count should be ignored. Can only be used with ACTIVITIES_ADMIN (optional, default to false)
   * @param userId The id of the user, or null for &#39;caller&#39; (optional)
   * @return Call&lt;ActivityOccurrenceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("activity-occurrences/{activity_occurrence_id}/users")
  Call<ActivityOccurrenceResource> addUser(
    @retrofit2.http.Path("activity_occurrence_id") Long activityOccurrenceId, @retrofit2.http.Query("test") Boolean test, @retrofit2.http.Query("bypass_restrictions") Boolean bypassRestrictions, @retrofit2.http.Body IntWrapper userId
  );

  /**
   * Create an activity
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_ADMIN
   * @param activityResource The activity resource object (optional)
   * @return Call&lt;ActivityResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("activities")
  Call<ActivityResource> createActivity(
    @retrofit2.http.Body ActivityResource activityResource
  );

  /**
   * Create a new activity occurrence. Ex: start a game
   * Has to enforce extra rules if not used as an admin. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
   * @param test if true, indicates that the occurrence should NOT be created. This can be used to test for eligibility and valid settings (optional, default to false)
   * @param activityOccurrenceResource The activity occurrence object (optional)
   * @return Call&lt;ActivityOccurrenceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("activity-occurrences")
  Call<ActivityOccurrenceResource> createActivityOccurrence(
    @retrofit2.http.Query("test") Boolean test, @retrofit2.http.Body CreateActivityOccurrenceRequest activityOccurrenceResource
  );

  /**
   * Create a activity template
   * Activity Templates define a type of activity and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param activityTemplateResource The activity template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("activities/templates")
  Call<TemplateResource> createActivityTemplate(
    @retrofit2.http.Body TemplateResource activityTemplateResource
  );

  /**
   * Delete an activity
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_ADMIN
   * @param id The id of the activity (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("activities/{id}")
  Call<Void> deleteActivity(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Delete a activity template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("activities/templates/{id}")
  Call<Void> deleteActivityTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * List activity definitions
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterTemplate Filter for activities that are templates, or specifically not if false (optional)
   * @param filterName Filter for activities that have a name starting with specified string (optional)
   * @param filterId Filter for activities with an id in the given comma separated list of ids (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceBareActivityResource&gt;
   */
  @GET("activities")
  Call<PageResourceBareActivityResource> getActivities(
    @retrofit2.http.Query("filter_template") Boolean filterTemplate, @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("filter_id") String filterId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single activity
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the activity (required)
   * @return Call&lt;ActivityResource&gt;
   */
  @GET("activities/{id}")
  Call<ActivityResource> getActivity(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Load a single activity occurrence details
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @return Call&lt;ActivityOccurrenceResource&gt;
   */
  @GET("activity-occurrences/{activity_occurrence_id}")
  Call<ActivityOccurrenceResource> getActivityOccurrenceDetails(
    @retrofit2.http.Path("activity_occurrence_id") Long activityOccurrenceId
  );

  /**
   * Get a single activity template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACTIVITIES_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("activities/templates/{id}")
  Call<TemplateResource> getActivityTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search activity templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACTIVITIES_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("activities/templates")
  Call<PageResourceTemplateResource> getActivityTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List activity occurrences
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
   * @param filterActivity Filter for occurrences of the given activity ID (optional)
   * @param filterStatus Filter for occurrences in the given status (optional)
   * @param filterEvent Filter for occurrences played during the given event (optional)
   * @param filterChallenge Filter for occurrences played within the given challenge (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceActivityOccurrenceResource&gt;
   */
  @GET("activity-occurrences")
  Call<PageResourceActivityOccurrenceResource> listActivityOccurrences(
    @retrofit2.http.Query("filter_activity") String filterActivity, @retrofit2.http.Query("filter_status") String filterStatus, @retrofit2.http.Query("filter_event") Integer filterEvent, @retrofit2.http.Query("filter_challenge") Integer filterChallenge, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Remove a user from an occurrence
   * 
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param userId The id of the user, or &#39;me&#39; (required)
   * @param ban if true, indicates that the user should not be allowed to re-join. Can only be set by host or admin (optional, default to false)
   * @param bypassRestrictions if true, indicates that restrictions such as current status should be ignored. Can only be used with ACTIVITIES_ADMIN (optional, default to false)
   * @return Call&lt;Void&gt;
   */
  @DELETE("activity-occurrences/{activity_occurrence_id}/users/{user_id}")
  Call<Void> removeUser(
    @retrofit2.http.Path("activity_occurrence_id") Long activityOccurrenceId, @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Query("ban") Boolean ban, @retrofit2.http.Query("bypass_restrictions") Boolean bypassRestrictions
  );

  /**
   * Sets the status of an activity occurrence to FINISHED and logs metrics
   * In addition to user permissions requirements there is security based on the core_settings.results_trust setting. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param activityOccurrenceResults The activity occurrence object (optional)
   * @return Call&lt;ActivityOccurrenceResults&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("activity-occurrences/{activity_occurrence_id}/results")
  Call<ActivityOccurrenceResults> setActivityOccurrenceResults(
    @retrofit2.http.Path("activity_occurrence_id") Long activityOccurrenceId, @retrofit2.http.Body ActivityOccurrenceResultsResource activityOccurrenceResults
  );

  /**
   * Sets the settings of an activity occurrence
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER and host or ACTIVITIES_ADMIN
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param settings The new settings (optional)
   * @return Call&lt;ActivityOccurrenceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("activity-occurrences/{activity_occurrence_id}/settings")
  Call<ActivityOccurrenceResource> setActivityOccurrenceSettings(
    @retrofit2.http.Path("activity_occurrence_id") Long activityOccurrenceId, @retrofit2.http.Body ActivityOccurrenceSettingsResource settings
  );

  /**
   * Set a user&#39;s status within an occurrence
   * 
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param userId The id of the user (required)
   * @param status The new status (optional)
   * @return Call&lt;ActivityUserResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("activity-occurrences/{activity_occurrence_id}/users/{user_id}/status")
  Call<ActivityUserResource> setUserStatus(
    @retrofit2.http.Path("activity_occurrence_id") Long activityOccurrenceId, @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body ActivityUserStatusWrapper status
  );

  /**
   * Update an activity
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_ADMIN
   * @param id The id of the activity (required)
   * @param activityResource The activity resource object (optional)
   * @return Call&lt;ActivityResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("activities/{id}")
  Call<ActivityResource> updateActivity(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body ActivityResource activityResource
  );

  /**
   * Update the status of an activity occurrence
   * If setting to &#39;FINISHED&#39; reward will be run based on current metrics that have been recorded already. Alternatively, see results endpoint to finish and record all metrics at once. Can be called by non-host participants if non_host_status_control is true. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER and host or ACTIVITIES_ADMIN
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param activityOccurrenceStatus The activity occurrence status object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("activity-occurrences/{activity_occurrence_id}/status")
  Call<Void> updateActivityOccurrenceStatus(
    @retrofit2.http.Path("activity_occurrence_id") Long activityOccurrenceId, @retrofit2.http.Body ActivityOccurrenceStatusWrapper activityOccurrenceStatus
  );

  /**
   * Update an activity template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param activityTemplateResource The activity template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("activities/templates/{id}")
  Call<TemplateResource> updateActivityTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource activityTemplateResource
  );

}
