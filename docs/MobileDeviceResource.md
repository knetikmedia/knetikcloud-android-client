
# MobileDeviceResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorization** | **String** | The authorization code for push notifications provided by the provider platform (APNS, GCM, etc). |  [optional]
**imei** | **String** |  |  [optional]
**notificationPlatform** | [**NotificationPlatformEnum**](#NotificationPlatformEnum) | The platform used for push notifications. Only Apple and Android are supported at the moment. |  [optional]
**number** | **String** | The phone number associated with this device if applicable, in international format |  [optional]


<a name="NotificationPlatformEnum"></a>
## Enum: NotificationPlatformEnum
Name | Value
---- | -----
APNS | &quot;APNS&quot;
GCM | &quot;GCM&quot;



