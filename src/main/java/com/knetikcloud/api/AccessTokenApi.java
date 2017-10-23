package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.OAuth2Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AccessTokenApi {
  /**
   * Get access token
   * 
   * @param grantType Grant type (required)
   * @param clientId The id of the client (required)
   * @param clientSecret The secret key of the client.  Used only with a grant_type of client_credentials (optional)
   * @param username The username of the client. Used only with a grant_type of password (optional)
   * @param password The password of the client. Used only with a grant_type of password (optional)
   * @param token The 3rd party authentication token. Used only with a grant_type of facebook, google, etc (social plugins) (optional)
   * @param refreshToken The refresh token obtained during prior authentication. Used only with a grant_type of refresh_token (optional)
   * @return Call&lt;OAuth2Resource&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("oauth/token")
  Call<OAuth2Resource> getOAuthToken(
    @retrofit2.http.Field("grant_type") String grantType, @retrofit2.http.Field("client_id") String clientId, @retrofit2.http.Field("client_secret") String clientSecret, @retrofit2.http.Field("username") String username, @retrofit2.http.Field("password") String password, @retrofit2.http.Field("token") String token, @retrofit2.http.Field("refresh_token") String refreshToken
  );

}
