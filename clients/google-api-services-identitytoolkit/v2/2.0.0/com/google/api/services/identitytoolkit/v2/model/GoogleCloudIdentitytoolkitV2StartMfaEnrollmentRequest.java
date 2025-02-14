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

package com.google.api.services.identitytoolkit.v2.model;

/**
 * Sends MFA enrollment verification SMS for a user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. User's ID token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idToken;

  /**
   * Verification info to authorize sending an SMS for phone verification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo phoneEnrollmentInfo;

  /**
   * The ID of the Identity Platform tenant that the user enrolling MFA belongs to. If not set, the
   * user belongs to the default Identity Platform project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantId;

  /**
   * Required. User's ID token.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdToken() {
    return idToken;
  }

  /**
   * Required. User's ID token.
   * @param idToken idToken or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest setIdToken(java.lang.String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * Verification info to authorize sending an SMS for phone verification.
   * @return value or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo getPhoneEnrollmentInfo() {
    return phoneEnrollmentInfo;
  }

  /**
   * Verification info to authorize sending an SMS for phone verification.
   * @param phoneEnrollmentInfo phoneEnrollmentInfo or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest setPhoneEnrollmentInfo(GoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo phoneEnrollmentInfo) {
    this.phoneEnrollmentInfo = phoneEnrollmentInfo;
    return this;
  }

  /**
   * The ID of the Identity Platform tenant that the user enrolling MFA belongs to. If not set, the
   * user belongs to the default Identity Platform project.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantId() {
    return tenantId;
  }

  /**
   * The ID of the Identity Platform tenant that the user enrolling MFA belongs to. If not set, the
   * user belongs to the default Identity Platform project.
   * @param tenantId tenantId or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest setTenantId(java.lang.String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest clone() {
    return (GoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest) super.clone();
  }

}
