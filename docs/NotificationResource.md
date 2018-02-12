
# NotificationResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **Object** | The data to send to websockets. Also used to fill in the templates |  [optional]
**notificationId** | **String** | The id of this individual notification. Default: random |  [optional]
**notificationTypeId** | **String** | The id of the notification type which will define message templates | 
**recipient** | **String** | The id of the recipient, dependent on the recipient_type. The user&#39;s id or the topic&#39;s id | 
**recipientType** | [**RecipientTypeEnum**](#RecipientTypeEnum) | The type of recipient for the notification. Either a user, or all users in a topic | 
**sendDate** | **Long** | The date this notification was sent |  [optional]


<a name="RecipientTypeEnum"></a>
## Enum: RecipientTypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
TOPIC | &quot;topic&quot;



