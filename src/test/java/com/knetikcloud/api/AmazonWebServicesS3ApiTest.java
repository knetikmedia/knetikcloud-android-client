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
     * Get a temporary signed S3 URL for download
     *
     * To give access to files in your own S3 account, you will need to grant KnetikcCloud access to the file by adjusting your bucket policy accordingly. See S3 documentation for details.
     */
    @Test
    public void getDownloadURLTest() {
        String bucket = null;
        String path = null;
        Integer expiration = null;
        // String response = api.getDownloadURL(bucket, path, expiration);

        // TODO: test validations
    }
    /**
     * Get a signed S3 URL for upload
     *
     * Requires the file name and file content type (i.e., &#39;video/mpeg&#39;). Make a PUT to the resulting url to upload the file and use the cdn_url to retrieve it after.
     */
    @Test
    public void getSignedS3URLTest() {
        String filename = null;
        String contentType = null;
        // AmazonS3Activity response = api.getSignedS3URL(filename, contentType);

        // TODO: test validations
    }
}
