/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudchannel.v1.model;

/**
 * Request message for CloudChannelService.ListTransferableOffers
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1ListTransferableOffersRequest extends com.google.api.client.json.GenericJson {

  /**
   * Customer's Cloud Identity ID
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudIdentityId;

  /**
   * A reseller should create a customer and use the resource name of that customer here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerName;

  /**
   * Optional. The BCP-47 language code. For example, "en-US". The response will localize in the
   * corresponding language code, if specified. The default value is "en-US".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Requested page size. Server might return fewer results than requested. If unspecified, returns
   * at most 100 offers. The maximum value is 1000; the server will coerce values above 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * A token for a page of results other than the first page. Obtained using
   * ListTransferableOffersResponse.next_page_token of the previous
   * CloudChannelService.ListTransferableOffers call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Required. The SKU to look up Offers for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sku;

  /**
   * Customer's Cloud Identity ID
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudIdentityId() {
    return cloudIdentityId;
  }

  /**
   * Customer's Cloud Identity ID
   * @param cloudIdentityId cloudIdentityId or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableOffersRequest setCloudIdentityId(java.lang.String cloudIdentityId) {
    this.cloudIdentityId = cloudIdentityId;
    return this;
  }

  /**
   * A reseller should create a customer and use the resource name of that customer here.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerName() {
    return customerName;
  }

  /**
   * A reseller should create a customer and use the resource name of that customer here.
   * @param customerName customerName or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableOffersRequest setCustomerName(java.lang.String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Optional. The BCP-47 language code. For example, "en-US". The response will localize in the
   * corresponding language code, if specified. The default value is "en-US".
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Optional. The BCP-47 language code. For example, "en-US". The response will localize in the
   * corresponding language code, if specified. The default value is "en-US".
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableOffersRequest setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Requested page size. Server might return fewer results than requested. If unspecified, returns
   * at most 100 offers. The maximum value is 1000; the server will coerce values above 1000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Requested page size. Server might return fewer results than requested. If unspecified, returns
   * at most 100 offers. The maximum value is 1000; the server will coerce values above 1000.
   * @param pageSize pageSize or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableOffersRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * A token for a page of results other than the first page. Obtained using
   * ListTransferableOffersResponse.next_page_token of the previous
   * CloudChannelService.ListTransferableOffers call.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * A token for a page of results other than the first page. Obtained using
   * ListTransferableOffersResponse.next_page_token of the previous
   * CloudChannelService.ListTransferableOffers call.
   * @param pageToken pageToken or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableOffersRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Required. The SKU to look up Offers for.
   * @return value or {@code null} for none
   */
  public java.lang.String getSku() {
    return sku;
  }

  /**
   * Required. The SKU to look up Offers for.
   * @param sku sku or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableOffersRequest setSku(java.lang.String sku) {
    this.sku = sku;
    return this;
  }

  @Override
  public GoogleCloudChannelV1ListTransferableOffersRequest set(String fieldName, Object value) {
    return (GoogleCloudChannelV1ListTransferableOffersRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1ListTransferableOffersRequest clone() {
    return (GoogleCloudChannelV1ListTransferableOffersRequest) super.clone();
  }

}
