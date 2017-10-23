package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.Batch;
import com.knetikcloud.model.BatchResult;
import com.knetikcloud.model.BatchReturn;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilBatchApi
 */
public class UtilBatchApiTest {

    private UtilBatchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UtilBatchApi.class);
    }

    /**
     * Get batch result with token
     *
     * Tokens expire in 24 hours
     */
    @Test
    public void getBatchTest() {
        String token = null;
        // List<BatchReturn> response = api.getBatch(token);

        // TODO: test validations
    }
    /**
     * Request to run API call given the method, content type, path url, and body of request
     *
     * Should the request take longer than one of the alloted timeout parameters, a token will be returned instead, which can be used on the token endpoint in this service
     */
    @Test
    public void sendBatchTest() {
        Batch batch = null;
        // List<BatchReturn> response = api.sendBatch(batch);

        // TODO: test validations
    }
}
