package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ArticleResource;
import com.knetikcloud.model.PageResourceArticleResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContentArticlesApi
 */
public class ContentArticlesApiTest {

    private ContentArticlesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ContentArticlesApi.class);
    }

    /**
     * Create a new article
     *
     * Articles are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end.
     */
    @Test
    public void createArticleTest() {
        ArticleResource articleResource = null;
        // ArticleResource response = api.createArticle(articleResource);

        // TODO: test validations
    }
    /**
     * Create an article template
     *
     * Article Templates define a type of article and the properties they have
     */
    @Test
    public void createArticleTemplateTest() {
        TemplateResource articleTemplateResource = null;
        // TemplateResource response = api.createArticleTemplate(articleTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete an existing article
     *
     * 
     */
    @Test
    public void deleteArticleTest() {
        String id = null;
        // Void response = api.deleteArticle(id);

        // TODO: test validations
    }
    /**
     * Delete an article template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     */
    @Test
    public void deleteArticleTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteArticleTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single article
     *
     * 
     */
    @Test
    public void getArticleTest() {
        String id = null;
        // ArticleResource response = api.getArticle(id);

        // TODO: test validations
    }
    /**
     * Get a single article template
     *
     * 
     */
    @Test
    public void getArticleTemplateTest() {
        String id = null;
        // TemplateResource response = api.getArticleTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search article templates
     *
     * 
     */
    @Test
    public void getArticleTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getArticleTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * List and search articles
     *
     * Get a list of articles with optional filtering. Assets will not be filled in on the resources returned. Use &#39;Get a single article&#39; to retrieve the full resource with assets for a given item as needed.
     */
    @Test
    public void getArticlesTest() {
        Boolean filterActiveOnly = null;
        String filterCategory = null;
        String filterTagset = null;
        String filterTagIntersection = null;
        String filterTagExclusion = null;
        String filterTitle = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceArticleResource response = api.getArticles(filterActiveOnly, filterCategory, filterTagset, filterTagIntersection, filterTagExclusion, filterTitle, size, page, order);

        // TODO: test validations
    }
    /**
     * Update an existing article
     *
     * 
     */
    @Test
    public void updateArticleTest() {
        String id = null;
        ArticleResource articleResource = null;
        // ArticleResource response = api.updateArticle(id, articleResource);

        // TODO: test validations
    }
    /**
     * Update an article template
     *
     * 
     */
    @Test
    public void updateArticleTemplateTest() {
        String id = null;
        TemplateResource articleTemplateResource = null;
        // TemplateResource response = api.updateArticleTemplate(id, articleTemplateResource);

        // TODO: test validations
    }
}
