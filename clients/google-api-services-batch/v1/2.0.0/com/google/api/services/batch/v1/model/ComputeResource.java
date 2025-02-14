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

package com.google.api.services.batch.v1.model;

/**
 * Compute resource requirements
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Batch API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ComputeResource extends com.google.api.client.json.GenericJson {

  /**
   * Extra boot disk size in MiB for each task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bootDiskMib;

  /**
   * The milliCPU count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long cpuMilli;

  /**
   * Memory in MiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long memoryMib;

  /**
   * Extra boot disk size in MiB for each task.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBootDiskMib() {
    return bootDiskMib;
  }

  /**
   * Extra boot disk size in MiB for each task.
   * @param bootDiskMib bootDiskMib or {@code null} for none
   */
  public ComputeResource setBootDiskMib(java.lang.Long bootDiskMib) {
    this.bootDiskMib = bootDiskMib;
    return this;
  }

  /**
   * The milliCPU count.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCpuMilli() {
    return cpuMilli;
  }

  /**
   * The milliCPU count.
   * @param cpuMilli cpuMilli or {@code null} for none
   */
  public ComputeResource setCpuMilli(java.lang.Long cpuMilli) {
    this.cpuMilli = cpuMilli;
    return this;
  }

  /**
   * Memory in MiB.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMemoryMib() {
    return memoryMib;
  }

  /**
   * Memory in MiB.
   * @param memoryMib memoryMib or {@code null} for none
   */
  public ComputeResource setMemoryMib(java.lang.Long memoryMib) {
    this.memoryMib = memoryMib;
    return this;
  }

  @Override
  public ComputeResource set(String fieldName, Object value) {
    return (ComputeResource) super.set(fieldName, value);
  }

  @Override
  public ComputeResource clone() {
    return (ComputeResource) super.clone();
  }

}
