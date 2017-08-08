
# StripeCreatePaymentMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | [**PaymentMethodDetails**](PaymentMethodDetails.md) | Additional optional details to store on the payment method. If included, all fields in the details will override any defaults |  [optional]
**token** | **String** | A token from Stripe to identify payment info to be tied to the customer | 
**userId** | **Integer** | The id of the user, if null the logged in user is used. Admin privilege need to specify other users |  [optional]



