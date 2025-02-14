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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Model definition for BlueGingerClientVisibleProtoBlueGingerSupportedServicesBlueGingerModule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BlueGingerClientVisibleProtoBlueGingerSupportedServicesBlueGingerModule extends com.google.api.client.json.GenericJson {

  /**
   * Module name, e.g. hairdresser_reservation. from
   * quality/views/extraction/kcube/bg/modules/modules.bzl.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Services of this module that are supported by the business, e.g. haircuts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> services;

  /**
   * Module name, e.g. hairdresser_reservation. from
   * quality/views/extraction/kcube/bg/modules/modules.bzl.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Module name, e.g. hairdresser_reservation. from
   * quality/views/extraction/kcube/bg/modules/modules.bzl.
   * @param name name or {@code null} for none
   */
  public BlueGingerClientVisibleProtoBlueGingerSupportedServicesBlueGingerModule setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Services of this module that are supported by the business, e.g. haircuts.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getServices() {
    return services;
  }

  /**
   * Services of this module that are supported by the business, e.g. haircuts.
   * @param services services or {@code null} for none
   */
  public BlueGingerClientVisibleProtoBlueGingerSupportedServicesBlueGingerModule setServices(java.util.List<java.lang.String> services) {
    this.services = services;
    return this;
  }

  @Override
  public BlueGingerClientVisibleProtoBlueGingerSupportedServicesBlueGingerModule set(String fieldName, Object value) {
    return (BlueGingerClientVisibleProtoBlueGingerSupportedServicesBlueGingerModule) super.set(fieldName, value);
  }

  @Override
  public BlueGingerClientVisibleProtoBlueGingerSupportedServicesBlueGingerModule clone() {
    return (BlueGingerClientVisibleProtoBlueGingerSupportedServicesBlueGingerModule) super.clone();
  }

}
