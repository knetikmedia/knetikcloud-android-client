package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ClientResource;
import com.knetikcloud.model.PageResourceRoleResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.RoleResource;
import com.knetikcloud.model.UserResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AuthRolesApi {
  /**
   * Create a new role
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
   * @param roleResource The role resource object (optional)
   * @return Call&lt;RoleResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("auth/roles")
  Call<RoleResource> createRole(
    @retrofit2.http.Body RoleResource roleResource
  );

  /**
   * Delete a role
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
   * @param role The role value (required)
   * @param force If true, removes role from users/clients (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("auth/roles/{role}")
  Call<Void> deleteRole(
    @retrofit2.http.Path("role") String role, @retrofit2.http.Query("force") Boolean force
  );

  /**
   * Get roles for a client
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
   * @param clientKey The client key (required)
   * @return Call&lt;List&lt;RoleResource&gt;&gt;
   */
  @GET("auth/clients/{client_key}/roles")
  Call<List<RoleResource>> getClientRoles(
    @retrofit2.http.Path("client_key") String clientKey
  );

  /**
   * Get a single role
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
   * @param role The role value (required)
   * @return Call&lt;RoleResource&gt;
   */
  @GET("auth/roles/{role}")
  Call<RoleResource> getRole(
    @retrofit2.http.Path("role") String role
  );

  /**
   * List and search roles
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
   * @param filterName Filter for roles that have a name starting with specified string (optional)
   * @param filterRole Filter for roles that have a role starting with specified string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceRoleResource&gt;
   */
  @GET("auth/roles")
  Call<PageResourceRoleResource> getRoles(
    @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("filter_role") String filterRole, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get roles for a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
   * @param userId The user&#39;s id (required)
   * @return Call&lt;List&lt;RoleResource&gt;&gt;
   */
  @GET("auth/users/{user_id}/roles")
  Call<List<RoleResource>> getUserRoles(
    @retrofit2.http.Path("user_id") Integer userId
  );

  /**
   * Set roles for a client
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
   * @param clientKey The client key (required)
   * @param rolesList The list of unique roles (optional)
   * @return Call&lt;ClientResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("auth/clients/{client_key}/roles")
  Call<ClientResource> setClientRoles(
    @retrofit2.http.Path("client_key") String clientKey, @retrofit2.http.Body List<String> rolesList
  );

  /**
   * Set permissions for a role
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
   * @param role The role value (required)
   * @param permissionsList The list of unique permissions (optional)
   * @return Call&lt;RoleResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("auth/roles/{role}/permissions")
  Call<RoleResource> setPermissionsForRole(
    @retrofit2.http.Path("role") String role, @retrofit2.http.Body List<String> permissionsList
  );

  /**
   * Set roles for a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
   * @param userId The user&#39;s id (required)
   * @param rolesList The list of unique roles (optional)
   * @return Call&lt;UserResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("auth/users/{user_id}/roles")
  Call<UserResource> setUserRoles(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Body List<String> rolesList
  );

  /**
   * Update a role
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
   * @param role The role value (required)
   * @param roleResource The role resource object (optional)
   * @return Call&lt;RoleResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("auth/roles/{role}")
  Call<RoleResource> updateRole(
    @retrofit2.http.Path("role") String role, @retrofit2.http.Body RoleResource roleResource
  );

}
