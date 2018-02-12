package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.AddressResource;
import com.knetikcloud.model.InvoiceCreateRequest;
import com.knetikcloud.model.InvoicePaymentStatusRequest;
import com.knetikcloud.model.InvoiceResource;
import com.knetikcloud.model.PageResourceInvoiceLogEntry;
import com.knetikcloud.model.PageResourceInvoiceResource;
import com.knetikcloud.model.PayBySavedMethodRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface InvoicesApi {
  /**
   * Create an invoice
   * Create an invoice(s) by providing a cart GUID. Note that there may be multiple invoices created, one per vendor. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER or INVOICES_ADMIN
   * @param req Invoice to be created (optional)
   * @return Call&lt;List&lt;InvoiceResource&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("invoices")
  Call<List<InvoiceResource>> createInvoice(
    @retrofit2.http.Body InvoiceCreateRequest req
  );

  /**
   * Lists available fulfillment statuses
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("invoices/fulfillment-statuses")
  Call<List<String>> getFulFillmentStatuses();
    

  /**
   * Retrieve an invoice
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
   * @param id The id of the invoice (required)
   * @return Call&lt;InvoiceResource&gt;
   */
  @GET("invoices/{id}")
  Call<InvoiceResource> getInvoice(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * List invoice logs
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
   * @param id The id of the invoice (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceInvoiceLogEntry&gt;
   */
  @GET("invoices/{id}/logs")
  Call<PageResourceInvoiceLogEntry> getInvoiceLogs(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Retrieve invoices
   * Without INVOICES_ADMIN permission the results are automatically filtered for only the logged in user&#39;s invoices. It is recomended however that filter_user be added to avoid issues for admin users accidentally getting additional invoices. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
   * @param filterUser The id of a user to get invoices for. Automtically added if not being called with admin permissions. (optional)
   * @param filterEmail Filters invoices by customer&#39;s email. Admins only. (optional)
   * @param filterFulfillmentStatus Filters invoices by fulfillment status type. Can be a comma separated list of statuses (optional)
   * @param filterPaymentStatus Filters invoices by payment status type. Can be a comma separated list of statuses (optional)
   * @param filterItemName Filters invoices by item name containing the given string (optional)
   * @param filterExternalRef Filters invoices by external reference. (optional)
   * @param filterCreatedDate Filters invoices by creation date. Multiple values possible for range search. Format: filter_created_date&#x3D;OP,ts&amp;... where OP in (GT, LT, GOE, LOE, EQ) and ts is a unix timestamp in seconds. Ex: filter_created_date&#x3D;GT,1452154258,LT,1554254874 (optional)
   * @param filterVendorIds Filters invoices for ones from one of the vendors whose id is in the given comma separated list (optional)
   * @param filterCurrency Filters invoices by currency. ISO3 currency code (optional)
   * @param filterShippingStateName Filters invoices by shipping address: Exact match state name (optional)
   * @param filterShippingCountryName Filters invoices by shipping address: Exact match country name (optional)
   * @param filterShipping Filters invoices by shipping price. Multiple values possible for range search. Format: filter_shipping&#x3D;OP,ts&amp;... where OP in (GT, LT, GOE, LOE, EQ). Ex: filter_shipping&#x3D;GT,14.58,LT,15.54 (optional)
   * @param filterVendorName Filters invoices by vendor name starting with given string (optional)
   * @param filterSku Filters invoices by item sku (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
   * @return Call&lt;PageResourceInvoiceResource&gt;
   */
  @GET("invoices")
  Call<PageResourceInvoiceResource> getInvoices(
    @retrofit2.http.Query("filter_user") Integer filterUser, @retrofit2.http.Query("filter_email") String filterEmail, @retrofit2.http.Query("filter_fulfillment_status") String filterFulfillmentStatus, @retrofit2.http.Query("filter_payment_status") String filterPaymentStatus, @retrofit2.http.Query("filter_item_name") String filterItemName, @retrofit2.http.Query("filter_external_ref") String filterExternalRef, @retrofit2.http.Query("filter_created_date") String filterCreatedDate, @retrofit2.http.Query("filter_vendor_ids") String filterVendorIds, @retrofit2.http.Query("filter_currency") String filterCurrency, @retrofit2.http.Query("filter_shipping_state_name") String filterShippingStateName, @retrofit2.http.Query("filter_shipping_country_name") String filterShippingCountryName, @retrofit2.http.Query("filter_shipping") String filterShipping, @retrofit2.http.Query("filter_vendor_name") String filterVendorName, @retrofit2.http.Query("filter_sku") String filterSku, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Lists available payment statuses
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("invoices/payment-statuses")
  Call<List<String>> getPaymentStatuses();
    

  /**
   * Pay an invoice using a saved payment method
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
   * @param id The id of the invoice (required)
   * @param request The payment method details. Will default to the appropriate user&#39;s wallet in the invoice currency if ommited. (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("invoices/{id}/payments")
  Call<Void> payInvoice(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PayBySavedMethodRequest request
  );

  /**
   * Set the fulfillment status of a bundled invoice item
   * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
   * @param id The id of the invoice (required)
   * @param bundleSku The sku of the bundle in the invoice that contains the given target (required)
   * @param sku The sku of an item in the bundle in the invoice (required)
   * @param status The new fulfillment status for the item. Additional options may be available based on configuration.  Allowable values:  &#39;unfulfilled&#39;, &#39;fulfilled&#39;, &#39;not fulfillable&#39;, &#39;failed&#39;, &#39;processing&#39;, &#39;failed_permanent&#39;, &#39;delayed&#39; (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("invoices/{id}/items/{bundleSku}/bundled-skus/{sku}/fulfillment-status")
  Call<Void> setBundledInvoiceItemFulfillmentStatus(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("bundleSku") String bundleSku, @retrofit2.http.Path("sku") String sku, @retrofit2.http.Body StringWrapper status
  );

  /**
   * Set the external reference of an invoice
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
   * @param id The id of the invoice (required)
   * @param externalRef External reference info (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("invoices/{id}/external-ref")
  Call<Void> setExternalRef(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body StringWrapper externalRef
  );

  /**
   * Set the fulfillment status of an invoice item
   * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
   * @param id The id of the invoice (required)
   * @param sku The sku of an item in the invoice (required)
   * @param status The new fulfillment status for the item. Additional options may be available based on configuration.  Allowable values:  &#39;unfulfilled&#39;, &#39;fulfilled&#39;, &#39;not fulfillable&#39;, &#39;failed&#39;, &#39;processing&#39;, &#39;failed_permanent&#39;, &#39;delayed&#39; (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("invoices/{id}/items/{sku}/fulfillment-status")
  Call<Void> setInvoiceItemFulfillmentStatus(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("sku") String sku, @retrofit2.http.Body StringWrapper status
  );

  /**
   * Set the order notes of an invoice
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
   * @param id The id of the invoice (required)
   * @param orderNotes Payment status info (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("invoices/{id}/order-notes")
  Call<Void> setOrderNotes(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body StringWrapper orderNotes
  );

  /**
   * Set the payment status of an invoice
   * This may trigger fulfillment if setting the status to &#39;paid&#39;. This is mainly intended to support external payment systems that cannot be incorporated into the payment method system. Payment status changes are restricted by a specific flow determining which status can lead to which. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
   * @param id The id of the invoice (required)
   * @param request Payment status info (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("invoices/{id}/payment-status")
  Call<Void> setPaymentStatus(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body InvoicePaymentStatusRequest request
  );

  /**
   * Set or update billing info
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
   * @param id The id of the invoice (required)
   * @param billingInfoRequest Address info (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("invoices/{id}/billing-address")
  Call<Void> updateBillingInfo(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body AddressResource billingInfoRequest
  );

}
