package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.DeviceResource;
import com.knetikcloud.model.PageResourceDeviceResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SimpleUserResource;
import com.knetikcloud.model.TemplateResource;
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
        String id = null;
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
     * Create a device template
     *
     * Device Templates define a type of device and the properties they have
     */
    @Test
    public void createDeviceTemplateTest() {
        TemplateResource deviceTemplateResource = null;
        // TemplateResource response = api.createDeviceTemplate(deviceTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete a device
     *
     * 
     */
    @Test
    public void deleteDeviceTest() {
        String id = null;
        // Void response = api.deleteDevice(id);

        // TODO: test validations
    }
    /**
     * Delete an device template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     */
    @Test
    public void deleteDeviceTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteDeviceTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Delete a device user
     *
     * 
     */
    @Test
    public void deleteDeviceUserTest() {
        String id = null;
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
        String id = null;
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
        String id = null;
        // DeviceResource response = api.getDevice(id);

        // TODO: test validations
    }
    /**
     * Get a single device template
     *
     * 
     */
    @Test
    public void getDeviceTemplateTest() {
        String id = null;
        // TemplateResource response = api.getDeviceTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search device templates
     *
     * 
     */
    @Test
    public void getDeviceTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getDeviceTemplates(size, page, order);

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
        String filterOs = null;
        String filterSerial = null;
        String filterType = null;
        String filterTag = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceDeviceResource response = api.getDevices(filterMake, filterModel, filterOs, filterSerial, filterType, filterTag, size, page, order);

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
        String id = null;
        // DeviceResource response = api.updateDevice(device, id);

        // TODO: test validations
    }
    /**
     * Update an device template
     *
     * 
     */
    @Test
    public void updateDeviceTemplateTest() {
        String id = null;
        TemplateResource deviceTemplateResource = null;
        // TemplateResource response = api.updateDeviceTemplate(id, deviceTemplateResource);

        // TODO: test validations
    }
}
