package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ActivityOccurrenceCreationFailure;
import com.knetikcloud.model.ActivityOccurrenceResource;
import com.knetikcloud.model.ActivityOccurrenceResults;
import com.knetikcloud.model.ActivityOccurrenceResultsResource;
import com.knetikcloud.model.ActivityResource;
import com.knetikcloud.model.CreateActivityOccurrenceRequest;
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
     * Create an activity
     *
     * 
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
     * Has to enforce extra rules if not used as an admin
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
     * Activity Templates define a type of activity and the properties they have
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
     * 
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
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * Sets the status of an activity occurrence to FINISHED and logs metrics
     *
     * 
     */
    @Test
    public void setActivityOccurrenceResultsTest() {
        Long activityOccurrenceId = null;
        ActivityOccurrenceResultsResource activityOccurrenceResults = null;
        // ActivityOccurrenceResults response = api.setActivityOccurrenceResults(activityOccurrenceId, activityOccurrenceResults);

        // TODO: test validations
    }
    /**
     * Update an activity
     *
     * 
     */
    @Test
    public void updateActivityTest() {
        Long id = null;
        ActivityResource activityResource = null;
        // ActivityResource response = api.updateActivity(id, activityResource);

        // TODO: test validations
    }
    /**
     * Updated the status of an activity occurrence
     *
     * If setting to &#39;FINISHED&#39; reward will be run based on current metrics that have been recorded already. Aternatively, see results endpoint to finish and record all metrics at once.
     */
    @Test
    public void updateActivityOccurrenceTest() {
        Long activityOccurrenceId = null;
        String activityOccurrenceStatus = null;
        // Void response = api.updateActivityOccurrence(activityOccurrenceId, activityOccurrenceStatus);

        // TODO: test validations
    }
    /**
     * Update an activity template
     *
     * 
     */
    @Test
    public void updateActivityTemplateTest() {
        String id = null;
        TemplateResource activityTemplateResource = null;
        // TemplateResource response = api.updateActivityTemplate(id, activityTemplateResource);

        // TODO: test validations
    }
}
