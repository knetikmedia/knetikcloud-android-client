
# TemplateSMSResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The phone number to attribute the outgoing message to. Optional if the config text.out_number is set. |  [optional]
**recipients** | **List&lt;Integer&gt;** | A list of user ids to send the message to. | 
**template** | **String** | A mustache template | 
**templateVars** | **Object** | A map of values to fill in the template |  [optional]



