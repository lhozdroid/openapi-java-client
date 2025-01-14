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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * BatchErrorsDataInner
 */
@JsonPropertyOrder({
  BatchErrorsDataInner.JSON_PROPERTY_CODE,
  BatchErrorsDataInner.JSON_PROPERTY_MESSAGE,
  BatchErrorsDataInner.JSON_PROPERTY_PARAM,
  BatchErrorsDataInner.JSON_PROPERTY_LINE
})
@JsonTypeName("Batch_errors_data_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T12:15:51.997600814-05:00[US/Eastern]", comments = "Generator version: 7.10.0")
public class BatchErrorsDataInner {
  public static final String JSON_PROPERTY_CODE = "code";
  @javax.annotation.Nullable
  private String code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable
  private String message;

  public static final String JSON_PROPERTY_PARAM = "param";
  @javax.annotation.Nullable
  private JsonNullable<String> param = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINE = "line";
  @javax.annotation.Nullable
  private JsonNullable<Integer> line = JsonNullable.<Integer>undefined();

  public BatchErrorsDataInner() {
  }

  public BatchErrorsDataInner code(@javax.annotation.Nullable String code) {
    
    this.code = code;
    return this;
  }

  /**
   * An error code identifying the error type.
   * @return code
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(@javax.annotation.Nullable String code) {
    this.code = code;
  }

  public BatchErrorsDataInner message(@javax.annotation.Nullable String message) {
    
    this.message = message;
    return this;
  }

  /**
   * A human-readable message providing more details about the error.
   * @return message
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }

  public BatchErrorsDataInner param(@javax.annotation.Nullable String param) {
    this.param = JsonNullable.<String>of(param);
    
    return this;
  }

  /**
   * The name of the parameter that caused the error, if applicable.
   * @return param
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getParam() {
        return param.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getParam_JsonNullable() {
    return param;
  }
  
  @JsonProperty(JSON_PROPERTY_PARAM)
  public void setParam_JsonNullable(JsonNullable<String> param) {
    this.param = param;
  }

  public void setParam(@javax.annotation.Nullable String param) {
    this.param = JsonNullable.<String>of(param);
  }

  public BatchErrorsDataInner line(@javax.annotation.Nullable Integer line) {
    this.line = JsonNullable.<Integer>of(line);
    
    return this;
  }

  /**
   * The line number of the input file where the error occurred, if applicable.
   * @return line
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getLine() {
        return line.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getLine_JsonNullable() {
    return line;
  }
  
  @JsonProperty(JSON_PROPERTY_LINE)
  public void setLine_JsonNullable(JsonNullable<Integer> line) {
    this.line = line;
  }

  public void setLine(@javax.annotation.Nullable Integer line) {
    this.line = JsonNullable.<Integer>of(line);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchErrorsDataInner batchErrorsDataInner = (BatchErrorsDataInner) o;
    return Objects.equals(this.code, batchErrorsDataInner.code) &&
        Objects.equals(this.message, batchErrorsDataInner.message) &&
        equalsNullable(this.param, batchErrorsDataInner.param) &&
        equalsNullable(this.line, batchErrorsDataInner.line);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, hashCodeNullable(param), hashCodeNullable(line));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchErrorsDataInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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

    // add `code` to the URL query string
    if (getCode() != null) {
      try {
        joiner.add(String.format("%scode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      try {
        joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `param` to the URL query string
    if (getParam() != null) {
      try {
        joiner.add(String.format("%sparam%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParam()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `line` to the URL query string
    if (getLine() != null) {
      try {
        joiner.add(String.format("%sline%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLine()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

