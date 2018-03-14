package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ArticleResource;
import com.knetikcloud.model.BasicTemplatedResource;
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
     * Articles are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end.&lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; ARTICLES_ADMIN
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
     * Article Templates define a type of article and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createArticleTemplateTest() {
        TemplateResource articleTemplateResource = null;
        // TemplateResource response = api.createArticleTemplate(articleTemplateResource);

        // TODO: test validations
    }
    /**
     * Create a template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN
     */
    @Test
    public void createTemplateTest() {
        String typeHint = null;
        TemplateResource template = null;
        // TemplateResource response = api.createTemplate(typeHint, template);

        // TODO: test validations
    }
    /**
     * Delete an existing article
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ARTICLES_ADMIN
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
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteArticleTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteArticleTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Delete a template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN
     */
    @Test
    public void deleteTemplateTest() {
        String typeHint = null;
        String id = null;
        String cascade = null;
        // Void response = api.deleteTemplate(typeHint, id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single article
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
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
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ARTICLES_ADMIN
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
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ARTICLES_ADMIN
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
     * Get a list of articles with optional filtering. Assets will not be filled in on the resources returned. Use &#39;Get a single article&#39; to retrieve the full resource with assets for a given item as needed. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
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
     * Get a template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN
     */
    @Test
    public void getTemplateTest() {
        String typeHint = null;
        String id = null;
        // TemplateResource response = api.getTemplate(typeHint, id);

        // TODO: test validations
    }
    /**
     * List and search templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN
     */
    @Test
    public void getTemplatesTest() {
        String typeHint = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getTemplates(typeHint, size, page, order);

        // TODO: test validations
    }
    /**
     * Update an existing article
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ARTICLES_ADMIN
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
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateArticleTemplateTest() {
        String id = null;
        TemplateResource articleTemplateResource = null;
        // TemplateResource response = api.updateArticleTemplate(id, articleTemplateResource);

        // TODO: test validations
    }
    /**
     * Update a template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN
     */
    @Test
    public void updateTemplateTest() {
        String typeHint = null;
        String id = null;
        TemplateResource template = null;
        // TemplateResource response = api.updateTemplate(typeHint, id, template);

        // TODO: test validations
    }
    /**
     * Validate a templated resource
     *
     * Error code thrown if invalid.&lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN
     */
    @Test
    public void validateTest() {
        String typeHint = null;
        BasicTemplatedResource resource = null;
        // Void response = api.validate(typeHint, resource);

        // TODO: test validations
    }
}
