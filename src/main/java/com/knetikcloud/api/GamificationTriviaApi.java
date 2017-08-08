package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;

import com.knetikcloud.model.AnswerResource;
import com.knetikcloud.model.Collectionstring;
import com.knetikcloud.model.DeltaResource;
import com.knetikcloud.model.ImportJobResource;
import com.knetikcloud.model.PageResourceImportJobResource;
import com.knetikcloud.model.PageResourceQuestionResource;
import com.knetikcloud.model.PageResourceQuestionTemplateResource;
import com.knetikcloud.model.QuestionResource;
import com.knetikcloud.model.QuestionTemplateResource;
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
@Component("com.knetikcloud.api.GamificationTriviaApi")
public class GamificationTriviaApi {
    private ApiClient apiClient;

    public GamificationTriviaApi() {
        this(new ApiClient());
    }

    @Autowired
    public GamificationTriviaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add an answer to a question
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param questionId The id of the question
     * @param answer The new answer
     * @return AnswerResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AnswerResource addQuestionAnswers(String questionId, AnswerResource answer) throws RestClientException {
        Object postBody = answer;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling addQuestionAnswers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("question_id", questionId);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/{question_id}/answers").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<AnswerResource> returnType = new ParameterizedTypeReference<AnswerResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Add a tag to a question
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the question
     * @param tag The new tag
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addQuestionTag(String id, StringWrapper tag) throws RestClientException {
        Object postBody = tag;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling addQuestionTag");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/{id}/tags").buildAndExpand(uriVariables).toUriString();
        
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
     * Add a tag to a batch of questions
     * All questions that dont&#39;t have the tag and match filters will have it added. The returned number is the number of questions updated.
     * <p><b>200</b> - The number of records updated
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param tag The tag to add
     * @param filterSearch Filter for documents whose question, answers or tags contains provided string
     * @param filterIdset Filter for documents whose id is in the comma separated list provided
     * @param filterCategory Filter for questions with specified category, by id
     * @param filterTag Filter for questions with specified tag
     * @param filterTagset Filter for questions with specified tags (separated by comma)
     * @param filterType Filter for questions with specified type
     * @param filterPublished Filter for questions currenctly published or not
     * @param filterImportId Filter for questions from a specific import job
     * @return Integer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Integer addTagToQuestionsBatch(StringWrapper tag, String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId) throws RestClientException {
        Object postBody = tag;
        
        String path = UriComponentsBuilder.fromPath("/trivia/questions/tags").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_search", filterSearch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_idset", filterIdset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_category", filterCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tag", filterTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tagset", filterTagset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_type", filterType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_published", filterPublished));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_import_id", filterImportId));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Integer> returnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create an import job
     * Set up a job to import a set of trivia questions from a cvs file at a remote url. the file will be validated asynchronously but will not be processed until started manually with the process endpoint.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param request The new import job
     * @return ImportJobResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImportJobResource createImportJob(ImportJobResource request) throws RestClientException {
        Object postBody = request;
        
        String path = UriComponentsBuilder.fromPath("/trivia/import").build().toUriString();
        
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

        ParameterizedTypeReference<ImportJobResource> returnType = new ParameterizedTypeReference<ImportJobResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a question
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param question The new question
     * @return QuestionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public QuestionResource createQuestion(QuestionResource question) throws RestClientException {
        Object postBody = question;
        
        String path = UriComponentsBuilder.fromPath("/trivia/questions").build().toUriString();
        
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

        ParameterizedTypeReference<QuestionResource> returnType = new ParameterizedTypeReference<QuestionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a question template
     * Question templates define a type of question and the properties they have
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param questionTemplateResource The question template resource object
     * @return QuestionTemplateResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public QuestionTemplateResource createQuestionTemplate(QuestionTemplateResource questionTemplateResource) throws RestClientException {
        Object postBody = questionTemplateResource;
        
        String path = UriComponentsBuilder.fromPath("/trivia/questions/templates").build().toUriString();
        
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

        ParameterizedTypeReference<QuestionTemplateResource> returnType = new ParameterizedTypeReference<QuestionTemplateResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete an import job
     * Also deletes all questions that were imported by it
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the job
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteImportJob(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteImportJob");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/import/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a question
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the question
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteQuestion(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteQuestion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Remove an answer from a question
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param questionId The id of the question
     * @param id The id of the answer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteQuestionAnswers(String questionId, String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling deleteQuestionAnswers");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteQuestionAnswers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("question_id", questionId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/{question_id}/answers/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a question template
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the template
     * @param cascade The value needed to delete used templates
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteQuestionTemplate(String id, String cascade) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteQuestionTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/templates/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cascade", cascade));

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
     * Get an import job
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the job
     * @return ImportJobResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImportJobResource getImportJob(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getImportJob");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/import/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ImportJobResource> returnType = new ParameterizedTypeReference<ImportJobResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a list of import job
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param filterVendor Filter for jobs by vendor id
     * @param filterCategory Filter for jobs by category id
     * @param filterName Filter for jobs which name *STARTS* with the given string
     * @param filterStatus Filter for jobs that are in a specific set of statuses (comma separated)
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceImportJobResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceImportJobResource getImportJobs(String filterVendor, String filterCategory, String filterName, String filterStatus, Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/trivia/import").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_vendor", filterVendor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_category", filterCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_status", filterStatus));
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

        ParameterizedTypeReference<PageResourceImportJobResource> returnType = new ParameterizedTypeReference<PageResourceImportJobResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a single question
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the question
     * @return QuestionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public QuestionResource getQuestion(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getQuestion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<QuestionResource> returnType = new ParameterizedTypeReference<QuestionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get an answer for a question
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param questionId The id of the question
     * @param id The id of the answer
     * @return AnswerResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AnswerResource getQuestionAnswer(String questionId, String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling getQuestionAnswer");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getQuestionAnswer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("question_id", questionId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/{question_id}/answers/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<AnswerResource> returnType = new ParameterizedTypeReference<AnswerResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List the answers available for a question
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param questionId The id of the question
     * @return List&lt;AnswerResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AnswerResource> getQuestionAnswers(String questionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling getQuestionAnswers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("question_id", questionId);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/{question_id}/answers").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<AnswerResource>> returnType = new ParameterizedTypeReference<List<AnswerResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List question deltas in ascending order of updated date
     * The &#39;since&#39; parameter is important to avoid getting a full list of all questions. Implementors should make sure they pass the updated date of the last resource loaded, not the date of the last request, in order to avoid gaps
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param since Timestamp in seconds
     * @return List&lt;DeltaResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DeltaResource> getQuestionDeltas(Long since) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/trivia/questions/delta").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<List<DeltaResource>> returnType = new ParameterizedTypeReference<List<DeltaResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List the tags for a question
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the question
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> getQuestionTags(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getQuestionTags");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/{id}/tags").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a single question template
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the template
     * @return QuestionTemplateResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public QuestionTemplateResource getQuestionTemplate(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getQuestionTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/templates/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<QuestionTemplateResource> returnType = new ParameterizedTypeReference<QuestionTemplateResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List and search question templates
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @return PageResourceQuestionTemplateResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceQuestionTemplateResource getQuestionTemplates(Integer size, Integer page, String order) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/trivia/questions/templates").build().toUriString();
        
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

        ParameterizedTypeReference<PageResourceQuestionTemplateResource> returnType = new ParameterizedTypeReference<PageResourceQuestionTemplateResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List and search questions
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param size The number of objects returned per page
     * @param page The number of the page returned, starting with 1
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
     * @param filterSearch Filter for documents whose question, answers or tags contains provided string
     * @param filterIdset Filter for documents whose id is in the comma separated list provided
     * @param filterCategory Filter for questions with specified category, by id
     * @param filterTagset Filter for questions with specified tags (separated by comma)
     * @param filterTag Filter for questions with specified tag
     * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;)
     * @param filterPublished Filter for questions currenctly published or not
     * @param filterImportId Filter for questions from a specific import job
     * @return PageResourceQuestionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageResourceQuestionResource getQuestions(Integer size, Integer page, String order, String filterSearch, String filterIdset, String filterCategory, String filterTagset, String filterTag, String filterType, Boolean filterPublished, Long filterImportId) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/trivia/questions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_search", filterSearch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_idset", filterIdset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_category", filterCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tagset", filterTagset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tag", filterTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_type", filterType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_published", filterPublished));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_import_id", filterImportId));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PageResourceQuestionResource> returnType = new ParameterizedTypeReference<PageResourceQuestionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Count questions based on filters
     * This is also provided by the list endpoint so you don&#39;t need to call this for pagination purposes
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param filterSearch Filter for documents whose question, answers or tags contains provided string
     * @param filterIdset Filter for documents whose id is in the comma separated list provided
     * @param filterCategory Filter for questions with specified category, by id
     * @param filterTag Filter for questions with specified tag
     * @param filterTagset Filter for questions with specified tags (separated by comma)
     * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;)
     * @param filterPublished Filter for questions currenctly published or not
     * @return Long
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Long getQuestionsCount(String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/trivia/questions/count").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_search", filterSearch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_idset", filterIdset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_category", filterCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tag", filterTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tagset", filterTagset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_type", filterType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_published", filterPublished));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Long> returnType = new ParameterizedTypeReference<Long>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Start processing an import job
     * Will process the CSV file and add new questions asynchronously. The status of the job must be &#39;VALID&#39;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the job
     * @param publishNow Whether the new questions should be published live immediately
     * @return ImportJobResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImportJobResource processImportJob(Long id, Boolean publishNow) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling processImportJob");
        }
        
        // verify the required parameter 'publishNow' is set
        if (publishNow == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'publishNow' when calling processImportJob");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/import/{id}/process").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "publish_now", publishNow));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<ImportJobResource> returnType = new ParameterizedTypeReference<ImportJobResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Remove a tag from a question
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the question
     * @param tag The tag to remove
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void removeQuestionTag(String id, String tag) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling removeQuestionTag");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tag' when calling removeQuestionTag");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("tag", tag);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/{id}/tags/{tag}").buildAndExpand(uriVariables).toUriString();
        
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
     * Remove a tag from a batch of questions
     * ll questions that have the tag and match filters will have it removed. The returned number is the number of questions updated.
     * <p><b>200</b> - The number of records updated
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param tag The tag to remove
     * @param filterSearch Filter for documents whose question, answers or tags contains provided string
     * @param filterIdset Filter for documents whose id is in the comma separated list provided
     * @param filterCategory Filter for questions with specified category, by id
     * @param filterTag Filter for questions with specified tag
     * @param filterTagset Filter for questions with specified tags (separated by comma)
     * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;)
     * @param filterPublished Filter for questions currenctly published or not
     * @param filterImportId Filter for questions from a specific import job
     * @return Integer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Integer removeTagToQuestionsBatch(String tag, String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tag' when calling removeTagToQuestionsBatch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tag", tag);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/tags/{tag}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_search", filterSearch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_idset", filterIdset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_category", filterCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tag", filterTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tagset", filterTagset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_type", filterType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_published", filterPublished));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_import_id", filterImportId));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Integer> returnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List and search tags by the beginning of the string
     * For performance reasons, search &amp; category filters are mutually exclusive. If category is specified, search filter will be ignored in order to do fast matches for typeahead.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param filterSearch Filter for tags starting with the given text
     * @param filterCategory Filter for tags on questions from a specific category
     * @param filterImportId Filter for tags on questions from a specific import job
     * @return Collectionstring
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Collectionstring searchQuestionTags(String filterSearch, String filterCategory, Long filterImportId) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/trivia/tags").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_search", filterSearch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_category", filterCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_import_id", filterImportId));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Collectionstring> returnType = new ParameterizedTypeReference<Collectionstring>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update an import job
     * Changes should be made before process is started for there to be any effect.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the job
     * @param request The updated job
     * @return ImportJobResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImportJobResource updateImportJob(Long id, ImportJobResource request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateImportJob");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/import/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ImportJobResource> returnType = new ParameterizedTypeReference<ImportJobResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a question
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the question
     * @param question The updated question
     * @return QuestionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public QuestionResource updateQuestion(String id, QuestionResource question) throws RestClientException {
        Object postBody = question;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateQuestion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<QuestionResource> returnType = new ParameterizedTypeReference<QuestionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update an answer for a question
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param questionId The id of the question
     * @param id The id of the answer
     * @param answer The updated answer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateQuestionAnswer(String questionId, String id, AnswerResource answer) throws RestClientException {
        Object postBody = answer;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling updateQuestionAnswer");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateQuestionAnswer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("question_id", questionId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/{question_id}/answers/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Update a question template
     * 
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id The id of the template
     * @param questionTemplateResource The question template resource object
     * @return QuestionTemplateResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public QuestionTemplateResource updateQuestionTemplate(String id, QuestionTemplateResource questionTemplateResource) throws RestClientException {
        Object postBody = questionTemplateResource;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateQuestionTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/trivia/questions/templates/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<QuestionTemplateResource> returnType = new ParameterizedTypeReference<QuestionTemplateResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Bulk update questions
     * Will update all questions that match filters used (or all questions in system if no filters used). Body should match a question resource with only those properties you wish to set. Null values will be ignored. Returned number is how many were updated.
     * <p><b>200</b> - The number of records updated
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param question New values for a set of question fields
     * @param filterSearch Filter for documents whose question, answers or tags contains provided string
     * @param filterIdset Filter for documents whose id is in the comma separated list provided
     * @param filterCategory Filter for questions with specified category, by id
     * @param filterTagset Filter for questions with specified tags (separated by comma)
     * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;)
     * @param filterPublished Filter for questions currenctly published or not
     * @param filterImportId Filter for questions from a specific import job
     * @return Integer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Integer updateQuestionsInBulk(QuestionResource question, String filterSearch, String filterIdset, String filterCategory, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId) throws RestClientException {
        Object postBody = question;
        
        String path = UriComponentsBuilder.fromPath("/trivia/questions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_search", filterSearch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_idset", filterIdset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_category", filterCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_tagset", filterTagset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_type", filterType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_published", filterPublished));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_import_id", filterImportId));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Integer> returnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
