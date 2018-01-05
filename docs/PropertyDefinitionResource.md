
# PropertyDefinitionResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description of the property |  [optional]
**fieldList** | [**PropertyFieldListResource**](PropertyFieldListResource.md) | A list of the fields on both the property definition and property of this type |  [optional]
**friendlyName** | **String** | The friendly front-facing name of the property |  [optional]
**name** | **String** | The name of the property | 
**optionLabelPath** | **String** | The JSON path to the option label |  [optional]
**optionValuePath** | **String** | The JSON path to the option value |  [optional]
**optionsUrl** | **String** | URL of service containing the property options (assumed JSON array) |  [optional]
**required** | **Boolean** | Whether the property is required | 
**type** | **String** | The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties. | 



