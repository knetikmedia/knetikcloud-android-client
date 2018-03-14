
# MetricResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityOccurenceId** | **Long** | The id of the activity occurence where this score/metric occurred | 
**tags** | **List&lt;String&gt;** | Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 10 tags and 50 characters each |  [optional]
**userId** | **Integer** | The id of the user this metric is for. Default to caller and requires METRICS_ADMIN permission to specify another |  [optional]
**value** | **Long** | The value/score of the metric | 



