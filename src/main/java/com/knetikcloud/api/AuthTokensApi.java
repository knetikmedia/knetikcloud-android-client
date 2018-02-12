package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.OauthAccessTokenResource;
import com.knetikcloud.model.PageResourceOauthAccessTokenResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AuthTokensApi {
  /**
   * Delete tokens by username, client id, or both
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOKENS_ADMIN
   * @param username The username of the user (optional)
   * @param clientId The id of the client (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("auth/tokens")
  Call<Void> deleteTokens(
    @retrofit2.http.Query("username") String username, @retrofit2.http.Query("client_id") String clientId
  );

  /**
   * Get a single token by username and client id
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOKENS_ADMIN
   * @param username The username of the user (required)
   * @param clientId The id of the client (required)
   * @return Call&lt;OauthAccessTokenResource&gt;
   */
  @GET("auth/tokens/{username}/{client_id}")
  Call<OauthAccessTokenResource> getToken(
    @retrofit2.http.Path("username") String username, @retrofit2.http.Path("client_id") String clientId
  );

  /**
   * List usernames and client ids
   * Token value not shown. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TOKENS_ADMIN
   * @param filterClientId Filters for token whose client id matches provided string (optional)
   * @param filterUsername Filters for token whose username matches provided string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceOauthAccessTokenResource&gt;
   */
  @GET("auth/tokens")
  Call<PageResourceOauthAccessTokenResource> getTokens(
    @retrofit2.http.Query("filter_client_id") String filterClientId, @retrofit2.http.Query("filter_username") String filterUsername, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

}
