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
import com.knetikcloud.model.DatabaseConfig;
import com.knetikcloud.model.S3Config;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CustomerConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:02:11.431-04:00")
public class CustomerConfig {
  @SerializedName("aliases")
  private String aliases = null;

  @SerializedName("database")
  private DatabaseConfig database = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("s3_config")
  private S3Config s3Config = null;

  public CustomerConfig aliases(String aliases) {
    this.aliases = aliases;
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @ApiModelProperty(value = "")
  public String getAliases() {
    return aliases;
  }

  public void setAliases(String aliases) {
    this.aliases = aliases;
  }

  public CustomerConfig database(DatabaseConfig database) {
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @ApiModelProperty(value = "")
  public DatabaseConfig getDatabase() {
    return database;
  }

  public void setDatabase(DatabaseConfig database) {
    this.database = database;
  }

  public CustomerConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerConfig s3Config(S3Config s3Config) {
    this.s3Config = s3Config;
    return this;
  }

   /**
   * Get s3Config
   * @return s3Config
  **/
  @ApiModelProperty(value = "")
  public S3Config getS3Config() {
    return s3Config;
  }

  public void setS3Config(S3Config s3Config) {
    this.s3Config = s3Config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerConfig customerConfig = (CustomerConfig) o;
    return Objects.equals(this.aliases, customerConfig.aliases) &&
        Objects.equals(this.database, customerConfig.database) &&
        Objects.equals(this.name, customerConfig.name) &&
        Objects.equals(this.s3Config, customerConfig.s3Config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, database, name, s3Config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerConfig {\n");
    
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    s3Config: ").append(toIndentedString(s3Config)).append("\n");
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

