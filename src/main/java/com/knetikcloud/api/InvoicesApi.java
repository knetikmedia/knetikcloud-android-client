package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class InvoicesApi {
  private ApiClient apiClient;

  public InvoicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InvoicesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create an invoice
   * Create an invoice(s) by providing a cart GUID. Note that there may be multiple invoices created, one per vendor.
   * @param req Invoice to be created (optional)
   * @return List<InvoiceResource>
   * @throws ApiException if fails to make API call
   */
  public List<InvoiceResource> createInvoice(InvoiceCreateRequest req) throws ApiException {
    Object localVarPostBody = req;
    
    // create path and map variables
    String localVarPath = "/invoices".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<List<InvoiceResource>> localVarReturnType = new GenericType<List<InvoiceResource>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Lists available fulfillment statuses
   * 
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getFulFillmentStatuses() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/invoices/fulfillment-statuses".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve an invoice
   * 
   * @param id The id of the invoice (required)
   * @return InvoiceResource
   * @throws ApiException if fails to make API call
   */
  public InvoiceResource getInvoice(Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInvoice");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<InvoiceResource> localVarReturnType = new GenericType<InvoiceResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List invoice logs
   * 
   * @param id The id of the invoice (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return PageResourceInvoiceLogEntry
   * @throws ApiException if fails to make API call
   */
  public PageResourceInvoiceLogEntry getInvoiceLogs(Integer id, Integer size, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInvoiceLogs");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}/logs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceInvoiceLogEntry> localVarReturnType = new GenericType<PageResourceInvoiceLogEntry>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve invoices
   * Without INVOICES_ADMIN permission the results are automatically filtered for only the logged in user&#39;s invoices. It is recomended however that filter_user be added to avoid issues for admin users accidentally getting additional invoices.
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
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to 1)
   * @return PageResourceInvoiceResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceInvoiceResource getInvoices(Integer filterUser, String filterEmail, String filterFulfillmentStatus, String filterPaymentStatus, String filterItemName, String filterExternalRef, String filterCreatedDate, String filterVendorIds, String filterCurrency, String filterShippingStateName, String filterShippingCountryName, String filterShipping, String filterVendorName, String filterSku, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/invoices".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_user", filterUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_email", filterEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_fulfillment_status", filterFulfillmentStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_payment_status", filterPaymentStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_item_name", filterItemName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_external_ref", filterExternalRef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_created_date", filterCreatedDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_vendor_ids", filterVendorIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_currency", filterCurrency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_shipping_state_name", filterShippingStateName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_shipping_country_name", filterShippingCountryName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_shipping", filterShipping));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_vendor_name", filterVendorName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_sku", filterSku));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceInvoiceResource> localVarReturnType = new GenericType<PageResourceInvoiceResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Lists available payment statuses
   * 
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getPaymentStatuses() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/invoices/payment-statuses".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Pay an invoice using a saved payment method
   * 
   * @param id The id of the invoice (required)
   * @param request The payment method details. Will default to the appropriate user&#39;s wallet in the invoice currency if ommited. (optional)
   * @throws ApiException if fails to make API call
   */
  public void payInvoice(Integer id, PayBySavedMethodRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling payInvoice");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}/payments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set the fulfillment status of a bundled invoice item
   * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which.
   * @param id The id of the invoice (required)
   * @param bundleSku The sku of the bundle in the invoice that contains the given target (required)
   * @param sku The sku of an item in the bundle in the invoice (required)
   * @param status The new fulfillment status for the item. Additional options may be available based on configuration.  Allowable values:  &#39;unfulfilled&#39;, &#39;fulfilled&#39;, &#39;not fulfillable&#39;, &#39;failed&#39;, &#39;processing&#39;, &#39;failed_permanent&#39;, &#39;delayed&#39; (required)
   * @throws ApiException if fails to make API call
   */
  public void setBundledInvoiceItemFulfillmentStatus(Integer id, String bundleSku, String sku, StringWrapper status) throws ApiException {
    Object localVarPostBody = status;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setBundledInvoiceItemFulfillmentStatus");
    }
    
    // verify the required parameter 'bundleSku' is set
    if (bundleSku == null) {
      throw new ApiException(400, "Missing the required parameter 'bundleSku' when calling setBundledInvoiceItemFulfillmentStatus");
    }
    
    // verify the required parameter 'sku' is set
    if (sku == null) {
      throw new ApiException(400, "Missing the required parameter 'sku' when calling setBundledInvoiceItemFulfillmentStatus");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling setBundledInvoiceItemFulfillmentStatus");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}/items/{bundleSku}/bundled-skus/{sku}/fulfillment-status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "bundleSku" + "\\}", apiClient.escapeString(bundleSku.toString()))
      .replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set the external reference of an invoice
   * 
   * @param id The id of the invoice (required)
   * @param externalRef External reference info (optional)
   * @throws ApiException if fails to make API call
   */
  public void setExternalRef(Integer id, StringWrapper externalRef) throws ApiException {
    Object localVarPostBody = externalRef;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setExternalRef");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}/external-ref".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set the fulfillment status of an invoice item
   * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which.
   * @param id The id of the invoice (required)
   * @param sku The sku of an item in the invoice (required)
   * @param status The new fulfillment status for the item. Additional options may be available based on configuration.  Allowable values:  &#39;unfulfilled&#39;, &#39;fulfilled&#39;, &#39;not fulfillable&#39;, &#39;failed&#39;, &#39;processing&#39;, &#39;failed_permanent&#39;, &#39;delayed&#39; (required)
   * @throws ApiException if fails to make API call
   */
  public void setInvoiceItemFulfillmentStatus(Integer id, String sku, StringWrapper status) throws ApiException {
    Object localVarPostBody = status;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setInvoiceItemFulfillmentStatus");
    }
    
    // verify the required parameter 'sku' is set
    if (sku == null) {
      throw new ApiException(400, "Missing the required parameter 'sku' when calling setInvoiceItemFulfillmentStatus");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling setInvoiceItemFulfillmentStatus");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}/items/{sku}/fulfillment-status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set the order notes of an invoice
   * 
   * @param id The id of the invoice (required)
   * @param orderNotes Payment status info (optional)
   * @throws ApiException if fails to make API call
   */
  public void setOrderNotes(Integer id, StringWrapper orderNotes) throws ApiException {
    Object localVarPostBody = orderNotes;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setOrderNotes");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}/order-notes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set the payment status of an invoice
   * This may trigger fulfillment if setting the status to &#39;paid&#39;. This is mainly intended to support external payment systems that cannot be incorporated into the payment method system. Payment status changes are restricted by a specific flow determining which status can lead to which.
   * @param id The id of the invoice (required)
   * @param request Payment status info (optional)
   * @throws ApiException if fails to make API call
   */
  public void setPaymentStatus(Integer id, InvoicePaymentStatusRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setPaymentStatus");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}/payment-status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set or update billing info
   * 
   * @param id The id of the invoice (required)
   * @param billingInfoRequest Address info (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateBillingInfo(Integer id, AddressResource billingInfoRequest) throws ApiException {
    Object localVarPostBody = billingInfoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateBillingInfo");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}/billing-address".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
