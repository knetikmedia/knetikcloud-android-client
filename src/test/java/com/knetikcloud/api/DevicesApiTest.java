package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.DeviceResource;
import com.knetikcloud.model.PageResourceDeviceResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SimpleUserResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesApi
 */
public class DevicesApiTest {

    private DevicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DevicesApi.class);
    }

    /**
     * Add device users
     *
     * 
     */
    @Test
    public void addDeviceUsersTest() {
        List<SimpleUserResource> userResources = null;
        Integer id = null;
        // DeviceResource response = api.addDeviceUsers(userResources, id);

        // TODO: test validations
    }
    /**
     * Create a device
     *
     * 
     */
    @Test
    public void createDeviceTest() {
        DeviceResource device = null;
        // DeviceResource response = api.createDevice(device);

        // TODO: test validations
    }
    /**
     * Delete a device
     *
     * 
     */
    @Test
    public void deleteDeviceTest() {
        Integer id = null;
        // Void response = api.deleteDevice(id);

        // TODO: test validations
    }
    /**
     * Delete a device user
     *
     * 
     */
    @Test
    public void deleteDeviceUserTest() {
        Integer id = null;
        Integer userId = null;
        // Void response = api.deleteDeviceUser(id, userId);

        // TODO: test validations
    }
    /**
     * Delete all device users
     *
     * 
     */
    @Test
    public void deleteDeviceUsersTest() {
        Integer id = null;
        String filterId = null;
        // Void response = api.deleteDeviceUsers(id, filterId);

        // TODO: test validations
    }
    /**
     * Get a single device
     *
     * 
     */
    @Test
    public void getDeviceTest() {
        Integer id = null;
        // DeviceResource response = api.getDevice(id);

        // TODO: test validations
    }
    /**
     * List and search devices
     *
     * Get a list of devices with optional filtering
     */
    @Test
    public void getDevicesTest() {
        String filterMake = null;
        String filterModel = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceDeviceResource response = api.getDevices(filterMake, filterModel, size, page, order);

        // TODO: test validations
    }
    /**
     * Update a device
     *
     * 
     */
    @Test
    public void updateDeviceTest() {
        DeviceResource device = null;
        Integer id = null;
        // DeviceResource response = api.updateDevice(device, id);

        // TODO: test validations
    }
}
