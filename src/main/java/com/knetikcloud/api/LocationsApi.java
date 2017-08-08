package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.CountryResource;
import com.knetikcloud.model.CurrencyResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StateResource;

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
@Component("com.knetikcloud.api.LocationsApi")
public class LocationsApi {
    private ApiClient apiClient;

    public LocationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public LocationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of countries
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return List&lt;CountryResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CountryResource> getCountries() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/location/countries").build().toUriString();
        
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

        ParameterizedTypeReference<List<CountryResource>> returnType = new ParameterizedTypeReference<List<CountryResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get the iso3 code of your country
     * Determined by geo ip location
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String getCountryByGeoLocation() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/location/geolocation/country").build().toUriString();
        
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

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a list of a country&#39;s states
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param countryCodeIso3 The iso3 code of the country
     * @return List&lt;StateResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StateResource> getCountryStates(String countryCodeIso3) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'countryCodeIso3' is set
        if (countryCodeIso3 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCodeIso3' when calling getCountryStates");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code_iso3", countryCodeIso3);
        String path = UriComponentsBuilder.fromPath("/location/countries/{country_code_iso3}/states").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<StateResource>> returnType = new ParameterizedTypeReference<List<StateResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get the currency information of your country
     * Determined by geo ip location, currency to country mapping and a fallback setting
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return CurrencyResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CurrencyResource getCurrencyByGeoLocation() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/location/geolocation/currency").build().toUriString();
        
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

        ParameterizedTypeReference<CurrencyResource> returnType = new ParameterizedTypeReference<CurrencyResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
