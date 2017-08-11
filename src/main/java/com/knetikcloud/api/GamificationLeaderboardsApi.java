package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.LeaderboardEntryResource;
import com.knetikcloud.model.LeaderboardResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface GamificationLeaderboardsApi {
  /**
   * Retrieves leaderboard details and paginated entries
   * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. Sorting is based on the fields of LeaderboardEntryResource rather than the returned LeaderboardResource.
   * @param contextType The context type for the leaderboard (required)
   * @param contextId The context id for the leaderboard (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to score:DESC,updated:ASC,user_id:ASC)
   * @return Call&lt;LeaderboardResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("leaderboards/{context_type}/{context_id}")
  Call<LeaderboardResource> getLeaderboard(
    @retrofit2.http.Path("context_type") String contextType, @retrofit2.http.Path("context_id") String contextId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Retrieves a specific user entry with rank
   * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard
   * @param contextType The context type for the leaderboard (required)
   * @param contextId The context id for the leaderboard (required)
   * @param id The id of a user (required)
   * @return Call&lt;LeaderboardEntryResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("leaderboards/{context_type}/{context_id}/users/{id}/rank")
  Call<LeaderboardEntryResource> getLeaderboardRank(
    @retrofit2.http.Path("context_type") String contextType, @retrofit2.http.Path("context_id") String contextId, @retrofit2.http.Path("id") String id
  );

  /**
   * Get a list of available leaderboard strategy names
   * 
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("leaderboards/strategies")
  Call<List<String>> getLeaderboardStrategies();
    

}
