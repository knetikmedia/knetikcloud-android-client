package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.Batch;
import com.knetikcloud.model.BatchResult;
import com.knetikcloud.model.BatchReturn;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UtilBatchApi {
  /**
   * Get batch result with token
   * Tokens expire in 24 hours
   * @param token token (required)
   * @return Call&lt;List&lt;BatchReturn&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("batch/{token}")
  Call<List<BatchReturn>> getBatch(
    @retrofit2.http.Path("token") String token
  );

  /**
   * Request to run API call given the method, content type, path url, and body of request
   * Should the request take longer than one of the alloted timeout parameters, a token will be returned instead, which can be used on the token endpoint in this service
   * @param batch The batch object (optional)
   * @return Call&lt;List&lt;BatchReturn&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("batch")
  Call<List<BatchReturn>> sendBatch(
    @retrofit2.http.Body Batch batch
  );

}
