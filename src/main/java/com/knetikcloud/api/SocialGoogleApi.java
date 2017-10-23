package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.GoogleToken;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SocialGoogleApi {
  /**
   * Link google account
   * Links the current user account to a google account, using the acccess token from google. Can also be used to update the access token after it has expired.
   * @param googleToken The token from google (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("social/google/users")
  Call<Void> linkAccounts1(
    @retrofit2.http.Body GoogleToken googleToken
  );

}
