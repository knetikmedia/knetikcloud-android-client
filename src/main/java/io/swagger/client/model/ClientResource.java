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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ClientResource {
  
  @SerializedName("access_token_validity_seconds")
  private Integer accessTokenValiditySeconds = null;
  @SerializedName("client_key")
  private String clientKey = null;
  @SerializedName("grant_types")
  private List<String> grantTypes = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("is_public")
  private Boolean isPublic = null;
  @SerializedName("locked")
  private Boolean locked = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("redirect_uris")
  private List<String> redirectUris = null;
  @SerializedName("refresh_token_validity_seconds")
  private Integer refreshTokenValiditySeconds = null;
  @SerializedName("secret")
  private String secret = null;

  /**
   * The expiration time of an initial oauth token in seconds
   **/
  @ApiModelProperty(value = "The expiration time of an initial oauth token in seconds")
  public Integer getAccessTokenValiditySeconds() {
    return accessTokenValiditySeconds;
  }
  public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
  }

  /**
   * The client_id field of the oauth token request
   **/
  @ApiModelProperty(required = true, value = "The client_id field of the oauth token request")
  public String getClientKey() {
    return clientKey;
  }
  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }

  /**
   * The oauth grant type as in: password (username/password auth), client_credentials (server-to-server, private clients), refresh_token (to allow clients to refresh their initial token), facebook, google, etc) See documentation for a compelte list.
   **/
  @ApiModelProperty(value = "The oauth grant type as in: password (username/password auth), client_credentials (server-to-server, private clients), refresh_token (to allow clients to refresh their initial token), facebook, google, etc) See documentation for a compelte list.")
  public List<String> getGrantTypes() {
    return grantTypes;
  }
  public void setGrantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
  }

  /**
   * Generated unique ID for the client
   **/
  @ApiModelProperty(value = "Generated unique ID for the client")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Set to true if the client is public i.e the secret key can be secured
   **/
  @ApiModelProperty(value = "Set to true if the client is public i.e the secret key can be secured")
  public Boolean getIsPublic() {
    return isPublic;
  }
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  /**
   * Used to flag system clients that are not meant to be tinkered with
   **/
  @ApiModelProperty(value = "Used to flag system clients that are not meant to be tinkered with")
  public Boolean getLocked() {
    return locked;
  }
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  /**
   * The friendly name of the client
   **/
  @ApiModelProperty(required = true, value = "The friendly name of the client")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A redirection URL to use when granting access to third-parties (seldomly used)
   **/
  @ApiModelProperty(value = "A redirection URL to use when granting access to third-parties (seldomly used)")
  public List<String> getRedirectUris() {
    return redirectUris;
  }
  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  /**
   * The expiration time of a refresh oauth token in seconds
   **/
  @ApiModelProperty(value = "The expiration time of a refresh oauth token in seconds")
  public Integer getRefreshTokenValiditySeconds() {
    return refreshTokenValiditySeconds;
  }
  public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
    this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
  }

  /**
   * The client-secret field of the oauth request when creating a private client
   **/
  @ApiModelProperty(required = true, value = "The client-secret field of the oauth request when creating a private client")
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
    ClientResource clientResource = (ClientResource) o;
    return (this.accessTokenValiditySeconds == null ? clientResource.accessTokenValiditySeconds == null : this.accessTokenValiditySeconds.equals(clientResource.accessTokenValiditySeconds)) &&
        (this.clientKey == null ? clientResource.clientKey == null : this.clientKey.equals(clientResource.clientKey)) &&
        (this.grantTypes == null ? clientResource.grantTypes == null : this.grantTypes.equals(clientResource.grantTypes)) &&
        (this.id == null ? clientResource.id == null : this.id.equals(clientResource.id)) &&
        (this.isPublic == null ? clientResource.isPublic == null : this.isPublic.equals(clientResource.isPublic)) &&
        (this.locked == null ? clientResource.locked == null : this.locked.equals(clientResource.locked)) &&
        (this.name == null ? clientResource.name == null : this.name.equals(clientResource.name)) &&
        (this.redirectUris == null ? clientResource.redirectUris == null : this.redirectUris.equals(clientResource.redirectUris)) &&
        (this.refreshTokenValiditySeconds == null ? clientResource.refreshTokenValiditySeconds == null : this.refreshTokenValiditySeconds.equals(clientResource.refreshTokenValiditySeconds)) &&
        (this.secret == null ? clientResource.secret == null : this.secret.equals(clientResource.secret));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.accessTokenValiditySeconds == null ? 0: this.accessTokenValiditySeconds.hashCode());
    result = 31 * result + (this.clientKey == null ? 0: this.clientKey.hashCode());
    result = 31 * result + (this.grantTypes == null ? 0: this.grantTypes.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.isPublic == null ? 0: this.isPublic.hashCode());
    result = 31 * result + (this.locked == null ? 0: this.locked.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.redirectUris == null ? 0: this.redirectUris.hashCode());
    result = 31 * result + (this.refreshTokenValiditySeconds == null ? 0: this.refreshTokenValiditySeconds.hashCode());
    result = 31 * result + (this.secret == null ? 0: this.secret.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientResource {\n");
    
    sb.append("  accessTokenValiditySeconds: ").append(accessTokenValiditySeconds).append("\n");
    sb.append("  clientKey: ").append(clientKey).append("\n");
    sb.append("  grantTypes: ").append(grantTypes).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  isPublic: ").append(isPublic).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  redirectUris: ").append(redirectUris).append("\n");
    sb.append("  refreshTokenValiditySeconds: ").append(refreshTokenValiditySeconds).append("\n");
    sb.append("  secret: ").append(secret).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
