
# ImagePropertyDefinitionResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldList** | [**PropertyFieldListResource**](PropertyFieldListResource.md) | A list of the fields on both the property definition and property of this type |  [optional]
**name** | **String** | The name of the property | 
**required** | **Boolean** | Whether the property is required | 
**type** | **String** | The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties. | 
**fileType** | **String** | If provided, a file type that the property must match |  [optional]
**maxHeight** | **Integer** | If provided, the maximum height of the image |  [optional]
**maxWidth** | **Integer** | If provided, the maximum width of the image |  [optional]
**minHeight** | **Integer** | If provided, the minimum height of the image |  [optional]
**minWidth** | **Integer** | If provided, the minimum width of the image |  [optional]



