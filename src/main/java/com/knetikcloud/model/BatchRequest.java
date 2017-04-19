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

package com.knetikcloud.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BatchRequest {
  
  @SerializedName("body")
  private Object body = null;
  @SerializedName("content_type")
  private String contentType = null;
  @SerializedName("method")
  private String method = null;
  @SerializedName("timeout")
  private Integer timeout = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("uri")
  private String uri = null;

  /**
   * The request body as would be passed to the URI
   **/
  @ApiModelProperty(required = true, value = "The request body as would be passed to the URI")
  public Object getBody() {
    return body;
  }
  public void setBody(Object body) {
    this.body = body;
  }

  /**
   * Content type used, Ex:(application/json)
   **/
  @ApiModelProperty(required = true, value = "Content type used, Ex:(application/json)")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   * The HTTP method used, Ex: (GET)
   **/
  @ApiModelProperty(required = true, value = "The HTTP method used, Ex: (GET)")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }

  /**
   * Time in seconds before process will timeout.  Default is 60.  Range is 1-300
   **/
  @ApiModelProperty(required = true, value = "Time in seconds before process will timeout.  Default is 60.  Range is 1-300")
  public Integer getTimeout() {
    return timeout;
  }
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  /**
   * The oauth token only
   **/
  @ApiModelProperty(value = "The oauth token only")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * Full URI of REST call
   **/
  @ApiModelProperty(required = true, value = "Full URI of REST call")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequest batchRequest = (BatchRequest) o;
    return (this.body == null ? batchRequest.body == null : this.body.equals(batchRequest.body)) &&
        (this.contentType == null ? batchRequest.contentType == null : this.contentType.equals(batchRequest.contentType)) &&
        (this.method == null ? batchRequest.method == null : this.method.equals(batchRequest.method)) &&
        (this.timeout == null ? batchRequest.timeout == null : this.timeout.equals(batchRequest.timeout)) &&
        (this.token == null ? batchRequest.token == null : this.token.equals(batchRequest.token)) &&
        (this.uri == null ? batchRequest.uri == null : this.uri.equals(batchRequest.uri));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.body == null ? 0: this.body.hashCode());
    result = 31 * result + (this.contentType == null ? 0: this.contentType.hashCode());
    result = 31 * result + (this.method == null ? 0: this.method.hashCode());
    result = 31 * result + (this.timeout == null ? 0: this.timeout.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    result = 31 * result + (this.uri == null ? 0: this.uri.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequest {\n");
    
    sb.append("  body: ").append(body).append("\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  method: ").append(method).append("\n");
    sb.append("  timeout: ").append(timeout).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  uri: ").append(uri).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
