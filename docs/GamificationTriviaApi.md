# GamificationTriviaApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAnswersUsingPOST**](GamificationTriviaApi.md#addAnswersUsingPOST) | **POST** /trivia/questions/{question_id}/answers | Add an answer to a question
[**addTagUsingPOST**](GamificationTriviaApi.md#addTagUsingPOST) | **POST** /trivia/questions/{id}/tags | Add a tag to a question
[**batchAddTagUsingPOST**](GamificationTriviaApi.md#batchAddTagUsingPOST) | **POST** /trivia/questions/tags | Add a tag to a batch of questions
[**batchRemoveTagUsingDELETE**](GamificationTriviaApi.md#batchRemoveTagUsingDELETE) | **DELETE** /trivia/questions/tags/{tag} | Remove a tag from a batch of questions
[**bulkUpdateUsingPUT**](GamificationTriviaApi.md#bulkUpdateUsingPUT) | **PUT** /trivia/questions | Bulk update questions
[**countQuestionsUsingGET**](GamificationTriviaApi.md#countQuestionsUsingGET) | **GET** /trivia/questions/count | Count questions based on filters.
[**createQuestionTemplateUsingPOST**](GamificationTriviaApi.md#createQuestionTemplateUsingPOST) | **POST** /trivia/questions/templates | Create a question template
[**createQuestionUsingPOST**](GamificationTriviaApi.md#createQuestionUsingPOST) | **POST** /trivia/questions | Create a question
[**createUsingPOST**](GamificationTriviaApi.md#createUsingPOST) | **POST** /trivia/import | Create an import job
[**deleteQuestionTemplateUsingDELETE**](GamificationTriviaApi.md#deleteQuestionTemplateUsingDELETE) | **DELETE** /trivia/questions/templates/{id} | Delete a question template
[**deleteQuestionUsingDELETE**](GamificationTriviaApi.md#deleteQuestionUsingDELETE) | **DELETE** /trivia/questions/{id} | Delete a question
[**deleteUsingDELETE**](GamificationTriviaApi.md#deleteUsingDELETE) | **DELETE** /trivia/import/{id} | Delete an import job
[**getAnswerUsingGET**](GamificationTriviaApi.md#getAnswerUsingGET) | **GET** /trivia/questions/{question_id}/answers/{id} | Get an answer for a question
[**getAnswersUsingGET**](GamificationTriviaApi.md#getAnswersUsingGET) | **GET** /trivia/questions/{question_id}/answers | List the answers available for a question
[**getListUsingGET1**](GamificationTriviaApi.md#getListUsingGET1) | **GET** /trivia/import | Get a list of import job
[**getQuestionTemplateUsingGET**](GamificationTriviaApi.md#getQuestionTemplateUsingGET) | **GET** /trivia/questions/templates/{id} | Get a single question template
[**getQuestionTemplatesUsingGET**](GamificationTriviaApi.md#getQuestionTemplatesUsingGET) | **GET** /trivia/questions/templates | List and search question templates
[**getQuestionUsingGET**](GamificationTriviaApi.md#getQuestionUsingGET) | **GET** /trivia/questions/{id} | Get a single question
[**getQuestionsDeltaUsingGET**](GamificationTriviaApi.md#getQuestionsDeltaUsingGET) | **GET** /trivia/questions/delta | List question deltas in ascending order of updated date
[**getQuestionsUsingGET**](GamificationTriviaApi.md#getQuestionsUsingGET) | **GET** /trivia/questions | List and search questions
[**getTagsUsingGET1**](GamificationTriviaApi.md#getTagsUsingGET1) | **GET** /trivia/questions/{id}/tags | List the tags for a question
[**getTagsUsingGET2**](GamificationTriviaApi.md#getTagsUsingGET2) | **GET** /trivia/tags | List and search tags by the beginning of the string
[**getUsingGET**](GamificationTriviaApi.md#getUsingGET) | **GET** /trivia/import/{id} | Get an import job
[**removeAnswersUsingDELETE**](GamificationTriviaApi.md#removeAnswersUsingDELETE) | **DELETE** /trivia/questions/{question_id}/answers/{id} | Remove an answer from a question
[**removeTagUsingDELETE**](GamificationTriviaApi.md#removeTagUsingDELETE) | **DELETE** /trivia/questions/{id}/tags/{tag} | Remove a tag from a question
[**startProcessUsingPOST**](GamificationTriviaApi.md#startProcessUsingPOST) | **POST** /trivia/import/{id}/process | Start processing an import job
[**updateAnswerUsingPUT**](GamificationTriviaApi.md#updateAnswerUsingPUT) | **PUT** /trivia/questions/{question_id}/answers/{id} | Update an answer for a question
[**updateQuestionTemplateUsingPUT**](GamificationTriviaApi.md#updateQuestionTemplateUsingPUT) | **PUT** /trivia/questions/templates/{id} | Update a question template
[**updateQuestionUsingPUT**](GamificationTriviaApi.md#updateQuestionUsingPUT) | **PUT** /trivia/questions/{id} | Update a question
[**updateUsingPUT**](GamificationTriviaApi.md#updateUsingPUT) | **PUT** /trivia/import/{id} | Update an import job


<a name="addAnswersUsingPOST"></a>
# **addAnswersUsingPOST**
> AnswerResource addAnswersUsingPOST(questionId, answer)

Add an answer to a question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String questionId = "questionId_example"; // String | The id of the question
AnswerResource answer = new AnswerResource(); // AnswerResource | The new answer
try {
    AnswerResource result = apiInstance.addAnswersUsingPOST(questionId, answer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#addAnswersUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **String**| The id of the question |
 **answer** | [**AnswerResource**](AnswerResource.md)| The new answer | [optional]

### Return type

[**AnswerResource**](AnswerResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addTagUsingPOST"></a>
# **addTagUsingPOST**
> addTagUsingPOST(id, tag)

Add a tag to a question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String id = "id_example"; // String | The id of the question
String tag = "tag_example"; // String | The new tag
try {
    apiInstance.addTagUsingPOST(id, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#addTagUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the question |
 **tag** | **String**| The new tag | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="batchAddTagUsingPOST"></a>
# **batchAddTagUsingPOST**
> Integer batchAddTagUsingPOST(tag, filterSearch, filterIdset, filterCategory, filterTag, filterTagset, filterType, filterPublished, filterImportId)

Add a tag to a batch of questions

All questions that dont&#39;t have the tag and match filters will have it added. The returned number is the number of questions updated.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String tag = "tag_example"; // String | The tag to add
String filterSearch = "filterSearch_example"; // String | Filter for documents whose question, answers or tags contains provided string
String filterIdset = "filterIdset_example"; // String | Filter for documents whose id is in the comma separated list provided
String filterCategory = "filterCategory_example"; // String | Filter for questions with specified category, by id
String filterTag = "filterTag_example"; // String | Filter for questions with specified tag
String filterTagset = "filterTagset_example"; // String | Filter for questions with specified tags (separated by comma)
String filterType = "filterType_example"; // String | Filter for questions with specified type
Boolean filterPublished = true; // Boolean | Filter for questions currenctly published or not
Long filterImportId = 789L; // Long | Filter for questions from a specific import job
try {
    Integer result = apiInstance.batchAddTagUsingPOST(tag, filterSearch, filterIdset, filterCategory, filterTag, filterTagset, filterType, filterPublished, filterImportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#batchAddTagUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| The tag to add | [optional]
 **filterSearch** | **String**| Filter for documents whose question, answers or tags contains provided string | [optional]
 **filterIdset** | **String**| Filter for documents whose id is in the comma separated list provided | [optional]
 **filterCategory** | **String**| Filter for questions with specified category, by id | [optional]
 **filterTag** | **String**| Filter for questions with specified tag | [optional]
 **filterTagset** | **String**| Filter for questions with specified tags (separated by comma) | [optional]
 **filterType** | **String**| Filter for questions with specified type | [optional] [enum: TEXT, IMAGE, VIDEO, AUDIO]
 **filterPublished** | **Boolean**| Filter for questions currenctly published or not | [optional]
 **filterImportId** | **Long**| Filter for questions from a specific import job | [optional]

### Return type

**Integer**

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="batchRemoveTagUsingDELETE"></a>
# **batchRemoveTagUsingDELETE**
> Integer batchRemoveTagUsingDELETE(tag, filterSearch, filterIdset, filterCategory, filterTag, filterTagset, filterType, filterPublished, filterImportId)

Remove a tag from a batch of questions

ll questions that have the tag and match filters will have it removed. The returned number is the number of questions updated.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String tag = "tag_example"; // String | The tag to remove
String filterSearch = "filterSearch_example"; // String | Filter for documents whose question, answers or tags contains provided string
String filterIdset = "filterIdset_example"; // String | Filter for documents whose id is in the comma separated list provided
String filterCategory = "filterCategory_example"; // String | Filter for questions with specified category, by id
String filterTag = "filterTag_example"; // String | Filter for questions with specified tag
String filterTagset = "filterTagset_example"; // String | Filter for questions with specified tags (separated by comma)
String filterType = "filterType_example"; // String | Filter for questions with specified type.  Allowable values: ('TEXT', 'IMAGE', 'VIDEO', 'AUDIO')
Boolean filterPublished = true; // Boolean | Filter for questions currenctly published or not
Long filterImportId = 789L; // Long | Filter for questions from a specific import job
try {
    Integer result = apiInstance.batchRemoveTagUsingDELETE(tag, filterSearch, filterIdset, filterCategory, filterTag, filterTagset, filterType, filterPublished, filterImportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#batchRemoveTagUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| The tag to remove |
 **filterSearch** | **String**| Filter for documents whose question, answers or tags contains provided string | [optional]
 **filterIdset** | **String**| Filter for documents whose id is in the comma separated list provided | [optional]
 **filterCategory** | **String**| Filter for questions with specified category, by id | [optional]
 **filterTag** | **String**| Filter for questions with specified tag | [optional]
 **filterTagset** | **String**| Filter for questions with specified tags (separated by comma) | [optional]
 **filterType** | **String**| Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) | [optional]
 **filterPublished** | **Boolean**| Filter for questions currenctly published or not | [optional]
 **filterImportId** | **Long**| Filter for questions from a specific import job | [optional]

### Return type

**Integer**

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bulkUpdateUsingPUT"></a>
# **bulkUpdateUsingPUT**
> Integer bulkUpdateUsingPUT(question, filterSearch, filterIdset, filterCategory, filterTagset, filterType, filterPublished, filterImportId)

Bulk update questions

Will update all questions that match filters used (or all questions in system if no filters used). Body should match a question resource with only those properties you wish to set. Null values will be ignored. Returned number is how many were updated.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
QuestionResource question = new QuestionResource(); // QuestionResource | New values for a set of question fields
String filterSearch = "filterSearch_example"; // String | Filter for documents whose question, answers or tags contains provided string
String filterIdset = "filterIdset_example"; // String | Filter for documents whose id is in the comma separated list provided
String filterCategory = "filterCategory_example"; // String | Filter for questions with specified category, by id
String filterTagset = "filterTagset_example"; // String | Filter for questions with specified tags (separated by comma)
String filterType = "filterType_example"; // String | Filter for questions with specified type.  Allowable values: ('TEXT', 'IMAGE', 'VIDEO', 'AUDIO')
Boolean filterPublished = true; // Boolean | Filter for questions currenctly published or not
Long filterImportId = 789L; // Long | Filter for questions from a specific import job
try {
    Integer result = apiInstance.bulkUpdateUsingPUT(question, filterSearch, filterIdset, filterCategory, filterTagset, filterType, filterPublished, filterImportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#bulkUpdateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question** | [**QuestionResource**](QuestionResource.md)| New values for a set of question fields | [optional]
 **filterSearch** | **String**| Filter for documents whose question, answers or tags contains provided string | [optional]
 **filterIdset** | **String**| Filter for documents whose id is in the comma separated list provided | [optional]
 **filterCategory** | **String**| Filter for questions with specified category, by id | [optional]
 **filterTagset** | **String**| Filter for questions with specified tags (separated by comma) | [optional]
 **filterType** | **String**| Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) | [optional]
 **filterPublished** | **Boolean**| Filter for questions currenctly published or not | [optional]
 **filterImportId** | **Long**| Filter for questions from a specific import job | [optional]

### Return type

**Integer**

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="countQuestionsUsingGET"></a>
# **countQuestionsUsingGET**
> Long countQuestionsUsingGET(filterSearch, filterIdset, filterCategory, filterTag, filterTagset, filterType, filterPublished)

Count questions based on filters.

This is also provided by the list endpoint so you don&#39;t need to call this for pagination purposes

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String filterSearch = "filterSearch_example"; // String | Filter for documents whose question, answers or tags contains provided string
String filterIdset = "filterIdset_example"; // String | Filter for documents whose id is in the comma separated list provided
String filterCategory = "filterCategory_example"; // String | Filter for questions with specified category, by id
String filterTag = "filterTag_example"; // String | Filter for questions with specified tag
String filterTagset = "filterTagset_example"; // String | Filter for questions with specified tags (separated by comma)
String filterType = "filterType_example"; // String | Filter for questions with specified type.  Allowable values: ('TEXT', 'IMAGE', 'VIDEO', 'AUDIO')
Boolean filterPublished = true; // Boolean | Filter for questions currenctly published or not
try {
    Long result = apiInstance.countQuestionsUsingGET(filterSearch, filterIdset, filterCategory, filterTag, filterTagset, filterType, filterPublished);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#countQuestionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterSearch** | **String**| Filter for documents whose question, answers or tags contains provided string | [optional]
 **filterIdset** | **String**| Filter for documents whose id is in the comma separated list provided | [optional]
 **filterCategory** | **String**| Filter for questions with specified category, by id | [optional]
 **filterTag** | **String**| Filter for questions with specified tag | [optional]
 **filterTagset** | **String**| Filter for questions with specified tags (separated by comma) | [optional]
 **filterType** | **String**| Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) | [optional]
 **filterPublished** | **Boolean**| Filter for questions currenctly published or not | [optional]

### Return type

**Long**

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createQuestionTemplateUsingPOST"></a>
# **createQuestionTemplateUsingPOST**
> QuestionTemplateResource createQuestionTemplateUsingPOST(questionTemplateResource)

Create a question template

Question templates define a type of question and the properties they have

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
QuestionTemplateResource questionTemplateResource = new QuestionTemplateResource(); // QuestionTemplateResource | The question template resource object
try {
    QuestionTemplateResource result = apiInstance.createQuestionTemplateUsingPOST(questionTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#createQuestionTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionTemplateResource** | [**QuestionTemplateResource**](QuestionTemplateResource.md)| The question template resource object | [optional]

### Return type

[**QuestionTemplateResource**](QuestionTemplateResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createQuestionUsingPOST"></a>
# **createQuestionUsingPOST**
> QuestionResource createQuestionUsingPOST(question)

Create a question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
QuestionResource question = new QuestionResource(); // QuestionResource | The new question
try {
    QuestionResource result = apiInstance.createQuestionUsingPOST(question);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#createQuestionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question** | [**QuestionResource**](QuestionResource.md)| The new question | [optional]

### Return type

[**QuestionResource**](QuestionResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUsingPOST"></a>
# **createUsingPOST**
> ImportJobResource createUsingPOST(request)

Create an import job

Set up a job to import a set of trivia questions from a cvs file at a remote url. the file will be validated asynchronously but will not be processed until started manually with the process endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
ImportJobResource request = new ImportJobResource(); // ImportJobResource | The new import job
try {
    ImportJobResource result = apiInstance.createUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#createUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ImportJobResource**](ImportJobResource.md)| The new import job | [optional]

### Return type

[**ImportJobResource**](ImportJobResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuestionTemplateUsingDELETE"></a>
# **deleteQuestionTemplateUsingDELETE**
> deleteQuestionTemplateUsingDELETE(id, cascade)

Delete a question template

If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | The value needed to delete used templates
try {
    apiInstance.deleteQuestionTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#deleteQuestionTemplateUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **cascade** | **String**| The value needed to delete used templates | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuestionUsingDELETE"></a>
# **deleteQuestionUsingDELETE**
> deleteQuestionUsingDELETE(id)

Delete a question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String id = "id_example"; // String | The id of the question
try {
    apiInstance.deleteQuestionUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#deleteQuestionUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the question |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> deleteUsingDELETE(id)

Delete an import job

Also deletes all questions that were imported by it

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
Long id = 789L; // Long | The id of the job
try {
    apiInstance.deleteUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the job |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAnswerUsingGET"></a>
# **getAnswerUsingGET**
> AnswerResource getAnswerUsingGET(questionId, id)

Get an answer for a question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String questionId = "questionId_example"; // String | The id of the question
String id = "id_example"; // String | The id of the answer
try {
    AnswerResource result = apiInstance.getAnswerUsingGET(questionId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#getAnswerUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **String**| The id of the question |
 **id** | **String**| The id of the answer |

### Return type

[**AnswerResource**](AnswerResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAnswersUsingGET"></a>
# **getAnswersUsingGET**
> List&lt;AnswerResource&gt; getAnswersUsingGET(questionId)

List the answers available for a question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String questionId = "questionId_example"; // String | The id of the question
try {
    List<AnswerResource> result = apiInstance.getAnswersUsingGET(questionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#getAnswersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **String**| The id of the question |

### Return type

[**List&lt;AnswerResource&gt;**](AnswerResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getListUsingGET1"></a>
# **getListUsingGET1**
> PageResourceImportJobResource getListUsingGET1(filterVendor, filterCategory, filterName, filterStatus, size, page, order)

Get a list of import job

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String filterVendor = "filterVendor_example"; // String | Filter for jobs by vendor id
String filterCategory = "filterCategory_example"; // String | Filter for jobs by category id
String filterName = "filterName_example"; // String | Filter for jobs which name *STARTS* with the given string
String filterStatus = "filterStatus_example"; // String | Filter for jobs that are in a specific set of statuses (comma separated)
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceImportJobResource result = apiInstance.getListUsingGET1(filterVendor, filterCategory, filterName, filterStatus, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#getListUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterVendor** | **String**| Filter for jobs by vendor id | [optional]
 **filterCategory** | **String**| Filter for jobs by category id | [optional]
 **filterName** | **String**| Filter for jobs which name *STARTS* with the given string | [optional]
 **filterStatus** | **String**| Filter for jobs that are in a specific set of statuses (comma separated) | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceImportJobResource**](PageResourceImportJobResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuestionTemplateUsingGET"></a>
# **getQuestionTemplateUsingGET**
> QuestionTemplateResource getQuestionTemplateUsingGET(id)

Get a single question template

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String id = "id_example"; // String | The id of the template
try {
    QuestionTemplateResource result = apiInstance.getQuestionTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#getQuestionTemplateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |

### Return type

[**QuestionTemplateResource**](QuestionTemplateResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuestionTemplatesUsingGET"></a>
# **getQuestionTemplatesUsingGET**
> PageResourceQuestionTemplateResource getQuestionTemplatesUsingGET(size, page, order)

List and search question templates

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceQuestionTemplateResource result = apiInstance.getQuestionTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#getQuestionTemplatesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceQuestionTemplateResource**](PageResourceQuestionTemplateResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuestionUsingGET"></a>
# **getQuestionUsingGET**
> QuestionResource getQuestionUsingGET(id)

Get a single question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String id = "id_example"; // String | The id of the question
try {
    QuestionResource result = apiInstance.getQuestionUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#getQuestionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the question |

### Return type

[**QuestionResource**](QuestionResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuestionsDeltaUsingGET"></a>
# **getQuestionsDeltaUsingGET**
> List&lt;DeltaResource&gt; getQuestionsDeltaUsingGET(since)

List question deltas in ascending order of updated date

The &#39;since&#39; parameter is important to avoid getting a full list of all questions. Implementors should make sure they pass the updated date of the last resource loaded, not the date of the last request, in order to avoid gaps

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
Long since = 789L; // Long | Timestamp in seconds
try {
    List<DeltaResource> result = apiInstance.getQuestionsDeltaUsingGET(since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#getQuestionsDeltaUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **Long**| Timestamp in seconds | [optional]

### Return type

[**List&lt;DeltaResource&gt;**](DeltaResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuestionsUsingGET"></a>
# **getQuestionsUsingGET**
> PageResourceQuestionResource getQuestionsUsingGET(size, page, order, filterSearch, filterIdset, filterCategory, filterTagset, filterType, filterPublished, filterImportId)

List and search questions

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
String filterSearch = "filterSearch_example"; // String | Filter for documents whose question, answers or tags contains provided string
String filterIdset = "filterIdset_example"; // String | Filter for documents whose id is in the comma separated list provided
String filterCategory = "filterCategory_example"; // String | Filter for questions with specified category, by id
String filterTagset = "filterTagset_example"; // String | Filter for questions with specified tags (separated by comma)
String filterType = "filterType_example"; // String | Filter for questions with specified type.  Allowable values: ('TEXT', 'IMAGE', 'VIDEO', 'AUDIO')
Boolean filterPublished = true; // Boolean | Filter for questions currenctly published or not
Long filterImportId = 789L; // Long | Filter for questions from a specific import job
try {
    PageResourceQuestionResource result = apiInstance.getQuestionsUsingGET(size, page, order, filterSearch, filterIdset, filterCategory, filterTagset, filterType, filterPublished, filterImportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#getQuestionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]
 **filterSearch** | **String**| Filter for documents whose question, answers or tags contains provided string | [optional]
 **filterIdset** | **String**| Filter for documents whose id is in the comma separated list provided | [optional]
 **filterCategory** | **String**| Filter for questions with specified category, by id | [optional]
 **filterTagset** | **String**| Filter for questions with specified tags (separated by comma) | [optional]
 **filterType** | **String**| Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) | [optional]
 **filterPublished** | **Boolean**| Filter for questions currenctly published or not | [optional]
 **filterImportId** | **Long**| Filter for questions from a specific import job | [optional]

### Return type

[**PageResourceQuestionResource**](PageResourceQuestionResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTagsUsingGET1"></a>
# **getTagsUsingGET1**
> List&lt;String&gt; getTagsUsingGET1(id)

List the tags for a question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String id = "id_example"; // String | The id of the question
try {
    List<String> result = apiInstance.getTagsUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#getTagsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the question |

### Return type

**List&lt;String&gt;**

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTagsUsingGET2"></a>
# **getTagsUsingGET2**
> Collectionstring getTagsUsingGET2(filterSearch, filterCategory, filterImportId)

List and search tags by the beginning of the string

For performance reasons, search &amp; category filters are mutually exclusive. If category is specified, search filter will be ignored in order to do fast matches for typeahead.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String filterSearch = "filterSearch_example"; // String | Filter for tags starting with the given text
String filterCategory = "filterCategory_example"; // String | Filter for tags on questions from a specific category
Long filterImportId = 789L; // Long | Filter for tags on questions from a specific import job
try {
    Collectionstring result = apiInstance.getTagsUsingGET2(filterSearch, filterCategory, filterImportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#getTagsUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterSearch** | **String**| Filter for tags starting with the given text | [optional]
 **filterCategory** | **String**| Filter for tags on questions from a specific category | [optional]
 **filterImportId** | **Long**| Filter for tags on questions from a specific import job | [optional]

### Return type

[**Collectionstring**](Collectionstring.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsingGET"></a>
# **getUsingGET**
> ImportJobResource getUsingGET(id)

Get an import job

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
Long id = 789L; // Long | The id of the job
try {
    ImportJobResource result = apiInstance.getUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the job |

### Return type

[**ImportJobResource**](ImportJobResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeAnswersUsingDELETE"></a>
# **removeAnswersUsingDELETE**
> removeAnswersUsingDELETE(questionId, id)

Remove an answer from a question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String questionId = "questionId_example"; // String | The id of the question
String id = "id_example"; // String | The id of the answer
try {
    apiInstance.removeAnswersUsingDELETE(questionId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#removeAnswersUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **String**| The id of the question |
 **id** | **String**| The id of the answer |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeTagUsingDELETE"></a>
# **removeTagUsingDELETE**
> removeTagUsingDELETE(id, tag)

Remove a tag from a question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String id = "id_example"; // String | The id of the question
String tag = "tag_example"; // String | The tag to remove
try {
    apiInstance.removeTagUsingDELETE(id, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#removeTagUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the question |
 **tag** | **String**| The tag to remove |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startProcessUsingPOST"></a>
# **startProcessUsingPOST**
> ImportJobResource startProcessUsingPOST(id, publishNow)

Start processing an import job

Will process the CSV file and add new questions asynchronously. The status of the job must be &#39;VALID&#39;.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
Long id = 789L; // Long | The id of the job
Boolean publishNow = true; // Boolean | Whether the new questions should be published live immediately
try {
    ImportJobResource result = apiInstance.startProcessUsingPOST(id, publishNow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#startProcessUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the job |
 **publishNow** | **Boolean**| Whether the new questions should be published live immediately |

### Return type

[**ImportJobResource**](ImportJobResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAnswerUsingPUT"></a>
# **updateAnswerUsingPUT**
> updateAnswerUsingPUT(questionId, id, answer)

Update an answer for a question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String questionId = "questionId_example"; // String | The id of the question
String id = "id_example"; // String | The id of the answer
AnswerResource answer = new AnswerResource(); // AnswerResource | The updated answer
try {
    apiInstance.updateAnswerUsingPUT(questionId, id, answer);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#updateAnswerUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **String**| The id of the question |
 **id** | **String**| The id of the answer |
 **answer** | [**AnswerResource**](AnswerResource.md)| The updated answer | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateQuestionTemplateUsingPUT"></a>
# **updateQuestionTemplateUsingPUT**
> updateQuestionTemplateUsingPUT(id, questionTemplateResource)

Update a question template

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String id = "id_example"; // String | The id of the template
QuestionTemplateResource questionTemplateResource = new QuestionTemplateResource(); // QuestionTemplateResource | The question template resource object
try {
    apiInstance.updateQuestionTemplateUsingPUT(id, questionTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#updateQuestionTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **questionTemplateResource** | [**QuestionTemplateResource**](QuestionTemplateResource.md)| The question template resource object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateQuestionUsingPUT"></a>
# **updateQuestionUsingPUT**
> QuestionResource updateQuestionUsingPUT(id, question)

Update a question

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
String id = "id_example"; // String | The id of the question
QuestionResource question = new QuestionResource(); // QuestionResource | The updated question
try {
    QuestionResource result = apiInstance.updateQuestionUsingPUT(id, question);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#updateQuestionUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the question |
 **question** | [**QuestionResource**](QuestionResource.md)| The updated question | [optional]

### Return type

[**QuestionResource**](QuestionResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> ImportJobResource updateUsingPUT(id, request)

Update an import job

Changes should be made before process is started for there to be any effect.

### Example
```java
// Import classes:
//import io.swagger.client.api.GamificationTriviaApi;

GamificationTriviaApi apiInstance = new GamificationTriviaApi();
Long id = 789L; // Long | The id of the job
ImportJobResource request = new ImportJobResource(); // ImportJobResource | The updated job
try {
    ImportJobResource result = apiInstance.updateUsingPUT(id, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationTriviaApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the job |
 **request** | [**ImportJobResource**](ImportJobResource.md)| The updated job | [optional]

### Return type

[**ImportJobResource**](ImportJobResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

