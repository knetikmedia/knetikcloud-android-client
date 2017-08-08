
# ActionResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryEnum**](#CategoryEnum) | The category the action is in. All customer specific actions are in the &#39;custom&#39; category |  [optional]
**description** | **String** | The description of the action | 
**name** | **String** | The name of the action. Used as the unique id for reference | 
**tags** | **List&lt;String&gt;** | A list of tags for searching |  [optional]
**variables** | [**List&lt;ActionVariableResource&gt;**](ActionVariableResource.md) | The variables required for the action | 


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



