package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceChallengeEventParticipantResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ReportingChallengesApi {
  /**
   * Retrieve a challenge event leaderboard details
   * Lists all leaderboard entries with additional user details
   * @param filterEvent A sepecific challenge event id (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceChallengeEventParticipantResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("reporting/events/leaderboard")
  Call<PageResourceChallengeEventParticipantResource> getChallengeEventLeaderboard(
    @retrofit2.http.Query("filter_event") Long filterEvent, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Retrieve a challenge event participant details
   * Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation
   * @param filterEvent A sepecific challenge event id (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceChallengeEventParticipantResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("reporting/events/participants")
  Call<PageResourceChallengeEventParticipantResource> getChallengeEventParticipants(
    @retrofit2.http.Query("filter_event") Long filterEvent, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

}
