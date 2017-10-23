package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.GroupMemberResource;
import com.knetikcloud.model.GroupResource;
import com.knetikcloud.model.PageResourceGroupMemberResource;
import com.knetikcloud.model.PageResourceGroupResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;
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
     * 
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
     * 
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
     * 
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
     * GroupMember Templates define a type of group member and the properties they have
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
     * Group Templates define a type of group and the properties they have
     */
    @Test
    public void createGroupTemplateTest() {
        TemplateResource groupTemplateResource = null;
        // TemplateResource response = api.createGroupTemplate(groupTemplateResource);

        // TODO: test validations
    }
    /**
     * Removes a group from the system IF no resources are attached to it
     *
     * 
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
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
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
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     */
    @Test
    public void deleteGroupTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteGroupTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Loads a specific group&#39;s details
     *
     * 
     */
    @Test
    public void getGroupTest() {
        String uniqueName = null;
        // GroupResource response = api.getGroup(uniqueName);

        // TODO: test validations
    }
    /**
     * Get a user from a group
     *
     * 
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
     * 
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
     * 
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
     * 
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
     * Get a single group template
     *
     * 
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
     * 
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
     * 
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
     * 
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
     * Removes a user from a group
     *
     * 
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
     * 
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
     * 
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
     * 
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
     * 
     */
    @Test
    public void updateGroupMemberStatusTest() {
        String uniqueName = null;
        Integer userId = null;
        String status = null;
        // Void response = api.updateGroupMemberStatus(uniqueName, userId, status);

        // TODO: test validations
    }
    /**
     * Update an group member template
     *
     * 
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
     * 
     */
    @Test
    public void updateGroupTemplateTest() {
        String id = null;
        TemplateResource groupTemplateResource = null;
        // TemplateResource response = api.updateGroupTemplate(id, groupTemplateResource);

        // TODO: test validations
    }
}
