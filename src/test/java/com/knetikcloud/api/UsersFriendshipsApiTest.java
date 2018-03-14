package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceSimpleUserResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersFriendshipsApi
 */
public class UsersFriendshipsApiTest {

    private UsersFriendshipsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersFriendshipsApi.class);
    }

    /**
     * Add a friend
     *
     * As a user, either creates or confirm a pending request. As an admin, call this endpoint twice while inverting the IDs to create a confirmed friendship. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     */
    @Test
    public void addFriendTest() {
        String userId = null;
        Integer id = null;
        // Void response = api.addFriend(userId, id);

        // TODO: test validations
    }
    /**
     * Get friends list
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     */
    @Test
    public void getFriendsTest() {
        String userId = null;
        String filterUsername = null;
        Integer filterUserId = null;
        Integer size = null;
        Integer page = null;
        // PageResourceSimpleUserResource response = api.getFriends(userId, filterUsername, filterUserId, size, page);

        // TODO: test validations
    }
    /**
     * Returns the invite token
     *
     * This is a unique invite token that allows direct connection to the request user.  Exposing that token presents privacy issues if the token is leaked. Use friend request flow instead if confirmation is required. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     */
    @Test
    public void getInviteTokenTest() {
        String userId = null;
        // String response = api.getInviteToken(userId);

        // TODO: test validations
    }
    /**
     * Get pending invites
     *
     * Invites that the specified user received. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     */
    @Test
    public void getInvitesTest() {
        String userId = null;
        Integer size = null;
        Integer page = null;
        // PageResourceSimpleUserResource response = api.getInvites(userId, size, page);

        // TODO: test validations
    }
    /**
     * Redeem friendship token
     *
     * Immediately connects the requested user with the user mapped by the provided invite token. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     */
    @Test
    public void redeemFriendshipTokenTest() {
        String userId = null;
        StringWrapper token = null;
        // Void response = api.redeemFriendshipToken(userId, token);

        // TODO: test validations
    }
    /**
     * Remove or decline a friend
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     */
    @Test
    public void removeOrDeclineFriendTest() {
        String userId = null;
        Integer id = null;
        // Void response = api.removeOrDeclineFriend(userId, id);

        // TODO: test validations
    }
}
