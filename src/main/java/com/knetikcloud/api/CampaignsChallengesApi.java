package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ChallengeActivityResource;
import com.knetikcloud.model.ChallengeEventResource;
import com.knetikcloud.model.ChallengeResource;
import com.knetikcloud.model.PageResourceBareChallengeActivityResource;
import com.knetikcloud.model.PageResourceChallengeEventResource;
import com.knetikcloud.model.PageResourceChallengeResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CampaignsChallengesApi {
  /**
   * Create a challenge
   * Challenges do not run on their own.  They must be added to a campaign before events will spawn. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
   * @param challengeResource The challenge resource object (optional)
   * @return Call&lt;ChallengeResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("challenges")
  Call<ChallengeResource> createChallenge(
    @retrofit2.http.Body ChallengeResource challengeResource
  );

  /**
   * Create a challenge activity
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
   * @param challengeId The challenge id (required)
   * @param challengeActivityResource The challenge activity resource object (optional)
   * @param validateSettings Whether to validate the settings being sent against the available settings on the base activity. (optional, default to false)
   * @return Call&lt;ChallengeActivityResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("challenges/{challenge_id}/activities")
  Call<ChallengeActivityResource> createChallengeActivity(
    @retrofit2.http.Path("challenge_id") Long challengeId, @retrofit2.http.Body ChallengeActivityResource challengeActivityResource, @retrofit2.http.Query("validate_settings") Boolean validateSettings
  );

  /**
   * Create a challenge activity template
   * Challenge Activity Templates define a type of challenge activity and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param challengeActivityTemplateResource The challengeActivity template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("challenge-activities/templates")
  Call<TemplateResource> createChallengeActivityTemplate(
    @retrofit2.http.Body TemplateResource challengeActivityTemplateResource
  );

  /**
   * Create a challenge template
   * Challenge Templates define a type of challenge and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param challengeTemplateResource The challenge template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("challenges/templates")
  Call<TemplateResource> createChallengeTemplate(
    @retrofit2.http.Body TemplateResource challengeTemplateResource
  );

  /**
   * Delete a challenge
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
   * @param id The challenge id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("challenges/{id}")
  Call<Void> deleteChallenge(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Delete a challenge activity
   * A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
   * @param id The challenge_activity id (required)
   * @param challengeId The challenge id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("challenges/{challenge_id}/activities/{id}")
  Call<Void> deleteChallengeActivity(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Path("challenge_id") Long challengeId
  );

  /**
   * Delete a challenge activity template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("challenge-activities/templates/{id}")
  Call<Void> deleteChallengeActivityTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Delete a challenge event
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
   * @param id The challenge event id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("challenges/events/{id}")
  Call<Void> deleteChallengeEvent(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Delete a challenge template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("challenges/templates/{id}")
  Call<Void> deleteChallengeTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Retrieve a challenge
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The challenge id (required)
   * @return Call&lt;ChallengeResource&gt;
   */
  @GET("challenges/{id}")
  Call<ChallengeResource> getChallenge(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * List and search challenge activities
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param challengeId The challenge id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceBareChallengeActivityResource&gt;
   */
  @GET("challenges/{challenge_id}/activities")
  Call<PageResourceBareChallengeActivityResource> getChallengeActivities(
    @retrofit2.http.Path("challenge_id") Long challengeId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single challenge activity
   * A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The challenge_activity id (required)
   * @param challengeId The challenge id (required)
   * @return Call&lt;ChallengeActivityResource&gt;
   */
  @GET("challenges/{challenge_id}/activities/{id}")
  Call<ChallengeActivityResource> getChallengeActivity(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Path("challenge_id") Long challengeId
  );

  /**
   * Get a single challenge activity template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CHALLENGES_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("challenge-activities/templates/{id}")
  Call<TemplateResource> getChallengeActivityTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search challenge activity templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CHALLENGES_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("challenge-activities/templates")
  Call<PageResourceTemplateResource> getChallengeActivityTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Retrieve a single challenge event details
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The challenge event id (required)
   * @return Call&lt;ChallengeEventResource&gt;
   */
  @GET("challenges/events/{id}")
  Call<ChallengeEventResource> getChallengeEvent(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Retrieve a list of challenge events
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the event start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterEndDate A comma separated string without spaces.  First value is the operator to search on, second value is the event end date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterCampaigns check only for events from currently running campaigns (optional)
   * @param filterChallenge check only for events from the challenge specified by id (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceChallengeEventResource&gt;
   */
  @GET("challenges/events")
  Call<PageResourceChallengeEventResource> getChallengeEvents(
    @retrofit2.http.Query("filter_start_date") String filterStartDate, @retrofit2.http.Query("filter_end_date") String filterEndDate, @retrofit2.http.Query("filter_campaigns") Boolean filterCampaigns, @retrofit2.http.Query("filter_challenge") Long filterChallenge, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single challenge template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CHALLENGES_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("challenges/templates/{id}")
  Call<TemplateResource> getChallengeTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search challenge templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CHALLENGES_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("challenges/templates")
  Call<PageResourceTemplateResource> getChallengeTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Retrieve a list of challenges
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterActiveCampaign Filter for challenges that are tied to active campaigns (optional)
   * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the challenge start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterEndDate A comma separated string without spaces.  First value is the operator to search on, second value is the challenge end date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceChallengeResource&gt;
   */
  @GET("challenges")
  Call<PageResourceChallengeResource> getChallenges(
    @retrofit2.http.Query("filter_active_campaign") Boolean filterActiveCampaign, @retrofit2.http.Query("filter_start_date") String filterStartDate, @retrofit2.http.Query("filter_end_date") String filterEndDate, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a challenge
   * If the challenge is a copy, changes will propagate to all the related challenges. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
   * @param id The challenge id (required)
   * @param challengeResource The challenge resource object (optional)
   * @return Call&lt;ChallengeResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("challenges/{id}")
  Call<ChallengeResource> updateChallenge(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body ChallengeResource challengeResource
  );

  /**
   * Update a challenge activity
   * A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
   * @param id The challenge_activity id (required)
   * @param challengeId The challenge id (required)
   * @param challengeActivityResource The challenge activity resource object (optional)
   * @param validateSettings Whether to validate the settings being sent against the available settings on the base activity. (optional, default to false)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("challenges/{challenge_id}/activities/{id}")
  Call<Void> updateChallengeActivity(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Path("challenge_id") Long challengeId, @retrofit2.http.Body ChallengeActivityResource challengeActivityResource, @retrofit2.http.Query("validateSettings") Boolean validateSettings
  );

  /**
   * Update an challenge activity template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param challengeActivityTemplateResource The challengeActivity template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("challenge-activities/templates/{id}")
  Call<TemplateResource> updateChallengeActivityTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource challengeActivityTemplateResource
  );

  /**
   * Update a challenge template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param challengeTemplateResource The challenge template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("challenges/templates/{id}")
  Call<TemplateResource> updateChallengeTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource challengeTemplateResource
  );

}
