package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.AmazonS3Activity;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AmazonWebServicesS3Api
 */
public class AmazonWebServicesS3ApiTest {

    private AmazonWebServicesS3Api api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AmazonWebServicesS3Api.class);
    }

    /**
     * Get a signed S3 URL
     *
     * Requires the file name and file content type (i.e., &#39;video/mpeg&#39;)
     */
    @Test
    public void getSignedS3URLTest() {
        String filename = null;
        String contentType = null;
        // AmazonS3Activity response = api.getSignedS3URL(filename, contentType);

        // TODO: test validations
    }
}
