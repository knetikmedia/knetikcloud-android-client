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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationTriviaApi
 */
public class GamificationTriviaApiTest {

    private GamificationTriviaApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GamificationTriviaApi.class);
    }

    /**
     * Add an answer to a question
     *
     * 
     */
    @Test
    public void addQuestionAnswersTest() {
        String questionId = null;
        AnswerResource answer = null;
        // AnswerResource response = api.addQuestionAnswers(questionId, answer);

        // TODO: test validations
    }
    /**
     * Add a tag to a question
     *
     * 
     */
    @Test
    public void addQuestionTagTest() {
        String id = null;
        StringWrapper tag = null;
        // Void response = api.addQuestionTag(id, tag);

        // TODO: test validations
    }
    /**
     * Add a tag to a batch of questions
     *
     * All questions that dont&#39;t have the tag and match filters will have it added. The returned number is the number of questions updated.
     */
    @Test
    public void addTagToQuestionsBatchTest() {
        StringWrapper tag = null;
        String filterSearch = null;
        String filterIdset = null;
        String filterCategory = null;
        String filterTag = null;
        String filterTagset = null;
        String filterType = null;
        Boolean filterPublished = null;
        Long filterImportId = null;
        // Integer response = api.addTagToQuestionsBatch(tag, filterSearch, filterIdset, filterCategory, filterTag, filterTagset, filterType, filterPublished, filterImportId);

        // TODO: test validations
    }
    /**
     * Create an import job
     *
     * Set up a job to import a set of trivia questions from a cvs file at a remote url. the file will be validated asynchronously but will not be processed until started manually with the process endpoint.
     */
    @Test
    public void createImportJobTest() {
        ImportJobResource request = null;
        // ImportJobResource response = api.createImportJob(request);

        // TODO: test validations
    }
    /**
     * Create a question
     *
     * 
     */
    @Test
    public void createQuestionTest() {
        QuestionResource question = null;
        // QuestionResource response = api.createQuestion(question);

        // TODO: test validations
    }
    /**
     * Create a question template
     *
     * Question templates define a type of question and the properties they have
     */
    @Test
    public void createQuestionTemplateTest() {
        QuestionTemplateResource questionTemplateResource = null;
        // QuestionTemplateResource response = api.createQuestionTemplate(questionTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete an import job
     *
     * Also deletes all questions that were imported by it
     */
    @Test
    public void deleteImportJobTest() {
        Long id = null;
        // Void response = api.deleteImportJob(id);

        // TODO: test validations
    }
    /**
     * Delete a question
     *
     * 
     */
    @Test
    public void deleteQuestionTest() {
        String id = null;
        // Void response = api.deleteQuestion(id);

        // TODO: test validations
    }
    /**
     * Remove an answer from a question
     *
     * 
     */
    @Test
    public void deleteQuestionAnswersTest() {
        String questionId = null;
        String id = null;
        // Void response = api.deleteQuestionAnswers(questionId, id);

        // TODO: test validations
    }
    /**
     * Delete a question template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     */
    @Test
    public void deleteQuestionTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteQuestionTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get an import job
     *
     * 
     */
    @Test
    public void getImportJobTest() {
        Long id = null;
        // ImportJobResource response = api.getImportJob(id);

        // TODO: test validations
    }
    /**
     * Get a list of import job
     *
     * 
     */
    @Test
    public void getImportJobsTest() {
        String filterVendor = null;
        String filterCategory = null;
        String filterName = null;
        String filterStatus = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceImportJobResource response = api.getImportJobs(filterVendor, filterCategory, filterName, filterStatus, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single question
     *
     * 
     */
    @Test
    public void getQuestionTest() {
        String id = null;
        // QuestionResource response = api.getQuestion(id);

        // TODO: test validations
    }
    /**
     * Get an answer for a question
     *
     * 
     */
    @Test
    public void getQuestionAnswerTest() {
        String questionId = null;
        String id = null;
        // AnswerResource response = api.getQuestionAnswer(questionId, id);

        // TODO: test validations
    }
    /**
     * List the answers available for a question
     *
     * 
     */
    @Test
    public void getQuestionAnswersTest() {
        String questionId = null;
        // List<AnswerResource> response = api.getQuestionAnswers(questionId);

        // TODO: test validations
    }
    /**
     * List question deltas in ascending order of updated date
     *
     * The &#39;since&#39; parameter is important to avoid getting a full list of all questions. Implementors should make sure they pass the updated date of the last resource loaded, not the date of the last request, in order to avoid gaps
     */
    @Test
    public void getQuestionDeltasTest() {
        Long since = null;
        // List<DeltaResource> response = api.getQuestionDeltas(since);

        // TODO: test validations
    }
    /**
     * List the tags for a question
     *
     * 
     */
    @Test
    public void getQuestionTagsTest() {
        String id = null;
        // List<String> response = api.getQuestionTags(id);

        // TODO: test validations
    }
    /**
     * Get a single question template
     *
     * 
     */
    @Test
    public void getQuestionTemplateTest() {
        String id = null;
        // QuestionTemplateResource response = api.getQuestionTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search question templates
     *
     * 
     */
    @Test
    public void getQuestionTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceQuestionTemplateResource response = api.getQuestionTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * List and search questions
     *
     * 
     */
    @Test
    public void getQuestionsTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        String filterSearch = null;
        String filterIdset = null;
        String filterCategory = null;
        String filterTagset = null;
        String filterTag = null;
        String filterType = null;
        Boolean filterPublished = null;
        Long filterImportId = null;
        // PageResourceQuestionResource response = api.getQuestions(size, page, order, filterSearch, filterIdset, filterCategory, filterTagset, filterTag, filterType, filterPublished, filterImportId);

        // TODO: test validations
    }
    /**
     * Count questions based on filters
     *
     * This is also provided by the list endpoint so you don&#39;t need to call this for pagination purposes
     */
    @Test
    public void getQuestionsCountTest() {
        String filterSearch = null;
        String filterIdset = null;
        String filterCategory = null;
        String filterTag = null;
        String filterTagset = null;
        String filterType = null;
        Boolean filterPublished = null;
        // Long response = api.getQuestionsCount(filterSearch, filterIdset, filterCategory, filterTag, filterTagset, filterType, filterPublished);

        // TODO: test validations
    }
    /**
     * Start processing an import job
     *
     * Will process the CSV file and add new questions asynchronously. The status of the job must be &#39;VALID&#39;.
     */
    @Test
    public void processImportJobTest() {
        Long id = null;
        Boolean publishNow = null;
        // ImportJobResource response = api.processImportJob(id, publishNow);

        // TODO: test validations
    }
    /**
     * Remove a tag from a question
     *
     * 
     */
    @Test
    public void removeQuestionTagTest() {
        String id = null;
        String tag = null;
        // Void response = api.removeQuestionTag(id, tag);

        // TODO: test validations
    }
    /**
     * Remove a tag from a batch of questions
     *
     * ll questions that have the tag and match filters will have it removed. The returned number is the number of questions updated.
     */
    @Test
    public void removeTagToQuestionsBatchTest() {
        String tag = null;
        String filterSearch = null;
        String filterIdset = null;
        String filterCategory = null;
        String filterTag = null;
        String filterTagset = null;
        String filterType = null;
        Boolean filterPublished = null;
        Long filterImportId = null;
        // Integer response = api.removeTagToQuestionsBatch(tag, filterSearch, filterIdset, filterCategory, filterTag, filterTagset, filterType, filterPublished, filterImportId);

        // TODO: test validations
    }
    /**
     * List and search tags by the beginning of the string
     *
     * For performance reasons, search &amp; category filters are mutually exclusive. If category is specified, search filter will be ignored in order to do fast matches for typeahead.
     */
    @Test
    public void searchQuestionTagsTest() {
        String filterSearch = null;
        String filterCategory = null;
        Long filterImportId = null;
        // Collectionstring response = api.searchQuestionTags(filterSearch, filterCategory, filterImportId);

        // TODO: test validations
    }
    /**
     * Update an import job
     *
     * Changes should be made before process is started for there to be any effect.
     */
    @Test
    public void updateImportJobTest() {
        Long id = null;
        ImportJobResource request = null;
        // ImportJobResource response = api.updateImportJob(id, request);

        // TODO: test validations
    }
    /**
     * Update a question
     *
     * 
     */
    @Test
    public void updateQuestionTest() {
        String id = null;
        QuestionResource question = null;
        // QuestionResource response = api.updateQuestion(id, question);

        // TODO: test validations
    }
    /**
     * Update an answer for a question
     *
     * 
     */
    @Test
    public void updateQuestionAnswerTest() {
        String questionId = null;
        String id = null;
        AnswerResource answer = null;
        // Void response = api.updateQuestionAnswer(questionId, id, answer);

        // TODO: test validations
    }
    /**
     * Update a question template
     *
     * 
     */
    @Test
    public void updateQuestionTemplateTest() {
        String id = null;
        QuestionTemplateResource questionTemplateResource = null;
        // QuestionTemplateResource response = api.updateQuestionTemplate(id, questionTemplateResource);

        // TODO: test validations
    }
    /**
     * Bulk update questions
     *
     * Will update all questions that match filters used (or all questions in system if no filters used). Body should match a question resource with only those properties you wish to set. Null values will be ignored. Returned number is how many were updated.
     */
    @Test
    public void updateQuestionsInBulkTest() {
        QuestionResource question = null;
        String filterSearch = null;
        String filterIdset = null;
        String filterCategory = null;
        String filterTagset = null;
        String filterType = null;
        Boolean filterPublished = null;
        Long filterImportId = null;
        // Integer response = api.updateQuestionsInBulk(question, filterSearch, filterIdset, filterCategory, filterTagset, filterType, filterPublished, filterImportId);

        // TODO: test validations
    }
}
