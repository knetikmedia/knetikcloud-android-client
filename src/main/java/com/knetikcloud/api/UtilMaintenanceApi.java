package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.Maintenance;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UtilMaintenanceApi {
  /**
   * Delete maintenance info
   * 
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("maintenance")
  Call<Void> deleteMaintenance();
    

  /**
   * Get current maintenance info
   * Get current maintenance info. 404 if no maintenance.
   * @return Call&lt;Maintenance&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("maintenance")
  Call<Maintenance> getMaintenance();
    

  /**
   * Set current maintenance info
   * 
   * @param maintenance The maintenance object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("maintenance")
  Call<Void> setMaintenance(
    @retrofit2.http.Body Maintenance maintenance
  );

  /**
   * Update current maintenance info
   * 
   * @param maintenance The maintenance object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("maintenance")
  Call<Void> updateMaintenance(
    @retrofit2.http.Body Maintenance maintenance
  );

}
