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
 * Utilization report details the utilization (CPU, memory, etc.) of selected source VMs.
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
public final class UtilizationReport extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time the report was created (this refers to the time of the request, not the
   * time the report creation completed).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The report display name, as assigned by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Provides details on the state of the report in case of an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * Output only. The point in time when the time frame ends. Notice that the time frame is counted
   * backwards. For instance if the "frame_end_time" value is 2021/01/20 and the time frame is WEEK
   * then the report covers the week between 2021/01/20 and 2021/01/14.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String frameEndTime;

  /**
   * Output only. The report unique name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Current state of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time the state was last set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String stateTime;

  /**
   * Time frame of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeFrame;

  /**
   * Output only. Total number of VMs included in the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer vmCount;

  /**
   * List of utilization information per VM. When sent as part of the request, the "vm_id" field is
   * used in order to specify which VMs to include in the report. In that case all other fields are
   * ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VmUtilizationInfo> vms;

  /**
   * Output only. The time the report was created (this refers to the time of the request, not the
   * time the report creation completed).
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the report was created (this refers to the time of the request, not the
   * time the report creation completed).
   * @param createTime createTime or {@code null} for none
   */
  public UtilizationReport setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The report display name, as assigned by the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The report display name, as assigned by the user.
   * @param displayName displayName or {@code null} for none
   */
  public UtilizationReport setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Provides details on the state of the report in case of an error.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * Output only. Provides details on the state of the report in case of an error.
   * @param error error or {@code null} for none
   */
  public UtilizationReport setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * Output only. The point in time when the time frame ends. Notice that the time frame is counted
   * backwards. For instance if the "frame_end_time" value is 2021/01/20 and the time frame is WEEK
   * then the report covers the week between 2021/01/20 and 2021/01/14.
   * @return value or {@code null} for none
   */
  public String getFrameEndTime() {
    return frameEndTime;
  }

  /**
   * Output only. The point in time when the time frame ends. Notice that the time frame is counted
   * backwards. For instance if the "frame_end_time" value is 2021/01/20 and the time frame is WEEK
   * then the report covers the week between 2021/01/20 and 2021/01/14.
   * @param frameEndTime frameEndTime or {@code null} for none
   */
  public UtilizationReport setFrameEndTime(String frameEndTime) {
    this.frameEndTime = frameEndTime;
    return this;
  }

  /**
   * Output only. The report unique name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The report unique name.
   * @param name name or {@code null} for none
   */
  public UtilizationReport setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Current state of the report.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Current state of the report.
   * @param state state or {@code null} for none
   */
  public UtilizationReport setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time the state was last set.
   * @return value or {@code null} for none
   */
  public String getStateTime() {
    return stateTime;
  }

  /**
   * Output only. The time the state was last set.
   * @param stateTime stateTime or {@code null} for none
   */
  public UtilizationReport setStateTime(String stateTime) {
    this.stateTime = stateTime;
    return this;
  }

  /**
   * Time frame of the report.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeFrame() {
    return timeFrame;
  }

  /**
   * Time frame of the report.
   * @param timeFrame timeFrame or {@code null} for none
   */
  public UtilizationReport setTimeFrame(java.lang.String timeFrame) {
    this.timeFrame = timeFrame;
    return this;
  }

  /**
   * Output only. Total number of VMs included in the report.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVmCount() {
    return vmCount;
  }

  /**
   * Output only. Total number of VMs included in the report.
   * @param vmCount vmCount or {@code null} for none
   */
  public UtilizationReport setVmCount(java.lang.Integer vmCount) {
    this.vmCount = vmCount;
    return this;
  }

  /**
   * List of utilization information per VM. When sent as part of the request, the "vm_id" field is
   * used in order to specify which VMs to include in the report. In that case all other fields are
   * ignored.
   * @return value or {@code null} for none
   */
  public java.util.List<VmUtilizationInfo> getVms() {
    return vms;
  }

  /**
   * List of utilization information per VM. When sent as part of the request, the "vm_id" field is
   * used in order to specify which VMs to include in the report. In that case all other fields are
   * ignored.
   * @param vms vms or {@code null} for none
   */
  public UtilizationReport setVms(java.util.List<VmUtilizationInfo> vms) {
    this.vms = vms;
    return this;
  }

  @Override
  public UtilizationReport set(String fieldName, Object value) {
    return (UtilizationReport) super.set(fieldName, value);
  }

  @Override
  public UtilizationReport clone() {
    return (UtilizationReport) super.clone();
  }

}
