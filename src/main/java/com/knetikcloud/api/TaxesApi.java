package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.CountryTaxResource;
import com.knetikcloud.model.PageResourceCountryTaxResource;
import com.knetikcloud.model.PageResourceStateTaxResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StateTaxResource;

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
@Component("com.knetikcloud.api.TaxesApi")
public class TaxesApi {
    private ApiClient apiClient;

    public TaxesApi() {
        this(new ApiClient());
    }

    @Autowired
    public TaxesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a country tax
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param taxResource The tax object
     * @return CountryTaxResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CountryTaxResource createCountryTax(CountryTaxResource taxResource) throws RestClientException {
        Object postBody = taxResource;
        
        String path = UriComponentsBuilder.fromPath("/tax/countries").build().toUriString();
        
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

        ParameterizedTypeReference<CountryTaxResource> returnType = new ParameterizedTypeReference<CountryTaxResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a state tax
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param countryCodeIso3 The iso3 code of the country
     * @param taxResource The tax object
     * @return StateTaxResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StateTaxResource createStateTax(String countryCodeIso3, StateTaxResource taxResource) throws RestClientException {
        Object postBody = taxResource;
        
        // verify the required parameter 'countryCodeIso3' is set
        if (countryCodeIso3 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCodeIso3' when calling createStateTax");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code_iso3", countryCodeIso3);
        String path = UriComponentsBuilder.fromPath("/tax/countries/{country_code_iso3}/states").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<StateTaxResource> returnType = new ParameterizedTypeReference<StateTaxResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete an existing tax
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param countryCodeIso3 The iso3 code of the country
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCountryTax(String countryCodeIso3) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'countryCodeIso3' is set
        if (countryCodeIso3 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCodeIso3' when calling deleteCountryTax");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code_iso3", countryCodeIso3);
        String path = UriComponentsBuilder.fromPath("/tax/countries/{country_code_iso3}").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete an existing state tax
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param countryCodeIso3 The iso3 code of the country
     * @param stateCode The code of the state
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteStateTax(String countryCodeIso3, String stateCode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'countryCodeIso3' is set
        if (countryCodeIso3 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCodeIso3' when calling deleteStateTax");
        }
        
        // verify the required parameter 'stateCode' is set
        if (stateCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stateCode' when calling deleteStateTax");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code_iso3", countryCodeIso3);
        uriVariables.put("state_code", stateCode);
        String path = UriComponentsBuilder.fromPath("/tax/countries/{country_code_iso3}/states/{state_code}").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a single tax
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param countryCodeIso3 The iso3 code of the country
     * @return CountryTaxResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CountryTaxResource getCountryTax(String countryCodeIso3) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'countryCodeIso3' is set
        if (countryCodeIso3 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCodeIso3' when calling getCountryTax");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code_iso3", countryCodeIso3);
        String path = UriComponentsBuilder.fromPath("/tax/countries/{country_code_iso3}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CountryTaxResource> returnType = new ParameterizedTypeReference<CountryTaxResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List and search taxes
     * Get a list of taxes
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param size The number of objects returned per page
     * @param page The number of the page returned
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceCountryTaxResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceCountryTaxResource getCountryTaxes(Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/tax/countries").build().toUriString();
        
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

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PageResourceCountryTaxResource> returnType = new ParameterizedTypeReference<PageResourceCountryTaxResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a single state tax
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param countryCodeIso3 The iso3 code of the country
     * @param stateCode The code of the state
     * @return StateTaxResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StateTaxResource getStateTax(String countryCodeIso3, String stateCode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'countryCodeIso3' is set
        if (countryCodeIso3 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCodeIso3' when calling getStateTax");
        }
        
        // verify the required parameter 'stateCode' is set
        if (stateCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stateCode' when calling getStateTax");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code_iso3", countryCodeIso3);
        uriVariables.put("state_code", stateCode);
        String path = UriComponentsBuilder.fromPath("/tax/countries/{country_code_iso3}/states/{state_code}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<StateTaxResource> returnType = new ParameterizedTypeReference<StateTaxResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List and search taxes across all countries
     * Get a list of taxes
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param size The number of objects returned per page
     * @param page The number of the page returned
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceStateTaxResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceStateTaxResource getStateTaxesForCountries(Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/tax/states").build().toUriString();
        
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

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PageResourceStateTaxResource> returnType = new ParameterizedTypeReference<PageResourceStateTaxResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List and search taxes within a country
     * Get a list of taxes
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param countryCodeIso3 The iso3 code of the country
     * @param size The number of objects returned per page
     * @param page The number of the page returned
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceStateTaxResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceStateTaxResource getStateTaxesForCountry(String countryCodeIso3, Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'countryCodeIso3' is set
        if (countryCodeIso3 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCodeIso3' when calling getStateTaxesForCountry");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code_iso3", countryCodeIso3);
        String path = UriComponentsBuilder.fromPath("/tax/countries/{country_code_iso3}/states").buildAndExpand(uriVariables).toUriString();
        
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

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PageResourceStateTaxResource> returnType = new ParameterizedTypeReference<PageResourceStateTaxResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create or update a tax
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param countryCodeIso3 The iso3 code of the country
     * @param taxResource The tax object
     * @return CountryTaxResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CountryTaxResource updateCountryTax(String countryCodeIso3, CountryTaxResource taxResource) throws RestClientException {
        Object postBody = taxResource;
        
        // verify the required parameter 'countryCodeIso3' is set
        if (countryCodeIso3 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCodeIso3' when calling updateCountryTax");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code_iso3", countryCodeIso3);
        String path = UriComponentsBuilder.fromPath("/tax/countries/{country_code_iso3}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CountryTaxResource> returnType = new ParameterizedTypeReference<CountryTaxResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create or update a state tax
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param countryCodeIso3 The iso3 code of the country
     * @param stateCode The code of the state
     * @param taxResource The tax object
     * @return StateTaxResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StateTaxResource updateStateTax(String countryCodeIso3, String stateCode, StateTaxResource taxResource) throws RestClientException {
        Object postBody = taxResource;
        
        // verify the required parameter 'countryCodeIso3' is set
        if (countryCodeIso3 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCodeIso3' when calling updateStateTax");
        }
        
        // verify the required parameter 'stateCode' is set
        if (stateCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stateCode' when calling updateStateTax");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code_iso3", countryCodeIso3);
        uriVariables.put("state_code", stateCode);
        String path = UriComponentsBuilder.fromPath("/tax/countries/{country_code_iso3}/states/{state_code}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<StateTaxResource> returnType = new ParameterizedTypeReference<StateTaxResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
