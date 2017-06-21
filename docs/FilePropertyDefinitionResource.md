
# FilePropertyDefinitionResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldList** | [**PropertyFieldListResource**](PropertyFieldListResource.md) | A list of the fields on both the property definition and property of this type |  [optional]
**name** | **String** | The name of the property | 
**required** | **Boolean** | Whether the property is required | 
**type** | **String** | The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties. | 
**fileType** | **String** | If provided, a file type that the property must match |  [optional]
**maxFileSize** | **Long** | If provided, the maximum allowed file size in bytes |  [optional]



