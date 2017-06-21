
# VideoGroupPropertyDefinitionResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldList** | [**PropertyFieldListResource**](PropertyFieldListResource.md) | A list of the fields on both the property definition and property of this type |  [optional]
**name** | **String** | The name of the property | 
**required** | **Boolean** | Whether the property is required | 
**type** | **String** | The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties. | 
**fileType** | **String** | If provided, a file type that the property must match |  [optional]
**maxCount** | **Integer** | If provided, the maximum number of files in the group |  [optional]
**maxFileSize** | **Long** | If provided, the maximum allowed size per file in bytes |  [optional]
**minCount** | **Integer** | If provided, the minimum number of files in the group |  [optional]
**maxHeight** | **Integer** | If provided, the maximum height of each video |  [optional]
**maxLength** | **Integer** | If provided, the maximum length of each video |  [optional]
**maxWidth** | **Integer** | If provided, the maximum width of each video |  [optional]
**minHeight** | **Integer** | If provided, the minimum height of each video |  [optional]
**minLength** | **Integer** | If provided, the minimum length of each video |  [optional]
**minWidth** | **Integer** | If provided, the minimum width of each video |  [optional]



