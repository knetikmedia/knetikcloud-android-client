package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.BreEventLog;
import com.knetikcloud.model.ForwardLog;
import com.knetikcloud.model.PageResourceBreEventLog;
import com.knetikcloud.model.PageResourceForwardLog;
import com.knetikcloud.model.PageResourceUserActionLog;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserActionLog;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogsApi
 */
public class LogsApiTest {

    private LogsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LogsApi.class);
    }

    /**
     * Add a user log entry
     *
     * 
     */
    @Test
    public void addUserLogTest() {
        UserActionLog logEntry = null;
        // Void response = api.addUserLog(logEntry);

        // TODO: test validations
    }
    /**
     * Get an existing BRE event log entry by id
     *
     * 
     */
    @Test
    public void getBREEventLogTest() {
        String id = null;
        // BreEventLog response = api.getBREEventLog(id);

        // TODO: test validations
    }
    /**
     * Returns a list of BRE event log entries
     *
     * 
     */
    @Test
    public void getBREEventLogsTest() {
        String filterStartDate = null;
        String filterEventName = null;
        String filterEventId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceBreEventLog response = api.getBREEventLogs(filterStartDate, filterEventName, filterEventId, size, page, order);

        // TODO: test validations
    }
    /**
     * Get an existing forward log entry by id
     *
     * 
     */
    @Test
    public void getBREForwardLogTest() {
        String id = null;
        // ForwardLog response = api.getBREForwardLog(id);

        // TODO: test validations
    }
    /**
     * Returns a list of forward log entries
     *
     * 
     */
    @Test
    public void getBREForwardLogsTest() {
        String filterStartDate = null;
        String filterEndDate = null;
        Integer filterStatusCode = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceForwardLog response = api.getBREForwardLogs(filterStartDate, filterEndDate, filterStatusCode, size, page, order);

        // TODO: test validations
    }
    /**
     * Returns a user log entry by id
     *
     * 
     */
    @Test
    public void getUserLogTest() {
        String id = null;
        // UserActionLog response = api.getUserLog(id);

        // TODO: test validations
    }
    /**
     * Returns a page of user logs entries
     *
     * 
     */
    @Test
    public void getUserLogsTest() {
        Integer filterUser = null;
        String filterActionName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceUserActionLog response = api.getUserLogs(filterUser, filterActionName, size, page, order);

        // TODO: test validations
    }
}
