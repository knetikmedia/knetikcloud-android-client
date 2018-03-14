package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.NotificationResource;
import com.knetikcloud.model.NotificationTypeResource;
import com.knetikcloud.model.NotificationUserTypeResource;
import com.knetikcloud.model.PageResourceNotificationTypeResource;
import com.knetikcloud.model.PageResourceNotificationUserTypeResource;
import com.knetikcloud.model.PageResourceUserNotificationResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserNotificationStatusWrapper;
import com.knetikcloud.model.ValueWrapperboolean;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationsApi
 */
public class NotificationsApiTest {

    private NotificationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NotificationsApi.class);
    }

    /**
     * Create a notification type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
     */
    @Test
    public void createNotificationTypeTest() {
        NotificationTypeResource notificationType = null;
        // NotificationTypeResource response = api.createNotificationType(notificationType);

        // TODO: test validations
    }
    /**
     * Delete a notification type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
     */
    @Test
    public void deleteNotificationTypeTest() {
        String id = null;
        // Void response = api.deleteNotificationType(id);

        // TODO: test validations
    }
    /**
     * Get a single notification type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
     */
    @Test
    public void getNotificationTypeTest() {
        String id = null;
        // NotificationTypeResource response = api.getNotificationType(id);

        // TODO: test validations
    }
    /**
     * List and search notification types
     *
     * Get a list of notification type with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
     */
    @Test
    public void getNotificationTypesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceNotificationTypeResource response = api.getNotificationTypes(size, page, order);

        // TODO: test validations
    }
    /**
     * View a user&#39;s notification settings for a type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN or self
     */
    @Test
    public void getUserNotificationInfoTest() {
        String typeId = null;
        String userId = null;
        // NotificationUserTypeResource response = api.getUserNotificationInfo(typeId, userId);

        // TODO: test validations
    }
    /**
     * View a user&#39;s notification settings
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN or self
     */
    @Test
    public void getUserNotificationInfoListTest() {
        String userId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceNotificationUserTypeResource response = api.getUserNotificationInfoList(userId, size, page, order);

        // TODO: test validations
    }
    /**
     * Get notifications
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN or self
     */
    @Test
    public void getUserNotificationsTest() {
        String id = null;
        String filterStatus = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceUserNotificationResource response = api.getUserNotifications(id, filterStatus, size, page, order);

        // TODO: test validations
    }
    /**
     * Send a notification
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
     */
    @Test
    public void sendNotificationTest() {
        NotificationResource notification = null;
        // NotificationResource response = api.sendNotification(notification);

        // TODO: test validations
    }
    /**
     * Set notification status
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN or self
     */
    @Test
    public void setUserNotificationStatusTest() {
        String userId = null;
        String notificationId = null;
        UserNotificationStatusWrapper notification = null;
        // Void response = api.setUserNotificationStatus(userId, notificationId, notification);

        // TODO: test validations
    }
    /**
     * Enable or disable direct notifications for a user
     *
     * Allows enabling or disabling messages for a given notification type when sent direct to the user. Notifications can still be retrieved by endpoint. For notifications broadcased to a topic, see the topic service to disable messages for the user there. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN or self
     */
    @Test
    public void silenceDirectNotificationsTest() {
        String typeId = null;
        String userId = null;
        ValueWrapperboolean silenced = null;
        // Void response = api.silenceDirectNotifications(typeId, userId, silenced);

        // TODO: test validations
    }
    /**
     * Update a notificationType
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; NOTIFICATIONS_ADMIN
     */
    @Test
    public void updateNotificationTypeTest() {
        String id = null;
        NotificationTypeResource notificationType = null;
        // NotificationTypeResource response = api.updateNotificationType(id, notificationType);

        // TODO: test validations
    }
}
