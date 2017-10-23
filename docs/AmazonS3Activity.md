
# AmazonS3Activity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | S3 action (i.e., &#39;PUT&#39;) associated with the activity |  [optional]
**cdnUrl** | **String** | URL for accessing the resource. Will use a CDN if configured, or direct to S3 if not |  [optional]
**createdDate** | **Long** | Date the resource was created in S3 |  [optional]
**filename** | **String** | Name of the file being processed as a resource in S3 |  [optional]
**id** | **Long** | Unique id of the S3 activity |  [optional]
**objectKey** | **String** | S3 object key for the resource |  [optional]
**url** | **String** | URL that one can PUT the file to, to upload it to S3 |  [optional]
**userId** | **Integer** | The id of the user that created this S3 activity |  [optional]



