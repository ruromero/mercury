/*
 * Customer Offer
 * This service domain orchestrates the processing of a product offer for a new/established  customer.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.customeroffer.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQComplianceRetrieveOutputModelComplianceInstanceReport1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQComplianceRetrieveOutputModelComplianceInstanceReport1 {
  @SerializedName("complianceInstanceReportRecord")
  private Object complianceInstanceReportRecord = null;

  @SerializedName("complianceInstanceReportType")
  private String complianceInstanceReportType = null;

  @SerializedName("complianceInstanceReportParameters")
  private String complianceInstanceReportParameters = null;

  @SerializedName("complianceInstanceReport")
  private Object complianceInstanceReport = null;

  public BQComplianceRetrieveOutputModelComplianceInstanceReport1 complianceInstanceReportRecord(Object complianceInstanceReportRecord) {
    this.complianceInstanceReportRecord = complianceInstanceReportRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return complianceInstanceReportRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")
  public Object getComplianceInstanceReportRecord() {
    return complianceInstanceReportRecord;
  }

  public void setComplianceInstanceReportRecord(Object complianceInstanceReportRecord) {
    this.complianceInstanceReportRecord = complianceInstanceReportRecord;
  }

  public BQComplianceRetrieveOutputModelComplianceInstanceReport1 complianceInstanceReportType(String complianceInstanceReportType) {
    this.complianceInstanceReportType = complianceInstanceReportType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return complianceInstanceReportType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")
  public String getComplianceInstanceReportType() {
    return complianceInstanceReportType;
  }

  public void setComplianceInstanceReportType(String complianceInstanceReportType) {
    this.complianceInstanceReportType = complianceInstanceReportType;
  }

  public BQComplianceRetrieveOutputModelComplianceInstanceReport1 complianceInstanceReportParameters(String complianceInstanceReportParameters) {
    this.complianceInstanceReportParameters = complianceInstanceReportParameters;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return complianceInstanceReportParameters
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")
  public String getComplianceInstanceReportParameters() {
    return complianceInstanceReportParameters;
  }

  public void setComplianceInstanceReportParameters(String complianceInstanceReportParameters) {
    this.complianceInstanceReportParameters = complianceInstanceReportParameters;
  }

  public BQComplianceRetrieveOutputModelComplianceInstanceReport1 complianceInstanceReport(Object complianceInstanceReport) {
    this.complianceInstanceReport = complianceInstanceReport;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return complianceInstanceReport
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")
  public Object getComplianceInstanceReport() {
    return complianceInstanceReport;
  }

  public void setComplianceInstanceReport(Object complianceInstanceReport) {
    this.complianceInstanceReport = complianceInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQComplianceRetrieveOutputModelComplianceInstanceReport1 bqComplianceRetrieveOutputModelComplianceInstanceReport1 = (BQComplianceRetrieveOutputModelComplianceInstanceReport1) o;
    return Objects.equals(this.complianceInstanceReportRecord, bqComplianceRetrieveOutputModelComplianceInstanceReport1.complianceInstanceReportRecord) &&
        Objects.equals(this.complianceInstanceReportType, bqComplianceRetrieveOutputModelComplianceInstanceReport1.complianceInstanceReportType) &&
        Objects.equals(this.complianceInstanceReportParameters, bqComplianceRetrieveOutputModelComplianceInstanceReport1.complianceInstanceReportParameters) &&
        Objects.equals(this.complianceInstanceReport, bqComplianceRetrieveOutputModelComplianceInstanceReport1.complianceInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceInstanceReportRecord, complianceInstanceReportType, complianceInstanceReportParameters, complianceInstanceReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQComplianceRetrieveOutputModelComplianceInstanceReport1 {\n");
    
    sb.append("    complianceInstanceReportRecord: ").append(toIndentedString(complianceInstanceReportRecord)).append("\n");
    sb.append("    complianceInstanceReportType: ").append(toIndentedString(complianceInstanceReportType)).append("\n");
    sb.append("    complianceInstanceReportParameters: ").append(toIndentedString(complianceInstanceReportParameters)).append("\n");
    sb.append("    complianceInstanceReport: ").append(toIndentedString(complianceInstanceReport)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
