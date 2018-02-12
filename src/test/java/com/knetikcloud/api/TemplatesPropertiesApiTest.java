package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PropertyFieldListResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesPropertiesApi
 */
public class TemplatesPropertiesApiTest {

    private TemplatesPropertiesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TemplatesPropertiesApi.class);
    }

    /**
     * Get details for a template property type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getTemplatePropertyTypeTest() {
        String type = null;
        // PropertyFieldListResource response = api.getTemplatePropertyType(type);

        // TODO: test validations
    }
    /**
     * List template property types
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getTemplatePropertyTypesTest() {
        // List<PropertyFieldListResource> response = api.getTemplatePropertyTypes();

        // TODO: test validations
    }
}
