package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PropertyFieldListResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TemplatesPropertiesApi {
  /**
   * Get details for a template property type
   * 
   * @param type type (required)
   * @return Call&lt;PropertyFieldListResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("templates/properties/{type}")
  Call<PropertyFieldListResource> getTemplatePropertyType(
    @retrofit2.http.Path("type") String type
  );

  /**
   * List template property types
   * 
   * @return Call&lt;List&lt;PropertyFieldListResource&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("templates/properties")
  Call<List<PropertyFieldListResource>> getTemplatePropertyTypes();
    

}
