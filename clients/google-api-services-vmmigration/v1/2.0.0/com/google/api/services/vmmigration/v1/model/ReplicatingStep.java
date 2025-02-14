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

package com.google.api.services.vmmigration.v1.model;

/**
 * ReplicatingStep contains specific step details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migrate to Virtual Machines API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReplicatingStep extends com.google.api.client.json.GenericJson {

  /**
   * The source disks replication rate for the last 30 minutes in bytes per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastThirtyMinutesAverageBytesPerSecond;

  /**
   * The source disks replication rate for the last 2 minutes in bytes per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastTwoMinutesAverageBytesPerSecond;

  /**
   * Replicated bytes in the step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long replicatedBytes;

  /**
   * Total bytes to be handled in the step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalBytes;

  /**
   * The source disks replication rate for the last 30 minutes in bytes per second.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastThirtyMinutesAverageBytesPerSecond() {
    return lastThirtyMinutesAverageBytesPerSecond;
  }

  /**
   * The source disks replication rate for the last 30 minutes in bytes per second.
   * @param lastThirtyMinutesAverageBytesPerSecond lastThirtyMinutesAverageBytesPerSecond or {@code null} for none
   */
  public ReplicatingStep setLastThirtyMinutesAverageBytesPerSecond(java.lang.Long lastThirtyMinutesAverageBytesPerSecond) {
    this.lastThirtyMinutesAverageBytesPerSecond = lastThirtyMinutesAverageBytesPerSecond;
    return this;
  }

  /**
   * The source disks replication rate for the last 2 minutes in bytes per second.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastTwoMinutesAverageBytesPerSecond() {
    return lastTwoMinutesAverageBytesPerSecond;
  }

  /**
   * The source disks replication rate for the last 2 minutes in bytes per second.
   * @param lastTwoMinutesAverageBytesPerSecond lastTwoMinutesAverageBytesPerSecond or {@code null} for none
   */
  public ReplicatingStep setLastTwoMinutesAverageBytesPerSecond(java.lang.Long lastTwoMinutesAverageBytesPerSecond) {
    this.lastTwoMinutesAverageBytesPerSecond = lastTwoMinutesAverageBytesPerSecond;
    return this;
  }

  /**
   * Replicated bytes in the step.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReplicatedBytes() {
    return replicatedBytes;
  }

  /**
   * Replicated bytes in the step.
   * @param replicatedBytes replicatedBytes or {@code null} for none
   */
  public ReplicatingStep setReplicatedBytes(java.lang.Long replicatedBytes) {
    this.replicatedBytes = replicatedBytes;
    return this;
  }

  /**
   * Total bytes to be handled in the step.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalBytes() {
    return totalBytes;
  }

  /**
   * Total bytes to be handled in the step.
   * @param totalBytes totalBytes or {@code null} for none
   */
  public ReplicatingStep setTotalBytes(java.lang.Long totalBytes) {
    this.totalBytes = totalBytes;
    return this;
  }

  @Override
  public ReplicatingStep set(String fieldName, Object value) {
    return (ReplicatingStep) super.set(fieldName, value);
  }

  @Override
  public ReplicatingStep clone() {
    return (ReplicatingStep) super.clone();
  }

}
