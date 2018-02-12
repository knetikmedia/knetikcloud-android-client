package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourcePermissionResource;
import com.knetikcloud.model.PermissionResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AuthPermissionsApi {
  /**
   * Create a new permission
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PERMISSIONS_ADMIN
   * @param permissionResource The permission resource object (optional)
   * @return Call&lt;PermissionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("auth/permissions")
  Call<PermissionResource> createPermission(
    @retrofit2.http.Body PermissionResource permissionResource
  );

  /**
   * Delete a permission
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PERMISSIONS_ADMIN
   * @param permission The permission value (required)
   * @param force If true, removes permission assigned to roles (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("auth/permissions/{permission}")
  Call<Void> deletePermission(
    @retrofit2.http.Path("permission") String permission, @retrofit2.http.Query("force") Boolean force
  );

  /**
   * Get a single permission
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PERMISSIONS_ADMIN
   * @param permission The permission value (required)
   * @return Call&lt;PermissionResource&gt;
   */
  @GET("auth/permissions/{permission}")
  Call<PermissionResource> getPermission(
    @retrofit2.http.Path("permission") String permission
  );

  /**
   * List and search permissions
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PERMISSIONS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to permission:ASC)
   * @return Call&lt;PageResourcePermissionResource&gt;
   */
  @GET("auth/permissions")
  Call<PageResourcePermissionResource> getPermissions(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a permission
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PERMISSIONS_ADMIN
   * @param permission The permission value (required)
   * @param permissionResource The permission resource object (optional)
   * @return Call&lt;PermissionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("auth/permissions/{permission}")
  Call<PermissionResource> updatePermission(
    @retrofit2.http.Path("permission") String permission, @retrofit2.http.Body PermissionResource permissionResource
  );

}
