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

import com.knetikcloud.model.Property;
import com.knetikcloud.model.UserRelationshipReferenceResource;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserResource {
  
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("address2")
  private String address2 = null;
  @SerializedName("avatar_url")
  private String avatarUrl = null;
  @SerializedName("children")
  private List<UserRelationshipReferenceResource> children = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("country_code")
  private String countryCode = null;
  @SerializedName("currency_code")
  private String currencyCode = null;
  @SerializedName("date_of_birth")
  private Long dateOfBirth = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("display_name")
  private String displayName = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("fullname")
  private String fullname = null;
  @SerializedName("gender")
  private String gender = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("language_code")
  private String languageCode = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("last_updated")
  private Long lastUpdated = null;
  @SerializedName("member_since")
  private Long memberSince = null;
  @SerializedName("mobile_number")
  private String mobileNumber = null;
  @SerializedName("parents")
  private List<UserRelationshipReferenceResource> parents = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("postal_code")
  private String postalCode = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("timezone_code")
  private String timezoneCode = null;
  @SerializedName("username")
  private String username = null;

  /**
   * A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this user type, or be an extra not from the template
   **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this user type, or be an extra not from the template")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   * The first line of the user's address (private)
   **/
  @ApiModelProperty(value = "The first line of the user's address (private)")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * The second line of user's address (private)
   **/
  @ApiModelProperty(value = "The second line of user's address (private)")
  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  /**
   * The url of the user's avatar image
   **/
  @ApiModelProperty(value = "The url of the user's avatar image")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * Relationships where this user is the parent. Read-Only, manage through separate endpoints
   **/
  @ApiModelProperty(value = "Relationships where this user is the parent. Read-Only, manage through separate endpoints")
  public List<UserRelationshipReferenceResource> getChildren() {
    return children;
  }
  public void setChildren(List<UserRelationshipReferenceResource> children) {
    this.children = children;
  }

  /**
   * The user's city (private)
   **/
  @ApiModelProperty(value = "The user's city (private)")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The ISO3 code for the country from the user's address (private). Will be filled in based on GeoIP country at registration if not provided.
   **/
  @ApiModelProperty(value = "The ISO3 code for the country from the user's address (private). Will be filled in based on GeoIP country at registration if not provided.")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The code for the user's real money currency (private)
   **/
  @ApiModelProperty(value = "The code for the user's real money currency (private)")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The user's date of birth (private) as a unix timestamp
   **/
  @ApiModelProperty(value = "The user's date of birth (private) as a unix timestamp")
  public Long getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(Long dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * The user's self description (private)
   **/
  @ApiModelProperty(value = "The user's self description (private)")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The chosen display name of the user, defaults to username if not present
   **/
  @ApiModelProperty(value = "The chosen display name of the user, defaults to username if not present")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The user's email address (private). May be required and/or unique depending on system configuration (both on by default). Must match standard email requirements if provided (RFC 2822)
   **/
  @ApiModelProperty(required = true, value = "The user's email address (private). May be required and/or unique depending on system configuration (both on by default). Must match standard email requirements if provided (RFC 2822)")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The user's first name (private)
   **/
  @ApiModelProperty(value = "The user's first name (private)")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The user's full name (private)
   **/
  @ApiModelProperty(value = "The user's full name (private)")
  public String getFullname() {
    return fullname;
  }
  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  /**
   * The user's gender (private)
   **/
  @ApiModelProperty(value = "The user's gender (private)")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * The id of the user
   **/
  @ApiModelProperty(value = "The id of the user")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The ISO3 code for the user's currency (private)
   **/
  @ApiModelProperty(value = "The ISO3 code for the user's currency (private)")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  /**
   * The user's last name (private)
   **/
  @ApiModelProperty(value = "The user's last name (private)")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The date the user's info was last updated as a unix timestamp
   **/
  @ApiModelProperty(value = "The date the user's info was last updated as a unix timestamp")
  public Long getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * The user's date of registration as a unix timestamp
   **/
  @ApiModelProperty(value = "The user's date of registration as a unix timestamp")
  public Long getMemberSince() {
    return memberSince;
  }
  public void setMemberSince(Long memberSince) {
    this.memberSince = memberSince;
  }

  /**
   * The user's mobile phone number (private)
   **/
  @ApiModelProperty(value = "The user's mobile phone number (private)")
  public String getMobileNumber() {
    return mobileNumber;
  }
  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  /**
   * Relationships where this user is the child. Read-Only, manage through separate endpoints
   **/
  @ApiModelProperty(value = "Relationships where this user is the child. Read-Only, manage through separate endpoints")
  public List<UserRelationshipReferenceResource> getParents() {
    return parents;
  }
  public void setParents(List<UserRelationshipReferenceResource> parents) {
    this.parents = parents;
  }

  /**
   * The plain text password for the new user account. Required for registration; ignored on profile update.  Use password specific endpoints for editing
   **/
  @ApiModelProperty(value = "The plain text password for the new user account. Required for registration; ignored on profile update.  Use password specific endpoints for editing")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * The user's postal code (private)
   **/
  @ApiModelProperty(value = "The user's postal code (private)")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * The user's state (private)
   **/
  @ApiModelProperty(value = "The user's state (private)")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Tags on the user. Can only be set by admin. Max length per tag is 64 characters
   **/
  @ApiModelProperty(value = "Tags on the user. Can only be set by admin. Max length per tag is 64 characters")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * A user template this user is validated against (private). May be null and no validation of properties will be done
   **/
  @ApiModelProperty(value = "A user template this user is validated against (private). May be null and no validation of properties will be done")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  /**
   * The code for the user's timezone (private)
   **/
  @ApiModelProperty(value = "The code for the user's timezone (private)")
  public String getTimezoneCode() {
    return timezoneCode;
  }
  public void setTimezoneCode(String timezoneCode) {
    this.timezoneCode = timezoneCode;
  }

  /**
   * The login username for the user (private). May be set to match email if system does not require usernames separately.
   **/
  @ApiModelProperty(required = true, value = "The login username for the user (private). May be set to match email if system does not require usernames separately.")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResource userResource = (UserResource) o;
    return (this.additionalProperties == null ? userResource.additionalProperties == null : this.additionalProperties.equals(userResource.additionalProperties)) &&
        (this.address == null ? userResource.address == null : this.address.equals(userResource.address)) &&
        (this.address2 == null ? userResource.address2 == null : this.address2.equals(userResource.address2)) &&
        (this.avatarUrl == null ? userResource.avatarUrl == null : this.avatarUrl.equals(userResource.avatarUrl)) &&
        (this.children == null ? userResource.children == null : this.children.equals(userResource.children)) &&
        (this.city == null ? userResource.city == null : this.city.equals(userResource.city)) &&
        (this.countryCode == null ? userResource.countryCode == null : this.countryCode.equals(userResource.countryCode)) &&
        (this.currencyCode == null ? userResource.currencyCode == null : this.currencyCode.equals(userResource.currencyCode)) &&
        (this.dateOfBirth == null ? userResource.dateOfBirth == null : this.dateOfBirth.equals(userResource.dateOfBirth)) &&
        (this.description == null ? userResource.description == null : this.description.equals(userResource.description)) &&
        (this.displayName == null ? userResource.displayName == null : this.displayName.equals(userResource.displayName)) &&
        (this.email == null ? userResource.email == null : this.email.equals(userResource.email)) &&
        (this.firstName == null ? userResource.firstName == null : this.firstName.equals(userResource.firstName)) &&
        (this.fullname == null ? userResource.fullname == null : this.fullname.equals(userResource.fullname)) &&
        (this.gender == null ? userResource.gender == null : this.gender.equals(userResource.gender)) &&
        (this.id == null ? userResource.id == null : this.id.equals(userResource.id)) &&
        (this.languageCode == null ? userResource.languageCode == null : this.languageCode.equals(userResource.languageCode)) &&
        (this.lastName == null ? userResource.lastName == null : this.lastName.equals(userResource.lastName)) &&
        (this.lastUpdated == null ? userResource.lastUpdated == null : this.lastUpdated.equals(userResource.lastUpdated)) &&
        (this.memberSince == null ? userResource.memberSince == null : this.memberSince.equals(userResource.memberSince)) &&
        (this.mobileNumber == null ? userResource.mobileNumber == null : this.mobileNumber.equals(userResource.mobileNumber)) &&
        (this.parents == null ? userResource.parents == null : this.parents.equals(userResource.parents)) &&
        (this.password == null ? userResource.password == null : this.password.equals(userResource.password)) &&
        (this.postalCode == null ? userResource.postalCode == null : this.postalCode.equals(userResource.postalCode)) &&
        (this.state == null ? userResource.state == null : this.state.equals(userResource.state)) &&
        (this.tags == null ? userResource.tags == null : this.tags.equals(userResource.tags)) &&
        (this.template == null ? userResource.template == null : this.template.equals(userResource.template)) &&
        (this.timezoneCode == null ? userResource.timezoneCode == null : this.timezoneCode.equals(userResource.timezoneCode)) &&
        (this.username == null ? userResource.username == null : this.username.equals(userResource.username));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.address2 == null ? 0: this.address2.hashCode());
    result = 31 * result + (this.avatarUrl == null ? 0: this.avatarUrl.hashCode());
    result = 31 * result + (this.children == null ? 0: this.children.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.currencyCode == null ? 0: this.currencyCode.hashCode());
    result = 31 * result + (this.dateOfBirth == null ? 0: this.dateOfBirth.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.fullname == null ? 0: this.fullname.hashCode());
    result = 31 * result + (this.gender == null ? 0: this.gender.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.languageCode == null ? 0: this.languageCode.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.lastUpdated == null ? 0: this.lastUpdated.hashCode());
    result = 31 * result + (this.memberSince == null ? 0: this.memberSince.hashCode());
    result = 31 * result + (this.mobileNumber == null ? 0: this.mobileNumber.hashCode());
    result = 31 * result + (this.parents == null ? 0: this.parents.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.postalCode == null ? 0: this.postalCode.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    result = 31 * result + (this.timezoneCode == null ? 0: this.timezoneCode.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResource {\n");
    
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  address2: ").append(address2).append("\n");
    sb.append("  avatarUrl: ").append(avatarUrl).append("\n");
    sb.append("  children: ").append(children).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  dateOfBirth: ").append(dateOfBirth).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  fullname: ").append(fullname).append("\n");
    sb.append("  gender: ").append(gender).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  languageCode: ").append(languageCode).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  lastUpdated: ").append(lastUpdated).append("\n");
    sb.append("  memberSince: ").append(memberSince).append("\n");
    sb.append("  mobileNumber: ").append(mobileNumber).append("\n");
    sb.append("  parents: ").append(parents).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  timezoneCode: ").append(timezoneCode).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}