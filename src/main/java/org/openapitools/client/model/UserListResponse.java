/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.User;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * UserListResponse
 */
@JsonPropertyOrder({
  UserListResponse.JSON_PROPERTY_OBJECT,
  UserListResponse.JSON_PROPERTY_DATA,
  UserListResponse.JSON_PROPERTY_FIRST_ID,
  UserListResponse.JSON_PROPERTY_LAST_ID,
  UserListResponse.JSON_PROPERTY_HAS_MORE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class UserListResponse {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    LIST(String.valueOf("list"));

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OBJECT = "object";
  @javax.annotation.Nonnull
  private ObjectEnum _object;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nonnull
  private List<User> data = new ArrayList<>();

  public static final String JSON_PROPERTY_FIRST_ID = "first_id";
  @javax.annotation.Nonnull
  private String firstId;

  public static final String JSON_PROPERTY_LAST_ID = "last_id";
  @javax.annotation.Nonnull
  private String lastId;

  public static final String JSON_PROPERTY_HAS_MORE = "has_more";
  @javax.annotation.Nonnull
  private Boolean hasMore;

  public UserListResponse() {
  }

  public UserListResponse _object(@javax.annotation.Nonnull ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ObjectEnum getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObject(@javax.annotation.Nonnull ObjectEnum _object) {
    this._object = _object;
  }

  public UserListResponse data(@javax.annotation.Nonnull List<User> data) {
    
    this.data = data;
    return this;
  }

  public UserListResponse addDataItem(User dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<User> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(@javax.annotation.Nonnull List<User> data) {
    this.data = data;
  }

  public UserListResponse firstId(@javax.annotation.Nonnull String firstId) {
    
    this.firstId = firstId;
    return this;
  }

  /**
   * Get firstId
   * @return firstId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIRST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstId() {
    return firstId;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstId(@javax.annotation.Nonnull String firstId) {
    this.firstId = firstId;
  }

  public UserListResponse lastId(@javax.annotation.Nonnull String lastId) {
    
    this.lastId = lastId;
    return this;
  }

  /**
   * Get lastId
   * @return lastId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastId() {
    return lastId;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastId(@javax.annotation.Nonnull String lastId) {
    this.lastId = lastId;
  }

  public UserListResponse hasMore(@javax.annotation.Nonnull Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasMore() {
    return hasMore;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasMore(@javax.annotation.Nonnull Boolean hasMore) {
    this.hasMore = hasMore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserListResponse userListResponse = (UserListResponse) o;
    return Objects.equals(this._object, userListResponse._object) &&
        Objects.equals(this.data, userListResponse.data) &&
        Objects.equals(this.firstId, userListResponse.firstId) &&
        Objects.equals(this.lastId, userListResponse.lastId) &&
        Objects.equals(this.hasMore, userListResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserListResponse {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
    sb.append("    lastId: ").append(toIndentedString(lastId)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `object` to the URL query string
    if (getObject() != null) {
      try {
        joiner.add(String.format("%sobject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getObject()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `data` to the URL query string
    if (getData() != null) {
      for (int i = 0; i < getData().size(); i++) {
        if (getData().get(i) != null) {
          joiner.add(getData().get(i).toUrlQueryString(String.format("%sdata%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `first_id` to the URL query string
    if (getFirstId() != null) {
      try {
        joiner.add(String.format("%sfirst_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `last_id` to the URL query string
    if (getLastId() != null) {
      try {
        joiner.add(String.format("%slast_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `has_more` to the URL query string
    if (getHasMore() != null) {
      try {
        joiner.add(String.format("%shas_more%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasMore()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

