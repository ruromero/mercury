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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateCustomerOfferProcedureInstanceRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Body19
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class Body19 {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  @SerializedName("customerOfferProcedureInstanceReference")
  private String customerOfferProcedureInstanceReference = null;

  @SerializedName("bookingInstanceReference")
  private String bookingInstanceReference = null;

  @SerializedName("bookingInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord bookingInstanceRecord = null;

  @SerializedName("bookingUpdateActionTaskRecord")
  private Object bookingUpdateActionTaskRecord = null;

  @SerializedName("bookingUpdateActionRequest")
  private String bookingUpdateActionRequest = null;

  public Body19 customerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public Body19 customerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance 
   * @return customerOfferProcedureInstanceReference
  **/
  @Schema(example = "COPIR751074", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance ")
  public String getCustomerOfferProcedureInstanceReference() {
    return customerOfferProcedureInstanceReference;
  }

  public void setCustomerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
  }

  public Body19 bookingInstanceReference(String bookingInstanceReference) {
    this.bookingInstanceReference = bookingInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Booking instance 
   * @return bookingInstanceReference
  **/
  @Schema(example = "BIR748644", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Booking instance ")
  public String getBookingInstanceReference() {
    return bookingInstanceReference;
  }

  public void setBookingInstanceReference(String bookingInstanceReference) {
    this.bookingInstanceReference = bookingInstanceReference;
  }

  public Body19 bookingInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord bookingInstanceRecord) {
    this.bookingInstanceRecord = bookingInstanceRecord;
    return this;
  }

   /**
   * Get bookingInstanceRecord
   * @return bookingInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord getBookingInstanceRecord() {
    return bookingInstanceRecord;
  }

  public void setBookingInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord bookingInstanceRecord) {
    this.bookingInstanceRecord = bookingInstanceRecord;
  }

  public Body19 bookingUpdateActionTaskRecord(Object bookingUpdateActionTaskRecord) {
    this.bookingUpdateActionTaskRecord = bookingUpdateActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return bookingUpdateActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  public Object getBookingUpdateActionTaskRecord() {
    return bookingUpdateActionTaskRecord;
  }

  public void setBookingUpdateActionTaskRecord(Object bookingUpdateActionTaskRecord) {
    this.bookingUpdateActionTaskRecord = bookingUpdateActionTaskRecord;
  }

  public Body19 bookingUpdateActionRequest(String bookingUpdateActionRequest) {
    this.bookingUpdateActionRequest = bookingUpdateActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return bookingUpdateActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")
  public String getBookingUpdateActionRequest() {
    return bookingUpdateActionRequest;
  }

  public void setBookingUpdateActionRequest(String bookingUpdateActionRequest) {
    this.bookingUpdateActionRequest = bookingUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body19 body19 = (Body19) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, body19.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.customerOfferProcedureInstanceReference, body19.customerOfferProcedureInstanceReference) &&
        Objects.equals(this.bookingInstanceReference, body19.bookingInstanceReference) &&
        Objects.equals(this.bookingInstanceRecord, body19.bookingInstanceRecord) &&
        Objects.equals(this.bookingUpdateActionTaskRecord, body19.bookingUpdateActionTaskRecord) &&
        Objects.equals(this.bookingUpdateActionRequest, body19.bookingUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, customerOfferProcedureInstanceReference, bookingInstanceReference, bookingInstanceRecord, bookingUpdateActionTaskRecord, bookingUpdateActionRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body19 {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    customerOfferProcedureInstanceReference: ").append(toIndentedString(customerOfferProcedureInstanceReference)).append("\n");
    sb.append("    bookingInstanceReference: ").append(toIndentedString(bookingInstanceReference)).append("\n");
    sb.append("    bookingInstanceRecord: ").append(toIndentedString(bookingInstanceRecord)).append("\n");
    sb.append("    bookingUpdateActionTaskRecord: ").append(toIndentedString(bookingUpdateActionTaskRecord)).append("\n");
    sb.append("    bookingUpdateActionRequest: ").append(toIndentedString(bookingUpdateActionRequest)).append("\n");
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
