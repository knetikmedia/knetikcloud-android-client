package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.Config;
import com.knetikcloud.model.PageResourceConfig;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigsApi
 */
public class ConfigsApiTest {

    private ConfigsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConfigsApi.class);
    }

    /**
     * Create a new config
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
     */
    @Test
    public void createConfigTest() {
        Config config = null;
        // Config response = api.createConfig(config);

        // TODO: test validations
    }
    /**
     * Delete an existing config
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
     */
    @Test
    public void deleteConfigTest() {
        String name = null;
        // Void response = api.deleteConfig(name);

        // TODO: test validations
    }
    /**
     * Get a single config
     *
     * Only configs that are public readable will be shown without admin access. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getConfigTest() {
        String name = null;
        // Config response = api.getConfig(name);

        // TODO: test validations
    }
    /**
     * List and search configs
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getConfigsTest() {
        String filterSearch = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceConfig response = api.getConfigs(filterSearch, size, page, order);

        // TODO: test validations
    }
    /**
     * Update an existing config
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
     */
    @Test
    public void updateConfigTest() {
        String name = null;
        Config config = null;
        // Void response = api.updateConfig(name, config);

        // TODO: test validations
    }
}
