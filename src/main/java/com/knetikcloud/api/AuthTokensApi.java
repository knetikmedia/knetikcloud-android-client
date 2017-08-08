/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.api;

import com.knetikcloud.client.ApiCallback;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiResponse;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;
import com.knetikcloud.client.ProgressRequestBody;
import com.knetikcloud.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.knetikcloud.model.OauthAccessTokenResource;
import com.knetikcloud.model.PageResourceOauthAccessTokenResource;
import com.knetikcloud.model.Result;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthTokensApi {
    private ApiClient apiClient;

    public AuthTokensApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthTokensApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteTokens
     * @param username The username of the user (optional)
     * @param clientId The id of the client (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTokensCall(String username, String clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/auth/tokens";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (username != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
        if (clientId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTokensValidateBeforeCall(String username, String clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = deleteTokensCall(username, clientId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete tokens by username, client id, or both
     * 
     * @param username The username of the user (optional)
     * @param clientId The id of the client (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTokens(String username, String clientId) throws ApiException {
        deleteTokensWithHttpInfo(username, clientId);
    }

    /**
     * Delete tokens by username, client id, or both
     * 
     * @param username The username of the user (optional)
     * @param clientId The id of the client (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTokensWithHttpInfo(String username, String clientId) throws ApiException {
        com.squareup.okhttp.Call call = deleteTokensValidateBeforeCall(username, clientId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete tokens by username, client id, or both (asynchronously)
     * 
     * @param username The username of the user (optional)
     * @param clientId The id of the client (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTokensAsync(String username, String clientId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteTokensValidateBeforeCall(username, clientId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getToken
     * @param username The username of the user (required)
     * @param clientId The id of the client (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTokenCall(String username, String clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/auth/tokens/{username}/{client_id}"
            .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
            .replaceAll("\\{" + "client_id" + "\\}", apiClient.escapeString(clientId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTokenValidateBeforeCall(String username, String clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getToken(Async)");
        }
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling getToken(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getTokenCall(username, clientId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a single token by username and client id
     * 
     * @param username The username of the user (required)
     * @param clientId The id of the client (required)
     * @return OauthAccessTokenResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthAccessTokenResource getToken(String username, String clientId) throws ApiException {
        ApiResponse<OauthAccessTokenResource> resp = getTokenWithHttpInfo(username, clientId);
        return resp.getData();
    }

    /**
     * Get a single token by username and client id
     * 
     * @param username The username of the user (required)
     * @param clientId The id of the client (required)
     * @return ApiResponse&lt;OauthAccessTokenResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OauthAccessTokenResource> getTokenWithHttpInfo(String username, String clientId) throws ApiException {
        com.squareup.okhttp.Call call = getTokenValidateBeforeCall(username, clientId, null, null);
        Type localVarReturnType = new TypeToken<OauthAccessTokenResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a single token by username and client id (asynchronously)
     * 
     * @param username The username of the user (required)
     * @param clientId The id of the client (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTokenAsync(String username, String clientId, final ApiCallback<OauthAccessTokenResource> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTokenValidateBeforeCall(username, clientId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OauthAccessTokenResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTokens
     * @param filterClientId Filters for token whose client id matches provided string (optional)
     * @param filterUsername Filters for token whose username matches provided string (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTokensCall(String filterClientId, String filterUsername, Integer size, Integer page, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/auth/tokens";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filterClientId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_client_id", filterClientId));
        if (filterUsername != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_username", filterUsername));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTokensValidateBeforeCall(String filterClientId, String filterUsername, Integer size, Integer page, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getTokensCall(filterClientId, filterUsername, size, page, order, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List usernames and client ids
     * Token value not shown
     * @param filterClientId Filters for token whose client id matches provided string (optional)
     * @param filterUsername Filters for token whose username matches provided string (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
     * @return PageResourceOauthAccessTokenResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageResourceOauthAccessTokenResource getTokens(String filterClientId, String filterUsername, Integer size, Integer page, String order) throws ApiException {
        ApiResponse<PageResourceOauthAccessTokenResource> resp = getTokensWithHttpInfo(filterClientId, filterUsername, size, page, order);
        return resp.getData();
    }

    /**
     * List usernames and client ids
     * Token value not shown
     * @param filterClientId Filters for token whose client id matches provided string (optional)
     * @param filterUsername Filters for token whose username matches provided string (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
     * @return ApiResponse&lt;PageResourceOauthAccessTokenResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageResourceOauthAccessTokenResource> getTokensWithHttpInfo(String filterClientId, String filterUsername, Integer size, Integer page, String order) throws ApiException {
        com.squareup.okhttp.Call call = getTokensValidateBeforeCall(filterClientId, filterUsername, size, page, order, null, null);
        Type localVarReturnType = new TypeToken<PageResourceOauthAccessTokenResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List usernames and client ids (asynchronously)
     * Token value not shown
     * @param filterClientId Filters for token whose client id matches provided string (optional)
     * @param filterUsername Filters for token whose username matches provided string (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTokensAsync(String filterClientId, String filterUsername, Integer size, Integer page, String order, final ApiCallback<PageResourceOauthAccessTokenResource> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTokensValidateBeforeCall(filterClientId, filterUsername, size, page, order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageResourceOauthAccessTokenResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
