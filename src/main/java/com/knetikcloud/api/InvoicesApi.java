package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T17:55:38.520-04:00")
@Component("com.knetikcloud.api.InvoicesApi")
public class InvoicesApi {
    private ApiClient apiClient;

    public InvoicesApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param req Invoice to be created
     * @return List&lt;InvoiceResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InvoiceResource> createInvoice(InvoiceCreateRequest req) throws RestClientException {
        Object postBody = req;
        
        String path = UriComponentsBuilder.fromPath("/invoices").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<List<InvoiceResource>> returnType = new ParameterizedTypeReference<List<InvoiceResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Lists available fulfillment statuses
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> getFulFillmentStatuses() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/invoices/fulfillment-statuses").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve an invoice
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the invoice
     * @return InvoiceResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceResource getInvoice(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getInvoice");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/invoices/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<InvoiceResource> returnType = new ParameterizedTypeReference<InvoiceResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List invoice logs
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the invoice
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @return PageResourceInvoiceLogEntry
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceInvoiceLogEntry getInvoiceLogs(Integer id, Integer size, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getInvoiceLogs");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/invoices/{id}/logs").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PageResourceInvoiceLogEntry> returnType = new ParameterizedTypeReference<PageResourceInvoiceLogEntry>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve invoices
     * Without INVOICES_ADMIN permission the results are automatically filtered for only the logged in user&#39;s invoices. It is recomended however that filter_user be added to avoid issues for admin users accidentally getting additional invoices.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param filterUser The id of a user to get invoices for. Automtically added if not being called with admin permissions.
     * @param filterEmail Filters invoices by customer&#39;s email. Admins only.
     * @param filterFulfillmentStatus Filters invoices by fulfillment status type. Can be a comma separated list of statuses
     * @param filterPaymentStatus Filters invoices by payment status type. Can be a comma separated list of statuses
     * @param filterItemName Filters invoices by item name containing the given string
     * @param filterExternalRef Filters invoices by external reference.
     * @param filterCreatedDate Filters invoices by creation date. Multiple values possible for range search. Format: filter_created_date&#x3D;OP,ts&amp;... where OP in (GT, LT, GOE, LOE, EQ) and ts is a unix timestamp in seconds. Ex: filter_created_date&#x3D;GT,1452154258,LT,1554254874
     * @param filterVendorIds Filters invoices for ones from one of the vendors whose id is in the given comma separated list
     * @param filterCurrency Filters invoices by currency. ISO3 currency code
     * @param filterShippingStateName Filters invoices by shipping address: Exact match state name
     * @param filterShippingCountryName Filters invoices by shipping address: Exact match country name
     * @param filterShipping Filters invoices by shipping price. Multiple values possible for range search. Format: filter_shipping&#x3D;OP,ts&amp;... where OP in (GT, LT, GOE, LOE, EQ). Ex: filter_shipping&#x3D;GT,14.58,LT,15.54
     * @param filterVendorName Filters invoices by vendor name starting with given string
     * @param filterSku Filters invoices by item sku
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceInvoiceResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceInvoiceResource getInvoices(Integer filterUser, String filterEmail, String filterFulfillmentStatus, String filterPaymentStatus, String filterItemName, String filterExternalRef, String filterCreatedDate, String filterVendorIds, String filterCurrency, String filterShippingStateName, String filterShippingCountryName, String filterShipping, String filterVendorName, String filterSku, Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/invoices").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_user", filterUser));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_email", filterEmail));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_fulfillment_status", filterFulfillmentStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_payment_status", filterPaymentStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_item_name", filterItemName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_external_ref", filterExternalRef));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_created_date", filterCreatedDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_vendor_ids", filterVendorIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_currency", filterCurrency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_shipping_state_name", filterShippingStateName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_shipping_country_name", filterShippingCountryName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_shipping", filterShipping));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_vendor_name", filterVendorName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_sku", filterSku));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PageResourceInvoiceResource> returnType = new ParameterizedTypeReference<PageResourceInvoiceResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Lists available payment statuses
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> getPaymentStatuses() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/invoices/payment-statuses").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Pay an invoice using a saved payment method
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the invoice
     * @param request The payment method details. Will default to the appropriate user&#39;s wallet in the invoice currency if ommited.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void payInvoice(Integer id, PayBySavedMethodRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling payInvoice");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/invoices/{id}/payments").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set the fulfillment status of a bundled invoice item
     * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the invoice
     * @param bundleSku The sku of the bundle in the invoice that contains the given target
     * @param sku The sku of an item in the bundle in the invoice
     * @param status The new fulfillment status for the item. Additional options may be available based on configuration.  Allowable values:  &#39;unfulfilled&#39;, &#39;fulfilled&#39;, &#39;not fulfillable&#39;, &#39;failed&#39;, &#39;processing&#39;, &#39;failed_permanent&#39;, &#39;delayed&#39;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setBundledInvoiceItemFulfillmentStatus(Integer id, String bundleSku, String sku, StringWrapper status) throws RestClientException {
        Object postBody = status;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling setBundledInvoiceItemFulfillmentStatus");
        }
        
