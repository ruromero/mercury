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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedureinitiationAuditInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedureinitiationBookingInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedureinitiationComplianceInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedureinitiationCorrespondenceandDocumentsInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedureinitiationCustomerOfferProcedureInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedureinitiationProductInitializationInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedureinitiationProductInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedureinitiationUnderwritingInstanceRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CRCustomerOfferProcedureInitiateInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class CRCustomerOfferProcedureInitiateInputModel {
  @SerializedName("customerOfferServicingSessionReference")
  private String customerOfferServicingSessionReference = null;

  @SerializedName("customerOfferProcedureInitiateActionRecord")
  private Object customerOfferProcedureInitiateActionRecord = null;

  @SerializedName("customerOfferProcedureInstanceStatus")
  private String customerOfferProcedureInstanceStatus = null;

  @SerializedName("customerOfferProcedureInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedureinitiationCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  @SerializedName("productInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedureinitiationProductInstanceRecord productInstanceRecord = null;

  @SerializedName("creditInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord creditInstanceRecord = null;

  @SerializedName("underwritingInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedureinitiationUnderwritingInstanceRecord underwritingInstanceRecord = null;

  @SerializedName("complianceInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedureinitiationComplianceInstanceRecord complianceInstanceRecord = null;

  @SerializedName("auditInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedureinitiationAuditInstanceRecord auditInstanceRecord = null;

  @SerializedName("bookingInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedureinitiationBookingInstanceRecord bookingInstanceRecord = null;

  @SerializedName("correspondenceandDocumentsInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedureinitiationCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord = null;

  @SerializedName("agreementInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord agreementInstanceRecord = null;

  @SerializedName("productInitializationInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedureinitiationProductInitializationInstanceRecord productInitializationInstanceRecord = null;

  public CRCustomerOfferProcedureInitiateInputModel customerOfferServicingSessionReference(String customerOfferServicingSessionReference) {
    this.customerOfferServicingSessionReference = customerOfferServicingSessionReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerOfferServicingSessionReference
  **/
  @Schema(example = "COSSR738028", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")
  public String getCustomerOfferServicingSessionReference() {
    return customerOfferServicingSessionReference;
  }

  public void setCustomerOfferServicingSessionReference(String customerOfferServicingSessionReference) {
    this.customerOfferServicingSessionReference = customerOfferServicingSessionReference;
  }

  public CRCustomerOfferProcedureInitiateInputModel customerOfferProcedureInitiateActionRecord(Object customerOfferProcedureInitiateActionRecord) {
    this.customerOfferProcedureInitiateActionRecord = customerOfferProcedureInitiateActionRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerOfferProcedureInitiateActionRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")
  public Object getCustomerOfferProcedureInitiateActionRecord() {
    return customerOfferProcedureInitiateActionRecord;
  }

  public void setCustomerOfferProcedureInitiateActionRecord(Object customerOfferProcedureInitiateActionRecord) {
    this.customerOfferProcedureInitiateActionRecord = customerOfferProcedureInitiateActionRecord;
  }

  public CRCustomerOfferProcedureInitiateInputModel customerOfferProcedureInstanceStatus(String customerOfferProcedureInstanceStatus) {
    this.customerOfferProcedureInstanceStatus = customerOfferProcedureInstanceStatus;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Offer Procedure instance (e.g. initialised, pending, active) 
   * @return customerOfferProcedureInstanceStatus
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Offer Procedure instance (e.g. initialised, pending, active) ")
  public String getCustomerOfferProcedureInstanceStatus() {
    return customerOfferProcedureInstanceStatus;
  }

  public void setCustomerOfferProcedureInstanceStatus(String customerOfferProcedureInstanceStatus) {
    this.customerOfferProcedureInstanceStatus = customerOfferProcedureInstanceStatus;
  }

  public CRCustomerOfferProcedureInitiateInputModel customerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedureinitiationCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public CRCustomerOfferProcedureInitiateInputModel productInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationProductInstanceRecord productInstanceRecord) {
    this.productInstanceRecord = productInstanceRecord;
    return this;
  }

   /**
   * Get productInstanceRecord
   * @return productInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedureinitiationProductInstanceRecord getProductInstanceRecord() {
    return productInstanceRecord;
  }

  public void setProductInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationProductInstanceRecord productInstanceRecord) {
    this.productInstanceRecord = productInstanceRecord;
  }

  public CRCustomerOfferProcedureInitiateInputModel creditInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord creditInstanceRecord) {
    this.creditInstanceRecord = creditInstanceRecord;
    return this;
  }

   /**
   * Get creditInstanceRecord
   * @return creditInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord getCreditInstanceRecord() {
    return creditInstanceRecord;
  }

  public void setCreditInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord creditInstanceRecord) {
    this.creditInstanceRecord = creditInstanceRecord;
  }

  public CRCustomerOfferProcedureInitiateInputModel underwritingInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationUnderwritingInstanceRecord underwritingInstanceRecord) {
    this.underwritingInstanceRecord = underwritingInstanceRecord;
    return this;
  }

   /**
   * Get underwritingInstanceRecord
   * @return underwritingInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedureinitiationUnderwritingInstanceRecord getUnderwritingInstanceRecord() {
    return underwritingInstanceRecord;
  }

  public void setUnderwritingInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationUnderwritingInstanceRecord underwritingInstanceRecord) {
    this.underwritingInstanceRecord = underwritingInstanceRecord;
  }

  public CRCustomerOfferProcedureInitiateInputModel complianceInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationComplianceInstanceRecord complianceInstanceRecord) {
    this.complianceInstanceRecord = complianceInstanceRecord;
    return this;
  }

   /**
   * Get complianceInstanceRecord
   * @return complianceInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedureinitiationComplianceInstanceRecord getComplianceInstanceRecord() {
    return complianceInstanceRecord;
  }

  public void setComplianceInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationComplianceInstanceRecord complianceInstanceRecord) {
    this.complianceInstanceRecord = complianceInstanceRecord;
  }

  public CRCustomerOfferProcedureInitiateInputModel auditInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationAuditInstanceRecord auditInstanceRecord) {
    this.auditInstanceRecord = auditInstanceRecord;
    return this;
  }

   /**
   * Get auditInstanceRecord
   * @return auditInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedureinitiationAuditInstanceRecord getAuditInstanceRecord() {
    return auditInstanceRecord;
  }

  public void setAuditInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationAuditInstanceRecord auditInstanceRecord) {
    this.auditInstanceRecord = auditInstanceRecord;
  }

  public CRCustomerOfferProcedureInitiateInputModel bookingInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationBookingInstanceRecord bookingInstanceRecord) {
    this.bookingInstanceRecord = bookingInstanceRecord;
    return this;
  }

   /**
   * Get bookingInstanceRecord
   * @return bookingInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedureinitiationBookingInstanceRecord getBookingInstanceRecord() {
    return bookingInstanceRecord;
  }

  public void setBookingInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationBookingInstanceRecord bookingInstanceRecord) {
    this.bookingInstanceRecord = bookingInstanceRecord;
  }

  public CRCustomerOfferProcedureInitiateInputModel correspondenceandDocumentsInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord) {
    this.correspondenceandDocumentsInstanceRecord = correspondenceandDocumentsInstanceRecord;
    return this;
  }

   /**
   * Get correspondenceandDocumentsInstanceRecord
   * @return correspondenceandDocumentsInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedureinitiationCorrespondenceandDocumentsInstanceRecord getCorrespondenceandDocumentsInstanceRecord() {
    return correspondenceandDocumentsInstanceRecord;
  }

  public void setCorrespondenceandDocumentsInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord) {
    this.correspondenceandDocumentsInstanceRecord = correspondenceandDocumentsInstanceRecord;
  }

  public CRCustomerOfferProcedureInitiateInputModel agreementInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord agreementInstanceRecord) {
    this.agreementInstanceRecord = agreementInstanceRecord;
    return this;
  }

   /**
   * Get agreementInstanceRecord
   * @return agreementInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord getAgreementInstanceRecord() {
    return agreementInstanceRecord;
  }

  public void setAgreementInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord agreementInstanceRecord) {
    this.agreementInstanceRecord = agreementInstanceRecord;
  }

  public CRCustomerOfferProcedureInitiateInputModel productInitializationInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationProductInitializationInstanceRecord productInitializationInstanceRecord) {
    this.productInitializationInstanceRecord = productInitializationInstanceRecord;
    return this;
  }

   /**
   * Get productInitializationInstanceRecord
   * @return productInitializationInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedureinitiationProductInitializationInstanceRecord getProductInitializationInstanceRecord() {
    return productInitializationInstanceRecord;
  }

  public void setProductInitializationInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedureinitiationProductInitializationInstanceRecord productInitializationInstanceRecord) {
    this.productInitializationInstanceRecord = productInitializationInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerOfferProcedureInitiateInputModel crCustomerOfferProcedureInitiateInputModel = (CRCustomerOfferProcedureInitiateInputModel) o;
    return Objects.equals(this.customerOfferServicingSessionReference, crCustomerOfferProcedureInitiateInputModel.customerOfferServicingSessionReference) &&
        Objects.equals(this.customerOfferProcedureInitiateActionRecord, crCustomerOfferProcedureInitiateInputModel.customerOfferProcedureInitiateActionRecord) &&
        Objects.equals(this.customerOfferProcedureInstanceStatus, crCustomerOfferProcedureInitiateInputModel.customerOfferProcedureInstanceStatus) &&
        Objects.equals(this.customerOfferProcedureInstanceRecord, crCustomerOfferProcedureInitiateInputModel.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.productInstanceRecord, crCustomerOfferProcedureInitiateInputModel.productInstanceRecord) &&
        Objects.equals(this.creditInstanceRecord, crCustomerOfferProcedureInitiateInputModel.creditInstanceRecord) &&
        Objects.equals(this.underwritingInstanceRecord, crCustomerOfferProcedureInitiateInputModel.underwritingInstanceRecord) &&
        Objects.equals(this.complianceInstanceRecord, crCustomerOfferProcedureInitiateInputModel.complianceInstanceRecord) &&
        Objects.equals(this.auditInstanceRecord, crCustomerOfferProcedureInitiateInputModel.auditInstanceRecord) &&
        Objects.equals(this.bookingInstanceRecord, crCustomerOfferProcedureInitiateInputModel.bookingInstanceRecord) &&
        Objects.equals(this.correspondenceandDocumentsInstanceRecord, crCustomerOfferProcedureInitiateInputModel.correspondenceandDocumentsInstanceRecord) &&
        Objects.equals(this.agreementInstanceRecord, crCustomerOfferProcedureInitiateInputModel.agreementInstanceRecord) &&
        Objects.equals(this.productInitializationInstanceRecord, crCustomerOfferProcedureInitiateInputModel.productInitializationInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferServicingSessionReference, customerOfferProcedureInitiateActionRecord, customerOfferProcedureInstanceStatus, customerOfferProcedureInstanceRecord, productInstanceRecord, creditInstanceRecord, underwritingInstanceRecord, complianceInstanceRecord, auditInstanceRecord, bookingInstanceRecord, correspondenceandDocumentsInstanceRecord, agreementInstanceRecord, productInitializationInstanceRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerOfferProcedureInitiateInputModel {\n");
    
    sb.append("    customerOfferServicingSessionReference: ").append(toIndentedString(customerOfferServicingSessionReference)).append("\n");
    sb.append("    customerOfferProcedureInitiateActionRecord: ").append(toIndentedString(customerOfferProcedureInitiateActionRecord)).append("\n");
    sb.append("    customerOfferProcedureInstanceStatus: ").append(toIndentedString(customerOfferProcedureInstanceStatus)).append("\n");
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    productInstanceRecord: ").append(toIndentedString(productInstanceRecord)).append("\n");
    sb.append("    creditInstanceRecord: ").append(toIndentedString(creditInstanceRecord)).append("\n");
    sb.append("    underwritingInstanceRecord: ").append(toIndentedString(underwritingInstanceRecord)).append("\n");
    sb.append("    complianceInstanceRecord: ").append(toIndentedString(complianceInstanceRecord)).append("\n");
    sb.append("    auditInstanceRecord: ").append(toIndentedString(auditInstanceRecord)).append("\n");
    sb.append("    bookingInstanceRecord: ").append(toIndentedString(bookingInstanceRecord)).append("\n");
    sb.append("    correspondenceandDocumentsInstanceRecord: ").append(toIndentedString(correspondenceandDocumentsInstanceRecord)).append("\n");
    sb.append("    agreementInstanceRecord: ").append(toIndentedString(agreementInstanceRecord)).append("\n");
    sb.append("    productInitializationInstanceRecord: ").append(toIndentedString(productInitializationInstanceRecord)).append("\n");
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
