package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.AchievementDefinitionResource;
import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.PageResourceAchievementDefinitionResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceUserAchievementGroupResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.UserAchievementGroupResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface GamificationAchievementsApi {
  /**
   * Create a new achievement definition
   * If the definition contains a trigger event name, a BRE rule is created, so that tracking logic is executed when the triggering event occurs. If no trigger event name is specified, the user&#39;s achievement status must manually be updated via the API. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN
   * @param achievement The achievement definition (optional)
   * @return Call&lt;AchievementDefinitionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("achievements")
  Call<AchievementDefinitionResource> createAchievement(
    @retrofit2.http.Body AchievementDefinitionResource achievement
  );

  /**
   * Create an achievement template
   * Achievement templates define a type of achievement and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param template The achievement template to be created (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("achievements/templates")
  Call<TemplateResource> createAchievementTemplate(
    @retrofit2.http.Body TemplateResource template
  );

  /**
   * Delete an achievement definition
   * Will also disable the associated generated rule, if any. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN
   * @param name The name of the achievement (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("achievements/{name}")
  Call<Void> deleteAchievement(
    @retrofit2.http.Path("name") String name
  );

  /**
   * Delete an achievement template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("achievements/templates/{id}")
  Call<Void> deleteAchievementTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a single achievement definition
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN or ACHIEVEMENTS_USER
   * @param name The name of the achievement (required)
   * @return Call&lt;AchievementDefinitionResource&gt;
   */
  @GET("achievements/{name}")
  Call<AchievementDefinitionResource> getAchievement(
    @retrofit2.http.Path("name") String name
  );

  /**
   * Get a single achievement template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("achievements/templates/{id}")
  Call<TemplateResource> getAchievementTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search achievement templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("achievements/templates")
  Call<PageResourceTemplateResource> getAchievementTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get the list of triggers that can be used to trigger an achievement progress update
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN
   * @return Call&lt;List&lt;BreTriggerResource&gt;&gt;
   */
  @GET("achievements/triggers")
  Call<List<BreTriggerResource>> getAchievementTriggers();
    

  /**
   * Get all achievement definitions in the system
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN or ACHIEVEMENTS_USER
   * @param filterTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterName Filter for achievements whose name contains a string (optional)
   * @param filterHidden Filter for achievements that are hidden or not (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @param filterDerived Filter for achievements that are derived from other services (optional, default to false)
   * @return Call&lt;PageResourceAchievementDefinitionResource&gt;
   */
  @GET("achievements")
  Call<PageResourceAchievementDefinitionResource> getAchievements(
    @retrofit2.http.Query("filter_tagset") String filterTagset, @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("filter_hidden") Boolean filterHidden, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order, @retrofit2.http.Query("filter_derived") Boolean filterDerived
  );

  /**
   * Get a list of derived achievements
   * Used by other services that depend on achievements.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN
   * @param name The name of the derived achievement (required)
   * @return Call&lt;List&lt;AchievementDefinitionResource&gt;&gt;
   */
  @GET("achievements/derived/{name}")
  Call<List<AchievementDefinitionResource>> getDerivedAchievements(
    @retrofit2.http.Path("name") String name
  );

  /**
   * Retrieve progress on a given achievement for a given user
   * Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN
   * @param userId The user&#39;s id (required)
   * @param achievementName The achievement&#39;s name (required)
   * @return Call&lt;UserAchievementGroupResource&gt;
   */
  @GET("users/{user_id}/achievements/{achievement_name}")
  Call<UserAchievementGroupResource> getUserAchievementProgress(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("achievement_name") String achievementName
  );

  /**
   * Retrieve progress on achievements for a given user
   * Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN
   * @param userId The user&#39;s id (required)
   * @param filterAchievementDerived Filter for achievements that are derived from other services (optional)
   * @param filterAchievementTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterAchievementName Filter for achievements whose name contains a string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceUserAchievementGroupResource&gt;
   */
  @GET("users/{user_id}/achievements")
  Call<PageResourceUserAchievementGroupResource> getUserAchievementsProgress(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Query("filter_achievement_derived") Boolean filterAchievementDerived, @retrofit2.http.Query("filter_achievement_tagset") String filterAchievementTagset, @retrofit2.http.Query("filter_achievement_name") String filterAchievementName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Retrieve progress on a given achievement for all users
   * Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN
   * @param achievementName The achievement&#39;s name (required)
   * @param filterAchievementDerived Filter for achievements that are derived from other services (optional)
   * @param filterAchievementTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterAchievementName Filter for achievements whose name contains a string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceUserAchievementGroupResource&gt;
   */
  @GET("users/achievements/{achievement_name}")
  Call<PageResourceUserAchievementGroupResource> getUsersAchievementProgress(
    @retrofit2.http.Path("achievement_name") String achievementName, @retrofit2.http.Query("filter_achievement_derived") Boolean filterAchievementDerived, @retrofit2.http.Query("filter_achievement_tagset") String filterAchievementTagset, @retrofit2.http.Query("filter_achievement_name") String filterAchievementName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Retrieve progress on achievements for all users
   * Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN
   * @param filterAchievementDerived Filter for achievements that are derived from other services (optional)
   * @param filterAchievementTagset Filter for achievements with specified tags (separated by comma) (optional)
   * @param filterAchievementName Filter for achievements whose name contains a string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceUserAchievementGroupResource&gt;
   */
  @GET("users/achievements")
  Call<PageResourceUserAchievementGroupResource> getUsersAchievementsProgress(
    @retrofit2.http.Query("filter_achievement_derived") Boolean filterAchievementDerived, @retrofit2.http.Query("filter_achievement_tagset") String filterAchievementTagset, @retrofit2.http.Query("filter_achievement_name") String filterAchievementName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Increment an achievement progress record for a user
   * If no progress record yet exists for the user, it will be created. Otherwise it will be updated and the provided value added to the existing progress. May be negative. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN
   * @param userId The user&#39;s id (required)
   * @param achievementName The achievement&#39;s name (required)
   * @param progress The amount to add to the progress value (optional)
   * @return Call&lt;UserAchievementGroupResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/achievements/{achievement_name}/progress")
  Call<UserAchievementGroupResource> incrementAchievementProgress(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("achievement_name") String achievementName, @retrofit2.http.Body IntWrapper progress
  );

  /**
   * Set an achievement progress record for a user
   * If no progress record yet exists for the user, it will be created. Otherwise it will be updated and progress set to the provided value. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN
   * @param userId The user&#39;s id (required)
   * @param achievementName The achievement&#39;s name (required)
   * @param progress The new progress value (optional)
   * @return Call&lt;UserAchievementGroupResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/achievements/{achievement_name}/progress")
  Call<UserAchievementGroupResource> setAchievementProgress(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("achievement_name") String achievementName, @retrofit2.http.Body IntWrapper progress
  );

  /**
   * Update an achievement definition
   * The existing generated rule, if any, will be deleted. A new rule will be created if a trigger event name is specified in the new version. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACHIEVEMENTS_ADMIN
   * @param name The name of the achievement (required)
   * @param achievement The achievement definition (optional)
   * @return Call&lt;AchievementDefinitionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("achievements/{name}")
  Call<AchievementDefinitionResource> updateAchievement(
    @retrofit2.http.Path("name") String name, @retrofit2.http.Body AchievementDefinitionResource achievement
  );

  /**
   * Update an achievement template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param template The updated template (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("achievements/templates/{id}")
  Call<TemplateResource> updateAchievementTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource template
  );

}
