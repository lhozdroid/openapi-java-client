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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Options for streaming response. Only set this when you set &#x60;stream: true&#x60;. 
 */
@JsonPropertyOrder({
  ChatCompletionStreamOptions.JSON_PROPERTY_INCLUDE_USAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class ChatCompletionStreamOptions {
  public static final String JSON_PROPERTY_INCLUDE_USAGE = "include_usage";
  @javax.annotation.Nullable
  private Boolean includeUsage;

  public ChatCompletionStreamOptions() {
  }

  public ChatCompletionStreamOptions includeUsage(@javax.annotation.Nullable Boolean includeUsage) {
    
    this.includeUsage = includeUsage;
    return this;
  }

  /**
   * If set, an additional chunk will be streamed before the &#x60;data: [DONE]&#x60; message. The &#x60;usage&#x60; field on this chunk shows the token usage statistics for the entire request, and the &#x60;choices&#x60; field will always be an empty array. All other chunks will also include a &#x60;usage&#x60; field, but with a null value. 
   * @return includeUsage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeUsage() {
    return includeUsage;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeUsage(@javax.annotation.Nullable Boolean includeUsage) {
    this.includeUsage = includeUsage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionStreamOptions chatCompletionStreamOptions = (ChatCompletionStreamOptions) o;
    return Objects.equals(this.includeUsage, chatCompletionStreamOptions.includeUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionStreamOptions {\n");
    sb.append("    includeUsage: ").append(toIndentedString(includeUsage)).append("\n");
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

    // add `include_usage` to the URL query string
    if (getIncludeUsage() != null) {
      try {
        joiner.add(String.format("%sinclude_usage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIncludeUsage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

