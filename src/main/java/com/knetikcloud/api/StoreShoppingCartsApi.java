package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.Cart;
import com.knetikcloud.model.CartItemRequest;
import com.knetikcloud.model.CartShippableResponse;
import com.knetikcloud.model.CartShippingAddressRequest;
import com.knetikcloud.model.CouponDefinition;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.PageResourceCartSummary;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SampleCountriesResponse;
import com.knetikcloud.model.SkuRequest;
import com.knetikcloud.model.StringWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StoreShoppingCartsApi {
  /**
   * Adds a custom discount to the cart
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN
   * @param id The id of the cart (required)
   * @param customDiscount The details of the discount to add (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("carts/{id}/custom-discounts")
  Call<Void> addCustomDiscount(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body CouponDefinition customDiscount
  );

  /**
   * Adds a discount coupon to the cart
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart (required)
   * @param skuRequest The request of the sku (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("carts/{id}/discounts")
  Call<Void> addDiscountToCart(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body SkuRequest skuRequest
  );

  /**
   * Add an item to the cart
   * Currently, carts cannot contain virtual and real currency items at the same time. Furthermore, the API only support a single virtual item at the moment. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart (required)
   * @param cartItemRequest The cart item request object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("carts/{id}/items")
  Call<Void> addItemToCart(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body CartItemRequest cartItemRequest
  );

  /**
   * Create a cart
   * You don&#39;t have to have a user to create a cart but the API requires authentication to checkout. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param owner Set the owner of a cart. If not specified, defaults to the calling user&#39;s id. If specified and is not the calling user&#39;s id, SHOPPING_CARTS_ADMIN permission is required (optional)
   * @param currencyCode Set the currency for the cart, by currency code. May be disallowed by site settings. (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("carts")
  Call<String> createCart(
    @retrofit2.http.Query("owner") Integer owner, @retrofit2.http.Query("currency_code") String currencyCode
  );

  /**
   * Returns the cart with the given GUID
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart (required)
   * @return Call&lt;Cart&gt;
   */
  @GET("carts/{id}")
  Call<Cart> getCart(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a list of carts
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param filterOwnerId Filter by the id of the owner (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceCartSummary&gt;
   */
  @GET("carts")
  Call<PageResourceCartSummary> getCarts(
    @retrofit2.http.Query("filter_owner_id") Integer filterOwnerId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Returns whether a cart requires shipping
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart (required)
   * @return Call&lt;CartShippableResponse&gt;
   */
  @GET("carts/{id}/shippable")
  Call<CartShippableResponse> getShippable(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get the list of available shipping countries per vendor
   * Since a cart can have multiple vendors with different shipping options, the countries are broken down by vendors. Please see notes about the response object as the fields are variable. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart (required)
   * @return Call&lt;SampleCountriesResponse&gt;
   */
  @GET("carts/{id}/countries")
  Call<SampleCountriesResponse> getShippingCountries(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Removes a discount coupon from the cart
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart (required)
   * @param code The SKU code of the coupon to remove (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("carts/{id}/discounts/{code}")
  Call<Void> removeDiscountFromCart(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("code") String code
  );

  /**
   * Sets the currency to use for the cart
   * May be disallowed by site settings. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart (required)
   * @param currencyCode The code of the currency (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("carts/{id}/currency")
  Call<Void> setCartCurrency(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body StringWrapper currencyCode
  );

  /**
   * Sets the owner of a cart if none is set already
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart (required)
   * @param userId The id of the user (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("carts/{id}/owner")
  Call<Void> setCartOwner(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body IntWrapper userId
  );

  /**
   * Changes the quantity of an item already in the cart
   * A quantity of zero will remove the item from the cart altogether. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart (required)
   * @param cartItemRequest The cart item request object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("carts/{id}/items")
  Call<Void> updateItemInCart(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body CartItemRequest cartItemRequest
  );

  /**
   * Modifies or sets the order shipping address
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
   * @param id The id of the cart (required)
   * @param cartShippingAddressRequest The cart shipping address request object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("carts/{id}/shipping-address")
  Call<Void> updateShippingAddress(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body CartShippingAddressRequest cartShippingAddressRequest
  );

}
