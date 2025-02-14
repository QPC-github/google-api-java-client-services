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

package com.google.api.services.identitytoolkit.v1.model;

/**
 * Information on which multi-factor authentication (MFA) providers are enabled for an account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitV1MfaEnrollment extends com.google.api.client.json.GenericJson {

  /**
   * Display name for this mfa option e.g. "corp cell phone".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Timestamp when the account enrolled this second factor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String enrolledAt;

  /**
   * ID of this MFA option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mfaEnrollmentId;

  /**
   * Normally this will show the phone number associated with this enrollment. In some situations,
   * such as after a first factor sign in, it will only show the obfuscated version of the
   * associated phone number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneInfo;

  /**
   * Output only. Unobfuscated phone_info.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unobfuscatedPhoneInfo;

  /**
   * Display name for this mfa option e.g. "corp cell phone".
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name for this mfa option e.g. "corp cell phone".
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1MfaEnrollment setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Timestamp when the account enrolled this second factor.
   * @return value or {@code null} for none
   */
  public String getEnrolledAt() {
    return enrolledAt;
  }

  /**
   * Timestamp when the account enrolled this second factor.
   * @param enrolledAt enrolledAt or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1MfaEnrollment setEnrolledAt(String enrolledAt) {
    this.enrolledAt = enrolledAt;
    return this;
  }

  /**
   * ID of this MFA option.
   * @return value or {@code null} for none
   */
  public java.lang.String getMfaEnrollmentId() {
    return mfaEnrollmentId;
  }

  /**
   * ID of this MFA option.
   * @param mfaEnrollmentId mfaEnrollmentId or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1MfaEnrollment setMfaEnrollmentId(java.lang.String mfaEnrollmentId) {
    this.mfaEnrollmentId = mfaEnrollmentId;
    return this;
  }

  /**
   * Normally this will show the phone number associated with this enrollment. In some situations,
   * such as after a first factor sign in, it will only show the obfuscated version of the
   * associated phone number.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneInfo() {
    return phoneInfo;
  }

  /**
   * Normally this will show the phone number associated with this enrollment. In some situations,
   * such as after a first factor sign in, it will only show the obfuscated version of the
   * associated phone number.
   * @param phoneInfo phoneInfo or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1MfaEnrollment setPhoneInfo(java.lang.String phoneInfo) {
    this.phoneInfo = phoneInfo;
    return this;
  }

  /**
   * Output only. Unobfuscated phone_info.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnobfuscatedPhoneInfo() {
    return unobfuscatedPhoneInfo;
  }

  /**
   * Output only. Unobfuscated phone_info.
   * @param unobfuscatedPhoneInfo unobfuscatedPhoneInfo or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1MfaEnrollment setUnobfuscatedPhoneInfo(java.lang.String unobfuscatedPhoneInfo) {
    this.unobfuscatedPhoneInfo = unobfuscatedPhoneInfo;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitV1MfaEnrollment set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitV1MfaEnrollment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitV1MfaEnrollment clone() {
    return (GoogleCloudIdentitytoolkitV1MfaEnrollment) super.clone();
  }

}
