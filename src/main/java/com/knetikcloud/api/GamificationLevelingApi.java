package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.LevelingResource;
import com.knetikcloud.model.PageResourceLevelingResource;
import com.knetikcloud.model.PageResourceUserLevelingResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserLevelingResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface GamificationLevelingApi {
  /**
   * Create a level schema
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param level The level schema definition (optional)
   * @return Call&lt;LevelingResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("leveling")
  Call<LevelingResource> createLevel(
    @retrofit2.http.Body LevelingResource level
  );

  /**
   * Delete a level
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param name The level schema name (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("leveling/{name}")
  Call<Void> deleteLevel(
    @retrofit2.http.Path("name") String name
  );

  /**
   * Retrieve a level
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_USER
   * @param name The level schema name (required)
   * @return Call&lt;LevelingResource&gt;
   */
  @GET("leveling/{name}")
  Call<LevelingResource> getLevel(
    @retrofit2.http.Path("name") String name
  );

  /**
   * Get the list of triggers that can be used to trigger a leveling progress update
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @return Call&lt;List&lt;BreTriggerResource&gt;&gt;
   */
  @GET("leveling/triggers")
  Call<List<BreTriggerResource>> getLevelTriggers();
    

  /**
   * List and search levels
   * Get a list of levels schemas with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_USER
   * @param filterName Filter for level schemas whose name contains a given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return Call&lt;PageResourceLevelingResource&gt;
   */
  @GET("leveling")
  Call<PageResourceLevelingResource> getLevels(
    @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a user&#39;s progress for a given level schema
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_USER or self
   * @param userId The id of the user or &#39;me&#39; (required)
   * @param name The level schema name (required)
   * @return Call&lt;UserLevelingResource&gt;
   */
  @GET("users/{user_id}/leveling/{name}")
  Call<UserLevelingResource> getUserLevel(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("name") String name
  );

  /**
   * Get a user&#39;s progress for all level schemas
   * Filtering and sorting is based on the LevelingResource object, not the UserLevelingResource that is returned here. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_USER or self
   * @param userId The id of the user or &#39;me&#39; (required)
   * @param filterName Filter for level schemas whose name contains a given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceUserLevelingResource&gt;
   */
  @GET("users/{user_id}/leveling")
  Call<PageResourceUserLevelingResource> getUserLevels(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update or create a leveling progress record for a user
   * If no progress record yet exists for the user, it will be created. Otherwise the provided value will be added to it. May be negative. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param userId The id of the user (required)
   * @param name The level schema name (required)
   * @param progress The amount of progress to add (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/leveling/{name}/progress")
  Call<Void> incrementProgress(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("name") String name, @retrofit2.http.Body IntWrapper progress
  );

  /**
   * Set leveling progress for a user
   * If no progress record yet exists for the user, it will be created. Otherwise it will be updated to the provided value. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param userId The id of the user (required)
   * @param name The level schema name (required)
   * @param progress The new progress amount (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/leveling/{name}/progress")
  Call<Void> setProgress(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("name") String name, @retrofit2.http.Body IntWrapper progress
  );

  /**
   * Update a level
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
   * @param name The level schema name (required)
   * @param newLevel The level schema definition (optional)
   * @return Call&lt;LevelingResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("leveling/{name}")
  Call<LevelingResource> updateLevel(
    @retrofit2.http.Path("name") String name, @retrofit2.http.Body LevelingResource newLevel
  );

}
