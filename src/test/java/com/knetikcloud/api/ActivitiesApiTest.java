package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ActivityOccurrenceCreationFailure;
import com.knetikcloud.model.ActivityOccurrenceJoinResult;
import com.knetikcloud.model.ActivityOccurrenceResource;
import com.knetikcloud.model.ActivityOccurrenceResults;
import com.knetikcloud.model.ActivityOccurrenceResultsResource;
import com.knetikcloud.model.ActivityOccurrenceSettingsResource;
import com.knetikcloud.model.ActivityOccurrenceStatusWrapper;
import com.knetikcloud.model.ActivityResource;
import com.knetikcloud.model.ActivityUserResource;
import com.knetikcloud.model.ActivityUserStatusWrapper;
import com.knetikcloud.model.CreateActivityOccurrenceRequest;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.PageResourceActivityOccurrenceResource;
import com.knetikcloud.model.PageResourceBareActivityResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitiesApi
 */
public class ActivitiesApiTest {

    private ActivitiesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ActivitiesApi.class);
    }

    /**
     * Add a user to an occurrence
     *
     * If called with no body, defaults to the user making the call.
     */
    @Test
    public void addUserTest() {
        Long activityOccurrenceId = null;
        Boolean test = null;
        Boolean bypassRestrictions = null;
        IntWrapper userId = null;
        // ActivityOccurrenceResource response = api.addUser(activityOccurrenceId, test, bypassRestrictions, userId);

        // TODO: test validations
    }
    /**
     * Create an activity
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_ADMIN
     */
    @Test
    public void createActivityTest() {
        ActivityResource activityResource = null;
        // ActivityResource response = api.createActivity(activityResource);

        // TODO: test validations
    }
    /**
     * Create a new activity occurrence. Ex: start a game
     *
     * Has to enforce extra rules if not used as an admin. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
     */
    @Test
    public void createActivityOccurrenceTest() {
        Boolean test = null;
        CreateActivityOccurrenceRequest activityOccurrenceResource = null;
        // ActivityOccurrenceResource response = api.createActivityOccurrence(test, activityOccurrenceResource);

        // TODO: test validations
    }
    /**
     * Create a activity template
     *
     * Activity Templates define a type of activity and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createActivityTemplateTest() {
        TemplateResource activityTemplateResource = null;
        // TemplateResource response = api.createActivityTemplate(activityTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete an activity
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_ADMIN
     */
    @Test
    public void deleteActivityTest() {
        Long id = null;
        // Void response = api.deleteActivity(id);

        // TODO: test validations
    }
    /**
     * Delete a activity template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteActivityTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteActivityTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * List activity definitions
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getActivitiesTest() {
        Boolean filterTemplate = null;
        String filterName = null;
        String filterId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceBareActivityResource response = api.getActivities(filterTemplate, filterName, filterId, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single activity
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getActivityTest() {
        Long id = null;
        // ActivityResource response = api.getActivity(id);

        // TODO: test validations
    }
    /**
     * Load a single activity occurrence details
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
     */
    @Test
    public void getActivityOccurrenceDetailsTest() {
        Long activityOccurrenceId = null;
        // ActivityOccurrenceResource response = api.getActivityOccurrenceDetails(activityOccurrenceId);

        // TODO: test validations
    }
    /**
     * Get a single activity template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACTIVITIES_ADMIN
     */
    @Test
    public void getActivityTemplateTest() {
        String id = null;
        // TemplateResource response = api.getActivityTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search activity templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACTIVITIES_ADMIN
     */
    @Test
    public void getActivityTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getActivityTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * List activity occurrences
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
     */
    @Test
    public void listActivityOccurrencesTest() {
        String filterActivity = null;
        String filterStatus = null;
        Integer filterEvent = null;
        Integer filterChallenge = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceActivityOccurrenceResource response = api.listActivityOccurrences(filterActivity, filterStatus, filterEvent, filterChallenge, size, page, order);

        // TODO: test validations
    }
    /**
     * Remove a user from an occurrence
     *
     * 
     */
    @Test
    public void removeUserTest() {
        Long activityOccurrenceId = null;
        String userId = null;
        Boolean ban = null;
        Boolean bypassRestrictions = null;
        // Void response = api.removeUser(activityOccurrenceId, userId, ban, bypassRestrictions);

        // TODO: test validations
    }
    /**
     * Sets the status of an activity occurrence to FINISHED and logs metrics
     *
     * In addition to user permissions requirements there is security based on the core_settings.results_trust setting. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
     */
    @Test
    public void setActivityOccurrenceResultsTest() {
        Long activityOccurrenceId = null;
        ActivityOccurrenceResultsResource activityOccurrenceResults = null;
        // ActivityOccurrenceResults response = api.setActivityOccurrenceResults(activityOccurrenceId, activityOccurrenceResults);

        // TODO: test validations
    }
    /**
     * Sets the settings of an activity occurrence
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER and host or ACTIVITIES_ADMIN
     */
    @Test
    public void setActivityOccurrenceSettingsTest() {
        Long activityOccurrenceId = null;
        ActivityOccurrenceSettingsResource settings = null;
        // ActivityOccurrenceResource response = api.setActivityOccurrenceSettings(activityOccurrenceId, settings);

        // TODO: test validations
    }
    /**
     * Set a user&#39;s status within an occurrence
     *
     * 
     */
    @Test
    public void setUserStatusTest() {
        Long activityOccurrenceId = null;
        String userId = null;
        ActivityUserStatusWrapper status = null;
        // ActivityUserResource response = api.setUserStatus(activityOccurrenceId, userId, status);

        // TODO: test validations
    }
    /**
     * Update an activity
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_ADMIN
     */
    @Test
    public void updateActivityTest() {
        Long id = null;
        ActivityResource activityResource = null;
        // ActivityResource response = api.updateActivity(id, activityResource);

        // TODO: test validations
    }
    /**
     * Update the status of an activity occurrence
     *
     * If setting to &#39;FINISHED&#39; reward will be run based on current metrics that have been recorded already. Alternatively, see results endpoint to finish and record all metrics at once. Can be called by non-host participants if non_host_status_control is true. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER and host or ACTIVITIES_ADMIN
     */
    @Test
    public void updateActivityOccurrenceStatusTest() {
        Long activityOccurrenceId = null;
        ActivityOccurrenceStatusWrapper activityOccurrenceStatus = null;
        // Void response = api.updateActivityOccurrenceStatus(activityOccurrenceId, activityOccurrenceStatus);

        // TODO: test validations
    }
    /**
     * Update an activity template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateActivityTemplateTest() {
        String id = null;
        TemplateResource activityTemplateResource = null;
        // TemplateResource response = api.updateActivityTemplate(id, activityTemplateResource);

        // TODO: test validations
    }
}
