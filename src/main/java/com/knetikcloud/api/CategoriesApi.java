package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.CategoryResource;
import com.knetikcloud.model.PageResourceCategoryResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourcestring;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CategoriesApi {
  /**
   * Create a new category
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CATEGORIES_ADMIN
   * @param category The category to create (optional)
   * @return Call&lt;CategoryResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("categories")
  Call<CategoryResource> createCategory(
    @retrofit2.http.Body CategoryResource category
  );

  /**
   * Create a category template
   * Templates define a type of category and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param template The template to create (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("categories/templates")
  Call<TemplateResource> createCategoryTemplate(
    @retrofit2.http.Body TemplateResource template
  );

  /**
   * Delete an existing category
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CATEGORIES_ADMIN
   * @param id The id of the category to be deleted (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("categories/{id}")
  Call<Void> deleteCategory(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Delete a category template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("categories/templates/{id}")
  Call<Void> deleteCategoryTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * List and search categories with optional filters
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterSearch Filter for categories whose names begin with provided string (optional)
   * @param filterActive Filter for categories that are specifically active or inactive (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceCategoryResource&gt;
   */
  @GET("categories")
  Call<PageResourceCategoryResource> getCategories(
    @retrofit2.http.Query("filter_search") String filterSearch, @retrofit2.http.Query("filter_active") Boolean filterActive, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single category
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the category to retrieve (required)
   * @return Call&lt;CategoryResource&gt;
   */
  @GET("categories/{id}")
  Call<CategoryResource> getCategory(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a single category template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CATEGORIES_ADMIN
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("categories/templates/{id}")
  Call<TemplateResource> getCategoryTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search category templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CATEGORIES_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("categories/templates")
  Call<PageResourceTemplateResource> getCategoryTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List all trivia tags in the system
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourcestring&gt;
   */
  @GET("tags")
  Call<PageResourcestring> getTags(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Update an existing category
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CATEGORIES_ADMIN
   * @param id The id of the category (required)
   * @param category The category to update (optional)
   * @return Call&lt;CategoryResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("categories/{id}")
  Call<CategoryResource> updateCategory(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body CategoryResource category
  );

  /**
   * Update a category template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param template The updated template information (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("categories/templates/{id}")
  Call<TemplateResource> updateCategoryTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource template
  );

}
