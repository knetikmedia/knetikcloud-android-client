
# UserNotificationResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **Object** | The data to send and fill templates |  [optional]
**notificationId** | **String** | The id of the notification | 
**notificationTypeId** | **String** | The id of the notification type | 
**recipient** | **String** | The id of the recipient, dependent on the recipient_type. The user&#39;s id or the topic&#39;s id | 
**recipientType** | [**RecipientTypeEnum**](#RecipientTypeEnum) | The type of recipient for the notification. Either a user, or all users in a topic | 
**retrieveDate** | **Long** | The date this notification was first retrieved |  [optional]
**sendDate** | **Long** | The date this notification was sent |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The user&#39;s status for this notification |  [optional]
**userId** | **Integer** | The id of the user | 


<a name="RecipientTypeEnum"></a>
## Enum: RecipientTypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
TOPIC | &quot;topic&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
READ | &quot;read&quot;
HIDDEN | &quot;hidden&quot;



