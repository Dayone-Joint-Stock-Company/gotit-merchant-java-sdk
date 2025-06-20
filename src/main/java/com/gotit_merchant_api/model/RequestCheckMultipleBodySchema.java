/*
 * Merchant APIs
 * Technical document APIs for Merchant APIs
 *
 * The version of the OpenAPI document: 6.0
 * Contact: duong.vu@gotit.vn
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.gotit_merchant_api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.gotit_merchant_api.model.RequestCheckMultipleBodySchemaSkusInfoInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gotit_merchant_api.JSON;

/**
 * RequestCheckMultipleBodySchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T17:38:34.348758+07:00[Asia/Ho_Chi_Minh]", comments = "Generator version: 7.12.0")
public class RequestCheckMultipleBodySchema {
  public static final String SERIALIZED_NAME_PIN = "pin";
  @SerializedName(SERIALIZED_NAME_PIN)
  @javax.annotation.Nullable
  private String pin;

  public static final String SERIALIZED_NAME_CODES = "codes";
  @SerializedName(SERIALIZED_NAME_CODES)
  @javax.annotation.Nullable
  private List<String> codes = new ArrayList<>();

  public static final String SERIALIZED_NAME_BILL_NUMBER = "bill_number";
  @SerializedName(SERIALIZED_NAME_BILL_NUMBER)
  @javax.annotation.Nullable
  private String billNumber;

  public static final String SERIALIZED_NAME_TOTAL_BILL = "total_bill";
  @SerializedName(SERIALIZED_NAME_TOTAL_BILL)
  @javax.annotation.Nullable
  private Integer totalBill;

  public static final String SERIALIZED_NAME_SKIP_RESERVED_WHEN_MARK_USED = "skip_reserved_when_mark_used";
  @SerializedName(SERIALIZED_NAME_SKIP_RESERVED_WHEN_MARK_USED)
  @javax.annotation.Nullable
  private Boolean skipReservedWhenMarkUsed;

  public static final String SERIALIZED_NAME_SKUS_INFO = "skus_info";
  @SerializedName(SERIALIZED_NAME_SKUS_INFO)
  @javax.annotation.Nullable
  private List<RequestCheckMultipleBodySchemaSkusInfoInner> skusInfo = new ArrayList<>();

  public RequestCheckMultipleBodySchema() {
  }

  public RequestCheckMultipleBodySchema pin(@javax.annotation.Nullable String pin) {
    this.pin = pin;
    return this;
  }

  /**
   * Store pin
   * @return pin
   */
  @javax.annotation.Nullable
  public String getPin() {
    return pin;
  }

  public void setPin(@javax.annotation.Nullable String pin) {
    this.pin = pin;
  }


  public RequestCheckMultipleBodySchema codes(@javax.annotation.Nullable List<String> codes) {
    this.codes = codes;
    return this;
  }

  public RequestCheckMultipleBodySchema addCodesItem(String codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<>();
    }
    this.codes.add(codesItem);
    return this;
  }

  /**
   * Array of 10-16 characters Got It voucher codes
   * @return codes
   */
  @javax.annotation.Nullable
  public List<String> getCodes() {
    return codes;
  }

  public void setCodes(@javax.annotation.Nullable List<String> codes) {
    this.codes = codes;
  }


  public RequestCheckMultipleBodySchema billNumber(@javax.annotation.Nullable String billNumber) {
    this.billNumber = billNumber;
    return this;
  }

  /**
   * Bill number will apply vouchers
   * @return billNumber
   */
  @javax.annotation.Nullable
  public String getBillNumber() {
    return billNumber;
  }

  public void setBillNumber(@javax.annotation.Nullable String billNumber) {
    this.billNumber = billNumber;
  }


  public RequestCheckMultipleBodySchema totalBill(@javax.annotation.Nullable Integer totalBill) {
    this.totalBill = totalBill;
    return this;
  }

  /**
   * Total bill amount
   * @return totalBill
   */
  @javax.annotation.Nullable
  public Integer getTotalBill() {
    return totalBill;
  }

  public void setTotalBill(@javax.annotation.Nullable Integer totalBill) {
    this.totalBill = totalBill;
  }


  public RequestCheckMultipleBodySchema skipReservedWhenMarkUsed(@javax.annotation.Nullable Boolean skipReservedWhenMarkUsed) {
    this.skipReservedWhenMarkUsed = skipReservedWhenMarkUsed;
    return this;
  }

  /**
   * When true the system will execute the flow without reserve
   * @return skipReservedWhenMarkUsed
   */
  @javax.annotation.Nullable
  public Boolean getSkipReservedWhenMarkUsed() {
    return skipReservedWhenMarkUsed;
  }

  public void setSkipReservedWhenMarkUsed(@javax.annotation.Nullable Boolean skipReservedWhenMarkUsed) {
    this.skipReservedWhenMarkUsed = skipReservedWhenMarkUsed;
  }


  public RequestCheckMultipleBodySchema skusInfo(@javax.annotation.Nullable List<RequestCheckMultipleBodySchemaSkusInfoInner> skusInfo) {
    this.skusInfo = skusInfo;
    return this;
  }

  public RequestCheckMultipleBodySchema addSkusInfoItem(RequestCheckMultipleBodySchemaSkusInfoInner skusInfoItem) {
    if (this.skusInfo == null) {
      this.skusInfo = new ArrayList<>();
    }
    this.skusInfo.add(skusInfoItem);
    return this;
  }

  /**
   * SKU information in bill_number
   * @return skusInfo
   */
  @javax.annotation.Nullable
  public List<RequestCheckMultipleBodySchemaSkusInfoInner> getSkusInfo() {
    return skusInfo;
  }

  public void setSkusInfo(@javax.annotation.Nullable List<RequestCheckMultipleBodySchemaSkusInfoInner> skusInfo) {
    this.skusInfo = skusInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCheckMultipleBodySchema requestCheckMultipleBodySchema = (RequestCheckMultipleBodySchema) o;
    return Objects.equals(this.pin, requestCheckMultipleBodySchema.pin) &&
        Objects.equals(this.codes, requestCheckMultipleBodySchema.codes) &&
        Objects.equals(this.billNumber, requestCheckMultipleBodySchema.billNumber) &&
        Objects.equals(this.totalBill, requestCheckMultipleBodySchema.totalBill) &&
        Objects.equals(this.skipReservedWhenMarkUsed, requestCheckMultipleBodySchema.skipReservedWhenMarkUsed) &&
        Objects.equals(this.skusInfo, requestCheckMultipleBodySchema.skusInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pin, codes, billNumber, totalBill, skipReservedWhenMarkUsed, skusInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCheckMultipleBodySchema {\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    billNumber: ").append(toIndentedString(billNumber)).append("\n");
    sb.append("    totalBill: ").append(toIndentedString(totalBill)).append("\n");
    sb.append("    skipReservedWhenMarkUsed: ").append(toIndentedString(skipReservedWhenMarkUsed)).append("\n");
    sb.append("    skusInfo: ").append(toIndentedString(skusInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("pin");
    openapiFields.add("codes");
    openapiFields.add("bill_number");
    openapiFields.add("total_bill");
    openapiFields.add("skip_reserved_when_mark_used");
    openapiFields.add("skus_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RequestCheckMultipleBodySchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RequestCheckMultipleBodySchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestCheckMultipleBodySchema is not found in the empty JSON string", RequestCheckMultipleBodySchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RequestCheckMultipleBodySchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequestCheckMultipleBodySchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("pin") != null && !jsonObj.get("pin").isJsonNull()) && !jsonObj.get("pin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pin").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("codes") != null && !jsonObj.get("codes").isJsonNull() && !jsonObj.get("codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `codes` to be an array in the JSON string but got `%s`", jsonObj.get("codes").toString()));
      }
      if ((jsonObj.get("bill_number") != null && !jsonObj.get("bill_number").isJsonNull()) && !jsonObj.get("bill_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_number").toString()));
      }
      if (jsonObj.get("skus_info") != null && !jsonObj.get("skus_info").isJsonNull()) {
        JsonArray jsonArrayskusInfo = jsonObj.getAsJsonArray("skus_info");
        if (jsonArrayskusInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("skus_info").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `skus_info` to be an array in the JSON string but got `%s`", jsonObj.get("skus_info").toString()));
          }

          // validate the optional field `skus_info` (array)
          for (int i = 0; i < jsonArrayskusInfo.size(); i++) {
            RequestCheckMultipleBodySchemaSkusInfoInner.validateJsonElement(jsonArrayskusInfo.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestCheckMultipleBodySchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestCheckMultipleBodySchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestCheckMultipleBodySchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestCheckMultipleBodySchema.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestCheckMultipleBodySchema>() {
           @Override
           public void write(JsonWriter out, RequestCheckMultipleBodySchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestCheckMultipleBodySchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RequestCheckMultipleBodySchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RequestCheckMultipleBodySchema
   * @throws IOException if the JSON string is invalid with respect to RequestCheckMultipleBodySchema
   */
  public static RequestCheckMultipleBodySchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestCheckMultipleBodySchema.class);
  }

  /**
   * Convert an instance of RequestCheckMultipleBodySchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

