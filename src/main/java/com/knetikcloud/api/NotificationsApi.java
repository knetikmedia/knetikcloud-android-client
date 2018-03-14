package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.NotificationResource;
import com.knetikcloud.model.NotificationTypeResource;
import com.knetikcloud.model.NotificationUserTypeResource;
import com.knetikcloud.model.PageResourceNotificationTypeResource;
import com.knetikcloud.model.PageResourceNotificationUserTypeResource;
import com.knetikcloud.model.PageResourceUserNotificationResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserNotificationStatusWrapper;
import com.knetikcloud.model.ValueWrapperboolean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface NotificationsApi {
  /**
   * Create a notification type
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
   * @param notificationType notificationType (optional)
   * @return Call&lt;NotificationTypeResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("notifications/types")
  Call<NotificationTypeResource> createNotificationType(
    @retrofit2.http.Body NotificationTypeResource notificationType
  );

  /**
   * Delete a notification type
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
   * @param id id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("notifications/types/{id}")
  Call<Void> deleteNotificationType(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a single notification type
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
   * @param id id (required)
   * @return Call&lt;NotificationTypeResource&gt;
   */
  @GET("notifications/types/{id}")
  Call<NotificationTypeResource> getNotificationType(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search notification types
   * Get a list of notification type with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceNotificationTypeResource&gt;
   */
  @GET("notifications/types")
  Call<PageResourceNotificationTypeResource> getNotificationTypes(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * View a user&#39;s notification settings for a type
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN or self
   * @param typeId The id of the topic (required)
   * @param userId The id of the subscriber or &#39;me&#39; (required)
   * @return Call&lt;NotificationUserTypeResource&gt;
   */
  @GET("users/{user_id}/notifications/types/{type_id}")
  Call<NotificationUserTypeResource> getUserNotificationInfo(
    @retrofit2.http.Path("type_id") String typeId, @retrofit2.http.Path("user_id") String userId
  );

  /**
   * View a user&#39;s notification settings
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN or self
   * @param userId The id of the subscriber or &#39;me&#39; (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceNotificationUserTypeResource&gt;
   */
  @GET("users/{user_id}/notifications/types")
  Call<PageResourceNotificationUserTypeResource> getUserNotificationInfoList(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get notifications
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN or self
   * @param id The id of the user or &#39;me&#39; (required)
   * @param filterStatus filter for notifications with a given status (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceUserNotificationResource&gt;
   */
  @GET("users/{id}/notifications")
  Call<PageResourceUserNotificationResource> getUserNotifications(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter_status") String filterStatus, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Send a notification
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
   * @param notification notification (optional)
   * @return Call&lt;NotificationResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("notifications")
  Call<NotificationResource> sendNotification(
    @retrofit2.http.Body NotificationResource notification
  );

  /**
   * Set notification status
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN or self
   * @param userId The id of the user or &#39;me&#39; (required)
   * @param notificationId The id of the notification (required)
   * @param notification status (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/notifications/{notification_id}/status")
  Call<Void> setUserNotificationStatus(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("notification_id") String notificationId, @retrofit2.http.Body UserNotificationStatusWrapper notification
  );

  /**
   * Enable or disable direct notifications for a user
   * Allows enabling or disabling messages for a given notification type when sent direct to the user. Notifications can still be retrieved by endpoint. For notifications broadcased to a topic, see the topic service to disable messages for the user there. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN or self
   * @param typeId The id of the topic (required)
   * @param userId The id of the subscriber or &#39;me&#39; (required)
   * @param silenced silenced (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/notifications/types/{type_id}/silenced")
  Call<Void> silenceDirectNotifications(
    @retrofit2.http.Path("type_id") String typeId, @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body ValueWrapperboolean silenced
  );

  /**
   * Update a notificationType
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
   * @param id id (required)
   * @param notificationType notificationType (optional)
   * @return Call&lt;NotificationTypeResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("notifications/types/{id}")
  Call<NotificationTypeResource> updateNotificationType(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body NotificationTypeResource notificationType
  );

}
