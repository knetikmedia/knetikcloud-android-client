package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ClientResource;
import com.knetikcloud.model.GrantTypeResource;
import com.knetikcloud.model.PageResourceClientResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AuthClientsApi {
  /**
   * Create a new client
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
   * @param clientResource The client resource object (optional)
   * @return Call&lt;ClientResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("auth/clients")
  Call<ClientResource> createClient(
    @retrofit2.http.Body ClientResource clientResource
  );

  /**
   * Delete a client
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
   * @param clientKey The key of the client (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("auth/clients/{client_key}")
  Call<Void> deleteClient(
    @retrofit2.http.Path("client_key") String clientKey
  );

  /**
   * Get a single client
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
   * @param clientKey The key of the client (required)
   * @return Call&lt;ClientResource&gt;
   */
  @GET("auth/clients/{client_key}")
  Call<ClientResource> getClient(
    @retrofit2.http.Path("client_key") String clientKey
  );

  /**
   * List available client grant types
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
   * @return Call&lt;List&lt;GrantTypeResource&gt;&gt;
   */
  @GET("auth/clients/grant-types")
  Call<List<GrantTypeResource>> getClientGrantTypes();
    

  /**
   * List and search clients
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceClientResource&gt;
   */
  @GET("auth/clients")
  Call<PageResourceClientResource> getClients(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Set grant types for a client
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
   * @param clientKey The key of the client (required)
   * @param grantList A list of unique grant types (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("auth/clients/{client_key}/grant-types")
  Call<Void> setClientGrantTypes(
    @retrofit2.http.Path("client_key") String clientKey, @retrofit2.http.Body List<String> grantList
  );

  /**
   * Set redirect uris for a client
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
   * @param clientKey The key of the client (required)
   * @param redirectList A list of unique redirect uris (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("auth/clients/{client_key}/redirect-uris")
  Call<Void> setClientRedirectUris(
    @retrofit2.http.Path("client_key") String clientKey, @retrofit2.http.Body List<String> redirectList
  );

  /**
   * Update a client
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
   * @param clientKey The key of the client (required)
   * @param clientResource The client resource object (optional)
   * @return Call&lt;ClientResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("auth/clients/{client_key}")
  Call<ClientResource> updateClient(
    @retrofit2.http.Path("client_key") String clientKey, @retrofit2.http.Body ClientResource clientResource
  );

}
