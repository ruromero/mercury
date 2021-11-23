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
import com.redhat.mercury.customeroffer.model.BQAuditRetrieveOutputModelAuditInstanceAnalysis1;
import com.redhat.mercury.customeroffer.model.BQAuditRetrieveOutputModelAuditInstanceReport1;
import com.redhat.mercury.customeroffer.model.BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord1;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateAuditInstanceRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse20022
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class InlineResponse20022 {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord = null;

  @SerializedName("auditInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateAuditInstanceRecord auditInstanceRecord = null;

  @SerializedName("auditRetrieveActionTaskReference")
  private String auditRetrieveActionTaskReference = null;

  @SerializedName("auditRetrieveActionTaskRecord")
  private Object auditRetrieveActionTaskRecord = null;

  @SerializedName("auditRetrieveActionResponse")
  private String auditRetrieveActionResponse = null;

  @SerializedName("auditInstanceReport")
  private BQAuditRetrieveOutputModelAuditInstanceReport1 auditInstanceReport = null;

  @SerializedName("auditInstanceAnalysis")
  private BQAuditRetrieveOutputModelAuditInstanceAnalysis1 auditInstanceAnalysis = null;

  public InlineResponse20022 customerOfferProcedureInstanceRecord(BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public InlineResponse20022 auditInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateAuditInstanceRecord auditInstanceRecord) {
    this.auditInstanceRecord = auditInstanceRecord;
    return this;
  }

   /**
   * Get auditInstanceRecord
   * @return auditInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateAuditInstanceRecord getAuditInstanceRecord() {
    return auditInstanceRecord;
  }

  public void setAuditInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateAuditInstanceRecord auditInstanceRecord) {
    this.auditInstanceRecord = auditInstanceRecord;
  }

  public InlineResponse20022 auditRetrieveActionTaskReference(String auditRetrieveActionTaskReference) {
    this.auditRetrieveActionTaskReference = auditRetrieveActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Audit instance retrieve service call 
   * @return auditRetrieveActionTaskReference
  **/
  @Schema(example = "ARATR750423", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Audit instance retrieve service call ")
  public String getAuditRetrieveActionTaskReference() {
    return auditRetrieveActionTaskReference;
  }

  public void setAuditRetrieveActionTaskReference(String auditRetrieveActionTaskReference) {
    this.auditRetrieveActionTaskReference = auditRetrieveActionTaskReference;
  }

  public InlineResponse20022 auditRetrieveActionTaskRecord(Object auditRetrieveActionTaskRecord) {
    this.auditRetrieveActionTaskRecord = auditRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return auditRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getAuditRetrieveActionTaskRecord() {
    return auditRetrieveActionTaskRecord;
  }

  public void setAuditRetrieveActionTaskRecord(Object auditRetrieveActionTaskRecord) {
    this.auditRetrieveActionTaskRecord = auditRetrieveActionTaskRecord;
  }

  public InlineResponse20022 auditRetrieveActionResponse(String auditRetrieveActionResponse) {
    this.auditRetrieveActionResponse = auditRetrieveActionResponse;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return auditRetrieveActionResponse
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")
  public String getAuditRetrieveActionResponse() {
    return auditRetrieveActionResponse;
  }

  public void setAuditRetrieveActionResponse(String auditRetrieveActionResponse) {
    this.auditRetrieveActionResponse = auditRetrieveActionResponse;
  }

  public InlineResponse20022 auditInstanceReport(BQAuditRetrieveOutputModelAuditInstanceReport1 auditInstanceReport) {
    this.auditInstanceReport = auditInstanceReport;
    return this;
  }

   /**
   * Get auditInstanceReport
   * @return auditInstanceReport
  **/
  @Schema(description = "")
  public BQAuditRetrieveOutputModelAuditInstanceReport1 getAuditInstanceReport() {
    return auditInstanceReport;
  }

  public void setAuditInstanceReport(BQAuditRetrieveOutputModelAuditInstanceReport1 auditInstanceReport) {
    this.auditInstanceReport = auditInstanceReport;
  }

  public InlineResponse20022 auditInstanceAnalysis(BQAuditRetrieveOutputModelAuditInstanceAnalysis1 auditInstanceAnalysis) {
    this.auditInstanceAnalysis = auditInstanceAnalysis;
    return this;
  }

   /**
   * Get auditInstanceAnalysis
   * @return auditInstanceAnalysis
  **/
  @Schema(description = "")
  public BQAuditRetrieveOutputModelAuditInstanceAnalysis1 getAuditInstanceAnalysis() {
    return auditInstanceAnalysis;
  }

  public void setAuditInstanceAnalysis(BQAuditRetrieveOutputModelAuditInstanceAnalysis1 auditInstanceAnalysis) {
    this.auditInstanceAnalysis = auditInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20022 inlineResponse20022 = (InlineResponse20022) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, inlineResponse20022.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.auditInstanceRecord, inlineResponse20022.auditInstanceRecord) &&
        Objects.equals(this.auditRetrieveActionTaskReference, inlineResponse20022.auditRetrieveActionTaskReference) &&
        Objects.equals(this.auditRetrieveActionTaskRecord, inlineResponse20022.auditRetrieveActionTaskRecord) &&
        Objects.equals(this.auditRetrieveActionResponse, inlineResponse20022.auditRetrieveActionResponse) &&
        Objects.equals(this.auditInstanceReport, inlineResponse20022.auditInstanceReport) &&
        Objects.equals(this.auditInstanceAnalysis, inlineResponse20022.auditInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, auditInstanceRecord, auditRetrieveActionTaskReference, auditRetrieveActionTaskRecord, auditRetrieveActionResponse, auditInstanceReport, auditInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20022 {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    auditInstanceRecord: ").append(toIndentedString(auditInstanceRecord)).append("\n");
    sb.append("    auditRetrieveActionTaskReference: ").append(toIndentedString(auditRetrieveActionTaskReference)).append("\n");
    sb.append("    auditRetrieveActionTaskRecord: ").append(toIndentedString(auditRetrieveActionTaskRecord)).append("\n");
    sb.append("    auditRetrieveActionResponse: ").append(toIndentedString(auditRetrieveActionResponse)).append("\n");
    sb.append("    auditInstanceReport: ").append(toIndentedString(auditInstanceReport)).append("\n");
    sb.append("    auditInstanceAnalysis: ").append(toIndentedString(auditInstanceAnalysis)).append("\n");
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
