package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.CurrencyResource;
import com.knetikcloud.model.PageResourceCurrencyResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CurrenciesApi {
  /**
   * Create a currency
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CURRENCIES_ADMIN
   * @param currency The currency object (optional)
   * @return Call&lt;CurrencyResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("currencies")
  Call<CurrencyResource> createCurrency(
    @retrofit2.http.Body CurrencyResource currency
  );

  /**
   * Delete a currency
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CURRENCIES_ADMIN
   * @param code The currency code (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("currencies/{code}")
  Call<Void> deleteCurrency(
    @retrofit2.http.Path("code") String code
  );

  /**
   * List and search currencies
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterDefault Filter for the one currency that is set as default (true), or all that are not (false) (optional)
   * @param filterEnabledCurrencies Filter for alternate currencies setup explicitely in system config (optional)
   * @param filterType Filter currencies by type.  Allowable values: (&#39;virtual&#39;, &#39;real&#39;) (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to name:ASC)
   * @return Call&lt;PageResourceCurrencyResource&gt;
   */
  @GET("currencies")
  Call<PageResourceCurrencyResource> getCurrencies(
    @retrofit2.http.Query("filter_default") Boolean filterDefault, @retrofit2.http.Query("filter_enabled_currencies") Boolean filterEnabledCurrencies, @retrofit2.http.Query("filter_type") String filterType, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single currency
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param code The currency code (required)
   * @return Call&lt;CurrencyResource&gt;
   */
  @GET("currencies/{code}")
  Call<CurrencyResource> getCurrency(
    @retrofit2.http.Path("code") String code
  );

  /**
   * Update a currency
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CURRENCIES_ADMIN
   * @param code The currency code (required)
   * @param currency The currency object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("currencies/{code}")
  Call<Void> updateCurrency(
    @retrofit2.http.Path("code") String code, @retrofit2.http.Body CurrencyResource currency
  );

}
