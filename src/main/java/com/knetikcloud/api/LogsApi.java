package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.BreEventLog;
import com.knetikcloud.model.ForwardLog;
import com.knetikcloud.model.PageResourceBreEventLog;
import com.knetikcloud.model.PageResourceForwardLog;
import com.knetikcloud.model.PageResourceUserActionLog;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserActionLog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface LogsApi {
  /**
   * Add a user log entry
   * 
   * @param logEntry The user log entry to be added (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("audit/logs")
  Call<Void> addUserLog(
    @retrofit2.http.Body UserActionLog logEntry
  );

  /**
   * Get an existing BRE event log entry by id
   * 
   * @param id The BRE event log entry id (required)
   * @return Call&lt;BreEventLog&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("bre/logs/event-log/{id}")
  Call<BreEventLog> getBREEventLog(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Returns a list of BRE event log entries
   * 
   * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the event log start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterEventName Filter event logs by event name (optional)
   * @param filterEventId Filter event logs by request id (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:DESC)
   * @return Call&lt;PageResourceBreEventLog&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("bre/logs/event-log")
  Call<PageResourceBreEventLog> getBREEventLogs(
    @retrofit2.http.Query("filter_start_date") String filterStartDate, @retrofit2.http.Query("filter_event_name") String filterEventName, @retrofit2.http.Query("filter_event_id") String filterEventId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get an existing forward log entry by id
   * 
   * @param id The forward log entry id (required)
   * @return Call&lt;ForwardLog&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("bre/logs/forward-log/{id}")
  Call<ForwardLog> getBREForwardLog(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Returns a list of forward log entries
   * 
   * @param filterStartDate A comma separated string without spaces.  First value is the operator to search on, second value is the log start date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterEndDate A comma separated string without spaces.  First value is the operator to search on, second value is the log end date, a unix timestamp in seconds.  Allowed operators: (GT, LT, EQ, GOE, LOE). (optional)
   * @param filterStatusCode Filter forward logs by http status code (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:DESC)
   * @return Call&lt;PageResourceForwardLog&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("bre/logs/forward-log")
  Call<PageResourceForwardLog> getBREForwardLogs(
    @retrofit2.http.Query("filter_start_date") String filterStartDate, @retrofit2.http.Query("filter_end_date") String filterEndDate, @retrofit2.http.Query("filter_status_code") Integer filterStatusCode, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Returns a user log entry by id
   * 
   * @param id The user log entry id (required)
   * @return Call&lt;UserActionLog&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("audit/logs/{id}")
  Call<UserActionLog> getUserLog(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Returns a page of user logs entries
   * 
   * @param filterUser Filter for actions taken by a specific user by id (optional)
   * @param filterActionName Filter for actions of a specific name (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to timestamp:DESC)
   * @return Call&lt;PageResourceUserActionLog&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("audit/logs")
  Call<PageResourceUserActionLog> getUserLogs(
    @retrofit2.http.Query("filter_user") Integer filterUser, @retrofit2.http.Query("filter_action_name") String filterActionName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

}
