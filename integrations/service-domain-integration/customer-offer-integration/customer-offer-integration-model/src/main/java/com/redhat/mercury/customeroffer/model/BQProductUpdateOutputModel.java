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
 * BQProductUpdateOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQProductUpdateOutputModel {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  @SerializedName("productInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateProductInstanceRecord productInstanceRecord = null;

  @SerializedName("productUpdateActionTaskReference")
  private String productUpdateActionTaskReference = null;

  @SerializedName("productUpdateActionTaskRecord")
  private Object productUpdateActionTaskRecord = null;

  @SerializedName("updateResponseRecord")
  private Object updateResponseRecord = null;

  public BQProductUpdateOutputModel customerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
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

  public BQProductUpdateOutputModel productInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductbqreferenceidupdateProductInstanceRecord productInstanceRecord) {
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

  public BQProductUpdateOutputModel productUpdateActionTaskReference(String productUpdateActionTaskReference) {
    this.productUpdateActionTaskReference = productUpdateActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productUpdateActionTaskReference
  **/
  @Schema(example = "COPUATR740346", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")
  public String getProductUpdateActionTaskReference() {
    return productUpdateActionTaskReference;
  }

  public void setProductUpdateActionTaskReference(String productUpdateActionTaskReference) {
    this.productUpdateActionTaskReference = productUpdateActionTaskReference;
  }

  public BQProductUpdateOutputModel productUpdateActionTaskRecord(Object productUpdateActionTaskRecord) {
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

  public BQProductUpdateOutputModel updateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response ")
  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQProductUpdateOutputModel bqProductUpdateOutputModel = (BQProductUpdateOutputModel) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, bqProductUpdateOutputModel.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.productInstanceRecord, bqProductUpdateOutputModel.productInstanceRecord) &&
        Objects.equals(this.productUpdateActionTaskReference, bqProductUpdateOutputModel.productUpdateActionTaskReference) &&
        Objects.equals(this.productUpdateActionTaskRecord, bqProductUpdateOutputModel.productUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, bqProductUpdateOutputModel.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, productInstanceRecord, productUpdateActionTaskReference, productUpdateActionTaskRecord, updateResponseRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQProductUpdateOutputModel {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    productInstanceRecord: ").append(toIndentedString(productInstanceRecord)).append("\n");
    sb.append("    productUpdateActionTaskReference: ").append(toIndentedString(productUpdateActionTaskReference)).append("\n");
    sb.append("    productUpdateActionTaskRecord: ").append(toIndentedString(productUpdateActionTaskRecord)).append("\n");
    sb.append("    updateResponseRecord: ").append(toIndentedString(updateResponseRecord)).append("\n");
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
