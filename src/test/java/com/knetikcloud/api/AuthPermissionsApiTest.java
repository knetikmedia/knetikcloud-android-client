/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.PageResourcePermissionResource;
import com.knetikcloud.model.PermissionResource;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthPermissionsApi
 */
@Ignore
public class AuthPermissionsApiTest {

    private final AuthPermissionsApi api = new AuthPermissionsApi();

    
    /**
     * Create a new permission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPermissionTest() throws ApiException {
        PermissionResource permissionResource = null;
        PermissionResource response = api.createPermission(permissionResource);

        // TODO: test validations
    }
    
    /**
     * Delete a permission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePermissionTest() throws ApiException {
        String permission = null;
        Boolean force = null;
        api.deletePermission(permission, force);

        // TODO: test validations
    }
    
    /**
     * Get a single permission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPermissionTest() throws ApiException {
        String permission = null;
        PermissionResource response = api.getPermission(permission);

        // TODO: test validations
    }
    
    /**
     * List and search permissions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPermissionsTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourcePermissionResource response = api.getPermissions(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a permission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePermissionTest() throws ApiException {
        String permission = null;
        PermissionResource permissionResource = null;
        PermissionResource response = api.updatePermission(permission, permissionResource);

        // TODO: test validations
    }
    
}
