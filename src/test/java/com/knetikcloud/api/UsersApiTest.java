package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.NewPasswordRequest;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceUserBaseResource;
import com.knetikcloud.model.PasswordResetRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.UserResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersApi.class);
    }

    /**
     * Add a tag to a user
     *
     * 
     */
    @Test
    public void addUserTagTest() {
        Integer userId = null;
        StringWrapper tag = null;
        // Void response = api.addUserTag(userId, tag);

        // TODO: test validations
    }
    /**
     * Create a user template
     *
     * User Templates define a type of user and the properties they have
     */
    @Test
    public void createUserTemplateTest() {
        TemplateResource userTemplateResource = null;
        // TemplateResource response = api.createUserTemplate(userTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete a user template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     */
    @Test
    public void deleteUserTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteUserTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single user
     *
     * Additional private info is included as USERS_ADMIN
     */
    @Test
    public void getUserTest() {
        String id = null;
        // UserResource response = api.getUser(id);

        // TODO: test validations
    }
    /**
     * List tags for a user
     *
     * 
     */
    @Test
    public void getUserTagsTest() {
        Integer userId = null;
        // List<String> response = api.getUserTags(userId);

        // TODO: test validations
    }
    /**
     * Get a single user template
     *
     * 
     */
    @Test
    public void getUserTemplateTest() {
        String id = null;
        // TemplateResource response = api.getUserTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search user templates
     *
     * 
     */
    @Test
    public void getUserTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getUserTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * List and search users
     *
     * Additional private info is included as USERS_ADMIN
     */
    @Test
    public void getUsersTest() {
        String filterDisplayname = null;
        String filterEmail = null;
        String filterFirstname = null;
        String filterFullname = null;
        String filterLastname = null;
        String filterUsername = null;
        String filterTag = null;
        String filterGroup = null;
        String filterRole = null;
        String filterSearch = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceUserBaseResource response = api.getUsers(filterDisplayname, filterEmail, filterFirstname, filterFullname, filterLastname, filterUsername, filterTag, filterGroup, filterRole, filterSearch, size, page, order);

        // TODO: test validations
    }
    /**
     * Choose a new password after a reset
     *
     * Finish resetting a user&#39;s password using the secret provided from the password-reset endpoint.  Password should be in plain text and will be encrypted on receipt. Use SSL for security.
     */
    @Test
    public void passwordResetTest() {
        Integer id = null;
        NewPasswordRequest newPasswordRequest = null;
        // Void response = api.passwordReset(id, newPasswordRequest);

        // TODO: test validations
    }
    /**
     * Register a new user
     *
     * Password should be in plain text and will be encrypted on receipt. Use SSL for security
     */
    @Test
    public void registerUserTest() {
        UserResource userResource = null;
        // UserResource response = api.registerUser(userResource);

        // TODO: test validations
    }
    /**
     * Remove a tag from a user
     *
     * 
     */
    @Test
    public void removeUserTagTest() {
        Integer userId = null;
        String tag = null;
        // Void response = api.removeUserTag(userId, tag);

        // TODO: test validations
    }
    /**
     * Set a user&#39;s password
     *
     * Password should be in plain text and will be encrypted on receipt. Use SSL for security.
     */
    @Test
    public void setPasswordTest() {
        Integer id = null;
        StringWrapper password = null;
        // Void response = api.setPassword(id, password);

        // TODO: test validations
    }
    /**
     * Reset a user&#39;s password
     *
     * A reset code will be generated and a &#39;forgot_password&#39; BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit
     */
    @Test
    public void startPasswordResetTest() {
        Integer id = null;
        // Void response = api.startPasswordReset(id);

        // TODO: test validations
    }
    /**
     * Reset a user&#39;s password without user id
     *
     * A reset code will be generated and a &#39;forgot_password&#39; BRE event will be fired with that code.  The default system rule will send an email to the selected user if an email service has been setup. You can modify that rule in BRE to send an SMS instead or any other type of notification as you see fit.  Must submit their email, username, or mobile phone number
     */
    @Test
    public void submitPasswordResetTest() {
        PasswordResetRequest passwordReset = null;
        // Void response = api.submitPasswordReset(passwordReset);

        // TODO: test validations
    }
    /**
     * Update a user
     *
     * Password will not be edited on this endpoint, use password specific endpoints.
     */
    @Test
    public void updateUserTest() {
        String id = null;
        UserResource userResource = null;
        // Void response = api.updateUser(id, userResource);

        // TODO: test validations
    }
    /**
     * Update a user template
     *
     * 
     */
    @Test
    public void updateUserTemplateTest() {
        String id = null;
        TemplateResource userTemplateResource = null;
        // TemplateResource response = api.updateUserTemplate(id, userTemplateResource);

        // TODO: test validations
    }
}
