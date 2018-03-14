package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourcePollResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PollResource;
import com.knetikcloud.model.PollResponseResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediaPollsApi
 */
public class MediaPollsApiTest {

    private MediaPollsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MediaPollsApi.class);
    }

    /**
     * Add your vote to a poll
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; POLLS_ADMIN or POLLS_USER
     */
    @Test
    public void answerPollTest() {
        String id = null;
        StringWrapper answerKey = null;
        // PollResponseResource response = api.answerPoll(id, answerKey);

        // TODO: test validations
    }
    /**
     * Create a new poll
     *
     * Polls are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POLLS_ADMIN
     */
    @Test
    public void createPollTest() {
        PollResource pollResource = null;
        // PollResource response = api.createPoll(pollResource);

        // TODO: test validations
    }
    /**
     * Create a poll template
     *
     * Poll templates define a type of poll and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createPollTemplateTest() {
        TemplateResource pollTemplateResource = null;
        // TemplateResource response = api.createPollTemplate(pollTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete an existing poll
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; POLLS_ADMIN
     */
    @Test
    public void deletePollTest() {
        String id = null;
        // Void response = api.deletePoll(id);

        // TODO: test validations
    }
    /**
     * Delete a poll template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deletePollTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deletePollTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single poll
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getPollTest() {
        String id = null;
        // PollResource response = api.getPoll(id);

        // TODO: test validations
    }
    /**
     * Get poll answer
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; POLLS_ADMIN or POLLS_USER
     */
    @Test
    public void getPollAnswerTest() {
        String id = null;
        // PollResponseResource response = api.getPollAnswer(id);

        // TODO: test validations
    }
    /**
     * Get a single poll template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or POLLS_ADMIN
     */
    @Test
    public void getPollTemplateTest() {
        String id = null;
        // TemplateResource response = api.getPollTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search poll templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or POLLS_ADMIN
     */
    @Test
    public void getPollTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getPollTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * List and search polls
     *
     * Get a list of polls with optional filtering. Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getPollsTest() {
        String filterCategory = null;
        String filterTagset = null;
        String filterText = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourcePollResource response = api.getPolls(filterCategory, filterTagset, filterText, size, page, order);

        // TODO: test validations
    }
    /**
     * Update an existing poll
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; POLLS_ADMIN
     */
    @Test
    public void updatePollTest() {
        String id = null;
        PollResource pollResource = null;
        // PollResource response = api.updatePoll(id, pollResource);

        // TODO: test validations
    }
    /**
     * Update a poll template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updatePollTemplateTest() {
        String id = null;
        TemplateResource pollTemplateResource = null;
        // TemplateResource response = api.updatePollTemplate(id, pollTemplateResource);

        // TODO: test validations
    }
}
