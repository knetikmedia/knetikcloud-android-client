package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourcePermissionResource;
import com.knetikcloud.model.PermissionResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthPermissionsApi
 */
public class AuthPermissionsApiTest {

    private AuthPermissionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthPermissionsApi.class);
    }

    /**
     * Create a new permission
     *
     * 
     */
    @Test
    public void createPermissionTest() {
        PermissionResource permissionResource = null;
        // PermissionResource response = api.createPermission(permissionResource);

        // TODO: test validations
    }
    /**
     * Delete a permission
     *
     * 
     */
    @Test
    public void deletePermissionTest() {
        String permission = null;
        Boolean force = null;
        // Void response = api.deletePermission(permission, force);

        // TODO: test validations
    }
    /**
     * Get a single permission
     *
     * 
     */
    @Test
    public void getPermissionTest() {
        String permission = null;
        // PermissionResource response = api.getPermission(permission);

        // TODO: test validations
    }
    /**
     * List and search permissions
     *
     * 
     */
    @Test
    public void getPermissionsTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourcePermissionResource response = api.getPermissions(size, page, order);

        // TODO: test validations
    }
    /**
     * Update a permission
     *
     * 
     */
    @Test
    public void updatePermissionTest() {
        String permission = null;
        PermissionResource permissionResource = null;
        // PermissionResource response = api.updatePermission(permission, permissionResource);

        // TODO: test validations
    }
}
