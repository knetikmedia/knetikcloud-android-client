package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ExpressionResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface BRERuleEngineExpressionsApi {
  /**
   * Lookup a specific expression
   * 
   * @param type Specifiy the type of expression as returned by the listing endpoint (required)
   * @return Call&lt;ExpressionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("bre/expressions/{type}")
  Call<ExpressionResource> getBREExpression(
    @retrofit2.http.Path("type") String type
  );

  /**
   * Get a list of supported expressions to use in conditions or actions.
   * Each resource contains a type and a definition that are read-only, all the other fields must be provided when using the expression in a rule.
   * @param filterTypeGroup Filter for expressions by type group (optional)
   * @return Call&lt;List&lt;ExpressionResource&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("bre/expressions")
  Call<List<ExpressionResource>> getBREExpressions(
    @retrofit2.http.Query("filter_type_group") String filterTypeGroup
  );

  /**
   * Returns the textual representation of an expression
   * 
   * @param expression The expression resource to be converted (optional)
   * @return Call&lt;StringWrapper&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bre/expressions")
  Call<StringWrapper> getExpressionAsText(
    @retrofit2.http.Body ExpressionResource expression
  );

}
