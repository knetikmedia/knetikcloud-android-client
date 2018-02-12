
# MessageResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**MessageContentResource**](MessageContentResource.md) | The content of the message in various formats | 
**recipient** | **String** | The id of the recipient, dependent on the recipient_type. The user&#39;s id or the topic&#39;s id. Required if sending directly to messaging service |  [optional]
**recipientType** | [**RecipientTypeEnum**](#RecipientTypeEnum) | The type of recipient for the message. Either a user, or all users in a topic. Required if sending directly to messaging service |  [optional]
**subject** | **String** | The subject of the message. Required for email messages |  [optional]
**type** | **String** | The type of message for websocket type hinting. will be added to the payload with the key _type |  [optional]


<a name="RecipientTypeEnum"></a>
## Enum: RecipientTypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
TOPIC | &quot;topic&quot;



