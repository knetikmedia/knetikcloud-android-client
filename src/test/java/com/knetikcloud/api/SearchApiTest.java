package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceMapstringobject;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SearchReferenceMapping;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
public class SearchApiTest {

    private SearchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SearchApi.class);
    }

    /**
     * Add a new object to an index
     *
     * Mainly intended for internal use.
     */
    @Test
    public void addSearchIndexTest() {
        String type = null;
        String id = null;
        Object object = null;
        // Void response = api.addSearchIndex(type, id, object);

        // TODO: test validations
    }
    /**
     * Register reference mappings
     *
     * Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use.
     */
    @Test
    public void addSearchMappingsTest() {
        List<SearchReferenceMapping> mappings = null;
        // Void response = api.addSearchMappings(mappings);

        // TODO: test validations
    }
    /**
     * Delete an object
     *
     * Mainly intended for internal use. Requires SEARCH_ADMIN.
     */
    @Test
    public void deleteSearchIndexTest() {
        String type = null;
        String id = null;
        // Void response = api.deleteSearchIndex(type, id);

        // TODO: test validations
    }
    /**
     * Delete all objects in an index
     *
     * Mainly intended for internal use
     */
    @Test
    public void deleteSearchIndexesTest() {
        String type = null;
        // Void response = api.deleteSearchIndexes(type);

        // TODO: test validations
    }
    /**
     * Search an index
     *
     * The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type. See individual search endpoints on other resources for details on their format.
     */
    @Test
    public void searchIndexTest() {
        String type = null;
        Object query = null;
        Integer size = null;
        Integer page = null;
        // PageResourceMapstringobject response = api.searchIndex(type, query, size, page);

        // TODO: test validations
    }
}
