package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.BreEvent;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RuleEngineEventsApi
 */
public class RuleEngineEventsApiTest {

    private RuleEngineEventsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RuleEngineEventsApi.class);
    }

    /**
     * Fire a new event, based on an existing trigger
     *
     * Parameters within the event must match names and types from the trigger. Actual rule execution is asynchornous.  Returns request id, which will be used as the event id. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EVENTS_USER
     */
    @Test
    public void sendBREEventTest() {
        BreEvent breEvent = null;
        // String response = api.sendBREEvent(breEvent);

        // TODO: test validations
    }
}
