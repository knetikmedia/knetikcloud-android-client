package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceTopicResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TopicSubscriberResource;
import com.knetikcloud.model.ValueWrapperboolean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MessagingTopicsApi {
  /**
   * Enable or disable messages for a user
   * Useful for opt-out options on a single topic. Consider multiple topics for multiple opt-out options. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
   * @param id The id of the topic (required)
   * @param userId The id of the subscriber or &#39;me&#39; (required)
   * @param disabled disabled (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("messaging/topics/{id}/subscribers/{user_id}/disabled")
  Call<Void> disableTopicSubscriber(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body ValueWrapperboolean disabled
  );

  /**
   * Get a subscriber to a topic
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
   * @param id The id of the topic (required)
   * @param userId The id of the subscriber or &#39;me&#39; (required)
   * @return Call&lt;TopicSubscriberResource&gt;
   */
  @GET("messaging/topics/{id}/subscribers/{user_id}")
  Call<TopicSubscriberResource> getTopicSubscriber(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Get all messaging topics for a given user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN or self
   * @param id The id of the user or &#39;me&#39; (required)
   * @return Call&lt;PageResourceTopicResource&gt;
   */
  @GET("users/{id}/topics")
  Call<PageResourceTopicResource> getUserTopics(
    @retrofit2.http.Path("id") String id
  );

}
