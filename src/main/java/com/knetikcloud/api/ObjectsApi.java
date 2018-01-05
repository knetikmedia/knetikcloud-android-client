package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.ObjectResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.PageResourceObjectResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ObjectsApi {
  /**
   * Create an object
   * 
   * @param templateId The id of the template this object is to be part of (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param objectItem The object item object (optional)
   * @return Call&lt;ObjectResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("objects/{template_id}")
  Call<ObjectResource> createObjectItem(
    @retrofit2.http.Path("template_id") String templateId, @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body ObjectResource objectItem
  );

  /**
   * Create an object template
   * Object templates define a type of entitlement and the properties they have
   * @param template The entitlement template to be created (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("objects/templates")
  Call<ItemTemplateResource> createObjectTemplate(
    @retrofit2.http.Body ItemTemplateResource template
  );

  /**
   * Delete an object
   * 
   * @param templateId The id of the template this object is part of (required)
   * @param objectId The id of the object (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("objects/{template_id}/{object_id}")
  Call<Void> deleteObjectItem(
    @retrofit2.http.Path("template_id") String templateId, @retrofit2.http.Path("object_id") Integer objectId
  );

  /**
   * Delete an entitlement template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("objects/templates/{id}")
  Call<Void> deleteObjectTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a single object
   * 
   * @param templateId The id of the template this object is part of (required)
   * @param objectId The id of the object (required)
   * @return Call&lt;ObjectResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("objects/{template_id}/{object_id}")
  Call<ObjectResource> getObjectItem(
    @retrofit2.http.Path("template_id") String templateId, @retrofit2.http.Path("object_id") Integer objectId
  );

  /**
   * List and search objects
   * 
   * @param templateId The id of the template to get objects for (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceObjectResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("objects/{template_id}")
  Call<PageResourceObjectResource> getObjectItems(
    @retrofit2.http.Path("template_id") String templateId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single entitlement template
   * 
   * @param id The id of the template (required)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("objects/templates/{id}")
  Call<ItemTemplateResource> getObjectTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search entitlement templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("objects/templates")
  Call<PageResourceItemTemplateResource> getObjectTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update an object
   * 
   * @param templateId The id of the template this object is part of (required)
   * @param objectId The id of the object (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param objectItem The object item object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("objects/{template_id}/{object_id}")
  Call<Void> updateObjectItem(
    @retrofit2.http.Path("template_id") String templateId, @retrofit2.http.Path("object_id") Integer objectId, @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body ObjectResource objectItem
  );

  /**
   * Update an entitlement template
   * 
   * @param id The id of the template (required)
   * @param template The updated template (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("objects/templates/{id}")
  Call<ItemTemplateResource> updateObjectTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body ItemTemplateResource template
  );

}
