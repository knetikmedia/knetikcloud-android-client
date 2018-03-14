package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.Config;
import com.knetikcloud.model.PageResourceConfig;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ConfigsApi {
  /**
   * Create a new config
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
   * @param config The config object (optional)
   * @return Call&lt;Config&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("configs")
  Call<Config> createConfig(
    @retrofit2.http.Body Config config
  );

  /**
   * Delete an existing config
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
   * @param name The config name (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("configs/{name}")
  Call<Void> deleteConfig(
    @retrofit2.http.Path("name") String name
  );

  /**
   * Get a single config
   * Only configs that are public readable will be shown without admin access. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param name The config name (required)
   * @return Call&lt;Config&gt;
   */
  @GET("configs/{name}")
  Call<Config> getConfig(
    @retrofit2.http.Path("name") String name
  );

  /**
   * List and search configs
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterSearch Filter for configs whose name contains the given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceConfig&gt;
   */
  @GET("configs")
  Call<PageResourceConfig> getConfigs(
    @retrofit2.http.Query("filter_search") String filterSearch, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update an existing config
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CONFIGS_ADMIN
   * @param name The config name (required)
   * @param config The config object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("configs/{name}")
  Call<Void> updateConfig(
    @retrofit2.http.Path("name") String name, @retrofit2.http.Body Config config
  );

}
