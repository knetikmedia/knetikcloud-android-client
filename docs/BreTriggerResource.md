
# BreTriggerResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryEnum**](#CategoryEnum) | The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category &#39;custom&#39; |  [optional]
**eventName** | **String** | The unique name for the event. This serves as the unique identifier. Cannot be changed after creation | 
**parameters** | [**List&lt;BreTriggerParameterDefinition&gt;**](BreTriggerParameterDefinition.md) | A list of parameters that will be sent with the event when the trigger is fired. These must be included in the event and match the described types |  [optional]
**systemTrigger** | **Boolean** | Where this trigger came from. System triggers cannot be removed or updated |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags for filtering |  [optional]
**triggerDescription** | **String** | A description of the trigger | 
**triggerName** | **String** | A human readable name for this trigger | 


<a name="CategoryEnum"></a>
## Enum: CategoryEnum
Name | Value
---- | -----
ACHIEVEMENT | &quot;achievement&quot;
BEHAVIOR | &quot;behavior&quot;
COMMENT | &quot;comment&quot;
DISPOSITION | &quot;disposition&quot;
DEVICE | &quot;device&quot;
ENTITLEMENT | &quot;entitlement&quot;
FRIENDS | &quot;friends&quot;
FULFILLMENT | &quot;fulfillment&quot;
GAMIFICATION | &quot;gamification&quot;
INVENTORY | &quot;inventory&quot;
INVOICE | &quot;invoice&quot;
MEDIA | &quot;media&quot;
SCHEDULER | &quot;scheduler&quot;
STORE | &quot;store&quot;
SUBSCRIPTION | &quot;subscription&quot;
USER | &quot;user&quot;
WALLET | &quot;wallet&quot;
CUSTOM | &quot;custom&quot;
CHALLENGE | &quot;challenge&quot;
ACTIVITY | &quot;activity&quot;
CAMPAIGN | &quot;campaign&quot;
EVENT | &quot;event&quot;



