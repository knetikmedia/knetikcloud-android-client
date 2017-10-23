package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ArticleResource;
import com.knetikcloud.model.PageResourceArticleResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ContentArticlesApi {
  /**
   * Create a new article
   * Articles are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end.
   * @param articleResource The new article (optional)
   * @return Call&lt;ArticleResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("content/articles")
  Call<ArticleResource> createArticle(
    @retrofit2.http.Body ArticleResource articleResource
  );

  /**
   * Create an article template
   * Article Templates define a type of article and the properties they have
   * @param articleTemplateResource The article template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("content/articles/templates")
  Call<TemplateResource> createArticleTemplate(
    @retrofit2.http.Body TemplateResource articleTemplateResource
  );

  /**
   * Delete an existing article
   * 
   * @param id The article id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("content/articles/{id}")
  Call<Void> deleteArticle(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Delete an article template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("content/articles/templates/{id}")
  Call<Void> deleteArticleTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a single article
   * 
   * @param id The article id (required)
   * @return Call&lt;ArticleResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("content/articles/{id}")
  Call<ArticleResource> getArticle(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a single article template
   * 
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("content/articles/templates/{id}")
  Call<TemplateResource> getArticleTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search article templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("content/articles/templates")
  Call<PageResourceTemplateResource> getArticleTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List and search articles
   * Get a list of articles with optional filtering. Assets will not be filled in on the resources returned. Use &#39;Get a single article&#39; to retrieve the full resource with assets for a given item as needed.
   * @param filterActiveOnly Filter for articles that are active (true) or inactive (false) (optional)
   * @param filterCategory Filter for articles from a specific category by id (optional)
   * @param filterTagset Filter for articles with at least one of a specified set of tags (separated by comma) (optional)
   * @param filterTagIntersection Filter for articles with all of a specified set of tags (separated by comma) (optional)
   * @param filterTagExclusion Filter for articles with none of a specified set of tags (separated by comma) (optional)
   * @param filterTitle Filter for articles whose title contains a string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceArticleResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("content/articles")
  Call<PageResourceArticleResource> getArticles(
    @retrofit2.http.Query("filter_active_only") Boolean filterActiveOnly, @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_tagset") String filterTagset, @retrofit2.http.Query("filter_tag_intersection") String filterTagIntersection, @retrofit2.http.Query("filter_tag_exclusion") String filterTagExclusion, @retrofit2.http.Query("filter_title") String filterTitle, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update an existing article
   * 
   * @param id The article id (required)
   * @param articleResource The article object (optional)
   * @return Call&lt;ArticleResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("content/articles/{id}")
  Call<ArticleResource> updateArticle(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body ArticleResource articleResource
  );

  /**
   * Update an article template
   * 
   * @param id The id of the template (required)
   * @param articleTemplateResource The article template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("content/articles/templates/{id}")
  Call<TemplateResource> updateArticleTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource articleTemplateResource
  );

}
