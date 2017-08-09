package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceMapstringobject;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SearchReferenceMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SearchApi {
  /**
   * Add a new object to an index
   * Mainly intended for internal use.
   * @param type The index type (required)
   * @param id The ID of the object (required)
   * @param object The object to add (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/index/{type}/{id}")
  Call<Void> addSearchIndex(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id, @retrofit2.http.Body Object object
  );

  /**
   * Register reference mappings
   * Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use.
   * @param mappings The mappings to add (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/mappings")
  Call<Void> addSearchMappings(
    @retrofit2.http.Body List<SearchReferenceMapping> mappings
  );

  /**
   * Delete an object
   * Mainly intended for internal use. Requires SEARCH_ADMIN.
   * @param type The index type (required)
   * @param id The ID of the object to delete (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("search/index/{type}/{id}")
  Call<Void> deleteSearchIndex(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id
  );

  /**
   * Delete all objects in an index
   * Mainly intended for internal use
   * @param type The index type (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("search/index/{type}")
  Call<Void> deleteSearchIndexes(
    @retrofit2.http.Path("type") String type
  );

  /**
   * Search an index
   * The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type. See individual search endpoints on other resources for details on their format.
   * @param type The index type (required)
   * @param query The query to be used for the search (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceMapstringobject&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/index/{type}")
  Call<PageResourceMapstringobject> searchIndex(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Body Object query, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

}
