package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceRewardSetResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.RewardSetResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CampaignsRewardsApi
 */
public class CampaignsRewardsApiTest {

    private CampaignsRewardsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CampaignsRewardsApi.class);
    }

    /**
     * Create a reward set
     *
     * 
     */
    @Test
    public void createRewardSetTest() {
        RewardSetResource rewardSetResource = null;
        // RewardSetResource response = api.createRewardSet(rewardSetResource);

        // TODO: test validations
    }
    /**
     * Delete a reward set
     *
     * 
     */
    @Test
    public void deleteRewardSetTest() {
        Integer id = null;
        // Void response = api.deleteRewardSet(id);

        // TODO: test validations
    }
    /**
     * Get a single reward set
     *
     * 
     */
    @Test
    public void getRewardSetTest() {
        Integer id = null;
        // RewardSetResource response = api.getRewardSet(id);

        // TODO: test validations
    }
    /**
     * List and search reward sets
     *
     * 
     */
    @Test
    public void getRewardSetsTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceRewardSetResource response = api.getRewardSets(size, page, order);

        // TODO: test validations
    }
    /**
     * Update a reward set
     *
     * 
     */
    @Test
    public void updateRewardSetTest() {
        Integer id = null;
        RewardSetResource rewardSetResource = null;
        // RewardSetResource response = api.updateRewardSet(id, rewardSetResource);

        // TODO: test validations
    }
}
