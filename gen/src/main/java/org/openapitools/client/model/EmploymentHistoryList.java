/*
 * cis-verification-cpd-service
 * This document consists of unecrypted version of  Experian Verify service endpoints. This service returns standard payroll data Report which has paycheck, employer, employee PII, grosspay and other information.
 *
 * The version of the OpenAPI document: 0.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.EmployerAddressFields;
import org.openapitools.client.model.Employmentstatus;
import org.openapitools.client.model.Payment;
import org.openapitools.client.model.TotalAnnualRemunerationList;
import org.openapitools.client.model.Workstatus;

/**
 * contains employment history details
 */
@ApiModel(description = "contains employment history details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-23T18:37:09.209394200+05:30[Asia/Calcutta]")
public class EmploymentHistoryList {
  public static final String SERIALIZED_NAME_AS_OF_DATE = "asOfDate";
  @SerializedName(SERIALIZED_NAME_AS_OF_DATE)
  private String asOfDate;

  public static final String SERIALIZED_NAME_ORIGIN_REPORT_ID = "originReportId";
  @SerializedName(SERIALIZED_NAME_ORIGIN_REPORT_ID)
  private String originReportId;

  public static final String SERIALIZED_NAME_ORIGIN_SOURCE_ID = "originSourceId";
  @SerializedName(SERIALIZED_NAME_ORIGIN_SOURCE_ID)
  private String originSourceId;

