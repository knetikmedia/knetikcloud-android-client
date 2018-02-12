package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ArtistResource;
import com.knetikcloud.model.PageResourceArtistResource;
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
 * API tests for MediaArtistsApi
 */
public class MediaArtistsApiTest {

    private MediaArtistsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MediaArtistsApi.class);
    }

    /**
     * Adds a new artist in the system
     *
     * Adds a new artist in the system. Use specific media contributions endpoint to add contributions. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void addArtistTest() {
        ArtistResource artistResource = null;
        // ArtistResource response = api.addArtist(artistResource);

        // TODO: test validations
    }
    /**
     * Create an artist template
     *
     * Artist Templates define a type of artist and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createArtistTemplateTest() {
        TemplateResource artistTemplateResource = null;
        // TemplateResource response = api.createArtistTemplate(artistTemplateResource);

        // TODO: test validations
    }
    /**
     * Removes an artist from the system IF no resources are attached to it
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ARTISTS_ADMIN
     */
    @Test
    public void deleteArtistTest() {
        Long id = null;
        // Void response = api.deleteArtist(id);

        // TODO: test validations
    }
    /**
     * Delete an artist template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteArtistTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteArtistTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Loads a specific artist details
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getArtistTest() {
        Long id = null;
        Integer showContributions = null;
        // ArtistResource response = api.getArtist(id, showContributions);

        // TODO: test validations
    }
    /**
     * Get a single artist template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ARTISTS_ADMIN
     */
    @Test
    public void getArtistTemplateTest() {
        String id = null;
        // TemplateResource response = api.getArtistTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search artist templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ARTISTS_ADMIN
     */
    @Test
    public void getArtistTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getArtistTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Search for artists
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getArtistsTest() {
        String filterArtistsByName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceArtistResource response = api.getArtists(filterArtistsByName, size, page, order);

        // TODO: test validations
    }
    /**
     * Modifies an artist details
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ARTISTS_ADMIN
     */
    @Test
    public void updateArtistTest() {
        Long id = null;
        ArtistResource artistResource = null;
        // Void response = api.updateArtist(id, artistResource);

        // TODO: test validations
    }
    /**
     * Update an artist template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateArtistTemplateTest() {
        String id = null;
        TemplateResource artistTemplateResource = null;
        // TemplateResource response = api.updateArtistTemplate(id, artistTemplateResource);

        // TODO: test validations
    }
}
