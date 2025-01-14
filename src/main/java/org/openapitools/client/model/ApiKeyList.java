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
import org.openapitools.client.model.AdminApiKey;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ApiKeyList
 */
@JsonPropertyOrder({
  ApiKeyList.JSON_PROPERTY_OBJECT,
  ApiKeyList.JSON_PROPERTY_DATA,
  ApiKeyList.JSON_PROPERTY_HAS_MORE,
  ApiKeyList.JSON_PROPERTY_FIRST_ID,
  ApiKeyList.JSON_PROPERTY_LAST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class ApiKeyList {
  public static final String JSON_PROPERTY_OBJECT = "object";
  @javax.annotation.Nullable
  private String _object;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nullable
  private List<AdminApiKey> data = new ArrayList<>();

  public static final String JSON_PROPERTY_HAS_MORE = "has_more";
  @javax.annotation.Nullable
  private Boolean hasMore;

  public static final String JSON_PROPERTY_FIRST_ID = "first_id";
  @javax.annotation.Nullable
  private String firstId;

  public static final String JSON_PROPERTY_LAST_ID = "last_id";
  @javax.annotation.Nullable
  private String lastId;

  public ApiKeyList() {
  }

  public ApiKeyList _object(@javax.annotation.Nullable String _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(@javax.annotation.Nullable String _object) {
    this._object = _object;
  }

  public ApiKeyList data(@javax.annotation.Nullable List<AdminApiKey> data) {
    
    this.data = data;
    return this;
  }

  public ApiKeyList addDataItem(AdminApiKey dataItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdminApiKey> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(@javax.annotation.Nullable List<AdminApiKey> data) {
    this.data = data;
  }

  public ApiKeyList hasMore(@javax.annotation.Nullable Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasMore() {
    return hasMore;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasMore(@javax.annotation.Nullable Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ApiKeyList firstId(@javax.annotation.Nullable String firstId) {
    
    this.firstId = firstId;
    return this;
  }

  /**
   * Get firstId
   * @return firstId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstId() {
    return firstId;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstId(@javax.annotation.Nullable String firstId) {
    this.firstId = firstId;
  }

  public ApiKeyList lastId(@javax.annotation.Nullable String lastId) {
    
    this.lastId = lastId;
    return this;
  }

  /**
   * Get lastId
   * @return lastId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastId() {
    return lastId;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastId(@javax.annotation.Nullable String lastId) {
    this.lastId = lastId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyList apiKeyList = (ApiKeyList) o;
    return Objects.equals(this._object, apiKeyList._object) &&
        Objects.equals(this.data, apiKeyList.data) &&
        Objects.equals(this.hasMore, apiKeyList.hasMore) &&
        Objects.equals(this.firstId, apiKeyList.firstId) &&
        Objects.equals(this.lastId, apiKeyList.lastId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, hasMore, firstId, lastId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyList {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
    sb.append("    lastId: ").append(toIndentedString(lastId)).append("\n");
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

    // add `has_more` to the URL query string
    if (getHasMore() != null) {
      try {
        joiner.add(String.format("%shas_more%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasMore()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    return joiner.toString();
  }

}

