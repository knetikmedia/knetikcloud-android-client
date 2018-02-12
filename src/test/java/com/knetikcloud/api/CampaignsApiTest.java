package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.CampaignResource;
import com.knetikcloud.model.PageResourceCampaignResource;
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
 * API tests for CampaignsApi
 */
public class CampaignsApiTest {

    private CampaignsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CampaignsApi.class);
    }

    /**
     * Add a challenge to a campaign
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CAMPAIGNS_ADMIN
     */
    @Test
    public void addChallengeToCampaignTest() {
        Long id = null;
        Long challengeId = null;
        // Void response = api.addChallengeToCampaign(id, challengeId);

        // TODO: test validations
    }
    /**
     * Create a campaign
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CAMPAIGNS_ADMIN
     */
    @Test
    public void createCampaignTest() {
        CampaignResource campaignResource = null;
        // CampaignResource response = api.createCampaign(campaignResource);

        // TODO: test validations
    }
    /**
     * Create a campaign template
     *
     * Campaign Templates define a type of campaign and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createCampaignTemplateTest() {
        TemplateResource campaignTemplateResource = null;
        // TemplateResource response = api.createCampaignTemplate(campaignTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete a campaign
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CAMPAIGNS_ADMIN
     */
    @Test
    public void deleteCampaignTest() {
        Long id = null;
        // Void response = api.deleteCampaign(id);

        // TODO: test validations
    }
    /**
     * Delete a campaign template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteCampaignTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteCampaignTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Returns a single campaign
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getCampaignTest() {
        Long id = null;
        // CampaignResource response = api.getCampaign(id);

        // TODO: test validations
    }
    /**
     * List the challenges associated with a campaign
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getCampaignChallengesTest() {
        Long id = null;
        String filterStartDate = null;
        String filterEndDate = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceChallengeResource response = api.getCampaignChallenges(id, filterStartDate, filterEndDate, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single campaign template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CAMPAIGNS_ADMIN
     */
    @Test
    public void getCampaignTemplateTest() {
        String id = null;
        // TemplateResource response = api.getCampaignTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search campaign templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CAMPAIGNS_ADMIN
     */
    @Test
    public void getCampaignTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getCampaignTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * List and search campaigns
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getCampaignsTest() {
        Boolean filterActive = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceCampaignResource response = api.getCampaigns(filterActive, size, page, order);

        // TODO: test validations
    }
    /**
     * Remove a challenge from a campaign
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CAMPAIGNS_ADMIN
     */
    @Test
    public void removeChallengeFromCampaignTest() {
        Long campaignId = null;
        Long id = null;
        // Void response = api.removeChallengeFromCampaign(campaignId, id);

        // TODO: test validations
    }
    /**
     * Update a campaign
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CAMPAIGNS_ADMIN
     */
    @Test
    public void updateCampaignTest() {
        Long id = null;
        CampaignResource campaignResource = null;
        // CampaignResource response = api.updateCampaign(id, campaignResource);

        // TODO: test validations
    }
    /**
     * Update an campaign template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateCampaignTemplateTest() {
        String id = null;
        TemplateResource campaignTemplateResource = null;
        // TemplateResource response = api.updateCampaignTemplate(id, campaignTemplateResource);

        // TODO: test validations
    }
}
