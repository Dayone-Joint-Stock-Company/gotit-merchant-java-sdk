

# ResponseCheckMultipleSchemaDataInnerRedemptions

Include information related to the use of the voucher (all types)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**redeemSkuCodes** | [**List&lt;ResponseCheckMultipleSchemaDataInnerRedemptionsRedeemSkuCodesInner&gt;**](ResponseCheckMultipleSchemaDataInnerRedemptionsRedeemSkuCodesInner.md) | Contains redeemed SKU information of the voucher (for voucher type is conditional and support sku) |  [optional] |
|**redemptionValue** | **Integer** | Actual redemption value of voucher type &#x3D; conditional |  [optional] |
|**usedStore** | [**ResponseCheckMultipleSchemaDataInnerRedemptionsUsedStore**](ResponseCheckMultipleSchemaDataInnerRedemptionsUsedStore.md) |  |  [optional] |
|**usedDate** | **String** | Date voucher marked as used in case the voucher has been redeemed. Format (YYYY-MM-DD HH:MM:SS) |  [optional] |
|**billNumber** | **String** | Bill number for which voucher used/reserved |  [optional] |



