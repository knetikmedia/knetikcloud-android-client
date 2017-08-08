package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.AmazonS3Activity;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class AmazonWebServicesS3Api {
  private ApiClient apiClient;

  public AmazonWebServicesS3Api() {
    this(Configuration.getDefaultApiClient());
  }

  public AmazonWebServicesS3Api(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a signed S3 URL
   * Requires the file name and file content type (i.e., &#39;video/mpeg&#39;)
   * @param filename The file name (optional)
   * @param contentType The content type (optional)
   * @return AmazonS3Activity
   * @throws ApiException if fails to make API call
   */
  public AmazonS3Activity getSignedS3URL(String filename, String contentType) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/amazon/s3/signedposturl".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filename", filename));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "content_type", contentType));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<AmazonS3Activity> localVarReturnType = new GenericType<AmazonS3Activity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
