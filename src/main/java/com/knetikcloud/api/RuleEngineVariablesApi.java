package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceSimpleReferenceResourceobject;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.VariableTypeResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface RuleEngineVariablesApi {
  /**
   * Get a list of variable types available
   * Types include integer, string, user and invoice. These are used to qualify trigger parameters and action variables with strong typing. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_VARIABLES_USER
   * @return Call&lt;List&lt;VariableTypeResource&gt;&gt;
   */
  @GET("bre/variable-types")
  Call<List<VariableTypeResource>> getBREVariableTypes();
    

  /**
   * List valid values for a type
   * Used to lookup users to fill in a user constant for example. Only types marked as enumerable are suppoorted here. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_VARIABLES_USER
   * @param name The name of the type (required)
   * @param filterName Filter results by those with names starting with this string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceSimpleReferenceResourceobject&gt;
   */
  @GET("bre/variable-types/{name}/values")
  Call<PageResourceSimpleReferenceResourceobject> getBREVariableValues(
    @retrofit2.http.Path("name") String name, @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

}
