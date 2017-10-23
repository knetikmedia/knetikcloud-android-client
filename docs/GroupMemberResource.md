
# GroupMemberResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalProperties** | [**Map&lt;String, Property&gt;**](Property.md) | A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this type, or be an extra not from the template |  [optional]
**avatarUrl** | **String** | The url of the user&#39;s avatar image |  [optional]
**displayName** | **String** | The public username of the user |  [optional]
**id** | **Integer** | The id of the user | 
**order** | **String** | The position of the member in the group if applicable. Read notes for details |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The member&#39;s access level. Default: member |  [optional]
**template** | **String** | A template this member additional properties are validated against (private). May be null and no validation of properties will be done |  [optional]
**username** | **String** | The username of the user |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
MODERATOR | &quot;moderator&quot;
MEMBER | &quot;member&quot;



