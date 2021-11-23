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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateCustomerOfferProcedureInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateProductInstanceRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQProductUpdateInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQProductUpdateInputModel {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  @SerializedName("customerOfferProcedureInstanceReference")
  private String customerOfferProcedureInstanceReference = null;

  @SerializedName("productInstanceReference")
  private String productInstanceReference = null;

  @SerializedName("productInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateProductInstanceRecord productInstanceRecord = null;

  @SerializedName("productUpdateActionTaskRecord")
  private Object productUpdateActionTaskRecord = null;

  @SerializedName("productUpdateActionRequest")
  private String productUpdateActionRequest = null;

  public BQProductUpdateInputModel customerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public BQProductUpdateInputModel customerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance 
   * @return customerOfferProcedureInstanceReference
  **/
  @Schema(example = "COPIR772148", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance ")
  public String getCustomerOfferProcedureInstanceReference() {
    return customerOfferProcedureInstanceReference;
  }

  public void setCustomerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
  }

  public BQProductUpdateInputModel productInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product instance 
   * @return productInstanceReference
  **/
  @Schema(example = "COPIR772148", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product instance ")
  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public BQProductUpdateInputModel productInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateProductInstanceRecord productInstanceRecord) {
    this.productInstanceRecord = productInstanceRecord;
    return this;
  }

   /**
   * Get productInstanceRecord
   * @return productInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateProductInstanceRecord getProductInstanceRecord() {
    return productInstanceRecord;
  }

  public void setProductInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateProductInstanceRecord productInstanceRecord) {
    this.productInstanceRecord = productInstanceRecord;
  }

  public BQProductUpdateInputModel productUpdateActionTaskRecord(Object productUpdateActionTaskRecord) {
    this.productUpdateActionTaskRecord = productUpdateActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productUpdateActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  public Object getProductUpdateActionTaskRecord() {
    return productUpdateActionTaskRecord;
  }

  public void setProductUpdateActionTaskRecord(Object productUpdateActionTaskRecord) {
    this.productUpdateActionTaskRecord = productUpdateActionTaskRecord;
  }

  public BQProductUpdateInputModel productUpdateActionRequest(String productUpdateActionRequest) {
    this.productUpdateActionRequest = productUpdateActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return productUpdateActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")
  public String getProductUpdateActionRequest() {
    return productUpdateActionRequest;
  }

  public void setProductUpdateActionRequest(String productUpdateActionRequest) {
    this.productUpdateActionRequest = productUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQProductUpdateInputModel bqProductUpdateInputModel = (BQProductUpdateInputModel) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, bqProductUpdateInputModel.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.customerOfferProcedureInstanceReference, bqProductUpdateInputModel.customerOfferProcedureInstanceReference) &&
        Objects.equals(this.productInstanceReference, bqProductUpdateInputModel.productInstanceReference) &&
        Objects.equals(this.productInstanceRecord, bqProductUpdateInputModel.productInstanceRecord) &&
        Objects.equals(this.productUpdateActionTaskRecord, bqProductUpdateInputModel.productUpdateActionTaskRecord) &&
        Objects.equals(this.productUpdateActionRequest, bqProductUpdateInputModel.productUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, customerOfferProcedureInstanceReference, productInstanceReference, productInstanceRecord, productUpdateActionTaskRecord, productUpdateActionRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQProductUpdateInputModel {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    customerOfferProcedureInstanceReference: ").append(toIndentedString(customerOfferProcedureInstanceReference)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    productInstanceRecord: ").append(toIndentedString(productInstanceRecord)).append("\n");
    sb.append("    productUpdateActionTaskRecord: ").append(toIndentedString(productUpdateActionTaskRecord)).append("\n");
    sb.append("    productUpdateActionRequest: ").append(toIndentedString(productUpdateActionRequest)).append("\n");
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
