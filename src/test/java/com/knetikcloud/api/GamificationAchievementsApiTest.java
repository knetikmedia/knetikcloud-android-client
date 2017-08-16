package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.AchievementDefinitionResource;
import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.PageResourceAchievementDefinitionResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceUserAchievementGroupResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.UserAchievementGroupResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationAchievementsApi
 */
public class GamificationAchievementsApiTest {

    private GamificationAchievementsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GamificationAchievementsApi.class);
    }

    /**
     * Create a new achievement definition
     *
     * If the definition contains a trigger event name, a BRE rule is created, so that tracking logic is executed when the triggering event occurs. If no trigger event name is specified, the user&#39;s achievement status must manually be updated via the API.
     */
    @Test
    public void createAchievementTest() {
        AchievementDefinitionResource achievement = null;
        // AchievementDefinitionResource response = api.createAchievement(achievement);

        // TODO: test validations
    }
    /**
     * Create an achievement template
     *
     * Achievement templates define a type of achievement and the properties they have
     */
    @Test
    public void createAchievementTemplateTest() {
        TemplateResource template = null;
        // TemplateResource response = api.createAchievementTemplate(template);

        // TODO: test validations
    }
    /**
     * Delete an achievement definition
     *
     * Will also disable the associated generated rule, if any.
     */
    @Test
    public void deleteAchievementTest() {
        String name = null;
        // Void response = api.deleteAchievement(name);

        // TODO: test validations
    }
    /**
     * Delete an achievement template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     */
    @Test
    public void deleteAchievementTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteAchievementTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single achievement definition
     *
     * 
     */
    @Test
    public void getAchievementTest() {
        String name = null;
        // AchievementDefinitionResource response = api.getAchievement(name);

        // TODO: test validations
    }
    /**
     * Get a single achievement template
     *
     * 
     */
    @Test
    public void getAchievementTemplateTest() {
        String id = null;
        // TemplateResource response = api.getAchievementTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search achievement templates
     *
     * 
     */
    @Test
    public void getAchievementTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getAchievementTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Get the list of triggers that can be used to trigger an achievement progress update
     *
     * 
     */
    @Test
    public void getAchievementTriggersTest() {
        // List<BreTriggerResource> response = api.getAchievementTriggers();

        // TODO: test validations
    }
    /**
     * Get all achievement definitions in the system
     *
     * 
     */
    @Test
    public void getAchievementsTest() {
        String filterTagset = null;
        String filterName = null;
        Boolean filterHidden = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        Boolean filterDerived = null;
        // PageResourceAchievementDefinitionResource response = api.getAchievements(filterTagset, filterName, filterHidden, size, page, order, filterDerived);

        // TODO: test validations
    }
    /**
     * Get a list of derived achievements
     *
     * Used by other services that depend on achievements
     */
    @Test
    public void getDerivedAchievementsTest() {
        String name = null;
        // List<AchievementDefinitionResource> response = api.getDerivedAchievements(name);

        // TODO: test validations
    }
    /**
     * Retrieve progress on a given achievement for a given user
     *
     * Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.
     */
    @Test
    public void getUserAchievementProgressTest() {
        Integer userId = null;
        String achievementName = null;
        // UserAchievementGroupResource response = api.getUserAchievementProgress(userId, achievementName);

        // TODO: test validations
    }
    /**
     * Retrieve progress on achievements for a given user
     *
     * Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.
     */
    @Test
    public void getUserAchievementsProgressTest() {
        Integer userId = null;
        Boolean filterAchievementDerived = null;
        String filterAchievementTagset = null;
        String filterAchievementName = null;
        Integer size = null;
        Integer page = null;
        // PageResourceUserAchievementGroupResource response = api.getUserAchievementsProgress(userId, filterAchievementDerived, filterAchievementTagset, filterAchievementName, size, page);

        // TODO: test validations
    }
    /**
     * Retrieve progress on a given achievement for all users
     *
     * Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed.
     */
    @Test
    public void getUsersAchievementProgressTest() {
        String achievementName = null;
        Boolean filterAchievementDerived = null;
        String filterAchievementTagset = null;
        String filterAchievementName = null;
        Integer size = null;
        Integer page = null;
        // PageResourceUserAchievementGroupResource response = api.getUsersAchievementProgress(achievementName, filterAchievementDerived, filterAchievementTagset, filterAchievementName, size, page);

        // TODO: test validations
    }
    /**
     * Retrieve progress on achievements for all users
     *
     * Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed.
     */
    @Test
    public void getUsersAchievementsProgressTest() {
        Boolean filterAchievementDerived = null;
        String filterAchievementTagset = null;
        String filterAchievementName = null;
        Integer size = null;
        Integer page = null;
        // PageResourceUserAchievementGroupResource response = api.getUsersAchievementsProgress(filterAchievementDerived, filterAchievementTagset, filterAchievementName, size, page);

        // TODO: test validations
    }
    /**
     * Increment an achievement progress record for a user
     *
     * If no progress record yet exists for the user, it will be created. Otherwise it will be updated and the provided value added to the existing progress. May be negative. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
     */
    @Test
    public void incrementAchievementProgressTest() {
        Integer userId = null;
        String achievementName = null;
        IntWrapper progress = null;
        // UserAchievementGroupResource response = api.incrementAchievementProgress(userId, achievementName, progress);

        // TODO: test validations
    }
    /**
     * Set an achievement progress record for a user
     *
     * If no progress record yet exists for the user, it will be created. Otherwise it will be updated and progress set to the provided value. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
     */
    @Test
    public void setAchievementProgressTest() {
        Integer userId = null;
        String achievementName = null;
        IntWrapper progress = null;
        // UserAchievementGroupResource response = api.setAchievementProgress(userId, achievementName, progress);

        // TODO: test validations
    }
    /**
     * Update an achievement definition
     *
     * The existing generated rule, if any, will be deleted. A new rule will be created if a trigger event name is specified in the new version.
     */
    @Test
    public void updateAchievementTest() {
        String name = null;
        AchievementDefinitionResource achievement = null;
        // AchievementDefinitionResource response = api.updateAchievement(name, achievement);

        // TODO: test validations
    }
    /**
     * Update an achievement template
     *
     * 
     */
    @Test
    public void updateAchievementTemplateTest() {
        String id = null;
        TemplateResource template = null;
        // TemplateResource response = api.updateAchievementTemplate(id, template);

        // TODO: test validations
    }
}
