package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.CatalogSale;
import com.knetikcloud.model.PageResourceCatalogSale;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StoreSalesApi {
  /**
   * Create a sale
   * 
   * @param catalogSale The catalog sale object (optional)
   * @return Call&lt;CatalogSale&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/sales")
  Call<CatalogSale> createCatalogSale(
    @retrofit2.http.Body CatalogSale catalogSale
  );

  /**
   * Delete a sale
   * 
   * @param id The id of the sale (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("store/sales/{id}")
  Call<Void> deleteCatalogSale(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a single sale
   * 
   * @param id The id of the sale (required)
   * @return Call&lt;CatalogSale&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("store/sales/{id}")
  Call<CatalogSale> getCatalogSale(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * List and search sales
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceCatalogSale&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("store/sales")
  Call<PageResourceCatalogSale> getCatalogSales(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a sale
   * 
   * @param id The id of the sale (required)
   * @param catalogSale The catalog sale object (optional)
   * @return Call&lt;CatalogSale&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("store/sales/{id}")
  Call<CatalogSale> updateCatalogSale(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body CatalogSale catalogSale
  );

}
