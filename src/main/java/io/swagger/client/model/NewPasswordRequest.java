/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
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
public class NewPasswordRequest {
  
  @SerializedName("password")
  private String password = null;
  @SerializedName("secret")
  private String secret = null;

  /**
   * The new password in plain text
   **/
  @ApiModelProperty(required = true, value = "The new password in plain text")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * The secret provided after the password reset
   **/
  @ApiModelProperty(required = true, value = "The secret provided after the password reset")
  public String getSecret() {
    return secret;
  }
  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewPasswordRequest newPasswordRequest = (NewPasswordRequest) o;
    return (this.password == null ? newPasswordRequest.password == null : this.password.equals(newPasswordRequest.password)) &&
        (this.secret == null ? newPasswordRequest.secret == null : this.secret.equals(newPasswordRequest.secret));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.secret == null ? 0: this.secret.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewPasswordRequest {\n");
    
    sb.append("  password: ").append(password).append("\n");
    sb.append("  secret: ").append(secret).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
