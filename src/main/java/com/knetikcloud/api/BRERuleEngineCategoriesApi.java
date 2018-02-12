package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.BreCategoryResource;
import com.knetikcloud.model.PageResourceBreCategoryResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface BRERuleEngineCategoriesApi {
  /**
   * Create a BRE category template
   * Templates define a type of BRE category and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param template The category template to create (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bre/categories/templates")
  Call<TemplateResource> createBRECategoryTemplate(
    @retrofit2.http.Body TemplateResource template
  );

  /**
   * Delete a BRE category template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("bre/categories/templates/{id}")
  Call<Void> deleteBRECategoryTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * List categories
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_CATEGORIES_USER
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceBreCategoryResource&gt;
   */
  @GET("bre/categories")
  Call<PageResourceBreCategoryResource> getBRECategories(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Get a single category
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_CATEGORIES_USER
   * @param name The category name (required)
   * @return Call&lt;BreCategoryResource&gt;
   */
  @GET("bre/categories/{name}")
  Call<BreCategoryResource> getBRECategory(
    @retrofit2.http.Path("name") String name
  );

  /**
   * Get a single BRE category template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or BRE_RULE_ENGINE_CATEGORIES_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("bre/categories/templates/{id}")
  Call<TemplateResource> getBRECategoryTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search BRE category templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or BRE_RULE_ENGINE_CATEGORIES_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("bre/categories/templates")
  Call<PageResourceTemplateResource> getBRECategoryTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a category
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_CATEGORIES_ADMIN
   * @param name The category name (required)
   * @param category The updated BRE category information (optional)
   * @return Call&lt;BreCategoryResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("bre/categories/{name}")
  Call<BreCategoryResource> updateBRECategory(
    @retrofit2.http.Path("name") String name, @retrofit2.http.Body BreCategoryResource category
  );

  /**
   * Update a BRE category template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param template The updated category template definition (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("bre/categories/templates/{id}")
  Call<TemplateResource> updateBRECategoryTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource template
  );

}