        // verify the required parameter 'bundleSku' is set
        if (bundleSku == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bundleSku' when calling setBundledInvoiceItemFulfillmentStatus");
        }
        
        // verify the required parameter 'sku' is set
        if (sku == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sku' when calling setBundledInvoiceItemFulfillmentStatus");
        }
        
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'status' when calling setBundledInvoiceItemFulfillmentStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("bundleSku", bundleSku);
        uriVariables.put("sku", sku);
        String path = UriComponentsBuilder.fromPath("/invoices/{id}/items/{bundleSku}/bundled-skus/{sku}/fulfillment-status").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set the external reference of an invoice
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the invoice
     * @param externalRef External reference info
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setExternalRef(Integer id, StringWrapper externalRef) throws RestClientException {
        Object postBody = externalRef;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling setExternalRef");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/invoices/{id}/external-ref").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set the fulfillment status of an invoice item
     * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the invoice
     * @param sku The sku of an item in the invoice
     * @param status The new fulfillment status for the item. Additional options may be available based on configuration.  Allowable values:  &#39;unfulfilled&#39;, &#39;fulfilled&#39;, &#39;not fulfillable&#39;, &#39;failed&#39;, &#39;processing&#39;, &#39;failed_permanent&#39;, &#39;delayed&#39;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setInvoiceItemFulfillmentStatus(Integer id, String sku, StringWrapper status) throws RestClientException {
        Object postBody = status;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling setInvoiceItemFulfillmentStatus");
        }
        
        // verify the required parameter 'sku' is set
        if (sku == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sku' when calling setInvoiceItemFulfillmentStatus");
        }
        
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'status' when calling setInvoiceItemFulfillmentStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("sku", sku);
        String path = UriComponentsBuilder.fromPath("/invoices/{id}/items/{sku}/fulfillment-status").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set the order notes of an invoice
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the invoice
     * @param orderNotes Payment status info
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setOrderNotes(Integer id, StringWrapper orderNotes) throws RestClientException {
        Object postBody = orderNotes;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling setOrderNotes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/invoices/{id}/order-notes").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set the payment status of an invoice
     * This may trigger fulfillment if setting the status to &#39;paid&#39;. This is mainly intended to support external payment systems that cannot be incorporated into the payment method system. Payment status changes are restricted by a specific flow determining which status can lead to which.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the invoice
     * @param request Payment status info
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setPaymentStatus(Integer id, InvoicePaymentStatusRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling setPaymentStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/invoices/{id}/payment-status").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set or update billing info
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the invoice
     * @param billingInfoRequest Address info
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateBillingInfo(Integer id, AddressResource billingInfoRequest) throws RestClientException {
        Object postBody = billingInfoRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateBillingInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/invoices/{id}/billing-address").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
