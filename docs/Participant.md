
# Participant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **Boolean** | Whether this user is the &#39;host&#39; of the occurrence and has increased access to settings/etc (default: false) |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The current status of the user in the occurrence (default: present) |  [optional]
**user** | [**IdRef**](IdRef.md) | The user | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PRESENT | &quot;present&quot;
READY | &quot;ready&quot;
LEFT | &quot;left&quot;
SURRENDERED | &quot;surrendered&quot;
DISCONNECTED | &quot;disconnected&quot;



