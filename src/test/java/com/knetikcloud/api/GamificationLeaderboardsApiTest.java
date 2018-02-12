package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.LeaderboardEntryResource;
import com.knetikcloud.model.LeaderboardResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationLeaderboardsApi
 */
public class GamificationLeaderboardsApiTest {

    private GamificationLeaderboardsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GamificationLeaderboardsApi.class);
    }

    /**
     * Retrieves leaderboard details and paginated entries
     *
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. Sorting is based on the fields of LeaderboardEntryResource rather than the returned LeaderboardResource. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getLeaderboardTest() {
        String contextType = null;
        String contextId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // LeaderboardResource response = api.getLeaderboard(contextType, contextId, size, page, order);

        // TODO: test validations
    }
    /**
     * Retrieves a specific user entry with rank
     *
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getLeaderboardRankTest() {
        String contextType = null;
        String contextId = null;
        String id = null;
        // LeaderboardEntryResource response = api.getLeaderboardRank(contextType, contextId, id);

        // TODO: test validations
    }
    /**
     * Get a list of available leaderboard strategy names
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getLeaderboardStrategiesTest() {
        // List<String> response = api.getLeaderboardStrategies();

        // TODO: test validations
    }
}
