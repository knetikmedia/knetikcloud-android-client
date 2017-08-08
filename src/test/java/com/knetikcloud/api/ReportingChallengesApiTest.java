package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceChallengeEventParticipantResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingChallengesApi
 */
public class ReportingChallengesApiTest {

    private ReportingChallengesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReportingChallengesApi.class);
    }

    /**
     * Retrieve a challenge event leaderboard details
     *
     * Lists all leaderboard entries with additional user details
     */
    @Test
    public void getChallengeEventLeaderboardTest() {
        Long filterEvent = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceChallengeEventParticipantResource response = api.getChallengeEventLeaderboard(filterEvent, size, page, order);

        // TODO: test validations
    }
    /**
     * Retrieve a challenge event participant details
     *
     * Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation
     */
    @Test
    public void getChallengeEventParticipantsTest() {
        Long filterEvent = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceChallengeEventParticipantResource response = api.getChallengeEventParticipants(filterEvent, size, page, order);

        // TODO: test validations
    }
}