  public static final String SERIALIZED_NAME_EMPLOYER_IDENTIFICATION_NUMBER = "employerIdentificationNumber";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_IDENTIFICATION_NUMBER)
  private String employerIdentificationNumber;

  public static final String SERIALIZED_NAME_EMPLOYER_NAME = "employerName";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_NAME)
  private String employerName;

  public static final String SERIALIZED_NAME_ORIGINAL_HIRE_DATE = "originalHireDate";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_HIRE_DATE)
  private String originalHireDate;

  public static final String SERIALIZED_NAME_MOST_RECENT_HIRE_DATE = "mostRecentHireDate";
  @SerializedName(SERIALIZED_NAME_MOST_RECENT_HIRE_DATE)
  private String mostRecentHireDate;

  public static final String SERIALIZED_NAME_POSITION_TITLE = "positionTitle";
  @SerializedName(SERIALIZED_NAME_POSITION_TITLE)
  private String positionTitle = "string";

  public static final String SERIALIZED_NAME_POSITION_TENURE = "positionTenure";
  @SerializedName(SERIALIZED_NAME_POSITION_TENURE)
  private BigDecimal positionTenure;

  public static final String SERIALIZED_NAME_EMPLOYER_ADDRESS = "employerAddress";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_ADDRESS)
  private EmployerAddressFields employerAddress;

  public static final String SERIALIZED_NAME_EMPLOYMENT_STATUS = "employmentStatus";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_STATUS)
  private Employmentstatus employmentStatus;

  public static final String SERIALIZED_NAME_WORK_STATUS = "workStatus";
  @SerializedName(SERIALIZED_NAME_WORK_STATUS)
  private Workstatus workStatus;

  public static final String SERIALIZED_NAME_PAYMENT_HISTORY = "paymentHistory";
  @SerializedName(SERIALIZED_NAME_PAYMENT_HISTORY)
  private List<Payment> paymentHistory = null;

  public static final String SERIALIZED_NAME_TOTAL_ANNUAL_REMUNERATION = "totalAnnualRemuneration";
  @SerializedName(SERIALIZED_NAME_TOTAL_ANNUAL_REMUNERATION)
  private List<TotalAnnualRemunerationList> totalAnnualRemuneration = null;

  public static final String SERIALIZED_NAME_EMPLOYER_DISCLAIMERS = "employerDisclaimers";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_DISCLAIMERS)
  private String employerDisclaimers;


  public EmploymentHistoryList asOfDate(String asOfDate) {
    
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * refreshed date
   * @return asOfDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "refreshed date")

  public String getAsOfDate() {
    return asOfDate;
  }


  public void setAsOfDate(String asOfDate) {
    this.asOfDate = asOfDate;
  }


  public EmploymentHistoryList originReportId(String originReportId) {
    
    this.originReportId = originReportId;
    return this;
  }

   /**
   * Unique id provided by data provider
   * @return originReportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique id provided by data provider")

  public String getOriginReportId() {
    return originReportId;
  }


  public void setOriginReportId(String originReportId) {
    this.originReportId = originReportId;
  }


  public EmploymentHistoryList originSourceId(String originSourceId) {
    
    this.originSourceId = originSourceId;
    return this;
  }

   /**
   * data furnisher
   * @return originSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "data furnisher")

  public String getOriginSourceId() {
    return originSourceId;
  }


  public void setOriginSourceId(String originSourceId) {
    this.originSourceId = originSourceId;
  }


  public EmploymentHistoryList employerIdentificationNumber(String employerIdentificationNumber) {
    
    this.employerIdentificationNumber = employerIdentificationNumber;
    return this;
  }

   /**
   * Federal employer Identification Number
   * @return employerIdentificationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Federal employer Identification Number")

  public String getEmployerIdentificationNumber() {
    return employerIdentificationNumber;
  }


  public void setEmployerIdentificationNumber(String employerIdentificationNumber) {
    this.employerIdentificationNumber = employerIdentificationNumber;
  }


  public EmploymentHistoryList employerName(String employerName) {
    
    this.employerName = employerName;
    return this;
  }

   /**
   * employer name end consumer is employed to
   * @return employerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "employer name end consumer is employed to")

  public String getEmployerName() {
    return employerName;
  }


  public void setEmployerName(String employerName) {
    this.employerName = employerName;
  }


  public EmploymentHistoryList originalHireDate(String originalHireDate) {
    
    this.originalHireDate = originalHireDate;
    return this;
  }

   /**
   * date on which employee was hired
   * @return originalHireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "date on which employee was hired")

  public String getOriginalHireDate() {
    return originalHireDate;
  }


  public void setOriginalHireDate(String originalHireDate) {
    this.originalHireDate = originalHireDate;
  }


  public EmploymentHistoryList mostRecentHireDate(String mostRecentHireDate) {
    
    this.mostRecentHireDate = mostRecentHireDate;
    return this;
  }

   /**
   * most recent date on which employee was hired. format MMDDYYYY
   * @return mostRecentHireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "most recent date on which employee was hired. format MMDDYYYY")

  public String getMostRecentHireDate() {
    return mostRecentHireDate;
  }


  public void setMostRecentHireDate(String mostRecentHireDate) {
    this.mostRecentHireDate = mostRecentHireDate;
  }


  public EmploymentHistoryList positionTitle(String positionTitle) {
    
    this.positionTitle = positionTitle;
    return this;
  }

   /**
   * employee job position title
   * @return positionTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "employee job position title")

  public String getPositionTitle() {
    return positionTitle;
  }


  public void setPositionTitle(String positionTitle) {
    this.positionTitle = positionTitle;
  }


  public EmploymentHistoryList positionTenure(BigDecimal positionTenure) {
    
    this.positionTenure = positionTenure;
    return this;
  }

   /**
   * months on the job
   * @return positionTenure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "months on the job")

  public BigDecimal getPositionTenure() {
    return positionTenure;
  }


  public void setPositionTenure(BigDecimal positionTenure) {
    this.positionTenure = positionTenure;
  }


  public EmploymentHistoryList employerAddress(EmployerAddressFields employerAddress) {
    
    this.employerAddress = employerAddress;
    return this;
  }

   /**
   * Get employerAddress
   * @return employerAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployerAddressFields getEmployerAddress() {
    return employerAddress;
  }


  public void setEmployerAddress(EmployerAddressFields employerAddress) {
    this.employerAddress = employerAddress;
  }


  public EmploymentHistoryList employmentStatus(Employmentstatus employmentStatus) {
    
    this.employmentStatus = employmentStatus;
    return this;
  }

   /**
   * Get employmentStatus
   * @return employmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Employmentstatus getEmploymentStatus() {
    return employmentStatus;
  }


  public void setEmploymentStatus(Employmentstatus employmentStatus) {
    this.employmentStatus = employmentStatus;
  }


  public EmploymentHistoryList workStatus(Workstatus workStatus) {
    
    this.workStatus = workStatus;
    return this;
  }

   /**
   * Get workStatus
   * @return workStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Workstatus getWorkStatus() {
    return workStatus;
  }


  public void setWorkStatus(Workstatus workStatus) {
    this.workStatus = workStatus;
  }


  public EmploymentHistoryList paymentHistory(List<Payment> paymentHistory) {
    
    this.paymentHistory = paymentHistory;
    return this;
  }

  public EmploymentHistoryList addPaymentHistoryItem(Payment paymentHistoryItem) {
    if (this.paymentHistory == null) {
      this.paymentHistory = new ArrayList<Payment>();
    }
    this.paymentHistory.add(paymentHistoryItem);
    return this;
  }

   /**
   * contains list of consumers individual paycheck data
   * @return paymentHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "contains list of consumers individual paycheck data")

  public List<Payment> getPaymentHistory() {
    return paymentHistory;
  }


  public void setPaymentHistory(List<Payment> paymentHistory) {
    this.paymentHistory = paymentHistory;
  }


  public EmploymentHistoryList totalAnnualRemuneration(List<TotalAnnualRemunerationList> totalAnnualRemuneration) {
    
    this.totalAnnualRemuneration = totalAnnualRemuneration;
    return this;
  }

  public EmploymentHistoryList addTotalAnnualRemunerationItem(TotalAnnualRemunerationList totalAnnualRemunerationItem) {
    if (this.totalAnnualRemuneration == null) {
      this.totalAnnualRemuneration = new ArrayList<TotalAnnualRemunerationList>();
    }
    this.totalAnnualRemuneration.add(totalAnnualRemunerationItem);
    return this;
  }

   /**
   * contains consumers employer information
   * @return totalAnnualRemuneration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "contains consumers employer information")

  public List<TotalAnnualRemunerationList> getTotalAnnualRemuneration() {
    return totalAnnualRemuneration;
  }


  public void setTotalAnnualRemuneration(List<TotalAnnualRemunerationList> totalAnnualRemuneration) {
    this.totalAnnualRemuneration = totalAnnualRemuneration;
  }


  public EmploymentHistoryList employerDisclaimers(String employerDisclaimers) {
    
    this.employerDisclaimers = employerDisclaimers;
    return this;
  }

   /**
   * Employee Disclaimers placeholder
   * @return employerDisclaimers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Employee Disclaimers placeholder")

  public String getEmployerDisclaimers() {
    return employerDisclaimers;
  }


  public void setEmployerDisclaimers(String employerDisclaimers) {
    this.employerDisclaimers = employerDisclaimers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentHistoryList employmentHistoryList = (EmploymentHistoryList) o;
    return Objects.equals(this.asOfDate, employmentHistoryList.asOfDate) &&
        Objects.equals(this.originReportId, employmentHistoryList.originReportId) &&
        Objects.equals(this.originSourceId, employmentHistoryList.originSourceId) &&
        Objects.equals(this.employerIdentificationNumber, employmentHistoryList.employerIdentificationNumber) &&
        Objects.equals(this.employerName, employmentHistoryList.employerName) &&
        Objects.equals(this.originalHireDate, employmentHistoryList.originalHireDate) &&
        Objects.equals(this.mostRecentHireDate, employmentHistoryList.mostRecentHireDate) &&
        Objects.equals(this.positionTitle, employmentHistoryList.positionTitle) &&
        Objects.equals(this.positionTenure, employmentHistoryList.positionTenure) &&
        Objects.equals(this.employerAddress, employmentHistoryList.employerAddress) &&
        Objects.equals(this.employmentStatus, employmentHistoryList.employmentStatus) &&
        Objects.equals(this.workStatus, employmentHistoryList.workStatus) &&
        Objects.equals(this.paymentHistory, employmentHistoryList.paymentHistory) &&
        Objects.equals(this.totalAnnualRemuneration, employmentHistoryList.totalAnnualRemuneration) &&
        Objects.equals(this.employerDisclaimers, employmentHistoryList.employerDisclaimers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asOfDate, originReportId, originSourceId, employerIdentificationNumber, employerName, originalHireDate, mostRecentHireDate, positionTitle, positionTenure, employerAddress, employmentStatus, workStatus, paymentHistory, totalAnnualRemuneration, employerDisclaimers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentHistoryList {\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    originReportId: ").append(toIndentedString(originReportId)).append("\n");
    sb.append("    originSourceId: ").append(toIndentedString(originSourceId)).append("\n");
    sb.append("    employerIdentificationNumber: ").append(toIndentedString(employerIdentificationNumber)).append("\n");
    sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
    sb.append("    originalHireDate: ").append(toIndentedString(originalHireDate)).append("\n");
    sb.append("    mostRecentHireDate: ").append(toIndentedString(mostRecentHireDate)).append("\n");
    sb.append("    positionTitle: ").append(toIndentedString(positionTitle)).append("\n");
    sb.append("    positionTenure: ").append(toIndentedString(positionTenure)).append("\n");
    sb.append("    employerAddress: ").append(toIndentedString(employerAddress)).append("\n");
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
    sb.append("    workStatus: ").append(toIndentedString(workStatus)).append("\n");
    sb.append("    paymentHistory: ").append(toIndentedString(paymentHistory)).append("\n");
    sb.append("    totalAnnualRemuneration: ").append(toIndentedString(totalAnnualRemuneration)).append("\n");
    sb.append("    employerDisclaimers: ").append(toIndentedString(employerDisclaimers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

