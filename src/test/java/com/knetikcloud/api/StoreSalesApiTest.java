package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.CatalogSale;
import com.knetikcloud.model.PageResourceCatalogSale;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreSalesApi
 */
public class StoreSalesApiTest {

    private StoreSalesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StoreSalesApi.class);
    }

    /**
     * Create a sale
     *
     * 
     */
    @Test
    public void createCatalogSaleTest() {
        CatalogSale catalogSale = null;
        // CatalogSale response = api.createCatalogSale(catalogSale);

        // TODO: test validations
    }
    /**
     * Delete a sale
     *
     * 
     */
    @Test
    public void deleteCatalogSaleTest() {
        Integer id = null;
        // Void response = api.deleteCatalogSale(id);

        // TODO: test validations
    }
    /**
     * Get a single sale
     *
     * 
     */
    @Test
    public void getCatalogSaleTest() {
        Integer id = null;
        // CatalogSale response = api.getCatalogSale(id);

        // TODO: test validations
    }
    /**
     * List and search sales
     *
     * 
     */
    @Test
    public void getCatalogSalesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceCatalogSale response = api.getCatalogSales(size, page, order);

        // TODO: test validations
    }
    /**
     * Update a sale
     *
     * 
     */
    @Test
    public void updateCatalogSaleTest() {
        Integer id = null;
        CatalogSale catalogSale = null;
        // CatalogSale response = api.updateCatalogSale(id, catalogSale);

        // TODO: test validations
    }
}
