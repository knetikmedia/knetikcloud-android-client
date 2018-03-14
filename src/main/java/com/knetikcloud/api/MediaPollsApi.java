package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourcePollResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PollResource;
import com.knetikcloud.model.PollResponseResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MediaPollsApi {
  /**
   * Add your vote to a poll
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; POLLS_ADMIN or POLLS_USER
   * @param id The poll id (required)
   * @param answerKey The answer key (optional)
   * @return Call&lt;PollResponseResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/polls/{id}/response")
  Call<PollResponseResource> answerPoll(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body StringWrapper answerKey
  );

  /**
   * Create a new poll
   * Polls are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POLLS_ADMIN
   * @param pollResource The poll object (optional)
   * @return Call&lt;PollResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/polls")
  Call<PollResource> createPoll(
    @retrofit2.http.Body PollResource pollResource
  );

  /**
   * Create a poll template
   * Poll templates define a type of poll and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param pollTemplateResource The poll template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/polls/templates")
  Call<TemplateResource> createPollTemplate(
    @retrofit2.http.Body TemplateResource pollTemplateResource
  );

  /**
   * Delete an existing poll
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; POLLS_ADMIN
   * @param id The poll id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("media/polls/{id}")
  Call<Void> deletePoll(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Delete a poll template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("media/polls/templates/{id}")
  Call<Void> deletePollTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a single poll
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The poll id (required)
   * @return Call&lt;PollResource&gt;
   */
  @GET("media/polls/{id}")
  Call<PollResource> getPoll(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get poll answer
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; POLLS_ADMIN or POLLS_USER
   * @param id The poll id (required)
   * @return Call&lt;PollResponseResource&gt;
   */
  @GET("media/polls/{id}/response")
  Call<PollResponseResource> getPollAnswer(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a single poll template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or POLLS_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("media/polls/templates/{id}")
  Call<TemplateResource> getPollTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search poll templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or POLLS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("media/polls/templates")
  Call<PageResourceTemplateResource> getPollTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List and search polls
   * Get a list of polls with optional filtering. Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterCategory Filter for polls from a specific category by id (optional)
   * @param filterTagset Filter for polls with specified tags (separated by comma) (optional)
   * @param filterText Filter for polls whose text contains a string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourcePollResource&gt;
   */
  @GET("media/polls")
  Call<PageResourcePollResource> getPolls(
    @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_tagset") String filterTagset, @retrofit2.http.Query("filter_text") String filterText, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update an existing poll
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; POLLS_ADMIN
   * @param id The poll id (required)
   * @param pollResource The poll object (optional)
   * @return Call&lt;PollResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("media/polls/{id}")
  Call<PollResource> updatePoll(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body PollResource pollResource
  );

  /**
   * Update a poll template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param pollTemplateResource The poll template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("media/polls/templates/{id}")
  Call<TemplateResource> updatePollTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource pollTemplateResource
  );

}
