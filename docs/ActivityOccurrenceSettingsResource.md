
# ActivityOccurrenceSettingsResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coreSettings** | [**CoreActivityOccurrenceSettings**](CoreActivityOccurrenceSettings.md) | Defines core settings about the activity occurrence that affect how it behaves in the system. Validated against core settings in activity/challenge-activity. |  [optional]
**settings** | [**List&lt;SelectedSettingRequest&gt;**](SelectedSettingRequest.md) | The values selected from the available settings defined for the activity. Ex: difficulty: hard. Can be left out if the activity is played during an event and the settings are already set at the event level. Ex: every monday, difficulty: hard, number of questions: 10, category: sport. Otherwise, the set must exactly match those of the activity. |  [optional]



