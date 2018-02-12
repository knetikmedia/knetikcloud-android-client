package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.DispositionCount;
import com.knetikcloud.model.DispositionResource;
import com.knetikcloud.model.PageResourceDispositionResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DispositionsApi {
  /**
   * Add a new disposition
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DISPOSITIONS_USER and user, or DISPOSITIONS_ADMIN
   * @param disposition The new disposition record (optional)
   * @return Call&lt;DispositionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("dispositions")
  Call<DispositionResource> addDisposition(
    @retrofit2.http.Body DispositionResource disposition
  );

  /**
   * Delete a disposition
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DISPOSITIONS_USER and owner, or DISPOSITIONS_ADMIN
   * @param id The id of the disposition record (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("dispositions/{id}")
  Call<Void> deleteDisposition(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Returns a disposition
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the disposition record (required)
   * @return Call&lt;DispositionResource&gt;
   */
  @GET("dispositions/{id}")
  Call<DispositionResource> getDisposition(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Returns a list of disposition counts
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterContext Filter for dispositions within a context type (games, articles, polls, etc). Optionally with a specific id like filter_context&#x3D;video:47 (optional)
   * @param filterOwner Filter for dispositions from a specific user by id or &#39;me&#39; (optional)
   * @return Call&lt;List&lt;DispositionCount&gt;&gt;
   */
  @GET("dispositions/count")
  Call<List<DispositionCount>> getDispositionCounts(
    @retrofit2.http.Query("filter_context") String filterContext, @retrofit2.http.Query("filter_owner") String filterOwner
  );

  /**
   * Returns a page of dispositions
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterContext Filter for dispositions within a context type (games, articles, polls, etc). Optionally with a specific id like filter_context&#x3D;video:47 (optional)
   * @param filterOwner Filter for dispositions from a specific user by id or &#39;me&#39; (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceDispositionResource&gt;
   */
  @GET("dispositions")
  Call<PageResourceDispositionResource> getDispositions(
    @retrofit2.http.Query("filter_context") String filterContext, @retrofit2.http.Query("filter_owner") String filterOwner, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

}
