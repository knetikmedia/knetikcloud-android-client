package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T18:52:23.776-04:00")
public class GamificationTriviaApi {
  private ApiClient apiClient;

  public GamificationTriviaApi() {
    this(Configuration.getDefaultApiClient());
  }

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
   * @param questionId The id of the question (required)
   * @param answer The new answer (optional)
   * @return AnswerResource
   * @throws ApiException if fails to make API call
   */
  public AnswerResource addQuestionAnswers(String questionId, AnswerResource answer) throws ApiException {
    Object localVarPostBody = answer;
    
    // verify the required parameter 'questionId' is set
    if (questionId == null) {
      throw new ApiException(400, "Missing the required parameter 'questionId' when calling addQuestionAnswers");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/{question_id}/answers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "question_id" + "\\}", apiClient.escapeString(questionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<AnswerResource> localVarReturnType = new GenericType<AnswerResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add a tag to a question
   * 
   * @param id The id of the question (required)
   * @param tag The new tag (optional)
   * @throws ApiException if fails to make API call
   */
  public void addQuestionTag(String id, StringWrapper tag) throws ApiException {
    Object localVarPostBody = tag;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addQuestionTag");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/{id}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Add a tag to a batch of questions
   * All questions that dont&#39;t have the tag and match filters will have it added. The returned number is the number of questions updated.
   * @param tag The tag to add (optional)
   * @param filterSearch Filter for documents whose question, answers or tags contains provided string (optional)
   * @param filterIdset Filter for documents whose id is in the comma separated list provided (optional)
   * @param filterCategory Filter for questions with specified category, by id (optional)
   * @param filterTag Filter for questions with specified tag (optional)
   * @param filterTagset Filter for questions with specified tags (separated by comma) (optional)
   * @param filterType Filter for questions with specified type (optional)
   * @param filterPublished Filter for questions currenctly published or not (optional)
   * @param filterImportId Filter for questions from a specific import job (optional)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer addTagToQuestionsBatch(StringWrapper tag, String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId) throws ApiException {
    Object localVarPostBody = tag;
    
    // create path and map variables
    String localVarPath = "/trivia/questions/tags".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_search", filterSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_idset", filterIdset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tag", filterTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tagset", filterTagset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_type", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_published", filterPublished));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_import_id", filterImportId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create an import job
   * Set up a job to import a set of trivia questions from a cvs file at a remote url. the file will be validated asynchronously but will not be processed until started manually with the process endpoint.
   * @param request The new import job (optional)
   * @return ImportJobResource
   * @throws ApiException if fails to make API call
   */
  public ImportJobResource createImportJob(ImportJobResource request) throws ApiException {
    Object localVarPostBody = request;
    
    // create path and map variables
    String localVarPath = "/trivia/import".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<ImportJobResource> localVarReturnType = new GenericType<ImportJobResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a question
   * 
   * @param question The new question (optional)
   * @return QuestionResource
   * @throws ApiException if fails to make API call
   */
  public QuestionResource createQuestion(QuestionResource question) throws ApiException {
    Object localVarPostBody = question;
    
    // create path and map variables
    String localVarPath = "/trivia/questions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<QuestionResource> localVarReturnType = new GenericType<QuestionResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a question template
   * Question templates define a type of question and the properties they have
   * @param questionTemplateResource The question template resource object (optional)
   * @return QuestionTemplateResource
   * @throws ApiException if fails to make API call
   */
  public QuestionTemplateResource createQuestionTemplate(QuestionTemplateResource questionTemplateResource) throws ApiException {
    Object localVarPostBody = questionTemplateResource;
    
    // create path and map variables
    String localVarPath = "/trivia/questions/templates".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<QuestionTemplateResource> localVarReturnType = new GenericType<QuestionTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an import job
   * Also deletes all questions that were imported by it
   * @param id The id of the job (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteImportJob(Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteImportJob");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/import/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a question
   * 
   * @param id The id of the question (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteQuestion(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteQuestion");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Remove an answer from a question
   * 
   * @param questionId The id of the question (required)
   * @param id The id of the answer (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteQuestionAnswers(String questionId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'questionId' is set
    if (questionId == null) {
      throw new ApiException(400, "Missing the required parameter 'questionId' when calling deleteQuestionAnswers");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteQuestionAnswers");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/{question_id}/answers/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "question_id" + "\\}", apiClient.escapeString(questionId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a question template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteQuestionTemplate(String id, String cascade) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteQuestionTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/templates/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cascade", cascade));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get an import job
   * 
   * @param id The id of the job (required)
   * @return ImportJobResource
   * @throws ApiException if fails to make API call
   */
  public ImportJobResource getImportJob(Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getImportJob");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/import/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<ImportJobResource> localVarReturnType = new GenericType<ImportJobResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of import job
   * 
   * @param filterVendor Filter for jobs by vendor id (optional)
   * @param filterCategory Filter for jobs by category id (optional)
   * @param filterName Filter for jobs which name *STARTS* with the given string (optional)
   * @param filterStatus Filter for jobs that are in a specific set of statuses (comma separated) (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceImportJobResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceImportJobResource getImportJobs(String filterVendor, String filterCategory, String filterName, String filterStatus, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/trivia/import".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_vendor", filterVendor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_status", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceImportJobResource> localVarReturnType = new GenericType<PageResourceImportJobResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single question
   * 
   * @param id The id of the question (required)
   * @return QuestionResource
   * @throws ApiException if fails to make API call
   */
  public QuestionResource getQuestion(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getQuestion");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<QuestionResource> localVarReturnType = new GenericType<QuestionResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get an answer for a question
   * 
   * @param questionId The id of the question (required)
   * @param id The id of the answer (required)
   * @return AnswerResource
   * @throws ApiException if fails to make API call
   */
  public AnswerResource getQuestionAnswer(String questionId, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'questionId' is set
    if (questionId == null) {
      throw new ApiException(400, "Missing the required parameter 'questionId' when calling getQuestionAnswer");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getQuestionAnswer");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/{question_id}/answers/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "question_id" + "\\}", apiClient.escapeString(questionId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<AnswerResource> localVarReturnType = new GenericType<AnswerResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List the answers available for a question
   * 
   * @param questionId The id of the question (required)
   * @return List<AnswerResource>
   * @throws ApiException if fails to make API call
   */
  public List<AnswerResource> getQuestionAnswers(String questionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'questionId' is set
    if (questionId == null) {
      throw new ApiException(400, "Missing the required parameter 'questionId' when calling getQuestionAnswers");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/{question_id}/answers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "question_id" + "\\}", apiClient.escapeString(questionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<List<AnswerResource>> localVarReturnType = new GenericType<List<AnswerResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List question deltas in ascending order of updated date
   * The &#39;since&#39; parameter is important to avoid getting a full list of all questions. Implementors should make sure they pass the updated date of the last resource loaded, not the date of the last request, in order to avoid gaps
   * @param since Timestamp in seconds (optional)
   * @return List<DeltaResource>
   * @throws ApiException if fails to make API call
   */
  public List<DeltaResource> getQuestionDeltas(Long since) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/trivia/questions/delta".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<List<DeltaResource>> localVarReturnType = new GenericType<List<DeltaResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List the tags for a question
   * 
   * @param id The id of the question (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getQuestionTags(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getQuestionTags");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/{id}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single question template
   * 
   * @param id The id of the template (required)
   * @return QuestionTemplateResource
   * @throws ApiException if fails to make API call
   */
  public QuestionTemplateResource getQuestionTemplate(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getQuestionTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/templates/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<QuestionTemplateResource> localVarReturnType = new GenericType<QuestionTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search question templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceQuestionTemplateResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceQuestionTemplateResource getQuestionTemplates(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/trivia/questions/templates".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceQuestionTemplateResource> localVarReturnType = new GenericType<PageResourceQuestionTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search questions
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @param filterSearch Filter for documents whose question, answers or tags contains provided string (optional)
   * @param filterIdset Filter for documents whose id is in the comma separated list provided (optional)
   * @param filterCategory Filter for questions with specified category, by id (optional)
   * @param filterTagset Filter for questions with specified tags (separated by comma) (optional)
   * @param filterTag Filter for questions with specified tag (optional)
   * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) (optional)
   * @param filterPublished Filter for questions currenctly published or not (optional)
   * @param filterImportId Filter for questions from a specific import job (optional)
   * @return PageResourceQuestionResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceQuestionResource getQuestions(Integer size, Integer page, String order, String filterSearch, String filterIdset, String filterCategory, String filterTagset, String filterTag, String filterType, Boolean filterPublished, Long filterImportId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/trivia/questions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_search", filterSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_idset", filterIdset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tagset", filterTagset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tag", filterTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_type", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_published", filterPublished));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_import_id", filterImportId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<PageResourceQuestionResource> localVarReturnType = new GenericType<PageResourceQuestionResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Count questions based on filters
   * This is also provided by the list endpoint so you don&#39;t need to call this for pagination purposes
   * @param filterSearch Filter for documents whose question, answers or tags contains provided string (optional)
   * @param filterIdset Filter for documents whose id is in the comma separated list provided (optional)
   * @param filterCategory Filter for questions with specified category, by id (optional)
   * @param filterTag Filter for questions with specified tag (optional)
   * @param filterTagset Filter for questions with specified tags (separated by comma) (optional)
   * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) (optional)
   * @param filterPublished Filter for questions currenctly published or not (optional)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long getQuestionsCount(String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/trivia/questions/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_search", filterSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_idset", filterIdset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tag", filterTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tagset", filterTagset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_type", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_published", filterPublished));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Start processing an import job
   * Will process the CSV file and add new questions asynchronously. The status of the job must be &#39;VALID&#39;.
   * @param id The id of the job (required)
   * @param publishNow Whether the new questions should be published live immediately (required)
   * @return ImportJobResource
   * @throws ApiException if fails to make API call
   */
  public ImportJobResource processImportJob(Long id, Boolean publishNow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling processImportJob");
    }
    
    // verify the required parameter 'publishNow' is set
    if (publishNow == null) {
      throw new ApiException(400, "Missing the required parameter 'publishNow' when calling processImportJob");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/import/{id}/process".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "publish_now", publishNow));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<ImportJobResource> localVarReturnType = new GenericType<ImportJobResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Remove a tag from a question
   * 
   * @param id The id of the question (required)
   * @param tag The tag to remove (required)
   * @throws ApiException if fails to make API call
   */
  public void removeQuestionTag(String id, String tag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeQuestionTag");
    }
    
    // verify the required parameter 'tag' is set
    if (tag == null) {
      throw new ApiException(400, "Missing the required parameter 'tag' when calling removeQuestionTag");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/{id}/tags/{tag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Remove a tag from a batch of questions
   * ll questions that have the tag and match filters will have it removed. The returned number is the number of questions updated.
   * @param tag The tag to remove (required)
   * @param filterSearch Filter for documents whose question, answers or tags contains provided string (optional)
   * @param filterIdset Filter for documents whose id is in the comma separated list provided (optional)
   * @param filterCategory Filter for questions with specified category, by id (optional)
   * @param filterTag Filter for questions with specified tag (optional)
   * @param filterTagset Filter for questions with specified tags (separated by comma) (optional)
   * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) (optional)
   * @param filterPublished Filter for questions currenctly published or not (optional)
   * @param filterImportId Filter for questions from a specific import job (optional)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer removeTagToQuestionsBatch(String tag, String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tag' is set
    if (tag == null) {
      throw new ApiException(400, "Missing the required parameter 'tag' when calling removeTagToQuestionsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/tags/{tag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_search", filterSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_idset", filterIdset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tag", filterTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tagset", filterTagset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_type", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_published", filterPublished));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_import_id", filterImportId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search tags by the beginning of the string
   * For performance reasons, search &amp; category filters are mutually exclusive. If category is specified, search filter will be ignored in order to do fast matches for typeahead.
   * @param filterSearch Filter for tags starting with the given text (optional)
   * @param filterCategory Filter for tags on questions from a specific category (optional)
   * @param filterImportId Filter for tags on questions from a specific import job (optional)
   * @return Collectionstring
   * @throws ApiException if fails to make API call
   */
  public Collectionstring searchQuestionTags(String filterSearch, String filterCategory, Long filterImportId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/trivia/tags".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_search", filterSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_import_id", filterImportId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<Collectionstring> localVarReturnType = new GenericType<Collectionstring>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an import job
   * Changes should be made before process is started for there to be any effect.
   * @param id The id of the job (required)
   * @param request The updated job (optional)
   * @return ImportJobResource
   * @throws ApiException if fails to make API call
   */
  public ImportJobResource updateImportJob(Long id, ImportJobResource request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateImportJob");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/import/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<ImportJobResource> localVarReturnType = new GenericType<ImportJobResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a question
   * 
   * @param id The id of the question (required)
   * @param question The updated question (optional)
   * @return QuestionResource
   * @throws ApiException if fails to make API call
   */
  public QuestionResource updateQuestion(String id, QuestionResource question) throws ApiException {
    Object localVarPostBody = question;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateQuestion");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<QuestionResource> localVarReturnType = new GenericType<QuestionResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an answer for a question
   * 
   * @param questionId The id of the question (required)
   * @param id The id of the answer (required)
   * @param answer The updated answer (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateQuestionAnswer(String questionId, String id, AnswerResource answer) throws ApiException {
    Object localVarPostBody = answer;
    
    // verify the required parameter 'questionId' is set
    if (questionId == null) {
      throw new ApiException(400, "Missing the required parameter 'questionId' when calling updateQuestionAnswer");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateQuestionAnswer");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/{question_id}/answers/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "question_id" + "\\}", apiClient.escapeString(questionId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a question template
   * 
   * @param id The id of the template (required)
   * @param questionTemplateResource The question template resource object (optional)
   * @return QuestionTemplateResource
   * @throws ApiException if fails to make API call
   */
  public QuestionTemplateResource updateQuestionTemplate(String id, QuestionTemplateResource questionTemplateResource) throws ApiException {
    Object localVarPostBody = questionTemplateResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateQuestionTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/trivia/questions/templates/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<QuestionTemplateResource> localVarReturnType = new GenericType<QuestionTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Bulk update questions
   * Will update all questions that match filters used (or all questions in system if no filters used). Body should match a question resource with only those properties you wish to set. Null values will be ignored. Returned number is how many were updated.
   * @param question New values for a set of question fields (optional)
   * @param filterSearch Filter for documents whose question, answers or tags contains provided string (optional)
   * @param filterIdset Filter for documents whose id is in the comma separated list provided (optional)
   * @param filterCategory Filter for questions with specified category, by id (optional)
   * @param filterTagset Filter for questions with specified tags (separated by comma) (optional)
   * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) (optional)
   * @param filterPublished Filter for questions currenctly published or not (optional)
   * @param filterImportId Filter for questions from a specific import job (optional)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer updateQuestionsInBulk(QuestionResource question, String filterSearch, String filterIdset, String filterCategory, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId) throws ApiException {
    Object localVarPostBody = question;
    
    // create path and map variables
    String localVarPath = "/trivia/questions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_search", filterSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_idset", filterIdset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_tagset", filterTagset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_type", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_published", filterPublished));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_import_id", filterImportId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2" };

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
