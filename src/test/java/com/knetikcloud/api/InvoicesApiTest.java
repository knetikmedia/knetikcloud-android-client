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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoicesApi
 */
public class InvoicesApiTest {

    private InvoicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(InvoicesApi.class);
    }

    /**
     * Create an invoice
     *
     * Create an invoice(s) by providing a cart GUID. Note that there may be multiple invoices created, one per vendor. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER or INVOICES_ADMIN
     */
    @Test
    public void createInvoiceTest() {
        InvoiceCreateRequest req = null;
        // List<InvoiceResource> response = api.createInvoice(req);

        // TODO: test validations
    }
    /**
     * Lists available fulfillment statuses
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getFulFillmentStatusesTest() {
        // List<String> response = api.getFulFillmentStatuses();

        // TODO: test validations
    }
    /**
     * Retrieve an invoice
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
     */
    @Test
    public void getInvoiceTest() {
        Integer id = null;
        // InvoiceResource response = api.getInvoice(id);

        // TODO: test validations
    }
    /**
     * List invoice logs
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
     */
    @Test
    public void getInvoiceLogsTest() {
        Integer id = null;
        Integer size = null;
        Integer page = null;
        // PageResourceInvoiceLogEntry response = api.getInvoiceLogs(id, size, page);

        // TODO: test validations
    }
    /**
     * Retrieve invoices
     *
     * Without INVOICES_ADMIN permission the results are automatically filtered for only the logged in user&#39;s invoices. It is recomended however that filter_user be added to avoid issues for admin users accidentally getting additional invoices. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
     */
    @Test
    public void getInvoicesTest() {
        Integer filterUser = null;
        String filterEmail = null;
        String filterFulfillmentStatus = null;
        String filterPaymentStatus = null;
        String filterItemName = null;
        String filterExternalRef = null;
        String filterCreatedDate = null;
        String filterVendorIds = null;
        String filterCurrency = null;
        String filterShippingStateName = null;
        String filterShippingCountryName = null;
        String filterShipping = null;
        String filterVendorName = null;
        String filterSku = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceInvoiceResource response = api.getInvoices(filterUser, filterEmail, filterFulfillmentStatus, filterPaymentStatus, filterItemName, filterExternalRef, filterCreatedDate, filterVendorIds, filterCurrency, filterShippingStateName, filterShippingCountryName, filterShipping, filterVendorName, filterSku, size, page, order);

        // TODO: test validations
    }
    /**
     * Lists available payment statuses
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getPaymentStatusesTest() {
        // List<String> response = api.getPaymentStatuses();

        // TODO: test validations
    }
    /**
     * Pay an invoice using a saved payment method
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
     */
    @Test
    public void payInvoiceTest() {
        Integer id = null;
        PayBySavedMethodRequest request = null;
        // Void response = api.payInvoice(id, request);

        // TODO: test validations
    }
    /**
     * Set the fulfillment status of a bundled invoice item
     *
     * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
     */
    @Test
    public void setBundledInvoiceItemFulfillmentStatusTest() {
        Integer id = null;
        String bundleSku = null;
        String sku = null;
        StringWrapper status = null;
        // Void response = api.setBundledInvoiceItemFulfillmentStatus(id, bundleSku, sku, status);

        // TODO: test validations
    }
    /**
     * Set the external reference of an invoice
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
     */
    @Test
    public void setExternalRefTest() {
        Integer id = null;
        StringWrapper externalRef = null;
        // Void response = api.setExternalRef(id, externalRef);

        // TODO: test validations
    }
    /**
     * Set the fulfillment status of an invoice item
     *
     * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
     */
    @Test
    public void setInvoiceItemFulfillmentStatusTest() {
        Integer id = null;
        String sku = null;
        StringWrapper status = null;
        // Void response = api.setInvoiceItemFulfillmentStatus(id, sku, status);

        // TODO: test validations
    }
    /**
     * Set the order notes of an invoice
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
     */
    @Test
    public void setOrderNotesTest() {
        Integer id = null;
        StringWrapper orderNotes = null;
        // Void response = api.setOrderNotes(id, orderNotes);

        // TODO: test validations
    }
    /**
     * Set the payment status of an invoice
     *
     * This may trigger fulfillment if setting the status to &#39;paid&#39;. This is mainly intended to support external payment systems that cannot be incorporated into the payment method system. Payment status changes are restricted by a specific flow determining which status can lead to which. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
     */
    @Test
    public void setPaymentStatusTest() {
        Integer id = null;
        InvoicePaymentStatusRequest request = null;
        // Void response = api.setPaymentStatus(id, request);

        // TODO: test validations
    }
    /**
     * Set or update billing info
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
     */
    @Test
    public void updateBillingInfoTest() {
        Integer id = null;
        AddressResource billingInfoRequest = null;
        // Void response = api.updateBillingInfo(id, billingInfoRequest);

        // TODO: test validations
    }
}
