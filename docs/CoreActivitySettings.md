
# CoreActivitySettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bootInPlay** | **Boolean** | Whether the host can boot a user while the status is PLAYING. Default false |  [optional]
**customLaunchAddressAllowed** | **Boolean** | Restriction for whether the host creating an occurrence can specify a custom launch address (such as their own ip address). Default &#39;false&#39; |  [optional]
**hostOption** | [**HostOptionEnum**](#HostOptionEnum) | Restriction for who can host an occurrence. admin disallows regular users, player means the user must also be a player in the occurrence if not admin, non-player means the user has the option to host without being a player. Default &#39;player&#39; |  [optional]
**hostStatusControl** | **Boolean** | Restriction for whether the host has control of the status once the game launches. If false they can only manage the game before (when setup and open). Default &#39;false&#39; |  [optional]
**joinInPlay** | **Boolean** | Whether users can join while the status is PLAYING. Default false |  [optional]
**leaveInPlay** | **Boolean** | Whether users can leave while the status is PLAYING. Default false |  [optional]
**maxPlayers** | **Integer** | The maximum number of players the game can hold |  [optional]
**minPlayers** | **Integer** | The minimum number of players the game can hold |  [optional]
**resultsTrust** | [**ResultsTrustEnum**](#ResultsTrustEnum) | Restriction for who is able to report game end and results. Admin is always able to send results as well. Default &#39;none&#39; |  [optional]


<a name="HostOptionEnum"></a>
## Enum: HostOptionEnum
Name | Value
---- | -----
ADMIN_ONLY | &quot;admin_only&quot;
PLAYER | &quot;player&quot;
NON_PLAYER | &quot;non_player&quot;


<a name="ResultsTrustEnum"></a>
## Enum: ResultsTrustEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
HOST | &quot;host&quot;
ALL | &quot;all&quot;



