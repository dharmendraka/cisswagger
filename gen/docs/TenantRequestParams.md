

# TenantRequestParams

voie Request Body
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consumertoken** | **String** | connect api token to retrieve consumer PII | 
**requestor** | [**Requestor**](Requestor.md) |  | 
**permissiblePurpose** | [**PermissiblePurpose**](PermissiblePurpose.md) |  | 
**resellerInfo** | [**ResellerInfo**](ResellerInfo.md) |  |  [optional]
**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | report type for say VOI, VOE. | 
**vendorData** | [**VendorData**](VendorData.md) |  |  [optional]
**customOptions** | [**CustomOptions**](CustomOptions.md) |  |  [optional]



## Enum: ReportTypeEnum

Name | Value
---- | -----
EXPVERIFY_PREMIUM | &quot;ExpVerify-Premium&quot;
EXPERIAN_REVERIFY_VOIE | &quot;Experian Reverify VOIE&quot;



