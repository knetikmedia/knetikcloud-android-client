package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.AmazonS3Activity;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AmazonWebServicesS3Api {
  /**
   * Get a signed S3 URL
   * Requires the file name and file content type (i.e., &#39;video/mpeg&#39;)
   * @param filename The file name (optional)
   * @param contentType The content type (optional)
   * @return Call&lt;AmazonS3Activity&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("amazon/s3/signedposturl")
  Call<AmazonS3Activity> getSignedS3URL(
    @retrofit2.http.Query("filename") String filename, @retrofit2.http.Query("content_type") String contentType
  );

}
