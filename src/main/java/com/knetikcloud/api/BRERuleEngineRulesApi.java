package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.BooleanResource;
import com.knetikcloud.model.BreRule;
import com.knetikcloud.model.Expressionobject;
import com.knetikcloud.model.PageResourceBreRule;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface BRERuleEngineRulesApi {
  /**
   * Create a rule
   * Rules define which actions to run when a given event verifies the specified condition. Full list of predicates and other type of expressions can be found at GET /bre/expressions/
   * @param breRule The BRE rule object (optional)
   * @return Call&lt;BreRule&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bre/rules")
  Call<BreRule> createBRERule(
    @retrofit2.http.Body BreRule breRule
  );

  /**
   * Delete a rule
   * May fail if there are existing rules against it. Cannot delete core rules
   * @param id The id of the rule (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("bre/rules/{id}")
  Call<Void> deleteBRERule(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Returns a string representation of the provided expression
   * 
   * @param expression The expression (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bre/rules/expression-as-string")
  Call<String> getBREExpressionAsString(
    @retrofit2.http.Body Expressionobject expression
  );

  /**
   * Get a single rule
   * 
   * @param id The id of the rule (required)
   * @return Call&lt;BreRule&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("bre/rules/{id}")
  Call<BreRule> getBRERule(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List rules
   * 
   * @param filterName Filter for rules containing the given name (optional)
   * @param filterEnabled Filter for rules by active status, null for both (optional, default to null)
   * @param filterSystem Filter for rules that are system rules when true, or not when false. Leave off for both mixed (optional)
   * @param filterTrigger Filter for rules that are for the trigger with the given name (optional)
   * @param filterAction Filter for rules that use the action with the given name (optional)
   * @param filterCondition Filter for rules that have a condition containing the given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceBreRule&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("bre/rules")
  Call<PageResourceBreRule> getBRERules(
    @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("filter_enabled") Boolean filterEnabled, @retrofit2.http.Query("filter_system") Boolean filterSystem, @retrofit2.http.Query("filter_trigger") String filterTrigger, @retrofit2.http.Query("filter_action") String filterAction, @retrofit2.http.Query("filter_condition") String filterCondition, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Enable or disable a rule
   * This is helpful for turning off systems rules which cannot be deleted or modified otherwise
   * @param id The id of the rule (required)
   * @param enabled The boolean value (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("bre/rules/{id}/enabled")
  Call<Void> setBRERule(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body BooleanResource enabled
  );

  /**
   * Update a rule
   * Cannot update system rules
   * @param id The id of the rule (required)
   * @param breRule The BRE rule object (optional)
   * @return Call&lt;BreRule&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("bre/rules/{id}")
  Call<BreRule> updateBRERule(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body BreRule breRule
  );

}
