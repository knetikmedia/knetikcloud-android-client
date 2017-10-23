package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourcePaymentMethodTypeResource;
import com.knetikcloud.model.PaymentAuthorizationResource;
import com.knetikcloud.model.PaymentMethodResource;
import com.knetikcloud.model.PaymentMethodTypeResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
public class PaymentsApiTest {

    private PaymentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsApi.class);
    }

    /**
     * Create a new payment method for a user
     *
     * 
     */
    @Test
    public void createPaymentMethodTest() {
        Integer userId = null;
        PaymentMethodResource paymentMethod = null;
        // PaymentMethodResource response = api.createPaymentMethod(userId, paymentMethod);

        // TODO: test validations
    }
    /**
     * Delete an existing payment method for a user
     *
     * 
     */
    @Test
    public void deletePaymentMethodTest() {
        Integer userId = null;
        Integer id = null;
        // Void response = api.deletePaymentMethod(userId, id);

        // TODO: test validations
    }
    /**
     * Get a single payment method for a user
     *
     * 
     */
    @Test
    public void getPaymentMethodTest() {
        Integer userId = null;
        Integer id = null;
        // PaymentMethodResource response = api.getPaymentMethod(userId, id);

        // TODO: test validations
    }
    /**
     * Get a single payment method type
     *
     * 
     */
    @Test
    public void getPaymentMethodTypeTest() {
        Integer id = null;
        // PaymentMethodTypeResource response = api.getPaymentMethodType(id);

        // TODO: test validations
    }
    /**
     * Get all payment method types
     *
     * 
     */
    @Test
    public void getPaymentMethodTypesTest() {
        String filterName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourcePaymentMethodTypeResource response = api.getPaymentMethodTypes(filterName, size, page, order);

        // TODO: test validations
    }
    /**
     * Get all payment methods for a user
     *
     * 
     */
    @Test
    public void getPaymentMethodsTest() {
        Integer userId = null;
        String filterName = null;
        String filterPaymentType = null;
        Integer filterPaymentMethodTypeId = null;
        String filterPaymentMethodTypeName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // List<PaymentMethodResource> response = api.getPaymentMethods(userId, filterName, filterPaymentType, filterPaymentMethodTypeId, filterPaymentMethodTypeName, size, page, order);

        // TODO: test validations
    }
    /**
     * Authorize payment of an invoice for later capture
     *
     * 
     */
    @Test
    public void paymentAuthorizationTest() {
        PaymentAuthorizationResource request = null;
        // PaymentAuthorizationResource response = api.paymentAuthorization(request);

        // TODO: test validations
    }
    /**
     * Capture an existing invoice payment authorization
     *
     * 
     */
    @Test
    public void paymentCaptureTest() {
        Integer id = null;
        // Void response = api.paymentCapture(id);

        // TODO: test validations
    }
    /**
     * Update an existing payment method for a user
     *
     * 
     */
    @Test
    public void updatePaymentMethodTest() {
        Integer userId = null;
        Integer id = null;
        PaymentMethodResource paymentMethod = null;
        // PaymentMethodResource response = api.updatePaymentMethod(userId, id, paymentMethod);

        // TODO: test validations
    }
}
