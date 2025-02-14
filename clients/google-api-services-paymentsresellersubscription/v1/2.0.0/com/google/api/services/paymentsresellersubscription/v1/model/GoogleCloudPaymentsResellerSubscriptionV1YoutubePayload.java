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

package com.google.api.services.paymentsresellersubscription.v1.model;

/**
 * Payload specific to Youtube products.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Payments Reseller Subscription API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPaymentsResellerSubscriptionV1YoutubePayload extends com.google.api.client.json.GenericJson {

  /**
   * The list of eligibility_ids which are applicable for the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> partnerEligibilityIds;

  /**
   * The list of eligibility_ids which are applicable for the line item.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPartnerEligibilityIds() {
    return partnerEligibilityIds;
  }

  /**
   * The list of eligibility_ids which are applicable for the line item.
   * @param partnerEligibilityIds partnerEligibilityIds or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1YoutubePayload setPartnerEligibilityIds(java.util.List<java.lang.String> partnerEligibilityIds) {
    this.partnerEligibilityIds = partnerEligibilityIds;
    return this;
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1YoutubePayload set(String fieldName, Object value) {
    return (GoogleCloudPaymentsResellerSubscriptionV1YoutubePayload) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1YoutubePayload clone() {
    return (GoogleCloudPaymentsResellerSubscriptionV1YoutubePayload) super.clone();
  }

}
