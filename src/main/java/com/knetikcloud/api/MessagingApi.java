package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.RawEmailResource;
import com.knetikcloud.model.RawPushResource;
import com.knetikcloud.model.RawSMSResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateEmailResource;
import com.knetikcloud.model.TemplatePushResource;
import com.knetikcloud.model.TemplateSMSResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MessagingApi {
  /**
   * Send a raw email to one or more users
   * 
   * @param rawEmailResource The new raw email to be sent (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("messaging/raw-email")
  Call<Void> sendRawEmail(
    @retrofit2.http.Body RawEmailResource rawEmailResource
  );

  /**
   * Send a raw push notification
   * Sends a raw push notification message to one or more users. User&#39;s without registered mobile device for the application will be skipped.
   * @param rawPushResource The new raw push notification to be sent (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("messaging/raw-push")
  Call<Void> sendRawPush(
    @retrofit2.http.Body RawPushResource rawPushResource
  );

  /**
   * Send a raw SMS
   * Sends a raw SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
   * @param rawSMSResource The new raw SMS to be sent (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("messaging/raw-sms")
  Call<Void> sendRawSMS(
    @retrofit2.http.Body RawSMSResource rawSMSResource
  );

  /**
   * Send a templated email to one or more users
   * 
   * @param messageResource The new template email to be sent (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("messaging/templated-email")
  Call<Void> sendTemplatedEmail(
    @retrofit2.http.Body TemplateEmailResource messageResource
  );

  /**
   * Send a templated push notification
   * Sends a templated push notification message to one or more users. User&#39;s without registered mobile device for the application will be skipped.
   * @param templatePushResource The new templated push notification to be sent (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("messaging/templated-push")
  Call<Void> sendTemplatedPush(
    @retrofit2.http.Body TemplatePushResource templatePushResource
  );

  /**
   * Send a new templated SMS
   * Sends a templated SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
   * @param templateSMSResource The new template SMS to be sent (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("messaging/templated-sms")
  Call<Void> sendTemplatedSMS(
    @retrofit2.http.Body TemplateSMSResource templateSMSResource
  );

}
