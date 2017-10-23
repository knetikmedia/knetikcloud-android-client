package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.RawEmailResource;
import com.knetikcloud.model.RawPushResource;
import com.knetikcloud.model.RawSMSResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateEmailResource;
import com.knetikcloud.model.TemplatePushResource;
import com.knetikcloud.model.TemplateSMSResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingApi
 */
public class MessagingApiTest {

    private MessagingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MessagingApi.class);
    }

    /**
     * Send a raw email to one or more users
     *
     * 
     */
    @Test
    public void sendRawEmailTest() {
        RawEmailResource rawEmailResource = null;
        // Void response = api.sendRawEmail(rawEmailResource);

        // TODO: test validations
    }
    /**
     * Send a raw push notification
     *
     * Sends a raw push notification message to one or more users. User&#39;s without registered mobile device for the application will be skipped.
     */
    @Test
    public void sendRawPushTest() {
        RawPushResource rawPushResource = null;
        // Void response = api.sendRawPush(rawPushResource);

        // TODO: test validations
    }
    /**
     * Send a raw SMS
     *
     * Sends a raw SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
     */
    @Test
    public void sendRawSMSTest() {
        RawSMSResource rawSMSResource = null;
        // Void response = api.sendRawSMS(rawSMSResource);

        // TODO: test validations
    }
    /**
     * Send a templated email to one or more users
     *
     * 
     */
    @Test
    public void sendTemplatedEmailTest() {
        TemplateEmailResource messageResource = null;
        // Void response = api.sendTemplatedEmail(messageResource);

        // TODO: test validations
    }
    /**
     * Send a templated push notification
     *
     * Sends a templated push notification message to one or more users. User&#39;s without registered mobile device for the application will be skipped.
     */
    @Test
    public void sendTemplatedPushTest() {
        TemplatePushResource templatePushResource = null;
        // Void response = api.sendTemplatedPush(templatePushResource);

        // TODO: test validations
    }
    /**
     * Send a new templated SMS
     *
     * Sends a templated SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
     */
    @Test
    public void sendTemplatedSMSTest() {
        TemplateSMSResource templateSMSResource = null;
        // Void response = api.sendTemplatedSMS(templateSMSResource);

        // TODO: test validations
    }
}
