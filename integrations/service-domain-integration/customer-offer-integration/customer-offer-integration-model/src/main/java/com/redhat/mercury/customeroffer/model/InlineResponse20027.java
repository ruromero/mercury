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
import com.redhat.mercury.customeroffer.model.BQBookingRetrieveOutputModelBookingInstanceAnalysis1;
import com.redhat.mercury.customeroffer.model.BQBookingRetrieveOutputModelBookingInstanceRecord1;
import com.redhat.mercury.customeroffer.model.BQBookingRetrieveOutputModelBookingInstanceReport1;
import com.redhat.mercury.customeroffer.model.BQBookingRetrieveOutputModelCustomerOfferProcedureInstanceRecord1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse20027
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class InlineResponse20027 {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private BQBookingRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord = null;

  @SerializedName("bookingInstanceRecord")
  private BQBookingRetrieveOutputModelBookingInstanceRecord1 bookingInstanceRecord = null;

  @SerializedName("bookingRetrieveActionTaskReference")
  private String bookingRetrieveActionTaskReference = null;

  @SerializedName("bookingRetrieveActionTaskRecord")
  private Object bookingRetrieveActionTaskRecord = null;

  @SerializedName("bookingRetrieveActionResponse")
  private String bookingRetrieveActionResponse = null;

  @SerializedName("bookingInstanceReport")
  private BQBookingRetrieveOutputModelBookingInstanceReport1 bookingInstanceReport = null;

  @SerializedName("bookingInstanceAnalysis")
  private BQBookingRetrieveOutputModelBookingInstanceAnalysis1 bookingInstanceAnalysis = null;

  public InlineResponse20027 customerOfferProcedureInstanceRecord(BQBookingRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public BQBookingRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQBookingRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public InlineResponse20027 bookingInstanceRecord(BQBookingRetrieveOutputModelBookingInstanceRecord1 bookingInstanceRecord) {
    this.bookingInstanceRecord = bookingInstanceRecord;
    return this;
  }

   /**
   * Get bookingInstanceRecord
   * @return bookingInstanceRecord
  **/
  @Schema(description = "")
  public BQBookingRetrieveOutputModelBookingInstanceRecord1 getBookingInstanceRecord() {
    return bookingInstanceRecord;
  }

  public void setBookingInstanceRecord(BQBookingRetrieveOutputModelBookingInstanceRecord1 bookingInstanceRecord) {
    this.bookingInstanceRecord = bookingInstanceRecord;
  }

  public InlineResponse20027 bookingRetrieveActionTaskReference(String bookingRetrieveActionTaskReference) {
    this.bookingRetrieveActionTaskReference = bookingRetrieveActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Booking instance retrieve service call 
   * @return bookingRetrieveActionTaskReference
  **/
  @Schema(example = "BRATR723427", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Booking instance retrieve service call ")
  public String getBookingRetrieveActionTaskReference() {
    return bookingRetrieveActionTaskReference;
  }

  public void setBookingRetrieveActionTaskReference(String bookingRetrieveActionTaskReference) {
    this.bookingRetrieveActionTaskReference = bookingRetrieveActionTaskReference;
  }

  public InlineResponse20027 bookingRetrieveActionTaskRecord(Object bookingRetrieveActionTaskRecord) {
    this.bookingRetrieveActionTaskRecord = bookingRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return bookingRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getBookingRetrieveActionTaskRecord() {
    return bookingRetrieveActionTaskRecord;
  }

  public void setBookingRetrieveActionTaskRecord(Object bookingRetrieveActionTaskRecord) {
    this.bookingRetrieveActionTaskRecord = bookingRetrieveActionTaskRecord;
  }

  public InlineResponse20027 bookingRetrieveActionResponse(String bookingRetrieveActionResponse) {
    this.bookingRetrieveActionResponse = bookingRetrieveActionResponse;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return bookingRetrieveActionResponse
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")
  public String getBookingRetrieveActionResponse() {
    return bookingRetrieveActionResponse;
  }

  public void setBookingRetrieveActionResponse(String bookingRetrieveActionResponse) {
    this.bookingRetrieveActionResponse = bookingRetrieveActionResponse;
  }

  public InlineResponse20027 bookingInstanceReport(BQBookingRetrieveOutputModelBookingInstanceReport1 bookingInstanceReport) {
    this.bookingInstanceReport = bookingInstanceReport;
    return this;
  }

   /**
   * Get bookingInstanceReport
   * @return bookingInstanceReport
  **/
  @Schema(description = "")
  public BQBookingRetrieveOutputModelBookingInstanceReport1 getBookingInstanceReport() {
    return bookingInstanceReport;
  }

  public void setBookingInstanceReport(BQBookingRetrieveOutputModelBookingInstanceReport1 bookingInstanceReport) {
    this.bookingInstanceReport = bookingInstanceReport;
  }

  public InlineResponse20027 bookingInstanceAnalysis(BQBookingRetrieveOutputModelBookingInstanceAnalysis1 bookingInstanceAnalysis) {
    this.bookingInstanceAnalysis = bookingInstanceAnalysis;
    return this;
  }

   /**
   * Get bookingInstanceAnalysis
   * @return bookingInstanceAnalysis
  **/
  @Schema(description = "")
  public BQBookingRetrieveOutputModelBookingInstanceAnalysis1 getBookingInstanceAnalysis() {
    return bookingInstanceAnalysis;
  }

  public void setBookingInstanceAnalysis(BQBookingRetrieveOutputModelBookingInstanceAnalysis1 bookingInstanceAnalysis) {
    this.bookingInstanceAnalysis = bookingInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20027 inlineResponse20027 = (InlineResponse20027) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, inlineResponse20027.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.bookingInstanceRecord, inlineResponse20027.bookingInstanceRecord) &&
        Objects.equals(this.bookingRetrieveActionTaskReference, inlineResponse20027.bookingRetrieveActionTaskReference) &&
        Objects.equals(this.bookingRetrieveActionTaskRecord, inlineResponse20027.bookingRetrieveActionTaskRecord) &&
        Objects.equals(this.bookingRetrieveActionResponse, inlineResponse20027.bookingRetrieveActionResponse) &&
        Objects.equals(this.bookingInstanceReport, inlineResponse20027.bookingInstanceReport) &&
        Objects.equals(this.bookingInstanceAnalysis, inlineResponse20027.bookingInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, bookingInstanceRecord, bookingRetrieveActionTaskReference, bookingRetrieveActionTaskRecord, bookingRetrieveActionResponse, bookingInstanceReport, bookingInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20027 {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    bookingInstanceRecord: ").append(toIndentedString(bookingInstanceRecord)).append("\n");
    sb.append("    bookingRetrieveActionTaskReference: ").append(toIndentedString(bookingRetrieveActionTaskReference)).append("\n");
    sb.append("    bookingRetrieveActionTaskRecord: ").append(toIndentedString(bookingRetrieveActionTaskRecord)).append("\n");
    sb.append("    bookingRetrieveActionResponse: ").append(toIndentedString(bookingRetrieveActionResponse)).append("\n");
    sb.append("    bookingInstanceReport: ").append(toIndentedString(bookingInstanceReport)).append("\n");
    sb.append("    bookingInstanceAnalysis: ").append(toIndentedString(bookingInstanceAnalysis)).append("\n");
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
