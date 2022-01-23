

# ConsumerReportResponse

Response information for consumer body
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportId** | **String** | unique id given to consumer report |  [optional]
**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | type of verification report client needs for the end consumers |  [optional]
**reportGeneratedDate** | **String** | report created date by experian (unixtimestamp) |  [optional]
**requestor** | [**Requestor**](Requestor.md) |  |  [optional]
**resellerInfo** | [**ResellerInfo**](ResellerInfo.md) |  |  [optional]
**reportCustomLabels** | [**ReselleroptionsList**](ReselleroptionsList.md) |  |  [optional]
**consumerPii** | [**PIIList**](PIIList.md) |  |  [optional]



## Enum: ReportTypeEnum

Name | Value
---- | -----
PREMIUM | &quot;ExpVerify-Premium&quot;
REVERIFY_VOIE | &quot;ExpVerify-Reverify VOIE&quot;



