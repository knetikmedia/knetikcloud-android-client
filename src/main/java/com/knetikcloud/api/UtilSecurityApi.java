package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceLocationLogResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TokenDetailsResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UtilSecurityApi {
  /**
   * Returns the authentication log for a user
   * A log entry is recorded everytime a user requests a new token. Standard pagination available. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SECURITY_ADMIN
   * @param userId The user id (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceLocationLogResource&gt;
   */
  @GET("security/country-log")
  Call<PageResourceLocationLogResource> getUserLocationLog(
    @retrofit2.http.Query("user_id") Integer userId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Returns the authentication token details. Use /users endpoint for detailed user&#39;s info
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SECURITY_ADMIN
   * @return Call&lt;TokenDetailsResource&gt;
   */
  @GET("me")
  Call<TokenDetailsResource> getUserTokenDetails();
    

}
