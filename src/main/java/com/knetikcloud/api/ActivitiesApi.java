package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ActivityOccurrenceCreationFailure;
import com.knetikcloud.model.ActivityOccurrenceResource;
import com.knetikcloud.model.ActivityOccurrenceResults;
import com.knetikcloud.model.ActivityOccurrenceResultsResource;
import com.knetikcloud.model.ActivityResource;
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
   * Create an activity
   * 
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
   * Has to enforce extra rules if not used as an admin
   * @param test if true, indicates that the occurrence should NOT be created. This can be used to test for eligibility and valid settings (optional, default to false)
   * @param activityOccurrenceResource The activity occurrence object (optional)
   * @return Call&lt;ActivityOccurrenceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("activity-occurrences")
  Call<ActivityOccurrenceResource> createActivityOccurrence(
    @retrofit2.http.Query("test") Boolean test, @retrofit2.http.Body ActivityOccurrenceResource activityOccurrenceResource
  );

  /**
   * Create a activity template
   * Activity Templates define a type of activity and the properties they have
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
   * 
   * @param id The id of the activity (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("activities/{id}")
  Call<Void> deleteActivity(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Delete a activity template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("activities/templates/{id}")
  Call<Void> deleteActivityTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * List activity definitions
   * 
   * @param filterTemplate Filter for activities that are templates, or specifically not if false (optional)
   * @param filterName Filter for activities that have a name starting with specified string (optional)
   * @param filterId Filter for activities with an id in the given comma separated list of ids (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceBareActivityResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("activities")
  Call<PageResourceBareActivityResource> getActivities(
    @retrofit2.http.Query("filter_template") Boolean filterTemplate, @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("filter_id") String filterId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single activity
   * 
   * @param id The id of the activity (required)
   * @return Call&lt;ActivityResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("activities/{id}")
  Call<ActivityResource> getActivity(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Get a single activity template
   * 
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("activities/templates/{id}")
  Call<TemplateResource> getActivityTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search activity templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("activities/templates")
  Call<PageResourceTemplateResource> getActivityTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Sets the status of an activity occurrence to FINISHED and logs metrics
   * 
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
   * Update an activity
   * 
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
   * Updated the status of an activity occurrence
   * If setting to &#39;FINISHED&#39; you must POST to /results instead to record the metrics and get synchronous reward results
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param activityCccurrenceStatus The activity occurrence status object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("activity-occurrences/{activity_occurrence_id}/status")
  Call<Void> updateActivityOccurrence(
    @retrofit2.http.Path("activity_occurrence_id") Long activityOccurrenceId, @retrofit2.http.Body String activityCccurrenceStatus
  );

  /**
   * Update an activity template
   * 
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
