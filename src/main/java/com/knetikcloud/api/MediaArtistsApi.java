package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ArtistResource;
import com.knetikcloud.model.PageResourceArtistResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MediaArtistsApi {
  /**
   * Adds a new artist in the system
   * Adds a new artist in the system. Use specific media contributions endpoint to add contributions
   * @param artistResource The new artist (optional)
   * @return Call&lt;ArtistResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/artists")
  Call<ArtistResource> addArtist(
    @retrofit2.http.Body ArtistResource artistResource
  );

  /**
   * Create an artist template
   * Artist Templates define a type of artist and the properties they have
   * @param artistTemplateResource The artist template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("media/artists/templates")
  Call<TemplateResource> createArtistTemplate(
    @retrofit2.http.Body TemplateResource artistTemplateResource
  );

  /**
   * Removes an artist from the system IF no resources are attached to it
   * 
   * @param id The artist id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("media/artists/{id}")
  Call<Void> deleteArtist(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Delete an artist template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("media/artists/templates/{id}")
  Call<Void> deleteArtistTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Loads a specific artist details
   * 
   * @param id The artist id (required)
   * @param showContributions The number of contributions to show fetch (optional)
   * @return Call&lt;ArtistResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("media/artists/{id}")
  Call<ArtistResource> getArtist(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Query("show_contributions") Integer showContributions
  );

  /**
   * Get a single artist template
   * 
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("media/artists/templates/{id}")
  Call<TemplateResource> getArtistTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search artist templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("media/artists/templates")
  Call<PageResourceTemplateResource> getArtistTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Search for artists
   * 
   * @param filterArtistsByName Filter for artists which name *STARTS* with the given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceArtistResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("media/artists")
  Call<PageResourceArtistResource> getArtists(
    @retrofit2.http.Query("filter_artists_by_name") String filterArtistsByName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Modifies an artist details
   * 
   * @param id The artist id (required)
   * @param artistResource The new artist (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("media/artists/{id}")
  Call<Void> updateArtist(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body ArtistResource artistResource
  );

  /**
   * Update an artist template
   * 
   * @param id The id of the template (required)
   * @param artistTemplateResource The artist template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("media/artists/templates/{id}")
  Call<TemplateResource> updateArtistTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body TemplateResource artistTemplateResource
  );

}
