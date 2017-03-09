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

import io.swagger.client.model.Affiliate;
import io.swagger.client.model.Country;
import io.swagger.client.model.Currency;
import io.swagger.client.model.GroupMember;
import io.swagger.client.model.Language;
import io.swagger.client.model.Property;
import io.swagger.client.model.Role;
import io.swagger.client.model.Timezone;
import io.swagger.client.model.UserRelationship;
import io.swagger.client.model.UserTag;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class User {
  
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("address2")
  private String address2 = null;
  @SerializedName("affiliate")
  private Affiliate affiliate = null;
  @SerializedName("avatar_url")
  private String avatarUrl = null;
  @SerializedName("children")
  private List<UserRelationship> children = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("country")
  private Country country = null;
  @SerializedName("currency")
  private Currency currency = null;
  @SerializedName("date_created")
  private Long dateCreated = null;
  @SerializedName("date_of_birth")
  private Long dateOfBirth = null;
  @SerializedName("date_updated")
  private Long dateUpdated = null;
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
  @SerializedName("groups")
  private List<GroupMember> groups = null;
  @SerializedName("guest")
  private Boolean guest = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("invite_token")
  private String inviteToken = null;
  @SerializedName("lang")
  private Language lang = null;
  @SerializedName("last_activity")
  private Long lastActivity = null;
  @SerializedName("last_login")
  private Long lastLogin = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("lockout_attempts")
  private Integer lockoutAttempts = null;
  @SerializedName("lockout_date")
  private Long lockoutDate = null;
  @SerializedName("mobile_number")
  private String mobileNumber = null;
  @SerializedName("old_id")
  private Integer oldId = null;
  @SerializedName("parents")
  private List<UserRelationship> parents = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("postal_code")
  private String postalCode = null;
  @SerializedName("properties_string")
  private String propertiesString = null;
  @SerializedName("roles")
  private List<Role> roles = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("tag_strings")
  private List<String> tagStrings = null;
  @SerializedName("tags")
  private List<UserTag> tags = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("timezone")
  private Timezone timezone = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("type_hint")
  private String typeHint = null;
  @SerializedName("username")
  private String username = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Affiliate getAffiliate() {
    return affiliate;
  }
  public void setAffiliate(Affiliate affiliate) {
    this.affiliate = affiliate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<UserRelationship> getChildren() {
    return children;
  }
  public void setChildren(List<UserRelationship> children) {
    this.children = children;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(Long dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getDateUpdated() {
    return dateUpdated;
  }
  public void setDateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFullname() {
    return fullname;
  }
  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<GroupMember> getGroups() {
    return groups;
  }
  public void setGroups(List<GroupMember> groups) {
    this.groups = groups;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getGuest() {
    return guest;
  }
  public void setGuest(Boolean guest) {
    this.guest = guest;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getInviteToken() {
    return inviteToken;
  }
  public void setInviteToken(String inviteToken) {
    this.inviteToken = inviteToken;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Language getLang() {
    return lang;
  }
  public void setLang(Language lang) {
    this.lang = lang;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getLastActivity() {
    return lastActivity;
  }
  public void setLastActivity(Long lastActivity) {
    this.lastActivity = lastActivity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getLastLogin() {
    return lastLogin;
  }
  public void setLastLogin(Long lastLogin) {
    this.lastLogin = lastLogin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLockoutAttempts() {
    return lockoutAttempts;
  }
  public void setLockoutAttempts(Integer lockoutAttempts) {
    this.lockoutAttempts = lockoutAttempts;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getLockoutDate() {
    return lockoutDate;
  }
  public void setLockoutDate(Long lockoutDate) {
    this.lockoutDate = lockoutDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMobileNumber() {
    return mobileNumber;
  }
  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOldId() {
    return oldId;
  }
  public void setOldId(Integer oldId) {
    this.oldId = oldId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<UserRelationship> getParents() {
    return parents;
  }
  public void setParents(List<UserRelationship> parents) {
    this.parents = parents;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPropertiesString() {
    return propertiesString;
  }
  public void setPropertiesString(String propertiesString) {
    this.propertiesString = propertiesString;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Role> getRoles() {
    return roles;
  }
  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getTagStrings() {
    return tagStrings;
  }
  public void setTagStrings(List<String> tagStrings) {
    this.tagStrings = tagStrings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<UserTag> getTags() {
    return tags;
  }
  public void setTags(List<UserTag> tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Timezone getTimezone() {
    return timezone;
  }
  public void setTimezone(Timezone timezone) {
    this.timezone = timezone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTypeHint() {
    return typeHint;
  }
  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    User user = (User) o;
    return (this.additionalProperties == null ? user.additionalProperties == null : this.additionalProperties.equals(user.additionalProperties)) &&
        (this.address == null ? user.address == null : this.address.equals(user.address)) &&
        (this.address2 == null ? user.address2 == null : this.address2.equals(user.address2)) &&
        (this.affiliate == null ? user.affiliate == null : this.affiliate.equals(user.affiliate)) &&
        (this.avatarUrl == null ? user.avatarUrl == null : this.avatarUrl.equals(user.avatarUrl)) &&
        (this.children == null ? user.children == null : this.children.equals(user.children)) &&
        (this.city == null ? user.city == null : this.city.equals(user.city)) &&
        (this.country == null ? user.country == null : this.country.equals(user.country)) &&
        (this.currency == null ? user.currency == null : this.currency.equals(user.currency)) &&
        (this.dateCreated == null ? user.dateCreated == null : this.dateCreated.equals(user.dateCreated)) &&
        (this.dateOfBirth == null ? user.dateOfBirth == null : this.dateOfBirth.equals(user.dateOfBirth)) &&
        (this.dateUpdated == null ? user.dateUpdated == null : this.dateUpdated.equals(user.dateUpdated)) &&
        (this.description == null ? user.description == null : this.description.equals(user.description)) &&
        (this.displayName == null ? user.displayName == null : this.displayName.equals(user.displayName)) &&
        (this.email == null ? user.email == null : this.email.equals(user.email)) &&
        (this.firstName == null ? user.firstName == null : this.firstName.equals(user.firstName)) &&
        (this.fullname == null ? user.fullname == null : this.fullname.equals(user.fullname)) &&
        (this.gender == null ? user.gender == null : this.gender.equals(user.gender)) &&
        (this.groups == null ? user.groups == null : this.groups.equals(user.groups)) &&
        (this.guest == null ? user.guest == null : this.guest.equals(user.guest)) &&
        (this.id == null ? user.id == null : this.id.equals(user.id)) &&
        (this.inviteToken == null ? user.inviteToken == null : this.inviteToken.equals(user.inviteToken)) &&
        (this.lang == null ? user.lang == null : this.lang.equals(user.lang)) &&
        (this.lastActivity == null ? user.lastActivity == null : this.lastActivity.equals(user.lastActivity)) &&
        (this.lastLogin == null ? user.lastLogin == null : this.lastLogin.equals(user.lastLogin)) &&
        (this.lastName == null ? user.lastName == null : this.lastName.equals(user.lastName)) &&
        (this.lockoutAttempts == null ? user.lockoutAttempts == null : this.lockoutAttempts.equals(user.lockoutAttempts)) &&
        (this.lockoutDate == null ? user.lockoutDate == null : this.lockoutDate.equals(user.lockoutDate)) &&
        (this.mobileNumber == null ? user.mobileNumber == null : this.mobileNumber.equals(user.mobileNumber)) &&
        (this.oldId == null ? user.oldId == null : this.oldId.equals(user.oldId)) &&
        (this.parents == null ? user.parents == null : this.parents.equals(user.parents)) &&
        (this.password == null ? user.password == null : this.password.equals(user.password)) &&
        (this.postalCode == null ? user.postalCode == null : this.postalCode.equals(user.postalCode)) &&
        (this.propertiesString == null ? user.propertiesString == null : this.propertiesString.equals(user.propertiesString)) &&
        (this.roles == null ? user.roles == null : this.roles.equals(user.roles)) &&
        (this.state == null ? user.state == null : this.state.equals(user.state)) &&
        (this.status == null ? user.status == null : this.status.equals(user.status)) &&
        (this.tagStrings == null ? user.tagStrings == null : this.tagStrings.equals(user.tagStrings)) &&
        (this.tags == null ? user.tags == null : this.tags.equals(user.tags)) &&
        (this.template == null ? user.template == null : this.template.equals(user.template)) &&
        (this.timezone == null ? user.timezone == null : this.timezone.equals(user.timezone)) &&
        (this.token == null ? user.token == null : this.token.equals(user.token)) &&
        (this.typeHint == null ? user.typeHint == null : this.typeHint.equals(user.typeHint)) &&
        (this.username == null ? user.username == null : this.username.equals(user.username));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.additionalProperties == null ? 0: this.additionalProperties.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.address2 == null ? 0: this.address2.hashCode());
    result = 31 * result + (this.affiliate == null ? 0: this.affiliate.hashCode());
    result = 31 * result + (this.avatarUrl == null ? 0: this.avatarUrl.hashCode());
    result = 31 * result + (this.children == null ? 0: this.children.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.dateCreated == null ? 0: this.dateCreated.hashCode());
    result = 31 * result + (this.dateOfBirth == null ? 0: this.dateOfBirth.hashCode());
    result = 31 * result + (this.dateUpdated == null ? 0: this.dateUpdated.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.fullname == null ? 0: this.fullname.hashCode());
    result = 31 * result + (this.gender == null ? 0: this.gender.hashCode());
    result = 31 * result + (this.groups == null ? 0: this.groups.hashCode());
    result = 31 * result + (this.guest == null ? 0: this.guest.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.inviteToken == null ? 0: this.inviteToken.hashCode());
    result = 31 * result + (this.lang == null ? 0: this.lang.hashCode());
    result = 31 * result + (this.lastActivity == null ? 0: this.lastActivity.hashCode());
    result = 31 * result + (this.lastLogin == null ? 0: this.lastLogin.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.lockoutAttempts == null ? 0: this.lockoutAttempts.hashCode());
    result = 31 * result + (this.lockoutDate == null ? 0: this.lockoutDate.hashCode());
    result = 31 * result + (this.mobileNumber == null ? 0: this.mobileNumber.hashCode());
    result = 31 * result + (this.oldId == null ? 0: this.oldId.hashCode());
    result = 31 * result + (this.parents == null ? 0: this.parents.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.postalCode == null ? 0: this.postalCode.hashCode());
    result = 31 * result + (this.propertiesString == null ? 0: this.propertiesString.hashCode());
    result = 31 * result + (this.roles == null ? 0: this.roles.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.tagStrings == null ? 0: this.tagStrings.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    result = 31 * result + (this.timezone == null ? 0: this.timezone.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    result = 31 * result + (this.typeHint == null ? 0: this.typeHint.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  additionalProperties: ").append(additionalProperties).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  address2: ").append(address2).append("\n");
    sb.append("  affiliate: ").append(affiliate).append("\n");
    sb.append("  avatarUrl: ").append(avatarUrl).append("\n");
    sb.append("  children: ").append(children).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  dateCreated: ").append(dateCreated).append("\n");
    sb.append("  dateOfBirth: ").append(dateOfBirth).append("\n");
    sb.append("  dateUpdated: ").append(dateUpdated).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  fullname: ").append(fullname).append("\n");
    sb.append("  gender: ").append(gender).append("\n");
    sb.append("  groups: ").append(groups).append("\n");
    sb.append("  guest: ").append(guest).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  inviteToken: ").append(inviteToken).append("\n");
    sb.append("  lang: ").append(lang).append("\n");
    sb.append("  lastActivity: ").append(lastActivity).append("\n");
    sb.append("  lastLogin: ").append(lastLogin).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  lockoutAttempts: ").append(lockoutAttempts).append("\n");
    sb.append("  lockoutDate: ").append(lockoutDate).append("\n");
    sb.append("  mobileNumber: ").append(mobileNumber).append("\n");
    sb.append("  oldId: ").append(oldId).append("\n");
    sb.append("  parents: ").append(parents).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  propertiesString: ").append(propertiesString).append("\n");
    sb.append("  roles: ").append(roles).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  tagStrings: ").append(tagStrings).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  timezone: ").append(timezone).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  typeHint: ").append(typeHint).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}