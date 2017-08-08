package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.PageResourceSimpleWallet;
import com.knetikcloud.model.PageResourceWalletTotalResponse;
import com.knetikcloud.model.PageResourceWalletTransactionResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SimpleWallet;
import com.knetikcloud.model.WalletAlterRequest;
import com.knetikcloud.model.WalletTransactionResource;

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
@Component("com.knetikcloud.api.PaymentsWalletsApi")
public class PaymentsWalletsApi {
    private ApiClient apiClient;

    public PaymentsWalletsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentsWalletsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns the user&#39;s wallet for the given currency code
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The ID of the user for whom wallet is being retrieved
     * @param currencyCode Currency code of the user&#39;s wallet
     * @return SimpleWallet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SimpleWallet getUserWallet(Integer userId, String currencyCode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserWallet");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyCode' when calling getUserWallet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("currency_code", currencyCode);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/wallets/{currency_code}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<SimpleWallet> returnType = new ParameterizedTypeReference<SimpleWallet>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve a user&#39;s wallet transactions
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The ID of the user for whom wallet transactions are being retrieved
     * @param currencyCode Currency code of the user&#39;s wallet
     * @param filterType Filter for transactions with specified type
     * @param filterMaxDate Filter for transactions from no earlier than the specified date as a unix timestamp in seconds
     * @param filterMinDate Filter for transactions from no later than the specified date as a unix timestamp in seconds
     * @param filterSign Filter for transactions with amount with the given sign.  Allowable values: (&#39;positive&#39;, &#39;negative&#39;)
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceWalletTransactionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceWalletTransactionResource getUserWalletTransactions(Integer userId, String currencyCode, String filterType, Long filterMaxDate, Long filterMinDate, String filterSign, Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserWalletTransactions");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyCode' when calling getUserWalletTransactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("currency_code", currencyCode);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/wallets/{currency_code}/transactions").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_type", filterType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_max_date", filterMaxDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_min_date", filterMinDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_sign", filterSign));
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

        ParameterizedTypeReference<PageResourceWalletTransactionResource> returnType = new ParameterizedTypeReference<PageResourceWalletTransactionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List all of a user&#39;s wallets
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The ID of the user for whom wallets are being retrieved
     * @return List&lt;SimpleWallet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SimpleWallet> getUserWallets(Integer userId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserWallets");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/wallets").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<SimpleWallet>> returnType = new ParameterizedTypeReference<List<SimpleWallet>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a summation of wallet balances by currency code
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return PageResourceWalletTotalResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceWalletTotalResponse getWalletBalances() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/wallets/totals").build().toUriString();
        
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

        ParameterizedTypeReference<PageResourceWalletTotalResponse> returnType = new ParameterizedTypeReference<PageResourceWalletTotalResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve wallet transactions across the system
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param filterInvoice Filter for transactions from a specific invoice
     * @param filterType Filter for transactions with specified type
     * @param filterDate A comma separated string without spaces.  First value is the operator to search on, second value is the log start date, a unix timestamp in seconds. Can be repeated for a range, eg: GT,123,LT,456  Allowed operators: (GT, LT, EQ, GOE, LOE).
     * @param filterSign Filter for transactions with amount with the given sign
     * @param filterUserId Filter for transactions for specific userId
     * @param filterUsername Filter for transactions for specific username that start with the given string
     * @param filterDetails Filter for transactions for specific details that start with the given string
     * @param filterCurrencyCode Filter for transactions for specific currency code
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceWalletTransactionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceWalletTransactionResource getWalletTransactions(Integer filterInvoice, String filterType, String filterDate, String filterSign, Integer filterUserId, String filterUsername, String filterDetails, String filterCurrencyCode, Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/wallets/transactions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_invoice", filterInvoice));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_type", filterType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_date", filterDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_sign", filterSign));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_user_id", filterUserId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_username", filterUsername));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_details", filterDetails));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_currency_code", filterCurrencyCode));
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

        ParameterizedTypeReference<PageResourceWalletTransactionResource> returnType = new ParameterizedTypeReference<PageResourceWalletTransactionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve a list of wallets across the system
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceSimpleWallet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceSimpleWallet getWallets(Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/wallets").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
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

        ParameterizedTypeReference<PageResourceSimpleWallet> returnType = new ParameterizedTypeReference<PageResourceSimpleWallet>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Updates the balance for a user&#39;s wallet
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The ID of the user for whom wallet is being modified
     * @param currencyCode Currency code of the user&#39;s wallet
     * @param request The requested balance modification to be made to the user&#39;s wallet
     * @return WalletTransactionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WalletTransactionResource updateWalletBalance(Integer userId, String currencyCode, WalletAlterRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateWalletBalance");
        }
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyCode' when calling updateWalletBalance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("currency_code", currencyCode);
        String path = UriComponentsBuilder.fromPath("/users/{user_id}/wallets/{currency_code}/balance").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<WalletTransactionResource> returnType = new ParameterizedTypeReference<WalletTransactionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
