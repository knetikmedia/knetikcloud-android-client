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
   * Get a temporary signed S3 URL for download
   * To give access to files in your own S3 account, you will need to grant KnetikcCloud access to the file by adjusting your bucket policy accordingly. See S3 documentation for details. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; S3_ADMIN
   * @param bucket S3 bucket name (optional)
   * @param path The path to the file relative to the bucket (the s3 object key) (optional)
   * @param expiration The number of seconds this URL will be valid. Default to 60 (optional, default to 60)
   * @return Call&lt;String&gt;
   */
  @GET("amazon/s3/downloadurl")
  Call<String> getDownloadURL(
    @retrofit2.http.Query("bucket") String bucket, @retrofit2.http.Query("path") String path, @retrofit2.http.Query("expiration") Integer expiration
  );

  /**
   * Get a signed S3 URL for upload
   * Requires the file name and file content type (i.e., &#39;video/mpeg&#39;). Make a PUT to the resulting url to upload the file and use the cdn_url to retrieve it after. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; S3_USER or S3_ADMIN
   * @param filename The file name (optional)
   * @param contentType The content type (optional)
   * @return Call&lt;AmazonS3Activity&gt;
   */
  @GET("amazon/s3/signedposturl")
  Call<AmazonS3Activity> getSignedS3URL(
    @retrofit2.http.Query("filename") String filename, @retrofit2.http.Query("content_type") String contentType
  );

}
