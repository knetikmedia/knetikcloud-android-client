/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NewPasswordRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-11T13:41:51.097-04:00")
public class NewPasswordRequest {
  @SerializedName("password")
  private String password = null;

  @SerializedName("secret")
  private String secret = null;

  public NewPasswordRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The new password in plain text
   * @return password
  **/
  @ApiModelProperty(required = true, value = "The new password in plain text")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public NewPasswordRequest secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * The secret provided after the password reset
   * @return secret
  **/
  @ApiModelProperty(required = true, value = "The secret provided after the password reset")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewPasswordRequest newPasswordRequest = (NewPasswordRequest) o;
    return Objects.equals(this.password, newPasswordRequest.password) &&
        Objects.equals(this.secret, newPasswordRequest.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewPasswordRequest {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

