package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.CampaignResource;
import com.knetikcloud.model.PageResourceCampaignResource;
import com.knetikcloud.model.PageResourceChallengeResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CampaignsApi {
  /**
   * Add a challenge to a campaign
   * 
   * @param id The id of the campaign (required)
   * @param challengeId The id of the challenge (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("campaigns/{id}/challenges")
  Call<Void> addChallengeToCampaign(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body Long challengeId
  );

  /**
   * Create a campaign
   * 
   * @param campaignResource The campaign resource object (optional)
   * @return Call&lt;CampaignResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("campaigns")
  Call<CampaignResource> createCampaign(
    @retrofit2.http.Body CampaignResource campaignResource
  );

  /**
   * Create a campaign template
   * Campaign Templates define a type of campaign and the properties they have
   * @param campaignTemplateResource The campaign template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("campaigns/templates")
  Call<TemplateResource> createCampaignTemplate(
    @retrofit2.http.Body TemplateResource campaignTemplateResource
  );

  /**
   * Delete a campaign
   * 
   * @param id The campaign id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("campaigns/{id}")
  Call<Void> deleteCampaign(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Delete a campaign template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("campaigns/templates/{id}")
  Call<Void> deleteCampaignTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Returns a single campaign
   * 
   * @param id The campaign id (required)
   * @return Call&lt;CampaignResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("campaigns/{id}")
  Call<CampaignResource> getCampaign(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * List the challenges associated with a campaign
   * 
   * @param id The campaign id (required)
   * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the challenge start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterEndDate A comma separated string without spaces.  First value is the operator to search on, second value is the challenge end date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceChallengeResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("campaigns/{id}/challenges")
  Call<PageResourceChallengeResource> getCampaignChallenges(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Query("filter_start_date") String filterStartDate, @retrofit2.http.Query("filter_end_date") String filterEndDate, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single campaign template
   * 
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("campaigns/templates/{id}")
  Call<TemplateResource> getCampaignTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search campaign templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("campaigns/templates")
  Call<PageResourceTemplateResource> getCampaignTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List and search campaigns
   * 
   * @param filterActive Filter for campaigns that are active (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceCampaignResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("campaigns")
  Call<PageResourceCampaignResource> getCampaigns(
    @retrofit2.http.Query("filter_active") Boolean filterActive, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Remove a challenge from a campaign
   * 
   * @param campaignId The campaign id (required)
   * @param id The challenge id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("campaigns/{campaign_id}/challenges/{id}")
  Call<Void> removeChallengeFromCampaign(
    @retrofit2.http.Path("campaign_id") Long campaignId, @retrofit2.http.Path("id") Long id
  );

  /**
   * Update a campaign
   * 
   * @param id The campaign id (required)
   * @param campaignResource The campaign resource object (optional)
   * @return Call&lt;CampaignResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("campaigns/{id}")
  Call<CampaignResource> updateCampaign(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body CampaignResource campaignResource
  );

  /**
   * Update an campaign template
   * 
   * @param id The id of the template (required)
   * @param campaignTemplateResource The campaign template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("campaigns/templates/{id}")
  Call<TemplateResource> updateCampaignTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource campaignTemplateResource
  );

}
