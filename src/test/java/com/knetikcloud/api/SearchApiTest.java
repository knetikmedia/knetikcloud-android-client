package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.Result;
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
     * Count matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchCountGETTest() {
        String type = null;
        // Object response = api.searchCountGET(type);

        // TODO: test validations
    }
    /**
     * Count matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchCountPOSTTest() {
        String type = null;
        Object query = null;
        // Object response = api.searchCountPOST(type, query);

        // TODO: test validations
    }
    /**
     * Count matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchCountWithTemplateGETTest() {
        String type = null;
        String template = null;
        // Object response = api.searchCountWithTemplateGET(type, template);

        // TODO: test validations
    }
    /**
     * Count matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchCountWithTemplatePOSTTest() {
        String type = null;
        String template = null;
        Object query = null;
        // Object response = api.searchCountWithTemplatePOST(type, template, query);

        // TODO: test validations
    }
    /**
     * Get document with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchDocumentGETTest() {
        String type = null;
        String id = null;
        // Object response = api.searchDocumentGET(type, id);

        // TODO: test validations
    }
    /**
     * Get document with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchDocumentWithTemplateGETTest() {
        String type = null;
        String id = null;
        String template = null;
        // Object response = api.searchDocumentWithTemplateGET(type, id, template);

        // TODO: test validations
    }
    /**
     * Explain matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchExplainGETTest() {
        String type = null;
        String id = null;
        // Object response = api.searchExplainGET(type, id);

        // TODO: test validations
    }
    /**
     * Explain matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchExplainPOSTTest() {
        String type = null;
        String id = null;
        Object query = null;
        // Object response = api.searchExplainPOST(type, id, query);

        // TODO: test validations
    }
    /**
     * Explain matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchExplainWithTemplateGETTest() {
        String type = null;
        String id = null;
        String template = null;
        // Object response = api.searchExplainWithTemplateGET(type, id, template);

        // TODO: test validations
    }
    /**
     * Explain matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchExplainWithTemplatePOSTTest() {
        String type = null;
        String id = null;
        String template = null;
        Object query = null;
        // Object response = api.searchExplainWithTemplatePOST(type, id, template, query);

        // TODO: test validations
    }
    /**
     * Search an index with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchIndexTest() {
        String type = null;
        Object query = null;
        // Object response = api.searchIndex(type, query);

        // TODO: test validations
    }
    /**
     * Search an index with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchIndexGETTest() {
        String type = null;
        // Object response = api.searchIndexGET(type);

        // TODO: test validations
    }
    /**
     * Search an index with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchIndexWithTemplateGETTest() {
        String type = null;
        String template = null;
        // Object response = api.searchIndexWithTemplateGET(type, template);

        // TODO: test validations
    }
    /**
     * Search an index with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchIndexWithTemplatePOSTTest() {
        String type = null;
        String template = null;
        Object query = null;
        // Object response = api.searchIndexWithTemplatePOST(type, template, query);

        // TODO: test validations
    }
    /**
     * Get indices
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _cat/indices for indices.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchIndicesGETTest() {
        // Object response = api.searchIndicesGET();

        // TODO: test validations
    }
    /**
     * Get mapping with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchMappingsGETTest() {
        String type = null;
        // Object response = api.searchMappingsGET(type);

        // TODO: test validations
    }
    /**
     * Get mapping with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchMappingsWithTemplateGETTest() {
        String type = null;
        String template = null;
        // Object response = api.searchMappingsWithTemplateGET(type, template);

        // TODO: test validations
    }
    /**
     * Validate matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchValidateGETTest() {
        String type = null;
        // Object response = api.searchValidateGET(type);

        // TODO: test validations
    }
    /**
     * Validate matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchValidatePOSTTest() {
        String type = null;
        Object query = null;
        // Object response = api.searchValidatePOST(type, query);

        // TODO: test validations
    }
    /**
     * Validate matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchValidateWithTemplateGETTest() {
        String type = null;
        String template = null;
        // Object response = api.searchValidateWithTemplateGET(type, template);

        // TODO: test validations
    }
    /**
     * Validate matches with a template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;
     */
    @Test
    public void searchValidateWithTemplatePOSTTest() {
        String type = null;
        String template = null;
        Object query = null;
        // Object response = api.searchValidateWithTemplatePOST(type, template, query);

        // TODO: test validations
    }
}
