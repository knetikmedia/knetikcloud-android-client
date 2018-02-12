package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.Maintenance;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilMaintenanceApi
 */
public class UtilMaintenanceApiTest {

    private UtilMaintenanceApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UtilMaintenanceApi.class);
    }

    /**
     * Delete maintenance info
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MAINTENANCE_ADMIN
     */
    @Test
    public void deleteMaintenanceTest() {
        // Void response = api.deleteMaintenance();

        // TODO: test validations
    }
    /**
     * Get current maintenance info
     *
     * Get current maintenance info. 404 if no maintenance. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getMaintenanceTest() {
        // Maintenance response = api.getMaintenance();

        // TODO: test validations
    }
    /**
     * Set current maintenance info
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MAINTENANCE_ADMIN
     */
    @Test
    public void setMaintenanceTest() {
        Maintenance maintenance = null;
        // Void response = api.setMaintenance(maintenance);

        // TODO: test validations
    }
    /**
     * Update current maintenance info
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MAINTENANCE_ADMIN
     */
    @Test
    public void updateMaintenanceTest() {
        Maintenance maintenance = null;
        // Void response = api.updateMaintenance(maintenance);

        // TODO: test validations
    }
}
