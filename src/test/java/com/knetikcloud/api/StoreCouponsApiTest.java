package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.CouponItem;
import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreCouponsApi
 */
public class StoreCouponsApiTest {

    private StoreCouponsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StoreCouponsApi.class);
    }

    /**
     * Create a coupon item
     *
     * SKUs have to be unique in the entire store. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; COUPONS_ADMIN
     */
    @Test
    public void createCouponItemTest() {
        Boolean cascade = null;
        CouponItem couponItem = null;
        // CouponItem response = api.createCouponItem(cascade, couponItem);

        // TODO: test validations
    }
    /**
     * Create a coupon template
     *
     * Coupon Templates define a type of coupon and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void createCouponTemplateTest() {
        ItemTemplateResource couponTemplateResource = null;
        // ItemTemplateResource response = api.createCouponTemplate(couponTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete a coupon item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; COUPONS_ADMIN
     */
    @Test
    public void deleteCouponItemTest() {
        Integer id = null;
        // Void response = api.deleteCouponItem(id);

        // TODO: test validations
    }
    /**
     * Delete a coupon template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void deleteCouponTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteCouponTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single coupon item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; COUPONS_ADMIN
     */
    @Test
    public void getCouponItemTest() {
        Integer id = null;
        // CouponItem response = api.getCouponItem(id);

        // TODO: test validations
    }
    /**
     * Get a coupon by sku
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void getCouponItemBySkuTest() {
        String sku = null;
        // CouponItem response = api.getCouponItemBySku(sku);

        // TODO: test validations
    }
    /**
     * Get a single coupon template
     *
     * Coupon Templates define a type of coupon and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or COUPONS_ADMIN
     */
    @Test
    public void getCouponTemplateTest() {
        String id = null;
        // ItemTemplateResource response = api.getCouponTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search coupon templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or COUPONS_ADMIN
     */
    @Test
    public void getCouponTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceItemTemplateResource response = api.getCouponTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Update a coupon item
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; COUPONS_ADMIN
     */
    @Test
    public void updateCouponItemTest() {
        Integer id = null;
        Boolean cascade = null;
        CouponItem couponItem = null;
        // CouponItem response = api.updateCouponItem(id, cascade, couponItem);

        // TODO: test validations
    }
    /**
     * Update a coupon template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     */
    @Test
    public void updateCouponTemplateTest() {
        String id = null;
        ItemTemplateResource couponTemplateResource = null;
        // ItemTemplateResource response = api.updateCouponTemplate(id, couponTemplateResource);

        // TODO: test validations
    }
}
