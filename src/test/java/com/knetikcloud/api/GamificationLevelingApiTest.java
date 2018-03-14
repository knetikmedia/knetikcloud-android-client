package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.LevelingResource;
import com.knetikcloud.model.PageResourceLevelingResource;
import com.knetikcloud.model.PageResourceUserLevelingResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserLevelingResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationLevelingApi
 */
public class GamificationLevelingApiTest {

    private GamificationLevelingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GamificationLevelingApi.class);
    }

    /**
     * Create a level schema
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
     */
    @Test
    public void createLevelTest() {
        LevelingResource level = null;
        // LevelingResource response = api.createLevel(level);

        // TODO: test validations
    }
    /**
     * Delete a level
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
     */
    @Test
    public void deleteLevelTest() {
        String name = null;
        // Void response = api.deleteLevel(name);

        // TODO: test validations
    }
    /**
     * Retrieve a level
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_USER
     */
    @Test
    public void getLevelTest() {
        String name = null;
        // LevelingResource response = api.getLevel(name);

        // TODO: test validations
    }
    /**
     * Get the list of triggers that can be used to trigger a leveling progress update
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
     */
    @Test
    public void getLevelTriggersTest() {
        // List<BreTriggerResource> response = api.getLevelTriggers();

        // TODO: test validations
    }
    /**
     * List and search levels
     *
     * Get a list of levels schemas with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_USER
     */
    @Test
    public void getLevelsTest() {
        String filterName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceLevelingResource response = api.getLevels(filterName, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a user&#39;s progress for a given level schema
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_USER or self
     */
    @Test
    public void getUserLevelTest() {
        String userId = null;
        String name = null;
        // UserLevelingResource response = api.getUserLevel(userId, name);

        // TODO: test validations
    }
    /**
     * Get a user&#39;s progress for all level schemas
     *
     * Filtering and sorting is based on the LevelingResource object, not the UserLevelingResource that is returned here. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_USER or self
     */
    @Test
    public void getUserLevelsTest() {
        String userId = null;
        String filterName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceUserLevelingResource response = api.getUserLevels(userId, filterName, size, page, order);

        // TODO: test validations
    }
    /**
     * Update or create a leveling progress record for a user
     *
     * If no progress record yet exists for the user, it will be created. Otherwise the provided value will be added to it. May be negative. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
     */
    @Test
    public void incrementProgressTest() {
        Integer userId = null;
        String name = null;
        IntWrapper progress = null;
        // Void response = api.incrementProgress(userId, name, progress);

        // TODO: test validations
    }
    /**
     * Set leveling progress for a user
     *
     * If no progress record yet exists for the user, it will be created. Otherwise it will be updated to the provided value. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
     */
    @Test
    public void setProgressTest() {
        Integer userId = null;
        String name = null;
        IntWrapper progress = null;
        // Void response = api.setProgress(userId, name, progress);

        // TODO: test validations
    }
    /**
     * Update a level
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LEVELING_ADMIN
     */
    @Test
    public void updateLevelTest() {
        String name = null;
        LevelingResource newLevel = null;
        // LevelingResource response = api.updateLevel(name, newLevel);

        // TODO: test validations
    }
}
