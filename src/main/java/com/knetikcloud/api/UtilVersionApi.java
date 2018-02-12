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
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @return Call&lt;Version&gt;
   */
  @GET("version")
  Call<Version> getVersion();
    

}
