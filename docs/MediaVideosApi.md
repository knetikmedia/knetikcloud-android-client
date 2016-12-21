# MediaVideosApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCommentUsingPOST1**](MediaVideosApi.md#addCommentUsingPOST1) | **POST** /media/videos/{video_id}/comments | Add a new video comment
[**addContributorUsingPOST**](MediaVideosApi.md#addContributorUsingPOST) | **POST** /media/videos/{video_id}/contributors | Adds a contributor to a video
[**addDispositionUsingPOST1**](MediaVideosApi.md#addDispositionUsingPOST1) | **POST** /media/videos/{video_id}/dispositions | Add a new Video disposition
[**addFlagUsingPOST**](MediaVideosApi.md#addFlagUsingPOST) | **POST** /media/videos/{video_id}/moderation | Add a new flag
[**addRelatedUsingPOST**](MediaVideosApi.md#addRelatedUsingPOST) | **POST** /media/videos/{video_id}/related | Adds one or more existing videos as related to this one
[**addVideoUsingPOST**](MediaVideosApi.md#addVideoUsingPOST) | **POST** /media/videos | Adds a new video in the system
[**addWhitelistUsingPOST**](MediaVideosApi.md#addWhitelistUsingPOST) | **POST** /media/videos/{id}/whitelist | Adds a user to a video&#39;s whitelist
[**deleteCommentUsingDELETE1**](MediaVideosApi.md#deleteCommentUsingDELETE1) | **DELETE** /media/videos/{video_id}/comments/{id} | Delete a video comment
[**deleteDispositionUsingDELETE1**](MediaVideosApi.md#deleteDispositionUsingDELETE1) | **DELETE** /media/videos/{video_id}/dispositions/{disposition_id} | Delete a video comment
[**deleteFlagUsingDELETE**](MediaVideosApi.md#deleteFlagUsingDELETE) | **DELETE** /media/videos/{video_id}/moderation | Delete a flag
[**deleteRelationshipUsingDELETE1**](MediaVideosApi.md#deleteRelationshipUsingDELETE1) | **DELETE** /media/videos/{video_id}/related/{id} | Delete a video&#39;s relationship
[**deleteVideoUsingDELETE**](MediaVideosApi.md#deleteVideoUsingDELETE) | **DELETE** /media/videos/{id} | Removes a video from the system if no resources are attached to it
[**getCommentsUsingGET1**](MediaVideosApi.md#getCommentsUsingGET1) | **GET** /media/videos/{video_id}/comments | Returns a page of comments for a video
[**getDispositionsUsingGET1**](MediaVideosApi.md#getDispositionsUsingGET1) | **GET** /media/videos/{video_id}/dispositions | Returns a page of dispositions for a video
[**getRelatedUsingGET**](MediaVideosApi.md#getRelatedUsingGET) | **GET** /media/videos/{video_id}/related | Returns a page of video relationships
[**getUserVideosUsingGET**](MediaVideosApi.md#getUserVideosUsingGET) | **GET** /users/{user_id}/videos | Get user videos
[**getVideoUsingGET**](MediaVideosApi.md#getVideoUsingGET) | **GET** /media/videos/{id} | Loads a specific video details
[**removeContributorUsingDELETE**](MediaVideosApi.md#removeContributorUsingDELETE) | **DELETE** /media/videos/{video_id}/contributors/{id} | Removes a contributor from a video
[**removeWhitelistUsingDELETE**](MediaVideosApi.md#removeWhitelistUsingDELETE) | **DELETE** /media/videos/{video_id}/whitelist/{id} | Removes a user from a video&#39;s whitelist
[**searchVideosUsingGET**](MediaVideosApi.md#searchVideosUsingGET) | **GET** /media/videos | Search videos using the documented filters
[**updateCommentUsingPUT1**](MediaVideosApi.md#updateCommentUsingPUT1) | **PUT** /media/videos/{video_id}/comments/{id}/content | Update video comment content 
[**updateRelationshipUsingPUT1**](MediaVideosApi.md#updateRelationshipUsingPUT1) | **PUT** /media/videos/{video_id}/related/{id}/relationship_details | Update a video&#39;s relationship details
[**updateVideoUsingPUT**](MediaVideosApi.md#updateVideoUsingPUT) | **PUT** /media/videos/{id} | Modifies a video&#39;s details
[**viewVideoUsingPOST**](MediaVideosApi.md#viewVideoUsingPOST) | **POST** /media/videos/{id}/views | Increment a video&#39;s view count


<a name="addCommentUsingPOST1"></a>
# **addCommentUsingPOST1**
> CommentResource addCommentUsingPOST1(videoId, commentResource)

Add a new video comment

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Integer videoId = 56; // Integer | The video id 
CommentResource commentResource = new CommentResource(); // CommentResource | The comment object
try {
    CommentResource result = apiInstance.addCommentUsingPOST1(videoId, commentResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#addCommentUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Integer**| The video id  |
 **commentResource** | [**CommentResource**](CommentResource.md)| The comment object | [optional]

### Return type

[**CommentResource**](CommentResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addContributorUsingPOST"></a>
# **addContributorUsingPOST**
> addContributorUsingPOST(videoId, contributionResource)

Adds a contributor to a video

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long videoId = 789L; // Long | The video id
ContributionResource contributionResource = new ContributionResource(); // ContributionResource | The contribution object
try {
    apiInstance.addContributorUsingPOST(videoId, contributionResource);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#addContributorUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Long**| The video id |
 **contributionResource** | [**ContributionResource**](ContributionResource.md)| The contribution object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addDispositionUsingPOST1"></a>
# **addDispositionUsingPOST1**
> DispositionResource addDispositionUsingPOST1(videoId, dispositionResource)

Add a new Video disposition

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Integer videoId = 56; // Integer | The video id
DispositionResource dispositionResource = new DispositionResource(); // DispositionResource | The disposition object
try {
    DispositionResource result = apiInstance.addDispositionUsingPOST1(videoId, dispositionResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#addDispositionUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Integer**| The video id |
 **dispositionResource** | [**DispositionResource**](DispositionResource.md)| The disposition object | [optional]

### Return type

[**DispositionResource**](DispositionResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFlagUsingPOST"></a>
# **addFlagUsingPOST**
> addFlagUsingPOST(videoId, reason)

Add a new flag

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long videoId = 789L; // Long | The video id
String reason = "reason_example"; // String | The flag reason
try {
    apiInstance.addFlagUsingPOST(videoId, reason);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#addFlagUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Long**| The video id |
 **reason** | **String**| The flag reason | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRelatedUsingPOST"></a>
# **addRelatedUsingPOST**
> VideoRelationshipResource addRelatedUsingPOST(videoId, videoRelationshipResource)

Adds one or more existing videos as related to this one

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long videoId = 789L; // Long | The video id
VideoRelationshipResource videoRelationshipResource = new VideoRelationshipResource(); // VideoRelationshipResource | The video relationship object 
try {
    VideoRelationshipResource result = apiInstance.addRelatedUsingPOST(videoId, videoRelationshipResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#addRelatedUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Long**| The video id |
 **videoRelationshipResource** | [**VideoRelationshipResource**](VideoRelationshipResource.md)| The video relationship object  | [optional]

### Return type

[**VideoRelationshipResource**](VideoRelationshipResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addVideoUsingPOST"></a>
# **addVideoUsingPOST**
> VideoResource addVideoUsingPOST(videoResource)

Adds a new video in the system

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
VideoResource videoResource = new VideoResource(); // VideoResource | The video object
try {
    VideoResource result = apiInstance.addVideoUsingPOST(videoResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#addVideoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoResource** | [**VideoResource**](VideoResource.md)| The video object | [optional]

### Return type

[**VideoResource**](VideoResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWhitelistUsingPOST"></a>
# **addWhitelistUsingPOST**
> addWhitelistUsingPOST(id, userId)

Adds a user to a video&#39;s whitelist

Whitelisted users can view video regardless of privacy setting.

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long id = 789L; // Long | The video id
Integer userId = 56; // Integer | The user id
try {
    apiInstance.addWhitelistUsingPOST(id, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#addWhitelistUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The video id |
 **userId** | **Integer**| The user id | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCommentUsingDELETE1"></a>
# **deleteCommentUsingDELETE1**
> deleteCommentUsingDELETE1(videoId, id)

Delete a video comment

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long videoId = 789L; // Long | The video id
Long id = 789L; // Long | The comment id
try {
    apiInstance.deleteCommentUsingDELETE1(videoId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#deleteCommentUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Long**| The video id |
 **id** | **Long**| The comment id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDispositionUsingDELETE1"></a>
# **deleteDispositionUsingDELETE1**
> deleteDispositionUsingDELETE1(dispositionId)

Delete a video comment

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long dispositionId = 789L; // Long | The disposition id
try {
    apiInstance.deleteDispositionUsingDELETE1(dispositionId);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#deleteDispositionUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dispositionId** | **Long**| The disposition id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFlagUsingDELETE"></a>
# **deleteFlagUsingDELETE**
> deleteFlagUsingDELETE(videoId)

Delete a flag

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long videoId = 789L; // Long | The video id
try {
    apiInstance.deleteFlagUsingDELETE(videoId);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#deleteFlagUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Long**| The video id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRelationshipUsingDELETE1"></a>
# **deleteRelationshipUsingDELETE1**
> deleteRelationshipUsingDELETE1(videoId, id)

Delete a video&#39;s relationship

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long videoId = 789L; // Long | The video id
Long id = 789L; // Long | The relationship id
try {
    apiInstance.deleteRelationshipUsingDELETE1(videoId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#deleteRelationshipUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Long**| The video id |
 **id** | **Long**| The relationship id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVideoUsingDELETE"></a>
# **deleteVideoUsingDELETE**
> deleteVideoUsingDELETE(id)

Removes a video from the system if no resources are attached to it

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long id = 789L; // Long | The video id
try {
    apiInstance.deleteVideoUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#deleteVideoUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The video id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCommentsUsingGET1"></a>
# **getCommentsUsingGET1**
> PageResourceCommentResource getCommentsUsingGET1(videoId, size, page)

Returns a page of comments for a video

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Integer videoId = 56; // Integer | The video id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceCommentResource result = apiInstance.getCommentsUsingGET1(videoId, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#getCommentsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Integer**| The video id |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceCommentResource**](PageResourceCommentResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDispositionsUsingGET1"></a>
# **getDispositionsUsingGET1**
> PageResourceDispositionResource getDispositionsUsingGET1(videoId, size, page)

Returns a page of dispositions for a video

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Integer videoId = 56; // Integer | The video id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceDispositionResource result = apiInstance.getDispositionsUsingGET1(videoId, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#getDispositionsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Integer**| The video id |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceDispositionResource**](PageResourceDispositionResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelatedUsingGET"></a>
# **getRelatedUsingGET**
> PageResourceVideoRelationshipResource getRelatedUsingGET(videoId, size, page)

Returns a page of video relationships

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long videoId = 789L; // Long | The video id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceVideoRelationshipResource result = apiInstance.getRelatedUsingGET(videoId, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#getRelatedUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Long**| The video id |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceVideoRelationshipResource**](PageResourceVideoRelationshipResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserVideosUsingGET"></a>
# **getUserVideosUsingGET**
> PageResourceVideoResource getUserVideosUsingGET(userId, excludeFlagged, size, page)

Get user videos

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Integer userId = 56; // Integer | The user id
Boolean excludeFlagged = true; // Boolean | Skip videos that have been flagged by the current user
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceVideoResource result = apiInstance.getUserVideosUsingGET(userId, excludeFlagged, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#getUserVideosUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The user id |
 **excludeFlagged** | **Boolean**| Skip videos that have been flagged by the current user | [optional] [default to true]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceVideoResource**](PageResourceVideoResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVideoUsingGET"></a>
# **getVideoUsingGET**
> VideoResource getVideoUsingGET(id)

Loads a specific video details

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long id = 789L; // Long | The video id
try {
    VideoResource result = apiInstance.getVideoUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#getVideoUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The video id |

### Return type

[**VideoResource**](VideoResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeContributorUsingDELETE"></a>
# **removeContributorUsingDELETE**
> removeContributorUsingDELETE(videoId, id)

Removes a contributor from a video

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long videoId = 789L; // Long | The video id
Integer id = 56; // Integer | The contributor id
try {
    apiInstance.removeContributorUsingDELETE(videoId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#removeContributorUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Long**| The video id |
 **id** | **Integer**| The contributor id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeWhitelistUsingDELETE"></a>
# **removeWhitelistUsingDELETE**
> removeWhitelistUsingDELETE(videoId, id)

Removes a user from a video&#39;s whitelist

Remove the user with the id given in the path from the whitelist of users that can view this video regardless of privacy setting.

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long videoId = 789L; // Long | The video id
Integer id = 56; // Integer | The user id
try {
    apiInstance.removeWhitelistUsingDELETE(videoId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#removeWhitelistUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Long**| The video id |
 **id** | **Integer**| The user id |

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchVideosUsingGET"></a>
# **searchVideosUsingGET**
> PageResourceVideoResource searchVideosUsingGET(excludeFlagged, filterVideosByUploader, filterCategory, filterTagset, filterVideosByName, filterVideosByContributor, filterVideosByAuthor, filterHasAuthor, filterHasUploader, filterRelatedTo, filterFriends, filterDisposition, size, page, order)

Search videos using the documented filters

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Boolean excludeFlagged = true; // Boolean | Skip videos that have been flagged by the current user
String filterVideosByUploader = "filterVideosByUploader_example"; // String | Filter for videos by uploader id
String filterCategory = "filterCategory_example"; // String | Filter for videos from a specific category by id
String filterTagset = "filterTagset_example"; // String | Filter for videos with specified tags (separated by comma)
String filterVideosByName = "filterVideosByName_example"; // String | Filter for videos which name *STARTS* with the given string
String filterVideosByContributor = "filterVideosByContributor_example"; // String | Filter for videos with contribution from the artist specified by ID
String filterVideosByAuthor = "filterVideosByAuthor_example"; // String | Filter for videos with an artist as author specified by ID
Boolean filterHasAuthor = true; // Boolean | Filter for videos that have an author set if true, or that have no author if false
Boolean filterHasUploader = true; // Boolean | Filter for videos that have an uploader set if true, or that have no uploader if false
String filterRelatedTo = "filterRelatedTo_example"; // String | Filter for videos that have designated a particular video as the TO of a relationship. Pattern should match VIDEO_ID or VIDEO_ID:DETAILS to match with a specific details string as well
Boolean filterFriends = true; // Boolean | Filter for videos uploaded by friends. 'true' for friends of the caller (requires user token) or a user id for a specific user's friends (requires VIDEOS_ADMIN permission)
String filterDisposition = "filterDisposition_example"; // String | Filter for videos a given user has a given disposition towards. USER_ID:DISPOSITION where USER_ID is the id of the user who has this disposition or 'me' for the caller (requires user token for 'me') and DISPOSITION is the name of the disposition. E.G. filter_disposition=123:like or filter_disposition=me:favorite
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "author:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceVideoResource result = apiInstance.searchVideosUsingGET(excludeFlagged, filterVideosByUploader, filterCategory, filterTagset, filterVideosByName, filterVideosByContributor, filterVideosByAuthor, filterHasAuthor, filterHasUploader, filterRelatedTo, filterFriends, filterDisposition, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#searchVideosUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **excludeFlagged** | **Boolean**| Skip videos that have been flagged by the current user | [optional] [default to true]
 **filterVideosByUploader** | **String**| Filter for videos by uploader id | [optional]
 **filterCategory** | **String**| Filter for videos from a specific category by id | [optional]
 **filterTagset** | **String**| Filter for videos with specified tags (separated by comma) | [optional]
 **filterVideosByName** | **String**| Filter for videos which name *STARTS* with the given string | [optional]
 **filterVideosByContributor** | **String**| Filter for videos with contribution from the artist specified by ID | [optional]
 **filterVideosByAuthor** | **String**| Filter for videos with an artist as author specified by ID | [optional]
 **filterHasAuthor** | **Boolean**| Filter for videos that have an author set if true, or that have no author if false | [optional]
 **filterHasUploader** | **Boolean**| Filter for videos that have an uploader set if true, or that have no uploader if false | [optional]
 **filterRelatedTo** | **String**| Filter for videos that have designated a particular video as the TO of a relationship. Pattern should match VIDEO_ID or VIDEO_ID:DETAILS to match with a specific details string as well | [optional]
 **filterFriends** | **Boolean**| Filter for videos uploaded by friends. &#39;true&#39; for friends of the caller (requires user token) or a user id for a specific user&#39;s friends (requires VIDEOS_ADMIN permission) | [optional]
 **filterDisposition** | **String**| Filter for videos a given user has a given disposition towards. USER_ID:DISPOSITION where USER_ID is the id of the user who has this disposition or &#39;me&#39; for the caller (requires user token for &#39;me&#39;) and DISPOSITION is the name of the disposition. E.G. filter_disposition&#x3D;123:like or filter_disposition&#x3D;me:favorite | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to author:ASC]

### Return type

[**PageResourceVideoResource**](PageResourceVideoResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCommentUsingPUT1"></a>
# **updateCommentUsingPUT1**
> updateCommentUsingPUT1(videoId, id, content)

Update video comment content 

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long videoId = 789L; // Long | The video id
Long id = 789L; // Long | The comment id
String content = "content_example"; // String | The comment content
try {
    apiInstance.updateCommentUsingPUT1(videoId, id, content);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#updateCommentUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Long**| The video id |
 **id** | **Long**| The comment id |
 **content** | **String**| The comment content | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRelationshipUsingPUT1"></a>
# **updateRelationshipUsingPUT1**
> updateRelationshipUsingPUT1(videoId, relationshipId, details)

Update a video&#39;s relationship details

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long videoId = 789L; // Long | The video id
Long relationshipId = 789L; // Long | The relationship id
String details = "details_example"; // String | The video relationship details
try {
    apiInstance.updateRelationshipUsingPUT1(videoId, relationshipId, details);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#updateRelationshipUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **Long**| The video id |
 **relationshipId** | **Long**| The relationship id |
 **details** | **String**| The video relationship details | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVideoUsingPUT"></a>
# **updateVideoUsingPUT**
> updateVideoUsingPUT(id, videoResource)

Modifies a video&#39;s details

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long id = 789L; // Long | The video id
VideoResource videoResource = new VideoResource(); // VideoResource | The video object
try {
    apiInstance.updateVideoUsingPUT(id, videoResource);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#updateVideoUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The video id |
 **videoResource** | [**VideoResource**](VideoResource.md)| The video object | [optional]

### Return type

null (empty response body)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="viewVideoUsingPOST"></a>
# **viewVideoUsingPOST**
> viewVideoUsingPOST(id)

Increment a video&#39;s view count

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaVideosApi;

MediaVideosApi apiInstance = new MediaVideosApi();
Long id = 789L; // Long | The video id
try {
    apiInstance.viewVideoUsingPOST(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaVideosApi#viewVideoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The video id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

