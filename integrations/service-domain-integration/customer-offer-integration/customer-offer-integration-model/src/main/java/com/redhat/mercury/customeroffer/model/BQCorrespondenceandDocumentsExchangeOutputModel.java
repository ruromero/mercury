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
 * BQCorrespondenceandDocumentsExchangeOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQCorrespondenceandDocumentsExchangeOutputModel {
  @SerializedName("correspondenceandDocumentsExchangeActionTaskReference")
  private String correspondenceandDocumentsExchangeActionTaskReference = null;

  @SerializedName("correspondenceandDocumentsExchangeActionTaskRecord")
  private Object correspondenceandDocumentsExchangeActionTaskRecord = null;

  @SerializedName("correspondenceandDocumentsExchangeActionResponse")
  private String correspondenceandDocumentsExchangeActionResponse = null;

  @SerializedName("correspondenceandDocumentsInstanceStatus")
  private String correspondenceandDocumentsInstanceStatus = null;

  public BQCorrespondenceandDocumentsExchangeOutputModel correspondenceandDocumentsExchangeActionTaskReference(String correspondenceandDocumentsExchangeActionTaskReference) {
    this.correspondenceandDocumentsExchangeActionTaskReference = correspondenceandDocumentsExchangeActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondence and Documents instance exchange service call 
   * @return correspondenceandDocumentsExchangeActionTaskReference
  **/
  @Schema(example = "CADEATR789579", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondence and Documents instance exchange service call ")
  public String getCorrespondenceandDocumentsExchangeActionTaskReference() {
    return correspondenceandDocumentsExchangeActionTaskReference;
  }

  public void setCorrespondenceandDocumentsExchangeActionTaskReference(String correspondenceandDocumentsExchangeActionTaskReference) {
    this.correspondenceandDocumentsExchangeActionTaskReference = correspondenceandDocumentsExchangeActionTaskReference;
  }

  public BQCorrespondenceandDocumentsExchangeOutputModel correspondenceandDocumentsExchangeActionTaskRecord(Object correspondenceandDocumentsExchangeActionTaskRecord) {
    this.correspondenceandDocumentsExchangeActionTaskRecord = correspondenceandDocumentsExchangeActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return correspondenceandDocumentsExchangeActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")
  public Object getCorrespondenceandDocumentsExchangeActionTaskRecord() {
    return correspondenceandDocumentsExchangeActionTaskRecord;
  }

  public void setCorrespondenceandDocumentsExchangeActionTaskRecord(Object correspondenceandDocumentsExchangeActionTaskRecord) {
    this.correspondenceandDocumentsExchangeActionTaskRecord = correspondenceandDocumentsExchangeActionTaskRecord;
  }

  public BQCorrespondenceandDocumentsExchangeOutputModel correspondenceandDocumentsExchangeActionResponse(String correspondenceandDocumentsExchangeActionResponse) {
    this.correspondenceandDocumentsExchangeActionResponse = correspondenceandDocumentsExchangeActionResponse;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return correspondenceandDocumentsExchangeActionResponse
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response ")
  public String getCorrespondenceandDocumentsExchangeActionResponse() {
    return correspondenceandDocumentsExchangeActionResponse;
  }

  public void setCorrespondenceandDocumentsExchangeActionResponse(String correspondenceandDocumentsExchangeActionResponse) {
    this.correspondenceandDocumentsExchangeActionResponse = correspondenceandDocumentsExchangeActionResponse;
  }

  public BQCorrespondenceandDocumentsExchangeOutputModel correspondenceandDocumentsInstanceStatus(String correspondenceandDocumentsInstanceStatus) {
    this.correspondenceandDocumentsInstanceStatus = correspondenceandDocumentsInstanceStatus;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Correspondence and Documents instance (e.g. accepted, rejected, verified) 
   * @return correspondenceandDocumentsInstanceStatus
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Correspondence and Documents instance (e.g. accepted, rejected, verified) ")
  public String getCorrespondenceandDocumentsInstanceStatus() {
    return correspondenceandDocumentsInstanceStatus;
  }

  public void setCorrespondenceandDocumentsInstanceStatus(String correspondenceandDocumentsInstanceStatus) {
    this.correspondenceandDocumentsInstanceStatus = correspondenceandDocumentsInstanceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCorrespondenceandDocumentsExchangeOutputModel bqCorrespondenceandDocumentsExchangeOutputModel = (BQCorrespondenceandDocumentsExchangeOutputModel) o;
    return Objects.equals(this.correspondenceandDocumentsExchangeActionTaskReference, bqCorrespondenceandDocumentsExchangeOutputModel.correspondenceandDocumentsExchangeActionTaskReference) &&
        Objects.equals(this.correspondenceandDocumentsExchangeActionTaskRecord, bqCorrespondenceandDocumentsExchangeOutputModel.correspondenceandDocumentsExchangeActionTaskRecord) &&
        Objects.equals(this.correspondenceandDocumentsExchangeActionResponse, bqCorrespondenceandDocumentsExchangeOutputModel.correspondenceandDocumentsExchangeActionResponse) &&
        Objects.equals(this.correspondenceandDocumentsInstanceStatus, bqCorrespondenceandDocumentsExchangeOutputModel.correspondenceandDocumentsInstanceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceandDocumentsExchangeActionTaskReference, correspondenceandDocumentsExchangeActionTaskRecord, correspondenceandDocumentsExchangeActionResponse, correspondenceandDocumentsInstanceStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCorrespondenceandDocumentsExchangeOutputModel {\n");
    
    sb.append("    correspondenceandDocumentsExchangeActionTaskReference: ").append(toIndentedString(correspondenceandDocumentsExchangeActionTaskReference)).append("\n");
    sb.append("    correspondenceandDocumentsExchangeActionTaskRecord: ").append(toIndentedString(correspondenceandDocumentsExchangeActionTaskRecord)).append("\n");
    sb.append("    correspondenceandDocumentsExchangeActionResponse: ").append(toIndentedString(correspondenceandDocumentsExchangeActionResponse)).append("\n");
    sb.append("    correspondenceandDocumentsInstanceStatus: ").append(toIndentedString(correspondenceandDocumentsInstanceStatus)).append("\n");
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
