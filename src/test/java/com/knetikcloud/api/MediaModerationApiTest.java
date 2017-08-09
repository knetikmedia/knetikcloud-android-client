package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.FlagReportResource;
import com.knetikcloud.model.PageResourceFlagReportResource;
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
     * Get a flag report
     *
     * 
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
     * Context can be either a free-form string or a pre-defined context name
     */
    @Test
    public void getModerationReportsTest() {
        Boolean excludeResolved = null;
        String filterContext = null;
        Integer size = null;
        Integer page = null;
        // PageResourceFlagReportResource response = api.getModerationReports(excludeResolved, filterContext, size, page);

        // TODO: test validations
    }
    /**
     * Update a flag report
     *
     * Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of &#39;banned&#39; you will need to pass the reason.
     */
    @Test
    public void updateModerationReportTest() {
        Long id = null;
        FlagReportResource flagReportResource = null;
        // Void response = api.updateModerationReport(id, flagReportResource);

        // TODO: test validations
    }
}
