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
import com.redhat.mercury.customeroffer.model.BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceAnalysis1;
import com.redhat.mercury.customeroffer.model.BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord1;
import com.redhat.mercury.customeroffer.model.BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceReport1;
import com.redhat.mercury.customeroffer.model.BQCorrespondenceandDocumentsRetrieveOutputModelCustomerOfferProcedureInstanceRecord1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQCorrespondenceandDocumentsRetrieveOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQCorrespondenceandDocumentsRetrieveOutputModel {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private BQCorrespondenceandDocumentsRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord = null;

  @SerializedName("correspondenceandDocumentsInstanceRecord")
  private BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord1 correspondenceandDocumentsInstanceRecord = null;

  @SerializedName("correspondenceandDocumentsRetrieveActionTaskReference")
  private String correspondenceandDocumentsRetrieveActionTaskReference = null;

  @SerializedName("correspondenceandDocumentsRetrieveActionTaskRecord")
  private Object correspondenceandDocumentsRetrieveActionTaskRecord = null;

  @SerializedName("correspondenceandDocumentsRetrieveActionResponse")
  private String correspondenceandDocumentsRetrieveActionResponse = null;

  @SerializedName("correspondenceandDocumentsInstanceReport")
  private BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceReport1 correspondenceandDocumentsInstanceReport = null;

  @SerializedName("correspondenceandDocumentsInstanceAnalysis")
  private BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceAnalysis1 correspondenceandDocumentsInstanceAnalysis = null;

  public BQCorrespondenceandDocumentsRetrieveOutputModel customerOfferProcedureInstanceRecord(BQCorrespondenceandDocumentsRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public BQCorrespondenceandDocumentsRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQCorrespondenceandDocumentsRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public BQCorrespondenceandDocumentsRetrieveOutputModel correspondenceandDocumentsInstanceRecord(BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord1 correspondenceandDocumentsInstanceRecord) {
    this.correspondenceandDocumentsInstanceRecord = correspondenceandDocumentsInstanceRecord;
    return this;
  }

   /**
   * Get correspondenceandDocumentsInstanceRecord
   * @return correspondenceandDocumentsInstanceRecord
  **/
  @Schema(description = "")
  public BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord1 getCorrespondenceandDocumentsInstanceRecord() {
    return correspondenceandDocumentsInstanceRecord;
  }

  public void setCorrespondenceandDocumentsInstanceRecord(BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord1 correspondenceandDocumentsInstanceRecord) {
    this.correspondenceandDocumentsInstanceRecord = correspondenceandDocumentsInstanceRecord;
  }

  public BQCorrespondenceandDocumentsRetrieveOutputModel correspondenceandDocumentsRetrieveActionTaskReference(String correspondenceandDocumentsRetrieveActionTaskReference) {
    this.correspondenceandDocumentsRetrieveActionTaskReference = correspondenceandDocumentsRetrieveActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondence and Documents instance retrieve service call 
   * @return correspondenceandDocumentsRetrieveActionTaskReference
  **/
  @Schema(example = "CADRATR745080", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondence and Documents instance retrieve service call ")
  public String getCorrespondenceandDocumentsRetrieveActionTaskReference() {
    return correspondenceandDocumentsRetrieveActionTaskReference;
  }

  public void setCorrespondenceandDocumentsRetrieveActionTaskReference(String correspondenceandDocumentsRetrieveActionTaskReference) {
    this.correspondenceandDocumentsRetrieveActionTaskReference = correspondenceandDocumentsRetrieveActionTaskReference;
  }

  public BQCorrespondenceandDocumentsRetrieveOutputModel correspondenceandDocumentsRetrieveActionTaskRecord(Object correspondenceandDocumentsRetrieveActionTaskRecord) {
    this.correspondenceandDocumentsRetrieveActionTaskRecord = correspondenceandDocumentsRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return correspondenceandDocumentsRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getCorrespondenceandDocumentsRetrieveActionTaskRecord() {
    return correspondenceandDocumentsRetrieveActionTaskRecord;
  }

  public void setCorrespondenceandDocumentsRetrieveActionTaskRecord(Object correspondenceandDocumentsRetrieveActionTaskRecord) {
    this.correspondenceandDocumentsRetrieveActionTaskRecord = correspondenceandDocumentsRetrieveActionTaskRecord;
  }

  public BQCorrespondenceandDocumentsRetrieveOutputModel correspondenceandDocumentsRetrieveActionResponse(String correspondenceandDocumentsRetrieveActionResponse) {
    this.correspondenceandDocumentsRetrieveActionResponse = correspondenceandDocumentsRetrieveActionResponse;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return correspondenceandDocumentsRetrieveActionResponse
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")
  public String getCorrespondenceandDocumentsRetrieveActionResponse() {
    return correspondenceandDocumentsRetrieveActionResponse;
  }

  public void setCorrespondenceandDocumentsRetrieveActionResponse(String correspondenceandDocumentsRetrieveActionResponse) {
    this.correspondenceandDocumentsRetrieveActionResponse = correspondenceandDocumentsRetrieveActionResponse;
  }

  public BQCorrespondenceandDocumentsRetrieveOutputModel correspondenceandDocumentsInstanceReport(BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceReport1 correspondenceandDocumentsInstanceReport) {
    this.correspondenceandDocumentsInstanceReport = correspondenceandDocumentsInstanceReport;
    return this;
  }

   /**
   * Get correspondenceandDocumentsInstanceReport
   * @return correspondenceandDocumentsInstanceReport
  **/
  @Schema(description = "")
  public BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceReport1 getCorrespondenceandDocumentsInstanceReport() {
    return correspondenceandDocumentsInstanceReport;
  }

  public void setCorrespondenceandDocumentsInstanceReport(BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceReport1 correspondenceandDocumentsInstanceReport) {
    this.correspondenceandDocumentsInstanceReport = correspondenceandDocumentsInstanceReport;
  }

  public BQCorrespondenceandDocumentsRetrieveOutputModel correspondenceandDocumentsInstanceAnalysis(BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceAnalysis1 correspondenceandDocumentsInstanceAnalysis) {
    this.correspondenceandDocumentsInstanceAnalysis = correspondenceandDocumentsInstanceAnalysis;
    return this;
  }

   /**
   * Get correspondenceandDocumentsInstanceAnalysis
   * @return correspondenceandDocumentsInstanceAnalysis
  **/
  @Schema(description = "")
  public BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceAnalysis1 getCorrespondenceandDocumentsInstanceAnalysis() {
    return correspondenceandDocumentsInstanceAnalysis;
  }

  public void setCorrespondenceandDocumentsInstanceAnalysis(BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceAnalysis1 correspondenceandDocumentsInstanceAnalysis) {
    this.correspondenceandDocumentsInstanceAnalysis = correspondenceandDocumentsInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCorrespondenceandDocumentsRetrieveOutputModel bqCorrespondenceandDocumentsRetrieveOutputModel = (BQCorrespondenceandDocumentsRetrieveOutputModel) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, bqCorrespondenceandDocumentsRetrieveOutputModel.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.correspondenceandDocumentsInstanceRecord, bqCorrespondenceandDocumentsRetrieveOutputModel.correspondenceandDocumentsInstanceRecord) &&
        Objects.equals(this.correspondenceandDocumentsRetrieveActionTaskReference, bqCorrespondenceandDocumentsRetrieveOutputModel.correspondenceandDocumentsRetrieveActionTaskReference) &&
        Objects.equals(this.correspondenceandDocumentsRetrieveActionTaskRecord, bqCorrespondenceandDocumentsRetrieveOutputModel.correspondenceandDocumentsRetrieveActionTaskRecord) &&
        Objects.equals(this.correspondenceandDocumentsRetrieveActionResponse, bqCorrespondenceandDocumentsRetrieveOutputModel.correspondenceandDocumentsRetrieveActionResponse) &&
        Objects.equals(this.correspondenceandDocumentsInstanceReport, bqCorrespondenceandDocumentsRetrieveOutputModel.correspondenceandDocumentsInstanceReport) &&
        Objects.equals(this.correspondenceandDocumentsInstanceAnalysis, bqCorrespondenceandDocumentsRetrieveOutputModel.correspondenceandDocumentsInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, correspondenceandDocumentsInstanceRecord, correspondenceandDocumentsRetrieveActionTaskReference, correspondenceandDocumentsRetrieveActionTaskRecord, correspondenceandDocumentsRetrieveActionResponse, correspondenceandDocumentsInstanceReport, correspondenceandDocumentsInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCorrespondenceandDocumentsRetrieveOutputModel {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    correspondenceandDocumentsInstanceRecord: ").append(toIndentedString(correspondenceandDocumentsInstanceRecord)).append("\n");
    sb.append("    correspondenceandDocumentsRetrieveActionTaskReference: ").append(toIndentedString(correspondenceandDocumentsRetrieveActionTaskReference)).append("\n");
    sb.append("    correspondenceandDocumentsRetrieveActionTaskRecord: ").append(toIndentedString(correspondenceandDocumentsRetrieveActionTaskRecord)).append("\n");
    sb.append("    correspondenceandDocumentsRetrieveActionResponse: ").append(toIndentedString(correspondenceandDocumentsRetrieveActionResponse)).append("\n");
    sb.append("    correspondenceandDocumentsInstanceReport: ").append(toIndentedString(correspondenceandDocumentsInstanceReport)).append("\n");
    sb.append("    correspondenceandDocumentsInstanceAnalysis: ").append(toIndentedString(correspondenceandDocumentsInstanceAnalysis)).append("\n");
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
