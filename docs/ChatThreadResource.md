
# ChatThreadResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeUsers** | **Integer** | The number of active users in the thread |  [optional]
**count** | **Integer** | The number of messages in the thread |  [optional]
**createdDate** | **Long** | The date the thread was created |  [optional]
**id** | **String** | The id for this thread |  [optional]
**recipientId** | **String** | The id of the recipient | 
**recipientType** | [**RecipientTypeEnum**](#RecipientTypeEnum) | The recipient type of the thread | 
**subject** | **String** | The subject of the thread |  [optional]
**updatedDate** | **Long** | The date the thread was updated |  [optional]


<a name="RecipientTypeEnum"></a>
## Enum: RecipientTypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
TOPIC | &quot;topic&quot;



