package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.LookupTypeResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface BRERuleEngineExpressionsApi {
  /**
   * Get a list of &#39;lookup&#39; type expressions
   * These are expression types that take a second expression as input and produce a value. These can be used in addition to the standard types, like parameter, global and constant (see BRE documentation for details).
   * @return Call&lt;List&lt;LookupTypeResource&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("bre/expressions/lookup")
  Call<List<LookupTypeResource>> getBREExpressions();
    

}
