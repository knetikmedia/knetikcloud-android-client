package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.BreCategoryResource;
import com.knetikcloud.model.PageResourceBreCategoryResource;
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
 * API tests for BRERuleEngineCategoriesApi
 */
public class BRERuleEngineCategoriesApiTest {

    private BRERuleEngineCategoriesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BRERuleEngineCategoriesApi.class);
    }

    /**
     * Create a BRE category template
     *
     * Templates define a type of BRE category and the properties they have
     */
    @Test
    public void createBRECategoryTemplateTest() {
        TemplateResource template = null;
        // TemplateResource response = api.createBRECategoryTemplate(template);

        // TODO: test validations
    }
    /**
     * Delete a BRE category template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     */
    @Test
    public void deleteBRECategoryTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteBRECategoryTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * List categories
     *
     * 
     */
    @Test
    public void getBRECategoriesTest() {
        Integer size = null;
        Integer page = null;
        // PageResourceBreCategoryResource response = api.getBRECategories(size, page);

        // TODO: test validations
    }
    /**
     * Get a single category
     *
     * 
     */
    @Test
    public void getBRECategoryTest() {
        String name = null;
        // BreCategoryResource response = api.getBRECategory(name);

        // TODO: test validations
    }
    /**
     * Get a single BRE category template
     *
     * 
     */
    @Test
    public void getBRECategoryTemplateTest() {
        String id = null;
        // TemplateResource response = api.getBRECategoryTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search BRE category templates
     *
     * 
     */
    @Test
    public void getBRECategoryTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getBRECategoryTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Update a category
     *
     * 
     */
    @Test
    public void updateBRECategoryTest() {
        String name = null;
        BreCategoryResource category = null;
        // BreCategoryResource response = api.updateBRECategory(name, category);

        // TODO: test validations
    }
    /**
     * Update a BRE category template
     *
     * 
     */
    @Test
    public void updateBRECategoryTemplateTest() {
        String id = null;
        TemplateResource template = null;
        // TemplateResource response = api.updateBRECategoryTemplate(id, template);

        // TODO: test validations
    }
}
