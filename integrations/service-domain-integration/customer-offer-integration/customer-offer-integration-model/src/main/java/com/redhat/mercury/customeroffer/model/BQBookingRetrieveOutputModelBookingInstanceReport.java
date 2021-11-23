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
 * BQBookingRetrieveOutputModelBookingInstanceReport
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQBookingRetrieveOutputModelBookingInstanceReport {
  @SerializedName("bookingInstanceReportRecord")
  private Object bookingInstanceReportRecord = null;

  @SerializedName("bookingInstanceReportType")
  private String bookingInstanceReportType = null;

  @SerializedName("bookingInstanceReportParameters")
  private String bookingInstanceReportParameters = null;

  @SerializedName("bookingInstanceReport")
  private Object bookingInstanceReport = null;

  public BQBookingRetrieveOutputModelBookingInstanceReport bookingInstanceReportRecord(Object bookingInstanceReportRecord) {
    this.bookingInstanceReportRecord = bookingInstanceReportRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return bookingInstanceReportRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")
  public Object getBookingInstanceReportRecord() {
    return bookingInstanceReportRecord;
  }

  public void setBookingInstanceReportRecord(Object bookingInstanceReportRecord) {
    this.bookingInstanceReportRecord = bookingInstanceReportRecord;
  }

  public BQBookingRetrieveOutputModelBookingInstanceReport bookingInstanceReportType(String bookingInstanceReportType) {
    this.bookingInstanceReportType = bookingInstanceReportType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return bookingInstanceReportType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")
  public String getBookingInstanceReportType() {
    return bookingInstanceReportType;
  }

  public void setBookingInstanceReportType(String bookingInstanceReportType) {
    this.bookingInstanceReportType = bookingInstanceReportType;
  }

  public BQBookingRetrieveOutputModelBookingInstanceReport bookingInstanceReportParameters(String bookingInstanceReportParameters) {
    this.bookingInstanceReportParameters = bookingInstanceReportParameters;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return bookingInstanceReportParameters
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")
  public String getBookingInstanceReportParameters() {
    return bookingInstanceReportParameters;
  }

  public void setBookingInstanceReportParameters(String bookingInstanceReportParameters) {
    this.bookingInstanceReportParameters = bookingInstanceReportParameters;
  }

  public BQBookingRetrieveOutputModelBookingInstanceReport bookingInstanceReport(Object bookingInstanceReport) {
    this.bookingInstanceReport = bookingInstanceReport;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return bookingInstanceReport
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")
  public Object getBookingInstanceReport() {
    return bookingInstanceReport;
  }

  public void setBookingInstanceReport(Object bookingInstanceReport) {
    this.bookingInstanceReport = bookingInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQBookingRetrieveOutputModelBookingInstanceReport bqBookingRetrieveOutputModelBookingInstanceReport = (BQBookingRetrieveOutputModelBookingInstanceReport) o;
    return Objects.equals(this.bookingInstanceReportRecord, bqBookingRetrieveOutputModelBookingInstanceReport.bookingInstanceReportRecord) &&
        Objects.equals(this.bookingInstanceReportType, bqBookingRetrieveOutputModelBookingInstanceReport.bookingInstanceReportType) &&
        Objects.equals(this.bookingInstanceReportParameters, bqBookingRetrieveOutputModelBookingInstanceReport.bookingInstanceReportParameters) &&
        Objects.equals(this.bookingInstanceReport, bqBookingRetrieveOutputModelBookingInstanceReport.bookingInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingInstanceReportRecord, bookingInstanceReportType, bookingInstanceReportParameters, bookingInstanceReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQBookingRetrieveOutputModelBookingInstanceReport {\n");
    
    sb.append("    bookingInstanceReportRecord: ").append(toIndentedString(bookingInstanceReportRecord)).append("\n");
    sb.append("    bookingInstanceReportType: ").append(toIndentedString(bookingInstanceReportType)).append("\n");
    sb.append("    bookingInstanceReportParameters: ").append(toIndentedString(bookingInstanceReportParameters)).append("\n");
    sb.append("    bookingInstanceReport: ").append(toIndentedString(bookingInstanceReport)).append("\n");
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
