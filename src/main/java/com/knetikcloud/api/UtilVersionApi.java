package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.Result;
import com.knetikcloud.model.Version;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UtilVersionApi {
  /**
   * Get current version info
   * 
   * @return Call&lt;Version&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("version")
  Call<Version> getVersion();
    

}
