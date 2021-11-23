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
 * CustomeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class CustomeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord {
  @SerializedName("customerAgreementInstanceReference")
  private String customerAgreementInstanceReference = null;

  public CustomeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord customerAgreementInstanceReference(String customerAgreementInstanceReference) {
    this.customerAgreementInstanceReference = customerAgreementInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FYsVBcTGEeChad0JzLk7QA_-1076024413  bian-reference: CustomerAgreement  general-info: Reference to the associated master agreement that is accessed during the offer procedure 
   * @return customerAgreementInstanceReference
  **/
  @Schema(example = "755683", description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FYsVBcTGEeChad0JzLk7QA_-1076024413  bian-reference: CustomerAgreement  general-info: Reference to the associated master agreement that is accessed during the offer procedure ")
  public String getCustomerAgreementInstanceReference() {
    return customerAgreementInstanceReference;
  }

  public void setCustomerAgreementInstanceReference(String customerAgreementInstanceReference) {
    this.customerAgreementInstanceReference = customerAgreementInstanceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord customeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord = (CustomeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord) o;
    return Objects.equals(this.customerAgreementInstanceReference, customeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord.customerAgreementInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAgreementInstanceReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomeroffersdreferenceidcustomerofferprocedureinitiationAgreementInstanceRecord {\n");
    
    sb.append("    customerAgreementInstanceReference: ").append(toIndentedString(customerAgreementInstanceReference)).append("\n");
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
