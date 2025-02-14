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

package com.google.api.services.run.v1.model;

/**
 * HTTPGetAction describes an action based on HTTP Get requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HTTPGetAction extends com.google.api.client.json.GenericJson {

  /**
   * Not supported by Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HTTPHeader> httpHeaders;

  /**
   * Path to access on the HTTP server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Not supported by Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scheme;

  /**
   * Not supported by Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Not supported by Cloud Run.
   * @param host host or {@code null} for none
   */
  public HTTPGetAction setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   * @return value or {@code null} for none
   */
  public java.util.List<HTTPHeader> getHttpHeaders() {
    return httpHeaders;
  }

  /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   * @param httpHeaders httpHeaders or {@code null} for none
   */
  public HTTPGetAction setHttpHeaders(java.util.List<HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  /**
   * Path to access on the HTTP server.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Path to access on the HTTP server.
   * @param path path or {@code null} for none
   */
  public HTTPGetAction setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Not supported by Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.String getScheme() {
    return scheme;
  }

  /**
   * Not supported by Cloud Run.
   * @param scheme scheme or {@code null} for none
   */
  public HTTPGetAction setScheme(java.lang.String scheme) {
    this.scheme = scheme;
    return this;
  }

  @Override
  public HTTPGetAction set(String fieldName, Object value) {
    return (HTTPGetAction) super.set(fieldName, value);
  }

  @Override
  public HTTPGetAction clone() {
    return (HTTPGetAction) super.clone();
  }

}
