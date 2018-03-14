package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ChatMessageRequest;
import com.knetikcloud.model.ChatMessageResource;
import com.knetikcloud.model.GroupMemberResource;
import com.knetikcloud.model.GroupMemberStatusWrapper;
import com.knetikcloud.model.GroupResource;
import com.knetikcloud.model.PageResourceChatMessageResource;
import com.knetikcloud.model.PageResourceGroupMemberResource;
import com.knetikcloud.model.PageResourceGroupResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.ValueWrapperboolean;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersGroupsApi
 */
public class UsersGroupsApiTest {

    private UsersGroupsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersGroupsApi.class);
    }

    /**
     * Adds a new member to the group
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GROUP_ADMIN or self if open
     */
    @Test
    public void addMemberToGroupTest() {
        String uniqueName = null;
        GroupMemberResource user = null;
        // GroupMemberResource response = api.addMemberToGroup(uniqueName, user);

        // TODO: test validations
    }
    /**
     * Adds multiple members to the group
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GROUP_ADMIN
     */
    @Test
    public void addMembersToGroupTest() {
        String uniqueName = null;
        List<GroupMemberResource> users = null;
        // List<GroupMemberResource> response = api.addMembersToGroup(uniqueName, users);

        // TODO: test validations
    }
    /**
     * Create a group
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GROUP_ADMIN
     */
    @Test
    public void createGroupTest() {
        GroupResource groupResource = null;
        // GroupResource response = api.createGroup(groupResource);

        // TODO: test validations
    }
    /**
     * Create an group member template
     *
     * GroupMember Templates define a type of group member and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createGroupMemberTemplateTest() {
        TemplateResource groupMemberTemplateResource = null;
        // TemplateResource response = api.createGroupMemberTemplate(groupMemberTemplateResource);

        // TODO: test validations
    }
    /**
     * Create a group template
     *
     * Group Templates define a type of group and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createGroupTemplateTest() {
        TemplateResource groupTemplateResource = null;
        // TemplateResource response = api.createGroupTemplate(groupTemplateResource);

        // TODO: test validations
    }
    /**
     * Removes a group from the system
     *
     * All groups listing this as the parent are also removed and users are in turn removed from this and those groups. This may result in users no longer being in this group&#39;s parent if they were not added to it directly as well. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GROUP_ADMIN
     */
    @Test
    public void deleteGroupTest() {
        String uniqueName = null;
        // Void response = api.deleteGroup(uniqueName);

        // TODO: test validations
    }
    /**
     * Delete an group member template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteGroupMemberTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteGroupMemberTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Delete a group template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteGroupTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteGroupTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Enable or disable notification of group messages
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
     */
    @Test
    public void disableGroupNotificationTest() {
        String uniqueName = null;
        String userId = null;
        ValueWrapperboolean disabled = null;
        // Void response = api.disableGroupNotification(uniqueName, userId, disabled);

        // TODO: test validations
    }
    /**
     * Loads a specific group&#39;s details
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getGroupTest() {
        String uniqueName = null;
        // GroupResource response = api.getGroup(uniqueName);

        // TODO: test validations
    }
    /**
     * Get group ancestors
     *
     * Returns a list of ancestor groups in reverse order (parent, then grandparent, etc). &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getGroupAncestorsTest() {
        String uniqueName = null;
        // List<GroupResource> response = api.getGroupAncestors(uniqueName);

        // TODO: test validations
    }
    /**
     * Get a user from a group
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getGroupMemberTest() {
        String uniqueName = null;
        Integer userId = null;
        // GroupMemberResource response = api.getGroupMember(uniqueName, userId);

        // TODO: test validations
    }
    /**
     * Get a single group member template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or GROUP_ADMIN
     */
    @Test
    public void getGroupMemberTemplateTest() {
        String id = null;
        // TemplateResource response = api.getGroupMemberTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search group member templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or GROUP_ADMIN
     */
    @Test
    public void getGroupMemberTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getGroupMemberTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Lists members of the group
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getGroupMembersTest() {
        String uniqueName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceGroupMemberResource response = api.getGroupMembers(uniqueName, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a list of group messages
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getGroupMessagesTest() {
        String uniqueName = null;
        Integer size = null;
        Integer page = null;
        // PageResourceChatMessageResource response = api.getGroupMessages(uniqueName, size, page);

        // TODO: test validations
    }
    /**
     * Get a single group template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or GROUP_ADMIN
     */
    @Test
    public void getGroupTemplateTest() {
        String id = null;
        // TemplateResource response = api.getGroupTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search group templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or GROUP_ADMIN
     */
    @Test
    public void getGroupTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getGroupTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * List groups a user is in
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getGroupsForUserTest() {
        Integer userId = null;
        Boolean filterChildren = null;
        // List<String> response = api.getGroupsForUser(userId, filterChildren);

        // TODO: test validations
    }
    /**
     * List and search groups
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void listGroupsTest() {
        String filterTemplate = null;
        String filterMemberCount = null;
        String filterName = null;
        String filterUniqueName = null;
        String filterParent = null;
        String filterStatus = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceGroupResource response = api.listGroups(filterTemplate, filterMemberCount, filterName, filterUniqueName, filterParent, filterStatus, size, page, order);

        // TODO: test validations
    }
    /**
     * Send a group message
     *
     * 
     */
    @Test
    public void postGroupMessageTest() {
        String uniqueName = null;
        ChatMessageRequest chatMessageRequest = null;
        // ChatMessageResource response = api.postGroupMessage(uniqueName, chatMessageRequest);

        // TODO: test validations
    }
    /**
     * Removes a user from a group
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GROUP_ADMIN or self if open
     */
    @Test
    public void removeGroupMemberTest() {
        String uniqueName = null;
        Integer userId = null;
        // Void response = api.removeGroupMember(uniqueName, userId);

        // TODO: test validations
    }
    /**
     * Update a group
     *
     * If adding/removing/changing parent, user membership in group/new parent groups may be modified. The parent being removed will remove members from this sub group unless they were added explicitly to the parent and the new parent will gain members unless they were already a part of it. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GROUP_ADMIN or admin of the group
     */
    @Test
    public void updateGroupTest() {
        String uniqueName = null;
        GroupResource groupResource = null;
        // Void response = api.updateGroup(uniqueName, groupResource);

        // TODO: test validations
    }
    /**
     * Change a user&#39;s order
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GROUP_ADMIN
     */
    @Test
    public void updateGroupMemberPropertiesTest() {
        String uniqueName = null;
        Integer userId = null;
        StringWrapper order = null;
        // Void response = api.updateGroupMemberProperties(uniqueName, userId, order);

        // TODO: test validations
    }
    /**
     * Change a user&#39;s membership properties
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GROUP_ADMIN
     */
    @Test
    public void updateGroupMemberProperties1Test() {
        String uniqueName = null;
        Integer userId = null;
        Object properties = null;
        // Void response = api.updateGroupMemberProperties1(uniqueName, userId, properties);

        // TODO: test validations
    }
    /**
     * Change a user&#39;s status
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GROUP_ADMIN
     */
    @Test
    public void updateGroupMemberStatusTest() {
        String uniqueName = null;
        Integer userId = null;
        GroupMemberStatusWrapper status = null;
        // Void response = api.updateGroupMemberStatus(uniqueName, userId, status);

        // TODO: test validations
    }
    /**
     * Update an group member template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateGroupMemberTemplateTest() {
        String id = null;
        TemplateResource groupMemberTemplateResource = null;
        // TemplateResource response = api.updateGroupMemberTemplate(id, groupMemberTemplateResource);

        // TODO: test validations
    }
    /**
     * Update a group template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateGroupTemplateTest() {
        String id = null;
        TemplateResource groupTemplateResource = null;
        // TemplateResource response = api.updateGroupTemplate(id, groupTemplateResource);

        // TODO: test validations
    }
}
