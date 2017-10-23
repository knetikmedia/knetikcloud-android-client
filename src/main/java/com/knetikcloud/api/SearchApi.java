package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceMapstringobject;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SearchApi {
  /**
   * Search an index
   * The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type but mostly matches the resource from it&#39;s main endpoint. Exceptions include referenced objects (like user) being replaced with the full user resource to allow deeper searching.
   * @param type The index type (required)
   * @param query The query to be used for the search (optional)
   * @param size The number of documents returned per page (optional, default to 25)
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
