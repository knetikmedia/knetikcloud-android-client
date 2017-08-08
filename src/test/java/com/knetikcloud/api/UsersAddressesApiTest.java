package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceSavedAddressResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SavedAddressResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersAddressesApi
 */
public class UsersAddressesApiTest {

    private UsersAddressesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersAddressesApi.class);
    }

    /**
     * Create a new address
     *
     * 
     */
    @Test
    public void createAddressTest() {
        String userId = null;
        SavedAddressResource savedAddressResource = null;
        // SavedAddressResource response = api.createAddress(userId, savedAddressResource);

        // TODO: test validations
    }
    /**
     * Delete an address
     *
     * 
     */
    @Test
    public void deleteAddressTest() {
        String userId = null;
        Integer id = null;
        // Void response = api.deleteAddress(userId, id);

        // TODO: test validations
    }
    /**
     * Get a single address
     *
     * 
     */
    @Test
    public void getAddressTest() {
        String userId = null;
        Integer id = null;
        // SavedAddressResource response = api.getAddress(userId, id);

        // TODO: test validations
    }
    /**
     * List and search addresses
     *
     * 
     */
    @Test
    public void getAddressesTest() {
        String userId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceSavedAddressResource response = api.getAddresses(userId, size, page, order);

        // TODO: test validations
    }
    /**
     * Update an address
     *
     * 
     */
    @Test
    public void updateAddressTest() {
        String userId = null;
        Integer id = null;
        SavedAddressResource savedAddressResource = null;
        // SavedAddressResource response = api.updateAddress(userId, id, savedAddressResource);

        // TODO: test validations
    }
}
