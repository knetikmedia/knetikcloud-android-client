package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceRewardSetResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.RewardSetResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CampaignsRewardsApi {
  /**
   * Create a reward set
   * 
   * @param rewardSetResource The reward set resource object (optional)
   * @return Call&lt;RewardSetResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("rewards")
  Call<RewardSetResource> createRewardSet(
    @retrofit2.http.Body RewardSetResource rewardSetResource
  );

  /**
   * Delete a reward set
   * 
   * @param id The reward id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("rewards/{id}")
  Call<Void> deleteRewardSet(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a single reward set
   * 
   * @param id The reward id (required)
   * @return Call&lt;RewardSetResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("rewards/{id}")
  Call<RewardSetResource> getRewardSet(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * List and search reward sets
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceRewardSetResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("rewards")
  Call<PageResourceRewardSetResource> getRewardSets(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a reward set
   * 
   * @param id The reward id (required)
   * @param rewardSetResource The reward set resource object (optional)
   * @return Call&lt;RewardSetResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("rewards/{id}")
  Call<RewardSetResource> updateRewardSet(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body RewardSetResource rewardSetResource
  );

}
