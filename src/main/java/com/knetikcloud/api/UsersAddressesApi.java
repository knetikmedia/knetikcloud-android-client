package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceSavedAddressResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SavedAddressResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UsersAddressesApi {
  /**
   * Create a new address
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or owner
   * @param userId The id of the user (required)
   * @param savedAddressResource The new address (optional)
   * @return Call&lt;SavedAddressResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/addresses")
  Call<SavedAddressResource> createAddress(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body SavedAddressResource savedAddressResource
  );

  /**
   * Delete an address
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or owner
   * @param userId The id of the user (required)
   * @param id The id of the address (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("users/{user_id}/addresses/{id}")
  Call<Void> deleteAddress(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a single address
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or owner
   * @param userId The id of the user (required)
   * @param id The id of the address (required)
   * @return Call&lt;SavedAddressResource&gt;
   */
  @GET("users/{user_id}/addresses/{id}")
  Call<SavedAddressResource> getAddress(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("id") Integer id
  );

  /**
   * List and search addresses
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or owner
   * @param userId The id of the user (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceSavedAddressResource&gt;
   */
  @GET("users/{user_id}/addresses")
  Call<PageResourceSavedAddressResource> getAddresses(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update an address
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; USERS_ADMIN or owner
   * @param userId The id of the user (required)
   * @param id The id of the address (required)
   * @param savedAddressResource The saved address resource object (optional)
   * @return Call&lt;SavedAddressResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/addresses/{id}")
  Call<SavedAddressResource> updateAddress(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body SavedAddressResource savedAddressResource
  );

}
