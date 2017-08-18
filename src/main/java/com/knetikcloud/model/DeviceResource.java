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
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DeviceResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-18T00:46:46.781-04:00")
public class DeviceResource {
  @SerializedName("authorization")
  private String authorization = null;

  /**
   * The current condition of the device (New, Defective, Reconditioned)
   */
  @JsonAdapter(ConditionEnum.Adapter.class)
  public enum ConditionEnum {
    NEW("New"),
    
    DEFECTIVE("Defective"),
    
    RECONDITIONED("Reconditioned");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConditionEnum fromValue(String text) {
      for (ConditionEnum b : ConditionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConditionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConditionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConditionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConditionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("condition")
  private ConditionEnum condition = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("data")
  private Map<String, String> data = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("device_type")
  private String deviceType = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("mac_address")
  private String macAddress = null;

  @SerializedName("make")
  private String make = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("os")
  private String os = null;

  @SerializedName("serial")
  private String serial = null;

  /**
   * The current status the device (Active, Pending Active, Inactive, Repair
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("Active"),
    
    PENDINGACTIVE("PendingActive"),
    
    INACTIVE("Inactive"),
    
    REPAIR("Repair");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("user")
  private SimpleUserResource user = null;

  @SerializedName("users")
  private List<SimpleUserResource> users = null;

  public DeviceResource authorization(String authorization) {
    this.authorization = authorization;
    return this;
  }

   /**
   * The authorization code for the device
   * @return authorization
  **/
  @ApiModelProperty(value = "The authorization code for the device")
  public String getAuthorization() {
    return authorization;
  }

  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  }

  public DeviceResource condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The current condition of the device (New, Defective, Reconditioned)
   * @return condition
  **/
  @ApiModelProperty(value = "The current condition of the device (New, Defective, Reconditioned)")
  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

   /**
   * The date the device log was created
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the device log was created")
  public Long getCreatedDate() {
    return createdDate;
  }

  public DeviceResource data(Map<String, String> data) {
    this.data = data;
    return this;
  }

  public DeviceResource putDataItem(String key, String dataItem) {
    if (this.data == null) {
      this.data = new HashMap<String, String>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * The key/value pairs for extended data
   * @return data
  **/
  @ApiModelProperty(value = "The key/value pairs for extended data")
  public Map<String, String> getData() {
    return data;
  }

  public void setData(Map<String, String> data) {
    this.data = data;
  }

  public DeviceResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the device
   * @return description
  **/
  @ApiModelProperty(value = "The description of the device")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeviceResource deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * The type of the device
   * @return deviceType
  **/
  @ApiModelProperty(value = "The type of the device")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public DeviceResource id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID for this device. Cannot be changed once created
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique ID for this device. Cannot be changed once created")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DeviceResource location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The location of the device
   * @return location
  **/
  @ApiModelProperty(value = "The location of the device")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public DeviceResource macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * The MAC (media access control) address of the device
   * @return macAddress
  **/
  @ApiModelProperty(value = "The MAC (media access control) address of the device")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public DeviceResource make(String make) {
    this.make = make;
    return this;
  }

   /**
   * The make of the device
   * @return make
  **/
  @ApiModelProperty(value = "The make of the device")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public DeviceResource model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The model of the device
   * @return model
  **/
  @ApiModelProperty(value = "The model of the device")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public DeviceResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the device
   * @return name
  **/
  @ApiModelProperty(value = "The name of the device")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceResource os(String os) {
    this.os = os;
    return this;
  }

   /**
   * The OS (operating system) on the device
   * @return os
  **/
  @ApiModelProperty(value = "The OS (operating system) on the device")
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public DeviceResource serial(String serial) {
    this.serial = serial;
    return this;
  }

   /**
   * The serial number of the device
   * @return serial
  **/
  @ApiModelProperty(value = "The serial number of the device")
  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public DeviceResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status the device (Active, Pending Active, Inactive, Repair
   * @return status
  **/
  @ApiModelProperty(value = "The current status the device (Active, Pending Active, Inactive, Repair")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * The date the device log was updated
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the device log was updated")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public DeviceResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The user that owns the device
   * @return user
  **/
  @ApiModelProperty(value = "The user that owns the device")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
    this.user = user;
  }

  public DeviceResource users(List<SimpleUserResource> users) {
    this.users = users;
    return this;
  }

  public DeviceResource addUsersItem(SimpleUserResource usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<SimpleUserResource>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * The users currently using the device
   * @return users
  **/
  @ApiModelProperty(value = "The users currently using the device")
  public List<SimpleUserResource> getUsers() {
    return users;
  }

  public void setUsers(List<SimpleUserResource> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceResource deviceResource = (DeviceResource) o;
    return Objects.equals(this.authorization, deviceResource.authorization) &&
        Objects.equals(this.condition, deviceResource.condition) &&
        Objects.equals(this.createdDate, deviceResource.createdDate) &&
        Objects.equals(this.data, deviceResource.data) &&
        Objects.equals(this.description, deviceResource.description) &&
        Objects.equals(this.deviceType, deviceResource.deviceType) &&
        Objects.equals(this.id, deviceResource.id) &&
        Objects.equals(this.location, deviceResource.location) &&
        Objects.equals(this.macAddress, deviceResource.macAddress) &&
        Objects.equals(this.make, deviceResource.make) &&
        Objects.equals(this.model, deviceResource.model) &&
        Objects.equals(this.name, deviceResource.name) &&
        Objects.equals(this.os, deviceResource.os) &&
        Objects.equals(this.serial, deviceResource.serial) &&
        Objects.equals(this.status, deviceResource.status) &&
        Objects.equals(this.updatedDate, deviceResource.updatedDate) &&
        Objects.equals(this.user, deviceResource.user) &&
        Objects.equals(this.users, deviceResource.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorization, condition, createdDate, data, description, deviceType, id, location, macAddress, make, model, name, os, serial, status, updatedDate, user, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceResource {\n");
    
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

