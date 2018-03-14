package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.MessageResource;
import com.knetikcloud.model.MessageTemplateBulkRequest;
import com.knetikcloud.model.MessageTemplateResource;
import com.knetikcloud.model.PageResourceMessageTemplateResource;
import com.knetikcloud.model.RawEmailResource;
import com.knetikcloud.model.RawPushResource;
import com.knetikcloud.model.RawSMSResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateEmailResource;
import com.knetikcloud.model.TemplatePushResource;
import com.knetikcloud.model.TemplateSMSResource;
import com.knetikcloud.model.WebsocketMessageResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MessagingApi {
  /**
   * Compile a message template
   * Processes a set of input data against the template and returnes the compiled result. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
   * @param request request (optional)
   * @return Call&lt;Map&lt;String, String&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("messaging/templates/compilations")
  Call<Map<String, String>> compileMessageTemplate(
    @retrofit2.http.Body MessageTemplateBulkRequest request
  );

  /**
   * Create a message template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
   * @param messageTemplate The new template email to be sent (optional)
   * @return Call&lt;MessageTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("messaging/templates")
  Call<MessageTemplateResource> createMessageTemplate(
    @retrofit2.http.Body MessageTemplateResource messageTemplate
  );

  /**
   * Delete an existing message template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
   * @param id The message_template id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("messaging/templates/{id}")
  Call<Void> deleteMessageTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a single message template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
   * @param id The message_template id (required)
   * @return Call&lt;MessageTemplateResource&gt;
   */
  @GET("messaging/templates/{id}")
  Call<MessageTemplateResource> getMessageTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search message templates
   * Get a list of message templates with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
   * @param filterTagset Filter for message templates with at least one of a specified set of tags (separated by comma) (optional)
   * @param filterTagIntersection Filter for message templates with all of a specified set of tags (separated by comma) (optional)
   * @param filterTagExclusion Filter for message templates with none of a specified set of tags (separated by comma) (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceMessageTemplateResource&gt;
   */
  @GET("messaging/templates")
  Call<PageResourceMessageTemplateResource> getMessageTemplates(
    @retrofit2.http.Query("filter_tagset") String filterTagset, @retrofit2.http.Query("filter_tag_intersection") String filterTagIntersection, @retrofit2.http.Query("filter_tag_exclusion") String filterTagExclusion, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Send a message
   * Sends a message with one or more formats to one or more users. Fill in any message formats desired (email, sms, websockets) and each user will recieve all valid formats. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
   * @param messageResource The message to be sent (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("messaging/message")
  Call<Void> sendMessage(
    @retrofit2.http.Body MessageResource messageResource
  );

  /**
   * Send a raw email to one or more users
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
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
   * Sends a raw push notification message to one or more users. User&#39;s without registered mobile device for the application will be skipped. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
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
   * Sends a raw SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
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
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
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
   * Sends a templated push notification message to one or more users. User&#39;s without registered mobile device for the application will be skipped. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
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
   * Sends a templated SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
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

  /**
   * Send a websocket message
   * Sends a websocket message to one or more users. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
   * @param websocketResource The new websocket message to be sent (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("messaging/websocket-message")
  Call<Void> sendWebsocket(
    @retrofit2.http.Body WebsocketMessageResource websocketResource
  );

  /**
   * Update an existing message template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
   * @param id The message_template id (required)
   * @param messageTemplateResource The message template (optional)
   * @return Call&lt;MessageTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("messaging/templates/{id}")
  Call<MessageTemplateResource> updateMessageTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body MessageTemplateResource messageTemplateResource
  );

}
