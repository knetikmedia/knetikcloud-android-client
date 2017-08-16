package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.CategoryResource;
import com.knetikcloud.model.PageResourceCategoryResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourcestring;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoriesApi
 */
public class CategoriesApiTest {

    private CategoriesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CategoriesApi.class);
    }

    /**
     * Create a new category
     *
     * 
     */
    @Test
    public void createCategoryTest() {
        CategoryResource category = null;
        // CategoryResource response = api.createCategory(category);

        // TODO: test validations
    }
    /**
     * Create a category template
     *
     * Templates define a type of category and the properties they have
     */
    @Test
    public void createCategoryTemplateTest() {
        TemplateResource template = null;
        // TemplateResource response = api.createCategoryTemplate(template);

        // TODO: test validations
    }
    /**
     * Delete an existing category
     *
     * 
     */
    @Test
    public void deleteCategoryTest() {
        String id = null;
        // Void response = api.deleteCategory(id);

        // TODO: test validations
    }
    /**
     * Delete a category template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     */
    @Test
    public void deleteCategoryTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteCategoryTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * List and search categories with optional filters
     *
     * 
     */
    @Test
    public void getCategoriesTest() {
        String filterSearch = null;
        Boolean filterActive = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceCategoryResource response = api.getCategories(filterSearch, filterActive, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single category
     *
     * 
     */
    @Test
    public void getCategoryTest() {
        String id = null;
        // CategoryResource response = api.getCategory(id);

        // TODO: test validations
    }
    /**
     * Get a single category template
     *
     * 
     */
    @Test
    public void getCategoryTemplateTest() {
        String id = null;
        // TemplateResource response = api.getCategoryTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search category templates
     *
     * 
     */
    @Test
    public void getCategoryTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getCategoryTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * List all trivia tags in the system
     *
     * 
     */
    @Test
    public void getTagsTest() {
        Integer size = null;
        Integer page = null;
        // PageResourcestring response = api.getTags(size, page);

        // TODO: test validations
    }
    /**
     * Update an existing category
     *
     * 
     */
    @Test
    public void updateCategoryTest() {
        String id = null;
        CategoryResource category = null;
        // CategoryResource response = api.updateCategory(id, category);

        // TODO: test validations
    }
    /**
     * Update a category template
     *
     * 
     */
    @Test
    public void updateCategoryTemplateTest() {
        String id = null;
        TemplateResource template = null;
        // TemplateResource response = api.updateCategoryTemplate(id, template);

        // TODO: test validations
    }
}
