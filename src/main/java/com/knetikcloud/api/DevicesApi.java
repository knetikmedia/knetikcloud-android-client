package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.DeviceResource;
import com.knetikcloud.model.PageResourceDeviceResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SimpleUserResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DevicesApi {
  /**
   * Add device users
   * 
   * @param userResources userResources (required)
   * @param id id (required)
   * @return Call&lt;DeviceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("devices/{id}/users")
  Call<DeviceResource> addDeviceUsers(
    @retrofit2.http.Body List<SimpleUserResource> userResources, @retrofit2.http.Path("id") Integer id
  );

  /**
   * Create a device
   * 
   * @param device device (required)
   * @return Call&lt;DeviceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("devices")
  Call<DeviceResource> createDevice(
    @retrofit2.http.Body DeviceResource device
  );

  /**
   * Delete a device
   * 
   * @param id id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("devices/{id}")
  Call<Void> deleteDevice(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Delete a device user
   * 
   * @param id The id of the device (required)
   * @param userId The user id of the device user (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("devices/{id}/users/{user_id}")
  Call<Void> deleteDeviceUser(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("user_id") Integer userId
  );

  /**
   * Delete all device users
   * 
   * @param id The id of the device (required)
   * @param filterId Filter for device users to delete with a user id in a given comma separated list of ids (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("devices/{id}/users")
  Call<Void> deleteDeviceUsers(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("filter_id") String filterId
  );

  /**
   * Get a single device
   * 
   * @param id id (required)
   * @return Call&lt;DeviceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("devices/{id}")
  Call<DeviceResource> getDevice(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * List and search devices
   * Get a list of devices with optional filtering
   * @param filterMake Filter for devices with specified make (optional)
   * @param filterModel Filter for devices with specified model (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceDeviceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("devices")
  Call<PageResourceDeviceResource> getDevices(
    @retrofit2.http.Query("filter_make") String filterMake, @retrofit2.http.Query("filter_model") String filterModel, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a device
   * 
   * @param device device (required)
   * @param id id (required)
   * @return Call&lt;DeviceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("devices/{id}")
  Call<DeviceResource> updateDevice(
    @retrofit2.http.Body DeviceResource device, @retrofit2.http.Path("id") Integer id
  );

}
