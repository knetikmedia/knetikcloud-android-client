package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ChallengeActivityResource;
import com.knetikcloud.model.ChallengeEventResource;
import com.knetikcloud.model.ChallengeResource;
import com.knetikcloud.model.PageResourceBareChallengeActivityResource;
import com.knetikcloud.model.PageResourceChallengeEventResource;
import com.knetikcloud.model.PageResourceChallengeResource;
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
 * API tests for CampaignsChallengesApi
 */
public class CampaignsChallengesApiTest {

    private CampaignsChallengesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CampaignsChallengesApi.class);
    }

    /**
     * Create a challenge
     *
     * Challenges do not run on their own.  They must be added to a campaign before events will spawn. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
     */
    @Test
    public void createChallengeTest() {
        ChallengeResource challengeResource = null;
        // ChallengeResource response = api.createChallenge(challengeResource);

        // TODO: test validations
    }
    /**
     * Create a challenge activity
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
     */
    @Test
    public void createChallengeActivityTest() {
        Long challengeId = null;
        ChallengeActivityResource challengeActivityResource = null;
        Boolean validateSettings = null;
        // ChallengeActivityResource response = api.createChallengeActivity(challengeId, challengeActivityResource, validateSettings);

        // TODO: test validations
    }
    /**
     * Create a challenge activity template
     *
     * Challenge Activity Templates define a type of challenge activity and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createChallengeActivityTemplateTest() {
        TemplateResource challengeActivityTemplateResource = null;
        // TemplateResource response = api.createChallengeActivityTemplate(challengeActivityTemplateResource);

        // TODO: test validations
    }
    /**
     * Create a challenge template
     *
     * Challenge Templates define a type of challenge and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createChallengeTemplateTest() {
        TemplateResource challengeTemplateResource = null;
        // TemplateResource response = api.createChallengeTemplate(challengeTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete a challenge
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
     */
    @Test
    public void deleteChallengeTest() {
        Long id = null;
        // Void response = api.deleteChallenge(id);

        // TODO: test validations
    }
    /**
     * Delete a challenge activity
     *
     * A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
     */
    @Test
    public void deleteChallengeActivityTest() {
        Long id = null;
        Long challengeId = null;
        // Void response = api.deleteChallengeActivity(id, challengeId);

        // TODO: test validations
    }
    /**
     * Delete a challenge activity template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteChallengeActivityTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteChallengeActivityTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Delete a challenge event
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
     */
    @Test
    public void deleteChallengeEventTest() {
        Long id = null;
        // Void response = api.deleteChallengeEvent(id);

        // TODO: test validations
    }
    /**
     * Delete a challenge template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteChallengeTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteChallengeTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Retrieve a challenge
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getChallengeTest() {
        Long id = null;
        // ChallengeResource response = api.getChallenge(id);

        // TODO: test validations
    }
    /**
     * List and search challenge activities
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getChallengeActivitiesTest() {
        Long challengeId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceBareChallengeActivityResource response = api.getChallengeActivities(challengeId, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single challenge activity
     *
     * A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getChallengeActivityTest() {
        Long id = null;
        Long challengeId = null;
        // ChallengeActivityResource response = api.getChallengeActivity(id, challengeId);

        // TODO: test validations
    }
    /**
     * Get a single challenge activity template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CHALLENGES_ADMIN
     */
    @Test
    public void getChallengeActivityTemplateTest() {
        String id = null;
        // TemplateResource response = api.getChallengeActivityTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search challenge activity templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CHALLENGES_ADMIN
     */
    @Test
    public void getChallengeActivityTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getChallengeActivityTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Retrieve a single challenge event details
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getChallengeEventTest() {
        Long id = null;
        // ChallengeEventResource response = api.getChallengeEvent(id);

        // TODO: test validations
    }
    /**
     * Retrieve a list of challenge events
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getChallengeEventsTest() {
        String filterStartDate = null;
        String filterEndDate = null;
        Boolean filterCampaigns = null;
        Long filterChallenge = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceChallengeEventResource response = api.getChallengeEvents(filterStartDate, filterEndDate, filterCampaigns, filterChallenge, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single challenge template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CHALLENGES_ADMIN
     */
    @Test
    public void getChallengeTemplateTest() {
        String id = null;
        // TemplateResource response = api.getChallengeTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search challenge templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CHALLENGES_ADMIN
     */
    @Test
    public void getChallengeTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getChallengeTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Retrieve a list of challenges
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getChallengesTest() {
        Boolean filterActiveCampaign = null;
        String filterStartDate = null;
        String filterEndDate = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceChallengeResource response = api.getChallenges(filterActiveCampaign, filterStartDate, filterEndDate, size, page, order);

        // TODO: test validations
    }
    /**
     * Update a challenge
     *
     * If the challenge is a copy, changes will propagate to all the related challenges. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
     */
    @Test
    public void updateChallengeTest() {
        Long id = null;
        ChallengeResource challengeResource = null;
        // ChallengeResource response = api.updateChallenge(id, challengeResource);

        // TODO: test validations
    }
    /**
     * Update a challenge activity
     *
     * A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; CHALLENGES_ADMIN
     */
    @Test
    public void updateChallengeActivityTest() {
        Long id = null;
        Long challengeId = null;
        ChallengeActivityResource challengeActivityResource = null;
        Boolean validateSettings = null;
        // Void response = api.updateChallengeActivity(id, challengeId, challengeActivityResource, validateSettings);

        // TODO: test validations
    }
    /**
     * Update an challenge activity template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateChallengeActivityTemplateTest() {
        String id = null;
        TemplateResource challengeActivityTemplateResource = null;
        // TemplateResource response = api.updateChallengeActivityTemplate(id, challengeActivityTemplateResource);

        // TODO: test validations
    }
    /**
     * Update a challenge template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateChallengeTemplateTest() {
        String id = null;
        TemplateResource challengeTemplateResource = null;
        // TemplateResource response = api.updateChallengeTemplate(id, challengeTemplateResource);

        // TODO: test validations
    }
}
