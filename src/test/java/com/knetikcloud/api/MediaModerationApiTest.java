package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.FlagReportResource;
import com.knetikcloud.model.FlagResource;
import com.knetikcloud.model.PageResourceFlagReportResource;
import com.knetikcloud.model.PageResourceFlagResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediaModerationApi
 */
public class MediaModerationApiTest {

    private MediaModerationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MediaModerationApi.class);
    }

    /**
     * Add a flag
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void addFlagTest() {
        FlagResource flagResource = null;
        // FlagResource response = api.addFlag(flagResource);

        // TODO: test validations
    }
    /**
     * Delete a flag
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN or owner
     */
    @Test
    public void deleteFlagTest() {
        String contextName = null;
        String contextId = null;
        Integer userId = null;
        // Void response = api.deleteFlag(contextName, contextId, userId);

        // TODO: test validations
    }
    /**
     * Returns a page of flags
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN or owner
     */
    @Test
    public void getFlagsTest() {
        String filterContext = null;
        String filterContextId = null;
        Integer filterUserId = null;
        Integer size = null;
        Integer page = null;
        // PageResourceFlagResource response = api.getFlags(filterContext, filterContextId, filterUserId, size, page);

        // TODO: test validations
    }
    /**
     * Get a flag report
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
     */
    @Test
    public void getModerationReportTest() {
        Long id = null;
        // FlagReportResource response = api.getModerationReport(id);

        // TODO: test validations
    }
    /**
     * Returns a page of flag reports
     *
     * Context can be either a free-form string or a pre-defined context name. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
     */
    @Test
    public void getModerationReportsTest() {
        Boolean excludeResolved = null;
        String filterContext = null;
        String filterContextId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceFlagReportResource response = api.getModerationReports(excludeResolved, filterContext, filterContextId, size, page, order);

        // TODO: test validations
    }
    /**
     * Update a flag report
     *
     * Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of &#39;banned&#39; you will need to pass the reason. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MODERATION_ADMIN
     */
    @Test
    public void updateModerationReportTest() {
        Long id = null;
        FlagReportResource flagReportResource = null;
        // Void response = api.updateModerationReport(id, flagReportResource);

        // TODO: test validations
    }
}
