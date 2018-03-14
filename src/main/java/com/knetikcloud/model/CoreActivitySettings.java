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
 * CoreActivitySettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:02:11.431-04:00")
public class CoreActivitySettings {
  @SerializedName("boot_in_play")
  private Boolean bootInPlay = null;

  @SerializedName("custom_launch_address_allowed")
  private Boolean customLaunchAddressAllowed = null;

  /**
   * Restriction for who can host an occurrence. admin disallows regular users, player means the user must also be a player in the occurrence if not admin, non-player means the user has the option to host without being a player. Default &#39;player&#39;
   */
  @JsonAdapter(HostOptionEnum.Adapter.class)
  public enum HostOptionEnum {
    ADMIN_ONLY("admin_only"),
    
    PLAYER("player"),
    
    NON_PLAYER("non_player");

    private String value;

    HostOptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HostOptionEnum fromValue(String text) {
      for (HostOptionEnum b : HostOptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HostOptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HostOptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HostOptionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HostOptionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("host_option")
  private HostOptionEnum hostOption = null;

  @SerializedName("host_status_control")
  private Boolean hostStatusControl = null;

  @SerializedName("join_in_play")
  private Boolean joinInPlay = null;

  @SerializedName("leave_in_play")
  private Boolean leaveInPlay = null;

  @SerializedName("max_players")
  private Integer maxPlayers = null;

  @SerializedName("min_players")
  private Integer minPlayers = null;

  /**
   * Restriction for who is able to report game end and results. Admin is always able to send results as well. Default &#39;none&#39;
   */
  @JsonAdapter(ResultsTrustEnum.Adapter.class)
  public enum ResultsTrustEnum {
    NONE("none"),
    
    HOST("host"),
    
    ALL("all");

    private String value;

    ResultsTrustEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultsTrustEnum fromValue(String text) {
      for (ResultsTrustEnum b : ResultsTrustEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResultsTrustEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultsTrustEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultsTrustEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResultsTrustEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("results_trust")
  private ResultsTrustEnum resultsTrust = null;

  public CoreActivitySettings bootInPlay(Boolean bootInPlay) {
    this.bootInPlay = bootInPlay;
    return this;
  }

   /**
   * Whether the host can boot a user while the status is PLAYING. Default false
   * @return bootInPlay
  **/
  @ApiModelProperty(example = "false", value = "Whether the host can boot a user while the status is PLAYING. Default false")
  public Boolean isBootInPlay() {
    return bootInPlay;
  }

  public void setBootInPlay(Boolean bootInPlay) {
    this.bootInPlay = bootInPlay;
  }

  public CoreActivitySettings customLaunchAddressAllowed(Boolean customLaunchAddressAllowed) {
    this.customLaunchAddressAllowed = customLaunchAddressAllowed;
    return this;
  }

   /**
   * Restriction for whether the host creating an occurrence can specify a custom launch address (such as their own ip address). Default &#39;false&#39;
   * @return customLaunchAddressAllowed
  **/
  @ApiModelProperty(example = "false", value = "Restriction for whether the host creating an occurrence can specify a custom launch address (such as their own ip address). Default 'false'")
  public Boolean isCustomLaunchAddressAllowed() {
    return customLaunchAddressAllowed;
  }

  public void setCustomLaunchAddressAllowed(Boolean customLaunchAddressAllowed) {
    this.customLaunchAddressAllowed = customLaunchAddressAllowed;
  }

  public CoreActivitySettings hostOption(HostOptionEnum hostOption) {
    this.hostOption = hostOption;
    return this;
  }

   /**
   * Restriction for who can host an occurrence. admin disallows regular users, player means the user must also be a player in the occurrence if not admin, non-player means the user has the option to host without being a player. Default &#39;player&#39;
   * @return hostOption
  **/
  @ApiModelProperty(value = "Restriction for who can host an occurrence. admin disallows regular users, player means the user must also be a player in the occurrence if not admin, non-player means the user has the option to host without being a player. Default 'player'")
  public HostOptionEnum getHostOption() {
    return hostOption;
  }

  public void setHostOption(HostOptionEnum hostOption) {
    this.hostOption = hostOption;
  }

  public CoreActivitySettings hostStatusControl(Boolean hostStatusControl) {
    this.hostStatusControl = hostStatusControl;
    return this;
  }

   /**
   * Restriction for whether the host has control of the status once the game launches. If false they can only manage the game before (when setup and open). Default &#39;false&#39;
   * @return hostStatusControl
  **/
  @ApiModelProperty(example = "false", value = "Restriction for whether the host has control of the status once the game launches. If false they can only manage the game before (when setup and open). Default 'false'")
  public Boolean isHostStatusControl() {
    return hostStatusControl;
  }

  public void setHostStatusControl(Boolean hostStatusControl) {
    this.hostStatusControl = hostStatusControl;
  }

  public CoreActivitySettings joinInPlay(Boolean joinInPlay) {
    this.joinInPlay = joinInPlay;
    return this;
  }

   /**
   * Whether users can join while the status is PLAYING. Default false
   * @return joinInPlay
  **/
  @ApiModelProperty(example = "false", value = "Whether users can join while the status is PLAYING. Default false")
  public Boolean isJoinInPlay() {
    return joinInPlay;
  }

  public void setJoinInPlay(Boolean joinInPlay) {
    this.joinInPlay = joinInPlay;
  }

  public CoreActivitySettings leaveInPlay(Boolean leaveInPlay) {
    this.leaveInPlay = leaveInPlay;
    return this;
  }

   /**
   * Whether users can leave while the status is PLAYING. Default false
   * @return leaveInPlay
  **/
  @ApiModelProperty(example = "false", value = "Whether users can leave while the status is PLAYING. Default false")
  public Boolean isLeaveInPlay() {
    return leaveInPlay;
  }

  public void setLeaveInPlay(Boolean leaveInPlay) {
    this.leaveInPlay = leaveInPlay;
  }

  public CoreActivitySettings maxPlayers(Integer maxPlayers) {
    this.maxPlayers = maxPlayers;
    return this;
  }

   /**
   * The maximum number of players the game can hold
   * @return maxPlayers
  **/
  @ApiModelProperty(value = "The maximum number of players the game can hold")
  public Integer getMaxPlayers() {
    return maxPlayers;
  }

  public void setMaxPlayers(Integer maxPlayers) {
    this.maxPlayers = maxPlayers;
  }

  public CoreActivitySettings minPlayers(Integer minPlayers) {
    this.minPlayers = minPlayers;
    return this;
  }

   /**
   * The minimum number of players the game can hold
   * @return minPlayers
  **/
  @ApiModelProperty(value = "The minimum number of players the game can hold")
  public Integer getMinPlayers() {
    return minPlayers;
  }

  public void setMinPlayers(Integer minPlayers) {
    this.minPlayers = minPlayers;
  }

  public CoreActivitySettings resultsTrust(ResultsTrustEnum resultsTrust) {
    this.resultsTrust = resultsTrust;
    return this;
  }

   /**
   * Restriction for who is able to report game end and results. Admin is always able to send results as well. Default &#39;none&#39;
   * @return resultsTrust
  **/
  @ApiModelProperty(value = "Restriction for who is able to report game end and results. Admin is always able to send results as well. Default 'none'")
  public ResultsTrustEnum getResultsTrust() {
    return resultsTrust;
  }

  public void setResultsTrust(ResultsTrustEnum resultsTrust) {
    this.resultsTrust = resultsTrust;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreActivitySettings coreActivitySettings = (CoreActivitySettings) o;
    return Objects.equals(this.bootInPlay, coreActivitySettings.bootInPlay) &&
        Objects.equals(this.customLaunchAddressAllowed, coreActivitySettings.customLaunchAddressAllowed) &&
        Objects.equals(this.hostOption, coreActivitySettings.hostOption) &&
        Objects.equals(this.hostStatusControl, coreActivitySettings.hostStatusControl) &&
        Objects.equals(this.joinInPlay, coreActivitySettings.joinInPlay) &&
        Objects.equals(this.leaveInPlay, coreActivitySettings.leaveInPlay) &&
        Objects.equals(this.maxPlayers, coreActivitySettings.maxPlayers) &&
        Objects.equals(this.minPlayers, coreActivitySettings.minPlayers) &&
        Objects.equals(this.resultsTrust, coreActivitySettings.resultsTrust);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootInPlay, customLaunchAddressAllowed, hostOption, hostStatusControl, joinInPlay, leaveInPlay, maxPlayers, minPlayers, resultsTrust);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreActivitySettings {\n");
    
    sb.append("    bootInPlay: ").append(toIndentedString(bootInPlay)).append("\n");
    sb.append("    customLaunchAddressAllowed: ").append(toIndentedString(customLaunchAddressAllowed)).append("\n");
    sb.append("    hostOption: ").append(toIndentedString(hostOption)).append("\n");
    sb.append("    hostStatusControl: ").append(toIndentedString(hostStatusControl)).append("\n");
    sb.append("    joinInPlay: ").append(toIndentedString(joinInPlay)).append("\n");
    sb.append("    leaveInPlay: ").append(toIndentedString(leaveInPlay)).append("\n");
    sb.append("    maxPlayers: ").append(toIndentedString(maxPlayers)).append("\n");
    sb.append("    minPlayers: ").append(toIndentedString(minPlayers)).append("\n");
    sb.append("    resultsTrust: ").append(toIndentedString(resultsTrust)).append("\n");
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

