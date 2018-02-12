package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.ObjectResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.PageResourceObjectResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectsApi
 */
public class ObjectsApiTest {

    private ObjectsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ObjectsApi.class);
    }

    /**
     * Create an object
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void createObjectItemTest() {
        String templateId = null;
        Boolean cascade = null;
        ObjectResource objectItem = null;
        // ObjectResource response = api.createObjectItem(templateId, cascade, objectItem);

        // TODO: test validations
    }
    /**
     * Create an object template
     *
     * Object templates define a type of entitlement and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createObjectTemplateTest() {
        ItemTemplateResource template = null;
        // ItemTemplateResource response = api.createObjectTemplate(template);

        // TODO: test validations
    }
    /**
     * Delete an object
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void deleteObjectItemTest() {
        String templateId = null;
        Integer objectId = null;
        // Void response = api.deleteObjectItem(templateId, objectId);

        // TODO: test validations
    }
    /**
     * Delete an entitlement template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteObjectTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteObjectTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single object
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getObjectItemTest() {
        String templateId = null;
        Integer objectId = null;
        // ObjectResource response = api.getObjectItem(templateId, objectId);

        // TODO: test validations
    }
    /**
     * List and search objects
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getObjectItemsTest() {
        String templateId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceObjectResource response = api.getObjectItems(templateId, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single entitlement template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN
     */
    @Test
    public void getObjectTemplateTest() {
        String id = null;
        // ItemTemplateResource response = api.getObjectTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search entitlement templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN
     */
    @Test
    public void getObjectTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceItemTemplateResource response = api.getObjectTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Update an object
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
     */
    @Test
    public void updateObjectItemTest() {
        String templateId = null;
        Integer objectId = null;
        Boolean cascade = null;
        ObjectResource objectItem = null;
        // Void response = api.updateObjectItem(templateId, objectId, cascade, objectItem);

        // TODO: test validations
    }
    /**
     * Update an entitlement template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateObjectTemplateTest() {
        String id = null;
        ItemTemplateResource template = null;
        // ItemTemplateResource response = api.updateObjectTemplate(id, template);

        // TODO: test validations
    }
}
