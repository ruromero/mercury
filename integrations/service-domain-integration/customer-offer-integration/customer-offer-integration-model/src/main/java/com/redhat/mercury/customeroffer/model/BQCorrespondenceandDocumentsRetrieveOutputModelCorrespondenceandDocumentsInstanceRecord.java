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
 * BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord {
  @SerializedName("customerOfferRequiredDocuments")
  private String customerOfferRequiredDocuments = null;

  @SerializedName("correspondenceInstanceReference")
  private String correspondenceInstanceReference = null;

  @SerializedName("correspondenceContent")
  private String correspondenceContent = null;

  @SerializedName("documentDirectoryEntryInstanceReference")
  private String documentDirectoryEntryInstanceReference = null;

  @SerializedName("documentContent")
  private String documentContent = null;

  public BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord customerOfferRequiredDocuments(String customerOfferRequiredDocuments) {
    this.customerOfferRequiredDocuments = customerOfferRequiredDocuments;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636  bian-reference: Document  general-info: Description of the required documents and time limits on receipt where appropriate 
   * @return customerOfferRequiredDocuments
  **/
  @Schema(description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636  bian-reference: Document  general-info: Description of the required documents and time limits on receipt where appropriate ")
  public String getCustomerOfferRequiredDocuments() {
    return customerOfferRequiredDocuments;
  }

  public void setCustomerOfferRequiredDocuments(String customerOfferRequiredDocuments) {
    this.customerOfferRequiredDocuments = customerOfferRequiredDocuments;
  }

  public BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord correspondenceInstanceReference(String correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102  bian-reference: Document.Correspondence  general-info: Reference to the correspondence generated and received 
   * @return correspondenceInstanceReference
  **/
  @Schema(example = "736630", description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102  bian-reference: Document.Correspondence  general-info: Reference to the correspondence generated and received ")
  public String getCorrespondenceInstanceReference() {
    return correspondenceInstanceReference;
  }

  public void setCorrespondenceInstanceReference(String correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
  }

  public BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord correspondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102  bian-reference: Document.Correspondence  general-info: Correspondence content - messages sent to and received from involved parties 
   * @return correspondenceContent
  **/
  @Schema(description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102  bian-reference: Document.Correspondence  general-info: Correspondence content - messages sent to and received from involved parties ")
  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }

  public BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord documentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/
  @Schema(example = "700162", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for associated documents ")
  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }

  public BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord documentContent(String documentContent) {
    this.documentContent = documentContent;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636  bian-reference: Document  general-info: Document copy/content - legal or significant documents created &amp; referenced 
   * @return documentContent
  **/
  @Schema(description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636  bian-reference: Document  general-info: Document copy/content - legal or significant documents created & referenced ")
  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord bqCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord = (BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord) o;
    return Objects.equals(this.customerOfferRequiredDocuments, bqCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord.customerOfferRequiredDocuments) &&
        Objects.equals(this.correspondenceInstanceReference, bqCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord.correspondenceInstanceReference) &&
        Objects.equals(this.correspondenceContent, bqCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord.correspondenceContent) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, bqCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.documentContent, bqCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord.documentContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferRequiredDocuments, correspondenceInstanceReference, correspondenceContent, documentDirectoryEntryInstanceReference, documentContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord {\n");
    
    sb.append("    customerOfferRequiredDocuments: ").append(toIndentedString(customerOfferRequiredDocuments)).append("\n");
    sb.append("    correspondenceInstanceReference: ").append(toIndentedString(correspondenceInstanceReference)).append("\n");
    sb.append("    correspondenceContent: ").append(toIndentedString(correspondenceContent)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    documentContent: ").append(toIndentedString(documentContent)).append("\n");
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
