
# NotificationTypeResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdDate** | **Long** | The date the type was created, as a unix timestamp in seconds |  [optional]
**emailBodyTemplateExternal** | **Boolean** | Whether the email body should be resolved. If true, the external email delivery system will be expected to handle the templating (Mandrill/Mailchimp). default: false |  [optional]
**emailBodyTemplateId** | **String** | The id of a message template to resolve the email body. If null, no websocket message wil be sent |  [optional]
**emailSubjectTemplateId** | **String** | The id of a message template to resolve the email subject. If null, no websocket message wil be sent |  [optional]
**id** | **String** | The id of the notification type. Default: random |  [optional]
**name** | **String** | The name of the notification type | 
**smsTemplateId** | **String** | The id of a message template to resolve the SMS message. If null, no sms message wil be sent |  [optional]
**updatedDate** | **Long** | The date the type was last updated, as a unix timestamp in seconds |  [optional]



