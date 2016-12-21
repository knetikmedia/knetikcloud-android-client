/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BreRuleLog {
  
  @SerializedName("ran")
  private Boolean ran = null;
  @SerializedName("reason")
  private String reason = null;
  @SerializedName("rule_end_date")
  private Long ruleEndDate = null;
  @SerializedName("rule_id")
  private String ruleId = null;
  @SerializedName("rule_name")
  private String ruleName = null;
  @SerializedName("rule_start_date")
  private Long ruleStartDate = null;

  /**
   * Whether the rule ran
   **/
  @ApiModelProperty(value = "Whether the rule ran")
  public Boolean getRan() {
    return ran;
  }
  public void setRan(Boolean ran) {
    this.ran = ran;
  }

  /**
   * The reason for the rule
   **/
  @ApiModelProperty(value = "The reason for the rule")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The end date of the rule in seconds
   **/
  @ApiModelProperty(value = "The end date of the rule in seconds")
  public Long getRuleEndDate() {
    return ruleEndDate;
  }
  public void setRuleEndDate(Long ruleEndDate) {
    this.ruleEndDate = ruleEndDate;
  }

  /**
   * The id of the rule
   **/
  @ApiModelProperty(value = "The id of the rule")
  public String getRuleId() {
    return ruleId;
  }
  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  /**
   * The name of the rule
   **/
  @ApiModelProperty(value = "The name of the rule")
  public String getRuleName() {
    return ruleName;
  }
  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  /**
   * The start date of the rule in seconds
   **/
  @ApiModelProperty(value = "The start date of the rule in seconds")
  public Long getRuleStartDate() {
    return ruleStartDate;
  }
  public void setRuleStartDate(Long ruleStartDate) {
    this.ruleStartDate = ruleStartDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreRuleLog breRuleLog = (BreRuleLog) o;
    return (this.ran == null ? breRuleLog.ran == null : this.ran.equals(breRuleLog.ran)) &&
        (this.reason == null ? breRuleLog.reason == null : this.reason.equals(breRuleLog.reason)) &&
        (this.ruleEndDate == null ? breRuleLog.ruleEndDate == null : this.ruleEndDate.equals(breRuleLog.ruleEndDate)) &&
        (this.ruleId == null ? breRuleLog.ruleId == null : this.ruleId.equals(breRuleLog.ruleId)) &&
        (this.ruleName == null ? breRuleLog.ruleName == null : this.ruleName.equals(breRuleLog.ruleName)) &&
        (this.ruleStartDate == null ? breRuleLog.ruleStartDate == null : this.ruleStartDate.equals(breRuleLog.ruleStartDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.ran == null ? 0: this.ran.hashCode());
    result = 31 * result + (this.reason == null ? 0: this.reason.hashCode());
    result = 31 * result + (this.ruleEndDate == null ? 0: this.ruleEndDate.hashCode());
    result = 31 * result + (this.ruleId == null ? 0: this.ruleId.hashCode());
    result = 31 * result + (this.ruleName == null ? 0: this.ruleName.hashCode());
    result = 31 * result + (this.ruleStartDate == null ? 0: this.ruleStartDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreRuleLog {\n");
    
    sb.append("  ran: ").append(ran).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("  ruleEndDate: ").append(ruleEndDate).append("\n");
    sb.append("  ruleId: ").append(ruleId).append("\n");
    sb.append("  ruleName: ").append(ruleName).append("\n");
    sb.append("  ruleStartDate: ").append(ruleStartDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
