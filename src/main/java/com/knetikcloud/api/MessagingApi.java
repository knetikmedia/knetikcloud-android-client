package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.RawEmailResource;
import com.knetikcloud.model.RawSMSResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateEmailResource;
import com.knetikcloud.model.TemplateSMSResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class MessagingApi {
  private ApiClient apiClient;

  public MessagingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Send a raw email to one or more users
   * 
   * @param rawEmailResource The new raw email to be sent (optional)
   * @throws ApiException if fails to make API call
   */
  public void sendRawEmail(RawEmailResource rawEmailResource) throws ApiException {
    Object localVarPostBody = rawEmailResource;
    
    // create path and map variables
    String localVarPath = "/messaging/raw-email".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Send a raw SMS
   * Sends a raw SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
   * @param rawSMSResource The new raw SMS to be sent (optional)
   * @throws ApiException if fails to make API call
   */
  public void sendRawSMS(RawSMSResource rawSMSResource) throws ApiException {
    Object localVarPostBody = rawSMSResource;
    
    // create path and map variables
    String localVarPath = "/messaging/raw-sms".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Send a templated email to one or more users
   * 
   * @param messageResource The new template email to be sent (optional)
   * @throws ApiException if fails to make API call
   */
  public void sendTemplatedEmail(TemplateEmailResource messageResource) throws ApiException {
    Object localVarPostBody = messageResource;
    
    // create path and map variables
    String localVarPath = "/messaging/templated-email".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Send a new templated SMS
   * Sends a templated SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
   * @param templateSMSResource The new template SMS to be sent (optional)
   * @throws ApiException if fails to make API call
   */
  public void sendTemplatedSMS(TemplateSMSResource templateSMSResource) throws ApiException {
    Object localVarPostBody = templateSMSResource;
    
    // create path and map variables
    String localVarPath = "/messaging/templated-sms".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
