package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceTopicResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TopicSubscriberResource;
import com.knetikcloud.model.ValueWrapperboolean;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingTopicsApi
 */
public class MessagingTopicsApiTest {

    private MessagingTopicsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MessagingTopicsApi.class);
    }

    /**
     * Enable or disable messages for a user
     *
     * Useful for opt-out options on a single topic. Consider multiple topics for multiple opt-out options. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
     */
    @Test
    public void disableTopicSubscriberTest() {
        String id = null;
        String userId = null;
        ValueWrapperboolean disabled = null;
        // Void response = api.disableTopicSubscriber(id, userId, disabled);

        // TODO: test validations
    }
    /**
     * Get a subscriber to a topic
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
     */
    @Test
    public void getTopicSubscriberTest() {
        String id = null;
        String userId = null;
        // TopicSubscriberResource response = api.getTopicSubscriber(id, userId);

        // TODO: test validations
    }
    /**
     * Get all messaging topics for a given user
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
     */
    @Test
    public void getUserTopicsTest() {
        String id = null;
        // PageResourceTopicResource response = api.getUserTopics(id);

        // TODO: test validations
    }
}
