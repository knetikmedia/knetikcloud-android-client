
# SubscriptionPlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalProperties** | [**Map&lt;String, Property&gt;**](Property.md) |  |  [optional]
**availability** | [**AvailabilityEnum**](#AvailabilityEnum) |  |  [optional]
**billGraceDays** | **Integer** |  |  [optional]
**consolidated** | **Boolean** |  |  [optional]
**firstBill** | **Integer** |  |  [optional]
**firstBillUnitOfTime** | [**FirstBillUnitOfTimeEnum**](#FirstBillUnitOfTimeEnum) |  |  [optional]
**id** | **String** |  |  [optional]
**latePaymentSku** | **String** |  |  [optional]
**locked** | **Boolean** |  |  [optional]
**maxAutoRenew** | **Integer** |  |  [optional]
**maxBillAttempts** | **Integer** |  |  [optional]
**migrationPlan** | **String** |  |  [optional]
**minimumTerm** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**primarySku** | **String** |  |  [optional]
**reactivationSku** | **String** |  |  [optional]
**recurringSku** | **String** |  |  [optional]
**renewPeriod** | **Integer** |  |  [optional]
**renewPeriodUnitOfTime** | [**RenewPeriodUnitOfTimeEnum**](#RenewPeriodUnitOfTimeEnum) |  |  [optional]
**subscriptionId** | **Integer** |  |  [optional]


<a name="AvailabilityEnum"></a>
## Enum: AvailabilityEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
NEW_SUBSCRIBERS | &quot;new_subscribers&quot;


<a name="FirstBillUnitOfTimeEnum"></a>
## Enum: FirstBillUnitOfTimeEnum
Name | Value
---- | -----
MILLISECOND | &quot;millisecond&quot;
SECOND | &quot;second&quot;
MINUTE | &quot;minute&quot;
HOUR | &quot;hour&quot;
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
YEAR | &quot;year&quot;


<a name="RenewPeriodUnitOfTimeEnum"></a>
## Enum: RenewPeriodUnitOfTimeEnum
Name | Value
---- | -----
MILLISECOND | &quot;millisecond&quot;
SECOND | &quot;second&quot;
MINUTE | &quot;minute&quot;
HOUR | &quot;hour&quot;
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
YEAR | &quot;year&quot;



