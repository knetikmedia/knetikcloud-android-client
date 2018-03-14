package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ChatBlacklistResource;
import com.knetikcloud.model.ChatMessageResource;
import com.knetikcloud.model.PageResourceChatMessageResource;
import com.knetikcloud.model.PageResourceChatUserThreadResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChatApi
 */
public class ChatApiTest {

    private ChatApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ChatApi.class);
    }

    /**
     * Acknowledge number of messages in a thread
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; owner
     */
    @Test
    public void acknowledgeChatMessageTest() {
        String id = null;
        Integer readCount = null;
        // Void response = api.acknowledgeChatMessage(id, readCount);

        // TODO: test validations
    }
    /**
     * Add a user to a chat message blacklist
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
     */
    @Test
    public void addChatMessageBlacklistTest() {
        Integer blacklistedUserId = null;
        String id = null;
        // Void response = api.addChatMessageBlacklist(blacklistedUserId, id);

        // TODO: test validations
    }
    /**
     * Delete a message
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
     */
    @Test
    public void deleteChatMessageTest() {
        String id = null;
        // Void response = api.deleteChatMessage(id);

        // TODO: test validations
    }
    /**
     * Edit your message
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; owner
     */
    @Test
    public void editChatMessageTest() {
        String id = null;
        ChatMessageResource chatMessageResource = null;
        // Void response = api.editChatMessage(id, chatMessageResource);

        // TODO: test validations
    }
    /**
     * Get a message
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
     */
    @Test
    public void getChatMessageTest() {
        String id = null;
        // ChatMessageResource response = api.getChatMessage(id);

        // TODO: test validations
    }
    /**
     * Get a list of blocked users for chat messaging
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
     */
    @Test
    public void getChatMessageBlacklistTest() {
        String id = null;
        // List<ChatBlacklistResource> response = api.getChatMessageBlacklist(id);

        // TODO: test validations
    }
    /**
     * List your threads
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; owner
     */
    @Test
    public void getChatThreadsTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceChatUserThreadResource response = api.getChatThreads(size, page, order);

        // TODO: test validations
    }
    /**
     * List messages with a user
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; owner
     */
    @Test
    public void getDirectMessagesTest() {
        Integer id = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceChatMessageResource response = api.getDirectMessages(id, size, page, order);

        // TODO: test validations
    }
    /**
     * List messages in a thread
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
     */
    @Test
    public void getThreadMessagesTest() {
        String id = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceChatMessageResource response = api.getThreadMessages(id, size, page, order);

        // TODO: test validations
    }
    /**
     * List messages in a topic
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
     */
    @Test
    public void getTopicMessagesTest() {
        String id = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceChatMessageResource response = api.getTopicMessages(id, size, page, order);

        // TODO: test validations
    }
    /**
     * Remove a user from a blacklist
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHAT_ADMIN or owner
     */
    @Test
    public void removeChatBlacklistTest() {
        Integer blacklistedUserId = null;
        String id = null;
        // Void response = api.removeChatBlacklist(blacklistedUserId, id);

        // TODO: test validations
    }
    /**
     * Send a message
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void sendChatMessageTest() {
        ChatMessageResource chatMessageResource = null;
        // ChatMessageResource response = api.sendChatMessage(chatMessageResource);

        // TODO: test validations
    }
}
