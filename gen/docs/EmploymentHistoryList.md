

# EmploymentHistoryList

contains employment history details
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **String** | refreshed date |  [optional]
**originReportId** | **String** | Unique id provided by data provider |  [optional]
**originSourceId** | **String** | data furnisher |  [optional]
**employerIdentificationNumber** | **String** | Federal employer Identification Number |  [optional]
**employerName** | **String** | employer name end consumer is employed to |  [optional]
**originalHireDate** | **String** | date on which employee was hired |  [optional]
**mostRecentHireDate** | **String** | most recent date on which employee was hired. format MMDDYYYY |  [optional]
**positionTitle** | **String** | employee job position title |  [optional]
**positionTenure** | **BigDecimal** | months on the job |  [optional]
**employerAddress** | [**EmployerAddressFields**](EmployerAddressFields.md) |  |  [optional]
**employmentStatus** | [**Employmentstatus**](Employmentstatus.md) |  |  [optional]
**workStatus** | [**Workstatus**](Workstatus.md) |  |  [optional]
**paymentHistory** | [**List&lt;Payment&gt;**](Payment.md) | contains list of consumers individual paycheck data |  [optional]
**totalAnnualRemuneration** | [**List&lt;TotalAnnualRemunerationList&gt;**](TotalAnnualRemunerationList.md) | contains consumers employer information |  [optional]
**employerDisclaimers** | **String** | Employee Disclaimers placeholder |  [optional]



