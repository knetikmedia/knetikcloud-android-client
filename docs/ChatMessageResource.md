
# ChatMessageResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **Object** | The content of the message | 
**createdDate** | **Long** | The date the chat message was created |  [optional]
**edited** | **Boolean** | Whether the message has been edited |  [optional]
**id** | **String** | The id for this message |  [optional]
**messageType** | **String** | The type of the message set by the client | 
**recipientId** | **String** | The id of the recipient: user id or topic id | 
**recipientType** | [**RecipientTypeEnum**](#RecipientTypeEnum) | The recipient type of the message | 
**senderId** | **Integer** | The id of the sender |  [optional]
**threadId** | **String** | The id of the thread |  [optional]
**updatedDate** | **Long** | The date the chat message was updated |  [optional]


<a name="RecipientTypeEnum"></a>
## Enum: RecipientTypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
TOPIC | &quot;topic&quot;



